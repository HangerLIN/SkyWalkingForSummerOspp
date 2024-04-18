// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/collector/trace/v1/trace_service.proto

package io.opentelemetry.proto.collector.trace.v1;

/**
 * Protobuf type {@code opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess}
 */
public final class ExportTracePartialSuccess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess)
    ExportTracePartialSuccessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportTracePartialSuccess.newBuilder() to construct.
  private ExportTracePartialSuccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportTracePartialSuccess() {
    errorMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportTracePartialSuccess();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExportTracePartialSuccess(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            rejectedSpans_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentelemetry.proto.collector.trace.v1.TraceServiceProto.internal_static_opentelemetry_proto_collector_trace_v1_ExportTracePartialSuccess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.collector.trace.v1.TraceServiceProto.internal_static_opentelemetry_proto_collector_trace_v1_ExportTracePartialSuccess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.class, io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.Builder.class);
  }

  public static final int REJECTED_SPANS_FIELD_NUMBER = 1;
  private long rejectedSpans_;
  /**
   * <pre>
   * The number of rejected spans.
   * A `rejected_&lt;signal&gt;` field holding a `0` value indicates that the
   * request was fully accepted.
   * </pre>
   *
   * <code>int64 rejected_spans = 1;</code>
   * @return The rejectedSpans.
   */
  @java.lang.Override
  public long getRejectedSpans() {
    return rejectedSpans_;
  }

  public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object errorMessage_;
  /**
   * <pre>
   * A developer-facing human-readable message in English. It should be used
   * either to explain why the server rejected parts of the data during a partial
   * success or to convey warnings/suggestions during a full success. The message
   * should offer guidance on how users can address such issues.
   * error_message is an optional field. An error_message with an empty value
   * is equivalent to it not being set.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The errorMessage.
   */
  @java.lang.Override
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A developer-facing human-readable message in English. It should be used
   * either to explain why the server rejected parts of the data during a partial
   * success or to convey warnings/suggestions during a full success. The message
   * should offer guidance on how users can address such issues.
   * error_message is an optional field. An error_message with an empty value
   * is equivalent to it not being set.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The bytes for errorMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (rejectedSpans_ != 0L) {
      output.writeInt64(1, rejectedSpans_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rejectedSpans_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, rejectedSpans_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMessage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess other = (io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess) obj;

    if (getRejectedSpans()
        != other.getRejectedSpans()) return false;
    if (!getErrorMessage()
        .equals(other.getErrorMessage())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REJECTED_SPANS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRejectedSpans());
    hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess)
      io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentelemetry.proto.collector.trace.v1.TraceServiceProto.internal_static_opentelemetry_proto_collector_trace_v1_ExportTracePartialSuccess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.collector.trace.v1.TraceServiceProto.internal_static_opentelemetry_proto_collector_trace_v1_ExportTracePartialSuccess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.class, io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.Builder.class);
    }

    // Construct using io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      rejectedSpans_ = 0L;

      errorMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentelemetry.proto.collector.trace.v1.TraceServiceProto.internal_static_opentelemetry_proto_collector_trace_v1_ExportTracePartialSuccess_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess getDefaultInstanceForType() {
      return io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess build() {
      io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess buildPartial() {
      io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess result = new io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess(this);
      result.rejectedSpans_ = rejectedSpans_;
      result.errorMessage_ = errorMessage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess) {
        return mergeFrom((io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess other) {
      if (other == io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess.getDefaultInstance()) return this;
      if (other.getRejectedSpans() != 0L) {
        setRejectedSpans(other.getRejectedSpans());
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long rejectedSpans_ ;
    /**
     * <pre>
     * The number of rejected spans.
     * A `rejected_&lt;signal&gt;` field holding a `0` value indicates that the
     * request was fully accepted.
     * </pre>
     *
     * <code>int64 rejected_spans = 1;</code>
     * @return The rejectedSpans.
     */
    @java.lang.Override
    public long getRejectedSpans() {
      return rejectedSpans_;
    }
    /**
     * <pre>
     * The number of rejected spans.
     * A `rejected_&lt;signal&gt;` field holding a `0` value indicates that the
     * request was fully accepted.
     * </pre>
     *
     * <code>int64 rejected_spans = 1;</code>
     * @param value The rejectedSpans to set.
     * @return This builder for chaining.
     */
    public Builder setRejectedSpans(long value) {
      
      rejectedSpans_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of rejected spans.
     * A `rejected_&lt;signal&gt;` field holding a `0` value indicates that the
     * request was fully accepted.
     * </pre>
     *
     * <code>int64 rejected_spans = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRejectedSpans() {
      
      rejectedSpans_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <pre>
     * A developer-facing human-readable message in English. It should be used
     * either to explain why the server rejected parts of the data during a partial
     * success or to convey warnings/suggestions during a full success. The message
     * should offer guidance on how users can address such issues.
     * error_message is an optional field. An error_message with an empty value
     * is equivalent to it not being set.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @return The errorMessage.
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A developer-facing human-readable message in English. It should be used
     * either to explain why the server rejected parts of the data during a partial
     * success or to convey warnings/suggestions during a full success. The message
     * should offer guidance on how users can address such issues.
     * error_message is an optional field. An error_message with an empty value
     * is equivalent to it not being set.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @return The bytes for errorMessage.
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A developer-facing human-readable message in English. It should be used
     * either to explain why the server rejected parts of the data during a partial
     * success or to convey warnings/suggestions during a full success. The message
     * should offer guidance on how users can address such issues.
     * error_message is an optional field. An error_message with an empty value
     * is equivalent to it not being set.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @param value The errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A developer-facing human-readable message in English. It should be used
     * either to explain why the server rejected parts of the data during a partial
     * success or to convey warnings/suggestions during a full success. The message
     * should offer guidance on how users can address such issues.
     * error_message is an optional field. An error_message with an empty value
     * is equivalent to it not being set.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A developer-facing human-readable message in English. It should be used
     * either to explain why the server rejected parts of the data during a partial
     * success or to convey warnings/suggestions during a full success. The message
     * should offer guidance on how users can address such issues.
     * error_message is an optional field. An error_message with an empty value
     * is equivalent to it not being set.
     * </pre>
     *
     * <code>string error_message = 2;</code>
     * @param value The bytes for errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess)
  private static final io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess();
  }

  public static io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportTracePartialSuccess>
      PARSER = new com.google.protobuf.AbstractParser<ExportTracePartialSuccess>() {
    @java.lang.Override
    public ExportTracePartialSuccess parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExportTracePartialSuccess(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExportTracePartialSuccess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportTracePartialSuccess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

