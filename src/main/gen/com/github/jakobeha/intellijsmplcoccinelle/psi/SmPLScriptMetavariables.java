// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLScriptMetavariables extends SmPLCompositeElement {

  @Nullable
  SmPLDep getDep();

  @Nullable
  SmPLRulename getRulename();

  @NotNull
  List<SmPLScriptMetadecl> getScriptMetadeclList();

  @Nullable
  PsiElement getFinalize();

  @Nullable
  PsiElement getInitialize();

  @Nullable
  PsiElement getScript();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getDoubleAt();

}
