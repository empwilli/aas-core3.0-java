/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.visitation;

import aas_core.aas3_0.types.model.*;
import aas_core.aas3_0.visitation.IVisitor;

/**
 * Perform double-dispatch to visit the concrete instances.
 */
public abstract class AbstractVisitor implements IVisitor
{
  public void visit(IClass that)
  {
    that.accept(this);
  }
  public abstract void visitExtension(
    IExtension that
  );
  public abstract void visitAdministrativeInformation(
    IAdministrativeInformation that
  );
  public abstract void visitQualifier(
    IQualifier that
  );
  public abstract void visitAssetAdministrationShell(
    IAssetAdministrationShell that
  );
  public abstract void visitAssetInformation(
    IAssetInformation that
  );
  public abstract void visitResource(
    IResource that
  );
  public abstract void visitSpecificAssetId(
    ISpecificAssetId that
  );
  public abstract void visitSubmodel(
    ISubmodel that
  );
  public abstract void visitRelationshipElement(
    IRelationshipElement that
  );
  public abstract void visitSubmodelElementList(
    ISubmodelElementList that
  );
  public abstract void visitSubmodelElementCollection(
    ISubmodelElementCollection that
  );
  public abstract void visitProperty(
    IProperty that
  );
  public abstract void visitMultiLanguageProperty(
    IMultiLanguageProperty that
  );
  public abstract void visitRange(
    IRange that
  );
  public abstract void visitReferenceElement(
    IReferenceElement that
  );
  public abstract void visitBlob(
    IBlob that
  );
  public abstract void visitFile(
    IFile that
  );
  public abstract void visitAnnotatedRelationshipElement(
    IAnnotatedRelationshipElement that
  );
  public abstract void visitEntity(
    IEntity that
  );
  public abstract void visitEventPayload(
    IEventPayload that
  );
  public abstract void visitBasicEventElement(
    IBasicEventElement that
  );
  public abstract void visitOperation(
    IOperation that
  );
  public abstract void visitOperationVariable(
    IOperationVariable that
  );
  public abstract void visitCapability(
    ICapability that
  );
  public abstract void visitConceptDescription(
    IConceptDescription that
  );
  public abstract void visitReference(
    IReference that
  );
  public abstract void visitKey(
    IKey that
  );
  public abstract void visitLangStringNameType(
    ILangStringNameType that
  );
  public abstract void visitLangStringTextType(
    ILangStringTextType that
  );
  public abstract void visitEnvironment(
    IEnvironment that
  );
  public abstract void visitEmbeddedDataSpecification(
    IEmbeddedDataSpecification that
  );
  public abstract void visitLevelType(
    ILevelType that
  );
  public abstract void visitValueReferencePair(
    IValueReferencePair that
  );
  public abstract void visitValueList(
    IValueList that
  );
  public abstract void visitLangStringPreferredNameTypeIec61360(
    ILangStringPreferredNameTypeIec61360 that
  );
  public abstract void visitLangStringShortNameTypeIec61360(
    ILangStringShortNameTypeIec61360 that
  );
  public abstract void visitLangStringDefinitionTypeIec61360(
    ILangStringDefinitionTypeIec61360 that
  );
  public abstract void visitDataSpecificationIec61360(
    IDataSpecificationIec61360 that
  );
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
