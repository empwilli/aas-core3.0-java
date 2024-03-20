/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.enhancing;

import java.lang.Iterable;
import java.util.Optional;
import java.util.List;
import aas_core.aas3_0.visitation.IVisitor;
import aas_core.aas3_0.visitation.IVisitorWithContext;
import aas_core.aas3_0.visitation.ITransformer;
import aas_core.aas3_0.visitation.ITransformerWithContext;
import aas_core.aas3_0.types.enums.*;
import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.*;

public class EnhancedValueReferencePair<EnhancementT>
  extends Enhanced<EnhancementT>
  implements IValueReferencePair {
  private final IValueReferencePair instance;

  public EnhancedValueReferencePair(
    IValueReferencePair instance,
    EnhancementT enhancement
  ) {
    super(enhancement);
    this.instance = instance;
  }

  @Override
  public String getValue() {
    return instance.getValue();
  }

  @Override
  public void setValue(String value) {
    instance.setValue(value);
  }

  @Override
  public IReference getValueId() {
    return instance.getValueId();
  }

  @Override
  public void setValueId(IReference valueId) {
    instance.setValueId(valueId);
  }

  public Iterable<IClass> descendOnce() {
    return instance.descendOnce();
  }

  public Iterable<IClass> descend() {
    return instance.descend();
  }

  public void accept(IVisitor visitor) {
    visitor.visitValueReferencePair(instance);
  }

  public <ContextT> void accept(
    IVisitorWithContext<ContextT> visitor,
    ContextT context
  ) {
    visitor.visitValueReferencePair(instance, context);
  }

  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformValueReferencePair(instance);
  }

  public <ContextT, T> T transform(
    ITransformerWithContext<ContextT, T> transformer,
    ContextT context
  ) {
    return transformer.transformValueReferencePair(instance, context);
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
