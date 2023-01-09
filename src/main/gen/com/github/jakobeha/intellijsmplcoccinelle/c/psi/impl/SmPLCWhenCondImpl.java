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

public class SmPLCWhenCondImpl extends SmPLCCompositeElementImpl implements SmPLCWhenCond {

  public SmPLCWhenCondImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitWhenCond(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCWhenAny getWhenAny() {
    return findChildByClass(SmPLCWhenAny.class);
  }

  @Override
  @Nullable
  public SmPLCWhenEq getWhenEq() {
    return findChildByClass(SmPLCWhenEq.class);
  }

  @Override
  @Nullable
  public SmPLCWhenFalseNe getWhenFalseNe() {
    return findChildByClass(SmPLCWhenFalseNe.class);
  }

  @Override
  @Nullable
  public SmPLCWhenNe getWhenNe() {
    return findChildByClass(SmPLCWhenNe.class);
  }

  @Override
  @Nullable
  public SmPLCWhenTrueNe getWhenTrueNe() {
    return findChildByClass(SmPLCWhenTrueNe.class);
  }

  @Override
  @NotNull
  public PsiElement getWhen() {
    return findNotNullChildByType(WHEN);
  }

}
