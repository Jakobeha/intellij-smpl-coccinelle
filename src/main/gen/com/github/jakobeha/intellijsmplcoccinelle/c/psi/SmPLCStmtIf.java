// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCStmtIf extends SmPLCCompositeElement {

  @Nullable
  SmPLCDotExpr getDotExpr();

  @NotNull
  List<SmPLCStmt> getStmtList();

  @Nullable
  PsiElement getElse();

  @NotNull
  PsiElement getIf();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

}
