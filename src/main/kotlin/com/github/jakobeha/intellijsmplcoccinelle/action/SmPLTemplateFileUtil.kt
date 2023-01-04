package com.github.jakobeha.intellijsmplcoccinelle.action

import com.google.common.collect.Streams
import com.intellij.ide.fileTemplates.FileTemplate
import com.intellij.ide.fileTemplates.FileTemplateManager
import com.intellij.openapi.project.Project
import com.github.jakobeha.intellijsmplcoccinelle.SmPLFileType
import java.util.*
import java.util.stream.Collectors


object SmPLTemplateFileUtil {
    fun getApplicableTemplates(project: Project?): List<FileTemplate> {
        val fileTemplateManager = FileTemplateManager.getInstance(project!!)
        val extension: String = SmPLFileType.getDefaultExtension()
        return Streams.concat(
            Arrays.stream(fileTemplateManager.internalTemplates),
            Arrays.stream(fileTemplateManager.allTemplates)
        )
            .filter { ft: FileTemplate -> ft.extension == extension }
            .collect(Collectors.toList())
    }
}
