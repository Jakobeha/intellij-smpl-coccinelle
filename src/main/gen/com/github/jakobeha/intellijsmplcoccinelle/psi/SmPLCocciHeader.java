// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmPLCocciHeader extends SmPLCompositeElement {

  @Nullable
  SmPLCIncludeCocci getCIncludeCocci();

  @Nullable
  SmPLUsingCocci getUsingCocci();

  @Nullable
  SmPLUsingSysCocci getUsingSysCocci();

  @Nullable
  SmPLVirtualCocci getVirtualCocci();

}
