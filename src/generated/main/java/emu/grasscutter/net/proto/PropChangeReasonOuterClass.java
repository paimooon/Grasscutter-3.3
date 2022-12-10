// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PropChangeReason.proto

package org.sorapointa.proto;

public final class PropChangeReasonOuterClass {
  private PropChangeReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code PropChangeReason}
   */
  public enum PropChangeReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROP_CHANGE_REASON_NONE = 0;</code>
     */
    PROP_CHANGE_REASON_NONE(0),
    /**
     * <code>PROP_CHANGE_REASON_STATUE_RECOVER = 1;</code>
     */
    PROP_CHANGE_REASON_STATUE_RECOVER(1),
    /**
     * <code>PROP_CHANGE_REASON_ENERGY_BALL = 2;</code>
     */
    PROP_CHANGE_REASON_ENERGY_BALL(2),
    /**
     * <code>PROP_CHANGE_REASON_ABILITY = 3;</code>
     */
    PROP_CHANGE_REASON_ABILITY(3),
    /**
     * <code>PROP_CHANGE_REASON_LEVELUP = 4;</code>
     */
    PROP_CHANGE_REASON_LEVELUP(4),
    /**
     * <code>PROP_CHANGE_REASON_ITEM = 5;</code>
     */
    PROP_CHANGE_REASON_ITEM(5),
    /**
     * <code>PROP_CHANGE_REASON_AVATAR_CARD = 6;</code>
     */
    PROP_CHANGE_REASON_AVATAR_CARD(6),
    /**
     * <code>PROP_CHANGE_REASON_CITY_LEVELUP = 7;</code>
     */
    PROP_CHANGE_REASON_CITY_LEVELUP(7),
    /**
     * <code>PROP_CHANGE_REASON_AVATAR_UPGRADE = 8;</code>
     */
    PROP_CHANGE_REASON_AVATAR_UPGRADE(8),
    /**
     * <code>PROP_CHANGE_REASON_AVATAR_PROMOTE = 9;</code>
     */
    PROP_CHANGE_REASON_AVATAR_PROMOTE(9),
    /**
     * <code>PROP_CHANGE_REASON_PLAYER_ADD_EXP = 10;</code>
     */
    PROP_CHANGE_REASON_PLAYER_ADD_EXP(10),
    /**
     * <code>PROP_CHANGE_REASON_FINISH_QUEST = 11;</code>
     */
    PROP_CHANGE_REASON_FINISH_QUEST(11),
    /**
     * <code>PROP_CHANGE_REASON_GM = 12;</code>
     */
    PROP_CHANGE_REASON_GM(12),
    /**
     * <code>PROP_CHANGE_REASON_MANUAL_ADJUST_WORLD_LEVEL = 13;</code>
     */
    PROP_CHANGE_REASON_MANUAL_ADJUST_WORLD_LEVEL(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PROP_CHANGE_REASON_NONE = 0;</code>
     */
    public static final int PROP_CHANGE_REASON_NONE_VALUE = 0;
    /**
     * <code>PROP_CHANGE_REASON_STATUE_RECOVER = 1;</code>
     */
    public static final int PROP_CHANGE_REASON_STATUE_RECOVER_VALUE = 1;
    /**
     * <code>PROP_CHANGE_REASON_ENERGY_BALL = 2;</code>
     */
    public static final int PROP_CHANGE_REASON_ENERGY_BALL_VALUE = 2;
    /**
     * <code>PROP_CHANGE_REASON_ABILITY = 3;</code>
     */
    public static final int PROP_CHANGE_REASON_ABILITY_VALUE = 3;
    /**
     * <code>PROP_CHANGE_REASON_LEVELUP = 4;</code>
     */
    public static final int PROP_CHANGE_REASON_LEVELUP_VALUE = 4;
    /**
     * <code>PROP_CHANGE_REASON_ITEM = 5;</code>
     */
    public static final int PROP_CHANGE_REASON_ITEM_VALUE = 5;
    /**
     * <code>PROP_CHANGE_REASON_AVATAR_CARD = 6;</code>
     */
    public static final int PROP_CHANGE_REASON_AVATAR_CARD_VALUE = 6;
    /**
     * <code>PROP_CHANGE_REASON_CITY_LEVELUP = 7;</code>
     */
    public static final int PROP_CHANGE_REASON_CITY_LEVELUP_VALUE = 7;
    /**
     * <code>PROP_CHANGE_REASON_AVATAR_UPGRADE = 8;</code>
     */
    public static final int PROP_CHANGE_REASON_AVATAR_UPGRADE_VALUE = 8;
    /**
     * <code>PROP_CHANGE_REASON_AVATAR_PROMOTE = 9;</code>
     */
    public static final int PROP_CHANGE_REASON_AVATAR_PROMOTE_VALUE = 9;
    /**
     * <code>PROP_CHANGE_REASON_PLAYER_ADD_EXP = 10;</code>
     */
    public static final int PROP_CHANGE_REASON_PLAYER_ADD_EXP_VALUE = 10;
    /**
     * <code>PROP_CHANGE_REASON_FINISH_QUEST = 11;</code>
     */
    public static final int PROP_CHANGE_REASON_FINISH_QUEST_VALUE = 11;
    /**
     * <code>PROP_CHANGE_REASON_GM = 12;</code>
     */
    public static final int PROP_CHANGE_REASON_GM_VALUE = 12;
    /**
     * <code>PROP_CHANGE_REASON_MANUAL_ADJUST_WORLD_LEVEL = 13;</code>
     */
    public static final int PROP_CHANGE_REASON_MANUAL_ADJUST_WORLD_LEVEL_VALUE = 13;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PropChangeReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PropChangeReason forNumber(int value) {
      switch (value) {
        case 0: return PROP_CHANGE_REASON_NONE;
        case 1: return PROP_CHANGE_REASON_STATUE_RECOVER;
        case 2: return PROP_CHANGE_REASON_ENERGY_BALL;
        case 3: return PROP_CHANGE_REASON_ABILITY;
        case 4: return PROP_CHANGE_REASON_LEVELUP;
        case 5: return PROP_CHANGE_REASON_ITEM;
        case 6: return PROP_CHANGE_REASON_AVATAR_CARD;
        case 7: return PROP_CHANGE_REASON_CITY_LEVELUP;
        case 8: return PROP_CHANGE_REASON_AVATAR_UPGRADE;
        case 9: return PROP_CHANGE_REASON_AVATAR_PROMOTE;
        case 10: return PROP_CHANGE_REASON_PLAYER_ADD_EXP;
        case 11: return PROP_CHANGE_REASON_FINISH_QUEST;
        case 12: return PROP_CHANGE_REASON_GM;
        case 13: return PROP_CHANGE_REASON_MANUAL_ADJUST_WORLD_LEVEL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PropChangeReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PropChangeReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PropChangeReason>() {
            public PropChangeReason findValueByNumber(int number) {
              return PropChangeReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.sorapointa.proto.PropChangeReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PropChangeReason[] VALUES = values();

    public static PropChangeReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PropChangeReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PropChangeReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PropChangeReason.proto*\207\004\n\020PropChangeR" +
      "eason\022\033\n\027PROP_CHANGE_REASON_NONE\020\000\022%\n!PR" +
      "OP_CHANGE_REASON_STATUE_RECOVER\020\001\022\"\n\036PRO" +
      "P_CHANGE_REASON_ENERGY_BALL\020\002\022\036\n\032PROP_CH" +
      "ANGE_REASON_ABILITY\020\003\022\036\n\032PROP_CHANGE_REA" +
      "SON_LEVELUP\020\004\022\033\n\027PROP_CHANGE_REASON_ITEM" +
      "\020\005\022\"\n\036PROP_CHANGE_REASON_AVATAR_CARD\020\006\022#" +
      "\n\037PROP_CHANGE_REASON_CITY_LEVELUP\020\007\022%\n!P" +
      "ROP_CHANGE_REASON_AVATAR_UPGRADE\020\010\022%\n!PR" +
      "OP_CHANGE_REASON_AVATAR_PROMOTE\020\t\022%\n!PRO" +
      "P_CHANGE_REASON_PLAYER_ADD_EXP\020\n\022#\n\037PROP" +
      "_CHANGE_REASON_FINISH_QUEST\020\013\022\031\n\025PROP_CH" +
      "ANGE_REASON_GM\020\014\0220\n,PROP_CHANGE_REASON_M" +
      "ANUAL_ADJUST_WORLD_LEVEL\020\rB\026\n\024org.sorapo" +
      "inta.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
