// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePlayerShowNameCardListRsp.proto

package org.sorapointa.proto;

public final class UpdatePlayerShowNameCardListRspOuterClass {
  private UpdatePlayerShowNameCardListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePlayerShowNameCardListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePlayerShowNameCardListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 show_name_card_id_list = 2;</code>
     * @return A list containing the showNameCardIdList.
     */
    java.util.List<java.lang.Integer> getShowNameCardIdListList();
    /**
     * <code>repeated uint32 show_name_card_id_list = 2;</code>
     * @return The count of showNameCardIdList.
     */
    int getShowNameCardIdListCount();
    /**
     * <code>repeated uint32 show_name_card_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    int getShowNameCardIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4054;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UpdatePlayerShowNameCardListRsp}
   */
  public static final class UpdatePlayerShowNameCardListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePlayerShowNameCardListRsp)
      UpdatePlayerShowNameCardListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePlayerShowNameCardListRsp.newBuilder() to construct.
    private UpdatePlayerShowNameCardListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePlayerShowNameCardListRsp() {
      showNameCardIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePlayerShowNameCardListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdatePlayerShowNameCardListRsp(
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                showNameCardIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              showNameCardIdList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                showNameCardIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                showNameCardIdList_.addInt(input.readUInt32());
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.class, org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList showNameCardIdList_;
    /**
     * <code>repeated uint32 show_name_card_id_list = 2;</code>
     * @return A list containing the showNameCardIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowNameCardIdListList() {
      return showNameCardIdList_;
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 2;</code>
     * @return The count of showNameCardIdList.
     */
    public int getShowNameCardIdListCount() {
      return showNameCardIdList_.size();
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    public int getShowNameCardIdList(int index) {
      return showNameCardIdList_.getInt(index);
    }
    private int showNameCardIdListMemoizedSerializedSize = -1;

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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (getShowNameCardIdListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(showNameCardIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < showNameCardIdList_.size(); i++) {
        output.writeUInt32NoTag(showNameCardIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < showNameCardIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showNameCardIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowNameCardIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showNameCardIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp other = (org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getShowNameCardIdListList()
          .equals(other.getShowNameCardIdListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getShowNameCardIdListCount() > 0) {
        hash = (37 * hash) + SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowNameCardIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp prototype) {
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
     *   CMD_ID = 4054;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UpdatePlayerShowNameCardListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePlayerShowNameCardListRsp)
        org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.class, org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.Builder.class);
      }

      // Construct using org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.newBuilder()
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
        retcode_ = 0;

        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp getDefaultInstanceForType() {
        return org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp build() {
        org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp buildPartial() {
        org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp result = new org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.showNameCardIdList_ = showNameCardIdList_;
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
        if (other instanceof org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp) {
          return mergeFrom((org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp other) {
        if (other == org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.showNameCardIdList_.isEmpty()) {
          if (showNameCardIdList_.isEmpty()) {
            showNameCardIdList_ = other.showNameCardIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShowNameCardIdListIsMutable();
            showNameCardIdList_.addAll(other.showNameCardIdList_);
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
        org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList showNameCardIdList_ = emptyIntList();
      private void ensureShowNameCardIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_ = mutableCopy(showNameCardIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 2;</code>
       * @return A list containing the showNameCardIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowNameCardIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(showNameCardIdList_) : showNameCardIdList_;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 2;</code>
       * @return The count of showNameCardIdList.
       */
      public int getShowNameCardIdListCount() {
        return showNameCardIdList_.size();
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 2;</code>
       * @param index The index of the element to return.
       * @return The showNameCardIdList at the given index.
       */
      public int getShowNameCardIdList(int index) {
        return showNameCardIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The showNameCardIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowNameCardIdList(
          int index, int value) {
        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 2;</code>
       * @param value The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addShowNameCardIdList(int value) {
        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 2;</code>
       * @param values The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowNameCardIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowNameCardIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showNameCardIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowNameCardIdList() {
        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:UpdatePlayerShowNameCardListRsp)
    }

    // @@protoc_insertion_point(class_scope:UpdatePlayerShowNameCardListRsp)
    private static final org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp();
    }

    public static org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePlayerShowNameCardListRsp>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePlayerShowNameCardListRsp>() {
      @java.lang.Override
      public UpdatePlayerShowNameCardListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdatePlayerShowNameCardListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdatePlayerShowNameCardListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePlayerShowNameCardListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePlayerShowNameCardListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePlayerShowNameCardListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%UpdatePlayerShowNameCardListRsp.proto\"" +
      "R\n\037UpdatePlayerShowNameCardListRsp\022\017\n\007re" +
      "tcode\030\001 \001(\005\022\036\n\026show_name_card_id_list\030\002 " +
      "\003(\rB\026\n\024org.sorapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePlayerShowNameCardListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePlayerShowNameCardListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePlayerShowNameCardListRsp_descriptor,
        new java.lang.String[] { "Retcode", "ShowNameCardIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
