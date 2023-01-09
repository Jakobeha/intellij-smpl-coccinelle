// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCFundecl extends SmPLCDecl {

  @Nullable
  SmPLCExpr getExpr();

  @NotNull
  SmPLCFunid getFunid();

  @NotNull
  List<SmPLCFuninfo> getFuninfoList();

  @Nullable
  SmPLCParamSeq getParamSeq();

  @Nullable
  SmPLCStmtSeq getStmtSeq();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRbrace();

  @NotNull
  PsiElement getRparen();

}
