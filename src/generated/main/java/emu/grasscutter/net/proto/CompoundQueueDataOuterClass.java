// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompoundQueueData.proto

package emu.grasscutter.net.proto;

public final class CompoundQueueDataOuterClass {
  private CompoundQueueDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CompoundQueueDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CompoundQueueData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_NCEHJAAHOKM = 5;</code>
     * @return The unk3300NCEHJAAHOKM.
     */
    int getUnk3300NCEHJAAHOKM();

    /**
     * <code>uint32 Unk3300_COMIGCMIPLE = 14;</code>
     * @return The unk3300COMIGCMIPLE.
     */
    int getUnk3300COMIGCMIPLE();

    /**
     * <code>uint32 Unk3300_JHJNOPCPPAD = 10;</code>
     * @return The unk3300JHJNOPCPPAD.
     */
    int getUnk3300JHJNOPCPPAD();

    /**
     * <code>uint32 compound_id = 12;</code>
     * @return The compoundId.
     */
    int getCompoundId();
  }
  /**
   * Protobuf type {@code CompoundQueueData}
   */
  public static final class CompoundQueueData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CompoundQueueData)
      CompoundQueueDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CompoundQueueData.newBuilder() to construct.
    private CompoundQueueData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CompoundQueueData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CompoundQueueData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CompoundQueueData(
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

              unk3300NCEHJAAHOKM_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3300JHJNOPCPPAD_ = input.readUInt32();
              break;
            }
            case 96: {

              compoundId_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300COMIGCMIPLE_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.class, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder.class);
    }

    public static final int UNK3300_NCEHJAAHOKM_FIELD_NUMBER = 5;
    private int unk3300NCEHJAAHOKM_;
    /**
     * <code>uint32 Unk3300_NCEHJAAHOKM = 5;</code>
     * @return The unk3300NCEHJAAHOKM.
     */
    @java.lang.Override
    public int getUnk3300NCEHJAAHOKM() {
      return unk3300NCEHJAAHOKM_;
    }

    public static final int UNK3300_COMIGCMIPLE_FIELD_NUMBER = 14;
    private int unk3300COMIGCMIPLE_;
    /**
     * <code>uint32 Unk3300_COMIGCMIPLE = 14;</code>
     * @return The unk3300COMIGCMIPLE.
     */
    @java.lang.Override
    public int getUnk3300COMIGCMIPLE() {
      return unk3300COMIGCMIPLE_;
    }

    public static final int UNK3300_JHJNOPCPPAD_FIELD_NUMBER = 10;
    private int unk3300JHJNOPCPPAD_;
    /**
     * <code>uint32 Unk3300_JHJNOPCPPAD = 10;</code>
     * @return The unk3300JHJNOPCPPAD.
     */
    @java.lang.Override
    public int getUnk3300JHJNOPCPPAD() {
      return unk3300JHJNOPCPPAD_;
    }

    public static final int COMPOUND_ID_FIELD_NUMBER = 12;
    private int compoundId_;
    /**
     * <code>uint32 compound_id = 12;</code>
     * @return The compoundId.
     */
    @java.lang.Override
    public int getCompoundId() {
      return compoundId_;
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
      if (unk3300NCEHJAAHOKM_ != 0) {
        output.writeUInt32(5, unk3300NCEHJAAHOKM_);
      }
      if (unk3300JHJNOPCPPAD_ != 0) {
        output.writeUInt32(10, unk3300JHJNOPCPPAD_);
      }
      if (compoundId_ != 0) {
        output.writeUInt32(12, compoundId_);
      }
      if (unk3300COMIGCMIPLE_ != 0) {
        output.writeUInt32(14, unk3300COMIGCMIPLE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300NCEHJAAHOKM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300NCEHJAAHOKM_);
      }
      if (unk3300JHJNOPCPPAD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300JHJNOPCPPAD_);
      }
      if (compoundId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, compoundId_);
      }
      if (unk3300COMIGCMIPLE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3300COMIGCMIPLE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData other = (emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData) obj;

      if (getUnk3300NCEHJAAHOKM()
          != other.getUnk3300NCEHJAAHOKM()) return false;
      if (getUnk3300COMIGCMIPLE()
          != other.getUnk3300COMIGCMIPLE()) return false;
      if (getUnk3300JHJNOPCPPAD()
          != other.getUnk3300JHJNOPCPPAD()) return false;
      if (getCompoundId()
          != other.getCompoundId()) return false;
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
      hash = (37 * hash) + UNK3300_NCEHJAAHOKM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NCEHJAAHOKM();
      hash = (37 * hash) + UNK3300_COMIGCMIPLE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300COMIGCMIPLE();
      hash = (37 * hash) + UNK3300_JHJNOPCPPAD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JHJNOPCPPAD();
      hash = (37 * hash) + COMPOUND_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCompoundId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData prototype) {
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
     * Protobuf type {@code CompoundQueueData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CompoundQueueData)
        emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.class, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.newBuilder()
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
        unk3300NCEHJAAHOKM_ = 0;

        unk3300COMIGCMIPLE_ = 0;

        unk3300JHJNOPCPPAD_ = 0;

        compoundId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData build() {
        emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData buildPartial() {
        emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData result = new emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData(this);
        result.unk3300NCEHJAAHOKM_ = unk3300NCEHJAAHOKM_;
        result.unk3300COMIGCMIPLE_ = unk3300COMIGCMIPLE_;
        result.unk3300JHJNOPCPPAD_ = unk3300JHJNOPCPPAD_;
        result.compoundId_ = compoundId_;
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
        if (other instanceof emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData) {
          return mergeFrom((emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData other) {
        if (other == emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance()) return this;
        if (other.getUnk3300NCEHJAAHOKM() != 0) {
          setUnk3300NCEHJAAHOKM(other.getUnk3300NCEHJAAHOKM());
        }
        if (other.getUnk3300COMIGCMIPLE() != 0) {
          setUnk3300COMIGCMIPLE(other.getUnk3300COMIGCMIPLE());
        }
        if (other.getUnk3300JHJNOPCPPAD() != 0) {
          setUnk3300JHJNOPCPPAD(other.getUnk3300JHJNOPCPPAD());
        }
        if (other.getCompoundId() != 0) {
          setCompoundId(other.getCompoundId());
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
        emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300NCEHJAAHOKM_ ;
      /**
       * <code>uint32 Unk3300_NCEHJAAHOKM = 5;</code>
       * @return The unk3300NCEHJAAHOKM.
       */
      @java.lang.Override
      public int getUnk3300NCEHJAAHOKM() {
        return unk3300NCEHJAAHOKM_;
      }
      /**
       * <code>uint32 Unk3300_NCEHJAAHOKM = 5;</code>
       * @param value The unk3300NCEHJAAHOKM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NCEHJAAHOKM(int value) {
        
        unk3300NCEHJAAHOKM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_NCEHJAAHOKM = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NCEHJAAHOKM() {
        
        unk3300NCEHJAAHOKM_ = 0;
        onChanged();
        return this;
      }

      private int unk3300COMIGCMIPLE_ ;
      /**
       * <code>uint32 Unk3300_COMIGCMIPLE = 14;</code>
       * @return The unk3300COMIGCMIPLE.
       */
      @java.lang.Override
      public int getUnk3300COMIGCMIPLE() {
        return unk3300COMIGCMIPLE_;
      }
      /**
       * <code>uint32 Unk3300_COMIGCMIPLE = 14;</code>
       * @param value The unk3300COMIGCMIPLE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300COMIGCMIPLE(int value) {
        
        unk3300COMIGCMIPLE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_COMIGCMIPLE = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300COMIGCMIPLE() {
        
        unk3300COMIGCMIPLE_ = 0;
        onChanged();
        return this;
      }

      private int unk3300JHJNOPCPPAD_ ;
      /**
       * <code>uint32 Unk3300_JHJNOPCPPAD = 10;</code>
       * @return The unk3300JHJNOPCPPAD.
       */
      @java.lang.Override
      public int getUnk3300JHJNOPCPPAD() {
        return unk3300JHJNOPCPPAD_;
      }
      /**
       * <code>uint32 Unk3300_JHJNOPCPPAD = 10;</code>
       * @param value The unk3300JHJNOPCPPAD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JHJNOPCPPAD(int value) {
        
        unk3300JHJNOPCPPAD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JHJNOPCPPAD = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JHJNOPCPPAD() {
        
        unk3300JHJNOPCPPAD_ = 0;
        onChanged();
        return this;
      }

      private int compoundId_ ;
      /**
       * <code>uint32 compound_id = 12;</code>
       * @return The compoundId.
       */
      @java.lang.Override
      public int getCompoundId() {
        return compoundId_;
      }
      /**
       * <code>uint32 compound_id = 12;</code>
       * @param value The compoundId to set.
       * @return This builder for chaining.
       */
      public Builder setCompoundId(int value) {
        
        compoundId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 compound_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCompoundId() {
        
        compoundId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CompoundQueueData)
    }

    // @@protoc_insertion_point(class_scope:CompoundQueueData)
    private static final emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData();
    }

    public static emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CompoundQueueData>
        PARSER = new com.google.protobuf.AbstractParser<CompoundQueueData>() {
      @java.lang.Override
      public CompoundQueueData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CompoundQueueData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CompoundQueueData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CompoundQueueData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CompoundQueueData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CompoundQueueData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CompoundQueueData.proto\"\177\n\021CompoundQue" +
      "ueData\022\033\n\023Unk3300_NCEHJAAHOKM\030\005 \001(\r\022\033\n\023U" +
      "nk3300_COMIGCMIPLE\030\016 \001(\r\022\033\n\023Unk3300_JHJN" +
      "OPCPPAD\030\n \001(\r\022\023\n\013compound_id\030\014 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CompoundQueueData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CompoundQueueData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CompoundQueueData_descriptor,
        new java.lang.String[] { "Unk3300NCEHJAAHOKM", "Unk3300COMIGCMIPLE", "Unk3300JHJNOPCPPAD", "CompoundId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
