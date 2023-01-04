package com.github.jakobeha.intellijsmplcoccinelle.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.github.jakobeha.intellijsmplcoccinelle.SmPL
import com.github.jakobeha.intellijsmplcoccinelle.SmPLFileType


class SmPLFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SmPL) {
    override fun getFileType(): FileType = SmPLFileType
    override fun toString(): String = "SmPL File"
}
