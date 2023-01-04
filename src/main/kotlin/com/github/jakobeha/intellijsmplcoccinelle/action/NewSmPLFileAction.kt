package com.github.jakobeha.intellijsmplcoccinelle.action

import com.google.common.base.CaseFormat
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.ide.actions.CreateFromTemplateAction
import com.intellij.ide.fileTemplates.FileTemplate
import com.intellij.ide.fileTemplates.FileTemplateManager
import com.intellij.ide.fileTemplates.FileTemplateUtil
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.util.IncorrectOperationException
import com.github.jakobeha.intellijsmplcoccinelle.SmPLIcons
import java.util.*

class NewSmPLFileAction :
    CreateFromTemplateAction<PsiFile?>("SmPL File", null, SmPLIcons.FILE) {
    override fun createFile(fileName: String, templateName: String, psiDirectory: PsiDirectory): PsiFile? {
        return try {
            createFile(fileName, psiDirectory, templateName).containingFile
        } catch (e: Exception) {
            throw IncorrectOperationException(e.message, e.cause)
        }
    }

    override fun buildDialog(
        project: Project, psiDirectory: PsiDirectory,
        builder: CreateFileFromTemplateDialog.Builder
    ) {
        builder.setTitle("Create new SmPL (coccinelle) file")
        for (ft in SmPLTemplateFileUtil.getApplicableTemplates(project)) {
            val name: String = ft.getName()
            builder.addKind(name, SmPLIcons.FILE, name)
        }
    }

    override fun getActionName(psiDirectory: PsiDirectory, newName: String, templateName: String): String {
        return "Creating file $newName"
    }

    companion object {
        @Throws(Exception::class)
        private fun createFile(fileName: String, directory: PsiDirectory, templateName: String): PsiElement {
            val project = directory.project
            val fileTemplateManager = FileTemplateManager.getInstance(project)
            val props = Properties(fileTemplateManager.defaultProperties)
            props.setProperty(FileTemplate.ATTRIBUTE_NAME, fileName)
            val allCaseName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, fileName)
            props.setProperty("ALL_CASE_NAME", allCaseName)
            val template = fileTemplateManager.getInternalTemplate(templateName)
            return FileTemplateUtil.createFromTemplate(
                template,
                fileName,
                props,
                directory,
                NewSmPLFileAction::class.java.classLoader
            )
        }
    }
}