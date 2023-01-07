package com.github.jakobeha.intellijsmplcoccinelle.psi

import com.github.jakobeha.intellijsmplcoccinelle.injection.SmPLCodeLang
import com.intellij.psi.PsiLanguageInjectionHost

interface SmPLCodeBody: PsiLanguageInjectionHost, SmPLCompositeElement {
    val codeLang: SmPLCodeLang
        get() = when (this) {
        is SmPLTransformationBody -> SmPLCodeLang.Transformation
        is SmPLScriptBody -> when {
            ocamlBlock != null -> SmPLCodeLang.Ocaml
            pythonBlock != null -> SmPLCodeLang.Python
            else -> error("Unexpected: SmPLScriptBody has no acceptable children")
        }
        else -> error("Unexpected: SmPLCodeInjection is neither SmPLTransformationBody nor SmPLScriptBody")
    }
}