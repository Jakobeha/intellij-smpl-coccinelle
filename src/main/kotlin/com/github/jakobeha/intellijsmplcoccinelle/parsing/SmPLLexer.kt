package com.github.jakobeha.intellijsmplcoccinelle.parsing

import com.github.jakobeha.intellijsmplcoccinelle.injection.SmPLCodeLang
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes
import com.intellij.lexer.FlexAdapter
import com.intellij.psi.tree.IElementType

/**
 * The way this lexer works is, we remember which code fragments are metadeclarations and which ones are script or
 * transformation code, based on the `@@`s: code after every `^@(.*)?@.*^@@$` is script or transformation code, and we
 * can tell based on whether the first `(.*)?` has `script:`, `initialize:`, or `finalize:`.
 *
 * The underlying lexer is only applied to metadeclarations and the initial import code.
 * The rest is lexed into a single TRANSFORMATION or SCRIPT token, which will be handed off to the corresponding
 * language via [com.intellij.lang.injection.MultiHostInjector]
 */
class SmPLLexer(): FlexAdapter(_SmPLLexer(null)) {
    private enum class Mode {
        /** We are before or in an import header, or right before a metadecl (at the `@`) */
        Import,
        /** We are in a metadecl */
        MetaDeclaration,
        /** We are right before a code block and after a metadecl (last lexed = `@@`) */
        BeforeCode,
        /** We are right after a code block and before a metadecl (last lexed = code block) */
        AfterCode
    }

    private val regex = Regex("^@")

    private var mode = Mode.Import
    private var codeLang: SmPLCodeLang = SmPLCodeLang.Transformation
    private var codeStartPos: Int = 0

    // region coordinate mode/script state and lexer tate
    /** Set mode and codeLang and return jflex lexer state */
    private fun decode(state: Int): Int {
        this.mode = Mode.values()[state and 0b11]
        this.codeLang = SmPLCodeLang.values()[(state shr 2) and 0b11]
        return state shr 4
    }

    override fun getState(): Int {
        val mode = mode.ordinal
        val codeLang = codeLang.ordinal
        val lexerState = super.getState()
        return mode or (codeLang shl 2) or (lexerState shl 4)
    }

    override fun getTokenType(): IElementType? = when (this.mode) {
        Mode.BeforeCode -> this.codeLang.elementType
        else -> super.getTokenType()
    }

    override fun getTokenStart(): Int = when (this.mode) {
        Mode.AfterCode -> this.codeStartPos
        else -> super.getTokenStart()
    }

    override fun getTokenEnd(): Int = when (this.mode) {
        // See advanceCode definition, we set lexer to start at code end
        Mode.AfterCode -> this.flex.tokenStart
        else -> super.getTokenStart()
    }

    override fun start(buffer: CharSequence, startOffset: Int, endOffset: Int, initialState: Int) {
        val lexerState = decode(initialState)
        super.start(buffer, startOffset, endOffset, lexerState)
    }
    // endregion

    // region update mode/script state and override mode/script tokens
    override fun advance() {
        // See documentation for Mode.Code and Mode.AfterCode
        if (this.mode == Mode.AfterCode) {
            this.mode = Mode.MetaDeclaration
        }
        when (this.mode) {
            Mode.Import -> {
                super.advance()
                this.checkForImportEnd()
            }
            Mode.MetaDeclaration -> {
                super.advance()
                this.checkForMetaDeclEnd()
            }
            Mode.BeforeCode -> this.advanceCode()
            Mode.AfterCode -> throw IllegalStateException("impossible")
        }
    }

    private fun checkForImportEnd() {
        assert(this.mode == Mode.Import)
        if (this.tokenType == SmPLTypes.AT || this.tokenType == SmPLTypes.DOUBLE_AT) {
            this.mode = Mode.MetaDeclaration
            // TODO check codeLang
        }
    }

    private fun checkForMetaDeclEnd() {
        assert(this.mode == Mode.MetaDeclaration)
        if (this.tokenType == SmPLTypes.DOUBLE_AT) {
            this.mode = Mode.BeforeCode
        }
    }

    private fun advanceCode() {
        assert(this.mode == Mode.BeforeCode)
        assert(this.tokenType == SmPLTypes.DOUBLE_AT)
        this.codeStartPos = this.tokenEnd
        val codeEndPos = when (val match = regex.find(this.bufferSequence, this.codeStartPos)) {
            null -> this.bufferEnd
            else -> match.range.first
        }
        this.mode = Mode.AfterCode
        // Set lexer position (tokenStartPos) to codeEndPos, also removes the currently lexed token
        // (but we must override to return the code token anyways)
        this.flex.reset(this.bufferSequence, codeEndPos, this.bufferEnd, this.flex.yystate())
    }
    // endregion
}