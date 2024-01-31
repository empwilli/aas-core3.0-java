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
public class EnhancedReference<EnhancementT>
  extends Enhanced<EnhancementT>
  implements IReference {
  private final IReference instance;

  public EnhancedReference(
    IReference instance,
    EnhancementT enhancement
  ) {
    super(enhancement);
    this.instance = instance;
  }

  @Override
  public ReferenceTypes getType() {
    return instance.getType();
  }

  @Override
  public void setType(ReferenceTypes type) {
    instance.setType(type);
  }

  @Override
  public Optional<IReference> getReferredSemanticId() {
    return instance.getReferredSemanticId();
  }

  @Override
  public void setReferredSemanticId(IReference referredSemanticId) {
    instance.setReferredSemanticId(referredSemanticId);
  }

  @Override
  public List<IKey> getKeys() {
    return instance.getKeys();
  }

  @Override
  public void setKeys(List<IKey> keys) {
    instance.setKeys(keys);
  }

  public Iterable<IClass> descendOnce() {
    return instance.descendOnce();
  }

  public Iterable<IClass> descend() {
    return instance.descend();
  }

  public void accept(IVisitor visitor) {
    visitor.visitReference(instance);
  }

  public <ContextT> void accept(
    IVisitorWithContext<ContextT> visitor,
    ContextT context
  ) {
    visitor.visitReference(instance, context);
  }

  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformReference(instance);
  }

  public <ContextT, T> T transform(
    ITransformerWithContext<ContextT, T> transformer,
    ContextT context
  ) {
    return transformer.transformReference(instance, context);
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
