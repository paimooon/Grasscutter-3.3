// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtHittingOtherInfo.proto

package org.sorapointa.proto;

public final class EvtHittingOtherInfoOuterClass {
  private EvtHittingOtherInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtHittingOtherInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtHittingOtherInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 peer_id = 2;</code>
     * @return The peerId.
     */
    int getPeerId();

    /**
     * <code>.AttackResult attack_result = 7;</code>
     * @return Whether the attackResult field is set.
     */
    boolean hasAttackResult();
    /**
     * <code>.AttackResult attack_result = 7;</code>
     * @return The attackResult.
     */
    org.sorapointa.proto.AttackResultOuterClass.AttackResult getAttackResult();
    /**
     * <code>.AttackResult attack_result = 7;</code>
     */
    org.sorapointa.proto.AttackResultOuterClass.AttackResultOrBuilder getAttackResultOrBuilder();
  }
  /**
   * Protobuf type {@code EvtHittingOtherInfo}
   */
  public static final class EvtHittingOtherInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtHittingOtherInfo)
      EvtHittingOtherInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtHittingOtherInfo.newBuilder() to construct.
    private EvtHittingOtherInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtHittingOtherInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtHittingOtherInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtHittingOtherInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              peerId_ = input.readUInt32();
              break;
            }
            case 58: {
              org.sorapointa.proto.AttackResultOuterClass.AttackResult.Builder subBuilder = null;
              if (attackResult_ != null) {
                subBuilder = attackResult_.toBuilder();
              }
              attackResult_ = input.readMessage(org.sorapointa.proto.AttackResultOuterClass.AttackResult.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(attackResult_);
                attackResult_ = subBuilder.buildPartial();
              }

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sorapointa.proto.EvtHittingOtherInfoOuterClass.internal_static_EvtHittingOtherInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.EvtHittingOtherInfoOuterClass.internal_static_EvtHittingOtherInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo.class, org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo.Builder.class);
    }

    public static final int PEER_ID_FIELD_NUMBER = 2;
    private int peerId_;
    /**
     * <code>uint32 peer_id = 2;</code>
     * @return The peerId.
     */
    @java.lang.Override
    public int getPeerId() {
      return peerId_;
    }

    public static final int ATTACK_RESULT_FIELD_NUMBER = 7;
    private org.sorapointa.proto.AttackResultOuterClass.AttackResult attackResult_;
    /**
     * <code>.AttackResult attack_result = 7;</code>
     * @return Whether the attackResult field is set.
     */
    @java.lang.Override
    public boolean hasAttackResult() {
      return attackResult_ != null;
    }
    /**
     * <code>.AttackResult attack_result = 7;</code>
     * @return The attackResult.
     */
    @java.lang.Override
    public org.sorapointa.proto.AttackResultOuterClass.AttackResult getAttackResult() {
      return attackResult_ == null ? org.sorapointa.proto.AttackResultOuterClass.AttackResult.getDefaultInstance() : attackResult_;
    }
    /**
     * <code>.AttackResult attack_result = 7;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.AttackResultOuterClass.AttackResultOrBuilder getAttackResultOrBuilder() {
      return getAttackResult();
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
      if (peerId_ != 0) {
        output.writeUInt32(2, peerId_);
      }
      if (attackResult_ != null) {
        output.writeMessage(7, getAttackResult());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (peerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, peerId_);
      }
      if (attackResult_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getAttackResult());
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
      if (!(obj instanceof org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo other = (org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo) obj;

      if (getPeerId()
          != other.getPeerId()) return false;
      if (hasAttackResult() != other.hasAttackResult()) return false;
      if (hasAttackResult()) {
        if (!getAttackResult()
            .equals(other.getAttackResult())) return false;
      }
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
      hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPeerId();
      if (hasAttackResult()) {
        hash = (37 * hash) + ATTACK_RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getAttackResult().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo prototype) {
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
     * Protobuf type {@code EvtHittingOtherInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtHittingOtherInfo)
        org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.EvtHittingOtherInfoOuterClass.internal_static_EvtHittingOtherInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.EvtHittingOtherInfoOuterClass.internal_static_EvtHittingOtherInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo.class, org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo.Builder.class);
      }

      // Construct using org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo.newBuilder()
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
        peerId_ = 0;

        if (attackResultBuilder_ == null) {
          attackResult_ = null;
        } else {
          attackResult_ = null;
          attackResultBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.EvtHittingOtherInfoOuterClass.internal_static_EvtHittingOtherInfo_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo getDefaultInstanceForType() {
        return org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo build() {
        org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo buildPartial() {
        org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo result = new org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo(this);
        result.peerId_ = peerId_;
        if (attackResultBuilder_ == null) {
          result.attackResult_ = attackResult_;
        } else {
          result.attackResult_ = attackResultBuilder_.build();
        }
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
        if (other instanceof org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo) {
          return mergeFrom((org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo other) {
        if (other == org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo.getDefaultInstance()) return this;
        if (other.getPeerId() != 0) {
          setPeerId(other.getPeerId());
        }
        if (other.hasAttackResult()) {
          mergeAttackResult(other.getAttackResult());
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
        org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int peerId_ ;
      /**
       * <code>uint32 peer_id = 2;</code>
       * @return The peerId.
       */
      @java.lang.Override
      public int getPeerId() {
        return peerId_;
      }
      /**
       * <code>uint32 peer_id = 2;</code>
       * @param value The peerId to set.
       * @return This builder for chaining.
       */
      public Builder setPeerId(int value) {
        
        peerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 peer_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeerId() {
        
        peerId_ = 0;
        onChanged();
        return this;
      }

      private org.sorapointa.proto.AttackResultOuterClass.AttackResult attackResult_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.AttackResultOuterClass.AttackResult, org.sorapointa.proto.AttackResultOuterClass.AttackResult.Builder, org.sorapointa.proto.AttackResultOuterClass.AttackResultOrBuilder> attackResultBuilder_;
      /**
       * <code>.AttackResult attack_result = 7;</code>
       * @return Whether the attackResult field is set.
       */
      public boolean hasAttackResult() {
        return attackResultBuilder_ != null || attackResult_ != null;
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       * @return The attackResult.
       */
      public org.sorapointa.proto.AttackResultOuterClass.AttackResult getAttackResult() {
        if (attackResultBuilder_ == null) {
          return attackResult_ == null ? org.sorapointa.proto.AttackResultOuterClass.AttackResult.getDefaultInstance() : attackResult_;
        } else {
          return attackResultBuilder_.getMessage();
        }
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       */
      public Builder setAttackResult(org.sorapointa.proto.AttackResultOuterClass.AttackResult value) {
        if (attackResultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          attackResult_ = value;
          onChanged();
        } else {
          attackResultBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       */
      public Builder setAttackResult(
          org.sorapointa.proto.AttackResultOuterClass.AttackResult.Builder builderForValue) {
        if (attackResultBuilder_ == null) {
          attackResult_ = builderForValue.build();
          onChanged();
        } else {
          attackResultBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       */
      public Builder mergeAttackResult(org.sorapointa.proto.AttackResultOuterClass.AttackResult value) {
        if (attackResultBuilder_ == null) {
          if (attackResult_ != null) {
            attackResult_ =
              org.sorapointa.proto.AttackResultOuterClass.AttackResult.newBuilder(attackResult_).mergeFrom(value).buildPartial();
          } else {
            attackResult_ = value;
          }
          onChanged();
        } else {
          attackResultBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       */
      public Builder clearAttackResult() {
        if (attackResultBuilder_ == null) {
          attackResult_ = null;
          onChanged();
        } else {
          attackResult_ = null;
          attackResultBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       */
      public org.sorapointa.proto.AttackResultOuterClass.AttackResult.Builder getAttackResultBuilder() {
        
        onChanged();
        return getAttackResultFieldBuilder().getBuilder();
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       */
      public org.sorapointa.proto.AttackResultOuterClass.AttackResultOrBuilder getAttackResultOrBuilder() {
        if (attackResultBuilder_ != null) {
          return attackResultBuilder_.getMessageOrBuilder();
        } else {
          return attackResult_ == null ?
              org.sorapointa.proto.AttackResultOuterClass.AttackResult.getDefaultInstance() : attackResult_;
        }
      }
      /**
       * <code>.AttackResult attack_result = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.AttackResultOuterClass.AttackResult, org.sorapointa.proto.AttackResultOuterClass.AttackResult.Builder, org.sorapointa.proto.AttackResultOuterClass.AttackResultOrBuilder> 
          getAttackResultFieldBuilder() {
        if (attackResultBuilder_ == null) {
          attackResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.sorapointa.proto.AttackResultOuterClass.AttackResult, org.sorapointa.proto.AttackResultOuterClass.AttackResult.Builder, org.sorapointa.proto.AttackResultOuterClass.AttackResultOrBuilder>(
                  getAttackResult(),
                  getParentForChildren(),
                  isClean());
          attackResult_ = null;
        }
        return attackResultBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtHittingOtherInfo)
    }

    // @@protoc_insertion_point(class_scope:EvtHittingOtherInfo)
    private static final org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo();
    }

    public static org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtHittingOtherInfo>
        PARSER = new com.google.protobuf.AbstractParser<EvtHittingOtherInfo>() {
      @java.lang.Override
      public EvtHittingOtherInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtHittingOtherInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtHittingOtherInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtHittingOtherInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.EvtHittingOtherInfoOuterClass.EvtHittingOtherInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtHittingOtherInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtHittingOtherInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031EvtHittingOtherInfo.proto\032\022AttackResul" +
      "t.proto\"L\n\023EvtHittingOtherInfo\022\017\n\007peer_i" +
      "d\030\002 \001(\r\022$\n\rattack_result\030\007 \001(\0132\r.AttackR" +
      "esultB\026\n\024org.sorapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sorapointa.proto.AttackResultOuterClass.getDescriptor(),
        });
    internal_static_EvtHittingOtherInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtHittingOtherInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtHittingOtherInfo_descriptor,
        new java.lang.String[] { "PeerId", "AttackResult", });
    org.sorapointa.proto.AttackResultOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
