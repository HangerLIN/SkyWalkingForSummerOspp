// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service-mesh-probe/service-mesh.proto

package org.apache.skywalking.apm.network.servicemesh.v3;

public interface TCPServiceMeshMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.TCPServiceMeshMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .skywalking.v3.TCPServiceMeshMetric metrics = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.servicemesh.v3.TCPServiceMeshMetric> 
      getMetricsList();
  /**
   * <code>repeated .skywalking.v3.TCPServiceMeshMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.servicemesh.v3.TCPServiceMeshMetric getMetrics(int index);
  /**
   * <code>repeated .skywalking.v3.TCPServiceMeshMetric metrics = 1;</code>
   */
  int getMetricsCount();
  /**
   * <code>repeated .skywalking.v3.TCPServiceMeshMetric metrics = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.servicemesh.v3.TCPServiceMeshMetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.TCPServiceMeshMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.servicemesh.v3.TCPServiceMeshMetricOrBuilder getMetricsOrBuilder(
      int index);
}
