package com.github.jakobeha.intellijsmplcoccinelle.c

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


/**
 * SmPL Language type
 */
object SmPLCDummyFileType : LanguageFileType(SmPLC) {
    override fun getName(): String = "C (SmPL) Dummy"
    override fun getDescription(): String = "For test cases, C code interspersed with SmPL (coccinelle) splices"
    override fun getDefaultExtension(): String = "coccic"
    override fun getIcon(): Icon? = null
}
