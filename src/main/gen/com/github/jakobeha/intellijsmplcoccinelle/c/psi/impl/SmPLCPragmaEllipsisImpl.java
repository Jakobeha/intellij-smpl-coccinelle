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

public class SmPLCPragmaEllipsisImpl extends SmPLCCompositeElementImpl implements SmPLCPragmaEllipsis {

  public SmPLCPragmaEllipsisImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitPragmaEllipsis(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SmPLCId getId() {
    return findNotNullChildByClass(SmPLCId.class);
  }

  @Override
  @NotNull
  public PsiElement getHashPragma() {
    return findNotNullChildByType(HASH_PRAGMA);
  }

  @Override
  @NotNull
  public PsiElement getEllipsis() {
    return findNotNullChildByType(ELLIPSIS);
  }

}
