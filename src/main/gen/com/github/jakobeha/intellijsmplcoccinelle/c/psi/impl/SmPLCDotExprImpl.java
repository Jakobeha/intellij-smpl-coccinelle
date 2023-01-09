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

public class SmPLCDotExprImpl extends SmPLCExprImpl implements SmPLCDotExpr {

  public SmPLCDotExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitDotExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCExpWhencode getExpWhencode() {
    return findChildByClass(SmPLCExpWhencode.class);
  }

  @Override
  @Nullable
  public SmPLCExprRec getExprRec() {
    return findChildByClass(SmPLCExprRec.class);
  }

  @Override
  @Nullable
  public SmPLCNest getNest() {
    return findChildByClass(SmPLCNest.class);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

}
