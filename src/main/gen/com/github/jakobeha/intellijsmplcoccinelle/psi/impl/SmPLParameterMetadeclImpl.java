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

public class SmPLParameterMetadeclImpl extends SmPLMetadeclImpl implements SmPLParameterMetadecl {

  public SmPLParameterMetadeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitParameterMetadecl(this);
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
  public PsiElement getParameter() {
    return findChildByType(PARAMETER);
  }

  @Override
  @Nullable
  public PsiElement getParameterList() {
    return findChildByType(PARAMETER_LIST);
  }

}
