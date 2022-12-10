// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShortAbilityHashPair.proto

package org.sorapointa.proto;

public final class ShortAbilityHashPairOuterClass {
  private ShortAbilityHashPairOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShortAbilityHashPairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShortAbilityHashPair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>sfixed32 ability_name_hash = 6;</code>
     * @return The abilityNameHash.
     */
    int getAbilityNameHash();

    /**
     * <code>sfixed32 ability_config_hash = 15;</code>
     * @return The abilityConfigHash.
     */
    int getAbilityConfigHash();
  }
  /**
   * Protobuf type {@code ShortAbilityHashPair}
   */
  public static final class ShortAbilityHashPair extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShortAbilityHashPair)
      ShortAbilityHashPairOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShortAbilityHashPair.newBuilder() to construct.
    private ShortAbilityHashPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShortAbilityHashPair() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShortAbilityHashPair();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShortAbilityHashPair(
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
            case 53: {

              abilityNameHash_ = input.readSFixed32();
              break;
            }
            case 125: {

              abilityConfigHash_ = input.readSFixed32();
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
      return org.sorapointa.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.class, org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.Builder.class);
    }

    public static final int ABILITY_NAME_HASH_FIELD_NUMBER = 6;
    private int abilityNameHash_;
    /**
     * <code>sfixed32 ability_name_hash = 6;</code>
     * @return The abilityNameHash.
     */
    @java.lang.Override
    public int getAbilityNameHash() {
      return abilityNameHash_;
    }

    public static final int ABILITY_CONFIG_HASH_FIELD_NUMBER = 15;
    private int abilityConfigHash_;
    /**
     * <code>sfixed32 ability_config_hash = 15;</code>
     * @return The abilityConfigHash.
     */
    @java.lang.Override
    public int getAbilityConfigHash() {
      return abilityConfigHash_;
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
      if (abilityNameHash_ != 0) {
        output.writeSFixed32(6, abilityNameHash_);
      }
      if (abilityConfigHash_ != 0) {
        output.writeSFixed32(15, abilityConfigHash_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (abilityNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed32Size(6, abilityNameHash_);
      }
      if (abilityConfigHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed32Size(15, abilityConfigHash_);
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
      if (!(obj instanceof org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair other = (org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair) obj;

      if (getAbilityNameHash()
          != other.getAbilityNameHash()) return false;
      if (getAbilityConfigHash()
          != other.getAbilityConfigHash()) return false;
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
      hash = (37 * hash) + ABILITY_NAME_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityNameHash();
      hash = (37 * hash) + ABILITY_CONFIG_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityConfigHash();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair prototype) {
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
     * Protobuf type {@code ShortAbilityHashPair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShortAbilityHashPair)
        org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.class, org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.Builder.class);
      }

      // Construct using org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.newBuilder()
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
        abilityNameHash_ = 0;

        abilityConfigHash_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair getDefaultInstanceForType() {
        return org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair build() {
        org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair buildPartial() {
        org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair result = new org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair(this);
        result.abilityNameHash_ = abilityNameHash_;
        result.abilityConfigHash_ = abilityConfigHash_;
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
        if (other instanceof org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair) {
          return mergeFrom((org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair other) {
        if (other == org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.getDefaultInstance()) return this;
        if (other.getAbilityNameHash() != 0) {
          setAbilityNameHash(other.getAbilityNameHash());
        }
        if (other.getAbilityConfigHash() != 0) {
          setAbilityConfigHash(other.getAbilityConfigHash());
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
        org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int abilityNameHash_ ;
      /**
       * <code>sfixed32 ability_name_hash = 6;</code>
       * @return The abilityNameHash.
       */
      @java.lang.Override
      public int getAbilityNameHash() {
        return abilityNameHash_;
      }
      /**
       * <code>sfixed32 ability_name_hash = 6;</code>
       * @param value The abilityNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityNameHash(int value) {
        
        abilityNameHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>sfixed32 ability_name_hash = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityNameHash() {
        
        abilityNameHash_ = 0;
        onChanged();
        return this;
      }

      private int abilityConfigHash_ ;
      /**
       * <code>sfixed32 ability_config_hash = 15;</code>
       * @return The abilityConfigHash.
       */
      @java.lang.Override
      public int getAbilityConfigHash() {
        return abilityConfigHash_;
      }
      /**
       * <code>sfixed32 ability_config_hash = 15;</code>
       * @param value The abilityConfigHash to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityConfigHash(int value) {
        
        abilityConfigHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>sfixed32 ability_config_hash = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityConfigHash() {
        
        abilityConfigHash_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ShortAbilityHashPair)
    }

    // @@protoc_insertion_point(class_scope:ShortAbilityHashPair)
    private static final org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair();
    }

    public static org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShortAbilityHashPair>
        PARSER = new com.google.protobuf.AbstractParser<ShortAbilityHashPair>() {
      @java.lang.Override
      public ShortAbilityHashPair parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShortAbilityHashPair(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShortAbilityHashPair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShortAbilityHashPair> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShortAbilityHashPair_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShortAbilityHashPair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ShortAbilityHashPair.proto\"N\n\024ShortAbi" +
      "lityHashPair\022\031\n\021ability_name_hash\030\006 \001(\017\022" +
      "\033\n\023ability_config_hash\030\017 \001(\017B\026\n\024org.sora" +
      "pointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShortAbilityHashPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShortAbilityHashPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShortAbilityHashPair_descriptor,
        new java.lang.String[] { "AbilityNameHash", "AbilityConfigHash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
