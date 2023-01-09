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

public class SmPLCStructDeclFnImpl extends SmPLCCompositeElementImpl implements SmPLCStructDeclFn {

  public SmPLCStructDeclFnImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitStructDeclFn(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCDIdent getDIdent() {
    return findChildByClass(SmPLCDIdent.class);
  }

  @Override
  @NotNull
  public List<SmPLCDecl> getDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCDecl.class);
  }

  @Override
  @NotNull
  public SmPLCExpr getExpr() {
    return findNotNullChildByClass(SmPLCExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getTimes() {
    return findChildByType(TIMES);
  }

}
