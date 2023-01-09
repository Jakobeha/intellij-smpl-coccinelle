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

public class SmPLCExprTailImpl extends SmPLCCompositeElementImpl implements SmPLCExprTail {

  public SmPLCExprTailImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitExprTail(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCAssignOp getAssignOp() {
    return findChildByClass(SmPLCAssignOp.class);
  }

  @Override
  @Nullable
  public SmPLCBinOp getBinOp() {
    return findChildByClass(SmPLCBinOp.class);
  }

  @Override
  @Nullable
  public SmPLCDotExpr getDotExpr() {
    return findChildByClass(SmPLCDotExpr.class);
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
  public PsiElement getWord() {
    return findChildByType(WORD);
  }

  @Override
  @Nullable
  public PsiElement getArrow() {
    return findChildByType(ARROW);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getDecrement() {
    return findChildByType(DECREMENT);
  }

  @Override
  @Nullable
  public PsiElement getDot() {
    return findChildByType(DOT);
  }

  @Override
  @Nullable
  public PsiElement getIncrement() {
    return findChildByType(INCREMENT);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getQuestion() {
    return findChildByType(QUESTION);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}
