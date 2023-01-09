// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCTypes.*;
import com.github.jakobeha.intellijsmplcoccinelle.c.psi.*;

public class SmPLCFundeclImpl extends SmPLCDeclImpl implements SmPLCFundecl {

  public SmPLCFundeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitFundecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCExpr getExpr() {
    return findChildByClass(SmPLCExpr.class);
  }

  @Override
  @NotNull
  public SmPLCFunid getFunid() {
    return findNotNullChildByClass(SmPLCFunid.class);
  }

  @Override
  @NotNull
  public List<SmPLCFuninfo> getFuninfoList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCFuninfo.class);
  }

  @Override
  @Nullable
  public SmPLCParamSeq getParamSeq() {
    return findChildByClass(SmPLCParamSeq.class);
  }

  @Override
  @Nullable
  public SmPLCStmtSeq getStmtSeq() {
    return findChildByClass(SmPLCStmtSeq.class);
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return findNotNullChildByType(LBRACE);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return findNotNullChildByType(LPAREN);
  }

  @Override
  @NotNull
  public PsiElement getRbrace() {
    return findNotNullChildByType(RBRACE);
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return findNotNullChildByType(RPAREN);
  }

}
