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
import aas_core.aas3_0.types.model.IKey;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A key is a reference to an element by its ID.
 */
public class Key implements IKey {
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
  private KeyTypes type;

  /**
   * The key value, for example an IRDI or an URI
   */
  private String value;

  public Key(
    KeyTypes type,
    String value) {
    this.type = Objects.requireNonNull(
      type,
      "Argument \"type\" must be non-null.");
    this.value = Objects.requireNonNull(
      value,
      "Argument \"value\" must be non-null.");
  }

  @Override
  public KeyTypes getType() {
    return type;
  }

  @Override
  public void setType(KeyTypes type) {
    this.type = Objects.requireNonNull(
      type,
      "Argument \"type\" must be non-null.");
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public void setValue(String value) {
    this.value = Objects.requireNonNull(
      value,
      "Argument \"value\" must be non-null.");
  }

  /**
   * Iterate recursively over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descend() {
    return Collections.emptyList();
  }

  /**
   * Iterate over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descendOnce() {
    return Collections.emptyList();
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch.
   **/
  @Override
  public void accept(IVisitor visitor) {
    visitor.visitKey(this);
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT> void accept(
      IVisitorWithContext<ContextT> visitor,
      ContextT context) {
    visitor.visitKey(this, context);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch.
   **/
  @Override
  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformKey(this);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT, T> T transform(
      ITransformerWithContext<ContextT, T> transformer,
      ContextT context) {
    return transformer.transformKey(this, context);
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
