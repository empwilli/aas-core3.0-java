/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */

package aas_core.aas3_0.types.model;

import aas_core.aas3_0.types.enums.*;
import aas_core.aas3_0.types.impl.*;

/** Embed the content of a data specification. */
public interface IEmbeddedDataSpecification extends IClass {
  /** Reference to the data specification */
  IReference getDataSpecification();

  void setDataSpecification(IReference dataSpecification);

  /** Actual content of the data specification */
  IDataSpecificationContent getDataSpecificationContent();

  void setDataSpecificationContent(IDataSpecificationContent dataSpecificationContent);
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
