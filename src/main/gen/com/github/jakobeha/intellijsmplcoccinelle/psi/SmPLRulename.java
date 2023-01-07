// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLRulename extends SmPLCompositeElement {

  @NotNull
  List<SmPLDependsOnRuleattr> getDependsOnRuleattrList();

  @NotNull
  List<SmPLDisableRuleattr> getDisableRuleattrList();

  @NotNull
  List<SmPLId> getIdList();

  @NotNull
  List<SmPLUsingRuleattr> getUsingRuleattrList();

  @Nullable
  PsiElement getExtends();

}
