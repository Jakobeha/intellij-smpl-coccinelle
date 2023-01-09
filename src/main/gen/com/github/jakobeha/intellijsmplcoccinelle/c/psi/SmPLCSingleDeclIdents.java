// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCSingleDeclIdents extends SmPLCCompositeElement {

  @NotNull
  List<SmPLCDIdent> getDIdentList();

  @NotNull
  SmPLCExpr getExpr();

  @Nullable
  SmPLCStorage getStorage();

}
