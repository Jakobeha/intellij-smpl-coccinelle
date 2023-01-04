package com.github.jakobeha.intellijsmplcoccinelle

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


/**
 * SmPL Language type
 */
object SmPLFileType : LanguageFileType(SmPL) {
    override fun getName(): String = "SmPL (coccinelle) Code"
    override fun getDescription(): String = "\"Semantic Patch\" (refactor specification)"
    override fun getDefaultExtension(): String = "cocci"
    override fun getIcon(): Icon = SmPLIcons.FILE
}
