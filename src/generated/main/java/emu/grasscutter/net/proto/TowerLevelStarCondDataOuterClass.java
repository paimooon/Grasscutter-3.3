// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerLevelStarCondData.proto

package org.sorapointa.proto;

public final class TowerLevelStarCondDataOuterClass {
  private TowerLevelStarCondDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerLevelStarCondDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerLevelStarCondData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3300_KBCFDFOAJMM = 14;</code>
     * @return The unk3300KBCFDFOAJMM.
     */
    boolean getUnk3300KBCFDFOAJMM();

    /**
     * <code>bool Unk3300_CPBCNACKAAK = 5;</code>
     * @return The unk3300CPBCNACKAAK.
     */
    boolean getUnk3300CPBCNACKAAK();

    /**
     * <code>uint32 Unk3300_JGOLBFMJBCL = 11;</code>
     * @return The unk3300JGOLBFMJBCL.
     */
    int getUnk3300JGOLBFMJBCL();

    /**
     * <code>uint32 Unk3300_MGHNDJAACME = 12;</code>
     * @return The unk3300MGHNDJAACME.
     */
    int getUnk3300MGHNDJAACME();
  }
  /**
   * Protobuf type {@code TowerLevelStarCondData}
   */
  public static final class TowerLevelStarCondData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerLevelStarCondData)
      TowerLevelStarCondDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerLevelStarCondData.newBuilder() to construct.
    private TowerLevelStarCondData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerLevelStarCondData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerLevelStarCondData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerLevelStarCondData(
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

              unk3300CPBCNACKAAK_ = input.readBool();
              break;
            }
            case 88: {

              unk3300JGOLBFMJBCL_ = input.readUInt32();
              break;
            }
            case 96: {

              unk3300MGHNDJAACME_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300KBCFDFOAJMM_ = input.readBool();
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
      return org.sorapointa.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
    }

    public static final int UNK3300_KBCFDFOAJMM_FIELD_NUMBER = 14;
    private boolean unk3300KBCFDFOAJMM_;
    /**
     * <code>bool Unk3300_KBCFDFOAJMM = 14;</code>
     * @return The unk3300KBCFDFOAJMM.
     */
    @java.lang.Override
    public boolean getUnk3300KBCFDFOAJMM() {
      return unk3300KBCFDFOAJMM_;
    }

    public static final int UNK3300_CPBCNACKAAK_FIELD_NUMBER = 5;
    private boolean unk3300CPBCNACKAAK_;
    /**
     * <code>bool Unk3300_CPBCNACKAAK = 5;</code>
     * @return The unk3300CPBCNACKAAK.
     */
    @java.lang.Override
    public boolean getUnk3300CPBCNACKAAK() {
      return unk3300CPBCNACKAAK_;
    }

    public static final int UNK3300_JGOLBFMJBCL_FIELD_NUMBER = 11;
    private int unk3300JGOLBFMJBCL_;
    /**
     * <code>uint32 Unk3300_JGOLBFMJBCL = 11;</code>
     * @return The unk3300JGOLBFMJBCL.
     */
    @java.lang.Override
    public int getUnk3300JGOLBFMJBCL() {
      return unk3300JGOLBFMJBCL_;
    }

    public static final int UNK3300_MGHNDJAACME_FIELD_NUMBER = 12;
    private int unk3300MGHNDJAACME_;
    /**
     * <code>uint32 Unk3300_MGHNDJAACME = 12;</code>
     * @return The unk3300MGHNDJAACME.
     */
    @java.lang.Override
    public int getUnk3300MGHNDJAACME() {
      return unk3300MGHNDJAACME_;
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
      if (unk3300CPBCNACKAAK_ != false) {
        output.writeBool(5, unk3300CPBCNACKAAK_);
      }
      if (unk3300JGOLBFMJBCL_ != 0) {
        output.writeUInt32(11, unk3300JGOLBFMJBCL_);
      }
      if (unk3300MGHNDJAACME_ != 0) {
        output.writeUInt32(12, unk3300MGHNDJAACME_);
      }
      if (unk3300KBCFDFOAJMM_ != false) {
        output.writeBool(14, unk3300KBCFDFOAJMM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300CPBCNACKAAK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, unk3300CPBCNACKAAK_);
      }
      if (unk3300JGOLBFMJBCL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300JGOLBFMJBCL_);
      }
      if (unk3300MGHNDJAACME_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3300MGHNDJAACME_);
      }
      if (unk3300KBCFDFOAJMM_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, unk3300KBCFDFOAJMM_);
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
      if (!(obj instanceof org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other = (org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) obj;

      if (getUnk3300KBCFDFOAJMM()
          != other.getUnk3300KBCFDFOAJMM()) return false;
      if (getUnk3300CPBCNACKAAK()
          != other.getUnk3300CPBCNACKAAK()) return false;
      if (getUnk3300JGOLBFMJBCL()
          != other.getUnk3300JGOLBFMJBCL()) return false;
      if (getUnk3300MGHNDJAACME()
          != other.getUnk3300MGHNDJAACME()) return false;
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
      hash = (37 * hash) + UNK3300_KBCFDFOAJMM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300KBCFDFOAJMM());
      hash = (37 * hash) + UNK3300_CPBCNACKAAK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300CPBCNACKAAK());
      hash = (37 * hash) + UNK3300_JGOLBFMJBCL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JGOLBFMJBCL();
      hash = (37 * hash) + UNK3300_MGHNDJAACME_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MGHNDJAACME();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData prototype) {
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
     * Protobuf type {@code TowerLevelStarCondData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerLevelStarCondData)
        org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
      }

      // Construct using org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.newBuilder()
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
        unk3300KBCFDFOAJMM_ = false;

        unk3300CPBCNACKAAK_ = false;

        unk3300JGOLBFMJBCL_ = 0;

        unk3300MGHNDJAACME_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
        return org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData build() {
        org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData buildPartial() {
        org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = new org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData(this);
        result.unk3300KBCFDFOAJMM_ = unk3300KBCFDFOAJMM_;
        result.unk3300CPBCNACKAAK_ = unk3300CPBCNACKAAK_;
        result.unk3300JGOLBFMJBCL_ = unk3300JGOLBFMJBCL_;
        result.unk3300MGHNDJAACME_ = unk3300MGHNDJAACME_;
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
        if (other instanceof org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) {
          return mergeFrom((org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other) {
        if (other == org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance()) return this;
        if (other.getUnk3300KBCFDFOAJMM() != false) {
          setUnk3300KBCFDFOAJMM(other.getUnk3300KBCFDFOAJMM());
        }
        if (other.getUnk3300CPBCNACKAAK() != false) {
          setUnk3300CPBCNACKAAK(other.getUnk3300CPBCNACKAAK());
        }
        if (other.getUnk3300JGOLBFMJBCL() != 0) {
          setUnk3300JGOLBFMJBCL(other.getUnk3300JGOLBFMJBCL());
        }
        if (other.getUnk3300MGHNDJAACME() != 0) {
          setUnk3300MGHNDJAACME(other.getUnk3300MGHNDJAACME());
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
        org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3300KBCFDFOAJMM_ ;
      /**
       * <code>bool Unk3300_KBCFDFOAJMM = 14;</code>
       * @return The unk3300KBCFDFOAJMM.
       */
      @java.lang.Override
      public boolean getUnk3300KBCFDFOAJMM() {
        return unk3300KBCFDFOAJMM_;
      }
      /**
       * <code>bool Unk3300_KBCFDFOAJMM = 14;</code>
       * @param value The unk3300KBCFDFOAJMM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KBCFDFOAJMM(boolean value) {
        
        unk3300KBCFDFOAJMM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_KBCFDFOAJMM = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KBCFDFOAJMM() {
        
        unk3300KBCFDFOAJMM_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300CPBCNACKAAK_ ;
      /**
       * <code>bool Unk3300_CPBCNACKAAK = 5;</code>
       * @return The unk3300CPBCNACKAAK.
       */
      @java.lang.Override
      public boolean getUnk3300CPBCNACKAAK() {
        return unk3300CPBCNACKAAK_;
      }
      /**
       * <code>bool Unk3300_CPBCNACKAAK = 5;</code>
       * @param value The unk3300CPBCNACKAAK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300CPBCNACKAAK(boolean value) {
        
        unk3300CPBCNACKAAK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_CPBCNACKAAK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300CPBCNACKAAK() {
        
        unk3300CPBCNACKAAK_ = false;
        onChanged();
        return this;
      }

      private int unk3300JGOLBFMJBCL_ ;
      /**
       * <code>uint32 Unk3300_JGOLBFMJBCL = 11;</code>
       * @return The unk3300JGOLBFMJBCL.
       */
      @java.lang.Override
      public int getUnk3300JGOLBFMJBCL() {
        return unk3300JGOLBFMJBCL_;
      }
      /**
       * <code>uint32 Unk3300_JGOLBFMJBCL = 11;</code>
       * @param value The unk3300JGOLBFMJBCL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JGOLBFMJBCL(int value) {
        
        unk3300JGOLBFMJBCL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JGOLBFMJBCL = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JGOLBFMJBCL() {
        
        unk3300JGOLBFMJBCL_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MGHNDJAACME_ ;
      /**
       * <code>uint32 Unk3300_MGHNDJAACME = 12;</code>
       * @return The unk3300MGHNDJAACME.
       */
      @java.lang.Override
      public int getUnk3300MGHNDJAACME() {
        return unk3300MGHNDJAACME_;
      }
      /**
       * <code>uint32 Unk3300_MGHNDJAACME = 12;</code>
       * @param value The unk3300MGHNDJAACME to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MGHNDJAACME(int value) {
        
        unk3300MGHNDJAACME_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MGHNDJAACME = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MGHNDJAACME() {
        
        unk3300MGHNDJAACME_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerLevelStarCondData)
    }

    // @@protoc_insertion_point(class_scope:TowerLevelStarCondData)
    private static final org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData();
    }

    public static org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerLevelStarCondData>
        PARSER = new com.google.protobuf.AbstractParser<TowerLevelStarCondData>() {
      @java.lang.Override
      public TowerLevelStarCondData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerLevelStarCondData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerLevelStarCondData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerLevelStarCondData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerLevelStarCondData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerLevelStarCondData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034TowerLevelStarCondData.proto\"\214\001\n\026Tower" +
      "LevelStarCondData\022\033\n\023Unk3300_KBCFDFOAJMM" +
      "\030\016 \001(\010\022\033\n\023Unk3300_CPBCNACKAAK\030\005 \001(\010\022\033\n\023U" +
      "nk3300_JGOLBFMJBCL\030\013 \001(\r\022\033\n\023Unk3300_MGHN" +
      "DJAACME\030\014 \001(\rB\026\n\024org.sorapointa.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerLevelStarCondData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerLevelStarCondData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerLevelStarCondData_descriptor,
        new java.lang.String[] { "Unk3300KBCFDFOAJMM", "Unk3300CPBCNACKAAK", "Unk3300JGOLBFMJBCL", "Unk3300MGHNDJAACME", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
