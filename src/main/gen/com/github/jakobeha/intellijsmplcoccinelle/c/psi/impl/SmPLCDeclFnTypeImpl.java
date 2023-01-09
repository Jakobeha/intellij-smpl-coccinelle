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

public class SmPLCDeclFnTypeImpl extends SmPLCExprImpl implements SmPLCDeclFnType {

  public SmPLCDeclFnTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitDeclFnType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SmPLCExpr getExpr() {
    return findNotNullChildByClass(SmPLCExpr.class);
  }

  @Override
  @Nullable
  public SmPLCId getId() {
    return findChildByClass(SmPLCId.class);
  }

  @Override
  @Nullable
  public SmPLCParamSeq getParamSeq() {
    return findChildByClass(SmPLCParamSeq.class);
  }

  @Override
  @Nullable
  public PsiElement getTimes() {
    return findChildByType(TIMES);
  }

}
