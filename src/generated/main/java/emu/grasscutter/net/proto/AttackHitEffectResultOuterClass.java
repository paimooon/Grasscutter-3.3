// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttackHitEffectResult.proto

package org.sorapointa.proto;

public final class AttackHitEffectResultOuterClass {
  private AttackHitEffectResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AttackHitEffectResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AttackHitEffectResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float Unk3300_DABGDGLAIKL = 13;</code>
     * @return The unk3300DABGDGLAIKL.
     */
    float getUnk3300DABGDGLAIKL();

    /**
     * <code>float Unk3300_JDEFHMKICPF = 10;</code>
     * @return The unk3300JDEFHMKICPF.
     */
    float getUnk3300JDEFHMKICPF();

    /**
     * <code>float Unk3300_ECHOFBLGIIO = 9;</code>
     * @return The unk3300ECHOFBLGIIO.
     */
    float getUnk3300ECHOFBLGIIO();

    /**
     * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
     * @return The unk3300LCKECJCKKJK.
     */
    int getUnk3300LCKECJCKKJK();

    /**
     * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
     * @return The unk3300KLNGDAMMFIF.
     */
    int getUnk3300KLNGDAMMFIF();

    /**
     * <code>float Unk3300_MNGCOAIGGAL = 3;</code>
     * @return The unk3300MNGCOAIGGAL.
     */
    float getUnk3300MNGCOAIGGAL();
  }
  /**
   * Protobuf type {@code AttackHitEffectResult}
   */
  public static final class AttackHitEffectResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AttackHitEffectResult)
      AttackHitEffectResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AttackHitEffectResult.newBuilder() to construct.
    private AttackHitEffectResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AttackHitEffectResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AttackHitEffectResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AttackHitEffectResult(
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

              unk3300KLNGDAMMFIF_ = input.readUInt32();
              break;
            }
            case 29: {

              unk3300MNGCOAIGGAL_ = input.readFloat();
              break;
            }
            case 64: {

              unk3300LCKECJCKKJK_ = input.readUInt32();
              break;
            }
            case 77: {

              unk3300ECHOFBLGIIO_ = input.readFloat();
              break;
            }
            case 85: {

              unk3300JDEFHMKICPF_ = input.readFloat();
              break;
            }
            case 109: {

              unk3300DABGDGLAIKL_ = input.readFloat();
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
      return org.sorapointa.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
    }

    public static final int UNK3300_DABGDGLAIKL_FIELD_NUMBER = 13;
    private float unk3300DABGDGLAIKL_;
    /**
     * <code>float Unk3300_DABGDGLAIKL = 13;</code>
     * @return The unk3300DABGDGLAIKL.
     */
    @java.lang.Override
    public float getUnk3300DABGDGLAIKL() {
      return unk3300DABGDGLAIKL_;
    }

    public static final int UNK3300_JDEFHMKICPF_FIELD_NUMBER = 10;
    private float unk3300JDEFHMKICPF_;
    /**
     * <code>float Unk3300_JDEFHMKICPF = 10;</code>
     * @return The unk3300JDEFHMKICPF.
     */
    @java.lang.Override
    public float getUnk3300JDEFHMKICPF() {
      return unk3300JDEFHMKICPF_;
    }

    public static final int UNK3300_ECHOFBLGIIO_FIELD_NUMBER = 9;
    private float unk3300ECHOFBLGIIO_;
    /**
     * <code>float Unk3300_ECHOFBLGIIO = 9;</code>
     * @return The unk3300ECHOFBLGIIO.
     */
    @java.lang.Override
    public float getUnk3300ECHOFBLGIIO() {
      return unk3300ECHOFBLGIIO_;
    }

    public static final int UNK3300_LCKECJCKKJK_FIELD_NUMBER = 8;
    private int unk3300LCKECJCKKJK_;
    /**
     * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
     * @return The unk3300LCKECJCKKJK.
     */
    @java.lang.Override
    public int getUnk3300LCKECJCKKJK() {
      return unk3300LCKECJCKKJK_;
    }

    public static final int UNK3300_KLNGDAMMFIF_FIELD_NUMBER = 1;
    private int unk3300KLNGDAMMFIF_;
    /**
     * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
     * @return The unk3300KLNGDAMMFIF.
     */
    @java.lang.Override
    public int getUnk3300KLNGDAMMFIF() {
      return unk3300KLNGDAMMFIF_;
    }

    public static final int UNK3300_MNGCOAIGGAL_FIELD_NUMBER = 3;
    private float unk3300MNGCOAIGGAL_;
    /**
     * <code>float Unk3300_MNGCOAIGGAL = 3;</code>
     * @return The unk3300MNGCOAIGGAL.
     */
    @java.lang.Override
    public float getUnk3300MNGCOAIGGAL() {
      return unk3300MNGCOAIGGAL_;
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
      if (unk3300KLNGDAMMFIF_ != 0) {
        output.writeUInt32(1, unk3300KLNGDAMMFIF_);
      }
      if (unk3300MNGCOAIGGAL_ != 0F) {
        output.writeFloat(3, unk3300MNGCOAIGGAL_);
      }
      if (unk3300LCKECJCKKJK_ != 0) {
        output.writeUInt32(8, unk3300LCKECJCKKJK_);
      }
      if (unk3300ECHOFBLGIIO_ != 0F) {
        output.writeFloat(9, unk3300ECHOFBLGIIO_);
      }
      if (unk3300JDEFHMKICPF_ != 0F) {
        output.writeFloat(10, unk3300JDEFHMKICPF_);
      }
      if (unk3300DABGDGLAIKL_ != 0F) {
        output.writeFloat(13, unk3300DABGDGLAIKL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300KLNGDAMMFIF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300KLNGDAMMFIF_);
      }
      if (unk3300MNGCOAIGGAL_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, unk3300MNGCOAIGGAL_);
      }
      if (unk3300LCKECJCKKJK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300LCKECJCKKJK_);
      }
      if (unk3300ECHOFBLGIIO_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, unk3300ECHOFBLGIIO_);
      }
      if (unk3300JDEFHMKICPF_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(10, unk3300JDEFHMKICPF_);
      }
      if (unk3300DABGDGLAIKL_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, unk3300DABGDGLAIKL_);
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
      if (!(obj instanceof org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other = (org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) obj;

      if (java.lang.Float.floatToIntBits(getUnk3300DABGDGLAIKL())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300DABGDGLAIKL())) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300JDEFHMKICPF())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300JDEFHMKICPF())) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300ECHOFBLGIIO())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300ECHOFBLGIIO())) return false;
      if (getUnk3300LCKECJCKKJK()
          != other.getUnk3300LCKECJCKKJK()) return false;
      if (getUnk3300KLNGDAMMFIF()
          != other.getUnk3300KLNGDAMMFIF()) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300MNGCOAIGGAL())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300MNGCOAIGGAL())) return false;
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
      hash = (37 * hash) + UNK3300_DABGDGLAIKL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300DABGDGLAIKL());
      hash = (37 * hash) + UNK3300_JDEFHMKICPF_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300JDEFHMKICPF());
      hash = (37 * hash) + UNK3300_ECHOFBLGIIO_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300ECHOFBLGIIO());
      hash = (37 * hash) + UNK3300_LCKECJCKKJK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LCKECJCKKJK();
      hash = (37 * hash) + UNK3300_KLNGDAMMFIF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300KLNGDAMMFIF();
      hash = (37 * hash) + UNK3300_MNGCOAIGGAL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300MNGCOAIGGAL());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult prototype) {
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
     * Protobuf type {@code AttackHitEffectResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AttackHitEffectResult)
        org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
      }

      // Construct using org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.newBuilder()
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
        unk3300DABGDGLAIKL_ = 0F;

        unk3300JDEFHMKICPF_ = 0F;

        unk3300ECHOFBLGIIO_ = 0F;

        unk3300LCKECJCKKJK_ = 0;

        unk3300KLNGDAMMFIF_ = 0;

        unk3300MNGCOAIGGAL_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
        return org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult build() {
        org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult buildPartial() {
        org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = new org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult(this);
        result.unk3300DABGDGLAIKL_ = unk3300DABGDGLAIKL_;
        result.unk3300JDEFHMKICPF_ = unk3300JDEFHMKICPF_;
        result.unk3300ECHOFBLGIIO_ = unk3300ECHOFBLGIIO_;
        result.unk3300LCKECJCKKJK_ = unk3300LCKECJCKKJK_;
        result.unk3300KLNGDAMMFIF_ = unk3300KLNGDAMMFIF_;
        result.unk3300MNGCOAIGGAL_ = unk3300MNGCOAIGGAL_;
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
        if (other instanceof org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) {
          return mergeFrom((org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other) {
        if (other == org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance()) return this;
        if (other.getUnk3300DABGDGLAIKL() != 0F) {
          setUnk3300DABGDGLAIKL(other.getUnk3300DABGDGLAIKL());
        }
        if (other.getUnk3300JDEFHMKICPF() != 0F) {
          setUnk3300JDEFHMKICPF(other.getUnk3300JDEFHMKICPF());
        }
        if (other.getUnk3300ECHOFBLGIIO() != 0F) {
          setUnk3300ECHOFBLGIIO(other.getUnk3300ECHOFBLGIIO());
        }
        if (other.getUnk3300LCKECJCKKJK() != 0) {
          setUnk3300LCKECJCKKJK(other.getUnk3300LCKECJCKKJK());
        }
        if (other.getUnk3300KLNGDAMMFIF() != 0) {
          setUnk3300KLNGDAMMFIF(other.getUnk3300KLNGDAMMFIF());
        }
        if (other.getUnk3300MNGCOAIGGAL() != 0F) {
          setUnk3300MNGCOAIGGAL(other.getUnk3300MNGCOAIGGAL());
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
        org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float unk3300DABGDGLAIKL_ ;
      /**
       * <code>float Unk3300_DABGDGLAIKL = 13;</code>
       * @return The unk3300DABGDGLAIKL.
       */
      @java.lang.Override
      public float getUnk3300DABGDGLAIKL() {
        return unk3300DABGDGLAIKL_;
      }
      /**
       * <code>float Unk3300_DABGDGLAIKL = 13;</code>
       * @param value The unk3300DABGDGLAIKL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DABGDGLAIKL(float value) {
        
        unk3300DABGDGLAIKL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_DABGDGLAIKL = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DABGDGLAIKL() {
        
        unk3300DABGDGLAIKL_ = 0F;
        onChanged();
        return this;
      }

      private float unk3300JDEFHMKICPF_ ;
      /**
       * <code>float Unk3300_JDEFHMKICPF = 10;</code>
       * @return The unk3300JDEFHMKICPF.
       */
      @java.lang.Override
      public float getUnk3300JDEFHMKICPF() {
        return unk3300JDEFHMKICPF_;
      }
      /**
       * <code>float Unk3300_JDEFHMKICPF = 10;</code>
       * @param value The unk3300JDEFHMKICPF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JDEFHMKICPF(float value) {
        
        unk3300JDEFHMKICPF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_JDEFHMKICPF = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JDEFHMKICPF() {
        
        unk3300JDEFHMKICPF_ = 0F;
        onChanged();
        return this;
      }

      private float unk3300ECHOFBLGIIO_ ;
      /**
       * <code>float Unk3300_ECHOFBLGIIO = 9;</code>
       * @return The unk3300ECHOFBLGIIO.
       */
      @java.lang.Override
      public float getUnk3300ECHOFBLGIIO() {
        return unk3300ECHOFBLGIIO_;
      }
      /**
       * <code>float Unk3300_ECHOFBLGIIO = 9;</code>
       * @param value The unk3300ECHOFBLGIIO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300ECHOFBLGIIO(float value) {
        
        unk3300ECHOFBLGIIO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_ECHOFBLGIIO = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300ECHOFBLGIIO() {
        
        unk3300ECHOFBLGIIO_ = 0F;
        onChanged();
        return this;
      }

      private int unk3300LCKECJCKKJK_ ;
      /**
       * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
       * @return The unk3300LCKECJCKKJK.
       */
      @java.lang.Override
      public int getUnk3300LCKECJCKKJK() {
        return unk3300LCKECJCKKJK_;
      }
      /**
       * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
       * @param value The unk3300LCKECJCKKJK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LCKECJCKKJK(int value) {
        
        unk3300LCKECJCKKJK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LCKECJCKKJK() {
        
        unk3300LCKECJCKKJK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300KLNGDAMMFIF_ ;
      /**
       * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
       * @return The unk3300KLNGDAMMFIF.
       */
      @java.lang.Override
      public int getUnk3300KLNGDAMMFIF() {
        return unk3300KLNGDAMMFIF_;
      }
      /**
       * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
       * @param value The unk3300KLNGDAMMFIF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KLNGDAMMFIF(int value) {
        
        unk3300KLNGDAMMFIF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KLNGDAMMFIF() {
        
        unk3300KLNGDAMMFIF_ = 0;
        onChanged();
        return this;
      }

      private float unk3300MNGCOAIGGAL_ ;
      /**
       * <code>float Unk3300_MNGCOAIGGAL = 3;</code>
       * @return The unk3300MNGCOAIGGAL.
       */
      @java.lang.Override
      public float getUnk3300MNGCOAIGGAL() {
        return unk3300MNGCOAIGGAL_;
      }
      /**
       * <code>float Unk3300_MNGCOAIGGAL = 3;</code>
       * @param value The unk3300MNGCOAIGGAL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MNGCOAIGGAL(float value) {
        
        unk3300MNGCOAIGGAL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_MNGCOAIGGAL = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MNGCOAIGGAL() {
        
        unk3300MNGCOAIGGAL_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AttackHitEffectResult)
    }

    // @@protoc_insertion_point(class_scope:AttackHitEffectResult)
    private static final org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult();
    }

    public static org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AttackHitEffectResult>
        PARSER = new com.google.protobuf.AbstractParser<AttackHitEffectResult>() {
      @java.lang.Override
      public AttackHitEffectResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttackHitEffectResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AttackHitEffectResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AttackHitEffectResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttackHitEffectResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttackHitEffectResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AttackHitEffectResult.proto\"\305\001\n\025Attack" +
      "HitEffectResult\022\033\n\023Unk3300_DABGDGLAIKL\030\r" +
      " \001(\002\022\033\n\023Unk3300_JDEFHMKICPF\030\n \001(\002\022\033\n\023Unk" +
      "3300_ECHOFBLGIIO\030\t \001(\002\022\033\n\023Unk3300_LCKECJ" +
      "CKKJK\030\010 \001(\r\022\033\n\023Unk3300_KLNGDAMMFIF\030\001 \001(\r" +
      "\022\033\n\023Unk3300_MNGCOAIGGAL\030\003 \001(\002B\026\n\024org.sor" +
      "apointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AttackHitEffectResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AttackHitEffectResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttackHitEffectResult_descriptor,
        new java.lang.String[] { "Unk3300DABGDGLAIKL", "Unk3300JDEFHMKICPF", "Unk3300ECHOFBLGIIO", "Unk3300LCKECJCKKJK", "Unk3300KLNGDAMMFIF", "Unk3300MNGCOAIGGAL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
