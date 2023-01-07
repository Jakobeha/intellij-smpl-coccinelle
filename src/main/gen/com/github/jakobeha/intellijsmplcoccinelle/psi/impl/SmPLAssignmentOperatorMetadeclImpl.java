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

public class SmPLAssignmentOperatorMetadeclImpl extends SmPLMetadeclImpl implements SmPLAssignmentOperatorMetadecl {

  public SmPLAssignmentOperatorMetadeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitAssignmentOperatorMetadecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SmPLAssignopdecl> getAssignopdeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLAssignopdecl.class);
  }

  @Override
  @NotNull
  public PsiElement getAssignmentOperator() {
    return findNotNullChildByType(ASSIGNMENT_OPERATOR);
  }

}
