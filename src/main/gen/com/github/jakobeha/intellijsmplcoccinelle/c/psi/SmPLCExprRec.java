// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCExprRec extends SmPLCCompositeElement {

  @NotNull
  SmPLCExprHead getExprHead();

  @NotNull
  List<SmPLCExprTail> getExprTailList();

}