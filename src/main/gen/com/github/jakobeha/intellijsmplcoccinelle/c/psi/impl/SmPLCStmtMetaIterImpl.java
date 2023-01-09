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

public class SmPLCStmtMetaIterImpl extends SmPLCCompositeElementImpl implements SmPLCStmtMetaIter {

  public SmPLCStmtMetaIterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitStmtMetaIter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SmPLCDotExpr> getDotExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCDotExpr.class);
  }

  @Override
  @NotNull
  public SmPLCIterIdent getIterIdent() {
    return findNotNullChildByClass(SmPLCIterIdent.class);
  }

  @Override
  @NotNull
  public SmPLCStmt getStmt() {
    return findNotNullChildByClass(SmPLCStmt.class);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return findNotNullChildByType(LPAREN);
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return findNotNullChildByType(RPAREN);
  }

}
