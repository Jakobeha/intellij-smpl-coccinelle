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

public class SmPLCInitListElemImpl extends SmPLCCompositeElementImpl implements SmPLCInitListElem {

  public SmPLCInitListElemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitInitListElem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCDotExpr getDotExpr() {
    return findChildByClass(SmPLCDotExpr.class);
  }

  @Override
  @Nullable
  public SmPLCInitListColon getInitListColon() {
    return findChildByClass(SmPLCInitListColon.class);
  }

  @Override
  @Nullable
  public SmPLCInitListEq getInitListEq() {
    return findChildByClass(SmPLCInitListEq.class);
  }

  @Override
  @Nullable
  public PsiElement getWord() {
    return findChildByType(WORD);
  }

}
