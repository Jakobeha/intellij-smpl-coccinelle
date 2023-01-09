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

public class SmPLCDeclIdent2InitImpl extends SmPLCCompositeElementImpl implements SmPLCDeclIdent2Init {

  public SmPLCDeclIdent2InitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitDeclIdent2Init(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SmPLCAttribute getAttribute() {
    return findChildByClass(SmPLCAttribute.class);
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
  public SmPLCInitialize getInitialize() {
    return findChildByClass(SmPLCInitialize.class);
  }

  @Override
  @Nullable
  public SmPLCStorage getStorage() {
    return findChildByClass(SmPLCStorage.class);
  }

  @Override
  @NotNull
  public PsiElement getEquals() {
    return findNotNullChildByType(EQUALS);
  }

}
