package com.github.jakobeha.intellijsmplcoccinelle.c.psi

import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.tree.IElementType

/** Base type for all SmPL elements */
interface SmPLCCompositeElement: NavigatablePsiElement {
    val tokenType: IElementType
}