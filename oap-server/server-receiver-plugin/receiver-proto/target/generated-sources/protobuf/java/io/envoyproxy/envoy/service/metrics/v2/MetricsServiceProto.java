// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/metrics/v2/metrics_service.proto

package io.envoyproxy.envoy.service.metrics.v2;

public final class MetricsServiceProto {
  private MetricsServiceProto() {}
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
      "\n.envoy/service/metrics/v2/metrics_servi" +
      "ce.proto\022\030envoy.service.metrics.v2\032.envo" +
      "y/service/metrics/v3/metrics_service.pro" +
      "to2\206\001\n\016MetricsService\022t\n\rStreamMetrics\022." +
      ".envoy.service.metrics.v3.StreamMetricsM" +
      "essage\032/.envoy.service.metrics.v3.Stream" +
      "MetricsResponse\"\000(\001BF\n&io.envoyproxy.env" +
      "oy.service.metrics.v2B\023MetricsServicePro" +
      "toP\001Z\002v2\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.service.metrics.v3.MetricsServiceProto.getDescriptor(),
        });
    io.envoyproxy.envoy.service.metrics.v3.MetricsServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
