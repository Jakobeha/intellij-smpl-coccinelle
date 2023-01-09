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

public class SmPLCStmtImpl extends SmPLCCompositeElementImpl implements SmPLCStmt {

  public SmPLCStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCDirective getDirective() {
    return findChildByClass(SmPLCDirective.class);
  }

  @Override
  @Nullable
  public SmPLCExpr getExpr() {
    return findChildByClass(SmPLCExpr.class);
  }

  @Override
  @Nullable
  public SmPLCStmtBlock getStmtBlock() {
    return findChildByClass(SmPLCStmtBlock.class);
  }

  @Override
  @Nullable
  public SmPLCStmtBreak getStmtBreak() {
    return findChildByClass(SmPLCStmtBreak.class);
  }

  @Override
  @Nullable
  public SmPLCStmtContinue getStmtContinue() {
    return findChildByClass(SmPLCStmtContinue.class);
  }

  @Override
  @Nullable
  public SmPLCStmtDo getStmtDo() {
    return findChildByClass(SmPLCStmtDo.class);
  }

  @Override
  @Nullable
  public SmPLCStmtFor getStmtFor() {
    return findChildByClass(SmPLCStmtFor.class);
  }

  @Override
  @Nullable
  public SmPLCStmtGoto getStmtGoto() {
    return findChildByClass(SmPLCStmtGoto.class);
  }

  @Override
  @Nullable
  public SmPLCStmtIf getStmtIf() {
    return findChildByClass(SmPLCStmtIf.class);
  }

  @Override
  @Nullable
  public SmPLCStmtLabel getStmtLabel() {
    return findChildByClass(SmPLCStmtLabel.class);
  }

  @Override
  @Nullable
  public SmPLCStmtMetaIter getStmtMetaIter() {
    return findChildByClass(SmPLCStmtMetaIter.class);
  }

  @Override
  @Nullable
  public SmPLCStmtNestDecl getStmtNestDecl() {
    return findChildByClass(SmPLCStmtNestDecl.class);
  }

  @Override
  @Nullable
  public SmPLCStmtReturn getStmtReturn() {
    return findChildByClass(SmPLCStmtReturn.class);
  }

  @Override
  @Nullable
  public SmPLCStmtSwitch getStmtSwitch() {
    return findChildByClass(SmPLCStmtSwitch.class);
  }

  @Override
  @Nullable
  public SmPLCStmtWhile getStmtWhile() {
    return findChildByClass(SmPLCStmtWhile.class);
  }

  @Override
  @Nullable
  public PsiElement getWord() {
    return findChildByType(WORD);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
