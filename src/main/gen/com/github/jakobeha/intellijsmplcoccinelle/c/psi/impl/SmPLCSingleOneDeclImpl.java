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

public class SmPLCSingleOneDeclImpl extends SmPLCDeclImpl implements SmPLCSingleOneDecl {

  public SmPLCSingleOneDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitSingleOneDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCDecl getDecl() {
    return findChildByClass(SmPLCDecl.class);
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
  public SmPLCSingleOneDeclIdent getSingleOneDeclIdent() {
    return findChildByClass(SmPLCSingleOneDeclIdent.class);
  }

  @Override
  @Nullable
  public SmPLCSingleOneDeclIdent2 getSingleOneDeclIdent2() {
    return findChildByClass(SmPLCSingleOneDeclIdent2.class);
  }

  @Override
  @Nullable
  public PsiElement getAnd() {
    return findChildByType(AND);
  }

  @Override
  @Nullable
  public PsiElement getOr() {
    return findChildByType(OR);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
