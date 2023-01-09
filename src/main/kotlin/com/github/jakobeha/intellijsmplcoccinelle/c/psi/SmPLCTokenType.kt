package com.github.jakobeha.intellijsmplcoccinelle.c.psi

import com.github.jakobeha.intellijsmplcoccinelle.c.SmPLC
import com.intellij.psi.tree.IElementType


class SmPLCTokenType(debugName: String): IElementType(debugName, SmPLC) {
    override fun toString(): String = "SmPLCTokenType.${super.toString()}"
}
