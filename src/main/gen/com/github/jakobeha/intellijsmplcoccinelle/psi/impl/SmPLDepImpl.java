// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.jakobeha.intellijsmplcoccinelle.psi.SmPLTypes.*;
import com.github.jakobeha.intellijsmplcoccinelle.psi.*;

public class SmPLDepImpl extends SmPLCompositeElementImpl implements SmPLDep {

  public SmPLDepImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitDep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLDep getDep() {
    return findChildByClass(SmPLDep.class);
  }

  @Override
  @NotNull
  public SmPLDep_ getDep_() {
    return findNotNullChildByClass(SmPLDep_.class);
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

}
