/* MODIFIED from generated SmPL.bnf lexer. Do not replace */
package com.github.jakobeha.intellijsmplcoccinelle.parsing;

import com.github.jakobeha.intellijsmplcoccinelle.injection.SmPLCodeLang;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes.*;

@SuppressWarnings("ALL")
%%

%{
    private SmPLCodeLang lang = SmPLCodeLang.Transformation;

    public _SmPLLexer() {
      this((java.io.Reader)null);
    }

    private IElementType exitCodeBlock() {
        yybegin(AFTER_CODE_BLOCK);
        switch (this.lang) {
            case Ocaml: return OCAML_BLOCK;
            case Python: return PYTHON_BLOCK;
            case Transformation: return TRANSFORMATION_BLOCK;
            default: throw new RuntimeException("Unhandled language: " + this.lang);
        }
    }
%}

%public
%class _SmPLLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%state METAVARS, SCRIPT_METAVARS, CODE_BLOCK, AFTER_CODE_BLOCK

WHITE_SPACE=\s+

LINE_COMMENT="//"([^/].*)?
BLOCK_COMMENT="/"\*[^*]([^*]|\*[^/])*\*"/" | "/**/"
DOC_COMMENT="///".*|"/"\*\*([^*]|\*[^/])*\*"/"

DIGITS=[0-9]+
WORD=[a-zA-Z_][a-zA-Z0-9_]*
STRING=\"[^\"]*\"
SYSPATH=<[^>]*>

%%
<YYINITIAL> {
  "#include"                  { return HASH_INCLUDE; }
  "using"                     { return USING_INCLUDE; }
  "virtual"                   { return VIRTUAL_INCLUDE; }
  {SYSPATH}                   { return SYSPATH; }
}

<YYINITIAL,AFTER_CODE_BLOCK> {
  ^ "@@"                      { this.lang = SmPLCodeLang.Transformation; yybegin(METAVARS); return DOUBLE_AT; }
  ^ "@script:"                { yybegin(SCRIPT_METAVARS); return AT_SCRIPT_COLON; }
  ^ "@initialize:"            { yybegin(SCRIPT_METAVARS); return AT_INITIALIZE_COLON; }
  ^ "@finalize:"              { yybegin(SCRIPT_METAVARS); return AT_FINALIZE_COLON; }
  ^ "@"                       { this.lang = SmPLCodeLang.Transformation; yybegin(METAVARS); return AT; }
}

<METAVARS> {
  "fresh identifier"          { return FRESH_IDENTIFIER; }
  "identifier list"           { return IDENTIFIER_LIST; }
  "field list"                { return FIELD_LIST; }
  "parameter list"            { return PARAMETER_LIST; }
  "statement list"            { return STATEMENT_LIST; }
  "initializer list"          { return INITIALIZER_LIST; }
  "local idexpression"        { return LOCAL_IDEXPRESSION; }
  "global idexpression"       { return GLOBAL_IDEXPRESSION; }
  "expression list"           { return EXPRESSION_LIST; }
  "expression enum"           { return EXPRESSION_ENUM; }
  "expression struct"         { return EXPRESSION_STRUCT; }
  "expression union"          { return EXPRESSION_UNION; }
  "format list"               { return FORMAT_LIST; }
  "assignment operator"       { return ASSIGNMENT_OPERATOR; }
  "binary operator"           { return BINARY_OPERATOR; }
  "unary operator"            { return UNARY_OPERATOR; }
  "position any"              { return POSITION_ANY; }
  "attribute name"            { return ATTRIBUTE_NAME; }
  "declarer name"             { return DECLARER_NAME; }
  "iterator name"             { return ITERATOR_NAME; }
  "virtual"                   { return VIRTUAL; }
  "file in"                   { return FILE_IN; }
  "metavariable"              { return METAVARIABLE; }
  "field"                     { return FIELD; }
  "parameter"                 { return PARAMETER; }
  "statement"                 { return STATEMENT; }
  "declaration"               { return DECLARATION; }
  "initializer"               { return INITIALIZER; }
  "idexpression"              { return IDEXPRESSION; }
  "constant"                  { return CONSTANT; }
  "format"                    { return FORMAT; }
  "position"                  { return POSITION; }
  "symbol"                    { return SYMBOL; }
  "typedef"                   { return TYPEDEF; }
  "attribute"                 { return ATTRIBUTE; }
  "declarer"                  { return DECLARER; }
  "iterator"                  { return ITERATOR; }
}

<METAVARS,SCRIPT_METAVARS> {
  ^ "@@" [\s--\R]* \R?        { yybegin(CODE_BLOCK); return DOUBLE_AT; }
  "extends"                   { return EXTENDS; }
  "depends on"                { return DEPENDS_ON; }
  "using"                     { return USING; }
  "ever"                      { return EVER; }
  "never"                     { return NEVER; }
  "disable"                   { return DISABLE; }
  "exists"                    { return EXISTS; }
  "forall"                    { return FORALL; }
  "expression"                { return EXPRESSION; }
  "identifier"                { return IDENTIFIER; }
  "type"                      { return TYPE; }
  "script:"                   { return SCRIPT_COLON; }
  "ocaml"                     { this.lang = SmPLCodeLang.Ocaml; return OCAML; }
  "python"                    { this.lang = SmPLCodeLang.Python; return PYTHON; }

  "!="                        { return NOT_EQUALS; }
  "=~"                        { return REGEXP_MATCHES; }
  "!~"                        { return REGEXP_NOT_MATCHES; }
  "##"                        { return CONCAT; }
  "<<"                        { return LEFT_LEFT; }
  "&&"                        { return DOUBLE_AND; }
  "||"                        { return DOUBLE_OR; }
  "@"                         { return AT; }
  "&"                         { return AND; }
  "|"                         { return OR; }
  "!"                         { return NOT; }
  ","                         { return COMMA; }
  ";"                         { return SEMI; }
  "*"                         { return STAR; }
  "="                         { return EQUALS; }
  "("                         { return LPAREN; }
  ")"                         { return RPAREN; }
  "["                         { return LBRACK; }
  "]"                         { return RBRACK; }
  "{"                         { return LBRACE; }
  "}"                         { return RBRACE; }
  "."                         { return DOT; }
  ":"                         { return COLON; }
}

// Matches every line until we reach one that begins with '@', but not the '@' itself, or until we reach EOF
<CODE_BLOCK> {
  ~(\R @)                     { this.yypushback(1); return this.exitCodeBlock(); }
// Hack: we know the lexer has buffered the entire input because it must have read everything to not find ~(\R @)
// So zzEndRead (end of buffer) points to end of file
  [^]                         { this.zzMarkedPos = this.zzEndRead; return this.exitCodeBlock(); }
}

<YYINITIAL,METAVARS,SCRIPT_METAVARS> {
  {WHITE_SPACE}               { return WHITE_SPACE; }
  {LINE_COMMENT}              { return LINE_COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }
  {DOC_COMMENT}               { return DOC_COMMENT; }

  {WORD}                      { return WORD; }
  {STRING}                    { return STRING; }
  {DIGITS}                    { return DIGITS; }
}

[^] { return BAD_CHARACTER; }
