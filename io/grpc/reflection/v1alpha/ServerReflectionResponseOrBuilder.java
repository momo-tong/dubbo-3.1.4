// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reflectionV1Alpha.proto

package io.grpc.reflection.v1alpha;

public interface ServerReflectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.reflection.v1alpha.ServerReflectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string valid_host = 1;</code>
   * @return The validHost.
   */
  java.lang.String getValidHost();
  /**
   * <code>string valid_host = 1;</code>
   * @return The bytes for validHost.
   */
  com.google.protobuf.ByteString
      getValidHostBytes();

  /**
   * <code>.grpc.reflection.v1alpha.ServerReflectionRequest original_request = 2;</code>
   * @return Whether the originalRequest field is set.
   */
  boolean hasOriginalRequest();
  /**
   * <code>.grpc.reflection.v1alpha.ServerReflectionRequest original_request = 2;</code>
   * @return The originalRequest.
   */
  io.grpc.reflection.v1alpha.ServerReflectionRequest getOriginalRequest();
  /**
   * <code>.grpc.reflection.v1alpha.ServerReflectionRequest original_request = 2;</code>
   */
  io.grpc.reflection.v1alpha.ServerReflectionRequestOrBuilder getOriginalRequestOrBuilder();

  /**
   * <pre>
   * This message is used to answer file_by_filename, file_containing_symbol,
   * file_containing_extension requests with transitive dependencies. As
   * the repeated label is not allowed in oneof fields, we use a
   * FileDescriptorResponse message to encapsulate the repeated fields.
   * The reflection service is allowed to avoid sending FileDescriptorProtos
   * that were previously sent in response to earlier requests in the stream.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.FileDescriptorResponse file_descriptor_response = 4;</code>
   * @return Whether the fileDescriptorResponse field is set.
   */
  boolean hasFileDescriptorResponse();
  /**
   * <pre>
   * This message is used to answer file_by_filename, file_containing_symbol,
   * file_containing_extension requests with transitive dependencies. As
   * the repeated label is not allowed in oneof fields, we use a
   * FileDescriptorResponse message to encapsulate the repeated fields.
   * The reflection service is allowed to avoid sending FileDescriptorProtos
   * that were previously sent in response to earlier requests in the stream.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.FileDescriptorResponse file_descriptor_response = 4;</code>
   * @return The fileDescriptorResponse.
   */
  io.grpc.reflection.v1alpha.FileDescriptorResponse getFileDescriptorResponse();
  /**
   * <pre>
   * This message is used to answer file_by_filename, file_containing_symbol,
   * file_containing_extension requests with transitive dependencies. As
   * the repeated label is not allowed in oneof fields, we use a
   * FileDescriptorResponse message to encapsulate the repeated fields.
   * The reflection service is allowed to avoid sending FileDescriptorProtos
   * that were previously sent in response to earlier requests in the stream.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.FileDescriptorResponse file_descriptor_response = 4;</code>
   */
  io.grpc.reflection.v1alpha.FileDescriptorResponseOrBuilder getFileDescriptorResponseOrBuilder();

  /**
   * <pre>
   * This message is used to answer all_extension_numbers_of_type requst.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ExtensionNumberResponse all_extension_numbers_response = 5;</code>
   * @return Whether the allExtensionNumbersResponse field is set.
   */
  boolean hasAllExtensionNumbersResponse();
  /**
   * <pre>
   * This message is used to answer all_extension_numbers_of_type requst.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ExtensionNumberResponse all_extension_numbers_response = 5;</code>
   * @return The allExtensionNumbersResponse.
   */
  io.grpc.reflection.v1alpha.ExtensionNumberResponse getAllExtensionNumbersResponse();
  /**
   * <pre>
   * This message is used to answer all_extension_numbers_of_type requst.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ExtensionNumberResponse all_extension_numbers_response = 5;</code>
   */
  io.grpc.reflection.v1alpha.ExtensionNumberResponseOrBuilder getAllExtensionNumbersResponseOrBuilder();

  /**
   * <pre>
   * This message is used to answer list_services request.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ListServiceResponse list_services_response = 6;</code>
   * @return Whether the listServicesResponse field is set.
   */
  boolean hasListServicesResponse();
  /**
   * <pre>
   * This message is used to answer list_services request.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ListServiceResponse list_services_response = 6;</code>
   * @return The listServicesResponse.
   */
  io.grpc.reflection.v1alpha.ListServiceResponse getListServicesResponse();
  /**
   * <pre>
   * This message is used to answer list_services request.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ListServiceResponse list_services_response = 6;</code>
   */
  io.grpc.reflection.v1alpha.ListServiceResponseOrBuilder getListServicesResponseOrBuilder();

  /**
   * <pre>
   * This message is used when an error occurs.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ErrorResponse error_response = 7;</code>
   * @return Whether the errorResponse field is set.
   */
  boolean hasErrorResponse();
  /**
   * <pre>
   * This message is used when an error occurs.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ErrorResponse error_response = 7;</code>
   * @return The errorResponse.
   */
  io.grpc.reflection.v1alpha.ErrorResponse getErrorResponse();
  /**
   * <pre>
   * This message is used when an error occurs.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ErrorResponse error_response = 7;</code>
   */
  io.grpc.reflection.v1alpha.ErrorResponseOrBuilder getErrorResponseOrBuilder();

  public io.grpc.reflection.v1alpha.ServerReflectionResponse.MessageResponseCase getMessageResponseCase();
}
