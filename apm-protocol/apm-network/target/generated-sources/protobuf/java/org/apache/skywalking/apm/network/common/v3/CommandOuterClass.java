// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/Command.proto

package org.apache.skywalking.apm.network.common.v3;

public final class CommandOuterClass {
  private CommandOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_Commands_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_Commands_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024common/Command.proto\022\rskywalking.v3\032\023c" +
      "ommon/Common.proto\"K\n\007Command\022\017\n\007command" +
      "\030\001 \001(\t\022/\n\004args\030\002 \003(\0132!.skywalking.v3.Key" +
      "StringValuePair\"4\n\010Commands\022(\n\010commands\030" +
      "\001 \003(\0132\026.skywalking.v3.CommandB\203\001\n+org.ap" +
      "ache.skywalking.apm.network.common.v3P\001Z" +
      "2skywalking.apache.org/repo/goapi/collec" +
      "t/common/v3\252\002\035SkyWalking.NetworkProtocol" +
      ".V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
        });
    internal_static_skywalking_v3_Command_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_skywalking_v3_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_Command_descriptor,
        new java.lang.String[] { "Command", "Args", });
    internal_static_skywalking_v3_Commands_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_skywalking_v3_Commands_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_Commands_descriptor,
        new java.lang.String[] { "Commands", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
