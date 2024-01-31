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
 * A key is a reference to an element by its ID.
 */
@Generated("generated by aas-core-codegen")
public interface IKey extends IClass {
  /**
   * Denotes which kind of entity is referenced.
   *
   * <p>In case {@link Key#getType type} = {@link KeyTypes#GLOBAL_REFERENCE},
   * the key represents a reference to a source that can be globally identified.
   *
   * <p>In case {@link Key#getType type} = {@link KeyTypes#FRAGMENT_REFERENCE} the key represents
   * a bookmark or a similar local identifier within its parent element as specified
   * by the key that precedes this key.
   *
   * <p>In all other cases the key references a model element of the same or of another AAS.
   * The name of the model element is explicitly listed.
   */
  KeyTypes getType();

  void setType(KeyTypes type);

  /**
   * The key value, for example an IRDI or an URI
   */
  String getValue();

  void setValue(String value);
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
