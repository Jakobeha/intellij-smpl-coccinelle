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

public class SmPLCTopImpl extends SmPLCCompositeElementImpl implements SmPLCTop {

  public SmPLCTopImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitTop(this);
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
  @Nullable
  public SmPLCFundecl getFundecl() {
    return findChildByClass(SmPLCFundecl.class);
  }

  @Override
  @NotNull
  public List<SmPLCStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCStmt.class);
  }

}
