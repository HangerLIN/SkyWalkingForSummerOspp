package org.apache.skywalking.apm.network.language.agent.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *&#47;/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * ebpf agent(SkyWalking Rover) collects extra information from the OS(Linux Only) level to attach on the traced span.
 * Since v3.1
 * //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: language-agent/Tracing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpanAttachedEventReportServiceGrpc {

  private SpanAttachedEventReportServiceGrpc() {}

  public static final String SERVICE_NAME = "skywalking.v3.SpanAttachedEventReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "collect",
      requestType = org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent.class,
      responseType = org.apache.skywalking.apm.network.common.v3.Commands.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent,
      org.apache.skywalking.apm.network.common.v3.Commands> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent, org.apache.skywalking.apm.network.common.v3.Commands> getCollectMethod;
    if ((getCollectMethod = SpanAttachedEventReportServiceGrpc.getCollectMethod) == null) {
      synchronized (SpanAttachedEventReportServiceGrpc.class) {
        if ((getCollectMethod = SpanAttachedEventReportServiceGrpc.getCollectMethod) == null) {
          SpanAttachedEventReportServiceGrpc.getCollectMethod = getCollectMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent, org.apache.skywalking.apm.network.common.v3.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.v3.Commands.getDefaultInstance()))
              .setSchemaDescriptor(new SpanAttachedEventReportServiceMethodDescriptorSupplier("collect"))
              .build();
        }
      }
    }
    return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpanAttachedEventReportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanAttachedEventReportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanAttachedEventReportServiceStub>() {
        @java.lang.Override
        public SpanAttachedEventReportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanAttachedEventReportServiceStub(channel, callOptions);
        }
      };
    return SpanAttachedEventReportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpanAttachedEventReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanAttachedEventReportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanAttachedEventReportServiceBlockingStub>() {
        @java.lang.Override
        public SpanAttachedEventReportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanAttachedEventReportServiceBlockingStub(channel, callOptions);
        }
      };
    return SpanAttachedEventReportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpanAttachedEventReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpanAttachedEventReportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpanAttachedEventReportServiceFutureStub>() {
        @java.lang.Override
        public SpanAttachedEventReportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpanAttachedEventReportServiceFutureStub(channel, callOptions);
        }
      };
    return SpanAttachedEventReportServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * ebpf agent(SkyWalking Rover) collects extra information from the OS(Linux Only) level to attach on the traced span.
   * Since v3.1
   * //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static abstract class SpanAttachedEventReportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Collect SpanAttachedEvent to the OAP server in the streaming mode.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCollectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent,
                org.apache.skywalking.apm.network.common.v3.Commands>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * ebpf agent(SkyWalking Rover) collects extra information from the OS(Linux Only) level to attach on the traced span.
   * Since v3.1
   * //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class SpanAttachedEventReportServiceStub extends io.grpc.stub.AbstractAsyncStub<SpanAttachedEventReportServiceStub> {
    private SpanAttachedEventReportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanAttachedEventReportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanAttachedEventReportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Collect SpanAttachedEvent to the OAP server in the streaming mode.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.v3.SpanAttachedEvent> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * ebpf agent(SkyWalking Rover) collects extra information from the OS(Linux Only) level to attach on the traced span.
   * Since v3.1
   * //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class SpanAttachedEventReportServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SpanAttachedEventReportServiceBlockingStub> {
    private SpanAttachedEventReportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanAttachedEventReportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanAttachedEventReportServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *&#47;/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * ebpf agent(SkyWalking Rover) collects extra information from the OS(Linux Only) level to attach on the traced span.
   * Since v3.1
   * //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   * </pre>
   */
  public static final class SpanAttachedEventReportServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SpanAttachedEventReportServiceFutureStub> {
    private SpanAttachedEventReportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanAttachedEventReportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpanAttachedEventReportServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COLLECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpanAttachedEventReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpanAttachedEventReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.collect(
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.v3.Commands>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpanAttachedEventReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpanAttachedEventReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v3.Tracing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpanAttachedEventReportService");
    }
  }

  private static final class SpanAttachedEventReportServiceFileDescriptorSupplier
      extends SpanAttachedEventReportServiceBaseDescriptorSupplier {
    SpanAttachedEventReportServiceFileDescriptorSupplier() {}
  }

  private static final class SpanAttachedEventReportServiceMethodDescriptorSupplier
      extends SpanAttachedEventReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpanAttachedEventReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpanAttachedEventReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpanAttachedEventReportServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
