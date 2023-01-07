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

public class SmPLFieldMetadeclImpl extends SmPLMetadeclImpl implements SmPLFieldMetadecl {

  public SmPLFieldMetadeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitFieldMetadecl(this);
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
  public PsiElement getField() {
    return findChildByType(FIELD);
  }

  @Override
  @Nullable
  public PsiElement getFieldList() {
    return findChildByType(FIELD_LIST);
  }

}
