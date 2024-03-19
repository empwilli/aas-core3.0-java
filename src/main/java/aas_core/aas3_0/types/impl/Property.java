/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.types.impl;

import aas_core.aas3_0.visitation.IVisitor;
import aas_core.aas3_0.visitation.IVisitorWithContext;
import aas_core.aas3_0.visitation.ITransformer;
import aas_core.aas3_0.visitation.ITransformerWithContext;
import aas_core.aas3_0.types.enums.*;
import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Objects;
import javax.annotation.Generated;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import aas_core.aas3_0.types.model.IProperty;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A property is a data element that has a single value.
 *
 * <p>Constraints:
 * <ul>
 *   <li> Constraint AASd-007:
 *   If both, the {@link Property#getValue value} and the {@link Property#getValueId valueId} are
 *   present then the value of {@link Property#getValue value} needs to be identical to
 *   the value of the referenced coded value in {@link Property#getValueId valueId}.
 * </ul>
 */
@Generated("generated by aas-core-codegen")
public class Property implements IProperty {
  /**
   * An extension of the element.
   */
  private List<IExtension> extensions;

  /**
   * The category is a value that gives further meta information
   * w.r.t. to the class of the element.
   * It affects the expected existence of attributes and the applicability of
   * constraints.
   *
   * <p>The category is not identical to the semantic definition
   * ({@link IHasSemantics}) of an element. The category e.g. could denote that
   * the element is a measurement value whereas the semantic definition of
   * the element would denote that it is the measured temperature.
   */
  private String category;

  /**
   * In case of identifiables this attribute is a short name of the element.
   * In case of referable this ID is an identifying string of the element within
   * its name space.
   *
   * <p>In case the element is a property and the property has a semantic definition
   * ({@link IHasSemantics#getSemanticId semanticId}) conformant to IEC61360
   * the {@link IReferable#getIdShort idShort} is typically identical to the short name in English.
   */
  private String idShort;

  /**
   * Display name. Can be provided in several languages.
   */
  private List<ILangStringNameType> displayName;

  /**
   * Description or comments on the element.
   *
   * <p>The description can be provided in several languages.
   *
   * <p>If no description is defined, then the definition of the concept
   * description that defines the semantics of the element is used.
   *
   * <p>Additional information can be provided, e.g., if the element is
   * qualified and which qualifier types can be expected in which
   * context or which additional data specification templates are
   * provided.
   */
  private List<ILangStringTextType> description;

  /**
   * Identifier of the semantic definition of the element. It is called semantic ID
   * of the element or also main semantic ID of the element.
   *
   * <p>It is recommended to use a global reference.
   */
  private IReference semanticId;

  /**
   * Identifier of a supplemental semantic definition of the element.
   * It is called supplemental semantic ID of the element.
   *
   * <p>It is recommended to use a global reference.
   */
  private List<IReference> supplementalSemanticIds;

  /**
   * Additional qualification of a qualifiable element.
   *
   * <p>Constraints:
   * <ul>
   *   <li> Constraint AASd-021:
   *   Every qualifiable can only have one qualifier with the same
   *   {@link Qualifier#getType type}.
   * </ul>
   */
  private List<IQualifier> qualifiers;

  /**
   * Embedded data specification.
   */
  private List<IEmbeddedDataSpecification> embeddedDataSpecifications;

  /**
   * Data type of the value
   */
  private DataTypeDefXsd valueType;

  /**
   * The value of the property instance.
   */
  private String value;

  /**
   * Reference to the global unique ID of a coded value.
   *
   * <p>It is recommended to use a global reference.
   */
  private IReference valueId;

  public Property(DataTypeDefXsd valueType) {
    this.valueType = Objects.requireNonNull(
      valueType,
      "Argument \"valueType\" must be non-null.");
  }

  public Property(
    DataTypeDefXsd valueType,
    List<IExtension> extensions,
    String category,
    String idShort,
    List<ILangStringNameType> displayName,
    List<ILangStringTextType> description,
    IReference semanticId,
    List<IReference> supplementalSemanticIds,
    List<IQualifier> qualifiers,
    List<IEmbeddedDataSpecification> embeddedDataSpecifications,
    String value,
    IReference valueId) {
    this.extensions = extensions;
    this.idShort = idShort;
    this.displayName = displayName;
    this.category = category;
    this.description = description;
    this.semanticId = semanticId;
    this.supplementalSemanticIds = supplementalSemanticIds;
    this.qualifiers = qualifiers;
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    this.valueType = Objects.requireNonNull(
      valueType,
      "Argument \"valueType\" must be non-null.");
    this.value = value;
    this.valueId = valueId;
  }

  @Override
  public Optional<List<IExtension>> getExtensions() {
    return Optional.ofNullable(extensions);
  }

  @Override
  public void setExtensions(List<IExtension> extensions) {
    this.extensions = extensions;
  }

  @Override
  public Optional<String> getCategory() {
    return Optional.ofNullable(category);
  }

  @Override
  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public Optional<String> getIdShort() {
    return Optional.ofNullable(idShort);
  }

  @Override
  public void setIdShort(String idShort) {
    this.idShort = idShort;
  }

  @Override
  public Optional<List<ILangStringNameType>> getDisplayName() {
    return Optional.ofNullable(displayName);
  }

  @Override
  public void setDisplayName(List<ILangStringNameType> displayName) {
    this.displayName = displayName;
  }

  @Override
  public Optional<List<ILangStringTextType>> getDescription() {
    return Optional.ofNullable(description);
  }

  @Override
  public void setDescription(List<ILangStringTextType> description) {
    this.description = description;
  }

  @Override
  public Optional<IReference> getSemanticId() {
    return Optional.ofNullable(semanticId);
  }

  @Override
  public void setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
  }

  @Override
  public Optional<List<IReference>> getSupplementalSemanticIds() {
    return Optional.ofNullable(supplementalSemanticIds);
  }

  @Override
  public void setSupplementalSemanticIds(List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
  }

  @Override
  public Optional<List<IQualifier>> getQualifiers() {
    return Optional.ofNullable(qualifiers);
  }

  @Override
  public void setQualifiers(List<IQualifier> qualifiers) {
    this.qualifiers = qualifiers;
  }

  @Override
  public Optional<List<IEmbeddedDataSpecification>> getEmbeddedDataSpecifications() {
    return Optional.ofNullable(embeddedDataSpecifications);
  }

  @Override
  public void setEmbeddedDataSpecifications(List<IEmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  @Override
  public DataTypeDefXsd getValueType() {
    return valueType;
  }

  @Override
  public void setValueType(DataTypeDefXsd valueType) {
    this.valueType = Objects.requireNonNull(
      valueType,
      "Argument \"valueType\" must be non-null.");
  }

  @Override
  public Optional<String> getValue() {
    return Optional.ofNullable(value);
  }

  @Override
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public Optional<IReference> getValueId() {
    return Optional.ofNullable(valueId);
  }

  @Override
  public void setValueId(IReference valueId) {
    this.valueId = valueId;
  }

  /**
   * Iterate over {@link Property#extensions}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IExtension> overExtensionsOrEmpty() {
    return getExtensions().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Property#displayName}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringNameType> overDisplayNameOrEmpty() {
    return getDisplayName().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Property#description}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringTextType> overDescriptionOrEmpty() {
    return getDescription().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Property#supplementalSemanticIds}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IReference> overSupplementalSemanticIdsOrEmpty() {
    return getSupplementalSemanticIds().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Property#qualifiers}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IQualifier> overQualifiersOrEmpty() {
    return getQualifiers().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Property#embeddedDataSpecifications}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IEmbeddedDataSpecification> overEmbeddedDataSpecificationsOrEmpty() {
    return getEmbeddedDataSpecifications().orElseGet(Collections::emptyList);
  }

  /**
   * @return the category or the default value if it has not been set.
   */
  public String categoryOrDefault() {
    return category != null ? category : "VARIABLE";
  }

  /**
   * Iterate recursively over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descend() {
    return new PropertyRecursiveIterable();
  }

  /**
   * Iterate over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descendOnce() {
    return new PropertyIterable();
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch.
   **/
  @Override
  public void accept(IVisitor visitor) {
    visitor.visitProperty(this);
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT> void accept(
      IVisitorWithContext<ContextT> visitor,
      ContextT context) {
    visitor.visitProperty(this, context);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch.
   **/
  @Override
  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformProperty(this);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT, T> T transform(
      ITransformerWithContext<ContextT, T> transformer,
      ContextT context) {
    return transformer.transformProperty(this, context);
  }

  private class PropertyIterable implements Iterable<IClass> {
    @Override
    public Iterator<IClass> iterator() {
      Stream<IClass> stream = stream();

      return stream.iterator();
    }

    @Override
    public void forEach(Consumer<? super IClass> action) {
      Stream<IClass> stream = stream();

      stream.forEach(action);
    }

    @Override
    public Spliterator<IClass> spliterator() {
      Stream<IClass> stream = stream();

      return stream.spliterator();
    }

    private Stream<IClass> stream() {
      Stream<IClass> memberStream = Stream.empty();

      if (extensions != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.extensions.stream());
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.displayName.stream());
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.description.stream());
      }

      if (semanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(Property.this.semanticId));
      }

      if (supplementalSemanticIds != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.supplementalSemanticIds.stream());
      }

      if (qualifiers != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.qualifiers.stream());
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.embeddedDataSpecifications.stream());
      }

      if (valueId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(Property.this.valueId));
      }

      return memberStream;
    }
  }

  private class PropertyRecursiveIterable implements Iterable<IClass> {
    @Override
    public Iterator<IClass> iterator() {
      Stream<IClass> stream = stream();

      return stream.iterator();
    }

    @Override
    public void forEach(Consumer<? super IClass> action) {
      Stream<IClass> stream = stream();

      stream.forEach(action);
    }

    @Override
    public Spliterator<IClass> spliterator() {
      Stream<IClass> stream = stream();

      return stream.spliterator();
    }

    private Stream<IClass> stream() {
      Stream<IClass> memberStream = Stream.empty();

      if (extensions != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.extensions.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.displayName.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.description.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (semanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(Property.this.semanticId),
            StreamSupport.stream(Property.this.semanticId.descend().spliterator(), false)));
      }

      if (supplementalSemanticIds != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.supplementalSemanticIds.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (qualifiers != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.qualifiers.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          Property.this.embeddedDataSpecifications.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (valueId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(Property.this.valueId),
            StreamSupport.stream(Property.this.valueId.descend().spliterator(), false)));
      }

      return memberStream;
    }
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
