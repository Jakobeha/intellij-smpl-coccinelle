package com.github.jakobeha.intellijsmplcoccinelle.c.parsing;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCTypes.*;

@SuppressWarnings("ALL")
%%

%{
  public _SmPLCLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SmPLCLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

WHITE_SPACE=\s+

LINE_COMMENT="//"([^/][^\R]*)?
BLOCK_COMMENT="/"\*[^*]([^*]|\*[^/])*\*"/" | "/**/"
DOC_COMMENT="///"[^\R]*|"/"\*\*([^*]|\*[^/])*\*"/"

DIGITS=[0-9]+
WORD=[a-zA-Z_][a-zA-Z0-9_]*
STRING=\"[^\"]*\"

%%
<YYINITIAL> {
  "@@"                  { return DOUBLE_AT; }
  "@"                   { return AT; }
  "<..."                { return NEST_REG_OPEN; }
  "...>"                { return NEST_REG_CLOSE; }
  "<+..."               { return NEST_PLUS_OPEN; }
  "...+>"               { return NEST_PLUS_CLOSE; }
  "......"              { return DOUBLE_ELLIPSIS; }
  "..."                 { return ELLIPSIS; }
  "\\("                 { return BACK_LPAREN; }
  "\\)"                 { return BACK_RPAREN; }
  "\\|"                 { return BACK_OR; }
  "\\&"                 { return BACK_AND; }
  "("                   { return LPAREN; }
  ")"                   { return RPAREN; }
  "["                   { return LBRACK; }
  "]"                   { return RBRACK; }
  "{"                   { return LBRACE; }
  "}"                   { return RBRACE; }
  ";"                   { return SEMICOLON; }
  ","                   { return COMMA; }
  ":"                   { return COLON; }
  "."                   { return DOT; }
  "->"                  { return ARROW; }
  "?"                   { return QUESTION; }
  "="                   { return EQUALS; }
  "-="                  { return MINUS_EQUALS; }
  "+="                  { return PLUS_EQUALS; }
  "*="                  { return TIMES_EQUALS; }
  "/="                  { return DIVIDE_EQUALS; }
  "%="                  { return MOD_EQUALS; }
  "&="                  { return AND_EQUALS; }
  "|="                  { return OR_EQUALS; }
  "^="                  { return XOR_EQUALS; }
  "<<="                 { return LSHIFT_EQUALS; }
  ">>="                 { return RSHIFT_EQUALS; }
  "*"                   { return TIMES; }
  "/"                   { return DIVIDE; }
  "%"                   { return MOD; }
  "+"                   { return PLUS; }
  "-"                   { return MINUS; }
  "<<"                  { return LSHIFT; }
  ">>"                  { return RSHIFT; }
  "^"                   { return XOR; }
  "&"                   { return AND; }
  "|"                   { return OR; }
  "<"                   { return LT; }
  ">"                   { return GT; }
  "<="                  { return LE; }
  ">="                  { return GE; }
  "=="                  { return EQ; }
  "!="                  { return NE; }
  "&&"                  { return DOUBLE_AND; }
  "||"                  { return DOUBLE_OR; }
  "!"                   { return NOT; }
  "~"                   { return TILDE; }
  "++"                  { return INCREMENT; }
  "--"                  { return DECREMENT; }
  "##"                  { return CONCAT; }
  "__attribute__"       { return ATTRIBUTE_HEAD; }
  "when"                { return WHEN; }
  "any"                 { return ANY; }
  "strict"              { return STRICT; }
  "forall"              { return FORALL; }
  "exists"              { return EXISTS; }
  "true"                { return TRUE; }
  "false"               { return FALSE; }
  "return"              { return RETURN; }
  "break"               { return BREAK; }
  "continue"            { return CONTINUE; }
  "goto"                { return GOTO; }
  "if"                  { return IF; }
  "else"                { return ELSE; }
  "switch"              { return SWITCH; }
  "case"                { return CASE; }
  "default"             { return DEFAULT; }
  "while"               { return WHILE; }
  "do"                  { return DO; }
  "for"                 { return FOR; }
  "inline"              { return INLINE; }
  "static"              { return STATIC; }
  "auto"                { return AUTO; }
  "register"            { return REGISTER; }
  "extern"              { return EXTERN; }
  "void"                { return VOID; }
  "typedef"             { return TYPEDEF; }
  "struct"              { return STRUCT; }
  "union"               { return UNION; }
  "enum"                { return ENUM; }
  "sizeof"              { return SIZEOF; }
  "volatile"            { return VOLATILE; }
  "const"               { return CONST; }
  "char"                { return CHAR; }
  "short"               { return SHORT; }
  "int"                 { return INT; }
  "long"                { return LONG; }
  "signed"              { return SIGNED; }
  "unsigned"            { return UNSIGNED; }
  "float"               { return FLOAT; }
  "double"              { return DOUBLE; }
  "bool"                { return BOOL; }
  "float complex"       { return FLOAT_COMPLEX; }
  "double complex"      { return DOUBLE_COMPLEX; }
  "size_t"              { return SIZE_T; }
  "ssize_t"             { return SSIZE_T; }
  "ptrdiff_t"           { return PTRDIFF_T; }
  "typeof"              { return TYPEOF; }
  "#include"            { return HASH_INCLUDE; }
  "#define"             { return HASH_DEFINE; }
  "#undef"              { return HASH_UNDEF; }
  "#pragma"             { return HASH_PRAGMA; }
  "INTEGER"             { return INTEGER; }

  {DIGITS}              { return DIGITS; }
  {WORD}                { return WORD; }
  {STRING}              { return STRING; }
  {WHITE_SPACE}         { return WHITE_SPACE; }
  {LINE_COMMENT}        { return LINE_COMMENT; }
  {BLOCK_COMMENT}       { return BLOCK_COMMENT; }
  {DOC_COMMENT}         { return DOC_COMMENT; }

}

[^] { return BAD_CHARACTER; }
