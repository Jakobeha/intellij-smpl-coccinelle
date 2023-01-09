// This is a generated file. Not intended for manual editing.
package com.github.jakobeha.intellijsmplcoccinelle.c.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.jakobeha.intellijsmplcoccinelle.c.psi.SmPLCTypes.*;
import com.github.jakobeha.intellijsmplcoccinelle.c.psi.*;

public class SmPLCSingleOneDeclIdent2Impl extends SmPLCCompositeElementImpl implements SmPLCSingleOneDeclIdent2 {

  public SmPLCSingleOneDeclIdent2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitSingleOneDeclIdent2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCConstVol getConstVol() {
    return findChildByClass(SmPLCConstVol.class);
  }

  @Override
  @NotNull
  public SmPLCDIdent getDIdent() {
    return findNotNullChildByClass(SmPLCDIdent.class);
  }

  @Override
  @NotNull
  public SmPLCId getId() {
    return findNotNullChildByClass(SmPLCId.class);
  }

  @Override
  @Nullable
  public SmPLCStorage getStorage() {
    return findChildByClass(SmPLCStorage.class);
  }

}
