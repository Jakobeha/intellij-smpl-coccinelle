// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCCtypeStructUnion extends SmPLCCompositeElement {

  @NotNull
  SmPLCId getId();

  @NotNull
  List<SmPLCStructDeclList> getStructDeclListList();

  @Nullable
  PsiElement getStruct();

  @Nullable
  PsiElement getUnion();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
