// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerCondMeetQuestListUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class ServerCondMeetQuestListUpdateNotifyOuterClass {
  private ServerCondMeetQuestListUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerCondMeetQuestListUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerCondMeetQuestListUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
     * @return A list containing the unk3300MGBDKFMBGBO.
     */
    java.util.List<java.lang.Integer> getUnk3300MGBDKFMBGBOList();
    /**
     * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
     * @return The count of unk3300MGBDKFMBGBO.
     */
    int getUnk3300MGBDKFMBGBOCount();
    /**
     * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3300MGBDKFMBGBO at the given index.
     */
    int getUnk3300MGBDKFMBGBO(int index);

    /**
     * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
     * @return A list containing the unk3300HIEMKEJOFPO.
     */
    java.util.List<java.lang.Integer> getUnk3300HIEMKEJOFPOList();
    /**
     * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
     * @return The count of unk3300HIEMKEJOFPO.
     */
    int getUnk3300HIEMKEJOFPOCount();
    /**
     * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
     * @param index The index of the element to return.
     * @return The unk3300HIEMKEJOFPO at the given index.
     */
    int getUnk3300HIEMKEJOFPO(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 410;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ServerCondMeetQuestListUpdateNotify}
   */
  public static final class ServerCondMeetQuestListUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerCondMeetQuestListUpdateNotify)
      ServerCondMeetQuestListUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerCondMeetQuestListUpdateNotify.newBuilder() to construct.
    private ServerCondMeetQuestListUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerCondMeetQuestListUpdateNotify() {
      unk3300MGBDKFMBGBO_ = emptyIntList();
      unk3300HIEMKEJOFPO_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerCondMeetQuestListUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerCondMeetQuestListUpdateNotify(
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
            case 32: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                unk3300HIEMKEJOFPO_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              unk3300HIEMKEJOFPO_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                unk3300HIEMKEJOFPO_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3300HIEMKEJOFPO_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3300MGBDKFMBGBO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3300MGBDKFMBGBO_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3300MGBDKFMBGBO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3300MGBDKFMBGBO_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          unk3300HIEMKEJOFPO_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unk3300MGBDKFMBGBO_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.class, emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.Builder.class);
    }

    public static final int UNK3300_MGBDKFMBGBO_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList unk3300MGBDKFMBGBO_;
    /**
     * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
     * @return A list containing the unk3300MGBDKFMBGBO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300MGBDKFMBGBOList() {
      return unk3300MGBDKFMBGBO_;
    }
    /**
     * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
     * @return The count of unk3300MGBDKFMBGBO.
     */
    public int getUnk3300MGBDKFMBGBOCount() {
      return unk3300MGBDKFMBGBO_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3300MGBDKFMBGBO at the given index.
     */
    public int getUnk3300MGBDKFMBGBO(int index) {
      return unk3300MGBDKFMBGBO_.getInt(index);
    }
    private int unk3300MGBDKFMBGBOMemoizedSerializedSize = -1;

    public static final int UNK3300_HIEMKEJOFPO_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList unk3300HIEMKEJOFPO_;
    /**
     * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
     * @return A list containing the unk3300HIEMKEJOFPO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300HIEMKEJOFPOList() {
      return unk3300HIEMKEJOFPO_;
    }
    /**
     * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
     * @return The count of unk3300HIEMKEJOFPO.
     */
    public int getUnk3300HIEMKEJOFPOCount() {
      return unk3300HIEMKEJOFPO_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
     * @param index The index of the element to return.
     * @return The unk3300HIEMKEJOFPO at the given index.
     */
    public int getUnk3300HIEMKEJOFPO(int index) {
      return unk3300HIEMKEJOFPO_.getInt(index);
    }
    private int unk3300HIEMKEJOFPOMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getUnk3300HIEMKEJOFPOList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(unk3300HIEMKEJOFPOMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300HIEMKEJOFPO_.size(); i++) {
        output.writeUInt32NoTag(unk3300HIEMKEJOFPO_.getInt(i));
      }
      if (getUnk3300MGBDKFMBGBOList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(unk3300MGBDKFMBGBOMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300MGBDKFMBGBO_.size(); i++) {
        output.writeUInt32NoTag(unk3300MGBDKFMBGBO_.getInt(i));
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
        for (int i = 0; i < unk3300HIEMKEJOFPO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300HIEMKEJOFPO_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300HIEMKEJOFPOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300HIEMKEJOFPOMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3300MGBDKFMBGBO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300MGBDKFMBGBO_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300MGBDKFMBGBOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300MGBDKFMBGBOMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify other = (emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify) obj;

      if (!getUnk3300MGBDKFMBGBOList()
          .equals(other.getUnk3300MGBDKFMBGBOList())) return false;
      if (!getUnk3300HIEMKEJOFPOList()
          .equals(other.getUnk3300HIEMKEJOFPOList())) return false;
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
      if (getUnk3300MGBDKFMBGBOCount() > 0) {
        hash = (37 * hash) + UNK3300_MGBDKFMBGBO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300MGBDKFMBGBOList().hashCode();
      }
      if (getUnk3300HIEMKEJOFPOCount() > 0) {
        hash = (37 * hash) + UNK3300_HIEMKEJOFPO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300HIEMKEJOFPOList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify prototype) {
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
     *   CMD_ID = 410;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ServerCondMeetQuestListUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerCondMeetQuestListUpdateNotify)
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.class, emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.newBuilder()
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
        unk3300MGBDKFMBGBO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300HIEMKEJOFPO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify build() {
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify result = new emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3300MGBDKFMBGBO_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3300MGBDKFMBGBO_ = unk3300MGBDKFMBGBO_;
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3300HIEMKEJOFPO_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3300HIEMKEJOFPO_ = unk3300HIEMKEJOFPO_;
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
        if (other instanceof emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.getDefaultInstance()) return this;
        if (!other.unk3300MGBDKFMBGBO_.isEmpty()) {
          if (unk3300MGBDKFMBGBO_.isEmpty()) {
            unk3300MGBDKFMBGBO_ = other.unk3300MGBDKFMBGBO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3300MGBDKFMBGBOIsMutable();
            unk3300MGBDKFMBGBO_.addAll(other.unk3300MGBDKFMBGBO_);
          }
          onChanged();
        }
        if (!other.unk3300HIEMKEJOFPO_.isEmpty()) {
          if (unk3300HIEMKEJOFPO_.isEmpty()) {
            unk3300HIEMKEJOFPO_ = other.unk3300HIEMKEJOFPO_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3300HIEMKEJOFPOIsMutable();
            unk3300HIEMKEJOFPO_.addAll(other.unk3300HIEMKEJOFPO_);
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
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk3300MGBDKFMBGBO_ = emptyIntList();
      private void ensureUnk3300MGBDKFMBGBOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3300MGBDKFMBGBO_ = mutableCopy(unk3300MGBDKFMBGBO_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
       * @return A list containing the unk3300MGBDKFMBGBO.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300MGBDKFMBGBOList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300MGBDKFMBGBO_) : unk3300MGBDKFMBGBO_;
      }
      /**
       * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
       * @return The count of unk3300MGBDKFMBGBO.
       */
      public int getUnk3300MGBDKFMBGBOCount() {
        return unk3300MGBDKFMBGBO_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
       * @param index The index of the element to return.
       * @return The unk3300MGBDKFMBGBO at the given index.
       */
      public int getUnk3300MGBDKFMBGBO(int index) {
        return unk3300MGBDKFMBGBO_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
       * @param index The index to set the value at.
       * @param value The unk3300MGBDKFMBGBO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MGBDKFMBGBO(
          int index, int value) {
        ensureUnk3300MGBDKFMBGBOIsMutable();
        unk3300MGBDKFMBGBO_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
       * @param value The unk3300MGBDKFMBGBO to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300MGBDKFMBGBO(int value) {
        ensureUnk3300MGBDKFMBGBOIsMutable();
        unk3300MGBDKFMBGBO_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
       * @param values The unk3300MGBDKFMBGBO to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300MGBDKFMBGBO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300MGBDKFMBGBOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300MGBDKFMBGBO_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_MGBDKFMBGBO = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MGBDKFMBGBO() {
        unk3300MGBDKFMBGBO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3300HIEMKEJOFPO_ = emptyIntList();
      private void ensureUnk3300HIEMKEJOFPOIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3300HIEMKEJOFPO_ = mutableCopy(unk3300HIEMKEJOFPO_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
       * @return A list containing the unk3300HIEMKEJOFPO.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300HIEMKEJOFPOList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300HIEMKEJOFPO_) : unk3300HIEMKEJOFPO_;
      }
      /**
       * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
       * @return The count of unk3300HIEMKEJOFPO.
       */
      public int getUnk3300HIEMKEJOFPOCount() {
        return unk3300HIEMKEJOFPO_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
       * @param index The index of the element to return.
       * @return The unk3300HIEMKEJOFPO at the given index.
       */
      public int getUnk3300HIEMKEJOFPO(int index) {
        return unk3300HIEMKEJOFPO_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
       * @param index The index to set the value at.
       * @param value The unk3300HIEMKEJOFPO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HIEMKEJOFPO(
          int index, int value) {
        ensureUnk3300HIEMKEJOFPOIsMutable();
        unk3300HIEMKEJOFPO_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
       * @param value The unk3300HIEMKEJOFPO to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300HIEMKEJOFPO(int value) {
        ensureUnk3300HIEMKEJOFPOIsMutable();
        unk3300HIEMKEJOFPO_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
       * @param values The unk3300HIEMKEJOFPO to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300HIEMKEJOFPO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300HIEMKEJOFPOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300HIEMKEJOFPO_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_HIEMKEJOFPO = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HIEMKEJOFPO() {
        unk3300HIEMKEJOFPO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:ServerCondMeetQuestListUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerCondMeetQuestListUpdateNotify)
    private static final emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify();
    }

    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerCondMeetQuestListUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerCondMeetQuestListUpdateNotify>() {
      @java.lang.Override
      public ServerCondMeetQuestListUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerCondMeetQuestListUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerCondMeetQuestListUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerCondMeetQuestListUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)ServerCondMeetQuestListUpdateNotify.pr" +
      "oto\"_\n#ServerCondMeetQuestListUpdateNoti" +
      "fy\022\033\n\023Unk3300_MGBDKFMBGBO\030\n \003(\r\022\033\n\023Unk33" +
      "00_HIEMKEJOFPO\030\004 \003(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerCondMeetQuestListUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerCondMeetQuestListUpdateNotify_descriptor,
        new java.lang.String[] { "Unk3300MGBDKFMBGBO", "Unk3300HIEMKEJOFPO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
