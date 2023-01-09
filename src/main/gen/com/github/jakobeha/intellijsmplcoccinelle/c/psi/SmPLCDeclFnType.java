// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCDeclFnType extends SmPLCExpr {

  @NotNull
  SmPLCExpr getExpr();

  @Nullable
  SmPLCId getId();

  @Nullable
  SmPLCParamSeq getParamSeq();

  @Nullable
  PsiElement getTimes();

}
