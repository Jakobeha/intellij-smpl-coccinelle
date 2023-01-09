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

public class SmPLCCtypeEnumImpl extends SmPLCCompositeElementImpl implements SmPLCCtypeEnum {

  public SmPLCCtypeEnumImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SmPLCVisitor visitor) {
    visitor.visitCtypeEnum(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SmPLCVisitor) accept((SmPLCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SmPLCDotExpr> getDotExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCDotExpr.class);
  }

  @Override
  @NotNull
  public List<SmPLCExpWhencode> getExpWhencodeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SmPLCExpWhencode.class);
  }

  @Override
  @Nullable
  public SmPLCId getId() {
    return findChildByClass(SmPLCId.class);
  }

  @Override
  @NotNull
  public PsiElement getEnum() {
    return findNotNullChildByType(ENUM);
  }

}
