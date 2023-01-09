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

public class SmPLCBinOpImpl extends SmPLCCompositeElementImpl implements SmPLCBinOp {

  public SmPLCBinOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitBinOp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAnd() {
    return findChildByType(AND);
  }

  @Override
  @Nullable
  public PsiElement getDivide() {
    return findChildByType(DIVIDE);
  }

  @Override
  @Nullable
  public PsiElement getDoubleAnd() {
    return findChildByType(DOUBLE_AND);
  }

  @Override
  @Nullable
  public PsiElement getDoubleOr() {
    return findChildByType(DOUBLE_OR);
  }

  @Override
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

  @Override
  @Nullable
  public PsiElement getGe() {
    return findChildByType(GE);
  }

  @Override
  @Nullable
  public PsiElement getGt() {
    return findChildByType(GT);
  }

  @Override
  @Nullable
  public PsiElement getLe() {
    return findChildByType(LE);
  }

  @Override
  @Nullable
  public PsiElement getLshift() {
    return findChildByType(LSHIFT);
  }

  @Override
  @Nullable
  public PsiElement getLt() {
    return findChildByType(LT);
  }

  @Override
  @Nullable
  public PsiElement getMinus() {
    return findChildByType(MINUS);
  }

  @Override
  @Nullable
  public PsiElement getMod() {
    return findChildByType(MOD);
  }

  @Override
  @Nullable
  public PsiElement getNe() {
    return findChildByType(NE);
  }

  @Override
  @Nullable
  public PsiElement getOr() {
    return findChildByType(OR);
  }

  @Override
  @Nullable
  public PsiElement getPlus() {
    return findChildByType(PLUS);
  }

  @Override
  @Nullable
  public PsiElement getRshift() {
    return findChildByType(RSHIFT);
  }

  @Override
  @Nullable
  public PsiElement getTimes() {
    return findChildByType(TIMES);
  }

  @Override
  @Nullable
  public PsiElement getXor() {
    return findChildByType(XOR);
  }

}
