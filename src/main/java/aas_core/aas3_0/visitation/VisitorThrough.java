/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.visitation;

import javax.annotation.Generated;
import aas_core.aas3_0.types.model.*;
import aas_core.aas3_0.visitation.IVisitor;

/**
 * Just descend through the instances without any action.
 *
 * <p>This class is meaningless for itself. However, it is a good base if you
 * want to descend through instances and apply actions only on a subset of
 * classes.
 */
@Generated("generated by aas-core-codegen")
public class VisitorThrough implements IVisitor {
  public void visit(IClass that) {
    that.accept(this);
  }

  public void visitExtension(
    IExtension that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitAdministrativeInformation(
    IAdministrativeInformation that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitQualifier(
    IQualifier that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitAssetAdministrationShell(
    IAssetAdministrationShell that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitAssetInformation(
    IAssetInformation that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitResource(
    IResource that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitSpecificAssetId(
    ISpecificAssetId that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitSubmodel(
    ISubmodel that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitRelationshipElement(
    IRelationshipElement that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitSubmodelElementList(
    ISubmodelElementList that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitSubmodelElementCollection(
    ISubmodelElementCollection that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitProperty(
    IProperty that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitMultiLanguageProperty(
    IMultiLanguageProperty that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitRange(
    IRange that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitReferenceElement(
    IReferenceElement that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitBlob(
    IBlob that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitFile(
    IFile that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitAnnotatedRelationshipElement(
    IAnnotatedRelationshipElement that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitEntity(
    IEntity that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitEventPayload(
    IEventPayload that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitBasicEventElement(
    IBasicEventElement that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitOperation(
    IOperation that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitOperationVariable(
    IOperationVariable that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitCapability(
    ICapability that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitConceptDescription(
    IConceptDescription that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitReference(
    IReference that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitKey(
    IKey that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitLangStringNameType(
    ILangStringNameType that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitLangStringTextType(
    ILangStringTextType that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitEnvironment(
    IEnvironment that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitEmbeddedDataSpecification(
    IEmbeddedDataSpecification that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitLevelType(
    ILevelType that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitValueReferencePair(
    IValueReferencePair that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitValueList(
    IValueList that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitLangStringPreferredNameTypeIec61360(
    ILangStringPreferredNameTypeIec61360 that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitLangStringShortNameTypeIec61360(
    ILangStringShortNameTypeIec61360 that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitLangStringDefinitionTypeIec61360(
    ILangStringDefinitionTypeIec61360 that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }

  public void visitDataSpecificationIec61360(
    IDataSpecificationIec61360 that
  ) {
    // Just descend through, do nothing with {@code that}
    for (IClass something : that.descendOnce()) {
      visit(something);
    }
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
