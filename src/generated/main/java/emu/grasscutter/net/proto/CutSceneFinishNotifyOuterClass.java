// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CutSceneFinishNotify.proto

package org.sorapointa.proto;

public final class CutSceneFinishNotifyOuterClass {
  private CutSceneFinishNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CutSceneFinishNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CutSceneFinishNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cutscene_id = 5;</code>
     * @return The cutsceneId.
     */
    int getCutsceneId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 284;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CutSceneFinishNotify}
   */
  public static final class CutSceneFinishNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CutSceneFinishNotify)
      CutSceneFinishNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CutSceneFinishNotify.newBuilder() to construct.
    private CutSceneFinishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CutSceneFinishNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CutSceneFinishNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CutSceneFinishNotify(
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

              cutsceneId_ = input.readUInt32();
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
      return org.sorapointa.proto.CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify.class, org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify.Builder.class);
    }

    public static final int CUTSCENE_ID_FIELD_NUMBER = 5;
    private int cutsceneId_;
    /**
     * <code>uint32 cutscene_id = 5;</code>
     * @return The cutsceneId.
     */
    @java.lang.Override
    public int getCutsceneId() {
      return cutsceneId_;
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
      if (cutsceneId_ != 0) {
        output.writeUInt32(5, cutsceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cutsceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, cutsceneId_);
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
      if (!(obj instanceof org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify other = (org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify) obj;

      if (getCutsceneId()
          != other.getCutsceneId()) return false;
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
      hash = (37 * hash) + CUTSCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCutsceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify prototype) {
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
     *   CMD_ID = 284;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CutSceneFinishNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CutSceneFinishNotify)
        org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify.class, org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify.Builder.class);
      }

      // Construct using org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify.newBuilder()
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
        cutsceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.CutSceneFinishNotifyOuterClass.internal_static_CutSceneFinishNotify_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify getDefaultInstanceForType() {
        return org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify build() {
        org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify buildPartial() {
        org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify result = new org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify(this);
        result.cutsceneId_ = cutsceneId_;
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
        if (other instanceof org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify) {
          return mergeFrom((org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify other) {
        if (other == org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify.getDefaultInstance()) return this;
        if (other.getCutsceneId() != 0) {
          setCutsceneId(other.getCutsceneId());
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
        org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cutsceneId_ ;
      /**
       * <code>uint32 cutscene_id = 5;</code>
       * @return The cutsceneId.
       */
      @java.lang.Override
      public int getCutsceneId() {
        return cutsceneId_;
      }
      /**
       * <code>uint32 cutscene_id = 5;</code>
       * @param value The cutsceneId to set.
       * @return This builder for chaining.
       */
      public Builder setCutsceneId(int value) {
        
        cutsceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cutscene_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCutsceneId() {
        
        cutsceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CutSceneFinishNotify)
    }

    // @@protoc_insertion_point(class_scope:CutSceneFinishNotify)
    private static final org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify();
    }

    public static org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CutSceneFinishNotify>
        PARSER = new com.google.protobuf.AbstractParser<CutSceneFinishNotify>() {
      @java.lang.Override
      public CutSceneFinishNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CutSceneFinishNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CutSceneFinishNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CutSceneFinishNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.CutSceneFinishNotifyOuterClass.CutSceneFinishNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CutSceneFinishNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CutSceneFinishNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CutSceneFinishNotify.proto\"+\n\024CutScene" +
      "FinishNotify\022\023\n\013cutscene_id\030\005 \001(\rB\026\n\024org" +
      ".sorapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CutSceneFinishNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CutSceneFinishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CutSceneFinishNotify_descriptor,
        new java.lang.String[] { "CutsceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
