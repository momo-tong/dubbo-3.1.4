// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reflectionV1Alpha.proto

package io.grpc.reflection.v1alpha;

public interface FileDescriptorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.reflection.v1alpha.FileDescriptorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Serialized FileDescriptorProto messages. We avoid taking a dependency on
   * descriptor.proto, which uses proto2 only features, by making them opaque
   * bytes instead.
   * </pre>
   *
   * <code>repeated bytes file_descriptor_proto = 1;</code>
   * @return A list containing the fileDescriptorProto.
   */
  java.util.List<com.google.protobuf.ByteString> getFileDescriptorProtoList();
  /**
   * <pre>
   * Serialized FileDescriptorProto messages. We avoid taking a dependency on
   * descriptor.proto, which uses proto2 only features, by making them opaque
   * bytes instead.
   * </pre>
   *
   * <code>repeated bytes file_descriptor_proto = 1;</code>
   * @return The count of fileDescriptorProto.
   */
  int getFileDescriptorProtoCount();
  /**
   * <pre>
   * Serialized FileDescriptorProto messages. We avoid taking a dependency on
   * descriptor.proto, which uses proto2 only features, by making them opaque
   * bytes instead.
   * </pre>
   *
   * <code>repeated bytes file_descriptor_proto = 1;</code>
   * @param index The index of the element to return.
   * @return The fileDescriptorProto at the given index.
   */
  com.google.protobuf.ByteString getFileDescriptorProto(int index);
}