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
  public SmPLRulename getRulename() {
    return findChildByClass(SmPLRulename.class);
  }

  @Override
  @Nullable
  public SmPLScriptLang getScriptLang() {
    return findChildByClass(SmPLScriptLang.class);
  }

  @Override
  @NotNull
  public List<SmPLScriptMetadecl> getScriptMetadeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLScriptMetadecl.class);
  }

  @Override
  @Nullable
  public PsiElement getAtFinalizeColon() {
    return findChildByType(AT_FINALIZE_COLON);
  }

  @Override
  @Nullable
  public PsiElement getAtInitializeColon() {
    return findChildByType(AT_INITIALIZE_COLON);
  }

  @Override
  @Nullable
  public PsiElement getAtScriptColon() {
    return findChildByType(AT_SCRIPT_COLON);
  }

  @Override
  @Nullable
  public PsiElement getAt() {
    return findChildByType(AT);
  }

  @Override
  @Nullable
  public PsiElement getDoubleAt() {
    return findChildByType(DOUBLE_AT);
  }

}
