package com.github.jakobeha.intellijsmplcoccinelle.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import java.util.stream.Collectors
import java.util.stream.Stream
import com.github.jakobeha.intellijsmplcoccinelle.SmPL
import com.github.jakobeha.intellijsmplcoccinelle.parsing.SmPLLexer
import com.github.jakobeha.intellijsmplcoccinelle.parsing.SmPLParser

class SmPLSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return ANTLRLexerAdaptor(SmPL, SmPLLexer(null))
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        val key: TextAttributesKey
        key = if (KEYWORDS.contains(tokenType)) {
            SMPL_KEYWORD
        } else if (SmPLTokenType.getTokenElementType(SmPLLexer.STRING_LITERAL).equals(tokenType)) {
            SMPL_STRING
        } else if (SmPLTokenType.getTokenElementType(SmPLLexer.COMMENT).equals(tokenType)) {
            SMPL_COMMENT
        } else if (SmPLTokenType.getTokenElementType(SmPLLexer.LINE_COMMENT).equals(tokenType)) {
            SMPL_COMMENT
        } else if (SmPLTokenType.getTokenElementType(SmPLLexer.INTEGER).equals(tokenType)) {
            SMPL_INTEGER
        } else {
            return arrayOfNulls(0)
        }
        return arrayOf(key)
    }

    object Factory : SyntaxHighlighterFactory() {
        override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter =
            SmPLSyntaxHighlighter()
    }

    companion object {
        private val KEYWORDS = Stream.of<Any>(
            SmPLLexer.ABSTRACT, SmPLLexer.ACTION, SmPLLexer.ACTIONS, SmPLLexer.APPLY, SmPLLexer.BOOL, SmPLLexer.BIT, SmPLLexer.CONST,
            SmPLLexer.CONTROL, SmPLLexer.DEFAULT, SmPLLexer.ELSE, SmPLLexer.ENTRIES, SmPLLexer.ENUM, SmPLLexer.ERROR, SmPLLexer.EXIT,
            SmPLLexer.EXTERN, SmPLLexer.FALSE, SmPLLexer.HEADER, SmPLLexer.HEADER_UNION, SmPLLexer.IF, SmPLLexer.IN, SmPLLexer.INOUT,
            SmPLLexer.INT, SmPLLexer.KEY, SmPLLexer.MATCH_KIND, SmPLLexer.TYPE, SmPLLexer.OUT, SmPLLexer.PARSER, SmPLLexer.PACKAGE,
            SmPLLexer.RETURN, SmPLLexer.SELECT, SmPLLexer.SWITCH, SmPLLexer.TABLE, SmPLLexer.THIS, SmPLLexer.TUPLE, SmPLLexer.TYPEDEF,
            SmPLLexer.VARBIT, SmPLLexer.VALUESET, SmPLLexer.VOID
        ).map<Any>(SmPLTokenType::getTokenElementType).collect(Collectors.toList<Any>())
        val SMPL_PRE_PROCESS = TextAttributesKey.createTextAttributesKey(
            "SMPL.PRE_PROCESS",
            DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL
        )
        val SMPL_KEYWORD = TextAttributesKey.createTextAttributesKey(
            "SMPL.KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val SMPL_STRING = TextAttributesKey.createTextAttributesKey(
            "SMPL.STRING",
            DefaultLanguageHighlighterColors.STRING
        )
        val SMPL_INTEGER = TextAttributesKey.createTextAttributesKey(
            "SMPL.INTEGER",
            DefaultLanguageHighlighterColors.NUMBER
        )
        val SMPL_ANNOTATION = TextAttributesKey.createTextAttributesKey(
            "SMPL.ANNOTATION",
            DefaultLanguageHighlighterColors.LABEL
        )
        val SMPL_TYPE = TextAttributesKey.createTextAttributesKey(
            "SMPL.TYPE",
            DefaultLanguageHighlighterColors.CLASS_NAME
        )
        val SMPL_COMMENT = TextAttributesKey.createTextAttributesKey(
            "SMPL.COMMENT",
            DefaultLanguageHighlighterColors.BLOCK_COMMENT
        )
        val SMPL_MATCH_KIND = TextAttributesKey.createTextAttributesKey(
            "SMPL.MATCH_KIND",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val SMPL_UNKNOWN_TOKEN = TextAttributesKey.createTextAttributesKey(
            "SMPL.SMPL_UNKNOWN_TOKEN",
            DefaultLanguageHighlighterColors.BLOCK_COMMENT
        )
    }
}