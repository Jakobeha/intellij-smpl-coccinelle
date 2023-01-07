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

public class SmPLConstraintImpl extends SmPLCompositeElementImpl implements SmPLConstraint {

  public SmPLConstraintImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitConstraint(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLIdCompareConstraint getIdCompareConstraint() {
    return findChildByClass(SmPLIdCompareConstraint.class);
  }

  @Override
  @Nullable
  public SmPLIntCompareConstraint getIntCompareConstraint() {
    return findChildByClass(SmPLIntCompareConstraint.class);
  }

  @Override
  @Nullable
  public SmPLRegexpConstraint getRegexpConstraint() {
    return findChildByClass(SmPLRegexpConstraint.class);
  }

  @Override
  @Nullable
  public SmPLScriptConstraint getScriptConstraint() {
    return findChildByClass(SmPLScriptConstraint.class);
  }

}
