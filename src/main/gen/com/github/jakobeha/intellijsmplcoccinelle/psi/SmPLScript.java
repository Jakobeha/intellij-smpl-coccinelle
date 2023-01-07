// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLScript extends SmPLCompositeElement {

  @NotNull
  List<SmPLId> getIdList();

  @NotNull
  PsiElement getScript();

  @NotNull
  PsiElement getColon();

  @Nullable
  PsiElement getExpr();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getRparen();

}