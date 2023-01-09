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

public class SmPLCSingleDeclTypedefExprImpl extends SmPLCExprImpl implements SmPLCSingleDeclTypedefExpr {

  public SmPLCSingleDeclTypedefExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitSingleDeclTypedefExpr(this);
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
  public SmPLCTypedefIdent getTypedefIdent() {
    return findNotNullChildByClass(SmPLCTypedefIdent.class);
  }

  @Override
  @NotNull
  public PsiElement getTypedef() {
    return findNotNullChildByType(TYPEDEF);
  }

}
