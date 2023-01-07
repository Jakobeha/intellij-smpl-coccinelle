package com.github.jakobeha.intellijsmplcoccinelle.psi.impl

import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLCodeBody
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.ElementManipulators
import com.intellij.psi.LiteralTextEscaper
import com.intellij.psi.PsiLanguageInjectionHost

open class SmPLCodeBodyBase(node: ASTNode): SmPLCompositeElementImpl(node), SmPLCodeBody {
    override fun isValidHost(): Boolean = true

    override fun updateText(text: String): PsiLanguageInjectionHost =
        ElementManipulators.handleContentChange(this, text)

    override fun createLiteralTextEscaper(): LiteralTextEscaper<out PsiLanguageInjectionHost> =
        RawLiteralTextEscaper(this)

    /** Doesn't actually escape any text */
    private class RawLiteralTextEscaper(element: SmPLCodeBody): LiteralTextEscaper<SmPLCodeBody>(element) {
        override fun decode(rangeInsideHost: TextRange, outChars: StringBuilder): Boolean {
            outChars.append(rangeInsideHost.substring(myHost.text))
            return true
        }

        override fun getOffsetInHost(offsetInDecoded: Int, rangeInsideHost: TextRange): Int =
            rangeInsideHost.startOffset + offsetInDecoded

        override fun isOneLine(): Boolean = false
    }
}