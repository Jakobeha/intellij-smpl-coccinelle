package com.github.jakobeha.intellijsmplcoccinelle.psi.impl

import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLCompositeElement
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType

open class SmPLCompositeElementImpl(node: ASTNode): ASTWrapperPsiElement(node), SmPLCompositeElement {
    override val tokenType: IElementType
        get() = node.elementType

    override fun toString(): String = tokenType.toString()

}