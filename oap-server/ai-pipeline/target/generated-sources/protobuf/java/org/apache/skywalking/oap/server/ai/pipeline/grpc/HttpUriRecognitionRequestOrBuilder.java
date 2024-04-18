// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ai_http_uri_recognition.proto

package org.apache.skywalking.oap.server.ai.pipeline.grpc;

public interface HttpUriRecognitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HttpUriRecognitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string service = 1;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <code>string service = 1;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <code>repeated .HttpRawUri unrecognizedUris = 2;</code>
   */
  java.util.List<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpRawUri> 
      getUnrecognizedUrisList();
  /**
   * <code>repeated .HttpRawUri unrecognizedUris = 2;</code>
   */
  org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpRawUri getUnrecognizedUris(int index);
  /**
   * <code>repeated .HttpRawUri unrecognizedUris = 2;</code>
   */
  int getUnrecognizedUrisCount();
  /**
   * <code>repeated .HttpRawUri unrecognizedUris = 2;</code>
   */
  java.util.List<? extends org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpRawUriOrBuilder> 
      getUnrecognizedUrisOrBuilderList();
  /**
   * <code>repeated .HttpRawUri unrecognizedUris = 2;</code>
   */
  org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpRawUriOrBuilder getUnrecognizedUrisOrBuilder(
      int index);
}
