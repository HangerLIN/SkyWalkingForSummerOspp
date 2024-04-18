package org.apache.skywalking.oap.server.ai.pipeline.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: ai_http_uri_recognition.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HttpUriRecognitionServiceGrpc {

  private HttpUriRecognitionServiceGrpc() {}

  public static final String SERVICE_NAME = "HttpUriRecognitionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest,
      org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse> getFetchAllPatternsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetchAllPatterns",
      requestType = org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest.class,
      responseType = org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest,
      org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse> getFetchAllPatternsMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest, org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse> getFetchAllPatternsMethod;
    if ((getFetchAllPatternsMethod = HttpUriRecognitionServiceGrpc.getFetchAllPatternsMethod) == null) {
      synchronized (HttpUriRecognitionServiceGrpc.class) {
        if ((getFetchAllPatternsMethod = HttpUriRecognitionServiceGrpc.getFetchAllPatternsMethod) == null) {
          HttpUriRecognitionServiceGrpc.getFetchAllPatternsMethod = getFetchAllPatternsMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest, org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetchAllPatterns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HttpUriRecognitionServiceMethodDescriptorSupplier("fetchAllPatterns"))
              .build();
        }
      }
    }
    return getFetchAllPatternsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest,
      com.google.protobuf.Empty> getFeedRawDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedRawData",
      requestType = org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest,
      com.google.protobuf.Empty> getFeedRawDataMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest, com.google.protobuf.Empty> getFeedRawDataMethod;
    if ((getFeedRawDataMethod = HttpUriRecognitionServiceGrpc.getFeedRawDataMethod) == null) {
      synchronized (HttpUriRecognitionServiceGrpc.class) {
        if ((getFeedRawDataMethod = HttpUriRecognitionServiceGrpc.getFeedRawDataMethod) == null) {
          HttpUriRecognitionServiceGrpc.getFeedRawDataMethod = getFeedRawDataMethod =
              io.grpc.MethodDescriptor.<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "feedRawData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new HttpUriRecognitionServiceMethodDescriptorSupplier("feedRawData"))
              .build();
        }
      }
    }
    return getFeedRawDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HttpUriRecognitionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpUriRecognitionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpUriRecognitionServiceStub>() {
        @java.lang.Override
        public HttpUriRecognitionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpUriRecognitionServiceStub(channel, callOptions);
        }
      };
    return HttpUriRecognitionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HttpUriRecognitionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpUriRecognitionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpUriRecognitionServiceBlockingStub>() {
        @java.lang.Override
        public HttpUriRecognitionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpUriRecognitionServiceBlockingStub(channel, callOptions);
        }
      };
    return HttpUriRecognitionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HttpUriRecognitionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpUriRecognitionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpUriRecognitionServiceFutureStub>() {
        @java.lang.Override
        public HttpUriRecognitionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpUriRecognitionServiceFutureStub(channel, callOptions);
        }
      };
    return HttpUriRecognitionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HttpUriRecognitionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sync for the pattern recognition dictionary.
     * </pre>
     */
    public void fetchAllPatterns(org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchAllPatternsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Feed new raw data and matched patterns to the AI-server.
     * </pre>
     */
    public void feedRawData(org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedRawDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFetchAllPatternsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest,
                org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse>(
                  this, METHODID_FETCH_ALL_PATTERNS)))
          .addMethod(
            getFeedRawDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_FEED_RAW_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class HttpUriRecognitionServiceStub extends io.grpc.stub.AbstractAsyncStub<HttpUriRecognitionServiceStub> {
    private HttpUriRecognitionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpUriRecognitionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpUriRecognitionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync for the pattern recognition dictionary.
     * </pre>
     */
    public void fetchAllPatterns(org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchAllPatternsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Feed new raw data and matched patterns to the AI-server.
     * </pre>
     */
    public void feedRawData(org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedRawDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HttpUriRecognitionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HttpUriRecognitionServiceBlockingStub> {
    private HttpUriRecognitionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpUriRecognitionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpUriRecognitionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync for the pattern recognition dictionary.
     * </pre>
     */
    public org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse fetchAllPatterns(org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchAllPatternsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Feed new raw data and matched patterns to the AI-server.
     * </pre>
     */
    public com.google.protobuf.Empty feedRawData(org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedRawDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HttpUriRecognitionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HttpUriRecognitionServiceFutureStub> {
    private HttpUriRecognitionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpUriRecognitionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpUriRecognitionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync for the pattern recognition dictionary.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse> fetchAllPatterns(
        org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchAllPatternsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Feed new raw data and matched patterns to the AI-server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> feedRawData(
        org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedRawDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_ALL_PATTERNS = 0;
  private static final int METHODID_FEED_RAW_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HttpUriRecognitionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HttpUriRecognitionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_ALL_PATTERNS:
          serviceImpl.fetchAllPatterns((org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionSyncRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionResponse>) responseObserver);
          break;
        case METHODID_FEED_RAW_DATA:
          serviceImpl.feedRawData((org.apache.skywalking.oap.server.ai.pipeline.grpc.HttpUriRecognitionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class HttpUriRecognitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HttpUriRecognitionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.oap.server.ai.pipeline.grpc.AiHttpUriRecognition.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HttpUriRecognitionService");
    }
  }

  private static final class HttpUriRecognitionServiceFileDescriptorSupplier
      extends HttpUriRecognitionServiceBaseDescriptorSupplier {
    HttpUriRecognitionServiceFileDescriptorSupplier() {}
  }

  private static final class HttpUriRecognitionServiceMethodDescriptorSupplier
      extends HttpUriRecognitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HttpUriRecognitionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HttpUriRecognitionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HttpUriRecognitionServiceFileDescriptorSupplier())
              .addMethod(getFetchAllPatternsMethod())
              .addMethod(getFeedRawDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
