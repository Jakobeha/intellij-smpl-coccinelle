/** Derived from https://github.com/JetBrains/intellij-plugins/blob/master/Dart/testSrc/com/jetbrains/lang/dart/util/DartTestUtils.java */
package com.github.jakobeha.intellijsmplcoccinelle

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.PathManager
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Document
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.*
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiDocumentManager
import com.intellij.util.PathUtil
import com.intellij.util.SmartList
import junit.framework.TestCase
import java.io.File
import java.util.regex.Matcher
import java.util.regex.Pattern


object SmPLTestUtils {
    val BASE_TEST_DATA_PATH = findTestDataPath()
    private fun findTestDataPath(): String {
        val parentPath = PathUtil.getParentPath(PathManager.getHomePath())
        return when {
            // started from 'SmPL-plugin' project
            File("src/test/testData").isDirectory ->
                FileUtil.toSystemIndependentName(File("src/test/testData").absolutePath)
            // started from IntelliJ IDEA Ultimate project
            File(PathManager.getHomePath() + "/contrib").isDirectory ->
                FileUtil.toSystemIndependentName(PathManager.getHomePath() + "/contrib/SmPL/src/test/testData")
            // started from IntelliJ IDEA Community Edition + SmPL Plugin project
            File("$parentPath/intellij-plugins").isDirectory ->
                FileUtil.toSystemIndependentName("$parentPath/intellij-plugins/SmPL/src/test/testData")
            // started from IntelliJ IDEA Community + SmPL Plugin project
            File("$parentPath/contrib").isDirectory ->
                FileUtil.toSystemIndependentName("$parentPath/contrib/SmPL/src/test/testData")
            // idk
            else -> throw RuntimeException("Can't find testData directory")
        }
    }

    fun extractPositionMarkers(project: Project, document: Document): List<CaretPositionInfo> {
        val caretPattern = Pattern.compile(
            "<caret(?: expected='([^']*)')?(?: completionEquals='([^']*)')?(?: completionIncludes='([^']*)')?(?: completionExcludes='([^']*)')?>"
        )
        val result: MutableList<CaretPositionInfo> = mutableListOf()
        WriteCommandAction.runWriteCommandAction(null) {
            while (true) {
                val m: Matcher = caretPattern.matcher(document.immutableCharSequence)
                if (m.find()) {
                    document.deleteString(m.start(), m.end())
                    val caretOffset: Int = m.start()
                    val expected: String = m.group(1)
                    val completionEqualsRaw: String? = m.group(2)
                    val completionEqualsList: List<String>? =
                        if (completionEqualsRaw == null) null else StringUtil.split(
                            completionEqualsRaw,
                            ","
                        )
                    val completionIncludesRaw: String? = m.group(3)
                    val completionIncludesList: List<String>? =
                        if (completionIncludesRaw == null) null else StringUtil.split(
                            completionIncludesRaw,
                            ","
                        )
                    val completionExcludesRaw: String? = m.group(4)
                    val completionExcludesList: List<String>? =
                        if (completionExcludesRaw == null) null else StringUtil.split(
                            completionExcludesRaw,
                            ","
                        )
                    result.add(
                        CaretPositionInfo(
                            caretOffset,
                            expected,
                            completionEqualsList,
                            completionIncludesList,
                            completionExcludesList
                        )
                    )
                } else {
                    break
                }
            }
        }
        if (result.isNotEmpty()) {
            PsiDocumentManager.getInstance(project).commitDocument(document)
        }
        return result
    }

    /**
     * Use this method in finally{} clause if the test modifies excluded roots or configures module libraries
     */
    fun resetModuleRoots(module: Module) {
        ApplicationManager.getApplication().runWriteAction {
            val modifiableModel: ModifiableRootModel = ModuleRootManager.getInstance(module).modifiableModel
            try {
                val entriesToRemove: MutableList<OrderEntry> =
                    SmartList()
                for (orderEntry: OrderEntry? in modifiableModel.orderEntries) {
                    if (orderEntry is LibraryOrderEntry) {
                        entriesToRemove.add(orderEntry)
                    }
                }
                for (orderEntry: OrderEntry? in entriesToRemove) {
                    modifiableModel.removeOrderEntry((orderEntry)!!)
                }
                val contentEntries: Array<ContentEntry> = modifiableModel.contentEntries
                TestCase.assertEquals(
                    "Expected one content root, got: " + contentEntries.size,
                    1,
                    contentEntries.size
                )
                val oldContentEntry: ContentEntry = contentEntries[0]
                if (oldContentEntry.sourceFolders.size != 1 || oldContentEntry.excludeFolderUrls.size > 0) {
                    modifiableModel.removeContentEntry(oldContentEntry)
                    val newContentEntry: ContentEntry = modifiableModel.addContentEntry(oldContentEntry.url)
                    newContentEntry.addSourceFolder(newContentEntry.url, false)
                }
                if (modifiableModel.isChanged) {
                    modifiableModel.commit()
                }
            } finally {
                if (!modifiableModel.isDisposed) {
                    modifiableModel.dispose()
                }
            }
        }
    }
}