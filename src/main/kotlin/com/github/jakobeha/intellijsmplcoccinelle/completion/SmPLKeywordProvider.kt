package com.github.jakobeha.intellijsmplcoccinelle.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.util.ProcessingContext


/**
 * SmPL keyword completion provider.
 */
class SmPLKeywordProvider : CompletionProvider<CompletionParameters?>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        // See https://coccinelle.gitlabpages.inria.fr/website/docs/main_grammar.html
        result.addAllElements(sequenceOf(
            // in rulename
            "extends",
            "depends on",
            // in dep
            "ever",
            "never",
            "file in",
            // in iso
            "using",
            // in disable-iso
            "disable",
            // in exists / forall (grammar definition is wrong)
            "exists",
            "forall",
            // in rulekind
            "expression",
            "identifier",
            "type",
            // Special names for disable-iso
            "optional_storage",
            "optional_qualifier",
            "optional_attributes",
            "value_format",
            "optional_declarer_semicolon",
            "comm_assoc",
            "prototypes",
            // in metadecl
            "fresh identifier",
            "metadvariable",
            "field",
         	"parameter",
         	// "type",
         	"statement",
         	"declaration",
         	"initialiser",
            "local idexpression",
            "global idexpression",
            // "expression",
            // "identifier",
            "constant",
            "assignment operator",
            "binary operator",
            "unary operation",
            "position",
            "any",
            "symbol",
            "typedef",
            "attribute",
            "declarer",
            "iterator",
            "name",
            // in list
            "list",
            // in pmvid
            "virtual.",
            // in script
            "script:",
            "ocaml",
            "python",
            // in script_metavariables
            // "script:",
            "initialize:",
            "finalize:",
            // in language
            // "ocaml",
            // "python",
        ).map { LookupElementBuilder.create(it) }.asIterable())
    }
}
