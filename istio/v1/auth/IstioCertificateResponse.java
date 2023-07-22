// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ca.proto

package istio.v1.auth;

/**
 * <pre>
 * Certificate response message.
 * </pre>
 *
 * Protobuf type {@code istio.v1.auth.IstioCertificateResponse}
 */
public final class IstioCertificateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:istio.v1.auth.IstioCertificateResponse)
    IstioCertificateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IstioCertificateResponse.newBuilder() to construct.
  private IstioCertificateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IstioCertificateResponse() {
    certChain_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IstioCertificateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IstioCertificateResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              certChain_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            certChain_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        certChain_ = certChain_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return istio.v1.auth.Ca.internal_static_istio_v1_auth_IstioCertificateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return istio.v1.auth.Ca.internal_static_istio_v1_auth_IstioCertificateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            istio.v1.auth.IstioCertificateResponse.class, istio.v1.auth.IstioCertificateResponse.Builder.class);
  }

  public static final int CERT_CHAIN_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList certChain_;
  /**
   * <pre>
   * PEM-encoded certificate chain.
   * The leaf cert is the first element, and the root cert is the last element.
   * </pre>
   *
   * <code>repeated string cert_chain = 1;</code>
   * @return A list containing the certChain.
   */
  public com.google.protobuf.ProtocolStringList
      getCertChainList() {
    return certChain_;
  }
  /**
   * <pre>
   * PEM-encoded certificate chain.
   * The leaf cert is the first element, and the root cert is the last element.
   * </pre>
   *
   * <code>repeated string cert_chain = 1;</code>
   * @return The count of certChain.
   */
  public int getCertChainCount() {
    return certChain_.size();
  }
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
  public java.lang.String getCertChain(int index) {
    return certChain_.get(index);
  }
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
  public com.google.protobuf.ByteString
      getCertChainBytes(int index) {
    return certChain_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < certChain_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, certChain_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < certChain_.size(); i++) {
        dataSize += computeStringSizeNoTag(certChain_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCertChainList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof istio.v1.auth.IstioCertificateResponse)) {
      return super.equals(obj);
    }
    istio.v1.auth.IstioCertificateResponse other = (istio.v1.auth.IstioCertificateResponse) obj;

    if (!getCertChainList()
        .equals(other.getCertChainList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCertChainCount() > 0) {
      hash = (37 * hash) + CERT_CHAIN_FIELD_NUMBER;
      hash = (53 * hash) + getCertChainList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static istio.v1.auth.IstioCertificateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static istio.v1.auth.IstioCertificateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static istio.v1.auth.IstioCertificateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(istio.v1.auth.IstioCertificateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Certificate response message.
   * </pre>
   *
   * Protobuf type {@code istio.v1.auth.IstioCertificateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:istio.v1.auth.IstioCertificateResponse)
      istio.v1.auth.IstioCertificateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return istio.v1.auth.Ca.internal_static_istio_v1_auth_IstioCertificateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return istio.v1.auth.Ca.internal_static_istio_v1_auth_IstioCertificateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              istio.v1.auth.IstioCertificateResponse.class, istio.v1.auth.IstioCertificateResponse.Builder.class);
    }

    // Construct using istio.v1.auth.IstioCertificateResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      certChain_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return istio.v1.auth.Ca.internal_static_istio_v1_auth_IstioCertificateResponse_descriptor;
    }

    @java.lang.Override
    public istio.v1.auth.IstioCertificateResponse getDefaultInstanceForType() {
      return istio.v1.auth.IstioCertificateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public istio.v1.auth.IstioCertificateResponse build() {
      istio.v1.auth.IstioCertificateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public istio.v1.auth.IstioCertificateResponse buildPartial() {
      istio.v1.auth.IstioCertificateResponse result = new istio.v1.auth.IstioCertificateResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        certChain_ = certChain_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.certChain_ = certChain_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof istio.v1.auth.IstioCertificateResponse) {
        return mergeFrom((istio.v1.auth.IstioCertificateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(istio.v1.auth.IstioCertificateResponse other) {
      if (other == istio.v1.auth.IstioCertificateResponse.getDefaultInstance()) return this;
      if (!other.certChain_.isEmpty()) {
        if (certChain_.isEmpty()) {
          certChain_ = other.certChain_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCertChainIsMutable();
          certChain_.addAll(other.certChain_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      istio.v1.auth.IstioCertificateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (istio.v1.auth.IstioCertificateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList certChain_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCertChainIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        certChain_ = new com.google.protobuf.LazyStringArrayList(certChain_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * PEM-encoded certificate chain.
     * The leaf cert is the first element, and the root cert is the last element.
     * </pre>
     *
     * <code>repeated string cert_chain = 1;</code>
     * @return A list containing the certChain.
     */
    public com.google.protobuf.ProtocolStringList
        getCertChainList() {
      return certChain_.getUnmodifiableView();
    }
    /**
     * <pre>
     * PEM-encoded certificate chain.
     * The leaf cert is the first element, and the root cert is the last element.
     * </pre>
     *
     * <code>repeated string cert_chain = 1;</code>
     * @return The count of certChain.
     */
    public int getCertChainCount() {
      return certChain_.size();
    }
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
    public java.lang.String getCertChain(int index) {
      return certChain_.get(index);
    }
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
    public com.google.protobuf.ByteString
        getCertChainBytes(int index) {
      return certChain_.getByteString(index);
    }
    /**
     * <pre>
     * PEM-encoded certificate chain.
     * The leaf cert is the first element, and the root cert is the last element.
     * </pre>
     *
     * <code>repeated string cert_chain = 1;</code>
     * @param index The index to set the value at.
     * @param value The certChain to set.
     * @return This builder for chaining.
     */
    public Builder setCertChain(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCertChainIsMutable();
      certChain_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PEM-encoded certificate chain.
     * The leaf cert is the first element, and the root cert is the last element.
     * </pre>
     *
     * <code>repeated string cert_chain = 1;</code>
     * @param value The certChain to add.
     * @return This builder for chaining.
     */
    public Builder addCertChain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCertChainIsMutable();
      certChain_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PEM-encoded certificate chain.
     * The leaf cert is the first element, and the root cert is the last element.
     * </pre>
     *
     * <code>repeated string cert_chain = 1;</code>
     * @param values The certChain to add.
     * @return This builder for chaining.
     */
    public Builder addAllCertChain(
        java.lang.Iterable<java.lang.String> values) {
      ensureCertChainIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, certChain_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PEM-encoded certificate chain.
     * The leaf cert is the first element, and the root cert is the last element.
     * </pre>
     *
     * <code>repeated string cert_chain = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCertChain() {
      certChain_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PEM-encoded certificate chain.
     * The leaf cert is the first element, and the root cert is the last element.
     * </pre>
     *
     * <code>repeated string cert_chain = 1;</code>
     * @param value The bytes of the certChain to add.
     * @return This builder for chaining.
     */
    public Builder addCertChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCertChainIsMutable();
      certChain_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:istio.v1.auth.IstioCertificateResponse)
  }

  // @@protoc_insertion_point(class_scope:istio.v1.auth.IstioCertificateResponse)
  private static final istio.v1.auth.IstioCertificateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new istio.v1.auth.IstioCertificateResponse();
  }

  public static istio.v1.auth.IstioCertificateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IstioCertificateResponse>
      PARSER = new com.google.protobuf.AbstractParser<IstioCertificateResponse>() {
    @java.lang.Override
    public IstioCertificateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IstioCertificateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IstioCertificateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IstioCertificateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public istio.v1.auth.IstioCertificateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

