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

public class SmPLCSingleRuleElemStmtImpl extends SmPLCStmtImpl implements SmPLCSingleRuleElemStmt {

  public SmPLCSingleRuleElemStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitSingleRuleElemStmt(this);
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
  public SmPLCSingleRuleElemStmtBreak getSingleRuleElemStmtBreak() {
    return findChildByClass(SmPLCSingleRuleElemStmtBreak.class);
  }

  @Override
  @Nullable
  public SmPLCSingleRuleElemStmtContinue getSingleRuleElemStmtContinue() {
    return findChildByClass(SmPLCSingleRuleElemStmtContinue.class);
  }

  @Override
  @Nullable
  public SmPLCSingleRuleElemStmtReturn getSingleRuleElemStmtReturn() {
    return findChildByClass(SmPLCSingleRuleElemStmtReturn.class);
  }

}
