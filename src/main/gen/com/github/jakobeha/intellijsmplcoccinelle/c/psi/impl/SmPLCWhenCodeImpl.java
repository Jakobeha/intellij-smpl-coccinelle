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

public class SmPLCWhenCodeImpl extends SmPLCCompositeElementImpl implements SmPLCWhenCode {

  public SmPLCWhenCodeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitWhenCode(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SmPLCExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCExpr.class);
  }

  @Override
  @NotNull
  public List<SmPLCStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCStmt.class);
  }

  @Override
  @NotNull
  public List<SmPLCWhenCond> getWhenCondList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCWhenCond.class);
  }

}
