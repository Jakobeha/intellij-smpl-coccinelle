package com.github.jakobeha.intellijsmplcoccinelle.injection

import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes
import com.intellij.psi.tree.IElementType

enum class SmPLCodeLang {
    Transformation,
    Ocaml,
    Python;

    val elementType: IElementType
        get() = when (this) {
            Transformation -> SmPLTypes.TRANSFORMATION_BLOCK
            Ocaml -> SmPLTypes.OCAML_BLOCK
            Python -> SmPLTypes.PYTHON_BLOCK
        }
}