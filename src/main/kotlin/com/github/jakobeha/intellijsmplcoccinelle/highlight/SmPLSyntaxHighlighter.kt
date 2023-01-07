package com.github.jakobeha.intellijsmplcoccinelle.highlight

import com.github.jakobeha.intellijsmplcoccinelle.parsing.SmPLLexer
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import java.util.*

class SmPLSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = SmPLLexer()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        pack(keys[tokenType], arrayOf())

    @Suppress("MemberVisibilityCanBePrivate")
    companion object {
        val INCLUDE_HEADER = TextAttributesKey.createTextAttributesKey("SMPL_INCLUDE_HEADER", DefaultLanguageHighlighterColors.METADATA)
        val VIRTUAL_HEADER = TextAttributesKey.createTextAttributesKey("SMPL_VIRTUAL_HEADER", DefaultLanguageHighlighterColors.METADATA)
        val METAVARS_AT = TextAttributesKey.createTextAttributesKey("SMPL_AT", DefaultLanguageHighlighterColors.LABEL)
        val METAVARS_HEAD_KEYWORD = TextAttributesKey.createTextAttributesKey("SMPL_METAVARS_HEAD_KEYWORD", DefaultLanguageHighlighterColors.LABEL)
        val METADECL_HEAD_KEYWORD = TextAttributesKey.createTextAttributesKey("SMPL_METADECL_HEAD_KEYWORD", DefaultLanguageHighlighterColors.INSTANCE_FIELD)
        val METADECL_BODY_KEYWORD = TextAttributesKey.createTextAttributesKey("SMPL_METADECL_BODY_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        // val DISABLE_SPECIAL_IDENT = TextAttributesKey.createTextAttributesKey("SMPL_DISABLE_SPECIAL_IDENT", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)
        val SCRIPT_LANG = TextAttributesKey.createTextAttributesKey("SMPL_SCRIPT_LANG", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)
        val RESERVED_OP = TextAttributesKey.createTextAttributesKey("SMPL_RESERVED_OP", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)
        val DOT = TextAttributesKey.createTextAttributesKey("SMPL_DOT", DefaultLanguageHighlighterColors.DOT)
        val COMMA = TextAttributesKey.createTextAttributesKey("SMPL_COMMA", DefaultLanguageHighlighterColors.COMMA)
        val SEMICOLON = TextAttributesKey.createTextAttributesKey("SMPL_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        val BRACKETS = TextAttributesKey.createTextAttributesKey("SMPL_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
        val PARENTHESES = TextAttributesKey.createTextAttributesKey("SMPL_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACES = TextAttributesKey.createTextAttributesKey("SMPL_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val LINE_COMMENT = TextAttributesKey.createTextAttributesKey("SMPL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("SMPL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        val DOC_COMMENT = TextAttributesKey.createTextAttributesKey("SMPL_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
        val INTEGER = TextAttributesKey.createTextAttributesKey("SMPL_INTEGER", DefaultLanguageHighlighterColors.NUMBER)
        val STRING = TextAttributesKey.createTextAttributesKey("SMPL_STRING", DefaultLanguageHighlighterColors.STRING)
        val SYSPATH = TextAttributesKey.createTextAttributesKey("SMPL_SYSPATH", DefaultLanguageHighlighterColors.STRING)
        // val ESCAPE = TextAttributesKey.createTextAttributesKey("SMPL_ESCAPE", DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE)
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
                SmPLTypes.HASH_INCLUDE,
            )

            keysPutEach(
                VIRTUAL_HEADER,
                SmPLTypes.VIRTUAL
            )

            keysPutEach(
                METAVARS_AT,
                SmPLTypes.AT,
                SmPLTypes.DOUBLE_AT
            )

            keysPutEach(
                METAVARS_HEAD_KEYWORD,
                SmPLTypes.SCRIPT,
                SmPLTypes.INITIALIZE,
                SmPLTypes.FINALIZE
            )

            keysPutEach(
                METADECL_HEAD_KEYWORD,
                SmPLTypes.FRESH_IDENTIFIER,
                SmPLTypes.METAVARIABLE,
                SmPLTypes.IDENTIFIER,
                SmPLTypes.IDENTIFIER_LIST,
                SmPLTypes.FIELD,
                SmPLTypes.FIELD_LIST,
                SmPLTypes.PARAMETER,
                SmPLTypes.PARAMETER_LIST,
                SmPLTypes.TYPE,
                SmPLTypes.STATEMENT,
                SmPLTypes.STATEMENT_LIST,
                SmPLTypes.DECLARATION,
                SmPLTypes.INITIALIZER,
                SmPLTypes.INITIALIZER_LIST,
                SmPLTypes.LOCAL_IDEXPRESSION,
                SmPLTypes.GLOBAL_IDEXPRESSION,
                SmPLTypes.IDEXPRESSION,
                SmPLTypes.EXPRESSION,
                SmPLTypes.EXPRESSION_ENUM,
                SmPLTypes.EXPRESSION_STRUCT,
                SmPLTypes.EXPRESSION_UNION,
                SmPLTypes.EXPRESSION_LIST,
                SmPLTypes.CONSTANT,
                SmPLTypes.FORMAT,
                SmPLTypes.FORMAT_LIST,
                SmPLTypes.ASSIGNMENT_OPERATOR,
                SmPLTypes.BINARY_OPERATOR,
                SmPLTypes.UNARY_OPERATOR,
                SmPLTypes.POSITION,
                SmPLTypes.POSITION_ANY,
                SmPLTypes.SYMBOL,
                SmPLTypes.TYPEDEF,
                SmPLTypes.ATTRIBUTE_NAME,
                SmPLTypes.ATTRIBUTE,
                SmPLTypes.DECLARER_NAME,
                SmPLTypes.DECLARER,
                SmPLTypes.ITERATOR_NAME,
                SmPLTypes.ITERATOR
            )

            keysPutEach(
                METADECL_BODY_KEYWORD,
                SmPLTypes.DEPENDS_ON,
                SmPLTypes.USING,
                SmPLTypes.DISABLE,
                SmPLTypes.EVER,
                SmPLTypes.NEVER,
                SmPLTypes.FILE_IN,
                SmPLTypes.EXISTS,
                SmPLTypes.FORALL
            )

            keysPutEach(SCRIPT_LANG, SmPLTypes.SCRIPT_LANG)

            keysPutEach(
                RESERVED_OP,
                SmPLTypes.EQUALS,
                SmPLTypes.NOT_EQUALS,
                SmPLTypes.AND,
                SmPLTypes.OR,
                SmPLTypes.DOUBLE_AND,
                SmPLTypes.DOUBLE_OR,
                SmPLTypes.NOT,
                SmPLTypes.REGEXP_MATCHES,
                SmPLTypes.REGEXP_NOT_MATCHES,
                SmPLTypes.COLON,
                SmPLTypes.LEFT_LEFT
            )

            keysPutEach(DOT, SmPLTypes.DOT)
            keysPutEach(COMMA, SmPLTypes.COMMA)
            keysPutEach(SEMICOLON, SmPLTypes.SEMI)
            keysPutEach(PARENTHESES, SmPLTypes.LPAREN, SmPLTypes.RPAREN)
            keysPutEach(BRACKETS, SmPLTypes.LBRACK, SmPLTypes.RBRACK)
            keysPutEach(BRACES, SmPLTypes.LBRACE, SmPLTypes.RBRACE)
            keysPutEach(LINE_COMMENT, SmPLTypes.LINE_COMMENT)
            keysPutEach(BLOCK_COMMENT, SmPLTypes.BLOCK_COMMENT)
            keysPutEach(DOC_COMMENT, SmPLTypes.DOC_COMMENT)
            keysPutEach(STRING, SmPLTypes.STRING)
            keysPutEach(SYSPATH, SmPLTypes.SYSPATH)
            keysPutEach(INTEGER, SmPLTypes.INTEGER)
            // keysPutEach(ESCAPE, SmPLTypes.ESCAPE)
        }

        val ATTRIBUTE_KEYS: Array<TextAttributesKey> = keys.values.toTypedArray()
    }
}