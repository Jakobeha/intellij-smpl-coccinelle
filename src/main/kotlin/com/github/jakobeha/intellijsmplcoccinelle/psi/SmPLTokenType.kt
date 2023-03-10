package com.github.jakobeha.intellijsmplcoccinelle.psi

import com.github.jakobeha.intellijsmplcoccinelle.SmPL
import com.intellij.psi.tree.IElementType


class SmPLTokenType(debugName: String): IElementType(debugName, SmPL) {
    override fun toString(): String = "SmPLTokenType.${super.toString()}"
}
