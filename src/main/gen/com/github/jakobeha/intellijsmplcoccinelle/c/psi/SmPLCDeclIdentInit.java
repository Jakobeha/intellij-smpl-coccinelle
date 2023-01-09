// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCDeclIdentInit extends SmPLCCompositeElement {

  @Nullable
  SmPLCAttribute getAttribute();

  @NotNull
  SmPLCDIdent getDIdent();

  @NotNull
  SmPLCExpr getExpr();

  @Nullable
  SmPLCInitialize getInitialize();

  @Nullable
  SmPLCStorage getStorage();

  @NotNull
  PsiElement getEquals();

}
