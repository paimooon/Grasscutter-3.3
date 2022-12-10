// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeFurnitureData.proto

package org.sorapointa.proto;

public final class HomeFurnitureDataOuterClass {
  private HomeFurnitureDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeFurnitureDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeFurnitureData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 furniture_id = 8;</code>
     * @return The furnitureId.
     */
    int getFurnitureId();

    /**
     * <code>int32 parent_furniture_index = 15;</code>
     * @return The parentFurnitureIndex.
     */
    int getParentFurnitureIndex();

    /**
     * <code>uint32 guid = 12;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>.Vector spawn_rot = 6;</code>
     * @return Whether the spawnRot field is set.
     */
    boolean hasSpawnRot();
    /**
     * <code>.Vector spawn_rot = 6;</code>
     * @return The spawnRot.
     */
    org.sorapointa.proto.VectorOuterClass.Vector getSpawnRot();
    /**
     * <code>.Vector spawn_rot = 6;</code>
     */
    org.sorapointa.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder();

    /**
     * <code>.Vector spawn_pos = 2;</code>
     * @return Whether the spawnPos field is set.
     */
    boolean hasSpawnPos();
    /**
     * <code>.Vector spawn_pos = 2;</code>
     * @return The spawnPos.
     */
    org.sorapointa.proto.VectorOuterClass.Vector getSpawnPos();
    /**
     * <code>.Vector spawn_pos = 2;</code>
     */
    org.sorapointa.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();

