// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCStmtMetaIter extends SmPLCCompositeElement {

  @NotNull
  List<SmPLCDotExpr> getDotExprList();

  @NotNull
  SmPLCIterIdent getIterIdent();

  @NotNull
  SmPLCStmt getStmt();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
