// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Continuous.proto

package org.apache.skywalking.apm.network.ebpf.profiling.v3;

public interface ContinuousProfilingURICauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.ContinuousProfilingURICause)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string regex = 1;</code>
   * @return Whether the regex field is set.
   */
  boolean hasRegex();
  /**
   * <code>string regex = 1;</code>
   * @return The regex.
   */
  java.lang.String getRegex();
  /**
   * <code>string regex = 1;</code>
   * @return The bytes for regex.
   */
  com.google.protobuf.ByteString
      getRegexBytes();

  /**
   * <code>string path = 2;</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <code>string path = 2;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>double threshold = 3;</code>
   * @return The threshold.
   */
  double getThreshold();

  /**
   * <code>double current = 4;</code>
   * @return The current.
   */
  double getCurrent();

  public org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingURICause.UriCase getUriCase();
}
