package com.github.jakobeha.intellijsmplcoccinelle.psi

import com.github.jakobeha.intellijsmplcoccinelle.SmPL
import com.intellij.psi.tree.IElementType


class SmPLElementType(debugName: String): IElementType(debugName, SmPL) {
    override fun toString(): String = "SmPLElementType.${super.toString()}"
}
