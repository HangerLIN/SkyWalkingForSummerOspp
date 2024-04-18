package org.apache.skywalking.apm.network.ebpf.profiling.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: ebpf/profiling/Continuous.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContinuousProfilingServiceGrpc {

  private ContinuousProfilingServiceGrpc() {}

  public static final String SERVICE_NAME = "skywalking.v3.ContinuousProfilingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery,
      org.apache.skywalking.apm.network.common.v3.Commands> getQueryPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryPolicies",
      requestType = org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery,
      org.apache.skywalking.apm.network.common.v3.Commands> getQueryPoliciesMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery, org.apache.skywalking.apm.network.common.v3.Commands> getQueryPoliciesMethod;
    if ((getQueryPoliciesMethod = ContinuousProfilingServiceGrpc.getQueryPoliciesMethod) == null) {
      synchronized (ContinuousProfilingServiceGrpc.class) {
        if ((getQueryPoliciesMethod = ContinuousProfilingServiceGrpc.getQueryPoliciesMethod) == null) {
          ContinuousProfilingServiceGrpc.getQueryPoliciesMethod = getQueryPoliciesMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new ContinuousProfilingServiceMethodDescriptorSupplier("queryPolicies"))
              .build();
        }
      }
    }
    return getQueryPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport,
      org.apache.skywalking.apm.network.common.v3.Commands> getReportProfilingTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reportProfilingTask",
      requestType = org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport,
      org.apache.skywalking.apm.network.common.v3.Commands> getReportProfilingTaskMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport, org.apache.skywalking.apm.network.common.v3.Commands> getReportProfilingTaskMethod;
    if ((getReportProfilingTaskMethod = ContinuousProfilingServiceGrpc.getReportProfilingTaskMethod) == null) {
      synchronized (ContinuousProfilingServiceGrpc.class) {
        if ((getReportProfilingTaskMethod = ContinuousProfilingServiceGrpc.getReportProfilingTaskMethod) == null) {
          ContinuousProfilingServiceGrpc.getReportProfilingTaskMethod = getReportProfilingTaskMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reportProfilingTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new ContinuousProfilingServiceMethodDescriptorSupplier("reportProfilingTask"))
              .build();
        }
      }
    }
    return getReportProfilingTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContinuousProfilingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContinuousProfilingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContinuousProfilingServiceStub>() {
        @java.lang.Override
        public ContinuousProfilingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContinuousProfilingServiceStub(channel, callOptions);
        }
      };
    return ContinuousProfilingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContinuousProfilingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContinuousProfilingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContinuousProfilingServiceBlockingStub>() {
        @java.lang.Override
        public ContinuousProfilingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContinuousProfilingServiceBlockingStub(channel, callOptions);
        }
      };
    return ContinuousProfilingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContinuousProfilingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContinuousProfilingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContinuousProfilingServiceFutureStub>() {
        @java.lang.Override
        public ContinuousProfilingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContinuousProfilingServiceFutureStub(channel, callOptions);
        }
      };
    return ContinuousProfilingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ContinuousProfilingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Query continuous profiling policy
     * </pre>
     */
    public void queryPolicies(org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Report the profiling task when the policy threshold is reached
     * Use the returned task ID to perform the profiling task through EBPFProfilingService#collectProfilingData.
     * </pre>
     */
    public void reportProfilingTask(org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportProfilingTaskMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_QUERY_POLICIES)))
          .addMethod(
            getReportProfilingTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_REPORT_PROFILING_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class ContinuousProfilingServiceStub extends io.grpc.stub.AbstractAsyncStub<ContinuousProfilingServiceStub> {
    private ContinuousProfilingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContinuousProfilingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContinuousProfilingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query continuous profiling policy
     * </pre>
     */
    public void queryPolicies(org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Report the profiling task when the policy threshold is reached
     * Use the returned task ID to perform the profiling task through EBPFProfilingService#collectProfilingData.
     * </pre>
     */
    public void reportProfilingTask(org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportProfilingTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContinuousProfilingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ContinuousProfilingServiceBlockingStub> {
    private ContinuousProfilingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContinuousProfilingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContinuousProfilingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query continuous profiling policy
     * </pre>
     */
    public org.apache.skywalking.apm.network.common.v3.Commands queryPolicies(org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Report the profiling task when the policy threshold is reached
     * Use the returned task ID to perform the profiling task through EBPFProfilingService#collectProfilingData.
     * </pre>
     */
    public org.apache.skywalking.apm.network.common.v3.Commands reportProfilingTask(org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportProfilingTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContinuousProfilingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ContinuousProfilingServiceFutureStub> {
    private ContinuousProfilingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContinuousProfilingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContinuousProfilingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query continuous profiling policy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.v3.Commands> queryPolicies(
        org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Report the profiling task when the policy threshold is reached
     * Use the returned task ID to perform the profiling task through EBPFProfilingService#collectProfilingData.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.v3.Commands> reportProfilingTask(
        org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportProfilingTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_POLICIES = 0;
  private static final int METHODID_REPORT_PROFILING_TASK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContinuousProfilingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContinuousProfilingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_POLICIES:
          serviceImpl.queryPolicies((org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingPolicyQuery) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands>) responseObserver);
          break;
        case METHODID_REPORT_PROFILING_TASK:
          serviceImpl.reportProfilingTask((org.apache.skywalking.apm.network.ebpf.profiling.v3.ContinuousProfilingReport) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ContinuousProfilingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContinuousProfilingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.ebpf.profiling.v3.Continuous.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContinuousProfilingService");
    }
  }

  private static final class ContinuousProfilingServiceFileDescriptorSupplier
      extends ContinuousProfilingServiceBaseDescriptorSupplier {
    ContinuousProfilingServiceFileDescriptorSupplier() {}
  }

  private static final class ContinuousProfilingServiceMethodDescriptorSupplier
      extends ContinuousProfilingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContinuousProfilingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ContinuousProfilingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContinuousProfilingServiceFileDescriptorSupplier())
              .addMethod(getQueryPoliciesMethod())
              .addMethod(getReportProfilingTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
