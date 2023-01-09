// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCSingleDeclFnInit extends SmPLCCompositeElement {

  @NotNull
  SmPLCDIdent getDIdent();

  @NotNull
  SmPLCExpr getExpr();

  @Nullable
  SmPLCInitialize getInitialize();

  @NotNull
  SmPLCParamSeq getParamSeq();

  @Nullable
  SmPLCStorage getStorage();

  @NotNull
  PsiElement getEquals();

  @NotNull
  PsiElement getTimes();

}
