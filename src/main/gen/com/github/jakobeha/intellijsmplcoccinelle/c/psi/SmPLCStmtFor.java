// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCStmtFor extends SmPLCCompositeElement {

  @NotNull
  List<SmPLCDotExpr> getDotExprList();

  @Nullable
  SmPLCStmt getStmt();

  @NotNull
  PsiElement getFor();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

}
