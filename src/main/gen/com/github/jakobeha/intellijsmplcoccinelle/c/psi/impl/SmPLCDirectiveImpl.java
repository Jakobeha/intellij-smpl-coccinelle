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

public class SmPLCDirectiveImpl extends SmPLCCompositeElementImpl implements SmPLCDirective {

  public SmPLCDirectiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitDirective(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCDefine getDefine() {
    return findChildByClass(SmPLCDefine.class);
  }

  @Override
  @Nullable
  public SmPLCDefineFunc getDefineFunc() {
    return findChildByClass(SmPLCDefineFunc.class);
  }

  @Override
  @Nullable
  public SmPLCInclude getInclude() {
    return findChildByClass(SmPLCInclude.class);
  }

  @Override
  @Nullable
  public SmPLCPragma getPragma() {
    return findChildByClass(SmPLCPragma.class);
  }

  @Override
  @Nullable
  public SmPLCPragmaEllipsis getPragmaEllipsis() {
    return findChildByClass(SmPLCPragmaEllipsis.class);
  }

  @Override
  @Nullable
  public SmPLCUndef getUndef() {
    return findChildByClass(SmPLCUndef.class);
  }

}
