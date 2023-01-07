// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLScriptMetavariables extends SmPLCompositeElement {

  @Nullable
  SmPLRulename getRulename();

  @Nullable
  SmPLScriptLang getScriptLang();

  @NotNull
  List<SmPLScriptMetadecl> getScriptMetadeclList();

  @Nullable
  PsiElement getAtFinalizeColon();

  @Nullable
  PsiElement getAtInitializeColon();

  @Nullable
  PsiElement getAtScriptColon();

  @Nullable
  PsiElement getAt();

  @Nullable
  PsiElement getDoubleAt();

}
