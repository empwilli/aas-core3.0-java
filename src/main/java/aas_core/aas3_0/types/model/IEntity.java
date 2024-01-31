/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.types.model;

import aas_core.aas3_0.types.enums.*;
import aas_core.aas3_0.types.impl.*;
import aas_core.aas3_0.types.model.*;
import java.util.List;
import javax.annotation.Generated;
import aas_core.aas3_0.types.model.ISubmodelElement;
import java.util.Optional;

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
public interface IEntity extends ISubmodelElement {
  /**
   * Describes statements applicable to the entity by a set of submodel elements,
   * typically with a qualified value.
   */
  Optional<List<ISubmodelElement>> getStatements();

  void setStatements(List<ISubmodelElement> statements);

  /**
   * Describes whether the entity is a co-managed entity or a self-managed entity.
   */
  EntityType getEntityType();

  void setEntityType(EntityType entityType);

  /**
   * Global identifier of the asset the entity is representing.
   *
   * <p>This is a global reference.
   */
  Optional<String> getGlobalAssetId();

  void setGlobalAssetId(String globalAssetId);

  /**
   * Reference to a specific asset ID representing a supplementary identifier
   * of the asset represented by the Asset Administration Shell.
   */
  Optional<List<ISpecificAssetId>> getSpecificAssetIds();

  void setSpecificAssetIds(List<ISpecificAssetId> specificAssetIds);

  /**
   * Iterate over statements, if set, and otherwise return an empty enumerable.
   */
  Iterable<ISubmodelElement> overStatementsOrEmpty();

  /**
   * Iterate over specificAssetIds, if set, and otherwise return an empty enumerable.
   */
  Iterable<ISpecificAssetId> overSpecificAssetIdsOrEmpty();
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
