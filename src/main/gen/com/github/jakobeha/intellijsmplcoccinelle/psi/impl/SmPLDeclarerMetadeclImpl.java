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

public class SmPLDeclarerMetadeclImpl extends SmPLMetadeclImpl implements SmPLDeclarerMetadecl {

  public SmPLDeclarerMetadeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitDeclarerMetadecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLPmidsWithConstraints getPmidsWithConstraints() {
    return findChildByClass(SmPLPmidsWithConstraints.class);
  }

  @Override
  @NotNull
  public PsiElement getDeclarer() {
    return findNotNullChildByType(DECLARER);
  }

}