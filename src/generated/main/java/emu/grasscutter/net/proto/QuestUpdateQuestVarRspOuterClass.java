// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestUpdateQuestVarRsp.proto

package org.sorapointa.proto;

public final class QuestUpdateQuestVarRspOuterClass {
  private QuestUpdateQuestVarRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestUpdateQuestVarRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestUpdateQuestVarRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 parent_quest_var_seq = 1;</code>
     * @return The parentQuestVarSeq.
     */
    int getParentQuestVarSeq();

    /**
     * <code>uint32 parent_quest_id = 8;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>uint32 quest_id = 11;</code>
     * @return The questId.
     */
    int getQuestId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 416;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code QuestUpdateQuestVarRsp}
   */
  public static final class QuestUpdateQuestVarRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestUpdateQuestVarRsp)
      QuestUpdateQuestVarRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestUpdateQuestVarRsp.newBuilder() to construct.
    private QuestUpdateQuestVarRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestUpdateQuestVarRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestUpdateQuestVarRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QuestUpdateQuestVarRsp(
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
            case 8: {

              parentQuestVarSeq_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 64: {

              parentQuestId_ = input.readUInt32();
              break;
            }
            case 88: {

              questId_ = input.readUInt32();
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
      return org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.class, org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PARENT_QUEST_VAR_SEQ_FIELD_NUMBER = 1;
    private int parentQuestVarSeq_;
    /**
     * <code>uint32 parent_quest_var_seq = 1;</code>
     * @return The parentQuestVarSeq.
     */
    @java.lang.Override
    public int getParentQuestVarSeq() {
      return parentQuestVarSeq_;
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 8;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 8;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 11;
    private int questId_;
    /**
     * <code>uint32 quest_id = 11;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
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
      if (parentQuestVarSeq_ != 0) {
        output.writeUInt32(1, parentQuestVarSeq_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(8, parentQuestId_);
      }
      if (questId_ != 0) {
        output.writeUInt32(11, questId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentQuestVarSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, parentQuestVarSeq_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, parentQuestId_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, questId_);
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
      if (!(obj instanceof org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp other = (org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getParentQuestVarSeq()
          != other.getParentQuestVarSeq()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
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
      hash = (37 * hash) + PARENT_QUEST_VAR_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestVarSeq();
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp prototype) {
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
     *   CMD_ID = 416;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code QuestUpdateQuestVarRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestUpdateQuestVarRsp)
        org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.class, org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.Builder.class);
      }

      // Construct using org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.newBuilder()
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

        parentQuestVarSeq_ = 0;

        parentQuestId_ = 0;

        questId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp getDefaultInstanceForType() {
        return org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp build() {
        org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp buildPartial() {
        org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp result = new org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp(this);
        result.retcode_ = retcode_;
        result.parentQuestVarSeq_ = parentQuestVarSeq_;
        result.parentQuestId_ = parentQuestId_;
        result.questId_ = questId_;
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
        if (other instanceof org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp) {
          return mergeFrom((org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp other) {
        if (other == org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getParentQuestVarSeq() != 0) {
          setParentQuestVarSeq(other.getParentQuestVarSeq());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
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
        org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestVarSeq_ ;
      /**
       * <code>uint32 parent_quest_var_seq = 1;</code>
       * @return The parentQuestVarSeq.
       */
      @java.lang.Override
      public int getParentQuestVarSeq() {
        return parentQuestVarSeq_;
      }
      /**
       * <code>uint32 parent_quest_var_seq = 1;</code>
       * @param value The parentQuestVarSeq to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestVarSeq(int value) {
        
        parentQuestVarSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_var_seq = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestVarSeq() {
        
        parentQuestVarSeq_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 11;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 11;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QuestUpdateQuestVarRsp)
    }

    // @@protoc_insertion_point(class_scope:QuestUpdateQuestVarRsp)
    private static final org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp();
    }

    public static org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestUpdateQuestVarRsp>
        PARSER = new com.google.protobuf.AbstractParser<QuestUpdateQuestVarRsp>() {
      @java.lang.Override
      public QuestUpdateQuestVarRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuestUpdateQuestVarRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QuestUpdateQuestVarRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestUpdateQuestVarRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestUpdateQuestVarRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034QuestUpdateQuestVarRsp.proto\"r\n\026QuestU" +
      "pdateQuestVarRsp\022\017\n\007retcode\030\007 \001(\005\022\034\n\024par" +
      "ent_quest_var_seq\030\001 \001(\r\022\027\n\017parent_quest_" +
      "id\030\010 \001(\r\022\020\n\010quest_id\030\013 \001(\rB\026\n\024org.sorapo" +
      "inta.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestUpdateQuestVarRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestUpdateQuestVarRsp_descriptor,
        new java.lang.String[] { "Retcode", "ParentQuestVarSeq", "ParentQuestId", "QuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
