// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLExpressionMetadecl extends SmPLMetadecl {

  @Nullable
  SmPLListSize getListSize();

  @Nullable
  SmPLPmidsWithConstraints getPmidsWithConstraints();

  @Nullable
  PsiElement getExpression();

  @Nullable
  PsiElement getExpressionEnum();

  @Nullable
  PsiElement getExpressionList();

  @Nullable
  PsiElement getExpressionStruct();

  @Nullable
  PsiElement getExpressionUnion();

}