// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLAssignopdecl extends SmPLCompositeElement {

  @NotNull
  List<SmPLAssignop> getAssignopList();

  @NotNull
  SmPLPmid getPmid();

  @Nullable
  PsiElement getEquals();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
