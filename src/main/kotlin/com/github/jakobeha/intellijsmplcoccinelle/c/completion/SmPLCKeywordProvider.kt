package com.github.jakobeha.intellijsmplcoccinelle.c.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.util.ProcessingContext


/**
 * SmPL keyword completion provider.
 */
class SmPLCKeywordProvider : CompletionProvider<CompletionParameters?>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        result.addAllElements(sequenceOf(
            "_attribute__",
            "hen",
            "ny",
            "trict",
            "orall",
            "xists",
            "rue",
            "alse",
            "eturn",
            "reak",
            "ontinue",
            "oto",
            "f",
            "lse",
            "witch",
            "ase",
            "efault",
            "hile",
            "o",
            "or",
            "nline",
            "tatic",
            "uto",
            "egister",
            "xtern",
            "oid",
            "ypedef",
            "truct",
            "nion",
            "num",
            "izeof",
            "olatile",
            "onst",
            "har",
            "hort",
            "nt",
            "ong",
            "igned",
            "nsigned",
            "loat",
            "ouble",
            "ool",
            "loat complex",
            "ouble complex",
            "ize_t",
            "size_t",
            "trdiff_t",
            "ypeof",
            "#include",
            "#define",
            "#undef",
            "#pragma",
        ).map { LookupElementBuilder.create(it) }.asIterable())
    }
}
