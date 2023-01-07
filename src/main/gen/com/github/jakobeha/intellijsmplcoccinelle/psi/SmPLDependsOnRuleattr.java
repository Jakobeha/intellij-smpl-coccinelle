// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLDependsOnRuleattr extends SmPLCompositeElement {

  @Nullable
  SmPLDep getDep();

  @NotNull
  PsiElement getDependsOn();

  @Nullable
  PsiElement getExists();

  @Nullable
  PsiElement getForall();

}
