// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCTop extends SmPLCCompositeElement {

  @Nullable
  SmPLCExpr getExpr();

  @Nullable
  SmPLCFundecl getFundecl();

  @NotNull
  List<SmPLCStmt> getStmtList();

}