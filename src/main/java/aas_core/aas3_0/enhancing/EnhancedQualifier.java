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
public class EnhancedQualifier<EnhancementT>
  extends Enhanced<EnhancementT>
  implements IQualifier {
  private final IQualifier instance;

  public EnhancedQualifier(
    IQualifier instance,
    EnhancementT enhancement
  ) {
    super(enhancement);
    this.instance = instance;
  }

  @Override
  public Optional<IReference> getSemanticId() {
    return instance.getSemanticId();
  }

  @Override
  public void setSemanticId(IReference semanticId) {
    instance.setSemanticId(semanticId);
  }

  @Override
  public Optional<List<IReference>> getSupplementalSemanticIds() {
    return instance.getSupplementalSemanticIds();
  }

  @Override
  public void setSupplementalSemanticIds(List<IReference> supplementalSemanticIds) {
    instance.setSupplementalSemanticIds(supplementalSemanticIds);
  }

  @Override
  public Optional<QualifierKind> getKind() {
    return instance.getKind();
  }

  @Override
  public void setKind(QualifierKind kind) {
    instance.setKind(kind);
  }

  @Override
  public String getType() {
    return instance.getType();
  }

  @Override
  public void setType(String type) {
    instance.setType(type);
  }

  @Override
  public DataTypeDefXsd getValueType() {
    return instance.getValueType();
  }

  @Override
  public void setValueType(DataTypeDefXsd valueType) {
    instance.setValueType(valueType);
  }

  @Override
  public Optional<String> getValue() {
    return instance.getValue();
  }

  @Override
  public void setValue(String value) {
    instance.setValue(value);
  }

  @Override
  public Optional<IReference> getValueId() {
    return instance.getValueId();
  }

  @Override
  public void setValueId(IReference valueId) {
    instance.setValueId(valueId);
  }

  public Iterable<IReference> overSupplementalSemanticIdsOrEmpty() {
    return instance.overSupplementalSemanticIdsOrEmpty();
  }

  public QualifierKind kindOrDefault() {
    return instance.kindOrDefault();
  }

  public Iterable<IClass> descendOnce() {
    return instance.descendOnce();
  }

  public Iterable<IClass> descend() {
    return instance.descend();
  }

  public void accept(IVisitor visitor) {
    visitor.visitQualifier(instance);
  }

  public <ContextT> void accept(
    IVisitorWithContext<ContextT> visitor,
    ContextT context
  ) {
    visitor.visitQualifier(instance, context);
  }

  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformQualifier(instance);
  }

  public <ContextT, T> T transform(
    ITransformerWithContext<ContextT, T> transformer,
    ContextT context
  ) {
    return transformer.transformQualifier(instance, context);
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
