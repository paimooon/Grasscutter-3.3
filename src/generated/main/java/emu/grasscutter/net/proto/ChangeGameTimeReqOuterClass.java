// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeGameTimeReq.proto

package org.sorapointa.proto;

public final class ChangeGameTimeReqOuterClass {
  private ChangeGameTimeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeGameTimeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeGameTimeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 extra_days = 3;</code>
     * @return The extraDays.
     */
    int getExtraDays();

    /**
     * <code>uint32 game_time = 8;</code>
     * @return The gameTime.
     */
    int getGameTime();

    /**
     * <code>bool is_force_set = 2;</code>
     * @return The isForceSet.
     */
    boolean getIsForceSet();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 178;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChangeGameTimeReq}
   */
  public static final class ChangeGameTimeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeGameTimeReq)
      ChangeGameTimeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeGameTimeReq.newBuilder() to construct.
    private ChangeGameTimeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeGameTimeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeGameTimeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeGameTimeReq(
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

              isForceSet_ = input.readBool();
              break;
            }
            case 24: {

              extraDays_ = input.readUInt32();
              break;
            }
            case 64: {

              gameTime_ = input.readUInt32();
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
      return org.sorapointa.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.class, org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.Builder.class);
    }

    public static final int EXTRA_DAYS_FIELD_NUMBER = 3;
    private int extraDays_;
    /**
     * <code>uint32 extra_days = 3;</code>
     * @return The extraDays.
     */
    @java.lang.Override
    public int getExtraDays() {
      return extraDays_;
    }

    public static final int GAME_TIME_FIELD_NUMBER = 8;
    private int gameTime_;
    /**
     * <code>uint32 game_time = 8;</code>
     * @return The gameTime.
     */
    @java.lang.Override
    public int getGameTime() {
      return gameTime_;
    }

    public static final int IS_FORCE_SET_FIELD_NUMBER = 2;
    private boolean isForceSet_;
    /**
     * <code>bool is_force_set = 2;</code>
     * @return The isForceSet.
     */
    @java.lang.Override
    public boolean getIsForceSet() {
      return isForceSet_;
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
      if (isForceSet_ != false) {
        output.writeBool(2, isForceSet_);
      }
      if (extraDays_ != 0) {
        output.writeUInt32(3, extraDays_);
      }
      if (gameTime_ != 0) {
        output.writeUInt32(8, gameTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isForceSet_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isForceSet_);
      }
      if (extraDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, extraDays_);
      }
      if (gameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, gameTime_);
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
      if (!(obj instanceof org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq other = (org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) obj;

      if (getExtraDays()
          != other.getExtraDays()) return false;
      if (getGameTime()
          != other.getGameTime()) return false;
      if (getIsForceSet()
          != other.getIsForceSet()) return false;
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
      hash = (37 * hash) + EXTRA_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getExtraDays();
      hash = (37 * hash) + GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getGameTime();
      hash = (37 * hash) + IS_FORCE_SET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForceSet());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq prototype) {
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
     *   CMD_ID = 178;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChangeGameTimeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeGameTimeReq)
        org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.class, org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.Builder.class);
      }

      // Construct using org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.newBuilder()
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
        extraDays_ = 0;

        gameTime_ = 0;

        isForceSet_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstanceForType() {
        return org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq build() {
        org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq buildPartial() {
        org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq result = new org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq(this);
        result.extraDays_ = extraDays_;
        result.gameTime_ = gameTime_;
        result.isForceSet_ = isForceSet_;
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
        if (other instanceof org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) {
          return mergeFrom((org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq other) {
        if (other == org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDefaultInstance()) return this;
        if (other.getExtraDays() != 0) {
          setExtraDays(other.getExtraDays());
        }
        if (other.getGameTime() != 0) {
          setGameTime(other.getGameTime());
        }
        if (other.getIsForceSet() != false) {
          setIsForceSet(other.getIsForceSet());
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
        org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int extraDays_ ;
      /**
       * <code>uint32 extra_days = 3;</code>
       * @return The extraDays.
       */
      @java.lang.Override
      public int getExtraDays() {
        return extraDays_;
      }
      /**
       * <code>uint32 extra_days = 3;</code>
       * @param value The extraDays to set.
       * @return This builder for chaining.
       */
      public Builder setExtraDays(int value) {
        
        extraDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 extra_days = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraDays() {
        
        extraDays_ = 0;
        onChanged();
        return this;
      }

      private int gameTime_ ;
      /**
       * <code>uint32 game_time = 8;</code>
       * @return The gameTime.
       */
      @java.lang.Override
      public int getGameTime() {
        return gameTime_;
      }
      /**
       * <code>uint32 game_time = 8;</code>
       * @param value The gameTime to set.
       * @return This builder for chaining.
       */
      public Builder setGameTime(int value) {
        
        gameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 game_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameTime() {
        
        gameTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isForceSet_ ;
      /**
       * <code>bool is_force_set = 2;</code>
       * @return The isForceSet.
       */
      @java.lang.Override
      public boolean getIsForceSet() {
        return isForceSet_;
      }
      /**
       * <code>bool is_force_set = 2;</code>
       * @param value The isForceSet to set.
       * @return This builder for chaining.
       */
      public Builder setIsForceSet(boolean value) {
        
        isForceSet_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_force_set = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForceSet() {
        
        isForceSet_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChangeGameTimeReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeGameTimeReq)
    private static final org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq();
    }

    public static org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeGameTimeReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeGameTimeReq>() {
      @java.lang.Override
      public ChangeGameTimeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeGameTimeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeGameTimeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeGameTimeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeGameTimeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeGameTimeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeGameTimeReq.proto\"P\n\021ChangeGameT" +
      "imeReq\022\022\n\nextra_days\030\003 \001(\r\022\021\n\tgame_time\030" +
      "\010 \001(\r\022\024\n\014is_force_set\030\002 \001(\010B\026\n\024org.sorap" +
      "ointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeGameTimeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeGameTimeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeGameTimeReq_descriptor,
        new java.lang.String[] { "ExtraDays", "GameTime", "IsForceSet", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
