// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCStmt extends SmPLCCompositeElement {

  @Nullable
  SmPLCDirective getDirective();

  @Nullable
  SmPLCExpr getExpr();

  @Nullable
  SmPLCStmtBlock getStmtBlock();

  @Nullable
  SmPLCStmtBreak getStmtBreak();

  @Nullable
  SmPLCStmtContinue getStmtContinue();

  @Nullable
  SmPLCStmtDo getStmtDo();

  @Nullable
  SmPLCStmtFor getStmtFor();

  @Nullable
  SmPLCStmtGoto getStmtGoto();

  @Nullable
  SmPLCStmtIf getStmtIf();

  @Nullable
  SmPLCStmtLabel getStmtLabel();

  @Nullable
  SmPLCStmtMetaIter getStmtMetaIter();

  @Nullable
  SmPLCStmtNestDecl getStmtNestDecl();

  @Nullable
  SmPLCStmtReturn getStmtReturn();

  @Nullable
  SmPLCStmtSwitch getStmtSwitch();

  @Nullable
  SmPLCStmtWhile getStmtWhile();

  @Nullable
  PsiElement getWord();

  @Nullable
  PsiElement getSemicolon();

}
