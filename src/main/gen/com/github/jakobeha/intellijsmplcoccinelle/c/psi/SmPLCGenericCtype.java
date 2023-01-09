// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCGenericCtype extends SmPLCExpr {

  @Nullable
  SmPLCCtypeEnum getCtypeEnum();

  @Nullable
  SmPLCCtypeQualif getCtypeQualif();

  @Nullable
  SmPLCCtypeStructUnion getCtypeStructUnion();

  @Nullable
  SmPLCCtypeTypeof getCtypeTypeof();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getDouble();

  @Nullable
  PsiElement getDoubleComplex();

  @Nullable
  PsiElement getFloat();

  @Nullable
  PsiElement getFloatComplex();

  @Nullable
  PsiElement getInt();

  @Nullable
  PsiElement getLong();

  @Nullable
  PsiElement getPtrdiffT();

  @Nullable
  PsiElement getShort();

  @Nullable
  PsiElement getSizeT();

  @Nullable
  PsiElement getSsizeT();

}
