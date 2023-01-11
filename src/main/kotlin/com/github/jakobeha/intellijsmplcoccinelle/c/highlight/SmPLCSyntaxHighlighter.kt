package com.github.jakobeha.intellijsmplcoccinelle.c.highlight

import com.github.jakobeha.intellijsmplcoccinelle.parsing.SmPLLexer
import com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.tree.IElementType
import java.util.*

class SmPLCSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = SmPLLexer()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> = pack(keys[tokenType], arrayOf())

    @Suppress("MemberVisibilityCanBePrivate")
    companion object {
        val INCLUDE_HEADER = TextAttributesKey.createTextAttributesKey("SMPLC_INCLUDE_HEADER", DefaultLanguageHighlighterColors.METADATA)
        val RESERVED_OP = TextAttributesKey.createTextAttributesKey("SMPLC_RESERVED_OP", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val DOT = TextAttributesKey.createTextAttributesKey("SMPLC_DOT", DefaultLanguageHighlighterColors.DOT)
        val COMMA = TextAttributesKey.createTextAttributesKey("SMPLC_COMMA", DefaultLanguageHighlighterColors.COMMA)
        val SEMICOLON = TextAttributesKey.createTextAttributesKey("SMPLC_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        val BRACKETS = TextAttributesKey.createTextAttributesKey("SMPLC_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
        val PARENTHESES = TextAttributesKey.createTextAttributesKey("SMPLC_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACES = TextAttributesKey.createTextAttributesKey("SMPLC_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val LINE_COMMENT = TextAttributesKey.createTextAttributesKey("SMPLC_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("SMPLC_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        val DOC_COMMENT = TextAttributesKey.createTextAttributesKey("SMPLC_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
        val WORD = TextAttributesKey.createTextAttributesKey("SMPLC_WORD", DefaultLanguageHighlighterColors.IDENTIFIER)
        val INTEGER = TextAttributesKey.createTextAttributesKey("SMPLC_INTEGER", DefaultLanguageHighlighterColors.NUMBER)
        val STRING = TextAttributesKey.createTextAttributesKey("SMPLC_STRING", DefaultLanguageHighlighterColors.STRING)
        // val ESCAPE = TextAttributesKey.createTextAttributesKey("SMPLC_ESCAPE", DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE)
        private val keys: MutableMap<IElementType, TextAttributesKey> = HashMap(0)

        /**
         * Helper to point multiple token types to a single color.
         */
        private fun keysPutEach(value: TextAttributesKey, vararg tokenTypes: IElementType) {
            for (tokenType in tokenTypes) {
                assert(!keys.containsKey(tokenType)) { "Token type $tokenType already has a color assigned" }
                keys[tokenType] = value
            }
        }

        init {
            keysPutEach(
                INCLUDE_HEADER,
                SmPLCTypes.HASH_INCLUDE
            )

            keysPutEach(
                RESERVED_OP,
                SmPLCTypes.EQ,
                SmPLCTypes.NE,
                SmPLCTypes.AND,
                SmPLCTypes.OR,
                SmPLCTypes.DOUBLE_AND,
                SmPLCTypes.DOUBLE_OR,
                SmPLCTypes.NOT,
                SmPLCTypes.COLON,
                SmPLCTypes.PLUS,
                SmPLCTypes.MINUS,
                SmPLCTypes.TIMES,
                SmPLCTypes.DIVIDE,
                SmPLCTypes.MOD,
                SmPLCTypes.LT,
                SmPLCTypes.LE,
                SmPLCTypes.GT,
                SmPLCTypes.GE,
                SmPLCTypes.LSHIFT,
                SmPLCTypes.RSHIFT,
                SmPLCTypes.XOR,
                SmPLCTypes.PLUS_EQUALS,
                SmPLCTypes.MINUS_EQUALS,
                SmPLCTypes.TIMES_EQUALS,
                SmPLCTypes.DIVIDE_EQUALS,
                SmPLCTypes.MOD_EQUALS,
                SmPLCTypes.LSHIFT_EQUALS,
                SmPLCTypes.RSHIFT_EQUALS,
                SmPLCTypes.XOR_EQUALS,
                SmPLCTypes.AND_EQUALS,
                SmPLCTypes.OR_EQUALS,
                SmPLCTypes.BACK_OR,
                SmPLCTypes.BACK_AND,
            )

            keysPutEach(DOT, SmPLCTypes.DOT)
            keysPutEach(COMMA, SmPLCTypes.COMMA)
            keysPutEach(SEMICOLON, SmPLCTypes.SEMICOLON)
            keysPutEach(PARENTHESES, SmPLCTypes.LPAREN, SmPLCTypes.RPAREN, SmPLCTypes.BACK_LPAREN, SmPLCTypes.BACK_RPAREN)
            keysPutEach(BRACKETS, SmPLCTypes.LBRACK, SmPLCTypes.RBRACK)
            keysPutEach(BRACES, SmPLCTypes.LBRACE, SmPLCTypes.RBRACE)
            keysPutEach(LINE_COMMENT, SmPLCTypes.LINE_COMMENT)
            keysPutEach(BLOCK_COMMENT, SmPLCTypes.BLOCK_COMMENT)
            keysPutEach(DOC_COMMENT, SmPLCTypes.DOC_COMMENT)
            keysPutEach(INTEGER, SmPLCTypes.INTEGER)
            keysPutEach(WORD, SmPLCTypes.WORD)
            keysPutEach(STRING, SmPLCTypes.STRING)
            // keysPutEach(ESCAPE, SmPLCTypes.ESCAPE)
        }

        // val ATTRIBUTE_KEYS: Array<TextAttributesKey> = keys.values.toTypedArray()
    }

    class Factory: SyntaxHighlighterFactory() {
        override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter =
            SmPLCSyntaxHighlighter()
    }
}