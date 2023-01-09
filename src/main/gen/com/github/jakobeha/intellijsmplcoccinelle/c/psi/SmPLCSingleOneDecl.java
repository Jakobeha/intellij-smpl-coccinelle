// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCSingleOneDecl extends SmPLCDecl {

  @Nullable
  SmPLCDecl getDecl();

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
  SmPLCSingleOneDeclIdent getSingleOneDeclIdent();

  @Nullable
  SmPLCSingleOneDeclIdent2 getSingleOneDeclIdent2();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getOr();

  @Nullable
  PsiElement getSemicolon();

}
