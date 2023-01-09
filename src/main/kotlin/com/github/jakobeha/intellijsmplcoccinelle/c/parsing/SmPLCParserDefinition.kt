package com.github.jakobeha.intellijsmplcoccinelle.c.parsing

import com.github.jakobeha.intellijsmplcoccinelle.c.SmPLC
import com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCDummyFile
import com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCParser
import com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCTypes
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class SmPLCParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = SmPLCLexer()

    override fun createParser(project: Project): PsiParser = SmPLCParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement {
        return ASTWrapperPsiElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return SmPLCDummyFile(viewProvider)
    }

    override fun getWhitespaceTokens(): TokenSet = TokenSet.WHITE_SPACE

    private val alphaNumericRegex = Regex("[a-zA-Z0-9_]+")

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements = when {
        left?.text == null || right?.text == null -> ParserDefinition.SpaceRequirements.MAY
        alphaNumericRegex.matchEntire(left.text) != null && alphaNumericRegex.matchEntire(right.text) != null -> ParserDefinition.SpaceRequirements.MUST
        else -> ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        private val FILE = IFileElementType(SmPLC)

        val COMMENTS: TokenSet = TokenSet.create(
            SmPLCTypes.DOC_COMMENT,
            SmPLCTypes.BLOCK_COMMENT,
            SmPLCTypes.LINE_COMMENT
        )

        val STRING_LITERALS: TokenSet = TokenSet.create(
            SmPLCTypes.STRING
        )

    }
}
