// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLConstantMetadecl extends SmPLMetadecl {

  @Nullable
  SmPLPmidsWithConstraints getPmidsWithConstraints();

  @NotNull
  PsiElement getConstant();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
