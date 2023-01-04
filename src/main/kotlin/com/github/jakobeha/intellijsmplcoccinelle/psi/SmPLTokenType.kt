package com.github.jakobeha.intellijsmplcoccinelle.psi

import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.intellij.lang.annotations.MagicConstant
import com.github.jakobeha.intellijsmplcoccinelle.SmPL
import com.github.jakobeha.intellijsmplcoccinelle.parsing.SmPLLexer
import com.github.jakobeha.intellijsmplcoccinelle.parsing.SmPLParser


object SmPLTokenType {
    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(
            SmPL,
            SmPLLexer.tokenNames,
            SmPLParser.ruleNames
        )
    }

    private val RULE_ELEMENT_TYPES = PSIElementTypeFactory.getRuleIElementTypes(SmPL)
    private val TOKEN_ELEMENT_TYPES = PSIElementTypeFactory.getTokenIElementTypes(SmPL)
    fun getRuleElementType(@MagicConstant(valuesFromClass = SmPLParser::class) ruleIndex: Int): RuleIElementType {
        return RULE_ELEMENT_TYPES[ruleIndex]
    }

    fun getTokenElementType(@MagicConstant(valuesFromClass = SmPLLexer::class) tokenIndex: Int): TokenIElementType {
        return TOKEN_ELEMENT_TYPES[tokenIndex]
    }
}
