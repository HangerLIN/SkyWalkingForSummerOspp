// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ai_http_uri_recognition.proto

package org.apache.skywalking.oap.server.ai.pipeline.grpc;

public interface HttpUriRecognitionSyncRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HttpUriRecognitionSyncRequest)
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
   * <pre>
   * The version of pattern dictionary at the OAP side.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The version of pattern dictionary at the OAP side.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
