// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.jakobeha.intellijsmplcoccinelle.c.psi.impl.*;

public interface SmPLCTypes {

  IElementType ANY_STRICT = new SmPLCElementType("ANY_STRICT");
  IElementType ARG = new SmPLCElementType("ARG");
  IElementType ASSIGN_OP = new SmPLCElementType("ASSIGN_OP");
  IElementType ATTRIBUTE = new SmPLCElementType("ATTRIBUTE");
  IElementType BIN_OP = new SmPLCElementType("BIN_OP");
  IElementType CASE_LINE = new SmPLCElementType("CASE_LINE");
  IElementType CASE_LINE_CASE = new SmPLCElementType("CASE_LINE_CASE");
  IElementType CASE_LINE_DEFAULT = new SmPLCElementType("CASE_LINE_DEFAULT");
  IElementType CONJUNCT = new SmPLCElementType("CONJUNCT");
  IElementType CONSTANT = new SmPLCElementType("CONSTANT");
  IElementType CONST_VOL = new SmPLCElementType("CONST_VOL");
  IElementType CONTINUE_STRUCT_DECL_LIST = new SmPLCElementType("CONTINUE_STRUCT_DECL_LIST");
  IElementType CTYPE = new SmPLCElementType("CTYPE");
  IElementType CTYPE_ENUM = new SmPLCElementType("CTYPE_ENUM");
  IElementType CTYPE_QUALIF = new SmPLCElementType("CTYPE_QUALIF");
  IElementType CTYPE_STRUCT_UNION = new SmPLCElementType("CTYPE_STRUCT_UNION");
  IElementType CTYPE_TYPEOF = new SmPLCElementType("CTYPE_TYPEOF");
  IElementType DECL = new SmPLCElementType("DECL");
  IElementType DECL_FN = new SmPLCElementType("DECL_FN");
  IElementType DECL_FN_TYPE = new SmPLCElementType("DECL_FN_TYPE");
  IElementType DECL_IDENT_2_INIT = new SmPLCElementType("DECL_IDENT_2_INIT");
  IElementType DECL_IDENT_INIT = new SmPLCElementType("DECL_IDENT_INIT");
  IElementType DECL_META = new SmPLCElementType("DECL_META");
  IElementType DECL_STMT = new SmPLCElementType("DECL_STMT");
  IElementType DECL_TYPE_ID = new SmPLCElementType("DECL_TYPE_ID");
  IElementType DECL_VAR = new SmPLCElementType("DECL_VAR");
  IElementType DEFINE = new SmPLCElementType("DEFINE");
  IElementType DEFINE_FUNC = new SmPLCElementType("DEFINE_FUNC");
  IElementType DESIGNATOR = new SmPLCElementType("DESIGNATOR");
  IElementType DIRECTIVE = new SmPLCElementType("DIRECTIVE");
  IElementType DISJUNCT = new SmPLCElementType("DISJUNCT");
  IElementType DOT_EXPR = new SmPLCElementType("DOT_EXPR");
  IElementType DOT_SEQ = new SmPLCElementType("DOT_SEQ");
  IElementType D_IDENT = new SmPLCElementType("D_IDENT");
  IElementType EXPR = new SmPLCElementType("EXPR");
  IElementType EXPR_HEAD = new SmPLCElementType("EXPR_HEAD");
  IElementType EXPR_REC = new SmPLCElementType("EXPR_REC");
  IElementType EXPR_TAIL = new SmPLCElementType("EXPR_TAIL");
  IElementType EXP_WHENCODE = new SmPLCElementType("EXP_WHENCODE");
  IElementType FN_CTYPE = new SmPLCElementType("FN_CTYPE");
  IElementType FUNDECL = new SmPLCElementType("FUNDECL");
  IElementType FUNID = new SmPLCElementType("FUNID");
  IElementType FUNINFO = new SmPLCElementType("FUNINFO");
  IElementType FUNPROTO = new SmPLCElementType("FUNPROTO");
  IElementType GENERIC_CTYPE = new SmPLCElementType("GENERIC_CTYPE");
  IElementType ID = new SmPLCElementType("ID");
  IElementType INCLUDE = new SmPLCElementType("INCLUDE");
  IElementType INITIALIZE = new SmPLCElementType("INITIALIZE");
  IElementType INIT_LIST = new SmPLCElementType("INIT_LIST");
  IElementType INIT_LIST_COLON = new SmPLCElementType("INIT_LIST_COLON");
  IElementType INIT_LIST_ELEM = new SmPLCElementType("INIT_LIST_ELEM");
  IElementType INIT_LIST_EQ = new SmPLCElementType("INIT_LIST_EQ");
  IElementType ITER_IDENT = new SmPLCElementType("ITER_IDENT");
  IElementType MULTI_RULE_ELEM_STMT = new SmPLCElementType("MULTI_RULE_ELEM_STMT");
  IElementType NAME_OPT_DECL = new SmPLCElementType("NAME_OPT_DECL");
  IElementType NEST = new SmPLCElementType("NEST");
  IElementType NEST_EXPR = new SmPLCElementType("NEST_EXPR");
  IElementType ONE_DECL = new SmPLCElementType("ONE_DECL");
  IElementType PARAM = new SmPLCElementType("PARAM");
  IElementType PARAM_SEQ = new SmPLCElementType("PARAM_SEQ");
  IElementType PRAGMA = new SmPLCElementType("PRAGMA");
  IElementType PRAGMA_ELLIPSIS = new SmPLCElementType("PRAGMA_ELLIPSIS");
  IElementType RULE_ELEM_STMT = new SmPLCElementType("RULE_ELEM_STMT");
  IElementType SINGLE_DECL_FN_INIT = new SmPLCElementType("SINGLE_DECL_FN_INIT");
  IElementType SINGLE_DECL_IDENTS = new SmPLCElementType("SINGLE_DECL_IDENTS");
  IElementType SINGLE_DECL_IDENTS_2 = new SmPLCElementType("SINGLE_DECL_IDENTS_2");
  IElementType SINGLE_DECL_TYPEDEF = new SmPLCElementType("SINGLE_DECL_TYPEDEF");
  IElementType SINGLE_DECL_TYPEDEF_EXPR = new SmPLCElementType("SINGLE_DECL_TYPEDEF_EXPR");
  IElementType SINGLE_DECL_VAR = new SmPLCElementType("SINGLE_DECL_VAR");
  IElementType SINGLE_ONE_DECL = new SmPLCElementType("SINGLE_ONE_DECL");
  IElementType SINGLE_ONE_DECL_IDENT = new SmPLCElementType("SINGLE_ONE_DECL_IDENT");
  IElementType SINGLE_ONE_DECL_IDENT_2 = new SmPLCElementType("SINGLE_ONE_DECL_IDENT_2");
  IElementType SINGLE_RULE_ELEM_STMT = new SmPLCElementType("SINGLE_RULE_ELEM_STMT");
  IElementType SINGLE_RULE_ELEM_STMT_BREAK = new SmPLCElementType("SINGLE_RULE_ELEM_STMT_BREAK");
  IElementType SINGLE_RULE_ELEM_STMT_CONTINUE = new SmPLCElementType("SINGLE_RULE_ELEM_STMT_CONTINUE");
  IElementType SINGLE_RULE_ELEM_STMT_RETURN = new SmPLCElementType("SINGLE_RULE_ELEM_STMT_RETURN");
  IElementType SINGLE_STMT = new SmPLCElementType("SINGLE_STMT");
  IElementType STMT = new SmPLCElementType("STMT");
  IElementType STMT_BLOCK = new SmPLCElementType("STMT_BLOCK");
  IElementType STMT_BREAK = new SmPLCElementType("STMT_BREAK");
  IElementType STMT_CONTINUE = new SmPLCElementType("STMT_CONTINUE");
  IElementType STMT_DO = new SmPLCElementType("STMT_DO");
  IElementType STMT_FOR = new SmPLCElementType("STMT_FOR");
  IElementType STMT_GOTO = new SmPLCElementType("STMT_GOTO");
  IElementType STMT_IF = new SmPLCElementType("STMT_IF");
  IElementType STMT_LABEL = new SmPLCElementType("STMT_LABEL");
  IElementType STMT_META_ITER = new SmPLCElementType("STMT_META_ITER");
  IElementType STMT_NEST_DECL = new SmPLCElementType("STMT_NEST_DECL");
  IElementType STMT_NEST_EXPR = new SmPLCElementType("STMT_NEST_EXPR");
  IElementType STMT_RETURN = new SmPLCElementType("STMT_RETURN");
  IElementType STMT_SEQ = new SmPLCElementType("STMT_SEQ");
  IElementType STMT_SWITCH = new SmPLCElementType("STMT_SWITCH");
  IElementType STMT_WHILE = new SmPLCElementType("STMT_WHILE");
  IElementType STORAGE = new SmPLCElementType("STORAGE");
  IElementType STRUCT_DECL = new SmPLCElementType("STRUCT_DECL");
  IElementType STRUCT_DECL_FN = new SmPLCElementType("STRUCT_DECL_FN");
  IElementType STRUCT_DECL_LIST = new SmPLCElementType("STRUCT_DECL_LIST");
  IElementType STRUCT_DECL_REG = new SmPLCElementType("STRUCT_DECL_REG");
  IElementType TOP = new SmPLCElementType("TOP");
  IElementType TYPE = new SmPLCElementType("TYPE");
  IElementType TYPEDEF_IDENT = new SmPLCElementType("TYPEDEF_IDENT");
  IElementType UNARY_OP = new SmPLCElementType("UNARY_OP");
  IElementType UNDEF = new SmPLCElementType("UNDEF");
  IElementType WHEN_ANY = new SmPLCElementType("WHEN_ANY");
  IElementType WHEN_CODE = new SmPLCElementType("WHEN_CODE");
  IElementType WHEN_COND = new SmPLCElementType("WHEN_COND");
  IElementType WHEN_EQ = new SmPLCElementType("WHEN_EQ");
  IElementType WHEN_FALSE_NE = new SmPLCElementType("WHEN_FALSE_NE");
  IElementType WHEN_NE = new SmPLCElementType("WHEN_NE");
  IElementType WHEN_TRUE_NE = new SmPLCElementType("WHEN_TRUE_NE");

