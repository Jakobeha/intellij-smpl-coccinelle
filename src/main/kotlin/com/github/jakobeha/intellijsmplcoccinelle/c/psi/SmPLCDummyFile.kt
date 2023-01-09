package com.github.jakobeha.intellijsmplcoccinelle.c.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.github.jakobeha.intellijsmplcoccinelle.c.SmPLC
import com.github.jakobeha.intellijsmplcoccinelle.c.SmPLCDummyFileType


class SmPLCDummyFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SmPLC) {
    override fun getFileType(): FileType = SmPLCDummyFileType
    override fun toString(): String = "C (SmPL) Dummy File"
}
