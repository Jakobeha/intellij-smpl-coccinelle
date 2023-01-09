// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCDirective extends SmPLCCompositeElement {

  @Nullable
  SmPLCDefine getDefine();

  @Nullable
  SmPLCDefineFunc getDefineFunc();

  @Nullable
  SmPLCInclude getInclude();

  @Nullable
  SmPLCPragma getPragma();

  @Nullable
  SmPLCPragmaEllipsis getPragmaEllipsis();

  @Nullable
  SmPLCUndef getUndef();

}
