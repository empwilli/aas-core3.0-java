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
import aas_core.aas3_0.types.model.IClass;
import java.util.Optional;

/**
 * The value of an operation variable is a submodel element that is used as input
 * and/or output variable of an operation.
 */
@Generated("generated by aas-core-codegen")
public interface IOperationVariable extends IClass {
  /**
   * Describes an argument or result of an operation via a submodel element
   */
  ISubmodelElement getValue();

  void setValue(ISubmodelElement value);
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
