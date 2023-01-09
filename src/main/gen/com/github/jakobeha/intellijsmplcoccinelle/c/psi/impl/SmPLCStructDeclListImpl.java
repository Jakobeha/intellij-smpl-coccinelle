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

public class SmPLCStructDeclListImpl extends SmPLCCompositeElementImpl implements SmPLCStructDeclList {

  public SmPLCStructDeclListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitStructDeclList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCContinueStructDeclList getContinueStructDeclList() {
    return findChildByClass(SmPLCContinueStructDeclList.class);
  }

  @Override
  @Nullable
  public SmPLCStructDecl getStructDecl() {
    return findChildByClass(SmPLCStructDecl.class);
  }

  @Override
  @Nullable
  public SmPLCStructDeclList getStructDeclList() {
    return findChildByClass(SmPLCStructDeclList.class);
  }

  @Override
  @Nullable
  public PsiElement getWhen() {
    return findChildByType(WHEN);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

  @Override
  @Nullable
  public PsiElement getNe() {
    return findChildByType(NE);
  }

}
