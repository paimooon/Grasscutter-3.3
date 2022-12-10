// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityWatcherInfo.proto

package org.sorapointa.proto;

public final class ActivityWatcherInfoOuterClass {
  private ActivityWatcherInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityWatcherInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityWatcherInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_taken_reward = 2;</code>
     * @return The isTakenReward.
     */
    boolean getIsTakenReward();

    /**
     * <code>uint32 total_progress = 1;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();

    /**
     * <code>uint32 cur_progress = 8;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>uint32 watcher_id = 14;</code>
     * @return The watcherId.
     */
    int getWatcherId();
  }
  /**
   * Protobuf type {@code ActivityWatcherInfo}
   */
  public static final class ActivityWatcherInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityWatcherInfo)
      ActivityWatcherInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityWatcherInfo.newBuilder() to construct.
    private ActivityWatcherInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityWatcherInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityWatcherInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityWatcherInfo(
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

              totalProgress_ = input.readUInt32();
              break;
            }
            case 16: {

              isTakenReward_ = input.readBool();
              break;
            }
            case 64: {

              curProgress_ = input.readUInt32();
              break;
            }
            case 112: {

              watcherId_ = input.readUInt32();
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
      return org.sorapointa.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.class, org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder.class);
    }

    public static final int IS_TAKEN_REWARD_FIELD_NUMBER = 2;
    private boolean isTakenReward_;
    /**
     * <code>bool is_taken_reward = 2;</code>
     * @return The isTakenReward.
     */
    @java.lang.Override
    public boolean getIsTakenReward() {
      return isTakenReward_;
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 1;
    private int totalProgress_;
    /**
     * <code>uint32 total_progress = 1;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 8;
    private int curProgress_;
    /**
     * <code>uint32 cur_progress = 8;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 14;
    private int watcherId_;
    /**
     * <code>uint32 watcher_id = 14;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
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
      if (totalProgress_ != 0) {
        output.writeUInt32(1, totalProgress_);
      }
      if (isTakenReward_ != false) {
        output.writeBool(2, isTakenReward_);
      }
      if (curProgress_ != 0) {
        output.writeUInt32(8, curProgress_);
      }
      if (watcherId_ != 0) {
        output.writeUInt32(14, watcherId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, totalProgress_);
      }
      if (isTakenReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isTakenReward_);
      }
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, curProgress_);
      }
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, watcherId_);
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
      if (!(obj instanceof org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo other = (org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo) obj;

      if (getIsTakenReward()
          != other.getIsTakenReward()) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
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
      hash = (37 * hash) + IS_TAKEN_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTakenReward());
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo prototype) {
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
     * Protobuf type {@code ActivityWatcherInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityWatcherInfo)
        org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.class, org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder.class);
      }

      // Construct using org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.newBuilder()
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
        isTakenReward_ = false;

        totalProgress_ = 0;

        curProgress_ = 0;

        watcherId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getDefaultInstanceForType() {
        return org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo build() {
        org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo buildPartial() {
        org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo result = new org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo(this);
        result.isTakenReward_ = isTakenReward_;
        result.totalProgress_ = totalProgress_;
        result.curProgress_ = curProgress_;
        result.watcherId_ = watcherId_;
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
        if (other instanceof org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo) {
          return mergeFrom((org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo other) {
        if (other == org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance()) return this;
        if (other.getIsTakenReward() != false) {
          setIsTakenReward(other.getIsTakenReward());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
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
        org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isTakenReward_ ;
      /**
       * <code>bool is_taken_reward = 2;</code>
       * @return The isTakenReward.
       */
      @java.lang.Override
      public boolean getIsTakenReward() {
        return isTakenReward_;
      }
      /**
       * <code>bool is_taken_reward = 2;</code>
       * @param value The isTakenReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsTakenReward(boolean value) {
        
        isTakenReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_taken_reward = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTakenReward() {
        
        isTakenReward_ = false;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 1;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 1;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 8;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 8;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {
        
        curProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        
        curProgress_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 14;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 14;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        
        watcherId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityWatcherInfo)
    }

    // @@protoc_insertion_point(class_scope:ActivityWatcherInfo)
    private static final org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo();
    }

    public static org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityWatcherInfo>
        PARSER = new com.google.protobuf.AbstractParser<ActivityWatcherInfo>() {
      @java.lang.Override
      public ActivityWatcherInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityWatcherInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityWatcherInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityWatcherInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityWatcherInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityWatcherInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ActivityWatcherInfo.proto\"p\n\023ActivityW" +
      "atcherInfo\022\027\n\017is_taken_reward\030\002 \001(\010\022\026\n\016t" +
      "otal_progress\030\001 \001(\r\022\024\n\014cur_progress\030\010 \001(" +
      "\r\022\022\n\nwatcher_id\030\016 \001(\rB\026\n\024org.sorapointa." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityWatcherInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityWatcherInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityWatcherInfo_descriptor,
        new java.lang.String[] { "IsTakenReward", "TotalProgress", "CurProgress", "WatcherId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
