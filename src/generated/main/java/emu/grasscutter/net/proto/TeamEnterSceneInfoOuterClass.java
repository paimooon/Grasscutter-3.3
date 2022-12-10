// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamEnterSceneInfo.proto

package org.sorapointa.proto;

public final class TeamEnterSceneInfoOuterClass {
  private TeamEnterSceneInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamEnterSceneInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamEnterSceneInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
     * @return Whether the teamAbilityInfo field is set.
     */
    boolean hasTeamAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
     * @return The teamAbilityInfo.
     */
    org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
     */
    org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder();

    /**
     * <code>.AbilityControlBlock ability_control_block = 5;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    boolean hasAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 5;</code>
     * @return The abilityControlBlock.
     */
    org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock();
    /**
     * <code>.AbilityControlBlock ability_control_block = 5;</code>
     */
    org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder();

    /**
     * <code>uint32 team_entity_id = 11;</code>
     * @return The teamEntityId.
     */
    int getTeamEntityId();
  }
  /**
   * Protobuf type {@code TeamEnterSceneInfo}
   */
  public static final class TeamEnterSceneInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamEnterSceneInfo)
      TeamEnterSceneInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamEnterSceneInfo.newBuilder() to construct.
    private TeamEnterSceneInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamEnterSceneInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamEnterSceneInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeamEnterSceneInfo(
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
            case 42: {
              org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder subBuilder = null;
              if (abilityControlBlock_ != null) {
                subBuilder = abilityControlBlock_.toBuilder();
              }
              abilityControlBlock_ = input.readMessage(org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityControlBlock_);
                abilityControlBlock_ = subBuilder.buildPartial();
              }

              break;
            }
            case 50: {
              org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
              if (teamAbilityInfo_ != null) {
                subBuilder = teamAbilityInfo_.toBuilder();
              }
              teamAbilityInfo_ = input.readMessage(org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(teamAbilityInfo_);
                teamAbilityInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {

              teamEntityId_ = input.readUInt32();
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
      return org.sorapointa.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sorapointa.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.class, org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder.class);
    }

    public static final int TEAM_ABILITY_INFO_FIELD_NUMBER = 6;
    private org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
     * @return Whether the teamAbilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasTeamAbilityInfo() {
      return teamAbilityInfo_ != null;
    }
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
     * @return The teamAbilityInfo.
     */
    @java.lang.Override
    public org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
      return teamAbilityInfo_ == null ? org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
    }
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
      return getTeamAbilityInfo();
    }

    public static final int ABILITY_CONTROL_BLOCK_FIELD_NUMBER = 5;
    private org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
    /**
     * <code>.AbilityControlBlock ability_control_block = 5;</code>
     * @return Whether the abilityControlBlock field is set.
     */
    @java.lang.Override
    public boolean hasAbilityControlBlock() {
      return abilityControlBlock_ != null;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 5;</code>
     * @return The abilityControlBlock.
     */
    @java.lang.Override
    public org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
      return abilityControlBlock_ == null ? org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
    }
    /**
     * <code>.AbilityControlBlock ability_control_block = 5;</code>
     */
    @java.lang.Override
    public org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
      return getAbilityControlBlock();
    }

    public static final int TEAM_ENTITY_ID_FIELD_NUMBER = 11;
    private int teamEntityId_;
    /**
     * <code>uint32 team_entity_id = 11;</code>
     * @return The teamEntityId.
     */
    @java.lang.Override
    public int getTeamEntityId() {
      return teamEntityId_;
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
      if (abilityControlBlock_ != null) {
        output.writeMessage(5, getAbilityControlBlock());
      }
      if (teamAbilityInfo_ != null) {
        output.writeMessage(6, getTeamAbilityInfo());
      }
      if (teamEntityId_ != 0) {
        output.writeUInt32(11, teamEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (abilityControlBlock_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getAbilityControlBlock());
      }
      if (teamAbilityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getTeamAbilityInfo());
      }
      if (teamEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, teamEntityId_);
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
      if (!(obj instanceof org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo)) {
        return super.equals(obj);
      }
      org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo other = (org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo) obj;

      if (hasTeamAbilityInfo() != other.hasTeamAbilityInfo()) return false;
      if (hasTeamAbilityInfo()) {
        if (!getTeamAbilityInfo()
            .equals(other.getTeamAbilityInfo())) return false;
      }
      if (hasAbilityControlBlock() != other.hasAbilityControlBlock()) return false;
      if (hasAbilityControlBlock()) {
        if (!getAbilityControlBlock()
            .equals(other.getAbilityControlBlock())) return false;
      }
      if (getTeamEntityId()
          != other.getTeamEntityId()) return false;
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
      if (hasTeamAbilityInfo()) {
        hash = (37 * hash) + TEAM_ABILITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getTeamAbilityInfo().hashCode();
      }
      if (hasAbilityControlBlock()) {
        hash = (37 * hash) + ABILITY_CONTROL_BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityControlBlock().hashCode();
      }
      hash = (37 * hash) + TEAM_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parseFrom(
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
    public static Builder newBuilder(org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo prototype) {
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
     * Protobuf type {@code TeamEnterSceneInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamEnterSceneInfo)
        org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sorapointa.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sorapointa.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.class, org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.Builder.class);
      }

      // Construct using org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.newBuilder()
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
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = null;
        } else {
          teamAbilityInfo_ = null;
          teamAbilityInfoBuilder_ = null;
        }
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = null;
        } else {
          abilityControlBlock_ = null;
          abilityControlBlockBuilder_ = null;
        }
        teamEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sorapointa.proto.TeamEnterSceneInfoOuterClass.internal_static_TeamEnterSceneInfo_descriptor;
      }

      @java.lang.Override
      public org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getDefaultInstanceForType() {
        return org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo build() {
        org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo buildPartial() {
        org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo result = new org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo(this);
        if (teamAbilityInfoBuilder_ == null) {
          result.teamAbilityInfo_ = teamAbilityInfo_;
        } else {
          result.teamAbilityInfo_ = teamAbilityInfoBuilder_.build();
        }
        if (abilityControlBlockBuilder_ == null) {
          result.abilityControlBlock_ = abilityControlBlock_;
        } else {
          result.abilityControlBlock_ = abilityControlBlockBuilder_.build();
        }
        result.teamEntityId_ = teamEntityId_;
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
        if (other instanceof org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo) {
          return mergeFrom((org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo other) {
        if (other == org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.getDefaultInstance()) return this;
        if (other.hasTeamAbilityInfo()) {
          mergeTeamAbilityInfo(other.getTeamAbilityInfo());
        }
        if (other.hasAbilityControlBlock()) {
          mergeAbilityControlBlock(other.getAbilityControlBlock());
        }
        if (other.getTeamEntityId() != 0) {
          setTeamEntityId(other.getTeamEntityId());
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
        org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> teamAbilityInfoBuilder_;
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       * @return Whether the teamAbilityInfo field is set.
       */
      public boolean hasTeamAbilityInfo() {
        return teamAbilityInfoBuilder_ != null || teamAbilityInfo_ != null;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       * @return The teamAbilityInfo.
       */
      public org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
        if (teamAbilityInfoBuilder_ == null) {
          return teamAbilityInfo_ == null ? org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
        } else {
          return teamAbilityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       */
      public Builder setTeamAbilityInfo(org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (teamAbilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          teamAbilityInfo_ = value;
          onChanged();
        } else {
          teamAbilityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       */
      public Builder setTeamAbilityInfo(
          org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = builderForValue.build();
          onChanged();
        } else {
          teamAbilityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       */
      public Builder mergeTeamAbilityInfo(org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (teamAbilityInfoBuilder_ == null) {
          if (teamAbilityInfo_ != null) {
            teamAbilityInfo_ =
              org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(teamAbilityInfo_).mergeFrom(value).buildPartial();
          } else {
            teamAbilityInfo_ = value;
          }
          onChanged();
        } else {
          teamAbilityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       */
      public Builder clearTeamAbilityInfo() {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = null;
          onChanged();
        } else {
          teamAbilityInfo_ = null;
          teamAbilityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       */
      public org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getTeamAbilityInfoBuilder() {
        
        onChanged();
        return getTeamAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       */
      public org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
        if (teamAbilityInfoBuilder_ != null) {
          return teamAbilityInfoBuilder_.getMessageOrBuilder();
        } else {
          return teamAbilityInfo_ == null ?
              org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
        }
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> 
          getTeamAbilityInfoFieldBuilder() {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, org.sorapointa.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(
                  getTeamAbilityInfo(),
                  getParentForChildren(),
                  isClean());
          teamAbilityInfo_ = null;
        }
        return teamAbilityInfoBuilder_;
      }

      private org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock abilityControlBlock_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock, org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> abilityControlBlockBuilder_;
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       * @return Whether the abilityControlBlock field is set.
       */
      public boolean hasAbilityControlBlock() {
        return abilityControlBlockBuilder_ != null || abilityControlBlock_ != null;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       * @return The abilityControlBlock.
       */
      public org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock getAbilityControlBlock() {
        if (abilityControlBlockBuilder_ == null) {
          return abilityControlBlock_ == null ? org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        } else {
          return abilityControlBlockBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       */
      public Builder setAbilityControlBlock(org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityControlBlock_ = value;
          onChanged();
        } else {
          abilityControlBlockBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       */
      public Builder setAbilityControlBlock(
          org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder builderForValue) {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = builderForValue.build();
          onChanged();
        } else {
          abilityControlBlockBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       */
      public Builder mergeAbilityControlBlock(org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock value) {
        if (abilityControlBlockBuilder_ == null) {
          if (abilityControlBlock_ != null) {
            abilityControlBlock_ =
              org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder(abilityControlBlock_).mergeFrom(value).buildPartial();
          } else {
            abilityControlBlock_ = value;
          }
          onChanged();
        } else {
          abilityControlBlockBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       */
      public Builder clearAbilityControlBlock() {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlock_ = null;
          onChanged();
        } else {
          abilityControlBlock_ = null;
          abilityControlBlockBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       */
      public org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder getAbilityControlBlockBuilder() {
        
        onChanged();
        return getAbilityControlBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       */
      public org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder getAbilityControlBlockOrBuilder() {
        if (abilityControlBlockBuilder_ != null) {
          return abilityControlBlockBuilder_.getMessageOrBuilder();
        } else {
          return abilityControlBlock_ == null ?
              org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.getDefaultInstance() : abilityControlBlock_;
        }
      }
      /**
       * <code>.AbilityControlBlock ability_control_block = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock, org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder> 
          getAbilityControlBlockFieldBuilder() {
        if (abilityControlBlockBuilder_ == null) {
          abilityControlBlockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock, org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlock.Builder, org.sorapointa.proto.AbilityControlBlockOuterClass.AbilityControlBlockOrBuilder>(
                  getAbilityControlBlock(),
                  getParentForChildren(),
                  isClean());
          abilityControlBlock_ = null;
        }
        return abilityControlBlockBuilder_;
      }

      private int teamEntityId_ ;
      /**
       * <code>uint32 team_entity_id = 11;</code>
       * @return The teamEntityId.
       */
      @java.lang.Override
      public int getTeamEntityId() {
        return teamEntityId_;
      }
      /**
       * <code>uint32 team_entity_id = 11;</code>
       * @param value The teamEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamEntityId(int value) {
        
        teamEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 team_entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamEntityId() {
        
        teamEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TeamEnterSceneInfo)
    }

    // @@protoc_insertion_point(class_scope:TeamEnterSceneInfo)
    private static final org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo();
    }

    public static org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamEnterSceneInfo>
        PARSER = new com.google.protobuf.AbstractParser<TeamEnterSceneInfo>() {
      @java.lang.Override
      public TeamEnterSceneInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamEnterSceneInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeamEnterSceneInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamEnterSceneInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.sorapointa.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamEnterSceneInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamEnterSceneInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TeamEnterSceneInfo.proto\032\031AbilityContr" +
      "olBlock.proto\032\032AbilitySyncStateInfo.prot" +
      "o\"\223\001\n\022TeamEnterSceneInfo\0220\n\021team_ability" +
      "_info\030\006 \001(\0132\025.AbilitySyncStateInfo\0223\n\025ab" +
      "ility_control_block\030\005 \001(\0132\024.AbilityContr" +
      "olBlock\022\026\n\016team_entity_id\030\013 \001(\rB\026\n\024org.s" +
      "orapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sorapointa.proto.AbilityControlBlockOuterClass.getDescriptor(),
          org.sorapointa.proto.AbilitySyncStateInfoOuterClass.getDescriptor(),
        });
    internal_static_TeamEnterSceneInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamEnterSceneInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamEnterSceneInfo_descriptor,
        new java.lang.String[] { "TeamAbilityInfo", "AbilityControlBlock", "TeamEntityId", });
    org.sorapointa.proto.AbilityControlBlockOuterClass.getDescriptor();
    org.sorapointa.proto.AbilitySyncStateInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
