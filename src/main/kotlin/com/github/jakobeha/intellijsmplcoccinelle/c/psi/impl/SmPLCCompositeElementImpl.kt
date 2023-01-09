package com.github.jakobeha.intellijsmplcoccinelle.c.psi.impl

import com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCCompositeElement
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType

open class SmPLCCompositeElementImpl(node: ASTNode): ASTWrapperPsiElement(node), SmPLCCompositeElement {
    override val tokenType: IElementType
        get() = node.elementType

    override fun toString(): String = tokenType.toString()

}