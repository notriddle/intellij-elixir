// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.elixir_lang.psi.ElixirTypes.*;
import org.elixir_lang.psi.*;

public class ElixirKeywordIdentifierImpl extends ElixirExpressionImpl implements ElixirKeywordIdentifier {

  public ElixirKeywordIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitKeywordIdentifier(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirCharList getCharList() {
    return findChildByClass(ElixirCharList.class);
  }

  @Override
  @Nullable
  public ElixirString getString() {
    return findChildByClass(ElixirString.class);
  }

}
