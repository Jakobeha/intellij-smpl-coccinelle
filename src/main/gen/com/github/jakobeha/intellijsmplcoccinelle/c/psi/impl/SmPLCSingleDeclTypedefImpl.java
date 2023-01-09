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

public class SmPLCSingleDeclTypedefImpl extends SmPLCCompositeElementImpl implements SmPLCSingleDeclTypedef {

  public SmPLCSingleDeclTypedefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitSingleDeclTypedef(this);
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
  public List<SmPLCTypedefIdent> getTypedefIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCTypedefIdent.class);
  }

  @Override
  @NotNull
  public PsiElement getTypedef() {
    return findNotNullChildByType(TYPEDEF);
  }

}
