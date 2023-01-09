// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCDesignator extends SmPLCCompositeElement {

  @Nullable
  SmPLCDotExpr getDotExpr();

  @Nullable
  SmPLCId getId();

  @Nullable
  PsiElement getDot();

  @Nullable
  PsiElement getEllipsis();

  @Nullable
  PsiElement getLbrack();

  @Nullable
  PsiElement getRbrack();

}
