/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.visitation;

import javax.annotation.Generated;
import aas_core.aas3_0.types.model.*;

/**
 * Define the interface for a transformer which transforms recursively
 * the instances into something else.
 *
 * <p>When you use the transformer, please always call the main dispatching method
 * {@link ITransformer#transform}. You should most probably never call the {@code transform}
 * methods directly. They are only made public so that model classes can access them.
 * </remarks>
 */
@Generated("generated by aas-core-codegen")
public interface ITransformer<T> {
  T transform(IClass that);
  T transformExtension(
    IExtension that
  );
  T transformAdministrativeInformation(
    IAdministrativeInformation that
  );
  T transformQualifier(
    IQualifier that
  );
  T transformAssetAdministrationShell(
    IAssetAdministrationShell that
  );
  T transformAssetInformation(
    IAssetInformation that
  );
  T transformResource(
    IResource that
  );
  T transformSpecificAssetId(
    ISpecificAssetId that
  );
  T transformSubmodel(
    ISubmodel that
  );
  T transformRelationshipElement(
    IRelationshipElement that
  );
  T transformSubmodelElementList(
    ISubmodelElementList that
  );
  T transformSubmodelElementCollection(
    ISubmodelElementCollection that
  );
  T transformProperty(
    IProperty that
  );
  T transformMultiLanguageProperty(
    IMultiLanguageProperty that
  );
  T transformRange(
    IRange that
  );
  T transformReferenceElement(
    IReferenceElement that
  );
  T transformBlob(
    IBlob that
  );
  T transformFile(
    IFile that
  );
  T transformAnnotatedRelationshipElement(
    IAnnotatedRelationshipElement that
  );
  T transformEntity(
    IEntity that
  );
  T transformEventPayload(
    IEventPayload that
  );
  T transformBasicEventElement(
    IBasicEventElement that
  );
  T transformOperation(
    IOperation that
  );
  T transformOperationVariable(
    IOperationVariable that
  );
  T transformCapability(
    ICapability that
  );
  T transformConceptDescription(
    IConceptDescription that
  );
  T transformReference(
    IReference that
  );
  T transformKey(
    IKey that
  );
  T transformLangStringNameType(
    ILangStringNameType that
  );
  T transformLangStringTextType(
    ILangStringTextType that
  );
  T transformEnvironment(
    IEnvironment that
  );
  T transformEmbeddedDataSpecification(
    IEmbeddedDataSpecification that
  );
  T transformLevelType(
    ILevelType that
  );
  T transformValueReferencePair(
    IValueReferencePair that
  );
  T transformValueList(
    IValueList that
  );
  T transformLangStringPreferredNameTypeIec61360(
    ILangStringPreferredNameTypeIec61360 that
  );
  T transformLangStringShortNameTypeIec61360(
    ILangStringShortNameTypeIec61360 that
  );
  T transformLangStringDefinitionTypeIec61360(
    ILangStringDefinitionTypeIec61360 that
  );
  T transformDataSpecificationIec61360(
    IDataSpecificationIec61360 that
  );
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
