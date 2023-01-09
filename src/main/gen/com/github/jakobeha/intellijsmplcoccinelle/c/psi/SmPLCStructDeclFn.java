// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCStructDeclFn extends SmPLCCompositeElement {

  @Nullable
  SmPLCDIdent getDIdent();

  @NotNull
  List<SmPLCDecl> getDeclList();

  @NotNull
  SmPLCExpr getExpr();

  @Nullable
  PsiElement getTimes();

}
