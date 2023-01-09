package com.github.jakobeha.intellijsmplcoccinelle.c.psi

import com.github.jakobeha.intellijsmplcoccinelle.c.SmPLC
import com.intellij.psi.tree.IElementType


class SmPLCElementType(debugName: String): IElementType(debugName, SmPLC) {
    override fun toString(): String = "SmPLCElementType.${super.toString()}"
}
