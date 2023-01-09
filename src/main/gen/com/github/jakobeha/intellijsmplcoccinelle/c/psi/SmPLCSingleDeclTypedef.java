// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCSingleDeclTypedef extends SmPLCCompositeElement {

  @NotNull
  SmPLCExpr getExpr();

  @NotNull
  List<SmPLCTypedefIdent> getTypedefIdentList();

  @NotNull
  PsiElement getTypedef();

}
