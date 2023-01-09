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

public class SmPLCFunprotoImpl extends SmPLCCompositeElementImpl implements SmPLCFunproto {

  public SmPLCFunprotoImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitFunproto(this);
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
  @NotNull
  public SmPLCFunid getFunid() {
    return findNotNullChildByClass(SmPLCFunid.class);
  }

  @Override
  @NotNull
  public List<SmPLCFuninfo> getFuninfoList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCFuninfo.class);
  }

  @Override
  @Nullable
  public SmPLCParamSeq getParamSeq() {
    return findChildByClass(SmPLCParamSeq.class);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return findNotNullChildByType(LPAREN);
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return findNotNullChildByType(RPAREN);
  }

}
