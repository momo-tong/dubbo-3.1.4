// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ca.proto

package istio.v1.auth;

/**
 * <pre>
 * Service for managing certificates issued by the CA.
 * </pre>
 *
 * Protobuf service {@code istio.v1.auth.IstioCertificateService}
 */
public  abstract class IstioCertificateService
    implements com.google.protobuf.Service {
  protected IstioCertificateService() {}

  public interface Interface {
    /**
     * <pre>
     * Using provided CSR, returns a signed certificate.
     * </pre>
     *
     * <code>rpc CreateCertificate(.istio.v1.auth.IstioCertificateRequest) returns (.istio.v1.auth.IstioCertificateResponse);</code>
     */
    public abstract void createCertificate(
        com.google.protobuf.RpcController controller,
        istio.v1.auth.IstioCertificateRequest request,
        com.google.protobuf.RpcCallback<istio.v1.auth.IstioCertificateResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new IstioCertificateService() {
      @java.lang.Override
      public  void createCertificate(
          com.google.protobuf.RpcController controller,
          istio.v1.auth.IstioCertificateRequest request,
          com.google.protobuf.RpcCallback<istio.v1.auth.IstioCertificateResponse> done) {
        impl.createCertificate(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.createCertificate(controller, (istio.v1.auth.IstioCertificateRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return istio.v1.auth.IstioCertificateRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return istio.v1.auth.IstioCertificateResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   * Using provided CSR, returns a signed certificate.
   * </pre>
   *
   * <code>rpc CreateCertificate(.istio.v1.auth.IstioCertificateRequest) returns (.istio.v1.auth.IstioCertificateResponse);</code>
   */
  public abstract void createCertificate(
      com.google.protobuf.RpcController controller,
      istio.v1.auth.IstioCertificateRequest request,
      com.google.protobuf.RpcCallback<istio.v1.auth.IstioCertificateResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return istio.v1.auth.Ca.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.createCertificate(controller, (istio.v1.auth.IstioCertificateRequest)request,
          com.google.protobuf.RpcUtil.<istio.v1.auth.IstioCertificateResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return istio.v1.auth.IstioCertificateRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return istio.v1.auth.IstioCertificateResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends istio.v1.auth.IstioCertificateService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void createCertificate(
        com.google.protobuf.RpcController controller,
        istio.v1.auth.IstioCertificateRequest request,
        com.google.protobuf.RpcCallback<istio.v1.auth.IstioCertificateResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        istio.v1.auth.IstioCertificateResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          istio.v1.auth.IstioCertificateResponse.class,
          istio.v1.auth.IstioCertificateResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public istio.v1.auth.IstioCertificateResponse createCertificate(
        com.google.protobuf.RpcController controller,
        istio.v1.auth.IstioCertificateRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public istio.v1.auth.IstioCertificateResponse createCertificate(
        com.google.protobuf.RpcController controller,
        istio.v1.auth.IstioCertificateRequest request)
        throws com.google.protobuf.ServiceException {
      return (istio.v1.auth.IstioCertificateResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        istio.v1.auth.IstioCertificateResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:istio.v1.auth.IstioCertificateService)
}

