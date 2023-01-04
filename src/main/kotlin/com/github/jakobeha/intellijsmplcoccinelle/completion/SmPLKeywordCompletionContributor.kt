package com.github.jakobeha.intellijsmplcoccinelle.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns
import com.github.jakobeha.intellijsmplcoccinelle.SmPL


/**
 * Basic SmPL keyword completion support.
 */
class SmPLKeywordCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement().withLanguage(SmPL),
            SmPLKeywordProvider()
        )
    }
}
