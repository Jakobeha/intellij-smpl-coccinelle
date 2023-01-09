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

public class SmPLCExprRecImpl extends SmPLCCompositeElementImpl implements SmPLCExprRec {

  public SmPLCExprRecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitExprRec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SmPLCExprHead getExprHead() {
    return findNotNullChildByClass(SmPLCExprHead.class);
  }

  @Override
  @NotNull
  public List<SmPLCExprTail> getExprTailList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCExprTail.class);
  }

}
