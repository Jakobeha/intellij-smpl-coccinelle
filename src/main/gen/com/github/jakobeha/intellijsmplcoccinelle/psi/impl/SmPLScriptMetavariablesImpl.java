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

public class SmPLScriptMetavariablesImpl extends SmPLCompositeElementImpl implements SmPLScriptMetavariables {

  public SmPLScriptMetavariablesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLVisitor visitor) {
    visitor.visitScriptMetavariables(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLVisitor) accept((SmPLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLDep getDep() {
    return findChildByClass(SmPLDep.class);
  }

  @Override
  @Nullable
  public SmPLRulename getRulename() {
    return findChildByClass(SmPLRulename.class);
  }

  @Override
  @NotNull
  public List<SmPLScriptMetadecl> getScriptMetadeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLScriptMetadecl.class);
  }

  @Override
  @Nullable
  public PsiElement getFinalize() {
    return findChildByType(FINALIZE);
  }

  @Override
  @Nullable
  public PsiElement getInitialize() {
    return findChildByType(INITIALIZE);
  }

  @Override
  @Nullable
  public PsiElement getScript() {
    return findChildByType(SCRIPT);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getDoubleAt() {
    return findChildByType(DOUBLE_AT);
  }

}
