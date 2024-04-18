// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Process.proto

package org.apache.skywalking.apm.network.ebpf.profiling.process.v3;

public interface EBPFProcessPingPkgListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.EBPFProcessPingPkgList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .skywalking.v3.EBPFProcessPingPkg processes = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkg> 
      getProcessesList();
  /**
   * <code>repeated .skywalking.v3.EBPFProcessPingPkg processes = 1;</code>
   */
  org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkg getProcesses(int index);
  /**
   * <code>repeated .skywalking.v3.EBPFProcessPingPkg processes = 1;</code>
   */
  int getProcessesCount();
  /**
   * <code>repeated .skywalking.v3.EBPFProcessPingPkg processes = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgOrBuilder> 
      getProcessesOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.EBPFProcessPingPkg processes = 1;</code>
   */
  org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessPingPkgOrBuilder getProcessesOrBuilder(
      int index);

  /**
   * <pre>
   * An ID generated by eBPF agent, should be unique globally.
   * </pre>
   *
   * <code>string ebpfAgentID = 2;</code>
   * @return The ebpfAgentID.
   */
  java.lang.String getEbpfAgentID();
  /**
   * <pre>
   * An ID generated by eBPF agent, should be unique globally.
   * </pre>
   *
   * <code>string ebpfAgentID = 2;</code>
   * @return The bytes for ebpfAgentID.
   */
  com.google.protobuf.ByteString
      getEbpfAgentIDBytes();
}
