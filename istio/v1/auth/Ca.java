// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ca.proto

package istio.v1.auth;

public final class Ca {
  private Ca() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_v1_auth_IstioCertificateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_v1_auth_IstioCertificateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_v1_auth_IstioCertificateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_v1_auth_IstioCertificateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010ca.proto\022\ristio.v1.auth\032\034google/protob" +
      "uf/struct.proto\"l\n\027IstioCertificateReque" +
      "st\022\013\n\003csr\030\001 \001(\t\022\031\n\021validity_duration\030\003 \001" +
      "(\003\022)\n\010metadata\030\004 \001(\0132\027.google.protobuf.S" +
      "truct\".\n\030IstioCertificateResponse\022\022\n\ncer" +
      "t_chain\030\001 \003(\t2\201\001\n\027IstioCertificateServic" +
      "e\022f\n\021CreateCertificate\022&.istio.v1.auth.I" +
      "stioCertificateRequest\032\'.istio.v1.auth.I" +
      "stioCertificateResponse\"\000B%P\001Z\036istio.io/" +
      "api/security/v1alpha1\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_istio_v1_auth_IstioCertificateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_v1_auth_IstioCertificateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_v1_auth_IstioCertificateRequest_descriptor,
        new java.lang.String[] { "Csr", "ValidityDuration", "Metadata", });
    internal_static_istio_v1_auth_IstioCertificateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_istio_v1_auth_IstioCertificateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_v1_auth_IstioCertificateResponse_descriptor,
        new java.lang.String[] { "CertChain", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
