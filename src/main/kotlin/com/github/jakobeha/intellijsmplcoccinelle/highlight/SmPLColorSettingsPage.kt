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
            AttributesDescriptor("Metadata (tints everything but code blocks)", SmPLSyntaxHighlighter.METADATA),
            AttributesDescriptor("'#include' and 'using'", SmPLSyntaxHighlighter.INCLUDE_HEADER),
            AttributesDescriptor("'virtual' in header", SmPLSyntaxHighlighter.VIRTUAL_HEADER),
            AttributesDescriptor("Metavariables Block Fence (@ and @@)", SmPLSyntaxHighlighter.METAVARS_AT),
            @Suppress("DialogTitleCapitalization")
            // AttributesDescriptor("Metavariables Block Head Keyword (script, initialize, finalize)", SmPLSyntaxHighlighter.METAVARS_HEAD_KEYWORD),
            AttributesDescriptor("Metadeclaration Head Keyword (fresh identifier, ...)", SmPLSyntaxHighlighter.METADECL_HEAD_KEYWORD),
            AttributesDescriptor("Metavariables Keyword (depends on, ...)", SmPLSyntaxHighlighter.METADECL_BODY_KEYWORD),
            @Suppress("DialogTitleCapitalization")
            AttributesDescriptor("Special Identifier (e.g. 'virtual')", SmPLSyntaxHighlighter.SPECIAL_IDENT),
            AttributesDescriptor("Script language (python, ocaml)", SmPLSyntaxHighlighter.SCRIPT_LANG),
            AttributesDescriptor("Operator (=, :)", SmPLSyntaxHighlighter.RESERVED_OP),
            AttributesDescriptor("Dot (.)", SmPLSyntaxHighlighter.DOT),
            AttributesDescriptor("Comma (,)", SmPLSyntaxHighlighter.COMMA),
            AttributesDescriptor("Semicolon (;)", SmPLSyntaxHighlighter.SEMICOLON),
            AttributesDescriptor("Brackets ('[' and ']')", SmPLSyntaxHighlighter.BRACKETS),
            AttributesDescriptor("Parenthesis ('(' and ')')", SmPLSyntaxHighlighter.PARENTHESES),
            AttributesDescriptor("Braces ('{' and '}')", SmPLSyntaxHighlighter.BRACES),
            AttributesDescriptor("Line comment (//...)", SmPLSyntaxHighlighter.LINE_COMMENT),
            AttributesDescriptor("Block comment (/* ... */)", SmPLSyntaxHighlighter.BLOCK_COMMENT),
            AttributesDescriptor("Doc comment (///..., /** ... */)", SmPLSyntaxHighlighter.DOC_COMMENT),
            AttributesDescriptor("Integer", SmPLSyntaxHighlighter.INTEGER),
            AttributesDescriptor("Identifier", SmPLSyntaxHighlighter.WORD),
            AttributesDescriptor("String", SmPLSyntaxHighlighter.STRING),
            AttributesDescriptor("Syspath (<...> in #include <...>)", SmPLSyntaxHighlighter.SYSPATH),
            // AttributesDescriptor("Escape or Splice Token", SmPLSyntaxHighlighter.ESCAPE)
        )

        init {
            assert(DESCRIPTORS.size == SmPLSyntaxHighlighter.ATTRIBUTE_KEYS.size)
        }
    }
}