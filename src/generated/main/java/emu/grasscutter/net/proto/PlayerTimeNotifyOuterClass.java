// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerTimeNotify.proto

package org.sorapointa.proto;

public final class PlayerTimeNotifyOuterClass {
  private PlayerTimeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerTimeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerTimeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_paused = 12;</code>
     * @return The isPaused.
     */
    boolean getIsPaused();

    /**
     * <code>uint64 player_time = 11;</code>
     * @return The playerTime.
     */
    long getPlayerTime();

    /**
     * <code>uint64 server_time = 5;</code>
     * @return The serverTime.
     */
    long getServerTime();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 121;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerTimeNotify}
   */
  public static final class PlayerTimeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerTimeNotify)
      PlayerTimeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerTimeNotify.newBuilder() to construct.
    private PlayerTimeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerTimeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerTimeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerTimeNotify(
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
            case 40: {

              serverTime_ = input.readUInt64();
              break;
            }
            case 88: {

              playerTime_ = input.readUInt64();
              break;
            }
            case 96: {

              isPaused_ = input.readBool();
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
      return org.sorapointa.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.class, org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.Builder.class);
    }

    public static final int IS_PAUSED_FIELD_NUMBER = 12;
    private boolean isPaused_;
    /**
     * <code>bool is_paused = 12;</code>
     * @return The isPaused.
     */
    @java.lang.Override
    public boolean getIsPaused() {
      return isPaused_;
    }

    public static final int PLAYER_TIME_FIELD_NUMBER = 11;
    private long playerTime_;
    /**
     * <code>uint64 player_time = 11;</code>
     * @return The playerTime.
     */
    @java.lang.Override
    public long getPlayerTime() {
      return playerTime_;
    }

    public static final int SERVER_TIME_FIELD_NUMBER = 5;
    private long serverTime_;
    /**
     * <code>uint64 server_time = 5;</code>
     * @return The serverTime.
     */
    @java.lang.Override
    public long getServerTime() {
      return serverTime_;
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
      if (serverTime_ != 0L) {
        output.writeUInt64(5, serverTime_);
      }
      if (playerTime_ != 0L) {
        output.writeUInt64(11, playerTime_);
      }
      if (isPaused_ != false) {
        output.writeBool(12, isPaused_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, serverTime_);
      }
      if (playerTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, playerTime_);
      }
      if (isPaused_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isPaused_);
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
      if (!(obj instanceof org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify other = (org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify) obj;

      if (getIsPaused()
          != other.getIsPaused()) return false;
      if (getPlayerTime()
          != other.getPlayerTime()) return false;
      if (getServerTime()
          != other.getServerTime()) return false;
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
      hash = (37 * hash) + IS_PAUSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPaused());
      hash = (37 * hash) + PLAYER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPlayerTime());
      hash = (37 * hash) + SERVER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify prototype) {
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
     *   CMD_ID = 121;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerTimeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerTimeNotify)
        org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.class, org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.Builder.class);
      }

      // Construct using org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.newBuilder()
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
        isPaused_ = false;

        playerTime_ = 0L;

        serverTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.PlayerTimeNotifyOuterClass.internal_static_PlayerTimeNotify_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify getDefaultInstanceForType() {
        return org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify build() {
        org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify buildPartial() {
        org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify result = new org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify(this);
        result.isPaused_ = isPaused_;
        result.playerTime_ = playerTime_;
        result.serverTime_ = serverTime_;
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
        if (other instanceof org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify) {
          return mergeFrom((org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify other) {
        if (other == org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify.getDefaultInstance()) return this;
        if (other.getIsPaused() != false) {
          setIsPaused(other.getIsPaused());
        }
        if (other.getPlayerTime() != 0L) {
          setPlayerTime(other.getPlayerTime());
        }
        if (other.getServerTime() != 0L) {
          setServerTime(other.getServerTime());
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
        org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isPaused_ ;
      /**
       * <code>bool is_paused = 12;</code>
       * @return The isPaused.
       */
      @java.lang.Override
      public boolean getIsPaused() {
        return isPaused_;
      }
      /**
       * <code>bool is_paused = 12;</code>
       * @param value The isPaused to set.
       * @return This builder for chaining.
       */
      public Builder setIsPaused(boolean value) {
        
        isPaused_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_paused = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPaused() {
        
        isPaused_ = false;
        onChanged();
        return this;
      }

      private long playerTime_ ;
      /**
       * <code>uint64 player_time = 11;</code>
       * @return The playerTime.
       */
      @java.lang.Override
      public long getPlayerTime() {
        return playerTime_;
      }
      /**
       * <code>uint64 player_time = 11;</code>
       * @param value The playerTime to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerTime(long value) {
        
        playerTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 player_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerTime() {
        
        playerTime_ = 0L;
        onChanged();
        return this;
      }

      private long serverTime_ ;
      /**
       * <code>uint64 server_time = 5;</code>
       * @return The serverTime.
       */
      @java.lang.Override
      public long getServerTime() {
        return serverTime_;
      }
      /**
       * <code>uint64 server_time = 5;</code>
       * @param value The serverTime to set.
       * @return This builder for chaining.
       */
      public Builder setServerTime(long value) {
        
        serverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 server_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerTime() {
        
        serverTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:PlayerTimeNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerTimeNotify)
    private static final org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify();
    }

    public static org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerTimeNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerTimeNotify>() {
      @java.lang.Override
      public PlayerTimeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerTimeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerTimeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerTimeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerTimeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerTimeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PlayerTimeNotify.proto\"O\n\020PlayerTimeNo" +
      "tify\022\021\n\tis_paused\030\014 \001(\010\022\023\n\013player_time\030\013" +
      " \001(\004\022\023\n\013server_time\030\005 \001(\004B\026\n\024org.sorapoi" +
      "nta.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerTimeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerTimeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerTimeNotify_descriptor,
        new java.lang.String[] { "IsPaused", "PlayerTime", "ServerTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
