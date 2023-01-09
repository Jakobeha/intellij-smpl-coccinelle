// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCExprHead extends SmPLCCompositeElement {

  @Nullable
  SmPLCConjunct getConjunct();

  @Nullable
  SmPLCConstant getConstant();

  @Nullable
  SmPLCDisjunct getDisjunct();

  @Nullable
  SmPLCExpr getExpr();

  @Nullable
  SmPLCId getId();

  @NotNull
  List<SmPLCInitListElem> getInitListElemList();

  @Nullable
  SmPLCUnaryOp getUnaryOp();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getRparen();

}
