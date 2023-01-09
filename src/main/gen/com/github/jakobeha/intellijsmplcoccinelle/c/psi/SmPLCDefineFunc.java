// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCDefineFunc extends SmPLCCompositeElement {

  @NotNull
  SmPLCId getId();

  @Nullable
  SmPLCParamSeq getParamSeq();

  @Nullable
  SmPLCTop getTop();

  @NotNull
  PsiElement getHashDefine();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

}
