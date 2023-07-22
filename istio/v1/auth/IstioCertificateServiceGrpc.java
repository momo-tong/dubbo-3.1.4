package istio.v1.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service for managing certificates issued by the CA.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: ca.proto")
public final class IstioCertificateServiceGrpc {

  private IstioCertificateServiceGrpc() {}

  public static final String SERVICE_NAME = "istio.v1.auth.IstioCertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<istio.v1.auth.IstioCertificateRequest,
      istio.v1.auth.IstioCertificateResponse> getCreateCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCertificate",
      requestType = istio.v1.auth.IstioCertificateRequest.class,
      responseType = istio.v1.auth.IstioCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<istio.v1.auth.IstioCertificateRequest,
      istio.v1.auth.IstioCertificateResponse> getCreateCertificateMethod() {
    io.grpc.MethodDescriptor<istio.v1.auth.IstioCertificateRequest, istio.v1.auth.IstioCertificateResponse> getCreateCertificateMethod;
    if ((getCreateCertificateMethod = IstioCertificateServiceGrpc.getCreateCertificateMethod) == null) {
      synchronized (IstioCertificateServiceGrpc.class) {
        if ((getCreateCertificateMethod = IstioCertificateServiceGrpc.getCreateCertificateMethod) == null) {
          IstioCertificateServiceGrpc.getCreateCertificateMethod = getCreateCertificateMethod =
              io.grpc.MethodDescriptor.<istio.v1.auth.IstioCertificateRequest, istio.v1.auth.IstioCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  istio.v1.auth.IstioCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  istio.v1.auth.IstioCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IstioCertificateServiceMethodDescriptorSupplier("CreateCertificate"))
              .build();
        }
      }
    }
    return getCreateCertificateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IstioCertificateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IstioCertificateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IstioCertificateServiceStub>() {
        @java.lang.Override
        public IstioCertificateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IstioCertificateServiceStub(channel, callOptions);
        }
      };
    return IstioCertificateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IstioCertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IstioCertificateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IstioCertificateServiceBlockingStub>() {
        @java.lang.Override
        public IstioCertificateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IstioCertificateServiceBlockingStub(channel, callOptions);
        }
      };
    return IstioCertificateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IstioCertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IstioCertificateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IstioCertificateServiceFutureStub>() {
        @java.lang.Override
        public IstioCertificateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IstioCertificateServiceFutureStub(channel, callOptions);
        }
      };
    return IstioCertificateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for managing certificates issued by the CA.
   * </pre>
   */
  public static abstract class IstioCertificateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Using provided CSR, returns a signed certificate.
     * </pre>
     */
    public void createCertificate(istio.v1.auth.IstioCertificateRequest request,
        io.grpc.stub.StreamObserver<istio.v1.auth.IstioCertificateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCertificateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCertificateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                istio.v1.auth.IstioCertificateRequest,
                istio.v1.auth.IstioCertificateResponse>(
                  this, METHODID_CREATE_CERTIFICATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for managing certificates issued by the CA.
   * </pre>
   */
  public static final class IstioCertificateServiceStub extends io.grpc.stub.AbstractAsyncStub<IstioCertificateServiceStub> {
    private IstioCertificateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstioCertificateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IstioCertificateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Using provided CSR, returns a signed certificate.
     * </pre>
     */
    public void createCertificate(istio.v1.auth.IstioCertificateRequest request,
        io.grpc.stub.StreamObserver<istio.v1.auth.IstioCertificateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCertificateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for managing certificates issued by the CA.
   * </pre>
   */
  public static final class IstioCertificateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IstioCertificateServiceBlockingStub> {
    private IstioCertificateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstioCertificateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IstioCertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Using provided CSR, returns a signed certificate.
     * </pre>
     */
    public istio.v1.auth.IstioCertificateResponse createCertificate(istio.v1.auth.IstioCertificateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCertificateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for managing certificates issued by the CA.
   * </pre>
   */
  public static final class IstioCertificateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IstioCertificateServiceFutureStub> {
    private IstioCertificateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstioCertificateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IstioCertificateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Using provided CSR, returns a signed certificate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<istio.v1.auth.IstioCertificateResponse> createCertificate(
        istio.v1.auth.IstioCertificateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCertificateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CERTIFICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IstioCertificateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IstioCertificateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CERTIFICATE:
          serviceImpl.createCertificate((istio.v1.auth.IstioCertificateRequest) request,
              (io.grpc.stub.StreamObserver<istio.v1.auth.IstioCertificateResponse>) responseObserver);
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

  private static abstract class IstioCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IstioCertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return istio.v1.auth.Ca.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IstioCertificateService");
    }
  }

  private static final class IstioCertificateServiceFileDescriptorSupplier
      extends IstioCertificateServiceBaseDescriptorSupplier {
    IstioCertificateServiceFileDescriptorSupplier() {}
  }

  private static final class IstioCertificateServiceMethodDescriptorSupplier
      extends IstioCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IstioCertificateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IstioCertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IstioCertificateServiceFileDescriptorSupplier())
              .addMethod(getCreateCertificateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
