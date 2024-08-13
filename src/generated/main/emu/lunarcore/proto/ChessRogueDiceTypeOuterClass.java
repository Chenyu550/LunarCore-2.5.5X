// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class ChessRogueDiceTypeOuterClass {
  /**
   * Protobuf enum {@code ChessRogueDiceType}
   */
  public enum ChessRogueDiceType implements ProtoEnum<ChessRogueDiceType> {
    /**
     * <code>CHESS_ROGUE_DICE_FIXED = 0;</code>
     */
    CHESS_ROGUE_DICE_FIXED("CHESS_ROGUE_DICE_FIXED", 0),

    /**
     * <code>CHESS_ROGUE_DICE_EDITABLE = 1;</code>
     */
    CHESS_ROGUE_DICE_EDITABLE("CHESS_ROGUE_DICE_EDITABLE", 1);

    /**
     * <code>CHESS_ROGUE_DICE_FIXED = 0;</code>
     */
    public static final int CHESS_ROGUE_DICE_FIXED_VALUE = 0;

    /**
     * <code>CHESS_ROGUE_DICE_EDITABLE = 1;</code>
     */
    public static final int CHESS_ROGUE_DICE_EDITABLE_VALUE = 1;

    private final String name;

    private final int number;

    private ChessRogueDiceType(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static ProtoEnum.EnumConverter<ChessRogueDiceType> converter() {
      return ChessRogueDiceTypeConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static ChessRogueDiceType forNumber(int value) {
      return ChessRogueDiceTypeConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static ChessRogueDiceType forNumberOr(int number, ChessRogueDiceType other) {
      ChessRogueDiceType value = forNumber(number);
      return value == null ? other : value;
    }

    enum ChessRogueDiceTypeConverter implements ProtoEnum.EnumConverter<ChessRogueDiceType> {
      INSTANCE;

      private static final ChessRogueDiceType[] lookup = new ChessRogueDiceType[2];

      static {
        lookup[0] = CHESS_ROGUE_DICE_FIXED;
        lookup[1] = CHESS_ROGUE_DICE_EDITABLE;
      }

      @Override
      public final ChessRogueDiceType forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final ChessRogueDiceType forName(final CharSequence value) {
        if (value.length() == 22) {
          if (ProtoUtil.isEqual("CHESS_ROGUE_DICE_FIXED", value)) {
            return CHESS_ROGUE_DICE_FIXED;
          }
        }
        if (value.length() == 25) {
          if (ProtoUtil.isEqual("CHESS_ROGUE_DICE_EDITABLE", value)) {
            return CHESS_ROGUE_DICE_EDITABLE;
          }
        }
        return null;
      }
    }
  }
}
