// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetCreatorOpType.proto

package org.sorapointa.proto;

public final class WidgetCreatorOpTypeOuterClass {
  private WidgetCreatorOpTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code WidgetCreatorOpType}
   */
  public enum WidgetCreatorOpType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WIDGET_CREATOR_OP_TYPE_NONE = 0;</code>
     */
    WIDGET_CREATOR_OP_TYPE_NONE(0),
    /**
     * <code>WIDGET_CREATOR_OP_TYPE_RETRACT = 1;</code>
     */
    WIDGET_CREATOR_OP_TYPE_RETRACT(1),
    /**
     * <code>WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE = 2;</code>
     */
    WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>WIDGET_CREATOR_OP_TYPE_NONE = 0;</code>
     */
    public static final int WIDGET_CREATOR_OP_TYPE_NONE_VALUE = 0;
    /**
     * <code>WIDGET_CREATOR_OP_TYPE_RETRACT = 1;</code>
     */
    public static final int WIDGET_CREATOR_OP_TYPE_RETRACT_VALUE = 1;
    /**
     * <code>WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE = 2;</code>
     */
    public static final int WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE_VALUE = 2;


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
    public static WidgetCreatorOpType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WidgetCreatorOpType forNumber(int value) {
      switch (value) {
        case 0: return WIDGET_CREATOR_OP_TYPE_NONE;
        case 1: return WIDGET_CREATOR_OP_TYPE_RETRACT;
        case 2: return WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WidgetCreatorOpType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WidgetCreatorOpType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WidgetCreatorOpType>() {
            public WidgetCreatorOpType findValueByNumber(int number) {
              return WidgetCreatorOpType.forNumber(number);
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
      return org.sorapointa.proto.WidgetCreatorOpTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final WidgetCreatorOpType[] VALUES = values();

    public static WidgetCreatorOpType valueOf(
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

    private WidgetCreatorOpType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:WidgetCreatorOpType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031WidgetCreatorOpType.proto*\211\001\n\023WidgetCr" +
      "eatorOpType\022\037\n\033WIDGET_CREATOR_OP_TYPE_NO" +
      "NE\020\000\022\"\n\036WIDGET_CREATOR_OP_TYPE_RETRACT\020\001" +
      "\022-\n)WIDGET_CREATOR_OP_TYPE_RETRACT_AND_C" +
      "REATE\020\002B\026\n\024org.sorapointa.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
