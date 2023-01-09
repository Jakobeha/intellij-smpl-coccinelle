// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCTypes.*;
import static com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SmPLCParser implements PsiParser, LightPsiParser {

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
    return transformation(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(DECL_STMT, MULTI_RULE_ELEM_STMT, RULE_ELEM_STMT, SINGLE_RULE_ELEM_STMT,
      SINGLE_STMT, STMT),
    create_token_set_(DECL, FUNDECL, NAME_OPT_DECL, ONE_DECL,
      SINGLE_ONE_DECL, STMT_NEST_DECL, STRUCT_DECL),
    create_token_set_(CTYPE, DECL_FN_TYPE, DOT_EXPR, EXPR,
      FN_CTYPE, GENERIC_CTYPE, NEST_EXPR, SINGLE_DECL_TYPEDEF_EXPR,
      STMT_NEST_EXPR, TYPE),
  };

  /* ********************************************************** */
  // 'any' | 'strict' | 'forall' | 'exists'
  public static boolean any_strict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_strict")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_STRICT, "<any strict>");
    r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, STRICT);
    if (!r) r = consumeToken(b, FORALL);
    if (!r) r = consumeToken(b, EXISTS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // nest_expr
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = nest_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '=' | '-=' | '+=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>='
  public static boolean assign_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_OP, "<assign op>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, MINUS_EQUALS);
    if (!r) r = consumeToken(b, PLUS_EQUALS);
    if (!r) r = consumeToken(b, TIMES_EQUALS);
    if (!r) r = consumeToken(b, DIVIDE_EQUALS);
    if (!r) r = consumeToken(b, MOD_EQUALS);
    if (!r) r = consumeToken(b, AND_EQUALS);
    if (!r) r = consumeToken(b, OR_EQUALS);
    if (!r) r = consumeToken(b, XOR_EQUALS);
    if (!r) r = consumeToken(b, LSHIFT_EQUALS);
    if (!r) r = consumeToken(b, RSHIFT_EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '__attribute__' '(' '(' <<commaSeparate WORD>> ')' ')'
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, ATTRIBUTE_HEAD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE, null);
    r = consumeTokens(b, 1, ATTRIBUTE_HEAD, LPAREN, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, commaSeparate(b, l + 1, WORD_parser_));
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, RPAREN)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '*' | '/' | '%' | '+' | '-' | '<<' | '>>' | '^' | '&' | '|' | '<' | '>' | '<=' | '>=' | '==' | '!=' | '&&' | '||'
  public static boolean bin_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bin_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIN_OP, "<bin op>");
    r = consumeToken(b, TIMES);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, LSHIFT);
    if (!r) r = consumeToken(b, RSHIFT);
    if (!r) r = consumeToken(b, XOR);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LE);
    if (!r) r = consumeToken(b, GE);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NE);
    if (!r) r = consumeToken(b, DOUBLE_AND);
    if (!r) r = consumeToken(b, DOUBLE_OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // case_line_default | case_line_case
  public static boolean case_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_line")) return false;
    if (!nextTokenIs(b, "<case line>", CASE, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_LINE, "<case line>");
    r = case_line_default(b, l + 1);
    if (!r) r = case_line_case(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'case' dot_expr ':' stmt_seq
  public static boolean case_line_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_line_case")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_LINE_CASE, null);
    r = consumeToken(b, CASE);
    p = r; // pin = 1
    r = r && report_error_(b, dot_expr(b, l + 1));
    r = p && report_error_(b, consumeToken(b, COLON)) && r;
    r = p && stmt_seq(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'default' ':' stmt_seq
  public static boolean case_line_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_line_default")) return false;
    if (!nextTokenIs(b, DEFAULT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_LINE_DEFAULT, null);
    r = consumeTokens(b, 1, DEFAULT, COLON);
    p = r; // pin = 1
    r = r && stmt_seq(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // ctype |
  //     funproto |
  //     decl_ident_init |
  //     decl_ident2_init |
  //     decl_fn |
  //     decl_meta
  static boolean common_decl_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_decl_")) return false;
    boolean r;
    r = ctype(b, l + 1);
    if (!r) r = funproto(b, l + 1);
    if (!r) r = decl_ident_init(b, l + 1);
    if (!r) r = decl_ident2_init(b, l + 1);
    if (!r) r = decl_fn(b, l + 1);
    if (!r) r = decl_meta(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' <<p>> ('|' <<p>>)* ')'
  public static boolean conjunct(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "conjunct")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONJUNCT, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, _p.parse(b, l));
    r = p && report_error_(b, conjunct_2(b, l + 1, _p)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('|' <<p>>)*
  private static boolean conjunct_2(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "conjunct_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conjunct_2_0(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "conjunct_2", c)) break;
    }
    return true;
  }

  // '|' <<p>>
  private static boolean conjunct_2_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "conjunct_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, OR);
    p = r; // pin = 1
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'const' | 'volatile'
  public static boolean const_vol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_vol")) return false;
    if (!nextTokenIs(b, "<const vol>", CONST, VOLATILE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_VOL, "<const vol>");
    r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, VOLATILE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING | INTEGER | '...'
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, ELLIPSIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_decl [struct_decl_list]
  public static boolean continue_struct_decl_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_struct_decl_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STRUCT_DECL_LIST, "<continue struct decl list>");
    r = struct_decl(b, l + 1);
    r = r && continue_struct_decl_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [struct_decl_list]
  private static boolean continue_struct_decl_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_struct_decl_list_1")) return false;
    struct_decl_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [const_vol] generic_ctype '*'* |
  //     [const_vol] 'void' '*'+ |
  //     '(' ctype ('|' ctype)* ')'
  public static boolean ctype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, CTYPE, "<type>");
    r = ctype_0(b, l + 1);
    if (!r) r = ctype_1(b, l + 1);
    if (!r) r = ctype_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [const_vol] generic_ctype '*'*
  private static boolean ctype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ctype_0_0(b, l + 1);
    r = r && generic_ctype(b, l + 1);
    r = r && ctype_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [const_vol]
  private static boolean ctype_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_0_0")) return false;
    const_vol(b, l + 1);
    return true;
  }

  // '*'*
  private static boolean ctype_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, TIMES)) break;
      if (!empty_element_parsed_guard_(b, "ctype_0_2", c)) break;
    }
    return true;
  }

  // [const_vol] 'void' '*'+
  private static boolean ctype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ctype_1_0(b, l + 1);
    r = r && consumeToken(b, VOID);
    r = r && ctype_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [const_vol]
  private static boolean ctype_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_1_0")) return false;
    const_vol(b, l + 1);
    return true;
  }

  // '*'+
  private static boolean ctype_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TIMES);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, TIMES)) break;
      if (!empty_element_parsed_guard_(b, "ctype_1_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' ctype ('|' ctype)* ')'
  private static boolean ctype_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ctype(b, l + 1);
    r = r && ctype_2_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('|' ctype)*
  private static boolean ctype_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ctype_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ctype_2_2", c)) break;
    }
    return true;
  }

  // '|' ctype
  private static boolean ctype_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && ctype(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'enum' id { <<commaSeparate (dot_expr | '...' [exp_whencode])>> [','] }
  public static boolean ctype_enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_enum")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CTYPE_ENUM, null);
    r = consumeToken(b, ENUM);
    p = r; // pin = 1
    r = r && report_error_(b, id(b, l + 1));
    r = p && ctype_enum_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<commaSeparate (dot_expr | '...' [exp_whencode])>> [',']
  private static boolean ctype_enum_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_enum_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSeparate(b, l + 1, SmPLCParser::ctype_enum_2_0_0);
    r = r && ctype_enum_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dot_expr | '...' [exp_whencode]
  private static boolean ctype_enum_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_enum_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dot_expr(b, l + 1);
    if (!r) r = ctype_enum_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '...' [exp_whencode]
  private static boolean ctype_enum_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_enum_2_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && ctype_enum_2_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [exp_whencode]
  private static boolean ctype_enum_2_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_enum_2_0_0_1_1")) return false;
    exp_whencode(b, l + 1);
    return true;
  }

  // [',']
  private static boolean ctype_enum_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_enum_2_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // 'unsigned' | 'signed'
  public static boolean ctype_qualif(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_qualif")) return false;
    if (!nextTokenIs(b, "<ctype qualif>", SIGNED, UNSIGNED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CTYPE_QUALIF, "<ctype qualif>");
    r = consumeToken(b, UNSIGNED);
    if (!r) r = consumeToken(b, SIGNED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ['struct' | 'union'] id ['{' struct_decl_list* '}']
  public static boolean ctype_struct_union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_struct_union")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CTYPE_STRUCT_UNION, "<ctype struct union>");
    r = ctype_struct_union_0(b, l + 1);
    r = r && id(b, l + 1);
    r = r && ctype_struct_union_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['struct' | 'union']
  private static boolean ctype_struct_union_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_struct_union_0")) return false;
    ctype_struct_union_0_0(b, l + 1);
    return true;
  }

  // 'struct' | 'union'
  private static boolean ctype_struct_union_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_struct_union_0_0")) return false;
    boolean r;
    r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, UNION);
    return r;
  }

  // ['{' struct_decl_list* '}']
  private static boolean ctype_struct_union_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_struct_union_2")) return false;
    ctype_struct_union_2_0(b, l + 1);
    return true;
  }

  // '{' struct_decl_list* '}'
  private static boolean ctype_struct_union_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_struct_union_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ctype_struct_union_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_decl_list*
  private static boolean ctype_struct_union_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_struct_union_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_decl_list(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ctype_struct_union_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'typeof' '(' (expr | ctype) ')'
  public static boolean ctype_typeof(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_typeof")) return false;
    if (!nextTokenIs(b, TYPEOF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPEOF, LPAREN);
    r = r && ctype_typeof_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, CTYPE_TYPEOF, r);
    return r;
  }

  // expr | ctype
  private static boolean ctype_typeof_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ctype_typeof_2")) return false;
    boolean r;
    r = expr(b, l + 1);
    if (!r) r = ctype(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // id ['[' expr ']'] '*'
  public static boolean d_ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "d_ident")) return false;
    if (!nextTokenIs(b, "<d ident>", LPAREN, WORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, D_IDENT, "<d ident>");
    r = id(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, d_ident_1(b, l + 1));
    r = p && consumeToken(b, TIMES) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ['[' expr ']']
  private static boolean d_ident_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "d_ident_1")) return false;
    d_ident_1_0(b, l + 1);
    return true;
  }

  // '[' expr ']'
  private static boolean d_ident_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "d_ident_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl_type_id |
  //     decl_fn_type |
  //     'void' |
  //     WORD
  public static boolean decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL, "<declaration>");
    r = decl_type_id(b, l + 1);
    if (!r) r = decl_fn_type(b, l + 1);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, WORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [storage] fn_ctype '(' '*' d_ident ')' '(' <<paramSeq name_opt_decl ()>> ')'
  public static boolean decl_fn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_fn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_FN, "<decl fn>");
    r = decl_fn_0(b, l + 1);
    r = r && fn_ctype(b, l + 1);
    r = r && consumeTokens(b, 0, LPAREN, TIMES);
    r = r && d_ident(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LPAREN);
    r = r && paramSeq(b, l + 1, SmPLCParser::name_opt_decl, SmPLCParser::decl_fn_7_1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [storage]
  private static boolean decl_fn_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_fn_0")) return false;
    storage(b, l + 1);
    return true;
  }

  // ()
  private static boolean decl_fn_7_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // fn_ctype '(' '*' id ')' '(' <<paramSeq name_opt_decl ()>> ')'
  public static boolean decl_fn_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_fn_type")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECL_FN_TYPE, "<type>");
    r = fn_ctype(b, l + 1);
    r = r && consumeTokens(b, 1, LPAREN, TIMES);
    p = r; // pin = 2
    r = r && report_error_(b, id(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, LPAREN)) && r;
    r = p && report_error_(b, paramSeq(b, l + 1, SmPLCParser::name_opt_decl, SmPLCParser::decl_fn_type_6_1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ()
  private static boolean decl_fn_type_6_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // [storage] [const_vol] id d_ident [attribute] '=' initialize
  public static boolean decl_ident2_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_ident2_init")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECL_IDENT_2_INIT, "<decl ident 2 init>");
    r = decl_ident2_init_0(b, l + 1);
    r = r && decl_ident2_init_1(b, l + 1);
    r = r && id(b, l + 1);
    r = r && d_ident(b, l + 1);
    r = r && decl_ident2_init_4(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    p = r; // pin = 6
    r = r && initialize(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [storage]
  private static boolean decl_ident2_init_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_ident2_init_0")) return false;
    storage(b, l + 1);
    return true;
  }

  // [const_vol]
  private static boolean decl_ident2_init_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_ident2_init_1")) return false;
    const_vol(b, l + 1);
    return true;
  }

  // [attribute]
  private static boolean decl_ident2_init_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_ident2_init_4")) return false;
    attribute(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [storage] ctype d_ident [attribute] '=' initialize
  public static boolean decl_ident_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_ident_init")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECL_IDENT_INIT, "<decl ident init>");
    r = decl_ident_init_0(b, l + 1);
    r = r && ctype(b, l + 1);
    r = r && d_ident(b, l + 1);
    r = r && decl_ident_init_3(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    p = r; // pin = 5
    r = r && initialize(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [storage]
  private static boolean decl_ident_init_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_ident_init_0")) return false;
    storage(b, l + 1);
    return true;
  }

  // [attribute]
  private static boolean decl_ident_init_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_ident_init_3")) return false;
    attribute(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WORD '(' [<<commaSeparate expr>>] ')'
  public static boolean decl_meta(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_meta")) return false;
    if (!nextTokenIs(b, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WORD, LPAREN);
    r = r && decl_meta_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, DECL_META, r);
    return r;
  }

  // [<<commaSeparate expr>>]
  private static boolean decl_meta_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_meta_2")) return false;
    commaSeparate(b, l + 1, SmPLCParser::expr);
    return true;
  }

  /* ********************************************************** */
  // WORD |
  //     decl_var |
  //     stmt |
  //     expr |
  //     <<conjunct stmt_seq>> |
  //     <<disjunct stmt_seq>>
  public static boolean decl_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, DECL_STMT, "<statement>");
    r = consumeToken(b, WORD);
    if (!r) r = decl_var(b, l + 1);
    if (!r) r = stmt(b, l + 1);
    if (!r) r = expr(b, l + 1);
    if (!r) r = conjunct(b, l + 1, SmPLCParser::stmt_seq);
    if (!r) r = disjunct(b, l + 1, SmPLCParser::stmt_seq);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ctype id
  public static boolean decl_type_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_type_id")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_TYPE_ID, "<decl type id>");
    r = ctype(b, l + 1);
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // single_decl_var | <<conjunct decl_var>> | <<disjunct decl_var>>
  public static boolean decl_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_VAR, "<decl var>");
    r = single_decl_var(b, l + 1);
    if (!r) r = conjunct(b, l + 1, SmPLCParser::decl_var);
    if (!r) r = disjunct(b, l + 1, SmPLCParser::decl_var);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '#define' id [top]
  public static boolean define(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define")) return false;
    if (!nextTokenIs(b, HASH_DEFINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH_DEFINE);
    r = r && id(b, l + 1);
    r = r && define_2(b, l + 1);
    exit_section_(b, m, DEFINE, r);
    return r;
  }

  // [top]
  private static boolean define_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_2")) return false;
    top(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '#define' id '(' <<paramSeq id ()>> ')' [top]
  public static boolean define_func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_func")) return false;
    if (!nextTokenIs(b, HASH_DEFINE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFINE_FUNC, null);
    r = consumeToken(b, HASH_DEFINE);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    p = r; // pin = 3
    r = r && report_error_(b, paramSeq(b, l + 1, SmPLCParser::id, SmPLCParser::define_func_3_1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && define_func_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ()
  private static boolean define_func_3_1(PsiBuilder b, int l) {
    return true;
  }

  // [top]
  private static boolean define_func_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_func_5")) return false;
    top(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '.' id |
  //     '[' dot_expr ']' |
  //     '[' dot_expr '...' dot_expr ']'
  public static boolean designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator")) return false;
    if (!nextTokenIs(b, "<designator>", DOT, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGNATOR, "<designator>");
    r = designator_0(b, l + 1);
    if (!r) r = designator_1(b, l + 1);
    if (!r) r = designator_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '.' id
  private static boolean designator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' dot_expr ']'
  private static boolean designator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && dot_expr(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' dot_expr '...' dot_expr ']'
  private static boolean designator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && dot_expr(b, l + 1);
    r = r && consumeToken(b, ELLIPSIS);
    r = r && dot_expr(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // include |
  //     define |
  //     define_func |
  //     undef |
  //     pragma |
  //     pragma_ellipsis
  public static boolean directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTIVE, "<directive>");
    r = include(b, l + 1);
    if (!r) r = define(b, l + 1);
    if (!r) r = define_func(b, l + 1);
    if (!r) r = undef(b, l + 1);
    if (!r) r = pragma(b, l + 1);
    if (!r) r = pragma_ellipsis(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' <<p>> ('&' <<p>>)* ')'
  public static boolean disjunct(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "disjunct")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCT, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, _p.parse(b, l));
    r = p && report_error_(b, disjunct_2(b, l + 1, _p)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('&' <<p>>)*
  private static boolean disjunct_2(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "disjunct_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!disjunct_2_0(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "disjunct_2", c)) break;
    }
    return true;
  }

  // '&' <<p>>
  private static boolean disjunct_2_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "disjunct_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, AND);
    p = r; // pin = 1
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '...' [<<p2>>] (<<p>> '...' [<<p2>>])*
  public static boolean dotSeq(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "dotSeq")) return false;
    if (!nextTokenIs(b, ELLIPSIS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DOT_SEQ, null);
    r = consumeToken(b, ELLIPSIS);
    p = r; // pin = 1
    r = r && report_error_(b, dotSeq_1(b, l + 1, _p2));
    r = p && dotSeq_2(b, l + 1, _p, _p2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [<<p2>>]
  private static boolean dotSeq_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "dotSeq_1")) return false;
    _p2.parse(b, l);
    return true;
  }

  // (<<p>> '...' [<<p2>>])*
  private static boolean dotSeq_2(PsiBuilder b, int l, Parser _p, Parser _p2) {
    if (!recursion_guard_(b, l, "dotSeq_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dotSeq_2_0(b, l + 1, _p, _p2)) break;
      if (!empty_element_parsed_guard_(b, "dotSeq_2", c)) break;
    }
    return true;
  }

  // <<p>> '...' [<<p2>>]
  private static boolean dotSeq_2_0(PsiBuilder b, int l, Parser _p, Parser _p2) {
    if (!recursion_guard_(b, l, "dotSeq_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p.parse(b, l);
    r = r && consumeToken(b, ELLIPSIS);
    r = r && dotSeq_2_0_2(b, l + 1, _p2);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<p2>>]
  private static boolean dotSeq_2_0_2(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "dotSeq_2_0_2")) return false;
    _p2.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // <<expr_rec dot_expr>> |
  //     <<nest dot_expr exp_whencode>> |
  //     '...' [exp_whencode]
  public static boolean dot_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT_EXPR, "<expression>");
    r = expr_rec(b, l + 1, SmPLCParser::dot_expr);
    if (!r) r = nest(b, l + 1, SmPLCParser::dot_expr, SmPLCParser::exp_whencode);
    if (!r) r = dot_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '...' [exp_whencode]
  private static boolean dot_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && dot_expr_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [exp_whencode]
  private static boolean dot_expr_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_expr_2_1")) return false;
    exp_whencode(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'when' '!=' expr
  public static boolean exp_whencode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_whencode")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXP_WHENCODE, null);
    r = consumeTokens(b, 1, WHEN, NE);
    p = r; // pin = 1
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<expr_rec expr>>
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expression>");
    r = expr_rec(b, l + 1, SmPLCParser::expr);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unary_op <<p>> |
  //     '(' type ')' <<p>> |
  //     id |
  //     '(' type ')' '{' <<commaSeparate init_list_elem>> '}' |
  //     constant |
  //     '(' dot_expr ')' |
  //     <<conjunct <<p>>>>
  //     <<disjunct <<p>>>>
  public static boolean expr_head(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_head")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_head_0(b, l + 1, _p);
    if (!r) r = expr_head_1(b, l + 1, _p);
    if (!r) r = id(b, l + 1);
    if (!r) r = expr_head_3(b, l + 1);
    if (!r) r = constant(b, l + 1);
    if (!r) r = expr_head_5(b, l + 1);
    if (!r) r = expr_head_6(b, l + 1, _p);
    exit_section_(b, m, EXPR_HEAD, r);
    return r;
  }

  // unary_op <<p>>
  private static boolean expr_head_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_head_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_op(b, l + 1);
    r = r && _p.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' type ')' <<p>>
  private static boolean expr_head_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_head_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && _p.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' type ')' '{' <<commaSeparate init_list_elem>> '}'
  private static boolean expr_head_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_head_3")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LPAREN);
    r = r && type(b, l + 1);
    r = r && consumeTokens(b, 2, RPAREN, LBRACE);
    p = r; // pin = 4
    r = r && report_error_(b, commaSeparate(b, l + 1, SmPLCParser::init_list_elem));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '(' dot_expr ')'
  private static boolean expr_head_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_head_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && dot_expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<conjunct <<p>>>>
  //     <<disjunct <<p>>>>
  private static boolean expr_head_6(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_head_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conjunct(b, l + 1, _p);
    r = r && disjunct(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<expr_head <<p>>>> <<expr_tail <<p>>>>*
  public static boolean expr_rec(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_rec")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_head(b, l + 1, _p);
    r = r && expr_rec_1(b, l + 1, _p);
    exit_section_(b, m, EXPR_REC, r);
    return r;
  }

  // <<expr_tail <<p>>>>*
  private static boolean expr_rec_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_rec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_tail(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "expr_rec_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // WORD <<p>> |
  //     assign_op <<p>> |
  //     '++' |
  //     '--' |
  //     bin_op <<p>> |
  //     '?' dot_expr ':' <<p>> |
  //     dot_expr |
  //     '.' id |
  //     '->' id |
  //     '(' [<<paramSeq arg exp_whencode>>] ')'
  public static boolean expr_tail(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_tail")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_tail_0(b, l + 1, _p);
    if (!r) r = expr_tail_1(b, l + 1, _p);
    if (!r) r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    if (!r) r = expr_tail_4(b, l + 1, _p);
    if (!r) r = expr_tail_5(b, l + 1, _p);
    if (!r) r = dot_expr(b, l + 1);
    if (!r) r = expr_tail_7(b, l + 1);
    if (!r) r = expr_tail_8(b, l + 1);
    if (!r) r = expr_tail_9(b, l + 1);
    exit_section_(b, m, EXPR_TAIL, r);
    return r;
  }

  // WORD <<p>>
  private static boolean expr_tail_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_tail_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, WORD);
    p = r; // pin = 1
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // assign_op <<p>>
  private static boolean expr_tail_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_tail_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = assign_op(b, l + 1);
    p = r; // pin = 1
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // bin_op <<p>>
  private static boolean expr_tail_4(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_tail_4")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = bin_op(b, l + 1);
    p = r; // pin = 1
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '?' dot_expr ':' <<p>>
  private static boolean expr_tail_5(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "expr_tail_5")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, QUESTION);
    p = r; // pin = 1
    r = r && report_error_(b, dot_expr(b, l + 1));
    r = p && report_error_(b, consumeToken(b, COLON)) && r;
    r = p && _p.parse(b, l) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '.' id
  private static boolean expr_tail_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tail_7")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DOT);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '->' id
  private static boolean expr_tail_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tail_8")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ARROW);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '(' [<<paramSeq arg exp_whencode>>] ')'
  private static boolean expr_tail_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tail_9")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, expr_tail_9_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [<<paramSeq arg exp_whencode>>]
  private static boolean expr_tail_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_tail_9_1")) return false;
    paramSeq(b, l + 1, SmPLCParser::arg, SmPLCParser::exp_whencode);
    return true;
  }

  /* ********************************************************** */
  // (generic_ctype | 'void') '*'*
  public static boolean fn_ctype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_ctype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, FN_CTYPE, "<type>");
    r = fn_ctype_0(b, l + 1);
    r = r && fn_ctype_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic_ctype | 'void'
  private static boolean fn_ctype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_ctype_0")) return false;
    boolean r;
    r = generic_ctype(b, l + 1);
    if (!r) r = consumeToken(b, VOID);
    return r;
  }

  // '*'*
  private static boolean fn_ctype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_ctype_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, TIMES)) break;
      if (!empty_element_parsed_guard_(b, "fn_ctype_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [fn_ctype] funinfo* funid '(' [<<paramSeq param ()>>] ')' '{' [stmt_seq] '}'
  public static boolean fundecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fundecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNDECL, "<declaration>");
    r = fundecl_0(b, l + 1);
    r = r && fundecl_1(b, l + 1);
    r = r && funid(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && fundecl_4(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && fundecl_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [fn_ctype]
  private static boolean fundecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fundecl_0")) return false;
    fn_ctype(b, l + 1);
    return true;
  }

  // funinfo*
  private static boolean fundecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fundecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!funinfo(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fundecl_1", c)) break;
    }
    return true;
  }

  // [<<paramSeq param ()>>]
  private static boolean fundecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fundecl_4")) return false;
    paramSeq(b, l + 1, SmPLCParser::param, SmPLCParser::fundecl_4_0_1);
    return true;
  }

  // ()
  private static boolean fundecl_4_0_1(PsiBuilder b, int l) {
    return true;
  }

  // [stmt_seq]
  private static boolean fundecl_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fundecl_7")) return false;
    stmt_seq(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id | <<conjunct funid>>
  public static boolean funid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funid")) return false;
    if (!nextTokenIs(b, "<funid>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNID, "<funid>");
    r = id(b, l + 1);
    if (!r) r = conjunct(b, l + 1, SmPLCParser::funid);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'inline' | storage
  public static boolean funinfo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funinfo")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNINFO, "<funinfo>");
    r = consumeToken(b, INLINE);
    if (!r) r = storage(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // fn_ctype funinfo* funid '(' [<<paramSeq param ()>>] ')'
  public static boolean funproto(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funproto")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNPROTO, "<funproto>");
    r = fn_ctype(b, l + 1);
    r = r && funproto_1(b, l + 1);
    r = r && funid(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && funproto_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // funinfo*
  private static boolean funproto_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funproto_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!funinfo(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "funproto_1", c)) break;
    }
    return true;
  }

  // [<<paramSeq param ()>>]
  private static boolean funproto_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funproto_4")) return false;
    paramSeq(b, l + 1, SmPLCParser::param, SmPLCParser::funproto_4_0_1);
    return true;
  }

  // ()
  private static boolean funproto_4_0_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // ctype_qualif |
  //     [ctype_qualif] 'char' |
  //     [ctype_qualif] 'short' |
  //     [ctype_qualif] 'short' 'int' |
  //     [ctype_qualif] 'int' |
  //     [ctype_qualif] 'long' |
  //     [ctype_qualif] 'long' 'int' |
  //     [ctype_qualif] 'long' 'long' |
  //     [ctype_qualif] 'long' 'long' 'int' |
  //     'double' |
  //     'long' 'double' |
  //     'float' |
  //     'long' 'double complex' |
  //     'double complex' |
  //     'float complex' |
  //     'size_t' |
  //     'ssize_t' |
  //     'ptrdiff_t' |
  //     ctype_enum |
  //     ctype_struct_union |
  //     ctype_typeof
  public static boolean generic_ctype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_CTYPE, "<type>");
    r = ctype_qualif(b, l + 1);
    if (!r) r = generic_ctype_1(b, l + 1);
    if (!r) r = generic_ctype_2(b, l + 1);
    if (!r) r = generic_ctype_3(b, l + 1);
    if (!r) r = generic_ctype_4(b, l + 1);
    if (!r) r = generic_ctype_5(b, l + 1);
    if (!r) r = generic_ctype_6(b, l + 1);
    if (!r) r = generic_ctype_7(b, l + 1);
    if (!r) r = generic_ctype_8(b, l + 1);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = parseTokens(b, 0, LONG, DOUBLE);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = parseTokens(b, 0, LONG, DOUBLE_COMPLEX);
    if (!r) r = consumeToken(b, DOUBLE_COMPLEX);
    if (!r) r = consumeToken(b, FLOAT_COMPLEX);
    if (!r) r = consumeToken(b, SIZE_T);
    if (!r) r = consumeToken(b, SSIZE_T);
    if (!r) r = consumeToken(b, PTRDIFF_T);
    if (!r) r = ctype_enum(b, l + 1);
    if (!r) r = ctype_struct_union(b, l + 1);
    if (!r) r = ctype_typeof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ctype_qualif] 'char'
  private static boolean generic_ctype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_1_0(b, l + 1);
    r = r && consumeToken(b, CHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_1_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  // [ctype_qualif] 'short'
  private static boolean generic_ctype_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_2_0(b, l + 1);
    r = r && consumeToken(b, SHORT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_2_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  // [ctype_qualif] 'short' 'int'
  private static boolean generic_ctype_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_3_0(b, l + 1);
    r = r && consumeTokens(b, 0, SHORT, INT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_3_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  // [ctype_qualif] 'int'
  private static boolean generic_ctype_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_4_0(b, l + 1);
    r = r && consumeToken(b, INT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_4_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  // [ctype_qualif] 'long'
  private static boolean generic_ctype_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_5_0(b, l + 1);
    r = r && consumeToken(b, LONG);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_5_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  // [ctype_qualif] 'long' 'int'
  private static boolean generic_ctype_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_6_0(b, l + 1);
    r = r && consumeTokens(b, 0, LONG, INT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_6_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  // [ctype_qualif] 'long' 'long'
  private static boolean generic_ctype_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_7_0(b, l + 1);
    r = r && consumeTokens(b, 0, LONG, LONG);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_7_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  // [ctype_qualif] 'long' 'long' 'int'
  private static boolean generic_ctype_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_ctype_8_0(b, l + 1);
    r = r && consumeTokens(b, 0, LONG, LONG, INT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ctype_qualif]
  private static boolean generic_ctype_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_ctype_8_0")) return false;
    ctype_qualif(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WORD | <<conjunct WORD>> | <<disjunct WORD>>
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, "<id>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID, "<id>");
    r = consumeToken(b, WORD);
    if (!r) r = conjunct(b, l + 1, WORD_parser_);
    if (!r) r = disjunct(b, l + 1, WORD_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '#include' STRING
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, HASH_INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASH_INCLUDE, STRING);
    exit_section_(b, m, INCLUDE, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [<<commaSeparate init_list_elem>>] '}'
  public static boolean init_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_list")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INIT_LIST, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, init_list_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [<<commaSeparate init_list_elem>>]
  private static boolean init_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_list_1")) return false;
    commaSeparate(b, l + 1, SmPLCParser::init_list_elem);
    return true;
  }

  /* ********************************************************** */
  // id ':' dot_expr
  public static boolean init_list_colon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_list_colon")) return false;
    if (!nextTokenIs(b, "<init list colon>", LPAREN, WORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INIT_LIST_COLON, "<init list colon>");
    r = id(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COLON));
    r = p && dot_expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // dot_expr |
  //     init_list_eq |
  //     init_list_colon
  //     WORD
  public static boolean init_list_elem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_list_elem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INIT_LIST_ELEM, "<init list elem>");
    r = dot_expr(b, l + 1);
    if (!r) r = init_list_eq(b, l + 1);
    if (!r) r = init_list_elem_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // init_list_colon
  //     WORD
  private static boolean init_list_elem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_list_elem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = init_list_colon(b, l + 1);
    r = r && consumeToken(b, WORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // designator '=' initialize
  public static boolean init_list_eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_list_eq")) return false;
    if (!nextTokenIs(b, "<init list eq>", DOT, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INIT_LIST_EQ, "<init list eq>");
    r = designator(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, EQUALS));
    r = p && initialize(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // dot_expr |
  //     WORD |
  //     init_list
  public static boolean initialize(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialize")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZE, "<initialize>");
    r = dot_expr(b, l + 1);
    if (!r) r = consumeToken(b, WORD);
    if (!r) r = init_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WORD
  public static boolean iter_ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iter_ident")) return false;
    if (!nextTokenIs(b, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WORD);
    exit_section_(b, m, ITER_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // '\(' rule_elem_stmt ('\|' rule_elem_stmt)+ '\)'
  public static boolean multi_rule_elem_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_rule_elem_stmt")) return false;
    if (!nextTokenIs(b, "<statement>", BACK_LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MULTI_RULE_ELEM_STMT, "<statement>");
    r = consumeToken(b, BACK_LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, rule_elem_stmt(b, l + 1));
    r = p && report_error_(b, multi_rule_elem_stmt_2(b, l + 1)) && r;
    r = p && consumeToken(b, BACK_RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ('\|' rule_elem_stmt)+
  private static boolean multi_rule_elem_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_rule_elem_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multi_rule_elem_stmt_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!multi_rule_elem_stmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multi_rule_elem_stmt_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '\|' rule_elem_stmt
  private static boolean multi_rule_elem_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_rule_elem_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACK_OR);
    r = r && rule_elem_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl | ctype | fn_ctype
  public static boolean name_opt_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_opt_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, NAME_OPT_DECL, "<declaration>");
    r = decl(b, l + 1);
    if (!r) r = ctype(b, l + 1);
    if (!r) r = fn_ctype(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<...' [<<p2>>] <<p>> ('...' [<<p2>>] <<p>>)* '...>' |
  //     '<+...' [<<p2>>] <<p>> ('...' [<<p2>>] <<p>>)* '...+>'
  public static boolean nest(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "nest")) return false;
    if (!nextTokenIs(b, "", NEST_PLUS_OPEN, NEST_REG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nest_0(b, l + 1, _p2, _p);
    if (!r) r = nest_1(b, l + 1, _p2, _p);
    exit_section_(b, m, NEST, r);
    return r;
  }

  // '<...' [<<p2>>] <<p>> ('...' [<<p2>>] <<p>>)* '...>'
  private static boolean nest_0(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "nest_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NEST_REG_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, nest_0_1(b, l + 1, _p2));
    r = p && report_error_(b, _p.parse(b, l)) && r;
    r = p && report_error_(b, nest_0_3(b, l + 1, _p2, _p)) && r;
    r = p && consumeToken(b, NEST_REG_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [<<p2>>]
  private static boolean nest_0_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "nest_0_1")) return false;
    _p2.parse(b, l);
    return true;
  }

  // ('...' [<<p2>>] <<p>>)*
  private static boolean nest_0_3(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "nest_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nest_0_3_0(b, l + 1, _p2, _p)) break;
      if (!empty_element_parsed_guard_(b, "nest_0_3", c)) break;
    }
    return true;
  }

  // '...' [<<p2>>] <<p>>
  private static boolean nest_0_3_0(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "nest_0_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ELLIPSIS);
    p = r; // pin = 1
    r = r && report_error_(b, nest_0_3_0_1(b, l + 1, _p2));
    r = p && _p.parse(b, l) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [<<p2>>]
  private static boolean nest_0_3_0_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "nest_0_3_0_1")) return false;
    _p2.parse(b, l);
    return true;
  }

  // '<+...' [<<p2>>] <<p>> ('...' [<<p2>>] <<p>>)* '...+>'
  private static boolean nest_1(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "nest_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NEST_PLUS_OPEN);
    p = r; // pin = 1
    r = r && report_error_(b, nest_1_1(b, l + 1, _p2));
    r = p && report_error_(b, _p.parse(b, l)) && r;
    r = p && report_error_(b, nest_1_3(b, l + 1, _p2, _p)) && r;
    r = p && consumeToken(b, NEST_PLUS_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [<<p2>>]
  private static boolean nest_1_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "nest_1_1")) return false;
    _p2.parse(b, l);
    return true;
  }

  // ('...' [<<p2>>] <<p>>)*
  private static boolean nest_1_3(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "nest_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nest_1_3_0(b, l + 1, _p2, _p)) break;
      if (!empty_element_parsed_guard_(b, "nest_1_3", c)) break;
    }
    return true;
  }

  // '...' [<<p2>>] <<p>>
  private static boolean nest_1_3_0(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "nest_1_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ELLIPSIS);
    p = r; // pin = 1
    r = r && report_error_(b, nest_1_3_0_1(b, l + 1, _p2));
    r = p && _p.parse(b, l) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [<<p2>>]
  private static boolean nest_1_3_0_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "nest_1_3_0_1")) return false;
    _p2.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // <<expr_rec nest_expr>> | <<nest nest_expr exp_whencode>>
  public static boolean nest_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nest_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEST_EXPR, "<expression>");
    r = expr_rec(b, l + 1, SmPLCParser::nest_expr);
    if (!r) r = nest(b, l + 1, SmPLCParser::nest_expr, SmPLCParser::exp_whencode);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // single_one_decl | <<conjunct one_decl>> | <<disjunct one_decl>>
  public static boolean one_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ONE_DECL, "<declaration>");
    r = single_one_decl(b, l + 1);
    if (!r) r = conjunct(b, l + 1, SmPLCParser::one_decl);
    if (!r) r = disjunct(b, l + 1, SmPLCParser::one_decl);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ['...' <<p2>>*] <<p>> ('...' <<p2>>* <<p>>)* ['...' <<p2>>*]
  static boolean optDotSeq(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "optDotSeq")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optDotSeq_0(b, l + 1, _p2);
    r = r && _p.parse(b, l);
    r = r && optDotSeq_2(b, l + 1, _p2, _p);
    r = r && optDotSeq_3(b, l + 1, _p2);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['...' <<p2>>*]
  private static boolean optDotSeq_0(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "optDotSeq_0")) return false;
    optDotSeq_0_0(b, l + 1, _p2);
    return true;
  }

  // '...' <<p2>>*
  private static boolean optDotSeq_0_0(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "optDotSeq_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && optDotSeq_0_0_1(b, l + 1, _p2);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<p2>>*
  private static boolean optDotSeq_0_0_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "optDotSeq_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!_p2.parse(b, l)) break;
      if (!empty_element_parsed_guard_(b, "optDotSeq_0_0_1", c)) break;
    }
    return true;
  }

  // ('...' <<p2>>* <<p>>)*
  private static boolean optDotSeq_2(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "optDotSeq_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optDotSeq_2_0(b, l + 1, _p2, _p)) break;
      if (!empty_element_parsed_guard_(b, "optDotSeq_2", c)) break;
    }
    return true;
  }

  // '...' <<p2>>* <<p>>
  private static boolean optDotSeq_2_0(PsiBuilder b, int l, Parser _p2, Parser _p) {
    if (!recursion_guard_(b, l, "optDotSeq_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && optDotSeq_2_0_1(b, l + 1, _p2);
    r = r && _p.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<p2>>*
  private static boolean optDotSeq_2_0_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "optDotSeq_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!_p2.parse(b, l)) break;
      if (!empty_element_parsed_guard_(b, "optDotSeq_2_0_1", c)) break;
    }
    return true;
  }

  // ['...' <<p2>>*]
  private static boolean optDotSeq_3(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "optDotSeq_3")) return false;
    optDotSeq_3_0(b, l + 1, _p2);
    return true;
  }

  // '...' <<p2>>*
  private static boolean optDotSeq_3_0(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "optDotSeq_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && optDotSeq_3_0_1(b, l + 1, _p2);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<p2>>*
  private static boolean optDotSeq_3_0_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "optDotSeq_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!_p2.parse(b, l)) break;
      if (!empty_element_parsed_guard_(b, "optDotSeq_3_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type id | WORD | '......'
  public static boolean param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM, "<param>");
    r = param_0(b, l + 1);
    if (!r) r = consumeToken(b, WORD);
    if (!r) r = consumeToken(b, DOUBLE_ELLIPSIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type id
  private static boolean param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = type(b, l + 1);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<commaSeparate (<<p>> | '...' [<<p2>>])>>
  public static boolean paramSeq(PsiBuilder b, int l, Parser _p, Parser _p2) {
    if (!recursion_guard_(b, l, "paramSeq")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSeparate(b, l + 1, paramSeq_0_0_$(_p, _p2));
    exit_section_(b, m, PARAM_SEQ, r);
    return r;
  }

  private static Parser paramSeq_0_0_$(Parser _p, Parser _p2) {
    return (b, l) -> paramSeq_0_0(b, l + 1, _p, _p2);
  }

  // <<p>> | '...' [<<p2>>]
  private static boolean paramSeq_0_0(PsiBuilder b, int l, Parser _p, Parser _p2) {
    if (!recursion_guard_(b, l, "paramSeq_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p.parse(b, l);
    if (!r) r = paramSeq_0_0_1(b, l + 1, _p2);
    exit_section_(b, m, null, r);
    return r;
  }

  // '...' [<<p2>>]
  private static boolean paramSeq_0_0_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "paramSeq_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && paramSeq_0_0_1_1(b, l + 1, _p2);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<p2>>]
  private static boolean paramSeq_0_0_1_1(PsiBuilder b, int l, Parser _p2) {
    if (!recursion_guard_(b, l, "paramSeq_0_0_1_1")) return false;
    _p2.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // '#pragma' id id+
  public static boolean pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma")) return false;
    if (!nextTokenIs(b, HASH_PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH_PRAGMA);
    r = r && id(b, l + 1);
    r = r && pragma_2(b, l + 1);
    exit_section_(b, m, PRAGMA, r);
    return r;
  }

  // id+
  private static boolean pragma_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!id(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pragma_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '#pragma' id '...'
  public static boolean pragma_ellipsis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_ellipsis")) return false;
    if (!nextTokenIs(b, HASH_PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH_PRAGMA);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, ELLIPSIS);
    exit_section_(b, m, PRAGMA_ELLIPSIS, r);
    return r;
  }

  /* ********************************************************** */
  // single_rule_elem_stmt | multi_rule_elem_stmt
  public static boolean rule_elem_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_elem_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, RULE_ELEM_STMT, "<statement>");
    r = single_rule_elem_stmt(b, l + 1);
    if (!r) r = multi_rule_elem_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !';'
  static boolean semi_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [storage] fn_ctype '(' '*' d_ident ')' '(' <<paramSeq name_opt_decl ()>> ')' '=' initialize
  public static boolean single_decl_fn_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_fn_init")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_DECL_FN_INIT, "<single decl fn init>");
    r = single_decl_fn_init_0(b, l + 1);
    r = r && fn_ctype(b, l + 1);
    r = r && consumeTokens(b, 0, LPAREN, TIMES);
    r = r && d_ident(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LPAREN);
    r = r && paramSeq(b, l + 1, SmPLCParser::name_opt_decl, SmPLCParser::single_decl_fn_init_7_1);
    r = r && consumeTokens(b, 2, RPAREN, EQUALS);
    p = r; // pin = 10
    r = r && initialize(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [storage]
  private static boolean single_decl_fn_init_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_fn_init_0")) return false;
    storage(b, l + 1);
    return true;
  }

  // ()
  private static boolean single_decl_fn_init_7_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // [storage] ctype <<commaSeparate d_ident>>
  public static boolean single_decl_idents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_idents")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_DECL_IDENTS, "<single decl idents>");
    r = single_decl_idents_0(b, l + 1);
    r = r && ctype(b, l + 1);
    r = r && commaSeparate(b, l + 1, SmPLCParser::d_ident);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [storage]
  private static boolean single_decl_idents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_idents_0")) return false;
    storage(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [storage] [const_vol] id <<commaSeparate d_ident>>
  public static boolean single_decl_idents2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_idents2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_DECL_IDENTS_2, "<single decl idents 2>");
    r = single_decl_idents2_0(b, l + 1);
    r = r && single_decl_idents2_1(b, l + 1);
    r = r && id(b, l + 1);
    r = r && commaSeparate(b, l + 1, SmPLCParser::d_ident);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [storage]
  private static boolean single_decl_idents2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_idents2_0")) return false;
    storage(b, l + 1);
    return true;
  }

  // [const_vol]
  private static boolean single_decl_idents2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_idents2_1")) return false;
    const_vol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'typedef' ctype <<commaSeparate typedef_ident>>
  public static boolean single_decl_typedef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_typedef")) return false;
    if (!nextTokenIs(b, TYPEDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPEDEF);
    r = r && ctype(b, l + 1);
    r = r && commaSeparate(b, l + 1, SmPLCParser::typedef_ident);
    exit_section_(b, m, SINGLE_DECL_TYPEDEF, r);
    return r;
  }

  /* ********************************************************** */
  // 'typedef' ctype typedef_ident upto_two_exprs
  public static boolean single_decl_typedef_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_typedef_expr")) return false;
    if (!nextTokenIs(b, "<expression>", TYPEDEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_DECL_TYPEDEF_EXPR, "<expression>");
    r = consumeToken(b, TYPEDEF);
    r = r && ctype(b, l + 1);
    r = r && typedef_ident(b, l + 1);
    r = r && upto_two_exprs(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // single_decl_var_ ';'
  public static boolean single_decl_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_var")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_DECL_VAR, "<single decl var>");
    r = single_decl_var_(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // common_decl_ |
  //     single_decl_idents |
  //     // TODO: these may be the same (and some of the other rules, since ctype can match id)
  //     single_decl_idents2 |
  //     single_decl_fn_init |
  //     single_decl_typedef |
  //     single_decl_typedef_expr
  static boolean single_decl_var_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_decl_var_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = common_decl_(b, l + 1);
    if (!r) r = single_decl_idents(b, l + 1);
    if (!r) r = single_decl_idents2(b, l + 1);
    if (!r) r = single_decl_fn_init(b, l + 1);
    if (!r) r = single_decl_typedef(b, l + 1);
    if (!r) r = single_decl_typedef_expr(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLCParser::semi_recover);
    return r;
  }

  /* ********************************************************** */
  // single_one_decl_ ';'
  public static boolean single_one_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, SINGLE_ONE_DECL, "<declaration>");
    r = single_one_decl_(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // common_decl_ |
  //     single_one_decl_ident |
  //     single_one_decl_ident2
  //     OR(one_decl) |
  //     AND(one_decl)
  static boolean single_one_decl_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = common_decl_(b, l + 1);
    if (!r) r = single_one_decl_ident(b, l + 1);
    if (!r) r = single_one_decl__2(b, l + 1);
    if (!r) r = single_one_decl__3(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLCParser::semi_recover);
    return r;
  }

  // single_one_decl_ident2
  //     OR(one_decl)
  private static boolean single_one_decl__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_one_decl_ident2(b, l + 1);
    r = r && consumeToken(b, OR);
    r = r && single_one_decl__2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (one_decl)
  private static boolean single_one_decl__2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl__2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = one_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AND(one_decl)
  private static boolean single_one_decl__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl__3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && single_one_decl__3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (one_decl)
  private static boolean single_one_decl__3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl__3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = one_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [storage] ctype id [attribute]
  public static boolean single_one_decl_ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl_ident")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_ONE_DECL_IDENT, "<single one decl ident>");
    r = single_one_decl_ident_0(b, l + 1);
    r = r && ctype(b, l + 1);
    r = r && id(b, l + 1);
    r = r && single_one_decl_ident_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [storage]
  private static boolean single_one_decl_ident_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl_ident_0")) return false;
    storage(b, l + 1);
    return true;
  }

  // [attribute]
  private static boolean single_one_decl_ident_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl_ident_3")) return false;
    attribute(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [storage] [const_vol] id d_ident
  public static boolean single_one_decl_ident2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl_ident2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_ONE_DECL_IDENT_2, "<single one decl ident 2>");
    r = single_one_decl_ident2_0(b, l + 1);
    r = r && single_one_decl_ident2_1(b, l + 1);
    r = r && id(b, l + 1);
    r = r && d_ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [storage]
  private static boolean single_one_decl_ident2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl_ident2_0")) return false;
    storage(b, l + 1);
    return true;
  }

  // [const_vol]
  private static boolean single_one_decl_ident2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_one_decl_ident2_1")) return false;
    const_vol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // single_rule_elem_stmt_ ';'
  public static boolean single_rule_elem_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_rule_elem_stmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_RULE_ELEM_STMT, "<statement>");
    r = single_rule_elem_stmt_(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // one_decl |
  //     expr |
  //     single_rule_elem_stmt_return
  //     single_rule_elem_stmt_break
  //     single_rule_elem_stmt_continue
  static boolean single_rule_elem_stmt_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_rule_elem_stmt_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = one_decl(b, l + 1);
    if (!r) r = expr(b, l + 1);
    if (!r) r = single_rule_elem_stmt__2(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLCParser::semi_recover);
    return r;
  }

  // single_rule_elem_stmt_return
  //     single_rule_elem_stmt_break
  //     single_rule_elem_stmt_continue
  private static boolean single_rule_elem_stmt__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_rule_elem_stmt__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_rule_elem_stmt_return(b, l + 1);
    r = r && single_rule_elem_stmt_break(b, l + 1);
    r = r && single_rule_elem_stmt_continue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'break'
  public static boolean single_rule_elem_stmt_break(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_rule_elem_stmt_break")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    exit_section_(b, m, SINGLE_RULE_ELEM_STMT_BREAK, r);
    return r;
  }

  /* ********************************************************** */
  // 'continue'
  public static boolean single_rule_elem_stmt_continue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_rule_elem_stmt_continue")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, SINGLE_RULE_ELEM_STMT_CONTINUE, r);
    return r;
  }

  /* ********************************************************** */
  // 'return' [expr]
  public static boolean single_rule_elem_stmt_return(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_rule_elem_stmt_return")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_RULE_ELEM_STMT_RETURN, null);
    r = consumeToken(b, RETURN);
    p = r; // pin = 1
    r = r && single_rule_elem_stmt_return_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [expr]
  private static boolean single_rule_elem_stmt_return_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_rule_elem_stmt_return_1")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // stmt | <<conjunct stmt>> | <<disjunct stmt>>
  public static boolean single_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SINGLE_STMT, "<statement>");
    r = stmt(b, l + 1);
    if (!r) r = conjunct(b, l + 1, SmPLCParser::stmt);
    if (!r) r = disjunct(b, l + 1, SmPLCParser::stmt);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // directive |
  //     WORD |
  //     [expr] ';' |
  //     stmt_if |
  //     stmt_for |
  //     stmt_while |
  //     stmt_do |
  //     stmt_meta_iter |
  //     stmt_switch |
  //     stmt_return |
  //     stmt_block |
  //     stmt_break |
  //     stmt_continue |
  //     stmt_label |
  //     stmt_goto |
  //     stmt_nest_decl |
  //     stmt_nest_expr
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<statement>");
    r = directive(b, l + 1);
    if (!r) r = consumeToken(b, WORD);
    if (!r) r = stmt_2(b, l + 1);
    if (!r) r = stmt_if(b, l + 1);
    if (!r) r = stmt_for(b, l + 1);
    if (!r) r = stmt_while(b, l + 1);
    if (!r) r = stmt_do(b, l + 1);
    if (!r) r = stmt_meta_iter(b, l + 1);
    if (!r) r = stmt_switch(b, l + 1);
    if (!r) r = stmt_return(b, l + 1);
    if (!r) r = stmt_block(b, l + 1);
    if (!r) r = stmt_break(b, l + 1);
    if (!r) r = stmt_continue(b, l + 1);
    if (!r) r = stmt_label(b, l + 1);
    if (!r) r = stmt_goto(b, l + 1);
    if (!r) r = stmt_nest_decl(b, l + 1);
    if (!r) r = stmt_nest_expr(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLCParser::stmt_recover);
    return r;
  }

  // [expr] ';'
  private static boolean stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_2_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expr]
  private static boolean stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_2_0")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' [stmt_seq] '}'
  public static boolean stmt_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_BLOCK, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, stmt_block_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [stmt_seq]
  private static boolean stmt_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_block_1")) return false;
    stmt_seq(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'break' ';'
  public static boolean stmt_break(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_break")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_BREAK, null);
    r = consumeTokens(b, 1, BREAK, SEMICOLON);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'continue' ';'
  public static boolean stmt_continue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_continue")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_CONTINUE, null);
    r = consumeTokens(b, 1, CONTINUE, SEMICOLON);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'do' single_stmt 'while' '(' dot_expr ')' ';'
  public static boolean stmt_do(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_do")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_DO, null);
    r = consumeToken(b, DO);
    p = r; // pin = 1
    r = r && report_error_(b, single_stmt(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, WHILE, LPAREN)) && r;
    r = p && report_error_(b, dot_expr(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, SEMICOLON)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'for' '(' [dot_expr] ';' [dot_expr] ';' [dot_expr] ')' single_stmt
  public static boolean stmt_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_for")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_FOR, null);
    r = consumeTokens(b, 1, FOR, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, stmt_for_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, SEMICOLON)) && r;
    r = p && report_error_(b, stmt_for_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, SEMICOLON)) && r;
    r = p && report_error_(b, stmt_for_6(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && single_stmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [dot_expr]
  private static boolean stmt_for_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_for_2")) return false;
    dot_expr(b, l + 1);
    return true;
  }

  // [dot_expr]
  private static boolean stmt_for_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_for_4")) return false;
    dot_expr(b, l + 1);
    return true;
  }

  // [dot_expr]
  private static boolean stmt_for_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_for_6")) return false;
    dot_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'goto' id
  public static boolean stmt_goto(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_goto")) return false;
    if (!nextTokenIs(b, GOTO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_GOTO, null);
    r = consumeToken(b, GOTO);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'if' '(' dot_expr ')' single_stmt ['else' single_stmt]
  public static boolean stmt_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_if")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_IF, null);
    r = consumeTokens(b, 1, IF, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, dot_expr(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && report_error_(b, single_stmt(b, l + 1)) && r;
    r = p && stmt_if_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ['else' single_stmt]
  private static boolean stmt_if_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_if_5")) return false;
    stmt_if_5_0(b, l + 1);
    return true;
  }

  // 'else' single_stmt
  private static boolean stmt_if_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_if_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && single_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id ':'
  public static boolean stmt_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_label")) return false;
    if (!nextTokenIs(b, "<stmt label>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT_LABEL, "<stmt label>");
    r = id(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // iter_ident '(' dot_expr* ')' single_stmt
  public static boolean stmt_meta_iter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_meta_iter")) return false;
    if (!nextTokenIs(b, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = iter_ident(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && stmt_meta_iter_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && single_stmt(b, l + 1);
    exit_section_(b, m, STMT_META_ITER, r);
    return r;
  }

  // dot_expr*
  private static boolean stmt_meta_iter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_meta_iter_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dot_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_meta_iter_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<nest decl_stmt+ when_cond>>
  public static boolean stmt_nest_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_nest_decl")) return false;
    if (!nextTokenIs(b, "<declaration>", NEST_PLUS_OPEN, NEST_REG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT_NEST_DECL, "<declaration>");
    r = nest(b, l + 1, SmPLCParser::stmt_nest_decl_0_0, SmPLCParser::when_cond);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_stmt+
  private static boolean stmt_nest_decl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_nest_decl_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_stmt(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decl_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_nest_decl_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<nest expr when_cond>>
  public static boolean stmt_nest_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_nest_expr")) return false;
    if (!nextTokenIs(b, "<expression>", NEST_PLUS_OPEN, NEST_REG_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT_NEST_EXPR, "<expression>");
    r = nest(b, l + 1, SmPLCParser::expr, SmPLCParser::when_cond);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(';' | '{' | '}')
  static boolean stmt_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !stmt_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';' | '{' | '}'
  private static boolean stmt_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_recover_0")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

  /* ********************************************************** */
  // 'return' [dot_expr] ';'
  public static boolean stmt_return(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_return")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_RETURN, null);
    r = consumeToken(b, RETURN);
    p = r; // pin = 1
    r = r && report_error_(b, stmt_return_1(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [dot_expr]
  private static boolean stmt_return_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_return_1")) return false;
    dot_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // decl_stmt* [<<dotSeq (decl_stmt+ | expr) when_cond>> decl_stmt*]
  public static boolean stmt_seq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_seq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT_SEQ, "<stmt seq>");
    r = stmt_seq_0(b, l + 1);
    r = r && stmt_seq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_stmt*
  private static boolean stmt_seq_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_seq_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!decl_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_seq_0", c)) break;
    }
    return true;
  }

  // [<<dotSeq (decl_stmt+ | expr) when_cond>> decl_stmt*]
  private static boolean stmt_seq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_seq_1")) return false;
    stmt_seq_1_0(b, l + 1);
    return true;
  }

  // <<dotSeq (decl_stmt+ | expr) when_cond>> decl_stmt*
  private static boolean stmt_seq_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_seq_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotSeq(b, l + 1, SmPLCParser::stmt_seq_1_0_0_0, SmPLCParser::when_cond);
    r = r && stmt_seq_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decl_stmt+ | expr
  private static boolean stmt_seq_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_seq_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_seq_1_0_0_0_0(b, l + 1);
    if (!r) r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decl_stmt+
  private static boolean stmt_seq_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_seq_1_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_stmt(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decl_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_seq_1_0_0_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // decl_stmt*
  private static boolean stmt_seq_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_seq_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!decl_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_seq_1_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'switch' '(' [dot_expr] ')' '{' case_line* '}'
  public static boolean stmt_switch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_switch")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_SWITCH, null);
    r = consumeTokens(b, 1, SWITCH, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, stmt_switch_2(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, LBRACE)) && r;
    r = p && report_error_(b, stmt_switch_5(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [dot_expr]
  private static boolean stmt_switch_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_switch_2")) return false;
    dot_expr(b, l + 1);
    return true;
  }

  // case_line*
  private static boolean stmt_switch_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_switch_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_line(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmt_switch_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'while' '(' dot_expr ')' single_stmt
  public static boolean stmt_while(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_while")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STMT_WHILE, null);
    r = consumeTokens(b, 1, WHILE, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, dot_expr(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && single_stmt(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'static' | 'auto' | 'register' | 'extern'
  public static boolean storage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "storage")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STORAGE, "<storage>");
    r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, AUTO);
    if (!r) r = consumeToken(b, REGISTER);
    if (!r) r = consumeToken(b, EXTERN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_decl_ ';'
  public static boolean struct_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECL, "<declaration>");
    r = struct_decl_(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_decl_reg |
  //     struct_decl_fn
  static boolean struct_decl_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = struct_decl_reg(b, l + 1);
    if (!r) r = struct_decl_fn(b, l + 1);
    exit_section_(b, l, m, r, false, SmPLCParser::stmt_recover);
    return r;
  }

  /* ********************************************************** */
  // fn_ctype '(' '*' d_ident ')' '(' <<commaSeparate (name_opt_decl | '...')>> ')'
  public static boolean struct_decl_fn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_fn")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECL_FN, "<struct decl fn>");
    r = fn_ctype(b, l + 1);
    r = r && consumeTokens(b, 1, LPAREN, TIMES);
    p = r; // pin = 2
    r = r && report_error_(b, d_ident(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, RPAREN, LPAREN)) && r;
    r = p && report_error_(b, commaSeparate(b, l + 1, SmPLCParser::struct_decl_fn_6_0)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // name_opt_decl | '...'
  private static boolean struct_decl_fn_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_fn_6_0")) return false;
    boolean r;
    r = name_opt_decl(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    return r;
  }

  /* ********************************************************** */
  // struct_decl [struct_decl_list] |
  //     '...' ['when' '!=' struct_decl] [continue_struct_decl_list]
  public static boolean struct_decl_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECL_LIST, "<struct decl list>");
    r = struct_decl_list_0(b, l + 1);
    if (!r) r = struct_decl_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // struct_decl [struct_decl_list]
  private static boolean struct_decl_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_decl(b, l + 1);
    r = r && struct_decl_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [struct_decl_list]
  private static boolean struct_decl_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list_0_1")) return false;
    struct_decl_list(b, l + 1);
    return true;
  }

  // '...' ['when' '!=' struct_decl] [continue_struct_decl_list]
  private static boolean struct_decl_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && struct_decl_list_1_1(b, l + 1);
    r = r && struct_decl_list_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['when' '!=' struct_decl]
  private static boolean struct_decl_list_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list_1_1")) return false;
    struct_decl_list_1_1_0(b, l + 1);
    return true;
  }

  // 'when' '!=' struct_decl
  private static boolean struct_decl_list_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHEN, NE);
    r = r && struct_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [continue_struct_decl_list]
  private static boolean struct_decl_list_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list_1_2")) return false;
    continue_struct_decl_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ctype d_ident
  public static boolean struct_decl_reg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_reg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECL_REG, "<struct decl reg>");
    r = ctype(b, l + 1);
    r = r && d_ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr |
  //     decl_stmt+ |
  //     fundecl
  public static boolean top(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP, "<top>");
    r = expr(b, l + 1);
    if (!r) r = top_1(b, l + 1);
    if (!r) r = fundecl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_stmt+
  private static boolean top_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_stmt(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decl_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "top_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // include+ | <<optDotSeq top when_cond>>
  static boolean transformation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "transformation")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = transformation_0(b, l + 1);
    if (!r) r = optDotSeq(b, l + 1, SmPLCParser::top, SmPLCParser::when_cond);
    exit_section_(b, m, null, r);
    return r;
  }

  // include+
  private static boolean transformation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "transformation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!include(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "transformation_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ctype | WORD
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE, "<type>");
    r = ctype(b, l + 1);
    if (!r) r = consumeToken(b, WORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean typedef_ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_ident")) return false;
    if (!nextTokenIs(b, "<typedef ident>", LPAREN, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPEDEF_IDENT, "<typedef ident>");
    r = id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '++' | '--' | '&' | '*' | '+' | '-' | '!'
  public static boolean unary_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OP, "<unary op>");
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, TIMES);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '#undef' id
  public static boolean undef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "undef")) return false;
    if (!nextTokenIs(b, HASH_UNDEF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, UNDEF, null);
    r = consumeToken(b, HASH_UNDEF);
    p = r; // pin = 1
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // expr expr | [expr]
  static boolean upto_two_exprs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upto_two_exprs")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = upto_two_exprs_0(b, l + 1);
    if (!r) r = upto_two_exprs_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr expr
  private static boolean upto_two_exprs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upto_two_exprs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expr]
  private static boolean upto_two_exprs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "upto_two_exprs_1")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<commaSeparate any_strict>>
  public static boolean when_any(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_any")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_ANY, "<when any>");
    r = commaSeparate(b, l + 1, SmPLCParser::any_strict);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<optDotSeq decl_stmt+ when_cond>> | <<optDotSeq expr when_cond>>
  public static boolean when_code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_code")) return false;
    if (!nextTokenIs(b, "<when code>", ELLIPSIS, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHEN_CODE, "<when code>");
    r = optDotSeq(b, l + 1, SmPLCParser::when_code_0_0, SmPLCParser::when_cond);
    if (!r) r = optDotSeq(b, l + 1, SmPLCParser::expr, SmPLCParser::when_cond);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_stmt+
  private static boolean when_code_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_code_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_stmt(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decl_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "when_code_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'when' when_cond_
  public static boolean when_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_cond")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_COND, null);
    r = consumeToken(b, WHEN);
    p = r; // pin = 1
    r = r && when_cond_(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // when_ne |
  //     when_eq |
  //     when_any |
  //     when_true_ne |
  //     when_false_ne
  static boolean when_cond_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_cond_")) return false;
    boolean r;
    r = when_ne(b, l + 1);
    if (!r) r = when_eq(b, l + 1);
    if (!r) r = when_any(b, l + 1);
    if (!r) r = when_true_ne(b, l + 1);
    if (!r) r = when_false_ne(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '=' rule_elem_stmt
  public static boolean when_eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_eq")) return false;
    if (!nextTokenIs(b, EQUALS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_EQ, null);
    r = consumeToken(b, EQUALS);
    p = r; // pin = 1
    r = r && rule_elem_stmt(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'false' '!=' expr
  public static boolean when_false_ne(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_false_ne")) return false;
    if (!nextTokenIs(b, FALSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_FALSE_NE, null);
    r = consumeTokens(b, 1, FALSE, NE);
    p = r; // pin = 1
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '!=' when_code
  public static boolean when_ne(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_ne")) return false;
    if (!nextTokenIs(b, NE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_NE, null);
    r = consumeToken(b, NE);
    p = r; // pin = 1
    r = r && when_code(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // 'true' '!=' expr
  public static boolean when_true_ne(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_true_ne")) return false;
    if (!nextTokenIs(b, TRUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_TRUE_NE, null);
    r = consumeTokens(b, 1, TRUE, NE);
    p = r; // pin = 1
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  static final Parser WORD_parser_ = (b, l) -> consumeToken(b, WORD);
}
