// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Continuous.proto

package org.apache.skywalking.apm.network.ebpf.profiling.v3;

public interface ContinuousProfilingCauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.ContinuousProfilingCause)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.skywalking.v3.ContinuousProfilingTriggeredMonitorType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.skywalking.v3.ContinuousProfilingTriggeredMonitorType type = 1;</code>
   * @return The type.
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingTriggeredMonitorType getType();

  /**
   * <code>.skywalking.v3.ContinuousProfilingSingleValueCause singleValue = 2;</code>
   * @return Whether the singleValue field is set.
   */
  boolean hasSingleValue();
  /**
   * <code>.skywalking.v3.ContinuousProfilingSingleValueCause singleValue = 2;</code>
   * @return The singleValue.
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingSingleValueCause getSingleValue();
  /**
   * <code>.skywalking.v3.ContinuousProfilingSingleValueCause singleValue = 2;</code>
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingSingleValueCauseOrBuilder getSingleValueOrBuilder();

  /**
   * <code>.skywalking.v3.ContinuousProfilingURICause uri = 3;</code>
   * @return Whether the uri field is set.
   */
  boolean hasUri();
  /**
   * <code>.skywalking.v3.ContinuousProfilingURICause uri = 3;</code>
   * @return The uri.
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingURICause getUri();
  /**
   * <code>.skywalking.v3.ContinuousProfilingURICause uri = 3;</code>
   */
  org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingURICauseOrBuilder getUriOrBuilder();

  public org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingCause.CauseCase getCauseCase();
}
