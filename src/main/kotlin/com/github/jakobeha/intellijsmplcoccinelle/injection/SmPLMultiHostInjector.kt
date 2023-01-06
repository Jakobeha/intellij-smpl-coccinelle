package com.github.jakobeha.intellijsmplcoccinelle.injection

import com.intellij.lang.Language
import com.intellij.lang.html.HTMLLanguage
import com.intellij.lang.injection.MultiHostInjector
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.openapi.util.Pair
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.util.SmartList
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTokenType


class DartMultiHostInjector : MultiHostInjector {
    override fun elementsToInjectIn(): List<Class<out PsiElement>?> = listOf(
        SmPLLineAddedExpression::class.java,
        SmPLLineDeletedExpression::class.java,
        SmPLLineChangedExpression::class.java,
    )

    override fun getLanguagesToInject(registrar: MultiHostRegistrar, element: PsiElement) {
        if (element is DartStringLiteralExpression) {
            if (isRegExp(element as DartStringLiteralExpression)) {
                injectRegExp(registrar, element as DartStringLiteralExpression)
            } else {
                injectHtmlIfNeeded(registrar, element as DartStringLiteralExpression)
            }
        }
    }

    private class HtmlPlaceInfo internal constructor(val range: TextRange, val suffix: String?)
    companion object {
        // Trailing space is intentional, it helps to avoid errors like "XML attribute Dart_string_template_placeholderhref is not allowed here"
        // in strings like "<a ${label}href=''></a>". As for the leading space, we decided not to add it as we'd more likely get
        // a string like "<${label}>...</${label}>" than "<a foo${label}>...</a>", and we'd like it to be parsed as HTML.
        const val STRING_TEMPLATE_PLACEHOLDER = "Dart_string_template_placeholder "
        private val JS_REGEXP_LANG = Language.findLanguageByID("JSRegexp")
        private fun isRegExp(element: DartStringLiteralExpression): Boolean {
            // new RegExp(r'\d+'); RegExp(r'\d+')
            val parent1: PsiElement = element.getParent()
            val parentParent2 =
                if (parent1 is DartArgumentList && parent1.firstChild === element) parent1.parent else null
            val parent3 = if (parentParent2 is DartArguments) parentParent2!!.parent else null
            if (parent3 is DartNewExpression) {
                val type: DartType = (parent3 as DartNewExpression?).getType()
                return type != null && "RegExp" == type.getText()
            }
            if (parent3 is DartCallExpression) {
                val expression: DartExpression = (parent3 as DartCallExpression?).getExpression()
                return expression != null && "RegExp" == expression.getText()
            }
            return false
        }

        private fun injectRegExp(registrar: MultiHostRegistrar, element: DartStringLiteralExpression) {
            if (JS_REGEXP_LANG == null) return  // JavaScript plugin not available
            val child: PsiElement = element.getFirstChild()
            val elementType = child.node.elementType
            if (elementType !== DartTokenTypes.RAW_SINGLE_QUOTED_STRING || child.nextSibling != null) {
                return  // inject in raw single line strings only
            }
            val textAndRange: Pair<String, TextRange> = DartPsiImplUtil.getUnquotedDartStringAndItsRange(child.text)
            if (textAndRange.first.isEmpty()) {
                return
            }
            registrar.startInjecting(JS_REGEXP_LANG)
            registrar.addPlace(null, null, element, textAndRange.second)
            registrar.doneInjecting()
        }

        private fun injectHtmlIfNeeded(registrar: MultiHostRegistrar, element: DartStringLiteralExpression) {
            val infos: MutableList<HtmlPlaceInfo> = SmartList()
            val textBuf = StringBuilder()
            var child: PsiElement? = element.getFirstChild()
            while (child != null) {
                val type = child.node.elementType
                if (type === DartTokenTypes.REGULAR_STRING_PART) {
                    textBuf.append(child.text)
                    var suffix: String? = null
                    val nextSibling = child.nextSibling
                    if (nextSibling != null && nextSibling.node.elementType !== DartTokenTypes.CLOSING_QUOTE) {
                        suffix = STRING_TEMPLATE_PLACEHOLDER // string template like $foo or ${foo}
                        textBuf.append(suffix)
                    }
                    infos.add(HtmlPlaceInfo(TextRange.from(child.startOffsetInParent, child.textLength), suffix))
                } else if (type === DartTokenTypes.RAW_SINGLE_QUOTED_STRING || type === DartTokenTypes.RAW_TRIPLE_QUOTED_STRING) {
                    val stringAndRange: Pair<String, TextRange> =
                        DartPsiImplUtil.getUnquotedDartStringAndItsRange(child.text)
                    val string = stringAndRange.first
                    val stringRange = stringAndRange.second
                    infos.add(HtmlPlaceInfo(stringRange.shiftRight(child.startOffsetInParent), null))
                    textBuf.append(string)
                }
                child = child.nextSibling
            }
            if (textBuf.length > 0 && looksLikeHtml(textBuf.toString())) {
                registrar.startInjecting(HTMLLanguage.INSTANCE)
                for (info in infos) {
                    registrar.addPlace(null, info.suffix, element, info.range)
                }
                registrar.doneInjecting()
            }
        }

        private fun looksLikeHtml(text: String): Boolean {
            // similar to com.intellij.lang.javascript.JSInjectionController.willInjectHtml(), but strings like 'List<int>', '<foo> and <bar>' are not treated as HTML
            // also, unlike JavaScript, HTML is injected in Dart only if '<' is the first non-space symbol in string
            if (!text.trim { it <= ' ' }.startsWith("<")) return false
            val tagStart = text.indexOf('<')
            val length = text.length
            val hasTag = tagStart >= 0 &&
                    (tagStart < length - 1 && Character.isLetter(text[tagStart + 1]) || tagStart < length - 2 && text[tagStart + 1] == '/' && Character.isLetter(
                        text[tagStart + 2]
                    ) || tagStart < length - 3 && text[tagStart + 1] == '!' && text[tagStart + 2] == '-' && text[tagStart + 3] == '-' // <!-- comment
                            ) && text.indexOf('>', tagStart) > 0
            if (hasTag) {
                // now filter out cases like '<foo> and <bar>' or 'Map<int, int>'
                if (Character.isLetter(text[tagStart + 1]) && !text.contains("/>") && !text.contains("</")) {
                    return false
                }
            }
            return hasTag
        }
    }
}
