// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLBinopdecl extends SmPLCompositeElement {

  @NotNull
  List<SmPLBinop> getBinopList();

  @NotNull
  SmPLPmid getPmid();

  @Nullable
  PsiElement getEquals();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
