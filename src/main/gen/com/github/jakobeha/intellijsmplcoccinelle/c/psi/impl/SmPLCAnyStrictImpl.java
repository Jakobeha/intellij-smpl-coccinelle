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

public class SmPLCAnyStrictImpl extends SmPLCCompositeElementImpl implements SmPLCAnyStrict {

  public SmPLCAnyStrictImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitAnyStrict(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAny() {
    return findChildByType(ANY);
  }

  @Override
  @Nullable
  public PsiElement getExists() {
    return findChildByType(EXISTS);
  }

  @Override
  @Nullable
  public PsiElement getForall() {
    return findChildByType(FORALL);
  }

  @Override
  @Nullable
  public PsiElement getStrict() {
    return findChildByType(STRICT);
  }

}
