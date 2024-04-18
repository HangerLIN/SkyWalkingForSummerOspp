// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/common/v1/common.proto

package io.opentelemetry.proto.common.v1;

public interface InstrumentationScopeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.common.v1.InstrumentationScope)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An empty instrumentation scope name means the name is unknown.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * An empty instrumentation scope name means the name is unknown.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  java.util.List<io.opentelemetry.proto.common.v1.KeyValue> 
      getAttributesList();
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValue getAttributes(int index);
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.common.v1.KeyValueOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValueOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <code>uint32 dropped_attributes_count = 4;</code>
   * @return The droppedAttributesCount.
   */
  int getDroppedAttributesCount();
}
