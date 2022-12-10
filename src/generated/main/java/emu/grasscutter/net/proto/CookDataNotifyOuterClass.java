// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CookDataNotify.proto

package org.sorapointa.proto;

public final class CookDataNotifyOuterClass {
  private CookDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CookDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CookDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    java.util.List<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData> 
        getRecipeDataListList();
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(int index);
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    int getRecipeDataListCount();
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    java.util.List<? extends org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
        getRecipeDataListOrBuilderList();
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(
        int index);

    /**
     * <code>uint32 grade = 9;</code>
     * @return The grade.
     */
    int getGrade();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 133;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CookDataNotify}
   */
  public static final class CookDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CookDataNotify)
      CookDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CookDataNotify.newBuilder() to construct.
    private CookDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CookDataNotify() {
      recipeDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CookDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CookDataNotify(
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
            case 72: {

              grade_ = input.readUInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                recipeDataList_ = new java.util.ArrayList<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData>();
                mutable_bitField0_ |= 0x00000001;
              }
              recipeDataList_.add(
                  input.readMessage(org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.parser(), extensionRegistry));
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
          recipeDataList_ = java.util.Collections.unmodifiableList(recipeDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sorapointa.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify.class, org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify.Builder.class);
    }

    public static final int RECIPE_DATA_LIST_FIELD_NUMBER = 15;
    private java.util.List<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData> recipeDataList_;
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData> getRecipeDataListList() {
      return recipeDataList_;
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
        getRecipeDataListOrBuilderList() {
      return recipeDataList_;
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public int getRecipeDataListCount() {
      return recipeDataList_.size();
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(int index) {
      return recipeDataList_.get(index);
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(
        int index) {
      return recipeDataList_.get(index);
    }

    public static final int GRADE_FIELD_NUMBER = 9;
    private int grade_;
    /**
     * <code>uint32 grade = 9;</code>
     * @return The grade.
     */
    @java.lang.Override
    public int getGrade() {
      return grade_;
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
      if (grade_ != 0) {
        output.writeUInt32(9, grade_);
      }
      for (int i = 0; i < recipeDataList_.size(); i++) {
        output.writeMessage(15, recipeDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (grade_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, grade_);
      }
      for (int i = 0; i < recipeDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, recipeDataList_.get(i));
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
      if (!(obj instanceof org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify other = (org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify) obj;

      if (!getRecipeDataListList()
          .equals(other.getRecipeDataListList())) return false;
      if (getGrade()
          != other.getGrade()) return false;
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
      if (getRecipeDataListCount() > 0) {
        hash = (37 * hash) + RECIPE_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecipeDataListList().hashCode();
      }
      hash = (37 * hash) + GRADE_FIELD_NUMBER;
      hash = (53 * hash) + getGrade();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify prototype) {
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
     *   CMD_ID = 133;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CookDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CookDataNotify)
        org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify.class, org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify.Builder.class);
      }

      // Construct using org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify.newBuilder()
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
          getRecipeDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (recipeDataListBuilder_ == null) {
          recipeDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          recipeDataListBuilder_.clear();
        }
        grade_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify getDefaultInstanceForType() {
        return org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify build() {
        org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify buildPartial() {
        org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify result = new org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (recipeDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            recipeDataList_ = java.util.Collections.unmodifiableList(recipeDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recipeDataList_ = recipeDataList_;
        } else {
          result.recipeDataList_ = recipeDataListBuilder_.build();
        }
        result.grade_ = grade_;
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
        if (other instanceof org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify) {
          return mergeFrom((org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify other) {
        if (other == org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify.getDefaultInstance()) return this;
        if (recipeDataListBuilder_ == null) {
          if (!other.recipeDataList_.isEmpty()) {
            if (recipeDataList_.isEmpty()) {
              recipeDataList_ = other.recipeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecipeDataListIsMutable();
              recipeDataList_.addAll(other.recipeDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.recipeDataList_.isEmpty()) {
            if (recipeDataListBuilder_.isEmpty()) {
              recipeDataListBuilder_.dispose();
              recipeDataListBuilder_ = null;
              recipeDataList_ = other.recipeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recipeDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecipeDataListFieldBuilder() : null;
            } else {
              recipeDataListBuilder_.addAllMessages(other.recipeDataList_);
            }
          }
        }
        if (other.getGrade() != 0) {
          setGrade(other.getGrade());
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
        org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData> recipeDataList_ =
        java.util.Collections.emptyList();
      private void ensureRecipeDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recipeDataList_ = new java.util.ArrayList<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData>(recipeDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> recipeDataListBuilder_;

      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public java.util.List<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData> getRecipeDataListList() {
        if (recipeDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recipeDataList_);
        } else {
          return recipeDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public int getRecipeDataListCount() {
        if (recipeDataListBuilder_ == null) {
          return recipeDataList_.size();
        } else {
          return recipeDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(int index) {
        if (recipeDataListBuilder_ == null) {
          return recipeDataList_.get(index);
        } else {
          return recipeDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder setRecipeDataList(
          int index, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData value) {
        if (recipeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecipeDataListIsMutable();
          recipeDataList_.set(index, value);
          onChanged();
        } else {
          recipeDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder setRecipeDataList(
          int index, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recipeDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData value) {
        if (recipeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(value);
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(
          int index, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData value) {
        if (recipeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(index, value);
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(
          org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(builderForValue.build());
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(
          int index, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addAllRecipeDataList(
          java.lang.Iterable<? extends org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData> values) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recipeDataList_);
          onChanged();
        } else {
          recipeDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder clearRecipeDataList() {
        if (recipeDataListBuilder_ == null) {
          recipeDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recipeDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder removeRecipeDataList(int index) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.remove(index);
          onChanged();
        } else {
          recipeDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder getRecipeDataListBuilder(
          int index) {
        return getRecipeDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(
          int index) {
        if (recipeDataListBuilder_ == null) {
          return recipeDataList_.get(index);  } else {
          return recipeDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public java.util.List<? extends org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
           getRecipeDataListOrBuilderList() {
        if (recipeDataListBuilder_ != null) {
          return recipeDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recipeDataList_);
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder addRecipeDataListBuilder() {
        return getRecipeDataListFieldBuilder().addBuilder(
            org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance());
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder addRecipeDataListBuilder(
          int index) {
        return getRecipeDataListFieldBuilder().addBuilder(
            index, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance());
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public java.util.List<org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder> 
           getRecipeDataListBuilderList() {
        return getRecipeDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
          getRecipeDataListFieldBuilder() {
        if (recipeDataListBuilder_ == null) {
          recipeDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeData.Builder, org.sorapointa.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder>(
                  recipeDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          recipeDataList_ = null;
        }
        return recipeDataListBuilder_;
      }

      private int grade_ ;
      /**
       * <code>uint32 grade = 9;</code>
       * @return The grade.
       */
      @java.lang.Override
      public int getGrade() {
        return grade_;
      }
      /**
       * <code>uint32 grade = 9;</code>
       * @param value The grade to set.
       * @return This builder for chaining.
       */
      public Builder setGrade(int value) {
        
        grade_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 grade = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrade() {
        
        grade_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CookDataNotify)
    }

    // @@protoc_insertion_point(class_scope:CookDataNotify)
    private static final org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify();
    }

    public static org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CookDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<CookDataNotify>() {
      @java.lang.Override
      public CookDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CookDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CookDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CookDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.CookDataNotifyOuterClass.CookDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CookDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CookDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CookDataNotify.proto\032\024CookRecipeData.p" +
      "roto\"J\n\016CookDataNotify\022)\n\020recipe_data_li" +
      "st\030\017 \003(\0132\017.CookRecipeData\022\r\n\005grade\030\t \001(\r" +
      "B\026\n\024org.sorapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sorapointa.proto.CookRecipeDataOuterClass.getDescriptor(),
        });
    internal_static_CookDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CookDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CookDataNotify_descriptor,
        new java.lang.String[] { "RecipeDataList", "Grade", });
    org.sorapointa.proto.CookRecipeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
