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

public class SmPLDependsOnRuleattrImpl extends SmPLCompositeElementImpl implements SmPLDependsOnRuleattr {

  public SmPLDependsOnRuleattrImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitDependsOnRuleattr(this);
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
  public PsiElement getDependsOn() {
    return findNotNullChildByType(DEPENDS_ON);
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

}
