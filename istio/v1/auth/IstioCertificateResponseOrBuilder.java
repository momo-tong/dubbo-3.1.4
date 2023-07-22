// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ca.proto

package istio.v1.auth;

public interface IstioCertificateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.v1.auth.IstioCertificateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * PEM-encoded certificate chain.
   * The leaf cert is the first element, and the root cert is the last element.
   * </pre>
   *
   * <code>repeated string cert_chain = 1;</code>
   * @return A list containing the certChain.
   */
  java.util.List<java.lang.String>
      getCertChainList();
  /**
   * <pre>
   * PEM-encoded certificate chain.
   * The leaf cert is the first element, and the root cert is the last element.
   * </pre>
   *
   * <code>repeated string cert_chain = 1;</code>
   * @return The count of certChain.
   */
  int getCertChainCount();
  /**
   * <pre>
   * PEM-encoded certificate chain.
   * The leaf cert is the first element, and the root cert is the last element.
   * </pre>
   *
   * <code>repeated string cert_chain = 1;</code>
   * @param index The index of the element to return.
   * @return The certChain at the given index.
   */
  java.lang.String getCertChain(int index);
  /**
   * <pre>
   * PEM-encoded certificate chain.
   * The leaf cert is the first element, and the root cert is the last element.
   * </pre>
   *
   * <code>repeated string cert_chain = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the certChain at the given index.
   */
  com.google.protobuf.ByteString
      getCertChainBytes(int index);
}