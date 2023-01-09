// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCDeclIdent2Init extends SmPLCCompositeElement {

  @Nullable
  SmPLCAttribute getAttribute();

  @Nullable
  SmPLCConstVol getConstVol();

  @NotNull
  SmPLCDIdent getDIdent();

  @NotNull
  SmPLCId getId();

  @Nullable
  SmPLCInitialize getInitialize();

  @Nullable
  SmPLCStorage getStorage();

  @NotNull
  PsiElement getEquals();

}
