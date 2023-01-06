package com.github.jakobeha.intellijsmplcoccinelle.parsing

import com.github.jakobeha.intellijsmplcoccinelle.SmPL
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLFile
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTokenType
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class SmPLParserDefinition : ParserDefinition {
    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(
            SmPL,
            SmPLLexer.tokenNames,
            SmPLParser.ruleNames
        )
    }

    override fun createLexer(project: Project): Lexer = SmPLLexer(project)

    override fun createParser(project: Project): PsiParser = SmPLParser(project)

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return TokenSet.create(
            SmPLTokenType.getTokenElementType(SmPLLexer.COMMENT),
            SmPLTokenType.getTokenElementType(SmPLLexer.LINE_COMMENT),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_INCLUDE_LOCAL),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_INCLUDE_SYS),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_DEFINE),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_UNDEF),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_IFDEF),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_IFNDEF),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_LINE),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_IF),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_ELSEIF),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_ELIF),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_ENDIF),
            SmPLTokenType.getTokenElementType(SmPLLexer.PREPROC_ELSE)
        )
    }

    override fun getStringLiteralElements(): TokenSet {
        val stringType: IElementType = SmPLTokenType.getTokenElementType(SmPLLexer.STRING_LITERAL)
        return TokenSet.create(stringType)
    }

    override fun createElement(node: ASTNode): PsiElement {
        return ASTWrapperPsiElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return SmPLFile(viewProvider)
    }

    override fun getWhitespaceTokens(): TokenSet {
        val wsType: IElementType = SmPLTokenType.getTokenElementType(SmPLLexer.WS)
        return TokenSet.create(wsType)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY

    companion object {
        val FILE = IFileElementType(SmPL)
    }
}
