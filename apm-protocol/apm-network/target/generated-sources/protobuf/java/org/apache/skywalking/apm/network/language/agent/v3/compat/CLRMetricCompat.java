// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/CLRMetricCompat.proto

package org.apache.skywalking.apm.network.language.agent.v3.compat;

@java.lang.Deprecated public final class CLRMetricCompat {
  private CLRMetricCompat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$language-agent/CLRMetricCompat.proto\032\024" +
      "common/Command.proto\032\036language-agent/CLR" +
      "Metric.proto2b\n\026CLRMetricReportService\022H" +
      "\n\007collect\022\".skywalking.v3.CLRMetricColle" +
      "ction\032\027.skywalking.v3.Commands\"\000B\253\001\n:org" +
      ".apache.skywalking.apm.network.language." +
      "agent.v3.compatP\001ZAskywalking.apache.org" +
      "/repo/goapi/collect/language/agent/v3/co" +
      "mpat\270\001\001\252\002$SkyWalking.NetworkProtocol.V3." +
      "Compatb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.CommandOuterClass.getDescriptor(),
          org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.getDescriptor(),
        });
    org.apache.skywalking.apm.network.common.v3.CommandOuterClass.getDescriptor();
    org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
