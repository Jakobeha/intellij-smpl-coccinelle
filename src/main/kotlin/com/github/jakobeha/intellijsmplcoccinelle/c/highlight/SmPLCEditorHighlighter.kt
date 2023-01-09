package com.github.jakobeha.intellijsmplcoccinelle.c.highlight

import com.intellij.openapi.editor.colors.EditorColorsScheme
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter
import com.intellij.openapi.editor.highlighter.EditorHighlighter
import com.intellij.openapi.fileTypes.EditorHighlighterProvider
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class SmPLCEditorHighlighter(
    colors: EditorColorsScheme
) : LayeredLexerEditorHighlighter(SmPLCSyntaxHighlighter(), colors) {
    object Provider : EditorHighlighterProvider {
        override fun getEditorHighlighter(
            project: Project?,
            fileType: FileType,
            virtualFile: VirtualFile?,
            colors: EditorColorsScheme
        ): EditorHighlighter = SmPLCEditorHighlighter(colors)
    }
}