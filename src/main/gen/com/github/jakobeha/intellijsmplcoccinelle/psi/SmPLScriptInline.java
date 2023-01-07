// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLScriptInline extends SmPLCompositeElement {

  @NotNull
  List<SmPLId> getIdList();

  @Nullable
  SmPLScriptLang getScriptLang();

  @NotNull
  PsiElement getScriptColon();

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
