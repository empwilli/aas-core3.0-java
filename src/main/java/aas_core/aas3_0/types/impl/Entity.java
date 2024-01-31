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
import aas_core.aas3_0.types.model.IEntity;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * An entity is a submodel element that is used to model entities.
 *
 * <p>Constraints:
 * <ul>
 *   <li> Constraint AASd-014:
 *   Either the attribute {@link Entity#getGlobalAssetId globalAssetId} or {@link Entity#getSpecificAssetIds specificAssetIds}
 *   of an {@link Entity} must be set if {@link Entity#getEntityType entityType} is set to
 *   {@link EntityType#SELF_MANAGED_ENTITY}. They are not existing otherwise.
 * </ul>
 */
@Generated("generated by aas-core-codegen")
public class Entity implements IEntity {
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
   * Describes statements applicable to the entity by a set of submodel elements,
   * typically with a qualified value.
   */
  private List<ISubmodelElement> statements;

  /**
   * Describes whether the entity is a co-managed entity or a self-managed entity.
   */
  private EntityType entityType;

  /**
   * Global identifier of the asset the entity is representing.
   *
   * <p>This is a global reference.
   */
  private String globalAssetId;

  /**
   * Reference to a specific asset ID representing a supplementary identifier
   * of the asset represented by the Asset Administration Shell.
   */
  private List<ISpecificAssetId> specificAssetIds;

  public Entity(
      EntityType entityType,
      List<IExtension> extensions,
      String category,
      String idShort,
      List<ILangStringNameType> displayName,
      List<ILangStringTextType> description,
      IReference semanticId,
      List<IReference> supplementalSemanticIds,
      List<IQualifier> qualifiers,
      List<IEmbeddedDataSpecification> embeddedDataSpecifications,
      List<ISubmodelElement> statements,
      String globalAssetId,
      List<ISpecificAssetId> specificAssetIds) {
    this.extensions = extensions;
    this.idShort = idShort;
    this.displayName = displayName;
    this.category = category;
    this.description = description;
    this.semanticId = semanticId;
    this.supplementalSemanticIds = supplementalSemanticIds;
    this.qualifiers = qualifiers;
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    this.statements = statements;
    this.entityType = Objects.requireNonNull(
      entityType,
      "Argument \"entityType\" must be non-null.");
    this.globalAssetId = globalAssetId;
    this.specificAssetIds = specificAssetIds;
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
  public Optional<List<ISubmodelElement>> getStatements() {
    return Optional.ofNullable(statements);
  }

  @Override
  public void setStatements(List<ISubmodelElement> statements) {
    this.statements = statements;
  }

  @Override
  public EntityType getEntityType() {
    return entityType;
  }

  @Override
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }

  @Override
  public Optional<String> getGlobalAssetId() {
    return Optional.ofNullable(globalAssetId);
  }

  @Override
  public void setGlobalAssetId(String globalAssetId) {
    this.globalAssetId = globalAssetId;
  }

  @Override
  public Optional<List<ISpecificAssetId>> getSpecificAssetIds() {
    return Optional.ofNullable(specificAssetIds);
  }

  @Override
  public void setSpecificAssetIds(List<ISpecificAssetId> specificAssetIds) {
    this.specificAssetIds = specificAssetIds;
  }

  /**
   * Iterate over {@link Entity#extensions}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IExtension> overExtensionsOrEmpty() {
    return getExtensions().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Entity#displayName}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringNameType> overDisplayNameOrEmpty() {
    return getDisplayName().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Entity#description}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringTextType> overDescriptionOrEmpty() {
    return getDescription().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Entity#supplementalSemanticIds}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IReference> overSupplementalSemanticIdsOrEmpty() {
    return getSupplementalSemanticIds().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Entity#qualifiers}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IQualifier> overQualifiersOrEmpty() {
    return getQualifiers().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Entity#embeddedDataSpecifications}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IEmbeddedDataSpecification> overEmbeddedDataSpecificationsOrEmpty() {
    return getEmbeddedDataSpecifications().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Entity#statements}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ISubmodelElement> overStatementsOrEmpty() {
    return getStatements().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link Entity#specificAssetIds}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ISpecificAssetId> overSpecificAssetIdsOrEmpty() {
    return getSpecificAssetIds().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate recursively over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descend() {
    return new EntityRecursiveIterable();
  }

  /**
   * Iterate over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descendOnce() {
    return new EntityIterable();
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch.
   **/
  @Override
  public void accept(IVisitor visitor) {
    visitor.visitEntity(this);
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT> void accept(
      IVisitorWithContext<ContextT> visitor,
      ContextT context) {
    visitor.visitEntity(this, context);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch.
   **/
  @Override
  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformEntity(this);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT, T> T transform(
      ITransformerWithContext<ContextT, T> transformer,
      ContextT context) {
    return transformer.transformEntity(this, context);
  }

  private class EntityIterable implements Iterable<IClass> {
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
          Entity.this.extensions.stream());
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.displayName.stream());
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.description.stream());
      }

      if (semanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(Entity.this.semanticId));
      }

      if (supplementalSemanticIds != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.supplementalSemanticIds.stream());
      }

      if (qualifiers != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.qualifiers.stream());
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.embeddedDataSpecifications.stream());
      }

      if (statements != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.statements.stream());
      }

      if (specificAssetIds != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.specificAssetIds.stream());
      }

      return memberStream;
    }
  }

  private class EntityRecursiveIterable implements Iterable<IClass> {
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
          Entity.this.extensions.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.displayName.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.description.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (semanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(Entity.this.semanticId),
            StreamSupport.stream(Entity.this.semanticId.descend().spliterator(), false)));
      }

      if (supplementalSemanticIds != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.supplementalSemanticIds.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (qualifiers != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.qualifiers.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.embeddedDataSpecifications.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (statements != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.statements.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (specificAssetIds != null) {
        memberStream = Stream.concat(memberStream,
          Entity.this.specificAssetIds.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      return memberStream;
    }
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
