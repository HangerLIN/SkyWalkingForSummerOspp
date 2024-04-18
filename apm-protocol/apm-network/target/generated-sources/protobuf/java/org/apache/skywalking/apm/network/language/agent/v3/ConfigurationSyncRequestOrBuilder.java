// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/ConfigurationDiscoveryService.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface ConfigurationSyncRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.ConfigurationSyncRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Current agent service name.
   * </pre>
   *
   * <code>string service = 1;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * Current agent service name.
   * </pre>
   *
   * <code>string service = 1;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * [Optional]
   * UUID is the unique id to represent the signature of the latest configuration.
   * The agent usually uses its bootstrap configuration running in default, and this id could be empty when doing the 1st round sync.
   * The agent could/is recommended to cache the UUID from the last command, and put it as the next round UUID parameter, 
   * then the OAP only returns the empty Commands if no configuration change happenned.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * [Optional]
   * UUID is the unique id to represent the signature of the latest configuration.
   * The agent usually uses its bootstrap configuration running in default, and this id could be empty when doing the 1st round sync.
   * The agent could/is recommended to cache the UUID from the last command, and put it as the next round UUID parameter, 
   * then the OAP only returns the empty Commands if no configuration change happenned.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();
}
