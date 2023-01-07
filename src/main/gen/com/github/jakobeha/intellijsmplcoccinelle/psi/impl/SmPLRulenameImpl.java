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

public class SmPLRulenameImpl extends SmPLCompositeElementImpl implements SmPLRulename {

  public SmPLRulenameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitRulename(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SmPLDependsOnRuleattr> getDependsOnRuleattrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLDependsOnRuleattr.class);
  }

  @Override
  @NotNull
  public List<SmPLDisableRuleattr> getDisableRuleattrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLDisableRuleattr.class);
  }

  @Override
  @NotNull
  public List<SmPLId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLId.class);
  }

  @Override
  @NotNull
  public List<SmPLUsingRuleattr> getUsingRuleattrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLUsingRuleattr.class);
  }

  @Override
  @Nullable
  public PsiElement getExtends() {
    return findChildByType(EXTENDS);
  }

}
