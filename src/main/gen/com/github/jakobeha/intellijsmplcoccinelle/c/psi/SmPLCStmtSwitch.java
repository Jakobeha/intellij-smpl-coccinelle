// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCStmtSwitch extends SmPLCCompositeElement {

  @NotNull
  List<SmPLCCaseLine> getCaseLineList();

  @Nullable
  SmPLCDotExpr getDotExpr();

  @NotNull
  PsiElement getSwitch();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getRparen();

}
