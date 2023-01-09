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

public class SmPLCNestImpl extends SmPLCCompositeElementImpl implements SmPLCNest {

  public SmPLCNestImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitNest(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getNestPlusClose() {
    return findChildByType(NEST_PLUS_CLOSE);
  }

  @Override
  @Nullable
  public PsiElement getNestPlusOpen() {
    return findChildByType(NEST_PLUS_OPEN);
  }

  @Override
  @Nullable
  public PsiElement getNestRegClose() {
    return findChildByType(NEST_REG_CLOSE);
  }

  @Override
  @Nullable
  public PsiElement getNestRegOpen() {
    return findChildByType(NEST_REG_OPEN);
  }

}
