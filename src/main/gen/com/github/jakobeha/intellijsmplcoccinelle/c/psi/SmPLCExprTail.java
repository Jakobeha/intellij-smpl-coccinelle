// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCExprTail extends SmPLCCompositeElement {

  @Nullable
  SmPLCAssignOp getAssignOp();

  @Nullable
  SmPLCBinOp getBinOp();

  @Nullable
  SmPLCDotExpr getDotExpr();

  @Nullable
  SmPLCId getId();

  @Nullable
  SmPLCParamSeq getParamSeq();

  @Nullable
  PsiElement getWord();

  @Nullable
  PsiElement getArrow();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getDecrement();

  @Nullable
  PsiElement getDot();

  @Nullable
  PsiElement getIncrement();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getQuestion();

  @Nullable
  PsiElement getRparen();

}
