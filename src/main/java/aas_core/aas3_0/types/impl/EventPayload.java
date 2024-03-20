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
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import aas_core.aas3_0.types.model.IEventPayload;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Defines the necessary information of an event instance sent out or received.
 *
 * <p>This element is experimental and therefore may be subject to change or may be
 * removed completely in future versions of the meta-model.
 */
public class EventPayload implements IEventPayload {
  /**
   * Reference to the source event element, including identification of
   * {@link AssetAdministrationShell}, {@link Submodel},
   * {@link ISubmodelElement}'s.
   */
  private IReference source;

  /**
   * {@link IHasSemantics#getSemanticId semanticId} of the source event element, if available
   *
   * <p>It is recommended to use a global reference.
   */
  private IReference sourceSemanticId;

  /**
   * Reference to the referable, which defines the scope of the event.
   *
   * <p>Can be {@link AssetAdministrationShell}, {@link Submodel} or
   * {@link ISubmodelElement}.
   */
  private IReference observableReference;

  /**
   * {@link IHasSemantics#getSemanticId semanticId} of the referable which defines the scope of
   * the event, if available.
   *
   * <p>It is recommended to use a global reference.
   */
  private IReference observableSemanticId;

  /**
   * Information for the outer message infrastructure for scheduling the event to
   * the respective communication channel.
   */
  private String topic;

  /**
   * Subject, who/which initiated the creation.
   *
   * <p>This is an external reference.
   */
  private IReference subjectId;

  /**
   * Timestamp in UTC, when this event was triggered.
   */
  private String timeStamp;

  /**
   * Event specific payload.
   */
  private byte[] payload;

  public EventPayload(
    IReference source,
    IReference observableReference,
    String timeStamp) {
    this.source = Objects.requireNonNull(
      source,
      "Argument \"source\" must be non-null.");
    this.observableReference = Objects.requireNonNull(
      observableReference,
      "Argument \"observableReference\" must be non-null.");
    this.timeStamp = Objects.requireNonNull(
      timeStamp,
      "Argument \"timeStamp\" must be non-null.");
  }

  public EventPayload(
    IReference source,
    IReference observableReference,
    String timeStamp,
    IReference sourceSemanticId,
    IReference observableSemanticId,
    String topic,
    IReference subjectId,
    byte[] payload) {
    this.source = Objects.requireNonNull(
      source,
      "Argument \"source\" must be non-null.");
    this.observableReference = Objects.requireNonNull(
      observableReference,
      "Argument \"observableReference\" must be non-null.");
    this.timeStamp = Objects.requireNonNull(
      timeStamp,
      "Argument \"timeStamp\" must be non-null.");
    this.sourceSemanticId = sourceSemanticId;
    this.observableSemanticId = observableSemanticId;
    this.topic = topic;
    this.subjectId = subjectId;
    this.payload = payload;
  }

  @Override
  public IReference getSource() {
    return source;
  }

  @Override
  public void setSource(IReference source) {
    this.source = Objects.requireNonNull(
      source,
      "Argument \"source\" must be non-null.");
  }

  @Override
  public Optional<IReference> getSourceSemanticId() {
    return Optional.ofNullable(sourceSemanticId);
  }

  @Override
  public void setSourceSemanticId(IReference sourceSemanticId) {
    this.sourceSemanticId = sourceSemanticId;
  }

  @Override
  public IReference getObservableReference() {
    return observableReference;
  }

  @Override
  public void setObservableReference(IReference observableReference) {
    this.observableReference = Objects.requireNonNull(
      observableReference,
      "Argument \"observableReference\" must be non-null.");
  }

  @Override
  public Optional<IReference> getObservableSemanticId() {
    return Optional.ofNullable(observableSemanticId);
  }

  @Override
  public void setObservableSemanticId(IReference observableSemanticId) {
    this.observableSemanticId = observableSemanticId;
  }

  @Override
  public Optional<String> getTopic() {
    return Optional.ofNullable(topic);
  }

  @Override
  public void setTopic(String topic) {
    this.topic = topic;
  }

  @Override
  public Optional<IReference> getSubjectId() {
    return Optional.ofNullable(subjectId);
  }

