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

public class SmPLCDeclVarImpl extends SmPLCCompositeElementImpl implements SmPLCDeclVar {

  public SmPLCDeclVarImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitDeclVar(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCConjunct getConjunct() {
    return findChildByClass(SmPLCConjunct.class);
  }

  @Override
  @Nullable
  public SmPLCDisjunct getDisjunct() {
    return findChildByClass(SmPLCDisjunct.class);
  }

  @Override
  @Nullable
  public SmPLCSingleDeclVar getSingleDeclVar() {
    return findChildByClass(SmPLCSingleDeclVar.class);
  }

}
