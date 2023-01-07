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

public class SmPLScriptMetadeclAssignRuleImpl extends SmPLCompositeElementImpl implements SmPLScriptMetadeclAssignRule {

  public SmPLScriptMetadeclAssignRuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitScriptMetadeclAssignRule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLId getId() {
    return findChildByClass(SmPLId.class);
  }

  @Override
  @Nullable
  public SmPLScriptMetadeclAssignValue getScriptMetadeclAssignValue() {
    return findChildByClass(SmPLScriptMetadeclAssignValue.class);
  }

  @Override
  @Nullable
  public SmPLVid getVid() {
    return findChildByClass(SmPLVid.class);
  }

  @Override
  @Nullable
  public PsiElement getDot() {
    return findChildByType(DOT);
  }

  @Override
  @NotNull
  public PsiElement getLeftLeft() {
    return findNotNullChildByType(LEFT_LEFT);
  }

}
