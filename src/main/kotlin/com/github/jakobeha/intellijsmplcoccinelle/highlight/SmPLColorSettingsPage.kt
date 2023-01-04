package com.github.jakobeha.intellijsmplcoccinelle.highlight

import com.google.common.io.Resources
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import java.io.IOException
import javax.swing.Icon
import com.github.jakobeha.intellijsmplcoccinelle.SmPLIcons


class SmPLColorSettingsPage : ColorSettingsPage {
    override fun getIcon(): Icon? = SmPLIcons.MAIN

    override fun getHighlighter(): SyntaxHighlighter = SmPLSyntaxHighlighter()

    @Suppress("UnstableApiUsage")
    override fun getDemoText(): String {
        val url = javaClass.getResource("/demo/demo.cocci")
        return try {
            Resources.toString(url!!, Charsets.UTF_8)
        } catch (e: IOException) {
            "Error loading demo file (io exception)"
        } catch (e: NullPointerException) {
            "Error loading demo file (url fetch)"
        }
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    @Suppress("DialogTitleCapitalization")
    override fun getDisplayName(): String = "SmPL (coccinelle) Language"

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Keywords", SmPLSyntaxHighlighter.SMPL_KEYWORD),
            AttributesDescriptor("String", SmPLSyntaxHighlighter.SMPL_STRING),
            AttributesDescriptor("Match kind", SmPLSyntaxHighlighter.SMPL_MATCH_KIND),
            AttributesDescriptor("Value", SmPLSyntaxHighlighter.SMPL_INTEGER),
            AttributesDescriptor("Type", SmPLSyntaxHighlighter.SMPL_TYPE),
            AttributesDescriptor("Annotation", SmPLSyntaxHighlighter.SMPL_ANNOTATION),
            AttributesDescriptor("Preprocessor", SmPLSyntaxHighlighter.SMPL_PRE_PROCESS),
            AttributesDescriptor("Comment", SmPLSyntaxHighlighter.SMPL_COMMENT),
            AttributesDescriptor("Unknown token", SmPLSyntaxHighlighter.SMPL_UNKNOWN_TOKEN)
        )
    }
}