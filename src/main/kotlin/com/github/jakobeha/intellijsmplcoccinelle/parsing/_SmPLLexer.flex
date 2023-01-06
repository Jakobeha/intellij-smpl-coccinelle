package com.github.jakobeha.intellijsmplcoccinelle.parsing;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes.*;

%%

%{
  public _SmPLLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SmPLLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

DIGITS=[0-9]+
WORD=[a-zA-Z_][a-zA-Z0-9_]*
STRING=\"[^\"]*\"
SYSPATH=<[^>]*>
WHITE_SPACE=[ \t\n\x0B\f\r]+
SCRIPT_LINE=\n;[^\r\n]*
TRANSFORMATION_LINE=\n:[^\r\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return WHITE_SPACE; }

  "@"                        { return AT; }
  "!"                        { return NOT; }
  "&"                        { return AND; }
  "|"                        { return OR; }
  "&&"                       { return DOUBLE_AND; }
  "||"                       { return DOUBLE_OR; }
  ","                        { return COMMA; }
  ";"                        { return SEMI; }
  "*"                        { return STAR; }
  "="                        { return EQUALS; }
  "("                        { return LPAREN; }
  ")"                        { return RPAREN; }
  "["                        { return LBRACK; }
  "]"                        { return RBRACK; }
  "{"                        { return LBRACE; }
  "}"                        { return RBRACE; }
  "."                        { return DOT; }
  ":"                        { return COLON; }
  "!="                       { return NOT_EQUALS; }
  "=~"                       { return REGEXP_MATCHES; }
  "!~"                       { return REGEXP_NOT_MATCHES; }
  "##"                       { return CONCAT; }
  "<<"                       { return LEFT_LEFT; }
  "#include"                 { return HASH_INCLUDE; }
  "virtual"                  { return VIRTUAL; }
  "extends"                  { return EXTENDS; }
  "depends on"               { return DEPENDS_ON; }
  "ever"                     { return EVER; }
  "never"                    { return NEVER; }
  "file in"                  { return FILE_IN; }
  "using"                    { return USING; }
  "disable"                  { return DISABLE; }
  "exists"                   { return EXISTS; }
  "forall"                   { return FORALL; }
  "expression"               { return EXPRESSION; }
  "identifier"               { return IDENTIFIER; }
  "type"                     { return TYPE; }
  "fresh identifier"         { return FRESH_IDENTIFIER; }
  "identifier list"          { return IDENTIFIER_LIST; }
  "metavariable"             { return METAVARIABLE; }
  "field"                    { return FIELD; }
  "field list"               { return FIELD_LIST; }
  "parameter"                { return PARAMETER; }
  "parameter list"           { return PARAMETER_LIST; }
  "statement"                { return STATEMENT; }
  "statement list"           { return STATEMENT_LIST; }
  "declaration"              { return DECLARATION; }
  "initializer"              { return INITIALIZER; }
  "initializer list"         { return INITIALIZER_LIST; }
  "local idexpression"       { return LOCAL_IDEXPRESSION; }
  "global idexpression"      { return GLOBAL_IDEXPRESSION; }
  "idexpression"             { return IDEXPRESSION; }
  "expression list"          { return EXPRESSION_LIST; }
  "expression enum"          { return EXPRESSION_ENUM; }
  "expression struct"        { return EXPRESSION_STRUCT; }
  "expression union"         { return EXPRESSION_UNION; }
  "constant"                 { return CONSTANT; }
  "format"                   { return FORMAT; }
  "format list"              { return FORMAT_LIST; }
  "assignment operator"      { return ASSIGNMENT_OPERATOR; }
  "binary operator"          { return BINARY_OPERATOR; }
  "unary operator"           { return UNARY_OPERATOR; }
  "position"                 { return POSITION; }
  "position any"             { return POSITION_ANY; }
  "symbol"                   { return SYMBOL; }
  "typedef"                  { return TYPEDEF; }
  "attribute name"           { return ATTRIBUTE_NAME; }
  "attribute"                { return ATTRIBUTE; }
  "declarer name"            { return DECLARER_NAME; }
  "declarer"                 { return DECLARER; }
  "iterator name"            { return ITERATOR_NAME; }
  "iterator"                 { return ITERATOR; }
  "script"                   { return SCRIPT; }
  "initialize"               { return INITIALIZE; }
  "finalize"                 { return FINALIZE; }
  "CTYPE"                    { return CTYPE; }
  "EXPR"                     { return EXPR; }
  "INTEGER"                  { return INTEGER; }

  {DIGITS}                   { return DIGITS; }
  {WORD}                     { return WORD; }
  {STRING}                   { return STRING; }
  {SYSPATH}                  { return SYSPATH; }
  {WHITE_SPACE}              { return WHITE_SPACE; }
  {SCRIPT_LINE}              { return SCRIPT_LINE; }
  {TRANSFORMATION_LINE}      { return TRANSFORMATION_LINE; }

}

[^] { return BAD_CHARACTER; }
