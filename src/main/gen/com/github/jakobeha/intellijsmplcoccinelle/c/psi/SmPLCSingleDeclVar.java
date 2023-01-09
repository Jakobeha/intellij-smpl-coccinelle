// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCSingleDeclVar extends SmPLCCompositeElement {

  @Nullable
  SmPLCDeclFn getDeclFn();

  @Nullable
  SmPLCDeclIdent2Init getDeclIdent2Init();

  @Nullable
  SmPLCDeclIdentInit getDeclIdentInit();

  @Nullable
  SmPLCDeclMeta getDeclMeta();

  @Nullable
  SmPLCExpr getExpr();

  @Nullable
  SmPLCFunproto getFunproto();

  @Nullable
  SmPLCSingleDeclFnInit getSingleDeclFnInit();

  @Nullable
  SmPLCSingleDeclIdents getSingleDeclIdents();

  @Nullable
  SmPLCSingleDeclIdents2 getSingleDeclIdents2();

  @Nullable
  SmPLCSingleDeclTypedef getSingleDeclTypedef();

  @Nullable
  PsiElement getSemicolon();

}
