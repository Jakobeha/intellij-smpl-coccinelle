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

public class SmPLMetavariablesImpl extends SmPLCompositeElementImpl implements SmPLMetavariables {

  public SmPLMetavariablesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitMetavariables(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SmPLMetadecl> getMetadeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLMetadecl.class);
  }

  @Override
  @Nullable
  public SmPLRulename getRulename() {
    return findChildByClass(SmPLRulename.class);
  }

}
