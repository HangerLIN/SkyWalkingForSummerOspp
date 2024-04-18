package io.opentelemetry.proto.metrics.firehose.v0_7.experimental;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * MetricConfig is a service that enables updating metric schedules, trace
 * parameters, and other configurations on the SDK without having to restart the
 * instrumented application. The collector can also serve as the configuration
 * service, acting as a bridge between third-party configuration services and
 * the SDK, piping updated configs from a third-party source to an instrumented
 * application.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: opentelemetry/proto/metrics/experimental/configservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetricConfigGrpc {

  private MetricConfigGrpc() {}

  public static final String SERVICE_NAME = "opentelemetry.proto.metrics.experimental.MetricConfig";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest,
      io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse> getGetMetricConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetricConfig",
      requestType = io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest.class,
      responseType = io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest,
      io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse> getGetMetricConfigMethod() {
    io.grpc.MethodDescriptor<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest, io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse> getGetMetricConfigMethod;
    if ((getGetMetricConfigMethod = MetricConfigGrpc.getGetMetricConfigMethod) == null) {
      synchronized (MetricConfigGrpc.class) {
        if ((getGetMetricConfigMethod = MetricConfigGrpc.getGetMetricConfigMethod) == null) {
          MetricConfigGrpc.getGetMetricConfigMethod = getGetMetricConfigMethod =
              io.grpc.MethodDescriptor.<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest, io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetricConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetricConfigMethodDescriptorSupplier("GetMetricConfig"))
              .build();
        }
      }
    }
    return getGetMetricConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetricConfigStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricConfigStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricConfigStub>() {
        @java.lang.Override
        public MetricConfigStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricConfigStub(channel, callOptions);
        }
      };
    return MetricConfigStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetricConfigBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricConfigBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricConfigBlockingStub>() {
        @java.lang.Override
        public MetricConfigBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricConfigBlockingStub(channel, callOptions);
        }
      };
    return MetricConfigBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetricConfigFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricConfigFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricConfigFutureStub>() {
        @java.lang.Override
        public MetricConfigFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricConfigFutureStub(channel, callOptions);
        }
      };
    return MetricConfigFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * MetricConfig is a service that enables updating metric schedules, trace
   * parameters, and other configurations on the SDK without having to restart the
   * instrumented application. The collector can also serve as the configuration
   * service, acting as a bridge between third-party configuration services and
   * the SDK, piping updated configs from a third-party source to an instrumented
   * application.
   * </pre>
   */
  public static abstract class MetricConfigImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMetricConfig(io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMetricConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest,
                io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse>(
                  this, METHODID_GET_METRIC_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * MetricConfig is a service that enables updating metric schedules, trace
   * parameters, and other configurations on the SDK without having to restart the
   * instrumented application. The collector can also serve as the configuration
   * service, acting as a bridge between third-party configuration services and
   * the SDK, piping updated configs from a third-party source to an instrumented
   * application.
   * </pre>
   */
  public static final class MetricConfigStub extends io.grpc.stub.AbstractAsyncStub<MetricConfigStub> {
    private MetricConfigStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricConfigStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricConfigStub(channel, callOptions);
    }

    /**
     */
    public void getMetricConfig(io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest request,
        io.grpc.stub.StreamObserver<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * MetricConfig is a service that enables updating metric schedules, trace
   * parameters, and other configurations on the SDK without having to restart the
   * instrumented application. The collector can also serve as the configuration
   * service, acting as a bridge between third-party configuration services and
   * the SDK, piping updated configs from a third-party source to an instrumented
   * application.
   * </pre>
   */
  public static final class MetricConfigBlockingStub extends io.grpc.stub.AbstractBlockingStub<MetricConfigBlockingStub> {
    private MetricConfigBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricConfigBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricConfigBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse getMetricConfig(io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * MetricConfig is a service that enables updating metric schedules, trace
   * parameters, and other configurations on the SDK without having to restart the
   * instrumented application. The collector can also serve as the configuration
   * service, acting as a bridge between third-party configuration services and
   * the SDK, piping updated configs from a third-party source to an instrumented
   * application.
   * </pre>
   */
  public static final class MetricConfigFutureStub extends io.grpc.stub.AbstractFutureStub<MetricConfigFutureStub> {
    private MetricConfigFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricConfigFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricConfigFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse> getMetricConfig(
        io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_METRIC_CONFIG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetricConfigImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetricConfigImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_METRIC_CONFIG:
          serviceImpl.getMetricConfig((io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigResponse>) responseObserver);
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

  private static abstract class MetricConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetricConfigBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.opentelemetry.proto.metrics.firehose.v0_7.experimental.MetricConfigServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetricConfig");
    }
  }

  private static final class MetricConfigFileDescriptorSupplier
      extends MetricConfigBaseDescriptorSupplier {
    MetricConfigFileDescriptorSupplier() {}
  }

  private static final class MetricConfigMethodDescriptorSupplier
      extends MetricConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetricConfigMethodDescriptorSupplier(String methodName) {
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
      synchronized (MetricConfigGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetricConfigFileDescriptorSupplier())
              .addMethod(getGetMetricConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
