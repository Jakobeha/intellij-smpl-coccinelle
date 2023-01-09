package com.github.jakobeha.intellijsmplcoccinelle.c.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import com.github.jakobeha.intellijsmplcoccinelle.c.SmPLC


/**
 * Basic SmPL keyword completion support.
 */
class SmPLCKeywordCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement().withLanguage(SmPLC),
            SmPLCKeywordProvider()
        )
    }
}
