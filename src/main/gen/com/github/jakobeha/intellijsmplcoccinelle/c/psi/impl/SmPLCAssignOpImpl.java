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

public class SmPLCAssignOpImpl extends SmPLCCompositeElementImpl implements SmPLCAssignOp {

  public SmPLCAssignOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitAssignOp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAndEquals() {
    return findChildByType(AND_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getDivideEquals() {
    return findChildByType(DIVIDE_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getEquals() {
    return findChildByType(EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getLshiftEquals() {
    return findChildByType(LSHIFT_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getMinusEquals() {
    return findChildByType(MINUS_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getModEquals() {
    return findChildByType(MOD_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getOrEquals() {
    return findChildByType(OR_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getPlusEquals() {
    return findChildByType(PLUS_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getRshiftEquals() {
    return findChildByType(RSHIFT_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getTimesEquals() {
    return findChildByType(TIMES_EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getXorEquals() {
    return findChildByType(XOR_EQUALS);
  }

}
