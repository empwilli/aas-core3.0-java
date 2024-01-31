/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.enhancing;

import java.lang.Iterable;
import java.util.Optional;
import java.util.List;
import javax.annotation.Generated;
import aas_core.aas3_0.visitation.IVisitor;
import aas_core.aas3_0.visitation.IVisitorWithContext;
import aas_core.aas3_0.visitation.ITransformer;
import aas_core.aas3_0.visitation.ITransformerWithContext;
import aas_core.aas3_0.types.enums.*;
import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.*;

@Generated("generated by aas-core-codegen")
public class EnhancedLangStringPreferredNameTypeIec61360<EnhancementT>
  extends Enhanced<EnhancementT>
  implements ILangStringPreferredNameTypeIec61360 {
  private final ILangStringPreferredNameTypeIec61360 instance;

  public EnhancedLangStringPreferredNameTypeIec61360(
    ILangStringPreferredNameTypeIec61360 instance,
    EnhancementT enhancement
  ) {
    super(enhancement);
    this.instance = instance;
  }

  @Override
  public String getLanguage() {
    return instance.getLanguage();
  }

  @Override
  public void setLanguage(String language) {
    instance.setLanguage(language);
  }

  @Override
  public String getText() {
    return instance.getText();
  }

  @Override
  public void setText(String text) {
    instance.setText(text);
  }

  public Iterable<IClass> descendOnce() {
    return instance.descendOnce();
  }

  public Iterable<IClass> descend() {
    return instance.descend();
  }

  public void accept(IVisitor visitor) {
    visitor.visitLangStringPreferredNameTypeIec61360(instance);
  }

  public <ContextT> void accept(
    IVisitorWithContext<ContextT> visitor,
    ContextT context
  ) {
    visitor.visitLangStringPreferredNameTypeIec61360(instance, context);
  }

  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformLangStringPreferredNameTypeIec61360(instance);
  }

  public <ContextT, T> T transform(
    ITransformerWithContext<ContextT, T> transformer,
    ContextT context
  ) {
    return transformer.transformLangStringPreferredNameTypeIec61360(instance, context);
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
