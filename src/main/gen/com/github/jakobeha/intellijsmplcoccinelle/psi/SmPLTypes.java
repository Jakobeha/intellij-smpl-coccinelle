// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.jakobeha.intellijsmplcoccinelle.psi.impl.*;

public interface SmPLTypes {

  IElementType ASSIGNMENT_OPERATOR_METADECL = new SmPLElementType("ASSIGNMENT_OPERATOR_METADECL");
  IElementType ASSIGNOP = new SmPLElementType("ASSIGNOP");
  IElementType ASSIGNOPDECL = new SmPLElementType("ASSIGNOPDECL");
  IElementType ATTRIBUTE_METADECL = new SmPLElementType("ATTRIBUTE_METADECL");
  IElementType ATTRIBUTE_NAME_METADECL = new SmPLElementType("ATTRIBUTE_NAME_METADECL");
  IElementType BINARY_OPERATOR_METADECL = new SmPLElementType("BINARY_OPERATOR_METADECL");
  IElementType BINOP = new SmPLElementType("BINOP");
  IElementType BINOPDECL = new SmPLElementType("BINOPDECL");
  IElementType COCCI_HEADER = new SmPLElementType("COCCI_HEADER");
  IElementType CONSTANT_METADECL = new SmPLElementType("CONSTANT_METADECL");
  IElementType CONSTRAINT = new SmPLElementType("CONSTRAINT");
  IElementType CONSTRAINTS = new SmPLElementType("CONSTRAINTS");
  IElementType CTYPE_METADECL = new SmPLElementType("CTYPE_METADECL");
  IElementType C_INCLUDE_COCCI = new SmPLElementType("C_INCLUDE_COCCI");
  IElementType DECLARATION_METADECL = new SmPLElementType("DECLARATION_METADECL");
  IElementType DECLARER_METADECL = new SmPLElementType("DECLARER_METADECL");
  IElementType DECLARER_NAME_METADECL = new SmPLElementType("DECLARER_NAME_METADECL");
  IElementType DEP = new SmPLElementType("DEP");
  IElementType DEPENDS_ON_RULEATTR = new SmPLElementType("DEPENDS_ON_RULEATTR");
  IElementType DEP_ = new SmPLElementType("DEP_");
  IElementType DISABLE_RULEATTR = new SmPLElementType("DISABLE_RULEATTR");
  IElementType EXPRESSION_METADECL = new SmPLElementType("EXPRESSION_METADECL");
  IElementType FIELD_METADECL = new SmPLElementType("FIELD_METADECL");
  IElementType FORMAT_METADECL = new SmPLElementType("FORMAT_METADECL");
  IElementType FRESH_IDENTIFIER_METADECL = new SmPLElementType("FRESH_IDENTIFIER_METADECL");
  IElementType ID = new SmPLElementType("ID");
  IElementType IDENTIFIER_METADECL = new SmPLElementType("IDENTIFIER_METADECL");
  IElementType IDEXPRESSION_METADECL = new SmPLElementType("IDEXPRESSION_METADECL");
  IElementType IDS = new SmPLElementType("IDS");
  IElementType ID_COMPARE_CONSTRAINT = new SmPLElementType("ID_COMPARE_CONSTRAINT");
  IElementType INITIALIZER_METADECL = new SmPLElementType("INITIALIZER_METADECL");
  IElementType INTEGER = new SmPLElementType("INTEGER");
  IElementType INT_COMPARE_CONSTRAINT = new SmPLElementType("INT_COMPARE_CONSTRAINT");
  IElementType ITERATOR_METADECL = new SmPLElementType("ITERATOR_METADECL");
  IElementType ITERATOR_NAME_METADECL = new SmPLElementType("ITERATOR_NAME_METADECL");
  IElementType LIST_SIZE = new SmPLElementType("LIST_SIZE");
  IElementType METADECL = new SmPLElementType("METADECL");
  IElementType METAVARIABLES = new SmPLElementType("METAVARIABLES");
  IElementType METAVARIABLE_METADECL = new SmPLElementType("METAVARIABLE_METADECL");
  IElementType PARAMETER_METADECL = new SmPLElementType("PARAMETER_METADECL");
  IElementType PMID = new SmPLElementType("PMID");
  IElementType PMIDS = new SmPLElementType("PMIDS");
  IElementType PMIDS_WITH_CONSTRAINTS = new SmPLElementType("PMIDS_WITH_CONSTRAINTS");
  IElementType PMIDS_WITH_SEED = new SmPLElementType("PMIDS_WITH_SEED");
  IElementType POSITION_METADECL = new SmPLElementType("POSITION_METADECL");
  IElementType REGEXP_CONSTRAINT = new SmPLElementType("REGEXP_CONSTRAINT");
  IElementType RULENAME = new SmPLElementType("RULENAME");
  IElementType SCRIPT_BODY = new SmPLElementType("SCRIPT_BODY");
  IElementType SCRIPT_CODE = new SmPLElementType("SCRIPT_CODE");
  IElementType SCRIPT_CONSTRAINT = new SmPLElementType("SCRIPT_CONSTRAINT");
  IElementType SCRIPT_INLINE = new SmPLElementType("SCRIPT_INLINE");
  IElementType SCRIPT_LANG = new SmPLElementType("SCRIPT_LANG");
  IElementType SCRIPT_METADECL = new SmPLElementType("SCRIPT_METADECL");
  IElementType SCRIPT_METADECL_ASSIGN = new SmPLElementType("SCRIPT_METADECL_ASSIGN");
  IElementType SCRIPT_METADECL_ASSIGN_RULE = new SmPLElementType("SCRIPT_METADECL_ASSIGN_RULE");
  IElementType SCRIPT_METADECL_ASSIGN_VALUE = new SmPLElementType("SCRIPT_METADECL_ASSIGN_VALUE");
  IElementType SCRIPT_METAVARIABLES = new SmPLElementType("SCRIPT_METAVARIABLES");
  IElementType SEED = new SmPLElementType("SEED");
  IElementType STATEMENT_METADECL = new SmPLElementType("STATEMENT_METADECL");
  IElementType STRING_SEED = new SmPLElementType("STRING_SEED");
  IElementType SYMBOL_METADECL = new SmPLElementType("SYMBOL_METADECL");
  IElementType TRANSFORMATION = new SmPLElementType("TRANSFORMATION");
  IElementType TRANSFORMATION_BODY = new SmPLElementType("TRANSFORMATION_BODY");
  IElementType TYPEDEF_METADECL = new SmPLElementType("TYPEDEF_METADECL");
  IElementType TYPE_METADECL = new SmPLElementType("TYPE_METADECL");
  IElementType UNARY_OPERATOR_METADECL = new SmPLElementType("UNARY_OPERATOR_METADECL");
  IElementType UNOP = new SmPLElementType("UNOP");
  IElementType UNOPDECL = new SmPLElementType("UNOPDECL");
  IElementType USING_COCCI = new SmPLElementType("USING_COCCI");
  IElementType USING_RULEATTR = new SmPLElementType("USING_RULEATTR");
  IElementType USING_SYS_COCCI = new SmPLElementType("USING_SYS_COCCI");
  IElementType VID = new SmPLElementType("VID");
  IElementType VIRTUAL_COCCI = new SmPLElementType("VIRTUAL_COCCI");

