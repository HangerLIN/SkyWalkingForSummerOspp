// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Continuous.proto

package org.apache.skywalking.apm.network.ebpf.profiling.v3;

public interface ContinuousProfilingServicePolicyQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.ContinuousProfilingServicePolicyQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * service name of the each process
   * </pre>
   *
   * <code>string serviceName = 1;</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * service name of the each process
   * </pre>
   *
   * <code>string serviceName = 1;</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * UUID represents the version(hash/shasum) of the current policies for the service.
   * This is blank in the initialization stage and is set through the `ContinuousProfilingPolicyQuery` command response for the following rounds of queries.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * UUID represents the version(hash/shasum) of the current policies for the service.
   * This is blank in the initialization stage and is set through the `ContinuousProfilingPolicyQuery` command response for the following rounds of queries.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();
}
