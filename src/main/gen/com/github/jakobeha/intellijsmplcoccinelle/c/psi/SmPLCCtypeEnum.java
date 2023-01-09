// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCCtypeEnum extends SmPLCCompositeElement {

  @NotNull
  List<SmPLCDotExpr> getDotExprList();

  @NotNull
  List<SmPLCExpWhencode> getExpWhencodeList();

  @Nullable
  SmPLCId getId();

  @NotNull
  PsiElement getEnum();

}
