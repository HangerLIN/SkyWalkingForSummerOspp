// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/resource/v1/resource.proto

package io.opentelemetry.proto.resource.firehose.v0_7;

public final class ResourceProto {
  private ResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_resource_v1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.opentelemetry/proto/resource/v1/resour" +
      "ce.proto\022\037opentelemetry.proto.resource.v" +
      "1\032*opentelemetry/proto/common/v1/common." +
      "proto\"i\n\010Resource\022;\n\nattributes\030\001 \003(\0132\'." +
      "opentelemetry.proto.common.v1.KeyValue\022 " +
      "\n\030dropped_attributes_count\030\002 \001(\rB\202\001\n-io." +
      "opentelemetry.proto.resource.firehose.v0" +
      "_7B\rResourceProtoP\001Z@github.com/open-tel" +
      "emetry/opentelemetry-proto/gen/go/resour" +
      "ce/v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opentelemetry.proto.common.firehose.v0_7.CommonProto.getDescriptor(),
        });
    internal_static_opentelemetry_proto_resource_v1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_resource_v1_Resource_descriptor,
        new java.lang.String[] { "Attributes", "DroppedAttributesCount", });
    io.opentelemetry.proto.common.firehose.v0_7.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