  IElementType AND = new SmPLCTokenType("AND");
  IElementType AND_EQUALS = new SmPLCTokenType("&=");
  IElementType ANY = new SmPLCTokenType("any");
  IElementType ARROW = new SmPLCTokenType("->");
  IElementType ATTRIBUTE_HEAD = new SmPLCTokenType("__attribute__");
  IElementType AUTO = new SmPLCTokenType("auto");
  IElementType BACK_LPAREN = new SmPLCTokenType("\\(");
  IElementType BACK_OR = new SmPLCTokenType("\\|");
  IElementType BACK_RPAREN = new SmPLCTokenType("\\)");
  IElementType BLOCK_COMMENT = new SmPLCTokenType("block_comment");
  IElementType BOOL = new SmPLCTokenType("bool");
  IElementType BREAK = new SmPLCTokenType("break");
  IElementType CASE = new SmPLCTokenType("case");
  IElementType CHAR = new SmPLCTokenType("char");
  IElementType COLON = new SmPLCTokenType(":");
  IElementType COMMA = new SmPLCTokenType(",");
  IElementType CONCAT = new SmPLCTokenType("##");
  IElementType CONST = new SmPLCTokenType("const");
  IElementType CONTINUE = new SmPLCTokenType("continue");
  IElementType DECREMENT = new SmPLCTokenType("--");
  IElementType DEFAULT = new SmPLCTokenType("default");
  IElementType DIGITS = new SmPLCTokenType("digits");
  IElementType DIVIDE = new SmPLCTokenType("/");
  IElementType DIVIDE_EQUALS = new SmPLCTokenType("/=");
  IElementType DO = new SmPLCTokenType("do");
  IElementType DOC_COMMENT = new SmPLCTokenType("doc_comment");
  IElementType DOT = new SmPLCTokenType(".");
  IElementType DOUBLE = new SmPLCTokenType("double");
  IElementType DOUBLE_AND = new SmPLCTokenType("&&");
  IElementType DOUBLE_COMPLEX = new SmPLCTokenType("double complex");
  IElementType DOUBLE_ELLIPSIS = new SmPLCTokenType("......");
  IElementType DOUBLE_OR = new SmPLCTokenType("||");
  IElementType ELLIPSIS = new SmPLCTokenType("...");
  IElementType ELSE = new SmPLCTokenType("else");
  IElementType ENUM = new SmPLCTokenType("enum");
  IElementType EQ = new SmPLCTokenType("==");
  IElementType EQUALS = new SmPLCTokenType("=");
  IElementType EXISTS = new SmPLCTokenType("exists");
  IElementType EXTERN = new SmPLCTokenType("extern");
  IElementType FALSE = new SmPLCTokenType("false");
  IElementType FLOAT = new SmPLCTokenType("float");
  IElementType FLOAT_COMPLEX = new SmPLCTokenType("float complex");
  IElementType FOR = new SmPLCTokenType("for");
  IElementType FORALL = new SmPLCTokenType("forall");
  IElementType GE = new SmPLCTokenType(">=");
  IElementType GOTO = new SmPLCTokenType("goto");
  IElementType GT = new SmPLCTokenType(">");
  IElementType HASH_DEFINE = new SmPLCTokenType("#define");
  IElementType HASH_INCLUDE = new SmPLCTokenType("#include");
  IElementType HASH_PRAGMA = new SmPLCTokenType("#pragma");
  IElementType HASH_UNDEF = new SmPLCTokenType("#undef");
  IElementType IF = new SmPLCTokenType("if");
  IElementType INCREMENT = new SmPLCTokenType("++");
  IElementType INLINE = new SmPLCTokenType("inline");
  IElementType INT = new SmPLCTokenType("int");
  IElementType INTEGER = new SmPLCTokenType("INTEGER");
  IElementType LBRACE = new SmPLCTokenType("{");
  IElementType LBRACK = new SmPLCTokenType("[");
  IElementType LE = new SmPLCTokenType("<=");
  IElementType LINE_COMMENT = new SmPLCTokenType("line_comment");
  IElementType LONG = new SmPLCTokenType("long");
  IElementType LPAREN = new SmPLCTokenType("(");
  IElementType LSHIFT = new SmPLCTokenType("<<");
  IElementType LSHIFT_EQUALS = new SmPLCTokenType("<<=");
  IElementType LT = new SmPLCTokenType("<");
  IElementType MINUS = new SmPLCTokenType("-");
  IElementType MINUS_EQUALS = new SmPLCTokenType("-=");
  IElementType MOD = new SmPLCTokenType("%");
  IElementType MOD_EQUALS = new SmPLCTokenType("%=");
  IElementType NE = new SmPLCTokenType("!=");
  IElementType NEST_PLUS_CLOSE = new SmPLCTokenType("...+>");
  IElementType NEST_PLUS_OPEN = new SmPLCTokenType("<+...");
  IElementType NEST_REG_CLOSE = new SmPLCTokenType("...>");
  IElementType NEST_REG_OPEN = new SmPLCTokenType("<...");
  IElementType NOT = new SmPLCTokenType("!");
  IElementType OR = new SmPLCTokenType("OR");
  IElementType OR_EQUALS = new SmPLCTokenType("|=");
  IElementType PLUS = new SmPLCTokenType("+");
  IElementType PLUS_EQUALS = new SmPLCTokenType("+=");
  IElementType PTRDIFF_T = new SmPLCTokenType("ptrdiff_t");
  IElementType QUESTION = new SmPLCTokenType("?");
  IElementType RBRACE = new SmPLCTokenType("}");
  IElementType RBRACK = new SmPLCTokenType("]");
  IElementType REGISTER = new SmPLCTokenType("register");
  IElementType RETURN = new SmPLCTokenType("return");
  IElementType RPAREN = new SmPLCTokenType(")");
  IElementType RSHIFT = new SmPLCTokenType(">>");
  IElementType RSHIFT_EQUALS = new SmPLCTokenType(">>=");
  IElementType SEMICOLON = new SmPLCTokenType(";");
  IElementType SHORT = new SmPLCTokenType("short");
  IElementType SIGNED = new SmPLCTokenType("signed");
  IElementType SIZEOF = new SmPLCTokenType("sizeof");
  IElementType SIZE_T = new SmPLCTokenType("size_t");
  IElementType SSIZE_T = new SmPLCTokenType("ssize_t");
  IElementType STATIC = new SmPLCTokenType("static");
  IElementType STRICT = new SmPLCTokenType("strict");
  IElementType STRING = new SmPLCTokenType("STRING");
  IElementType STRUCT = new SmPLCTokenType("struct");
  IElementType SWITCH = new SmPLCTokenType("switch");
  IElementType TILDE = new SmPLCTokenType("~");
  IElementType TIMES = new SmPLCTokenType("*");
  IElementType TIMES_EQUALS = new SmPLCTokenType("*=");
  IElementType TRUE = new SmPLCTokenType("true");
  IElementType TYPEDEF = new SmPLCTokenType("typedef");
  IElementType TYPEOF = new SmPLCTokenType("typeof");
  IElementType UNION = new SmPLCTokenType("union");
  IElementType UNSIGNED = new SmPLCTokenType("unsigned");
  IElementType VOID = new SmPLCTokenType("void");
  IElementType VOLATILE = new SmPLCTokenType("volatile");
  IElementType WHEN = new SmPLCTokenType("when");
  IElementType WHILE = new SmPLCTokenType("while");
  IElementType WORD = new SmPLCTokenType("WORD");
  IElementType XOR = new SmPLCTokenType("^");
  IElementType XOR_EQUALS = new SmPLCTokenType("^=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANY_STRICT) {
        return new SmPLCAnyStrictImpl(node);
      }
      else if (type == ARG) {
        return new SmPLCArgImpl(node);
      }
      else if (type == ASSIGN_OP) {
        return new SmPLCAssignOpImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new SmPLCAttributeImpl(node);
      }
      else if (type == BIN_OP) {
        return new SmPLCBinOpImpl(node);
      }
      else if (type == CASE_LINE) {
        return new SmPLCCaseLineImpl(node);
      }
      else if (type == CASE_LINE_CASE) {
        return new SmPLCCaseLineCaseImpl(node);
      }
      else if (type == CASE_LINE_DEFAULT) {
        return new SmPLCCaseLineDefaultImpl(node);
      }
      else if (type == CONJUNCT) {
        return new SmPLCConjunctImpl(node);
      }
      else if (type == CONSTANT) {
        return new SmPLCConstantImpl(node);
      }
      else if (type == CONST_VOL) {
        return new SmPLCConstVolImpl(node);
      }
      else if (type == CONTINUE_STRUCT_DECL_LIST) {
        return new SmPLCContinueStructDeclListImpl(node);
      }
      else if (type == CTYPE) {
        return new SmPLCCtypeImpl(node);
      }
      else if (type == CTYPE_ENUM) {
        return new SmPLCCtypeEnumImpl(node);
      }
      else if (type == CTYPE_QUALIF) {
        return new SmPLCCtypeQualifImpl(node);
      }
      else if (type == CTYPE_STRUCT_UNION) {
        return new SmPLCCtypeStructUnionImpl(node);
      }
      else if (type == CTYPE_TYPEOF) {
        return new SmPLCCtypeTypeofImpl(node);
      }
      else if (type == DECL) {
        return new SmPLCDeclImpl(node);
      }
      else if (type == DECL_FN) {
        return new SmPLCDeclFnImpl(node);
      }
      else if (type == DECL_FN_TYPE) {
        return new SmPLCDeclFnTypeImpl(node);
      }
      else if (type == DECL_IDENT_2_INIT) {
        return new SmPLCDeclIdent2InitImpl(node);
      }
      else if (type == DECL_IDENT_INIT) {
        return new SmPLCDeclIdentInitImpl(node);
      }
      else if (type == DECL_META) {
        return new SmPLCDeclMetaImpl(node);
      }
      else if (type == DECL_STMT) {
        return new SmPLCDeclStmtImpl(node);
      }
      else if (type == DECL_TYPE_ID) {
        return new SmPLCDeclTypeIdImpl(node);
      }
      else if (type == DECL_VAR) {
        return new SmPLCDeclVarImpl(node);
      }
      else if (type == DEFINE) {
        return new SmPLCDefineImpl(node);
      }
      else if (type == DEFINE_FUNC) {
        return new SmPLCDefineFuncImpl(node);
      }
      else if (type == DESIGNATOR) {
        return new SmPLCDesignatorImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new SmPLCDirectiveImpl(node);
      }
      else if (type == DISJUNCT) {
        return new SmPLCDisjunctImpl(node);
      }
      else if (type == DOT_EXPR) {
        return new SmPLCDotExprImpl(node);
      }
      else if (type == DOT_SEQ) {
        return new SmPLCDotSeqImpl(node);
      }
      else if (type == D_IDENT) {
        return new SmPLCDIdentImpl(node);
      }
      else if (type == EXPR) {
        return new SmPLCExprImpl(node);
      }
      else if (type == EXPR_HEAD) {
        return new SmPLCExprHeadImpl(node);
      }
      else if (type == EXPR_REC) {
        return new SmPLCExprRecImpl(node);
      }
      else if (type == EXPR_TAIL) {
        return new SmPLCExprTailImpl(node);
      }
      else if (type == EXP_WHENCODE) {
        return new SmPLCExpWhencodeImpl(node);
      }
      else if (type == FN_CTYPE) {
        return new SmPLCFnCtypeImpl(node);
      }
      else if (type == FUNDECL) {
        return new SmPLCFundeclImpl(node);
      }
      else if (type == FUNID) {
        return new SmPLCFunidImpl(node);
      }
      else if (type == FUNINFO) {
        return new SmPLCFuninfoImpl(node);
      }
      else if (type == FUNPROTO) {
        return new SmPLCFunprotoImpl(node);
      }
      else if (type == GENERIC_CTYPE) {
        return new SmPLCGenericCtypeImpl(node);
      }
      else if (type == ID) {
        return new SmPLCIdImpl(node);
      }
      else if (type == INCLUDE) {
        return new SmPLCIncludeImpl(node);
      }
      else if (type == INITIALIZE) {
        return new SmPLCInitializeImpl(node);
      }
      else if (type == INIT_LIST) {
        return new SmPLCInitListImpl(node);
      }
      else if (type == INIT_LIST_COLON) {
        return new SmPLCInitListColonImpl(node);
      }
      else if (type == INIT_LIST_ELEM) {
        return new SmPLCInitListElemImpl(node);
      }
      else if (type == INIT_LIST_EQ) {
        return new SmPLCInitListEqImpl(node);
      }
      else if (type == ITER_IDENT) {
        return new SmPLCIterIdentImpl(node);
      }
      else if (type == MULTI_RULE_ELEM_STMT) {
        return new SmPLCMultiRuleElemStmtImpl(node);
      }
      else if (type == NAME_OPT_DECL) {
        return new SmPLCNameOptDeclImpl(node);
      }
      else if (type == NEST) {
        return new SmPLCNestImpl(node);
      }
      else if (type == NEST_EXPR) {
        return new SmPLCNestExprImpl(node);
      }
      else if (type == ONE_DECL) {
        return new SmPLCOneDeclImpl(node);
      }
      else if (type == PARAM) {
        return new SmPLCParamImpl(node);
      }
      else if (type == PARAM_SEQ) {
        return new SmPLCParamSeqImpl(node);
      }
      else if (type == PRAGMA) {
        return new SmPLCPragmaImpl(node);
      }
      else if (type == PRAGMA_ELLIPSIS) {
        return new SmPLCPragmaEllipsisImpl(node);
      }
      else if (type == SINGLE_DECL_FN_INIT) {
        return new SmPLCSingleDeclFnInitImpl(node);
      }
      else if (type == SINGLE_DECL_IDENTS) {
        return new SmPLCSingleDeclIdentsImpl(node);
      }
      else if (type == SINGLE_DECL_IDENTS_2) {
        return new SmPLCSingleDeclIdents2Impl(node);
      }
      else if (type == SINGLE_DECL_TYPEDEF) {
        return new SmPLCSingleDeclTypedefImpl(node);
      }
      else if (type == SINGLE_DECL_TYPEDEF_EXPR) {
        return new SmPLCSingleDeclTypedefExprImpl(node);
      }
      else if (type == SINGLE_DECL_VAR) {
        return new SmPLCSingleDeclVarImpl(node);
      }
      else if (type == SINGLE_ONE_DECL) {
        return new SmPLCSingleOneDeclImpl(node);
      }
      else if (type == SINGLE_ONE_DECL_IDENT) {
        return new SmPLCSingleOneDeclIdentImpl(node);
      }
      else if (type == SINGLE_ONE_DECL_IDENT_2) {
        return new SmPLCSingleOneDeclIdent2Impl(node);
      }
      else if (type == SINGLE_RULE_ELEM_STMT) {
        return new SmPLCSingleRuleElemStmtImpl(node);
      }
      else if (type == SINGLE_RULE_ELEM_STMT_BREAK) {
        return new SmPLCSingleRuleElemStmtBreakImpl(node);
      }
      else if (type == SINGLE_RULE_ELEM_STMT_CONTINUE) {
        return new SmPLCSingleRuleElemStmtContinueImpl(node);
      }
      else if (type == SINGLE_RULE_ELEM_STMT_RETURN) {
        return new SmPLCSingleRuleElemStmtReturnImpl(node);
      }
      else if (type == SINGLE_STMT) {
        return new SmPLCSingleStmtImpl(node);
      }
      else if (type == STMT) {
        return new SmPLCStmtImpl(node);
      }
      else if (type == STMT_BLOCK) {
        return new SmPLCStmtBlockImpl(node);
      }
      else if (type == STMT_BREAK) {
        return new SmPLCStmtBreakImpl(node);
      }
      else if (type == STMT_CONTINUE) {
        return new SmPLCStmtContinueImpl(node);
      }
      else if (type == STMT_DO) {
        return new SmPLCStmtDoImpl(node);
      }
      else if (type == STMT_FOR) {
        return new SmPLCStmtForImpl(node);
      }
      else if (type == STMT_GOTO) {
        return new SmPLCStmtGotoImpl(node);
      }
      else if (type == STMT_IF) {
        return new SmPLCStmtIfImpl(node);
      }
      else if (type == STMT_LABEL) {
        return new SmPLCStmtLabelImpl(node);
      }
      else if (type == STMT_META_ITER) {
        return new SmPLCStmtMetaIterImpl(node);
      }
      else if (type == STMT_NEST_DECL) {
        return new SmPLCStmtNestDeclImpl(node);
      }
      else if (type == STMT_NEST_EXPR) {
        return new SmPLCStmtNestExprImpl(node);
      }
      else if (type == STMT_RETURN) {
        return new SmPLCStmtReturnImpl(node);
      }
      else if (type == STMT_SEQ) {
        return new SmPLCStmtSeqImpl(node);
      }
      else if (type == STMT_SWITCH) {
        return new SmPLCStmtSwitchImpl(node);
      }
      else if (type == STMT_WHILE) {
        return new SmPLCStmtWhileImpl(node);
      }
      else if (type == STORAGE) {
        return new SmPLCStorageImpl(node);
      }
      else if (type == STRUCT_DECL) {
        return new SmPLCStructDeclImpl(node);
      }
      else if (type == STRUCT_DECL_FN) {
        return new SmPLCStructDeclFnImpl(node);
      }
      else if (type == STRUCT_DECL_LIST) {
        return new SmPLCStructDeclListImpl(node);
      }
      else if (type == STRUCT_DECL_REG) {
        return new SmPLCStructDeclRegImpl(node);
      }
      else if (type == TOP) {
        return new SmPLCTopImpl(node);
      }
      else if (type == TYPE) {
        return new SmPLCTypeImpl(node);
      }
      else if (type == TYPEDEF_IDENT) {
        return new SmPLCTypedefIdentImpl(node);
      }
      else if (type == UNARY_OP) {
        return new SmPLCUnaryOpImpl(node);
      }
      else if (type == UNDEF) {
        return new SmPLCUndefImpl(node);
      }
      else if (type == WHEN_ANY) {
        return new SmPLCWhenAnyImpl(node);
      }
      else if (type == WHEN_CODE) {
        return new SmPLCWhenCodeImpl(node);
      }
      else if (type == WHEN_COND) {
        return new SmPLCWhenCondImpl(node);
      }
      else if (type == WHEN_EQ) {
        return new SmPLCWhenEqImpl(node);
      }
      else if (type == WHEN_FALSE_NE) {
        return new SmPLCWhenFalseNeImpl(node);
      }
      else if (type == WHEN_NE) {
        return new SmPLCWhenNeImpl(node);
      }
      else if (type == WHEN_TRUE_NE) {
        return new SmPLCWhenTrueNeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
