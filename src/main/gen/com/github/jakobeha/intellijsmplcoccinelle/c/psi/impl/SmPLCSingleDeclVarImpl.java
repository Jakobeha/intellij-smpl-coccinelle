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

public class SmPLCSingleDeclVarImpl extends SmPLCCompositeElementImpl implements SmPLCSingleDeclVar {

  public SmPLCSingleDeclVarImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitSingleDeclVar(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCDeclFn getDeclFn() {
    return findChildByClass(SmPLCDeclFn.class);
  }

  @Override
  @Nullable
  public SmPLCDeclIdent2Init getDeclIdent2Init() {
    return findChildByClass(SmPLCDeclIdent2Init.class);
  }

  @Override
  @Nullable
  public SmPLCDeclIdentInit getDeclIdentInit() {
    return findChildByClass(SmPLCDeclIdentInit.class);
  }

  @Override
  @Nullable
  public SmPLCDeclMeta getDeclMeta() {
    return findChildByClass(SmPLCDeclMeta.class);
  }

  @Override
  @Nullable
  public SmPLCExpr getExpr() {
    return findChildByClass(SmPLCExpr.class);
  }

  @Override
  @Nullable
  public SmPLCFunproto getFunproto() {
    return findChildByClass(SmPLCFunproto.class);
  }

  @Override
  @Nullable
  public SmPLCSingleDeclFnInit getSingleDeclFnInit() {
    return findChildByClass(SmPLCSingleDeclFnInit.class);
  }

  @Override
  @Nullable
  public SmPLCSingleDeclIdents getSingleDeclIdents() {
    return findChildByClass(SmPLCSingleDeclIdents.class);
  }

  @Override
  @Nullable
  public SmPLCSingleDeclIdents2 getSingleDeclIdents2() {
    return findChildByClass(SmPLCSingleDeclIdents2.class);
  }

  @Override
  @Nullable
  public SmPLCSingleDeclTypedef getSingleDeclTypedef() {
    return findChildByClass(SmPLCSingleDeclTypedef.class);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
