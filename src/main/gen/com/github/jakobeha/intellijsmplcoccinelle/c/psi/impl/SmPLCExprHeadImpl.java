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

public class SmPLCExprHeadImpl extends SmPLCCompositeElementImpl implements SmPLCExprHead {

  public SmPLCExprHeadImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitExprHead(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCConjunct getConjunct() {
    return findChildByClass(SmPLCConjunct.class);
  }

  @Override
  @Nullable
  public SmPLCConstant getConstant() {
    return findChildByClass(SmPLCConstant.class);
  }

  @Override
  @Nullable
  public SmPLCDisjunct getDisjunct() {
    return findChildByClass(SmPLCDisjunct.class);
  }

  @Override
  @Nullable
  public SmPLCExpr getExpr() {
    return findChildByClass(SmPLCExpr.class);
  }

  @Override
  @Nullable
  public SmPLCId getId() {
    return findChildByClass(SmPLCId.class);
  }

  @Override
  @NotNull
  public List<SmPLCInitListElem> getInitListElemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCInitListElem.class);
  }

  @Override
  @Nullable
  public SmPLCUnaryOp getUnaryOp() {
    return findChildByClass(SmPLCUnaryOp.class);
  }

  @Override
  @Nullable
  public PsiElement getLbrace() {
    return findChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}