    /**
     * <code>uint32 version = 11;</code>
     * @return The version.
     */
    int getVersion();
  }
  /**
   * Protobuf type {@code HomeFurnitureData}
   */
  public static final class HomeFurnitureData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeFurnitureData)
      HomeFurnitureDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeFurnitureData.newBuilder() to construct.
    private HomeFurnitureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeFurnitureData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeFurnitureData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeFurnitureData(
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
            case 18: {
              org.sorapointa.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (spawnPos_ != null) {
                subBuilder = spawnPos_.toBuilder();
              }
              spawnPos_ = input.readMessage(org.sorapointa.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spawnPos_);
                spawnPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 50: {
              org.sorapointa.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (spawnRot_ != null) {
                subBuilder = spawnRot_.toBuilder();
              }
              spawnRot_ = input.readMessage(org.sorapointa.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spawnRot_);
                spawnRot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 64: {

              furnitureId_ = input.readUInt32();
              break;
            }
            case 88: {

              version_ = input.readUInt32();
              break;
            }
            case 96: {

              guid_ = input.readUInt32();
              break;
            }
            case 120: {

              parentFurnitureIndex_ = input.readInt32();
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
      return org.sorapointa.proto.HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.class, org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder.class);
    }

    public static final int FURNITURE_ID_FIELD_NUMBER = 8;
    private int furnitureId_;
    /**
     * <code>uint32 furniture_id = 8;</code>
     * @return The furnitureId.
     */
    @java.lang.Override
    public int getFurnitureId() {
      return furnitureId_;
    }

    public static final int PARENT_FURNITURE_INDEX_FIELD_NUMBER = 15;
    private int parentFurnitureIndex_;
    /**
     * <code>int32 parent_furniture_index = 15;</code>
     * @return The parentFurnitureIndex.
     */
    @java.lang.Override
    public int getParentFurnitureIndex() {
      return parentFurnitureIndex_;
    }

    public static final int GUID_FIELD_NUMBER = 12;
    private int guid_;
    /**
     * <code>uint32 guid = 12;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int SPAWN_ROT_FIELD_NUMBER = 6;
    private org.sorapointa.proto.VectorOuterClass.Vector spawnRot_;
    /**
     * <code>.Vector spawn_rot = 6;</code>
     * @return Whether the spawnRot field is set.
     */
    @java.lang.Override
    public boolean hasSpawnRot() {
      return spawnRot_ != null;
    }
    /**
     * <code>.Vector spawn_rot = 6;</code>
     * @return The spawnRot.
     */
    @java.lang.Override
    public org.sorapointa.proto.VectorOuterClass.Vector getSpawnRot() {
      return spawnRot_ == null ? org.sorapointa.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
    }
    /**
     * <code>.Vector spawn_rot = 6;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
      return getSpawnRot();
    }

    public static final int SPAWN_POS_FIELD_NUMBER = 2;
    private org.sorapointa.proto.VectorOuterClass.Vector spawnPos_;
    /**
     * <code>.Vector spawn_pos = 2;</code>
     * @return Whether the spawnPos field is set.
     */
    @java.lang.Override
    public boolean hasSpawnPos() {
      return spawnPos_ != null;
    }
    /**
     * <code>.Vector spawn_pos = 2;</code>
     * @return The spawnPos.
     */
    @java.lang.Override
    public org.sorapointa.proto.VectorOuterClass.Vector getSpawnPos() {
      return spawnPos_ == null ? org.sorapointa.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
    }
    /**
     * <code>.Vector spawn_pos = 2;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
      return getSpawnPos();
    }

    public static final int VERSION_FIELD_NUMBER = 11;
    private int version_;
    /**
     * <code>uint32 version = 11;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
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
      if (spawnPos_ != null) {
        output.writeMessage(2, getSpawnPos());
      }
      if (spawnRot_ != null) {
        output.writeMessage(6, getSpawnRot());
      }
      if (furnitureId_ != 0) {
        output.writeUInt32(8, furnitureId_);
      }
      if (version_ != 0) {
        output.writeUInt32(11, version_);
      }
      if (guid_ != 0) {
        output.writeUInt32(12, guid_);
      }
      if (parentFurnitureIndex_ != 0) {
        output.writeInt32(15, parentFurnitureIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (spawnPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getSpawnPos());
      }
      if (spawnRot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getSpawnRot());
      }
      if (furnitureId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, furnitureId_);
      }
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, version_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, guid_);
      }
      if (parentFurnitureIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, parentFurnitureIndex_);
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
      if (!(obj instanceof org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData other = (org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData) obj;

      if (getFurnitureId()
          != other.getFurnitureId()) return false;
      if (getParentFurnitureIndex()
          != other.getParentFurnitureIndex()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (hasSpawnRot() != other.hasSpawnRot()) return false;
      if (hasSpawnRot()) {
        if (!getSpawnRot()
            .equals(other.getSpawnRot())) return false;
      }
      if (hasSpawnPos() != other.hasSpawnPos()) return false;
      if (hasSpawnPos()) {
        if (!getSpawnPos()
            .equals(other.getSpawnPos())) return false;
      }
      if (getVersion()
          != other.getVersion()) return false;
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
      hash = (37 * hash) + FURNITURE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFurnitureId();
      hash = (37 * hash) + PARENT_FURNITURE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getParentFurnitureIndex();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      if (hasSpawnRot()) {
        hash = (37 * hash) + SPAWN_ROT_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnRot().hashCode();
      }
      if (hasSpawnPos()) {
        hash = (37 * hash) + SPAWN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnPos().hashCode();
      }
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData prototype) {
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
     * Protobuf type {@code HomeFurnitureData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeFurnitureData)
        org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.class, org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder.class);
      }

      // Construct using org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.newBuilder()
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
        furnitureId_ = 0;

        parentFurnitureIndex_ = 0;

        guid_ = 0;

        if (spawnRotBuilder_ == null) {
          spawnRot_ = null;
        } else {
          spawnRot_ = null;
          spawnRotBuilder_ = null;
        }
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }
        version_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.HomeFurnitureDataOuterClass.internal_static_HomeFurnitureData_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getDefaultInstanceForType() {
        return org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData build() {
        org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData buildPartial() {
        org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData result = new org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData(this);
        result.furnitureId_ = furnitureId_;
        result.parentFurnitureIndex_ = parentFurnitureIndex_;
        result.guid_ = guid_;
        if (spawnRotBuilder_ == null) {
          result.spawnRot_ = spawnRot_;
        } else {
          result.spawnRot_ = spawnRotBuilder_.build();
        }
        if (spawnPosBuilder_ == null) {
          result.spawnPos_ = spawnPos_;
        } else {
          result.spawnPos_ = spawnPosBuilder_.build();
        }
        result.version_ = version_;
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
        if (other instanceof org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData) {
          return mergeFrom((org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData other) {
        if (other == org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance()) return this;
        if (other.getFurnitureId() != 0) {
          setFurnitureId(other.getFurnitureId());
        }
        if (other.getParentFurnitureIndex() != 0) {
          setParentFurnitureIndex(other.getParentFurnitureIndex());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (other.hasSpawnRot()) {
          mergeSpawnRot(other.getSpawnRot());
        }
        if (other.hasSpawnPos()) {
          mergeSpawnPos(other.getSpawnPos());
        }
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
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
        org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int furnitureId_ ;
      /**
       * <code>uint32 furniture_id = 8;</code>
       * @return The furnitureId.
       */
      @java.lang.Override
      public int getFurnitureId() {
        return furnitureId_;
      }
      /**
       * <code>uint32 furniture_id = 8;</code>
       * @param value The furnitureId to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureId(int value) {
        
        furnitureId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 furniture_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureId() {
        
        furnitureId_ = 0;
        onChanged();
        return this;
      }

      private int parentFurnitureIndex_ ;
      /**
       * <code>int32 parent_furniture_index = 15;</code>
       * @return The parentFurnitureIndex.
       */
      @java.lang.Override
      public int getParentFurnitureIndex() {
        return parentFurnitureIndex_;
      }
      /**
       * <code>int32 parent_furniture_index = 15;</code>
       * @param value The parentFurnitureIndex to set.
       * @return This builder for chaining.
       */
      public Builder setParentFurnitureIndex(int value) {
        
        parentFurnitureIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 parent_furniture_index = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentFurnitureIndex() {
        
        parentFurnitureIndex_ = 0;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 12;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 12;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }

      private org.sorapointa.proto.VectorOuterClass.Vector spawnRot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.VectorOuterClass.Vector, org.sorapointa.proto.VectorOuterClass.Vector.Builder, org.sorapointa.proto.VectorOuterClass.VectorOrBuilder> spawnRotBuilder_;
      /**
       * <code>.Vector spawn_rot = 6;</code>
       * @return Whether the spawnRot field is set.
       */
      public boolean hasSpawnRot() {
        return spawnRotBuilder_ != null || spawnRot_ != null;
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       * @return The spawnRot.
       */
      public org.sorapointa.proto.VectorOuterClass.Vector getSpawnRot() {
        if (spawnRotBuilder_ == null) {
          return spawnRot_ == null ? org.sorapointa.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
        } else {
          return spawnRotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       */
      public Builder setSpawnRot(org.sorapointa.proto.VectorOuterClass.Vector value) {
        if (spawnRotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnRot_ = value;
          onChanged();
        } else {
          spawnRotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       */
      public Builder setSpawnRot(
          org.sorapointa.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnRotBuilder_ == null) {
          spawnRot_ = builderForValue.build();
          onChanged();
        } else {
          spawnRotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       */
      public Builder mergeSpawnRot(org.sorapointa.proto.VectorOuterClass.Vector value) {
        if (spawnRotBuilder_ == null) {
          if (spawnRot_ != null) {
            spawnRot_ =
              org.sorapointa.proto.VectorOuterClass.Vector.newBuilder(spawnRot_).mergeFrom(value).buildPartial();
          } else {
            spawnRot_ = value;
          }
          onChanged();
        } else {
          spawnRotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       */
      public Builder clearSpawnRot() {
        if (spawnRotBuilder_ == null) {
          spawnRot_ = null;
          onChanged();
        } else {
          spawnRot_ = null;
          spawnRotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       */
      public org.sorapointa.proto.VectorOuterClass.Vector.Builder getSpawnRotBuilder() {
        
        onChanged();
        return getSpawnRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       */
      public org.sorapointa.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
        if (spawnRotBuilder_ != null) {
          return spawnRotBuilder_.getMessageOrBuilder();
        } else {
          return spawnRot_ == null ?
              org.sorapointa.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
        }
      }
      /**
       * <code>.Vector spawn_rot = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.VectorOuterClass.Vector, org.sorapointa.proto.VectorOuterClass.Vector.Builder, org.sorapointa.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnRotFieldBuilder() {
        if (spawnRotBuilder_ == null) {
          spawnRotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.sorapointa.proto.VectorOuterClass.Vector, org.sorapointa.proto.VectorOuterClass.Vector.Builder, org.sorapointa.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnRot(),
                  getParentForChildren(),
                  isClean());
          spawnRot_ = null;
        }
        return spawnRotBuilder_;
      }

      private org.sorapointa.proto.VectorOuterClass.Vector spawnPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.VectorOuterClass.Vector, org.sorapointa.proto.VectorOuterClass.Vector.Builder, org.sorapointa.proto.VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
      /**
       * <code>.Vector spawn_pos = 2;</code>
       * @return Whether the spawnPos field is set.
       */
      public boolean hasSpawnPos() {
        return spawnPosBuilder_ != null || spawnPos_ != null;
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       * @return The spawnPos.
       */
      public org.sorapointa.proto.VectorOuterClass.Vector getSpawnPos() {
        if (spawnPosBuilder_ == null) {
          return spawnPos_ == null ? org.sorapointa.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        } else {
          return spawnPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       */
      public Builder setSpawnPos(org.sorapointa.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnPos_ = value;
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       */
      public Builder setSpawnPos(
          org.sorapointa.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = builderForValue.build();
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       */
      public Builder mergeSpawnPos(org.sorapointa.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (spawnPos_ != null) {
            spawnPos_ =
              org.sorapointa.proto.VectorOuterClass.Vector.newBuilder(spawnPos_).mergeFrom(value).buildPartial();
          } else {
            spawnPos_ = value;
          }
          onChanged();
        } else {
          spawnPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       */
      public Builder clearSpawnPos() {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
          onChanged();
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       */
      public org.sorapointa.proto.VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
        
        onChanged();
        return getSpawnPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       */
      public org.sorapointa.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
        if (spawnPosBuilder_ != null) {
          return spawnPosBuilder_.getMessageOrBuilder();
        } else {
          return spawnPos_ == null ?
              org.sorapointa.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        }
      }
      /**
       * <code>.Vector spawn_pos = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.VectorOuterClass.Vector, org.sorapointa.proto.VectorOuterClass.Vector.Builder, org.sorapointa.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnPosFieldBuilder() {
        if (spawnPosBuilder_ == null) {
          spawnPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.sorapointa.proto.VectorOuterClass.Vector, org.sorapointa.proto.VectorOuterClass.Vector.Builder, org.sorapointa.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnPos(),
                  getParentForChildren(),
                  isClean());
          spawnPos_ = null;
        }
        return spawnPosBuilder_;
      }

      private int version_ ;
      /**
       * <code>uint32 version = 11;</code>
       * @return The version.
       */
      @java.lang.Override
      public int getVersion() {
        return version_;
      }
      /**
       * <code>uint32 version = 11;</code>
       * @param value The version to set.
       * @return This builder for chaining.
       */
      public Builder setVersion(int value) {
        
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 version = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersion() {
        
        version_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeFurnitureData)
    }

    // @@protoc_insertion_point(class_scope:HomeFurnitureData)
    private static final org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData();
    }

    public static org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeFurnitureData>
        PARSER = new com.google.protobuf.AbstractParser<HomeFurnitureData>() {
      @java.lang.Override
      public HomeFurnitureData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeFurnitureData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeFurnitureData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeFurnitureData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeFurnitureData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeFurnitureData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeFurnitureData.proto\032\014Vector.proto\"" +
      "\240\001\n\021HomeFurnitureData\022\024\n\014furniture_id\030\010 " +
      "\001(\r\022\036\n\026parent_furniture_index\030\017 \001(\005\022\014\n\004g" +
      "uid\030\014 \001(\r\022\032\n\tspawn_rot\030\006 \001(\0132\007.Vector\022\032\n" +
      "\tspawn_pos\030\002 \001(\0132\007.Vector\022\017\n\007version\030\013 \001" +
      "(\rB\026\n\024org.sorapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sorapointa.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HomeFurnitureData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeFurnitureData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeFurnitureData_descriptor,
        new java.lang.String[] { "FurnitureId", "ParentFurnitureIndex", "Guid", "SpawnRot", "SpawnPos", "Version", });
    org.sorapointa.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
