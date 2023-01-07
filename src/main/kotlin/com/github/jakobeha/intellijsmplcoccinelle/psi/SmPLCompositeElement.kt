package com.github.jakobeha.intellijsmplcoccinelle.psi

import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.tree.IElementType

/** Base type for all SmPL elements */
interface SmPLCompositeElement: NavigatablePsiElement {
    val tokenType: IElementType
}