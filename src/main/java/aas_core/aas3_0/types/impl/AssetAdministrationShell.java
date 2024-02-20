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
import aas_core.aas3_0.types.model.IAssetAdministrationShell;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * An asset administration shell.
 */
@Generated("generated by aas-core-codegen")
public class AssetAdministrationShell implements IAssetAdministrationShell {
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
   * Administrative information of an identifiable element.
   *
   * <p>Some of the administrative information like the version number might need to
   * be part of the identification.
   */
  private IAdministrativeInformation administration;

  /**
   * The globally unique identification of the element.
   */
  private String id;

  /**
   * Embedded data specification.
   */
  private List<IEmbeddedDataSpecification> embeddedDataSpecifications;

  /**
   * The reference to the AAS the AAS was derived from.
   */
  private IReference derivedFrom;

  /**
   * Meta-information about the asset the AAS is representing.
   */
  private IAssetInformation assetInformation;

  /**
   * References to submodels of the AAS.
   *
   * <p>A submodel is a description of an aspect of the asset the AAS is representing.
   *
   * <p>The asset of an AAS is typically described by one or more submodels.
   *
   * <p>Temporarily no submodel might be assigned to the AAS.
   */
  private List<IReference> submodels;

  public AssetAdministrationShell(
      String id,
      IAssetInformation assetInformation,
      List<IExtension> extensions,
      String category,
      String idShort,
      List<ILangStringNameType> displayName,
      List<ILangStringTextType> description,
      IAdministrativeInformation administration,
      List<IEmbeddedDataSpecification> embeddedDataSpecifications,
      IReference derivedFrom,
      List<IReference> submodels) {
    this.extensions = extensions;
    this.idShort = idShort;
    this.displayName = displayName;
    this.category = category;
    this.description = description;
    this.id = Objects.requireNonNull(
      id,
      "Argument \"id\" must be non-null.");
    this.administration = administration;
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    this.derivedFrom = derivedFrom;
    this.assetInformation = Objects.requireNonNull(
      assetInformation,
      "Argument \"assetInformation\" must be non-null.");
    this.submodels = submodels;
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
  public Optional<IAdministrativeInformation> getAdministration() {
    return Optional.ofNullable(administration);
  }

  @Override
  public void setAdministration(IAdministrativeInformation administration) {
    this.administration = administration;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = Objects.requireNonNull(
      id,
      "Argument \"id\" must be non-null.");
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
  public Optional<IReference> getDerivedFrom() {
    return Optional.ofNullable(derivedFrom);
  }

  @Override
  public void setDerivedFrom(IReference derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  @Override
  public IAssetInformation getAssetInformation() {
    return assetInformation;
  }

  @Override
  public void setAssetInformation(IAssetInformation assetInformation) {
    this.assetInformation = Objects.requireNonNull(
      assetInformation,
      "Argument \"assetInformation\" must be non-null.");
  }

  @Override
  public Optional<List<IReference>> getSubmodels() {
    return Optional.ofNullable(submodels);
  }

  @Override
  public void setSubmodels(List<IReference> submodels) {
    this.submodels = submodels;
  }

  /**
   * Iterate over {@link AssetAdministrationShell#extensions}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IExtension> overExtensionsOrEmpty() {
    return getExtensions().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link AssetAdministrationShell#displayName}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringNameType> overDisplayNameOrEmpty() {
    return getDisplayName().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link AssetAdministrationShell#description}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<ILangStringTextType> overDescriptionOrEmpty() {
    return getDescription().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link AssetAdministrationShell#embeddedDataSpecifications}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IEmbeddedDataSpecification> overEmbeddedDataSpecificationsOrEmpty() {
    return getEmbeddedDataSpecifications().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate over {@link AssetAdministrationShell#submodels}, if set,
   * and otherwise return an empty iterator.
   */
  public Iterable<IReference> overSubmodelsOrEmpty() {
    return getSubmodels().orElseGet(Collections::emptyList);
  }

  /**
   * Iterate recursively over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descend() {
    return new AssetAdministrationShellRecursiveIterable();
  }

  /**
   * Iterate over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descendOnce() {
    return new AssetAdministrationShellIterable();
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch.
   **/
  @Override
  public void accept(IVisitor visitor) {
    visitor.visitAssetAdministrationShell(this);
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT> void accept(
      IVisitorWithContext<ContextT> visitor,
      ContextT context) {
    visitor.visitAssetAdministrationShell(this, context);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch.
   **/
  @Override
  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformAssetAdministrationShell(this);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT, T> T transform(
      ITransformerWithContext<ContextT, T> transformer,
      ContextT context) {
    return transformer.transformAssetAdministrationShell(this, context);
  }

  private class AssetAdministrationShellIterable implements Iterable<IClass> {
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
          AssetAdministrationShell.this.extensions.stream());
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.displayName.stream());
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.description.stream());
      }

      if (administration != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(AssetAdministrationShell.this.administration));
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.embeddedDataSpecifications.stream());
      }

      if (derivedFrom != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(AssetAdministrationShell.this.derivedFrom));
      }

      if (assetInformation != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(AssetAdministrationShell.this.assetInformation));
      }

      if (submodels != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.submodels.stream());
      }

      return memberStream;
    }
  }

  private class AssetAdministrationShellRecursiveIterable implements Iterable<IClass> {
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
          AssetAdministrationShell.this.extensions.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (displayName != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.displayName.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (description != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.description.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (administration != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(AssetAdministrationShell.this.administration),
            StreamSupport.stream(AssetAdministrationShell.this.administration.descend().spliterator(), false)));
      }

      if (embeddedDataSpecifications != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.embeddedDataSpecifications.stream()
            .flatMap(item -> Stream.concat(Stream.<IClass>of(item),
              StreamSupport.stream(item.descend().spliterator(), false))));
      }

      if (derivedFrom != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(AssetAdministrationShell.this.derivedFrom),
            StreamSupport.stream(AssetAdministrationShell.this.derivedFrom.descend().spliterator(), false)));
      }

      if (assetInformation != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(AssetAdministrationShell.this.assetInformation),
            StreamSupport.stream(AssetAdministrationShell.this.assetInformation.descend().spliterator(), false)));
      }

      if (submodels != null) {
        memberStream = Stream.concat(memberStream,
          AssetAdministrationShell.this.submodels.stream()
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
