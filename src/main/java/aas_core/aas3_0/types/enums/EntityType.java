/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.types.enums;

import javax.annotation.Generated;

/**
 * Enumeration for denoting whether an entity is a self-managed entity or a co-managed
 * entity.
 */
@Generated("generated by aas-core-codegen")
public enum EntityType {
  /**
   * For co-managed entities there is no separate AAS. Co-managed entities need to be
   * part of a self-managed entity.
   */
  CO_MANAGED_ENTITY,
  /**
   * Self-Managed Entities have their own AAS but can be part of the bill of material of
   * a composite self-managed entity.
   *
   * <p>The asset of an I4.0 Component is a self-managed entity per definition.
   */
  SELF_MANAGED_ENTITY
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
