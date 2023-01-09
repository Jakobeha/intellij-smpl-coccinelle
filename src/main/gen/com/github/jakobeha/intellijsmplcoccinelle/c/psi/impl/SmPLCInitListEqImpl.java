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

public class SmPLCInitListEqImpl extends SmPLCCompositeElementImpl implements SmPLCInitListEq {

  public SmPLCInitListEqImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitInitListEq(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SmPLCDesignator getDesignator() {
    return findNotNullChildByClass(SmPLCDesignator.class);
  }

  @Override
  @Nullable
  public SmPLCInitialize getInitialize() {
    return findChildByClass(SmPLCInitialize.class);
  }

  @Override
  @Nullable
  public PsiElement getEquals() {
    return findChildByType(EQUALS);
  }

}
