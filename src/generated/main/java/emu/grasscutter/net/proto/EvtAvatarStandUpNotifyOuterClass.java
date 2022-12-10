// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarStandUpNotify.proto

package org.sorapointa.proto;

public final class EvtAvatarStandUpNotifyOuterClass {
  private EvtAvatarStandUpNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarStandUpNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarStandUpNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 Unk3300_EBPACPNPKKJ = 13;</code>
     * @return The unk3300EBPACPNPKKJ.
     */
    int getUnk3300EBPACPNPKKJ();

    /**
     * <code>uint64 chair_id = 3;</code>
     * @return The chairId.
     */
    long getChairId();

    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>int32 Unk3300_IMNGNLLMEFJ = 11;</code>
     * @return The unk3300IMNGNLLMEFJ.
     */
    int getUnk3300IMNGNLLMEFJ();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 382;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtAvatarStandUpNotify}
   */
  public static final class EvtAvatarStandUpNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarStandUpNotify)
      EvtAvatarStandUpNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarStandUpNotify.newBuilder() to construct.
    private EvtAvatarStandUpNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarStandUpNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarStandUpNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAvatarStandUpNotify(
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
            case 24: {

              chairId_ = input.readUInt64();
              break;
            }
            case 40: {

              entityId_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300IMNGNLLMEFJ_ = input.readInt32();
              break;
            }
            case 104: {

              unk3300EBPACPNPKKJ_ = input.readInt32();
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
      return org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.internal_static_EvtAvatarStandUpNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.internal_static_EvtAvatarStandUpNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.class, org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.Builder.class);
    }

    public static final int UNK3300_EBPACPNPKKJ_FIELD_NUMBER = 13;
    private int unk3300EBPACPNPKKJ_;
    /**
     * <code>int32 Unk3300_EBPACPNPKKJ = 13;</code>
     * @return The unk3300EBPACPNPKKJ.
     */
    @java.lang.Override
    public int getUnk3300EBPACPNPKKJ() {
      return unk3300EBPACPNPKKJ_;
    }

    public static final int CHAIR_ID_FIELD_NUMBER = 3;
    private long chairId_;
    /**
     * <code>uint64 chair_id = 3;</code>
     * @return The chairId.
     */
    @java.lang.Override
    public long getChairId() {
      return chairId_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 5;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int UNK3300_IMNGNLLMEFJ_FIELD_NUMBER = 11;
    private int unk3300IMNGNLLMEFJ_;
    /**
     * <code>int32 Unk3300_IMNGNLLMEFJ = 11;</code>
     * @return The unk3300IMNGNLLMEFJ.
     */
    @java.lang.Override
    public int getUnk3300IMNGNLLMEFJ() {
      return unk3300IMNGNLLMEFJ_;
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
      if (chairId_ != 0L) {
        output.writeUInt64(3, chairId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      if (unk3300IMNGNLLMEFJ_ != 0) {
        output.writeInt32(11, unk3300IMNGNLLMEFJ_);
      }
      if (unk3300EBPACPNPKKJ_ != 0) {
        output.writeInt32(13, unk3300EBPACPNPKKJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chairId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, chairId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (unk3300IMNGNLLMEFJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, unk3300IMNGNLLMEFJ_);
      }
      if (unk3300EBPACPNPKKJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, unk3300EBPACPNPKKJ_);
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
      if (!(obj instanceof org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify other = (org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify) obj;

      if (getUnk3300EBPACPNPKKJ()
          != other.getUnk3300EBPACPNPKKJ()) return false;
      if (getChairId()
          != other.getChairId()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getUnk3300IMNGNLLMEFJ()
          != other.getUnk3300IMNGNLLMEFJ()) return false;
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
      hash = (37 * hash) + UNK3300_EBPACPNPKKJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EBPACPNPKKJ();
      hash = (37 * hash) + CHAIR_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getChairId());
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + UNK3300_IMNGNLLMEFJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IMNGNLLMEFJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 382;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtAvatarStandUpNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarStandUpNotify)
        org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.internal_static_EvtAvatarStandUpNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.internal_static_EvtAvatarStandUpNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.class, org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.Builder.class);
      }

      // Construct using org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.newBuilder()
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
        unk3300EBPACPNPKKJ_ = 0;

        chairId_ = 0L;

        entityId_ = 0;

        unk3300IMNGNLLMEFJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.internal_static_EvtAvatarStandUpNotify_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify getDefaultInstanceForType() {
        return org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify build() {
        org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify buildPartial() {
        org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify result = new org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify(this);
        result.unk3300EBPACPNPKKJ_ = unk3300EBPACPNPKKJ_;
        result.chairId_ = chairId_;
        result.entityId_ = entityId_;
        result.unk3300IMNGNLLMEFJ_ = unk3300IMNGNLLMEFJ_;
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
        if (other instanceof org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify) {
          return mergeFrom((org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify other) {
        if (other == org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.getDefaultInstance()) return this;
        if (other.getUnk3300EBPACPNPKKJ() != 0) {
          setUnk3300EBPACPNPKKJ(other.getUnk3300EBPACPNPKKJ());
        }
        if (other.getChairId() != 0L) {
          setChairId(other.getChairId());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getUnk3300IMNGNLLMEFJ() != 0) {
          setUnk3300IMNGNLLMEFJ(other.getUnk3300IMNGNLLMEFJ());
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
        org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300EBPACPNPKKJ_ ;
      /**
       * <code>int32 Unk3300_EBPACPNPKKJ = 13;</code>
       * @return The unk3300EBPACPNPKKJ.
       */
      @java.lang.Override
      public int getUnk3300EBPACPNPKKJ() {
        return unk3300EBPACPNPKKJ_;
      }
      /**
       * <code>int32 Unk3300_EBPACPNPKKJ = 13;</code>
       * @param value The unk3300EBPACPNPKKJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EBPACPNPKKJ(int value) {
        
        unk3300EBPACPNPKKJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Unk3300_EBPACPNPKKJ = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EBPACPNPKKJ() {
        
        unk3300EBPACPNPKKJ_ = 0;
        onChanged();
        return this;
      }

      private long chairId_ ;
      /**
       * <code>uint64 chair_id = 3;</code>
       * @return The chairId.
       */
      @java.lang.Override
      public long getChairId() {
        return chairId_;
      }
      /**
       * <code>uint64 chair_id = 3;</code>
       * @param value The chairId to set.
       * @return This builder for chaining.
       */
      public Builder setChairId(long value) {
        
        chairId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 chair_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearChairId() {
        
        chairId_ = 0L;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IMNGNLLMEFJ_ ;
      /**
       * <code>int32 Unk3300_IMNGNLLMEFJ = 11;</code>
       * @return The unk3300IMNGNLLMEFJ.
       */
      @java.lang.Override
      public int getUnk3300IMNGNLLMEFJ() {
        return unk3300IMNGNLLMEFJ_;
      }
      /**
       * <code>int32 Unk3300_IMNGNLLMEFJ = 11;</code>
       * @param value The unk3300IMNGNLLMEFJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IMNGNLLMEFJ(int value) {
        
        unk3300IMNGNLLMEFJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Unk3300_IMNGNLLMEFJ = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IMNGNLLMEFJ() {
        
        unk3300IMNGNLLMEFJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarStandUpNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarStandUpNotify)
    private static final org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify();
    }

    public static org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarStandUpNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarStandUpNotify>() {
      @java.lang.Override
      public EvtAvatarStandUpNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAvatarStandUpNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAvatarStandUpNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarStandUpNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarStandUpNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarStandUpNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034EvtAvatarStandUpNotify.proto\"w\n\026EvtAva" +
      "tarStandUpNotify\022\033\n\023Unk3300_EBPACPNPKKJ\030" +
      "\r \001(\005\022\020\n\010chair_id\030\003 \001(\004\022\021\n\tentity_id\030\005 \001" +
      "(\r\022\033\n\023Unk3300_IMNGNLLMEFJ\030\013 \001(\005B\026\n\024org.s" +
      "orapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EvtAvatarStandUpNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarStandUpNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarStandUpNotify_descriptor,
        new java.lang.String[] { "Unk3300EBPACPNPKKJ", "ChairId", "EntityId", "Unk3300IMNGNLLMEFJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
