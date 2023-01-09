package com.github.jakobeha.intellijsmplcoccinelle.injection

import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLCodeBody
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLScriptBody
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTransformationBody
import com.intellij.lang.Language
import com.intellij.lang.injection.MultiHostInjector
import com.intellij.lang.injection.MultiHostRegistrar
import com.intellij.openapi.project.PossiblyDumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement


class SmPLMultiHostInjector : MultiHostInjector, PossiblyDumbAware {
    // TODO: make into a setting
    //   SmPL should be dumb-aware by default because the majority of the file's code is injected, and a besides the
    //   transformation code (which could be lexed within the host lexer) a large portion is injected Python and OCaml.
    //   But users may still want to disable especially if there this injection has large overhead
    override fun isDumbAware(): Boolean = true

    @Suppress("UNCHECKED_CAST")
    override fun elementsToInjectIn(): List<Class<out SmPLCodeBody>> = listOf(
        SmPLTransformationBody::class.java as Class<out SmPLCodeBody>,
        SmPLScriptBody::class.java as Class<out SmPLCodeBody>,
    )

    override fun getLanguagesToInject(registrar: MultiHostRegistrar, element: PsiElement) {
        if (element is SmPLCodeBody) {
            inject(registrar, element, element.codeLang)
        }
    }

    private val SMPL_C_LANG = Language.findLanguageByID("SmPL C")
    private val OCAML_LANG = Language.findLanguageByID("OCaml")
    private val PYTHON_LANG = Language.findLanguageByID("Python")

    private val SmPLCodeLang.language: Language?
        get() = when (this) {
            SmPLCodeLang.Transformation -> SMPL_C_LANG
            SmPLCodeLang.Ocaml -> OCAML_LANG
            SmPLCodeLang.Python -> PYTHON_LANG
        }

    private fun inject(registrar: MultiHostRegistrar, element: SmPLCodeBody, codeLang: SmPLCodeLang) {
        val language = codeLang.language ?: return
        registrar.startInjecting(language)
        registrar.addPlace(null, null, element, TextRange(0, element.textLength))
        registrar.doneInjecting()
    }
}
