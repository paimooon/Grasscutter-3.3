// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CreateVehicleRsp.proto

package org.sorapointa.proto;

public final class CreateVehicleRspOuterClass {
  private CreateVehicleRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CreateVehicleRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CreateVehicleRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 vehicle_id = 8;</code>
     * @return The vehicleId.
     */
    int getVehicleId();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 817;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CreateVehicleRsp}
   */
  public static final class CreateVehicleRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CreateVehicleRsp)
      CreateVehicleRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CreateVehicleRsp.newBuilder() to construct.
    private CreateVehicleRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CreateVehicleRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CreateVehicleRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CreateVehicleRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 40: {

              entityId_ = input.readUInt32();
              break;
            }
            case 64: {

              vehicleId_ = input.readUInt32();
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
      return org.sorapointa.proto.CreateVehicleRspOuterClass.internal_static_CreateVehicleRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.CreateVehicleRspOuterClass.internal_static_CreateVehicleRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp.class, org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp.Builder.class);
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

    public static final int VEHICLE_ID_FIELD_NUMBER = 8;
    private int vehicleId_;
    /**
     * <code>uint32 vehicle_id = 8;</code>
     * @return The vehicleId.
     */
    @java.lang.Override
    public int getVehicleId() {
      return vehicleId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      if (vehicleId_ != 0) {
        output.writeUInt32(8, vehicleId_);
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
          .computeInt32Size(2, retcode_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (vehicleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, vehicleId_);
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
      if (!(obj instanceof org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp other = (org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getVehicleId()
          != other.getVehicleId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + VEHICLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVehicleId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp prototype) {
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
     *   CMD_ID = 817;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CreateVehicleRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CreateVehicleRsp)
        org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.CreateVehicleRspOuterClass.internal_static_CreateVehicleRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.CreateVehicleRspOuterClass.internal_static_CreateVehicleRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp.class, org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp.Builder.class);
      }

      // Construct using org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp.newBuilder()
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
        entityId_ = 0;

        vehicleId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.CreateVehicleRspOuterClass.internal_static_CreateVehicleRsp_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp getDefaultInstanceForType() {
        return org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp build() {
        org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp buildPartial() {
        org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp result = new org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp(this);
        result.entityId_ = entityId_;
        result.vehicleId_ = vehicleId_;
        result.retcode_ = retcode_;
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
        if (other instanceof org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp) {
          return mergeFrom((org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp other) {
        if (other == org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getVehicleId() != 0) {
          setVehicleId(other.getVehicleId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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

      private int vehicleId_ ;
      /**
       * <code>uint32 vehicle_id = 8;</code>
       * @return The vehicleId.
       */
      @java.lang.Override
      public int getVehicleId() {
        return vehicleId_;
      }
      /**
       * <code>uint32 vehicle_id = 8;</code>
       * @param value The vehicleId to set.
       * @return This builder for chaining.
       */
      public Builder setVehicleId(int value) {
        
        vehicleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 vehicle_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearVehicleId() {
        
        vehicleId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CreateVehicleRsp)
    }

    // @@protoc_insertion_point(class_scope:CreateVehicleRsp)
    private static final org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp();
    }

    public static org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CreateVehicleRsp>
        PARSER = new com.google.protobuf.AbstractParser<CreateVehicleRsp>() {
      @java.lang.Override
      public CreateVehicleRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateVehicleRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CreateVehicleRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CreateVehicleRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.CreateVehicleRspOuterClass.CreateVehicleRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateVehicleRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateVehicleRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026CreateVehicleRsp.proto\"J\n\020CreateVehicl" +
      "eRsp\022\021\n\tentity_id\030\005 \001(\r\022\022\n\nvehicle_id\030\010 " +
      "\001(\r\022\017\n\007retcode\030\002 \001(\005B\026\n\024org.sorapointa.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CreateVehicleRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CreateVehicleRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateVehicleRsp_descriptor,
        new java.lang.String[] { "EntityId", "VehicleId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