  @Override
  public void setSubjectId(IReference subjectId) {
    this.subjectId = subjectId;
  }

  @Override
  public String getTimeStamp() {
    return timeStamp;
  }

  @Override
  public void setTimeStamp(String timeStamp) {
    this.timeStamp = Objects.requireNonNull(
      timeStamp,
      "Argument \"timeStamp\" must be non-null.");
  }

  @Override
  public Optional<byte[]> getPayload() {
    return Optional.ofNullable(payload);
  }

  @Override
  public void setPayload(byte[] payload) {
    this.payload = payload;
  }

  /**
   * Iterate recursively over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descend() {
    return new EventPayloadRecursiveIterable();
  }

  /**
   * Iterate over all the class instances referenced from this instance.
   */
  public Iterable<IClass> descendOnce() {
    return new EventPayloadIterable();
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch.
   **/
  @Override
  public void accept(IVisitor visitor) {
    visitor.visitEventPayload(this);
  }

  /**
   * Accept the {@code visitor} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT> void accept(
      IVisitorWithContext<ContextT> visitor,
      ContextT context) {
    visitor.visitEventPayload(this, context);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch.
   **/
  @Override
  public <T> T transform(ITransformer<T> transformer) {
    return transformer.transformEventPayload(this);
  }

  /**
   * Accept the {@code transformer} to visit this instance for double dispatch
   * with the {@code context}.
   **/
  @Override
  public <ContextT, T> T transform(
      ITransformerWithContext<ContextT, T> transformer,
      ContextT context) {
    return transformer.transformEventPayload(this, context);
  }

  private class EventPayloadIterable implements Iterable<IClass> {
    @Override
    public Iterator<IClass> iterator() {
      Stream<IClass> stream = stream();

      return stream.iterator();
    }

    @Override
    public void forEach(Consumer<? super IClass> action) {
      Stream<IClass> stream = stream();

      stream.forEach(action);
    }

    @Override
    public Spliterator<IClass> spliterator() {
      Stream<IClass> stream = stream();

      return stream.spliterator();
    }

    private Stream<IClass> stream() {
      Stream<IClass> memberStream = Stream.empty();

      if (source != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(EventPayload.this.source));
      }

      if (sourceSemanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(EventPayload.this.sourceSemanticId));
      }

      if (observableReference != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(EventPayload.this.observableReference));
      }

      if (observableSemanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(EventPayload.this.observableSemanticId));
      }

      if (subjectId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.<IClass>of(EventPayload.this.subjectId));
      }

      return memberStream;
    }
  }

  private class EventPayloadRecursiveIterable implements Iterable<IClass> {
    @Override
    public Iterator<IClass> iterator() {
      Stream<IClass> stream = stream();

      return stream.iterator();
    }

    @Override
    public void forEach(Consumer<? super IClass> action) {
      Stream<IClass> stream = stream();

      stream.forEach(action);
    }

    @Override
    public Spliterator<IClass> spliterator() {
      Stream<IClass> stream = stream();

      return stream.spliterator();
    }

    private Stream<IClass> stream() {
      Stream<IClass> memberStream = Stream.empty();

      if (source != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(EventPayload.this.source),
            StreamSupport.stream(EventPayload.this.source.descend().spliterator(), false)));
      }

      if (sourceSemanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(EventPayload.this.sourceSemanticId),
            StreamSupport.stream(EventPayload.this.sourceSemanticId.descend().spliterator(), false)));
      }

      if (observableReference != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(EventPayload.this.observableReference),
            StreamSupport.stream(EventPayload.this.observableReference.descend().spliterator(), false)));
      }

      if (observableSemanticId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(EventPayload.this.observableSemanticId),
            StreamSupport.stream(EventPayload.this.observableSemanticId.descend().spliterator(), false)));
      }

      if (subjectId != null) {
        memberStream = Stream.concat(memberStream,
          Stream.concat(Stream.<IClass>of(EventPayload.this.subjectId),
            StreamSupport.stream(EventPayload.this.subjectId.descend().spliterator(), false)));
      }

      return memberStream;
    }
  }
}

/*
 * This code has been automatically generated by aas-core-codegen.
 * Do NOT edit or append.
 */
