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

public class SmPLCGenericCtypeImpl extends SmPLCExprImpl implements SmPLCGenericCtype {

  public SmPLCGenericCtypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitGenericCtype(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCCtypeEnum getCtypeEnum() {
    return findChildByClass(SmPLCCtypeEnum.class);
  }

  @Override
  @Nullable
  public SmPLCCtypeQualif getCtypeQualif() {
    return findChildByClass(SmPLCCtypeQualif.class);
  }

  @Override
  @Nullable
  public SmPLCCtypeStructUnion getCtypeStructUnion() {
    return findChildByClass(SmPLCCtypeStructUnion.class);
  }

  @Override
  @Nullable
  public SmPLCCtypeTypeof getCtypeTypeof() {
    return findChildByClass(SmPLCCtypeTypeof.class);
  }

  @Override
  @Nullable
  public PsiElement getChar() {
    return findChildByType(CHAR);
  }

  @Override
  @Nullable
  public PsiElement getDouble() {
    return findChildByType(DOUBLE);
  }

  @Override
  @Nullable
  public PsiElement getDoubleComplex() {
    return findChildByType(DOUBLE_COMPLEX);
  }

  @Override
  @Nullable
  public PsiElement getFloat() {
    return findChildByType(FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getFloatComplex() {
    return findChildByType(FLOAT_COMPLEX);
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(INT);
  }

  @Override
  @Nullable
  public PsiElement getLong() {
    return findChildByType(LONG);
  }

  @Override
  @Nullable
  public PsiElement getPtrdiffT() {
    return findChildByType(PTRDIFF_T);
  }

  @Override
  @Nullable
  public PsiElement getShort() {
    return findChildByType(SHORT);
  }

  @Override
  @Nullable
  public PsiElement getSizeT() {
    return findChildByType(SIZE_T);
  }

  @Override
  @Nullable
  public PsiElement getSsizeT() {
    return findChildByType(SSIZE_T);
  }

}
