package com.github.jakobeha.intellijsmplcoccinelle.parsing

import com.github.jakobeha.intellijsmplcoccinelle.SmPL
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLFile
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLParser
import com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes
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


class SmPLParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = SmPLLexer()

    override fun createParser(project: Project): PsiParser = SmPLParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement = SmPLTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return SmPLFile(viewProvider)
    }

    override fun getWhitespaceTokens(): TokenSet = TokenSet.WHITE_SPACE

    private val alphaNumericRegex = Regex("[a-zA-Z0-9_]+")

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements = when {
        left?.text == null || right?.text == null -> ParserDefinition.SpaceRequirements.MAY
        // This creates a new token but it's what we want, also technically we don't *need* this rule
        left.text == "@" && right.text == "@" -> ParserDefinition.SpaceRequirements.MUST_NOT
        right.text == "@@" -> ParserDefinition.SpaceRequirements.MUST_LINE_BREAK
        alphaNumericRegex.matchEntire(left.text) != null && alphaNumericRegex.matchEntire(right.text) != null -> ParserDefinition.SpaceRequirements.MUST
        else -> ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        private val FILE = IFileElementType(SmPL)

        val COMMENTS: TokenSet = TokenSet.create(
            SmPLTypes.DOC_COMMENT,
            SmPLTypes.BLOCK_COMMENT,
            SmPLTypes.LINE_COMMENT
        )

        val STRING_LITERALS: TokenSet = TokenSet.create(
            SmPLTypes.STRING,
            SmPLTypes.SYSPATH
        )

    }
}
