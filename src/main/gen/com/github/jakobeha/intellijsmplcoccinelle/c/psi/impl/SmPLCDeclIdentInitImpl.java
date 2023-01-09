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

public class SmPLCDeclIdentInitImpl extends SmPLCCompositeElementImpl implements SmPLCDeclIdentInit {

  public SmPLCDeclIdentInitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitDeclIdentInit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCAttribute getAttribute() {
    return findChildByClass(SmPLCAttribute.class);
  }

  @Override
  @NotNull
  public SmPLCDIdent getDIdent() {
    return findNotNullChildByClass(SmPLCDIdent.class);
  }

  @Override
  @NotNull
  public SmPLCExpr getExpr() {
    return findNotNullChildByClass(SmPLCExpr.class);
  }

  @Override
  @Nullable
  public SmPLCInitialize getInitialize() {
    return findChildByClass(SmPLCInitialize.class);
  }

  @Override
  @Nullable
  public SmPLCStorage getStorage() {
    return findChildByClass(SmPLCStorage.class);
  }

  @Override
  @NotNull
  public PsiElement getEquals() {
    return findNotNullChildByType(EQUALS);
  }

}
