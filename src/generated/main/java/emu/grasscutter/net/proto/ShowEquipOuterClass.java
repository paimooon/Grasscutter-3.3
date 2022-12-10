// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShowEquip.proto

package org.sorapointa.proto;

public final class ShowEquipOuterClass {
  private ShowEquipOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShowEquipOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShowEquip)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>.Reliquary reliquary = 2;</code>
     * @return Whether the reliquary field is set.
     */
    boolean hasReliquary();
    /**
     * <code>.Reliquary reliquary = 2;</code>
     * @return The reliquary.
     */
    org.sorapointa.proto.ReliquaryOuterClass.Reliquary getReliquary();
    /**
     * <code>.Reliquary reliquary = 2;</code>
     */
    org.sorapointa.proto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder();

    /**
     * <code>.Weapon weapon = 3;</code>
     * @return Whether the weapon field is set.
     */
    boolean hasWeapon();
    /**
     * <code>.Weapon weapon = 3;</code>
     * @return The weapon.
     */
    org.sorapointa.proto.WeaponOuterClass.Weapon getWeapon();
    /**
     * <code>.Weapon weapon = 3;</code>
     */
    org.sorapointa.proto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder();

    public org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.DetailCase getDetailCase();
  }
  /**
   * Protobuf type {@code ShowEquip}
   */
  public static final class ShowEquip extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShowEquip)
      ShowEquipOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShowEquip.newBuilder() to construct.
    private ShowEquip(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShowEquip() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShowEquip();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShowEquip(
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

              itemId_ = input.readUInt32();
              break;
            }
            case 18: {
              org.sorapointa.proto.ReliquaryOuterClass.Reliquary.Builder subBuilder = null;
              if (detailCase_ == 2) {
                subBuilder = ((org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_).toBuilder();
              }
              detail_ =
                  input.readMessage(org.sorapointa.proto.ReliquaryOuterClass.Reliquary.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_);
                detail_ = subBuilder.buildPartial();
              }
              detailCase_ = 2;
              break;
            }
            case 26: {
              org.sorapointa.proto.WeaponOuterClass.Weapon.Builder subBuilder = null;
              if (detailCase_ == 3) {
                subBuilder = ((org.sorapointa.proto.WeaponOuterClass.Weapon) detail_).toBuilder();
              }
              detail_ =
                  input.readMessage(org.sorapointa.proto.WeaponOuterClass.Weapon.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((org.sorapointa.proto.WeaponOuterClass.Weapon) detail_);
                detail_ = subBuilder.buildPartial();
              }
              detailCase_ = 3;
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
      return org.sorapointa.proto.ShowEquipOuterClass.internal_static_ShowEquip_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.ShowEquipOuterClass.internal_static_ShowEquip_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.class, org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.Builder.class);
    }

    private int detailCase_ = 0;
    private java.lang.Object detail_;
    public enum DetailCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      RELIQUARY(2),
      WEAPON(3),
      DETAIL_NOT_SET(0);
      private final int value;
      private DetailCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DetailCase valueOf(int value) {
        return forNumber(value);
      }

      public static DetailCase forNumber(int value) {
        switch (value) {
          case 2: return RELIQUARY;
          case 3: return WEAPON;
          case 0: return DETAIL_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DetailCase
    getDetailCase() {
      return DetailCase.forNumber(
          detailCase_);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private int itemId_;
    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int RELIQUARY_FIELD_NUMBER = 2;
    /**
     * <code>.Reliquary reliquary = 2;</code>
     * @return Whether the reliquary field is set.
     */
    @java.lang.Override
    public boolean hasReliquary() {
      return detailCase_ == 2;
    }
    /**
     * <code>.Reliquary reliquary = 2;</code>
     * @return The reliquary.
     */
    @java.lang.Override
    public org.sorapointa.proto.ReliquaryOuterClass.Reliquary getReliquary() {
      if (detailCase_ == 2) {
         return (org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_;
      }
      return org.sorapointa.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }
    /**
     * <code>.Reliquary reliquary = 2;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
      if (detailCase_ == 2) {
         return (org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_;
      }
      return org.sorapointa.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }

    public static final int WEAPON_FIELD_NUMBER = 3;
    /**
     * <code>.Weapon weapon = 3;</code>
     * @return Whether the weapon field is set.
     */
    @java.lang.Override
    public boolean hasWeapon() {
      return detailCase_ == 3;
    }
    /**
     * <code>.Weapon weapon = 3;</code>
     * @return The weapon.
     */
    @java.lang.Override
    public org.sorapointa.proto.WeaponOuterClass.Weapon getWeapon() {
      if (detailCase_ == 3) {
         return (org.sorapointa.proto.WeaponOuterClass.Weapon) detail_;
      }
      return org.sorapointa.proto.WeaponOuterClass.Weapon.getDefaultInstance();
    }
    /**
     * <code>.Weapon weapon = 3;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
      if (detailCase_ == 3) {
         return (org.sorapointa.proto.WeaponOuterClass.Weapon) detail_;
      }
      return org.sorapointa.proto.WeaponOuterClass.Weapon.getDefaultInstance();
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
      if (itemId_ != 0) {
        output.writeUInt32(1, itemId_);
      }
      if (detailCase_ == 2) {
        output.writeMessage(2, (org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_);
      }
      if (detailCase_ == 3) {
        output.writeMessage(3, (org.sorapointa.proto.WeaponOuterClass.Weapon) detail_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, itemId_);
      }
      if (detailCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_);
      }
      if (detailCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (org.sorapointa.proto.WeaponOuterClass.Weapon) detail_);
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
      if (!(obj instanceof org.sorapointa.proto.ShowEquipOuterClass.ShowEquip)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.ShowEquipOuterClass.ShowEquip other = (org.sorapointa.proto.ShowEquipOuterClass.ShowEquip) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (!getDetailCase().equals(other.getDetailCase())) return false;
      switch (detailCase_) {
        case 2:
          if (!getReliquary()
              .equals(other.getReliquary())) return false;
          break;
        case 3:
          if (!getWeapon()
              .equals(other.getWeapon())) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      switch (detailCase_) {
        case 2:
          hash = (37 * hash) + RELIQUARY_FIELD_NUMBER;
          hash = (53 * hash) + getReliquary().hashCode();
          break;
        case 3:
          hash = (37 * hash) + WEAPON_FIELD_NUMBER;
          hash = (53 * hash) + getWeapon().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.ShowEquipOuterClass.ShowEquip prototype) {
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
     * Protobuf type {@code ShowEquip}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShowEquip)
        org.sorapointa.proto.ShowEquipOuterClass.ShowEquipOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.ShowEquipOuterClass.internal_static_ShowEquip_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.ShowEquipOuterClass.internal_static_ShowEquip_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.class, org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.Builder.class);
      }

      // Construct using org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.newBuilder()
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
        itemId_ = 0;

        detailCase_ = 0;
        detail_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.ShowEquipOuterClass.internal_static_ShowEquip_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.ShowEquipOuterClass.ShowEquip getDefaultInstanceForType() {
        return org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.ShowEquipOuterClass.ShowEquip build() {
        org.sorapointa.proto.ShowEquipOuterClass.ShowEquip result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.ShowEquipOuterClass.ShowEquip buildPartial() {
        org.sorapointa.proto.ShowEquipOuterClass.ShowEquip result = new org.sorapointa.proto.ShowEquipOuterClass.ShowEquip(this);
        result.itemId_ = itemId_;
        if (detailCase_ == 2) {
          if (reliquaryBuilder_ == null) {
            result.detail_ = detail_;
          } else {
            result.detail_ = reliquaryBuilder_.build();
          }
        }
        if (detailCase_ == 3) {
          if (weaponBuilder_ == null) {
            result.detail_ = detail_;
          } else {
            result.detail_ = weaponBuilder_.build();
          }
        }
        result.detailCase_ = detailCase_;
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
        if (other instanceof org.sorapointa.proto.ShowEquipOuterClass.ShowEquip) {
          return mergeFrom((org.sorapointa.proto.ShowEquipOuterClass.ShowEquip)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.ShowEquipOuterClass.ShowEquip other) {
        if (other == org.sorapointa.proto.ShowEquipOuterClass.ShowEquip.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        switch (other.getDetailCase()) {
          case RELIQUARY: {
            mergeReliquary(other.getReliquary());
            break;
          }
          case WEAPON: {
            mergeWeapon(other.getWeapon());
            break;
          }
          case DETAIL_NOT_SET: {
            break;
          }
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
        org.sorapointa.proto.ShowEquipOuterClass.ShowEquip parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.ShowEquipOuterClass.ShowEquip) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int detailCase_ = 0;
      private java.lang.Object detail_;
      public DetailCase
          getDetailCase() {
        return DetailCase.forNumber(
            detailCase_);
      }

      public Builder clearDetail() {
        detailCase_ = 0;
        detail_ = null;
        onChanged();
        return this;
      }


      private int itemId_ ;
      /**
       * <code>uint32 item_id = 1;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.ReliquaryOuterClass.Reliquary, org.sorapointa.proto.ReliquaryOuterClass.Reliquary.Builder, org.sorapointa.proto.ReliquaryOuterClass.ReliquaryOrBuilder> reliquaryBuilder_;
      /**
       * <code>.Reliquary reliquary = 2;</code>
       * @return Whether the reliquary field is set.
       */
      @java.lang.Override
      public boolean hasReliquary() {
        return detailCase_ == 2;
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       * @return The reliquary.
       */
      @java.lang.Override
      public org.sorapointa.proto.ReliquaryOuterClass.Reliquary getReliquary() {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 2) {
            return (org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_;
          }
          return org.sorapointa.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        } else {
          if (detailCase_ == 2) {
            return reliquaryBuilder_.getMessage();
          }
          return org.sorapointa.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       */
      public Builder setReliquary(org.sorapointa.proto.ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(value);
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       */
      public Builder setReliquary(
          org.sorapointa.proto.ReliquaryOuterClass.Reliquary.Builder builderForValue) {
        if (reliquaryBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       */
      public Builder mergeReliquary(org.sorapointa.proto.ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 2 &&
              detail_ != org.sorapointa.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance()) {
            detail_ = org.sorapointa.proto.ReliquaryOuterClass.Reliquary.newBuilder((org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 2) {
            reliquaryBuilder_.mergeFrom(value);
          }
          reliquaryBuilder_.setMessage(value);
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       */
      public Builder clearReliquary() {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 2) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 2) {
            detailCase_ = 0;
            detail_ = null;
          }
          reliquaryBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       */
      public org.sorapointa.proto.ReliquaryOuterClass.Reliquary.Builder getReliquaryBuilder() {
        return getReliquaryFieldBuilder().getBuilder();
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       */
      @java.lang.Override
      public org.sorapointa.proto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
        if ((detailCase_ == 2) && (reliquaryBuilder_ != null)) {
          return reliquaryBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 2) {
            return (org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_;
          }
          return org.sorapointa.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.ReliquaryOuterClass.Reliquary, org.sorapointa.proto.ReliquaryOuterClass.Reliquary.Builder, org.sorapointa.proto.ReliquaryOuterClass.ReliquaryOrBuilder> 
          getReliquaryFieldBuilder() {
        if (reliquaryBuilder_ == null) {
          if (!(detailCase_ == 2)) {
            detail_ = org.sorapointa.proto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
          }
          reliquaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.sorapointa.proto.ReliquaryOuterClass.Reliquary, org.sorapointa.proto.ReliquaryOuterClass.Reliquary.Builder, org.sorapointa.proto.ReliquaryOuterClass.ReliquaryOrBuilder>(
                  (org.sorapointa.proto.ReliquaryOuterClass.Reliquary) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 2;
        onChanged();;
        return reliquaryBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.WeaponOuterClass.Weapon, org.sorapointa.proto.WeaponOuterClass.Weapon.Builder, org.sorapointa.proto.WeaponOuterClass.WeaponOrBuilder> weaponBuilder_;
      /**
       * <code>.Weapon weapon = 3;</code>
       * @return Whether the weapon field is set.
       */
      @java.lang.Override
      public boolean hasWeapon() {
        return detailCase_ == 3;
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       * @return The weapon.
       */
      @java.lang.Override
      public org.sorapointa.proto.WeaponOuterClass.Weapon getWeapon() {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 3) {
            return (org.sorapointa.proto.WeaponOuterClass.Weapon) detail_;
          }
          return org.sorapointa.proto.WeaponOuterClass.Weapon.getDefaultInstance();
        } else {
          if (detailCase_ == 3) {
            return weaponBuilder_.getMessage();
          }
          return org.sorapointa.proto.WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       */
      public Builder setWeapon(org.sorapointa.proto.WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          weaponBuilder_.setMessage(value);
        }
        detailCase_ = 3;
        return this;
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       */
      public Builder setWeapon(
          org.sorapointa.proto.WeaponOuterClass.Weapon.Builder builderForValue) {
        if (weaponBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          weaponBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 3;
        return this;
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       */
      public Builder mergeWeapon(org.sorapointa.proto.WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 3 &&
              detail_ != org.sorapointa.proto.WeaponOuterClass.Weapon.getDefaultInstance()) {
            detail_ = org.sorapointa.proto.WeaponOuterClass.Weapon.newBuilder((org.sorapointa.proto.WeaponOuterClass.Weapon) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 3) {
            weaponBuilder_.mergeFrom(value);
          }
          weaponBuilder_.setMessage(value);
        }
        detailCase_ = 3;
        return this;
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       */
      public Builder clearWeapon() {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 3) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 3) {
            detailCase_ = 0;
            detail_ = null;
          }
          weaponBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       */
      public org.sorapointa.proto.WeaponOuterClass.Weapon.Builder getWeaponBuilder() {
        return getWeaponFieldBuilder().getBuilder();
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       */
      @java.lang.Override
      public org.sorapointa.proto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
        if ((detailCase_ == 3) && (weaponBuilder_ != null)) {
          return weaponBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 3) {
            return (org.sorapointa.proto.WeaponOuterClass.Weapon) detail_;
          }
          return org.sorapointa.proto.WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.WeaponOuterClass.Weapon, org.sorapointa.proto.WeaponOuterClass.Weapon.Builder, org.sorapointa.proto.WeaponOuterClass.WeaponOrBuilder> 
          getWeaponFieldBuilder() {
        if (weaponBuilder_ == null) {
          if (!(detailCase_ == 3)) {
            detail_ = org.sorapointa.proto.WeaponOuterClass.Weapon.getDefaultInstance();
          }
          weaponBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.sorapointa.proto.WeaponOuterClass.Weapon, org.sorapointa.proto.WeaponOuterClass.Weapon.Builder, org.sorapointa.proto.WeaponOuterClass.WeaponOrBuilder>(
                  (org.sorapointa.proto.WeaponOuterClass.Weapon) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 3;
        onChanged();;
        return weaponBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ShowEquip)
    }

    // @@protoc_insertion_point(class_scope:ShowEquip)
    private static final org.sorapointa.proto.ShowEquipOuterClass.ShowEquip DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.ShowEquipOuterClass.ShowEquip();
    }

    public static org.sorapointa.proto.ShowEquipOuterClass.ShowEquip getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShowEquip>
        PARSER = new com.google.protobuf.AbstractParser<ShowEquip>() {
      @java.lang.Override
      public ShowEquip parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShowEquip(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShowEquip> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShowEquip> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.ShowEquipOuterClass.ShowEquip getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShowEquip_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShowEquip_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017ShowEquip.proto\032\017Reliquary.proto\032\014Weap" +
      "on.proto\"b\n\tShowEquip\022\017\n\007item_id\030\001 \001(\r\022\037" +
      "\n\treliquary\030\002 \001(\0132\n.ReliquaryH\000\022\031\n\006weapo" +
      "n\030\003 \001(\0132\007.WeaponH\000B\010\n\006detailB\026\n\024org.sora" +
      "pointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sorapointa.proto.ReliquaryOuterClass.getDescriptor(),
          org.sorapointa.proto.WeaponOuterClass.getDescriptor(),
        });
    internal_static_ShowEquip_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShowEquip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShowEquip_descriptor,
        new java.lang.String[] { "ItemId", "Reliquary", "Weapon", "Detail", });
    org.sorapointa.proto.ReliquaryOuterClass.getDescriptor();
    org.sorapointa.proto.WeaponOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
