/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.types.model;

import aas_core.aas3_0.types.enums.*;
import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.*;
import java.util.List;
import aas_core.aas3_0.types.model.IReferable;
import aas_core.aas3_0.types.model.IHasSemantics;
import aas_core.aas3_0.types.model.IQualifiable;
import aas_core.aas3_0.types.model.IHasDataSpecification;

/**
 * A submodel element is an element suitable for the description and differentiation of
 * assets.
 *
 * <p>It is recommended to add a {@link IHasSemantics#getSemanticId semanticId} to a submodel element.
 *
 * <p>Constraints:
 * <ul>
 *   <li> Constraint AASd-129:
 *   If any {@link Qualifier#getKind kind} value of {@link ISubmodelElement#getQualifiers qualifiers} (attribute qualifier
 *   inherited via Qualifiable) is equal to {@link QualifierKind#TEMPLATE_QUALIFIER}
 *   then the submodel element shall be part of a submodel template, i.e.
 *   a Submodel with {@link Submodel#getKind kind} (attribute kind inherited via
 *   {@link IHasKind}) value is equal to {@link ModellingKind#TEMPLATE}.
 * </ul>
 */

public interface ISubmodelElement extends
    IReferable,
    IHasSemantics,
    IQualifiable,
    IHasDataSpecification {
  // Intentionally empty.
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