  IElementType AND = new SmPLTokenType("&");
  IElementType ASSIGNMENT_OPERATOR = new SmPLTokenType("assignment operator");
  IElementType AT = new SmPLTokenType("@");
  IElementType ATTRIBUTE = new SmPLTokenType("attribute");
  IElementType ATTRIBUTE_NAME = new SmPLTokenType("attribute name");
  IElementType AT_FINALIZE_COLON = new SmPLTokenType("@finalize:");
  IElementType AT_INITIALIZE_COLON = new SmPLTokenType("@initialize:");
  IElementType AT_SCRIPT_COLON = new SmPLTokenType("@script:");
  IElementType BINARY_OPERATOR = new SmPLTokenType("binary operator");
  IElementType BLOCK_COMMENT = new SmPLTokenType("block_comment");
  IElementType COLON = new SmPLTokenType(":");
  IElementType COMMA = new SmPLTokenType(",");
  IElementType CONCAT = new SmPLTokenType("##");
  IElementType CONSTANT = new SmPLTokenType("constant");
  IElementType CTYPE = new SmPLTokenType("CTYPE");
  IElementType DECLARATION = new SmPLTokenType("declaration");
  IElementType DECLARER = new SmPLTokenType("declarer");
  IElementType DECLARER_NAME = new SmPLTokenType("declarer name");
  IElementType DEPENDS_ON = new SmPLTokenType("depends on");
  IElementType DIGITS = new SmPLTokenType("digits");
  IElementType DISABLE = new SmPLTokenType("disable");
  IElementType DOC_COMMENT = new SmPLTokenType("doc_comment");
  IElementType DOT = new SmPLTokenType(".");
  IElementType DOUBLE_AND = new SmPLTokenType("&&");
  IElementType DOUBLE_AT = new SmPLTokenType("@@");
  IElementType DOUBLE_OR = new SmPLTokenType("||");
  IElementType EQUALS = new SmPLTokenType("=");
  IElementType EVER = new SmPLTokenType("ever");
  IElementType EXISTS = new SmPLTokenType("exists");
  IElementType EXPR = new SmPLTokenType("EXPR");
  IElementType EXPRESSION = new SmPLTokenType("expression");
  IElementType EXPRESSION_ENUM = new SmPLTokenType("expression enum");
  IElementType EXPRESSION_LIST = new SmPLTokenType("expression list");
  IElementType EXPRESSION_STRUCT = new SmPLTokenType("expression struct");
  IElementType EXPRESSION_UNION = new SmPLTokenType("expression union");
  IElementType EXTENDS = new SmPLTokenType("extends");
  IElementType FIELD = new SmPLTokenType("field");
  IElementType FIELD_LIST = new SmPLTokenType("field list");
  IElementType FILE_IN = new SmPLTokenType("file in");
  IElementType FORALL = new SmPLTokenType("forall");
  IElementType FORMAT = new SmPLTokenType("format");
  IElementType FORMAT_LIST = new SmPLTokenType("format list");
  IElementType FRESH_IDENTIFIER = new SmPLTokenType("fresh identifier");
  IElementType GLOBAL_IDEXPRESSION = new SmPLTokenType("global idexpression");
  IElementType HASH_INCLUDE = new SmPLTokenType("#include");
  IElementType IDENTIFIER = new SmPLTokenType("identifier");
  IElementType IDENTIFIER_LIST = new SmPLTokenType("identifier list");
  IElementType IDEXPRESSION = new SmPLTokenType("idexpression");
  IElementType INITIALIZER = new SmPLTokenType("initializer");
  IElementType INITIALIZER_LIST = new SmPLTokenType("initializer list");
  IElementType ITERATOR = new SmPLTokenType("iterator");
  IElementType ITERATOR_NAME = new SmPLTokenType("iterator name");
  IElementType LBRACE = new SmPLTokenType("{");
  IElementType LBRACK = new SmPLTokenType("[");
  IElementType LEFT_LEFT = new SmPLTokenType("<<");
  IElementType LINE_COMMENT = new SmPLTokenType("line_comment");
  IElementType LOCAL_IDEXPRESSION = new SmPLTokenType("local idexpression");
  IElementType LPAREN = new SmPLTokenType("(");
  IElementType METAVARIABLE = new SmPLTokenType("metavariable");
  IElementType NEVER = new SmPLTokenType("never");
  IElementType NOT = new SmPLTokenType("!");
  IElementType NOT_EQUALS = new SmPLTokenType("!=");
  IElementType OCAML = new SmPLTokenType("ocaml");
  IElementType OCAML_BLOCK = new SmPLTokenType("OCAML_BLOCK");
  IElementType OR = new SmPLTokenType("|");
  IElementType PARAMETER = new SmPLTokenType("parameter");
  IElementType PARAMETER_LIST = new SmPLTokenType("parameter list");
  IElementType POSITION = new SmPLTokenType("position");
  IElementType POSITION_ANY = new SmPLTokenType("position any");
  IElementType PYTHON = new SmPLTokenType("python");
  IElementType PYTHON_BLOCK = new SmPLTokenType("PYTHON_BLOCK");
  IElementType RBRACE = new SmPLTokenType("}");
  IElementType RBRACK = new SmPLTokenType("]");
  IElementType REGEXP_MATCHES = new SmPLTokenType("=~");
  IElementType REGEXP_NOT_MATCHES = new SmPLTokenType("!~");
  IElementType RPAREN = new SmPLTokenType(")");
  IElementType SCRIPT_COLON = new SmPLTokenType("script:");
  IElementType SEMI = new SmPLTokenType(";");
  IElementType STAR = new SmPLTokenType("*");
  IElementType STATEMENT = new SmPLTokenType("statement");
  IElementType STATEMENT_LIST = new SmPLTokenType("statement list");
  IElementType STRING = new SmPLTokenType("string");
  IElementType SYMBOL = new SmPLTokenType("symbol");
  IElementType SYSPATH = new SmPLTokenType("syspath");
  IElementType TRANSFORMATION_BLOCK = new SmPLTokenType("TRANSFORMATION_BLOCK");
  IElementType TYPE = new SmPLTokenType("type");
  IElementType TYPEDEF = new SmPLTokenType("typedef");
  IElementType UNARY_OPERATOR = new SmPLTokenType("unary operator");
  IElementType USING = new SmPLTokenType("USING");
  IElementType USING_INCLUDE = new SmPLTokenType("using");
  IElementType VIRTUAL = new SmPLTokenType("VIRTUAL");
  IElementType VIRTUAL_INCLUDE = new SmPLTokenType("virtual");
  IElementType WORD = new SmPLTokenType("word");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT_OPERATOR_METADECL) {
        return new SmPLAssignmentOperatorMetadeclImpl(node);
      }
      else if (type == ASSIGNOP) {
        return new SmPLAssignopImpl(node);
      }
      else if (type == ASSIGNOPDECL) {
        return new SmPLAssignopdeclImpl(node);
      }
      else if (type == ATTRIBUTE_METADECL) {
        return new SmPLAttributeMetadeclImpl(node);
      }
      else if (type == ATTRIBUTE_NAME_METADECL) {
        return new SmPLAttributeNameMetadeclImpl(node);
      }
      else if (type == BINARY_OPERATOR_METADECL) {
        return new SmPLBinaryOperatorMetadeclImpl(node);
      }
      else if (type == BINOP) {
        return new SmPLBinopImpl(node);
      }
      else if (type == BINOPDECL) {
        return new SmPLBinopdeclImpl(node);
      }
      else if (type == COCCI_HEADER) {
        return new SmPLCocciHeaderImpl(node);
      }
      else if (type == CONSTANT_METADECL) {
        return new SmPLConstantMetadeclImpl(node);
      }
      else if (type == CONSTRAINT) {
        return new SmPLConstraintImpl(node);
      }
      else if (type == CONSTRAINTS) {
        return new SmPLConstraintsImpl(node);
      }
      else if (type == CTYPE_METADECL) {
        return new SmPLCtypeMetadeclImpl(node);
      }
      else if (type == C_INCLUDE_COCCI) {
        return new SmPLCIncludeCocciImpl(node);
      }
      else if (type == DECLARATION_METADECL) {
        return new SmPLDeclarationMetadeclImpl(node);
      }
      else if (type == DECLARER_METADECL) {
        return new SmPLDeclarerMetadeclImpl(node);
      }
      else if (type == DECLARER_NAME_METADECL) {
        return new SmPLDeclarerNameMetadeclImpl(node);
      }
      else if (type == DEP) {
        return new SmPLDepImpl(node);
      }
      else if (type == DEPENDS_ON_RULEATTR) {
        return new SmPLDependsOnRuleattrImpl(node);
      }
      else if (type == DEP_) {
        return new SmPLDep_Impl(node);
      }
      else if (type == DISABLE_RULEATTR) {
        return new SmPLDisableRuleattrImpl(node);
      }
      else if (type == EXPRESSION_METADECL) {
        return new SmPLExpressionMetadeclImpl(node);
      }
      else if (type == FIELD_METADECL) {
        return new SmPLFieldMetadeclImpl(node);
      }
      else if (type == FORMAT_METADECL) {
        return new SmPLFormatMetadeclImpl(node);
      }
      else if (type == FRESH_IDENTIFIER_METADECL) {
        return new SmPLFreshIdentifierMetadeclImpl(node);
      }
      else if (type == ID) {
        return new SmPLIdImpl(node);
      }
      else if (type == IDENTIFIER_METADECL) {
        return new SmPLIdentifierMetadeclImpl(node);
      }
      else if (type == IDEXPRESSION_METADECL) {
        return new SmPLIdexpressionMetadeclImpl(node);
      }
      else if (type == IDS) {
        return new SmPLIdsImpl(node);
      }
      else if (type == ID_COMPARE_CONSTRAINT) {
        return new SmPLIdCompareConstraintImpl(node);
      }
      else if (type == INITIALIZER_METADECL) {
        return new SmPLInitializerMetadeclImpl(node);
      }
      else if (type == INTEGER) {
        return new SmPLIntegerImpl(node);
      }
      else if (type == INT_COMPARE_CONSTRAINT) {
        return new SmPLIntCompareConstraintImpl(node);
      }
      else if (type == ITERATOR_METADECL) {
        return new SmPLIteratorMetadeclImpl(node);
      }
      else if (type == ITERATOR_NAME_METADECL) {
        return new SmPLIteratorNameMetadeclImpl(node);
      }
      else if (type == LIST_SIZE) {
        return new SmPLListSizeImpl(node);
      }
      else if (type == METADECL) {
        return new SmPLMetadeclImpl(node);
      }
      else if (type == METAVARIABLES) {
        return new SmPLMetavariablesImpl(node);
      }
      else if (type == METAVARIABLE_METADECL) {
        return new SmPLMetavariableMetadeclImpl(node);
      }
      else if (type == PARAMETER_METADECL) {
        return new SmPLParameterMetadeclImpl(node);
      }
      else if (type == PMID) {
        return new SmPLPmidImpl(node);
      }
      else if (type == PMIDS) {
        return new SmPLPmidsImpl(node);
      }
      else if (type == PMIDS_WITH_CONSTRAINTS) {
        return new SmPLPmidsWithConstraintsImpl(node);
      }
      else if (type == PMIDS_WITH_SEED) {
        return new SmPLPmidsWithSeedImpl(node);
      }
      else if (type == POSITION_METADECL) {
        return new SmPLPositionMetadeclImpl(node);
      }
      else if (type == REGEXP_CONSTRAINT) {
        return new SmPLRegexpConstraintImpl(node);
      }
      else if (type == RULENAME) {
        return new SmPLRulenameImpl(node);
      }
      else if (type == SCRIPT_BODY) {
        return new SmPLScriptBodyImpl(node);
      }
      else if (type == SCRIPT_CODE) {
        return new SmPLScriptCodeImpl(node);
      }
      else if (type == SCRIPT_CONSTRAINT) {
        return new SmPLScriptConstraintImpl(node);
      }
      else if (type == SCRIPT_INLINE) {
        return new SmPLScriptInlineImpl(node);
      }
      else if (type == SCRIPT_LANG) {
        return new SmPLScriptLangImpl(node);
      }
      else if (type == SCRIPT_METADECL) {
        return new SmPLScriptMetadeclImpl(node);
      }
      else if (type == SCRIPT_METADECL_ASSIGN) {
        return new SmPLScriptMetadeclAssignImpl(node);
      }
      else if (type == SCRIPT_METADECL_ASSIGN_RULE) {
        return new SmPLScriptMetadeclAssignRuleImpl(node);
      }
      else if (type == SCRIPT_METADECL_ASSIGN_VALUE) {
        return new SmPLScriptMetadeclAssignValueImpl(node);
      }
      else if (type == SCRIPT_METAVARIABLES) {
        return new SmPLScriptMetavariablesImpl(node);
      }
      else if (type == SEED) {
        return new SmPLSeedImpl(node);
      }
      else if (type == STATEMENT_METADECL) {
        return new SmPLStatementMetadeclImpl(node);
      }
      else if (type == STRING_SEED) {
        return new SmPLStringSeedImpl(node);
      }
      else if (type == SYMBOL_METADECL) {
        return new SmPLSymbolMetadeclImpl(node);
      }
      else if (type == TRANSFORMATION) {
        return new SmPLTransformationImpl(node);
      }
      else if (type == TRANSFORMATION_BODY) {
        return new SmPLTransformationBodyImpl(node);
      }
      else if (type == TYPEDEF_METADECL) {
        return new SmPLTypedefMetadeclImpl(node);
      }
      else if (type == TYPE_METADECL) {
        return new SmPLTypeMetadeclImpl(node);
      }
      else if (type == UNARY_OPERATOR_METADECL) {
        return new SmPLUnaryOperatorMetadeclImpl(node);
      }
      else if (type == UNOP) {
        return new SmPLUnopImpl(node);
      }
      else if (type == UNOPDECL) {
        return new SmPLUnopdeclImpl(node);
      }
      else if (type == USING_COCCI) {
        return new SmPLUsingCocciImpl(node);
      }
      else if (type == USING_RULEATTR) {
        return new SmPLUsingRuleattrImpl(node);
      }
      else if (type == USING_SYS_COCCI) {
        return new SmPLUsingSysCocciImpl(node);
      }
      else if (type == VID) {
        return new SmPLVidImpl(node);
      }
      else if (type == VIRTUAL_COCCI) {
        return new SmPLVirtualCocciImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
