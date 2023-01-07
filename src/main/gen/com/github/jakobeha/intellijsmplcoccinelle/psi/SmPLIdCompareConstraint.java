// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLIdCompareConstraint extends SmPLCompositeElement {

  @NotNull
  List<SmPLPmid> getPmidList();

  @Nullable
  PsiElement getEquals();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getNotEquals();

  @Nullable
  PsiElement getRbrace();

}
