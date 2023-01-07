// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes.*;
import static com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SmPLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ASSIGNMENT_OPERATOR_METADECL, ATTRIBUTE_METADECL, ATTRIBUTE_NAME_METADECL, BINARY_OPERATOR_METADECL,
      CONSTANT_METADECL, CTYPE_METADECL, DECLARATION_METADECL, DECLARER_METADECL,
      DECLARER_NAME_METADECL, EXPRESSION_METADECL, FIELD_METADECL, FORMAT_METADECL,
      FRESH_IDENTIFIER_METADECL, IDENTIFIER_METADECL, IDEXPRESSION_METADECL, INITIALIZER_METADECL,
      ITERATOR_METADECL, ITERATOR_NAME_METADECL, METADECL, METAVARIABLE_METADECL,
      PARAMETER_METADECL, POSITION_METADECL, SCRIPT_METADECL, STATEMENT_METADECL,
      SYMBOL_METADECL, TYPEDEF_METADECL, TYPE_METADECL, UNARY_OPERATOR_METADECL),
  };

  /* ********************************************************** */
  // 'assignment operator' <<commaSeparate assignopdecl>>
  public static boolean assignment_operator_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", ASSIGNMENT_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR_METADECL, "<metadecl>");
    r = consumeToken(b, ASSIGNMENT_OPERATOR);
    p = r; // pin = 1
    r = r && commaSeparate(b, l + 1, SmPLParser::assignopdecl);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '=' | '-=' | '+=' | '*=' | '/=' | '%=' | '<<=' | '>>=' | '&=' | '^=' | '|='
  public static boolean assignop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNOP, "<assignop>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, "-=");
    if (!r) r = consumeToken(b, "+=");
    if (!r) r = consumeToken(b, "*=");
    if (!r) r = consumeToken(b, "/=");
    if (!r) r = consumeToken(b, "%=");
    if (!r) r = consumeToken(b, "<<=");
    if (!r) r = consumeToken(b, ">>=");
    if (!r) r = consumeToken(b, "&=");
    if (!r) r = consumeToken(b, "^=");
    if (!r) r = consumeToken(b, "|=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // assignop | '{' <<commaSeparate assignop>> '}'
  static boolean assignop_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignop_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignop(b, l + 1);
    if (!r) r = assignop_constraint_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<commaSeparate assignop>> '}'
  private static boolean assignop_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignop_constraint_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, commaSeparate(b, l + 1, SmPLParser::assignop));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // pmid ['=' assignop_constraint]
  public static boolean assignopdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignopdecl")) return false;
    if (!nextTokenIs(b, "<assignopdecl>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNOPDECL, "<assignopdecl>");
    r = pmid(b, l + 1);
    r = r && assignopdecl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['=' assignop_constraint]
  private static boolean assignopdecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignopdecl_1")) return false;
    assignopdecl_1_0(b, l + 1);
    return true;
  }

  // '=' assignop_constraint
  private static boolean assignopdecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignopdecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && assignop_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'attribute' ids
  public static boolean attribute_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", ATTRIBUTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_METADECL, "<metadecl>");
    r = consumeToken(b, ATTRIBUTE);
    p = r; // pin = 1
    r = r && ids(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'attribute name' ids
  public static boolean attribute_name_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", ATTRIBUTE_NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_NAME_METADECL, "<metadecl>");
    r = consumeToken(b, ATTRIBUTE_NAME);
    p = r; // pin = 1
    r = r && ids(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'binary operator' <<commaSeparate binopdecl>>
  public static boolean binary_operator_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_operator_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", BINARY_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OPERATOR_METADECL, "<metadecl>");
    r = consumeToken(b, BINARY_OPERATOR);
    p = r; // pin = 1
    r = r && commaSeparate(b, l + 1, SmPLParser::binopdecl);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '+' | '-' | '*' | '/' | '%' | '<<' | '>>' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '&' | '^' | '|' | '&&' | '||'
  public static boolean binop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINOP, "<binop>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, LEFT_LEFT);
    if (!r) r = consumeToken(b, ">>");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, NOT_EQUALS);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, "^");
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, DOUBLE_AND);
    if (!r) r = consumeToken(b, DOUBLE_OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // binop | '{' <<commaSeparate binop>> '}'
  static boolean binop_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binop_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binop(b, l + 1);
    if (!r) r = binop_constraint_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<commaSeparate binop>> '}'
  private static boolean binop_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binop_constraint_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, commaSeparate(b, l + 1, SmPLParser::binop));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // pmid  ['=' binop_constraint]
  public static boolean binopdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binopdecl")) return false;
    if (!nextTokenIs(b, "<binopdecl>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINOPDECL, "<binopdecl>");
    r = pmid(b, l + 1);
    r = r && binopdecl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['=' binop_constraint]
  private static boolean binopdecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binopdecl_1")) return false;
    binopdecl_1_0(b, l + 1);
    return true;
  }

  // '=' binop_constraint
  private static boolean binopdecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binopdecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && binop_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '#include' string
  public static boolean c_include_cocci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "c_include_cocci")) return false;
    if (!nextTokenIs(b, HASH_INCLUDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, C_INCLUDE_COCCI, null);
    r = consumeTokens(b, 1, HASH_INCLUDE, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // script_code |
  //     transformation
  static boolean changeset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "changeset")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = script_code(b, l + 1);
    if (!r) r = transformation(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLParser::changeset_recover);
    return r;
  }

  /* ********************************************************** */
  // !('@' | '@@')
  static boolean changeset_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "changeset_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !changeset_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@' | '@@'
  private static boolean changeset_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "changeset_recover_0")) return false;
    boolean r;
    r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, DOUBLE_AT);
    return r;
  }

  /* ********************************************************** */
  // include_cocci | virtual_cocci
  public static boolean cocci_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cocci_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COCCI_HEADER, "<cocci header>");
    r = include_cocci(b, l + 1);
    if (!r) r = virtual_cocci(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLParser::cocci_header_recover);
    return r;
  }

  /* ********************************************************** */
  // !('@' | '@@' | '#include' | 'using' | 'virtual')
  static boolean cocci_header_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cocci_header_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !cocci_header_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@' | '@@' | '#include' | 'using' | 'virtual'
  private static boolean cocci_header_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cocci_header_recover_0")) return false;
    boolean r;
    r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, DOUBLE_AT);
    if (!r) r = consumeToken(b, HASH_INCLUDE);
    if (!r) r = consumeToken(b, USING);
    if (!r) r = consumeToken(b, VIRTUAL);
    return r;
  }

  /* ********************************************************** */
  // <<p>> (',' <<p>>)*
  static boolean commaSeparate(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "commaSeparate")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = _p.parse(b, l);
    p = r; // pin = 1
    r = r && commaSeparate_1(b, l + 1, _p);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (',' <<p>>)*
  private static boolean commaSeparate_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "commaSeparate_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!commaSeparate_1_0(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "commaSeparate_1", c)) break;
    }
    return true;
  }

  // ',' <<p>>
  private static boolean commaSeparate_1_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "commaSeparate_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'constant' [ctype_or_types] pmids_with_constraints
  public static boolean constant_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", CONSTANT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_METADECL, "<metadecl>");
    r = consumeToken(b, CONSTANT);
    p = r; // pin = 1
    r = r && report_error_(b, constant_metadecl_1(b, l + 1));
    r = p && pmids_with_constraints(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [ctype_or_types]
  private static boolean constant_metadecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_metadecl_1")) return false;
    ctype_or_types(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id_compare_constraint |
  //     int_compare_constraint |
  //     regexp_constraint |
  //     script_constraint
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, "<constraint>");
    r = id_compare_constraint(b, l + 1);
    if (!r) r = int_compare_constraint(b, l + 1);
    if (!r) r = regexp_constraint(b, l + 1);
    if (!r) r = script_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constraint ('&&' constraint)*
  public static boolean constraints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraints")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINTS, "<constraints>");
    r = constraint(b, l + 1);
    r = r && constraints_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('&&' constraint)*
  private static boolean constraints_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraints_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constraints_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constraints_1", c)) break;
    }
    return true;
  }

  // '&&' constraint
  private static boolean constraints_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraints_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_AND);
    r = r && constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ctype_or_types ['[' ']'] pmids_with_constraints
  public static boolean ctype_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", CTYPE, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CTYPE_METADECL, "<metadecl>");
    r = ctype_or_types(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, ctype_metadecl_1(b, l + 1));
    r = p && pmids_with_constraints(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ['[' ']']
  private static boolean ctype_metadecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_metadecl_1")) return false;
    parseTokens(b, 0, LBRACK, RBRACK);
    return true;
  }

  /* ********************************************************** */
  // ctype | '{' <<commaSeparate ctype>> '}' '*'*
  static boolean ctype_or_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_or_types")) return false;
    if (!nextTokenIs(b, "", CTYPE, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CTYPE);
    if (!r) r = ctype_or_types_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<commaSeparate ctype>> '}' '*'*
  private static boolean ctype_or_types_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_or_types_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, commaSeparate(b, l + 1, CTYPE_parser_));
    r = p && report_error_(b, consumeToken(b, RBRACE)) && r;
    r = p && ctype_or_types_1_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '*'*
  private static boolean ctype_or_types_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_or_types_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "ctype_or_types_1_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'declaration' pmids_with_constraints
  public static boolean declaration_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", DECLARATION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_METADECL, "<metadecl>");
    r = consumeToken(b, DECLARATION);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'declarer' pmids_with_constraints
  public static boolean declarer_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarer_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", DECLARER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECLARER_METADECL, "<metadecl>");
    r = consumeToken(b, DECLARER);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'declarer name' ids
  public static boolean declarer_name_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarer_name_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", DECLARER_NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECLARER_NAME_METADECL, "<metadecl>");
    r = consumeToken(b, DECLARER_NAME);
    p = r; // pin = 1
    r = r && ids(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // dep_ '&&' dep |
  //     dep_ '||' dep |
  //     dep_
  public static boolean dep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEP, "<dep>");
    r = dep_0(b, l + 1);
    if (!r) r = dep_1(b, l + 1);
    if (!r) r = dep_(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // dep_ '&&' dep
  private static boolean dep_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = dep_(b, l + 1);
    r = r && consumeToken(b, DOUBLE_AND);
    p = r; // pin = 2
    r = r && dep(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // dep_ '||' dep
  private static boolean dep_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = dep_(b, l + 1);
    r = r && consumeToken(b, DOUBLE_OR);
    p = r; // pin = 2
    r = r && dep(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // id |
  //     '!' id |
  //     '!(' dep ')' |
  //     'ever' id |
  //     'never' id |
  //     'file' 'in' string |
  //     '(' dep ')'
  public static boolean dep_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEP_, "<dep>");
    r = id(b, l + 1);
    if (!r) r = dep__1(b, l + 1);
    if (!r) r = dep__2(b, l + 1);
    if (!r) r = dep__3(b, l + 1);
    if (!r) r = dep__4(b, l + 1);
    if (!r) r = dep__5(b, l + 1);
    if (!r) r = dep__6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '!' id
  private static boolean dep__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep__1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NOT);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '!(' dep ')'
  private static boolean dep__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep__2")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "!(");
    p = r; // pin = 1
    r = r && report_error_(b, dep(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'ever' id
  private static boolean dep__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep__3")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EVER);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'never' id
  private static boolean dep__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep__4")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NEVER);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'file' 'in' string
  private static boolean dep__5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep__5")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "file");
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, "in"));
    r = p && consumeToken(b, STRING) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '(' dep ')'
  private static boolean dep__6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dep__6")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, dep(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'depends on' [exists] dep
  public static boolean depends_on_ruleattr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "depends_on_ruleattr")) return false;
    if (!nextTokenIs(b, DEPENDS_ON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEPENDS_ON_RULEATTR, null);
    r = consumeToken(b, DEPENDS_ON);
    p = r; // pin = 1
    r = r && report_error_(b, depends_on_ruleattr_1(b, l + 1));
    r = p && dep(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [exists]
  private static boolean depends_on_ruleattr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "depends_on_ruleattr_1")) return false;
    exists(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'disable' <<commaSeparate id>>
  public static boolean disable_ruleattr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disable_ruleattr")) return false;
    if (!nextTokenIs(b, DISABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DISABLE_RULEATTR, null);
    r = consumeToken(b, DISABLE);
    p = r; // pin = 1
    r = r && commaSeparate(b, l + 1, SmPLParser::id);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'exists' |
  //     'forall'
  static boolean exists(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exists")) return false;
    if (!nextTokenIs(b, "", EXISTS, FORALL)) return false;
    boolean r;
    r = consumeToken(b, EXISTS);
    if (!r) r = consumeToken(b, FORALL);
    return r;
  }

  /* ********************************************************** */
  // ('expression' | 'expression list' [list_size] | ('expression enum' | 'expression struct' | 'expression union') '*'*) pmids_with_constraints
  public static boolean expression_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_metadecl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_METADECL, "<metadecl>");
    r = expression_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'expression' | 'expression list' [list_size] | ('expression enum' | 'expression struct' | 'expression union') '*'*
  private static boolean expression_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_metadecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPRESSION);
    if (!r) r = expression_metadecl_0_1(b, l + 1);
    if (!r) r = expression_metadecl_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'expression list' [list_size]
  private static boolean expression_metadecl_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_metadecl_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPRESSION_LIST);
    r = r && expression_metadecl_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [list_size]
  private static boolean expression_metadecl_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_metadecl_0_1_1")) return false;
    list_size(b, l + 1);
    return true;
  }

  // ('expression enum' | 'expression struct' | 'expression union') '*'*
  private static boolean expression_metadecl_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_metadecl_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_metadecl_0_2_0(b, l + 1);
    r = r && expression_metadecl_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'expression enum' | 'expression struct' | 'expression union'
  private static boolean expression_metadecl_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_metadecl_0_2_0")) return false;
    boolean r;
    r = consumeToken(b, EXPRESSION_ENUM);
    if (!r) r = consumeToken(b, EXPRESSION_STRUCT);
    if (!r) r = consumeToken(b, EXPRESSION_UNION);
    return r;
  }

  // '*'*
  private static boolean expression_metadecl_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_metadecl_0_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "expression_metadecl_0_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ('field' | 'field list' [list_size])  pmids_with_constraints
  public static boolean field_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", FIELD, FIELD_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FIELD_METADECL, "<metadecl>");
    r = field_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'field' | 'field list' [list_size]
  private static boolean field_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_metadecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FIELD);
    if (!r) r = field_metadecl_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'field list' [list_size]
  private static boolean field_metadecl_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_metadecl_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FIELD_LIST);
    r = r && field_metadecl_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [list_size]
  private static boolean field_metadecl_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_metadecl_0_1_1")) return false;
    list_size(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('format' | 'format list' [list_size]) pmids_with_constraints
  public static boolean format_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "format_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", FORMAT, FORMAT_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FORMAT_METADECL, "<metadecl>");
    r = format_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'format' | 'format list' [list_size]
  private static boolean format_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "format_metadecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FORMAT);
    if (!r) r = format_metadecl_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'format list' [list_size]
  private static boolean format_metadecl_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "format_metadecl_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FORMAT_LIST);
    r = r && format_metadecl_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [list_size]
  private static boolean format_metadecl_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "format_metadecl_0_1_1")) return false;
    list_size(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'fresh identifier' pmids_with_seed
  public static boolean fresh_identifier_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fresh_identifier_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", FRESH_IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FRESH_IDENTIFIER_METADECL, "<metadecl>");
    r = consumeToken(b, FRESH_IDENTIFIER);
    p = r; // pin = 1
    r = r && pmids_with_seed(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // word |
  //     '(' id ')' |
  //     '(' id ('|' id)+ ')' |
  //     '(' id ('&' id)+ ')'
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, "<id>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID, "<id>");
    r = consumeToken(b, WORD);
    if (!r) r = id_1(b, l + 1);
    if (!r) r = id_2(b, l + 1);
    if (!r) r = id_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' id ')'
  private static boolean id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' id ('|' id)+ ')'
  private static boolean id_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && id(b, l + 1);
    r = r && id_2_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('|' id)+
  private static boolean id_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_2_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!id_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "id_2_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '|' id
  private static boolean id_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' id ('&' id)+ ')'
  private static boolean id_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && id(b, l + 1);
    r = r && id_3_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('&' id)+
  private static boolean id_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_3_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_3_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!id_3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "id_3_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '&' id
  private static boolean id_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('=' | '!=') (pmid | '{' <<commaSeparate pmid>> '}')
  public static boolean id_compare_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_compare_constraint")) return false;
    if (!nextTokenIs(b, "<id compare constraint>", EQUALS, NOT_EQUALS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_COMPARE_CONSTRAINT, "<id compare constraint>");
    r = id_compare_constraint_0(b, l + 1);
    r = r && id_compare_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '=' | '!='
  private static boolean id_compare_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_compare_constraint_0")) return false;
    boolean r;
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    return r;
  }

  // pmid | '{' <<commaSeparate pmid>> '}'
  private static boolean id_compare_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_compare_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pmid(b, l + 1);
    if (!r) r = id_compare_constraint_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<commaSeparate pmid>> '}'
  private static boolean id_compare_constraint_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_compare_constraint_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && commaSeparate(b, l + 1, SmPLParser::pmid);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('identifier' | 'identifier list') pmids_with_constraints
  public static boolean identifier_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", IDENTIFIER, IDENTIFIER_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_METADECL, "<metadecl>");
    r = identifier_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'identifier' | 'identifier list'
  private static boolean identifier_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_metadecl_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, IDENTIFIER_LIST);
    return r;
  }

  /* ********************************************************** */
  // ('local idexpression' | 'global idexpression' | 'idexpression') [ctype_or_types | '*'+] pmids_with_constraints
  public static boolean idexpression_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idexpression_metadecl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IDEXPRESSION_METADECL, "<metadecl>");
    r = idexpression_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, idexpression_metadecl_1(b, l + 1));
    r = p && pmids_with_constraints(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'local idexpression' | 'global idexpression' | 'idexpression'
  private static boolean idexpression_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idexpression_metadecl_0")) return false;
    boolean r;
    r = consumeToken(b, LOCAL_IDEXPRESSION);
    if (!r) r = consumeToken(b, GLOBAL_IDEXPRESSION);
    if (!r) r = consumeToken(b, IDEXPRESSION);
    return r;
  }

  // [ctype_or_types | '*'+]
  private static boolean idexpression_metadecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idexpression_metadecl_1")) return false;
    idexpression_metadecl_1_0(b, l + 1);
    return true;
  }

  // ctype_or_types | '*'+
  private static boolean idexpression_metadecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idexpression_metadecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ctype_or_types(b, l + 1);
    if (!r) r = idexpression_metadecl_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*'+
  private static boolean idexpression_metadecl_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idexpression_metadecl_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STAR);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "idexpression_metadecl_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<commaSeparate id>>
  public static boolean ids(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ids")) return false;
    if (!nextTokenIs(b, "<ids>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDS, "<ids>");
    r = commaSeparate(b, l + 1, SmPLParser::id);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // c_include_cocci |
  //     using_cocci |
  //     using_sys_cocci
  static boolean include_cocci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_cocci")) return false;
    if (!nextTokenIs(b, "", HASH_INCLUDE, USING)) return false;
    boolean r;
    r = c_include_cocci(b, l + 1);
    if (!r) r = using_cocci(b, l + 1);
    if (!r) r = using_sys_cocci(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ('initializer' | 'initializer list' [list_size]) pmids_with_constraints
  public static boolean initializer_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", INITIALIZER, INITIALIZER_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZER_METADECL, "<metadecl>");
    r = initializer_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'initializer' | 'initializer list' [list_size]
  private static boolean initializer_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_metadecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INITIALIZER);
    if (!r) r = initializer_metadecl_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'initializer list' [list_size]
  private static boolean initializer_metadecl_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_metadecl_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INITIALIZER_LIST);
    r = r && initializer_metadecl_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [list_size]
  private static boolean initializer_metadecl_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_metadecl_0_1_1")) return false;
    list_size(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('=' | '!=') (INTEGER | '{' <<commaSeparate INTEGER>> '}')
  public static boolean int_compare_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_compare_constraint")) return false;
    if (!nextTokenIs(b, "<int compare constraint>", EQUALS, NOT_EQUALS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INT_COMPARE_CONSTRAINT, "<int compare constraint>");
    r = int_compare_constraint_0(b, l + 1);
    r = r && int_compare_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '=' | '!='
  private static boolean int_compare_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_compare_constraint_0")) return false;
    boolean r;
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    return r;
  }

  // INTEGER | '{' <<commaSeparate INTEGER>> '}'
  private static boolean int_compare_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_compare_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER);
    if (!r) r = int_compare_constraint_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<commaSeparate INTEGER>> '}'
  private static boolean int_compare_constraint_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_compare_constraint_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && commaSeparate(b, l + 1, INTEGER_parser_);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // digits | '-' digits
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER, "<integer>");
    r = consumeToken(b, DIGITS);
    if (!r) r = integer_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '-' digits
  private static boolean integer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "-");
    r = r && consumeToken(b, DIGITS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'iterator' pmids_with_constraints
  public static boolean iterator_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iterator_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", ITERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ITERATOR_METADECL, "<metadecl>");
    r = consumeToken(b, ITERATOR);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'iterator name' ids
  public static boolean iterator_name_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iterator_name_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", ITERATOR_NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ITERATOR_NAME_METADECL, "<metadecl>");
    r = consumeToken(b, ITERATOR_NAME);
    p = r; // pin = 1
    r = r && ids(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'python' | 'ocaml'
  static boolean language(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "language")) return false;
    boolean r;
    r = consumeToken(b, "python");
    if (!r) r = consumeToken(b, "ocaml");
    return r;
  }

  /* ********************************************************** */
  // '[' (id | integer) ']'
  public static boolean list_size(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_size")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_SIZE, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, list_size_1(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // id | integer
  private static boolean list_size_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_size_1")) return false;
    boolean r;
    r = id(b, l + 1);
    if (!r) r = integer(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // metadecl_ ';'
  public static boolean metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, METADECL, "<metadecl>");
    r = metadecl_(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // fresh_identifier_metadecl |
  //     metavariable_metadecl |
  //     identifier_metadecl |
  //     field_metadecl |
  //     parameter_metadecl |
  //     type_metadecl |
  //     statement_metadecl |
  //     declaration_metadecl |
  //     initializer_metadecl |
  //     idexpression_metadecl |
  //     expression_metadecl |
  //     ctype_metadecl |
  //     constant_metadecl |
  //     format_metadecl |
  //     assignment_operator_metadecl |
  //     binary_operator_metadecl |
  //     unary_operator_metadecl |
  //     position_metadecl |
  //     symbol_metadecl |
  //     typedef_metadecl |
  //     attribute_name_metadecl |
  //     attribute_metadecl |
  //     declarer_name_metadecl |
  //     declarer_metadecl |
  //     iterator_name_metadecl |
  //     iterator_metadecl
  static boolean metadecl_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadecl_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = fresh_identifier_metadecl(b, l + 1);
    if (!r) r = metavariable_metadecl(b, l + 1);
    if (!r) r = identifier_metadecl(b, l + 1);
    if (!r) r = field_metadecl(b, l + 1);
    if (!r) r = parameter_metadecl(b, l + 1);
    if (!r) r = type_metadecl(b, l + 1);
    if (!r) r = statement_metadecl(b, l + 1);
    if (!r) r = declaration_metadecl(b, l + 1);
    if (!r) r = initializer_metadecl(b, l + 1);
    if (!r) r = idexpression_metadecl(b, l + 1);
    if (!r) r = expression_metadecl(b, l + 1);
    if (!r) r = ctype_metadecl(b, l + 1);
    if (!r) r = constant_metadecl(b, l + 1);
    if (!r) r = format_metadecl(b, l + 1);
    if (!r) r = assignment_operator_metadecl(b, l + 1);
    if (!r) r = binary_operator_metadecl(b, l + 1);
    if (!r) r = unary_operator_metadecl(b, l + 1);
    if (!r) r = position_metadecl(b, l + 1);
    if (!r) r = symbol_metadecl(b, l + 1);
    if (!r) r = typedef_metadecl(b, l + 1);
    if (!r) r = attribute_name_metadecl(b, l + 1);
    if (!r) r = attribute_metadecl(b, l + 1);
    if (!r) r = declarer_name_metadecl(b, l + 1);
    if (!r) r = declarer_metadecl(b, l + 1);
    if (!r) r = iterator_name_metadecl(b, l + 1);
    if (!r) r = iterator_metadecl(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLParser::metadecl_recover);
    return r;
  }

  /* ********************************************************** */
  // !(';' | '@@')
  static boolean metadecl_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadecl_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !metadecl_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';' | '@@'
  private static boolean metadecl_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadecl_recover_0")) return false;
    boolean r;
    r = consumeToken(b, SEMI);
    if (!r) r = consumeToken(b, DOUBLE_AT);
    return r;
  }

  /* ********************************************************** */
  // 'metavariable' pmids_with_constraints
  public static boolean metavariable_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariable_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", METAVARIABLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, METAVARIABLE_METADECL, "<metadecl>");
    r = consumeToken(b, METAVARIABLE);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '@@' metadecl* '@@' |
  //     '@' rulename '@' metadecl* '@@'
  public static boolean metavariables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariables")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METAVARIABLES, "<metavariables>");
    r = metavariables_0(b, l + 1);
    if (!r) r = metavariables_1(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLParser::metavariables_recover);
    return r;
  }

  // '@@' metadecl* '@@'
  private static boolean metavariables_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariables_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DOUBLE_AT);
    p = r; // pin = 1
    r = r && report_error_(b, metavariables_0_1(b, l + 1));
    r = p && consumeToken(b, DOUBLE_AT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // metadecl*
  private static boolean metavariables_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariables_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!metadecl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "metavariables_0_1", c)) break;
    }
    return true;
  }

  // '@' rulename '@' metadecl* '@@'
  private static boolean metavariables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariables_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, AT);
    r = r && rulename(b, l + 1);
    r = r && consumeToken(b, AT);
    p = r; // pin = 3
    r = r && report_error_(b, metavariables_1_3(b, l + 1));
    r = p && consumeToken(b, DOUBLE_AT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // metadecl*
  private static boolean metavariables_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariables_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!metadecl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "metavariables_1_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !(SCRIPT_LINE | TRANSFORMATION_LINE)
  static boolean metavariables_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariables_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !metavariables_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SCRIPT_LINE | TRANSFORMATION_LINE
  private static boolean metavariables_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metavariables_recover_0")) return false;
    boolean r;
    r = consumeToken(b, SCRIPT_LINE);
    if (!r) r = consumeToken(b, TRANSFORMATION_LINE);
    return r;
  }

  /* ********************************************************** */
  // ('parameter' | 'parameter list' [list_size]) pmids_with_constraints
  public static boolean parameter_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", PARAMETER, PARAMETER_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_METADECL, "<metadecl>");
    r = parameter_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'parameter' | 'parameter list' [list_size]
  private static boolean parameter_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_metadecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETER);
    if (!r) r = parameter_metadecl_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'parameter list' [list_size]
  private static boolean parameter_metadecl_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_metadecl_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETER_LIST);
    r = r && parameter_metadecl_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [list_size]
  private static boolean parameter_metadecl_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_metadecl_0_1_1")) return false;
    list_size(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id ['.' id]
  public static boolean pmid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmid")) return false;
    if (!nextTokenIs(b, "<pmid>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PMID, "<pmid>");
    r = id(b, l + 1);
    r = r && pmid_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['.' id]
  private static boolean pmid_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmid_1")) return false;
    pmid_1_0(b, l + 1);
    return true;
  }

  // '.' id
  private static boolean pmid_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmid_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<commaSeparate pmid>>
  public static boolean pmids(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmids")) return false;
    if (!nextTokenIs(b, "<pmids>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PMIDS, "<pmids>");
    r = commaSeparate(b, l + 1, SmPLParser::pmid);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<commaSeparate (pmid [constraints])>>
  public static boolean pmids_with_constraints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmids_with_constraints")) return false;
    if (!nextTokenIs(b, "<pmids with constraints>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PMIDS_WITH_CONSTRAINTS, "<pmids with constraints>");
    r = commaSeparate(b, l + 1, SmPLParser::pmids_with_constraints_0_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pmid [constraints]
  private static boolean pmids_with_constraints_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmids_with_constraints_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pmid(b, l + 1);
    r = r && pmids_with_constraints_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [constraints]
  private static boolean pmids_with_constraints_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmids_with_constraints_0_0_1")) return false;
    constraints(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<commaSeparate (pmid [seed])>>
  public static boolean pmids_with_seed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmids_with_seed")) return false;
    if (!nextTokenIs(b, "<pmids with seed>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PMIDS_WITH_SEED, "<pmids with seed>");
    r = commaSeparate(b, l + 1, SmPLParser::pmids_with_seed_0_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pmid [seed]
  private static boolean pmids_with_seed_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmids_with_seed_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pmid(b, l + 1);
    r = r && pmids_with_seed_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [seed]
  private static boolean pmids_with_seed_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pmids_with_seed_0_0_1")) return false;
    seed(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('position' | 'position any') pmids_with_constraints
  public static boolean position_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "position_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", POSITION, POSITION_ANY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, POSITION_METADECL, "<metadecl>");
    r = position_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'position' | 'position any'
  private static boolean position_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "position_metadecl_0")) return false;
    boolean r;
    r = consumeToken(b, POSITION);
    if (!r) r = consumeToken(b, POSITION_ANY);
    return r;
  }

  /* ********************************************************** */
  // cocci_header* changeset+
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_0(b, l + 1);
    r = r && program_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // cocci_header*
  private static boolean program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cocci_header(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program_0", c)) break;
    }
    return true;
  }

  // changeset+
  private static boolean program_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = changeset(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!changeset(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('=~' | '!~') string
  public static boolean regexp_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regexp_constraint")) return false;
    if (!nextTokenIs(b, "<regexp constraint>", REGEXP_MATCHES, REGEXP_NOT_MATCHES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REGEXP_CONSTRAINT, "<regexp constraint>");
    r = regexp_constraint_0(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '=~' | '!~'
  private static boolean regexp_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regexp_constraint_0")) return false;
    boolean r;
    r = consumeToken(b, REGEXP_MATCHES);
    if (!r) r = consumeToken(b, REGEXP_NOT_MATCHES);
    return r;
  }

  /* ********************************************************** */
  // depends_on_ruleattr |
  //     using_ruleattr |
  //     disable_ruleattr |
  //     exists |
  //     rulekind
  static boolean ruleattr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleattr")) return false;
    boolean r;
    r = depends_on_ruleattr(b, l + 1);
    if (!r) r = using_ruleattr(b, l + 1);
    if (!r) r = disable_ruleattr(b, l + 1);
    if (!r) r = exists(b, l + 1);
    if (!r) r = rulekind(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'expression' |
  //     'identifier' |
  //     'type'
  static boolean rulekind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rulekind")) return false;
    boolean r;
    r = consumeToken(b, EXPRESSION);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, TYPE);
    return r;
  }

  /* ********************************************************** */
  // [id] ['extends' id] ruleattr*
  public static boolean rulename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rulename")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULENAME, "<rulename>");
    r = rulename_0(b, l + 1);
    r = r && rulename_1(b, l + 1);
    r = r && rulename_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [id]
  private static boolean rulename_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rulename_0")) return false;
    id(b, l + 1);
    return true;
  }

  // ['extends' id]
  private static boolean rulename_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rulename_1")) return false;
    rulename_1_0(b, l + 1);
    return true;
  }

  // 'extends' id
  private static boolean rulename_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rulename_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ruleattr*
  private static boolean rulename_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rulename_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ruleattr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rulename_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'script' ':' language '(' <<commaSeparate (id '.' id)>> ')' '{' expr '}'
  public static boolean script(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script")) return false;
    if (!nextTokenIs(b, SCRIPT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT, null);
    r = consumeTokens(b, 2, SCRIPT, COLON);
    p = r; // pin = 2
    r = r && report_error_(b, language(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LPAREN)) && r;
    r = p && report_error_(b, commaSeparate(b, l + 1, SmPLParser::script_4_0)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, LBRACE, EXPR, RBRACE)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // id '.' id
  private static boolean script_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OCAML_BLOCK | PYTHON_BLOCK
  public static boolean script_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_body")) return false;
    if (!nextTokenIs(b, "<script body>", OCAML_BLOCK, PYTHON_BLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_BODY, "<script body>");
    r = consumeToken(b, OCAML_BLOCK);
    if (!r) r = consumeToken(b, PYTHON_BLOCK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // script_metavariables script_body
  public static boolean script_code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_code")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = script_metavariables(b, l + 1);
    r = r && script_body(b, l + 1);
    exit_section_(b, m, SCRIPT_CODE, r);
    return r;
  }

  /* ********************************************************** */
  // ':' script
  public static boolean script_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_constraint")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_CONSTRAINT, null);
    r = consumeToken(b, COLON);
    p = r; // pin = 1
    r = r && script(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // script_metadecl_ ';'
  public static boolean script_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_METADECL, "<metadecl>");
    r = script_metadecl_(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // script_metadecl_assign [script_metadecl_assign_rule]
  static boolean script_metadecl_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = script_metadecl_assign(b, l + 1);
    p = r; // pin = 1
    r = r && script_metadecl__1(b, l + 1);
    exit_section_(b, l, m, r, p, SmPLParser::script_metadecl_recover);
    return r || p;
  }

  // [script_metadecl_assign_rule]
  private static boolean script_metadecl__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl__1")) return false;
    script_metadecl_assign_rule(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id | '(' id ',' id ')'
  public static boolean script_metadecl_assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_assign")) return false;
    if (!nextTokenIs(b, "<script metadecl assign>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_METADECL_ASSIGN, "<script metadecl assign>");
    r = id(b, l + 1);
    if (!r) r = script_metadecl_assign_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' id ',' id ')'
  private static boolean script_metadecl_assign_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_assign_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<<' id '.' id [script_metadecl_assign_value]
  public static boolean script_metadecl_assign_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_assign_rule")) return false;
    if (!nextTokenIs(b, LEFT_LEFT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_METADECL_ASSIGN_RULE, null);
    r = consumeToken(b, LEFT_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, id(b, l + 1));
    r = p && report_error_(b, consumeToken(b, DOT)) && r;
    r = p && report_error_(b, id(b, l + 1)) && r;
    r = p && script_metadecl_assign_rule_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [script_metadecl_assign_value]
  private static boolean script_metadecl_assign_rule_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_assign_rule_4")) return false;
    script_metadecl_assign_value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '=' (string | '[' ']')
  public static boolean script_metadecl_assign_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_assign_value")) return false;
    if (!nextTokenIs(b, EQUALS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_METADECL_ASSIGN_VALUE, null);
    r = consumeToken(b, EQUALS);
    p = r; // pin = 1
    r = r && script_metadecl_assign_value_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // string | '[' ']'
  private static boolean script_metadecl_assign_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_assign_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = parseTokens(b, 0, LBRACK, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(';' | '@@')
  static boolean script_metadecl_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !script_metadecl_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';' | '@@'
  private static boolean script_metadecl_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metadecl_recover_0")) return false;
    boolean r;
    r = consumeToken(b, SEMI);
    if (!r) r = consumeToken(b, DOUBLE_AT);
    return r;
  }

  /* ********************************************************** */
  // '@' ('script' | 'initialize' | 'finalize') ':' language [rulename] ['depends' 'on' dep] '@' script_metadecl* '@@'
  public static boolean script_metavariables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_METAVARIABLES, "<script metavariables>");
    r = consumeToken(b, AT);
    r = r && script_metavariables_1(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, COLON));
    r = p && report_error_(b, language(b, l + 1)) && r;
    r = p && report_error_(b, script_metavariables_4(b, l + 1)) && r;
    r = p && report_error_(b, script_metavariables_5(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, AT)) && r;
    r = p && report_error_(b, script_metavariables_7(b, l + 1)) && r;
    r = p && consumeToken(b, DOUBLE_AT) && r;
    exit_section_(b, l, m, r, p, SmPLParser::script_metavariables_recover);
    return r || p;
  }

  // 'script' | 'initialize' | 'finalize'
  private static boolean script_metavariables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables_1")) return false;
    boolean r;
    r = consumeToken(b, SCRIPT);
    if (!r) r = consumeToken(b, INITIALIZE);
    if (!r) r = consumeToken(b, FINALIZE);
    return r;
  }

  // [rulename]
  private static boolean script_metavariables_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables_4")) return false;
    rulename(b, l + 1);
    return true;
  }

  // ['depends' 'on' dep]
  private static boolean script_metavariables_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables_5")) return false;
    script_metavariables_5_0(b, l + 1);
    return true;
  }

  // 'depends' 'on' dep
  private static boolean script_metavariables_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "depends");
    r = r && consumeToken(b, "on");
    r = r && dep(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // script_metadecl*
  private static boolean script_metavariables_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!script_metadecl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "script_metavariables_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !(SCRIPT_LINE | TRANSFORMATION_LINE)
  static boolean script_metavariables_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !script_metavariables_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SCRIPT_LINE | TRANSFORMATION_LINE
  private static boolean script_metavariables_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_metavariables_recover_0")) return false;
    boolean r;
    r = consumeToken(b, SCRIPT_LINE);
    if (!r) r = consumeToken(b, TRANSFORMATION_LINE);
    return r;
  }

  /* ********************************************************** */
  // '=' string_seed |
  //     '=' script
  public static boolean seed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seed")) return false;
    if (!nextTokenIs(b, EQUALS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = seed_0(b, l + 1);
    if (!r) r = seed_1(b, l + 1);
    exit_section_(b, m, SEED, r);
    return r;
  }

  // '=' string_seed
  private static boolean seed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seed_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && string_seed(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' script
  private static boolean seed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seed_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && script(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('statement' | 'statement list') pmids_with_constraints
  public static boolean statement_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", STATEMENT, STATEMENT_LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_METADECL, "<metadecl>");
    r = statement_metadecl_0(b, l + 1);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // 'statement' | 'statement list'
  private static boolean statement_metadecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_metadecl_0")) return false;
    boolean r;
    r = consumeToken(b, STATEMENT);
    if (!r) r = consumeToken(b, STATEMENT_LIST);
    return r;
  }

  /* ********************************************************** */
  // (string | pmid) ('##' (string | pmid))*
  public static boolean string_seed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_seed")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_SEED, "<string seed>");
    r = string_seed_0(b, l + 1);
    r = r && string_seed_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // string | pmid
  private static boolean string_seed_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_seed_0")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = pmid(b, l + 1);
    return r;
  }

  // ('##' (string | pmid))*
  private static boolean string_seed_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_seed_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_seed_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_seed_1", c)) break;
    }
    return true;
  }

  // '##' (string | pmid)
  private static boolean string_seed_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_seed_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONCAT);
    r = r && string_seed_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string | pmid
  private static boolean string_seed_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_seed_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = pmid(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'symbol' pmids
  public static boolean symbol_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", SYMBOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_METADECL, "<metadecl>");
    r = consumeToken(b, SYMBOL);
    p = r; // pin = 1
    r = r && pmids(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // metavariables transformation_body
  public static boolean transformation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "transformation")) return false;
    if (!nextTokenIs(b, "<transformation>", AT, DOUBLE_AT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRANSFORMATION, "<transformation>");
    r = metavariables(b, l + 1);
    r = r && transformation_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRANSFORMATION_BLOCK
  public static boolean transformation_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "transformation_body")) return false;
    if (!nextTokenIs(b, TRANSFORMATION_BLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRANSFORMATION_BLOCK);
    exit_section_(b, m, TRANSFORMATION_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // 'type' pmids_with_constraints
  public static boolean type_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_METADECL, "<metadecl>");
    r = consumeToken(b, TYPE);
    p = r; // pin = 1
    r = r && pmids_with_constraints(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'typedef' pmids
  public static boolean typedef_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", TYPEDEF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPEDEF_METADECL, "<metadecl>");
    r = consumeToken(b, TYPEDEF);
    p = r; // pin = 1
    r = r && pmids(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'unary operator' <<commaSeparate unopdecl>>
  public static boolean unary_operator_metadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_operator_metadecl")) return false;
    if (!nextTokenIs(b, "<metadecl>", UNARY_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR_METADECL, "<metadecl>");
    r = consumeToken(b, UNARY_OPERATOR);
    p = r; // pin = 1
    r = r && commaSeparate(b, l + 1, SmPLParser::unopdecl);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '+' | '-' | '!' | '~' | '++' | '--' | '&' | '*'
  public static boolean unop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNOP, "<unop>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, "~");
    if (!r) r = consumeToken(b, "++");
    if (!r) r = consumeToken(b, "--");
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, STAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unop | '{' <<commaSeparate unop>> '}'
  static boolean unop_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unop_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unop(b, l + 1);
    if (!r) r = unop_constraint_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<commaSeparate unop>> '}'
  private static boolean unop_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unop_constraint_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, commaSeparate(b, l + 1, SmPLParser::unop));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // pmid  ['=' unop_constraint]
  public static boolean unopdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unopdecl")) return false;
    if (!nextTokenIs(b, "<unopdecl>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNOPDECL, "<unopdecl>");
    r = pmid(b, l + 1);
    r = r && unopdecl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['=' unop_constraint]
  private static boolean unopdecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unopdecl_1")) return false;
    unopdecl_1_0(b, l + 1);
    return true;
  }

  // '=' unop_constraint
  private static boolean unopdecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unopdecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && unop_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'using' string
  public static boolean using_cocci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_cocci")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 2, USING, STRING);
    exit_section_(b, m, USING_COCCI, r);
    return r;
  }

  /* ********************************************************** */
  // 'using' <<commaSeparate string>>
  public static boolean using_ruleattr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_ruleattr")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USING_RULEATTR, null);
    r = consumeToken(b, USING);
    p = r; // pin = 1
    r = r && commaSeparate(b, l + 1, STRING_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'using' syspath
  public static boolean using_sys_cocci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_sys_cocci")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 2, USING, SYSPATH);
    exit_section_(b, m, USING_SYS_COCCI, r);
    return r;
  }

  /* ********************************************************** */
  // 'virtual' <<commaSeparate word>>
  public static boolean virtual_cocci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "virtual_cocci")) return false;
    if (!nextTokenIs(b, VIRTUAL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VIRTUAL_COCCI, null);
    r = consumeToken(b, VIRTUAL);
    p = r; // pin = 1
    r = r && commaSeparate(b, l + 1, WORD_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  static final Parser CTYPE_parser_ = (b, l) -> consumeToken(b, CTYPE);
  static final Parser INTEGER_parser_ = (b, l) -> consumeToken(b, INTEGER);
  static final Parser STRING_parser_ = (b, l) -> consumeToken(b, STRING);
  static final Parser WORD_parser_ = (b, l) -> consumeToken(b, WORD);
}
