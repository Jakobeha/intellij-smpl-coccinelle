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

public class SmPLCMultiRuleElemStmtImpl extends SmPLCStmtImpl implements SmPLCMultiRuleElemStmt {

  public SmPLCMultiRuleElemStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitMultiRuleElemStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SmPLCStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCStmt.class);
  }

  @Override
  @NotNull
  public PsiElement getBackLparen() {
    return findNotNullChildByType(BACK_LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getBackRparen() {
    return findChildByType(BACK_RPAREN);
  }

}
