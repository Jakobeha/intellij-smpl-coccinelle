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

public class SmPLExpressionMetadeclImpl extends SmPLMetadeclImpl implements SmPLExpressionMetadecl {

  public SmPLExpressionMetadeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitExpressionMetadecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLListSize getListSize() {
    return findChildByClass(SmPLListSize.class);
  }

  @Override
  @Nullable
  public SmPLPmidsWithConstraints getPmidsWithConstraints() {
    return findChildByClass(SmPLPmidsWithConstraints.class);
  }

  @Override
  @Nullable
  public PsiElement getExpression() {
    return findChildByType(EXPRESSION);
  }

  @Override
  @Nullable
  public PsiElement getExpressionEnum() {
    return findChildByType(EXPRESSION_ENUM);
  }

  @Override
  @Nullable
  public PsiElement getExpressionList() {
    return findChildByType(EXPRESSION_LIST);
  }

  @Override
  @Nullable
  public PsiElement getExpressionStruct() {
    return findChildByType(EXPRESSION_STRUCT);
  }

  @Override
  @Nullable
  public PsiElement getExpressionUnion() {
    return findChildByType(EXPRESSION_UNION);
  }

}
