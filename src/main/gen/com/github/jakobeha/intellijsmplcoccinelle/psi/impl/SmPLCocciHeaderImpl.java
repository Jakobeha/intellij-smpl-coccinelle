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

public class SmPLCocciHeaderImpl extends SmPLCompositeElementImpl implements SmPLCocciHeader {

  public SmPLCocciHeaderImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitCocciHeader(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCIncludeCocci getCIncludeCocci() {
    return findChildByClass(SmPLCIncludeCocci.class);
  }

  @Override
  @Nullable
  public SmPLUsingCocci getUsingCocci() {
    return findChildByClass(SmPLUsingCocci.class);
  }

  @Override
  @Nullable
  public SmPLUsingSysCocci getUsingSysCocci() {
    return findChildByClass(SmPLUsingSysCocci.class);
  }

  @Override
  @Nullable
  public SmPLVirtualCocci getVirtualCocci() {
    return findChildByClass(SmPLVirtualCocci.class);
  }

}
