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

public class SmPLCStorageImpl extends SmPLCCompositeElementImpl implements SmPLCStorage {

  public SmPLCStorageImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitStorage(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAuto() {
    return findChildByType(AUTO);
  }

  @Override
  @Nullable
  public PsiElement getExtern() {
    return findChildByType(EXTERN);
  }

  @Override
  @Nullable
  public PsiElement getRegister() {
    return findChildByType(REGISTER);
  }

  @Override
  @Nullable
  public PsiElement getStatic() {
    return findChildByType(STATIC);
  }

}
