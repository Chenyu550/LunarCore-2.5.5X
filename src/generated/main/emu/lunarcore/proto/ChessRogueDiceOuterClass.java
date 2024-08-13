// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class ChessRogueDiceOuterClass {
  /**
   * Protobuf type {@code ChessRogueDice}
   */
  public static final class ChessRogueDice extends ProtoMessage<ChessRogueDice> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 max_difficulty_level = 5;</code>
     */
    private int maxDifficultyLevel;

    /**
     * <code>optional uint32 dice_branch_id = 6;</code>
     */
    private int diceBranchId;

    /**
     * <code>optional uint32 max_area_id = 8;</code>
     */
    private int maxAreaId;

    /**
     * <code>repeated .ChessRogueDiceSurfaceInfo surface_list = 7;</code>
     */
    private final RepeatedMessage<ChessRogueDiceSurfaceInfoOuterClass.ChessRogueDiceSurfaceInfo> surfaceList = RepeatedMessage.newEmptyInstance(ChessRogueDiceSurfaceInfoOuterClass.ChessRogueDiceSurfaceInfo.getFactory());

    private ChessRogueDice() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueDice}
     */
    public static ChessRogueDice newInstance() {
      return new ChessRogueDice();
    }

    /**
     * <code>optional uint32 max_difficulty_level = 5;</code>
     * @return whether the maxDifficultyLevel field is set
     */
    public boolean hasMaxDifficultyLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 max_difficulty_level = 5;</code>
     * @return this
     */
    public ChessRogueDice clearMaxDifficultyLevel() {
      bitField0_ &= ~0x00000001;
      maxDifficultyLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 max_difficulty_level = 5;</code>
     * @return the maxDifficultyLevel
     */
    public int getMaxDifficultyLevel() {
      return maxDifficultyLevel;
    }

    /**
     * <code>optional uint32 max_difficulty_level = 5;</code>
     * @param value the maxDifficultyLevel to set
     * @return this
     */
    public ChessRogueDice setMaxDifficultyLevel(final int value) {
      bitField0_ |= 0x00000001;
      maxDifficultyLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 dice_branch_id = 6;</code>
     * @return whether the diceBranchId field is set
     */
    public boolean hasDiceBranchId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 dice_branch_id = 6;</code>
     * @return this
     */
    public ChessRogueDice clearDiceBranchId() {
      bitField0_ &= ~0x00000002;
      diceBranchId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dice_branch_id = 6;</code>
     * @return the diceBranchId
     */
    public int getDiceBranchId() {
      return diceBranchId;
    }

    /**
     * <code>optional uint32 dice_branch_id = 6;</code>
     * @param value the diceBranchId to set
     * @return this
     */
    public ChessRogueDice setDiceBranchId(final int value) {
      bitField0_ |= 0x00000002;
      diceBranchId = value;
      return this;
    }

    /**
     * <code>optional uint32 max_area_id = 8;</code>
     * @return whether the maxAreaId field is set
     */
    public boolean hasMaxAreaId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 max_area_id = 8;</code>
     * @return this
     */
    public ChessRogueDice clearMaxAreaId() {
      bitField0_ &= ~0x00000004;
      maxAreaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 max_area_id = 8;</code>
     * @return the maxAreaId
     */
    public int getMaxAreaId() {
      return maxAreaId;
    }

    /**
     * <code>optional uint32 max_area_id = 8;</code>
     * @param value the maxAreaId to set
     * @return this
     */
    public ChessRogueDice setMaxAreaId(final int value) {
      bitField0_ |= 0x00000004;
      maxAreaId = value;
      return this;
    }

    /**
     * <code>repeated .ChessRogueDiceSurfaceInfo surface_list = 7;</code>
     * @return whether the surfaceList field is set
     */
    public boolean hasSurfaceList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .ChessRogueDiceSurfaceInfo surface_list = 7;</code>
     * @return this
     */
    public ChessRogueDice clearSurfaceList() {
      bitField0_ &= ~0x00000008;
      surfaceList.clear();
      return this;
    }

    /**
     * <code>repeated .ChessRogueDiceSurfaceInfo surface_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSurfaceList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueDiceSurfaceInfoOuterClass.ChessRogueDiceSurfaceInfo> getSurfaceList(
        ) {
      return surfaceList;
    }

    /**
     * <code>repeated .ChessRogueDiceSurfaceInfo surface_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueDiceSurfaceInfoOuterClass.ChessRogueDiceSurfaceInfo> getMutableSurfaceList(
        ) {
      bitField0_ |= 0x00000008;
      return surfaceList;
    }

    /**
     * <code>repeated .ChessRogueDiceSurfaceInfo surface_list = 7;</code>
     * @param value the surfaceList to add
     * @return this
     */
    public ChessRogueDice addSurfaceList(
        final ChessRogueDiceSurfaceInfoOuterClass.ChessRogueDiceSurfaceInfo value) {
      bitField0_ |= 0x00000008;
      surfaceList.add(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueDiceSurfaceInfo surface_list = 7;</code>
     * @param values the surfaceList to add
     * @return this
     */
    public ChessRogueDice addAllSurfaceList(
        final ChessRogueDiceSurfaceInfoOuterClass.ChessRogueDiceSurfaceInfo... values) {
      bitField0_ |= 0x00000008;
      surfaceList.addAll(values);
      return this;
    }

    @Override
    public ChessRogueDice copyFrom(final ChessRogueDice other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        maxDifficultyLevel = other.maxDifficultyLevel;
        diceBranchId = other.diceBranchId;
        maxAreaId = other.maxAreaId;
        surfaceList.copyFrom(other.surfaceList);
      }
      return this;
    }

    @Override
    public ChessRogueDice mergeFrom(final ChessRogueDice other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMaxDifficultyLevel()) {
        setMaxDifficultyLevel(other.maxDifficultyLevel);
      }
      if (other.hasDiceBranchId()) {
        setDiceBranchId(other.diceBranchId);
      }
      if (other.hasMaxAreaId()) {
        setMaxAreaId(other.maxAreaId);
      }
      if (other.hasSurfaceList()) {
        getMutableSurfaceList().addAll(other.surfaceList);
      }
      return this;
    }

    @Override
    public ChessRogueDice clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      maxDifficultyLevel = 0;
      diceBranchId = 0;
      maxAreaId = 0;
      surfaceList.clear();
      return this;
    }

    @Override
    public ChessRogueDice clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      surfaceList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueDice)) {
        return false;
      }
      ChessRogueDice other = (ChessRogueDice) o;
      return bitField0_ == other.bitField0_
        && (!hasMaxDifficultyLevel() || maxDifficultyLevel == other.maxDifficultyLevel)
        && (!hasDiceBranchId() || diceBranchId == other.diceBranchId)
        && (!hasMaxAreaId() || maxAreaId == other.maxAreaId)
        && (!hasSurfaceList() || surfaceList.equals(other.surfaceList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(maxDifficultyLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(diceBranchId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(maxAreaId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < surfaceList.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(surfaceList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(maxDifficultyLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(diceBranchId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(maxAreaId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * surfaceList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(surfaceList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueDice mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // maxDifficultyLevel
            maxDifficultyLevel = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // diceBranchId
            diceBranchId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // maxAreaId
            maxAreaId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // surfaceList
            tag = input.readRepeatedMessage(surfaceList, tag);
            bitField0_ |= 0x00000008;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.maxDifficultyLevel, maxDifficultyLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.diceBranchId, diceBranchId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.maxAreaId, maxAreaId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.surfaceList, surfaceList);
      }
      output.endObject();
    }

    @Override
    public ChessRogueDice mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2051248507:
          case 1229238139: {
            if (input.isAtField(FieldNames.maxDifficultyLevel)) {
              if (!input.trySkipNullValue()) {
                maxDifficultyLevel = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 216999716:
          case 1050456640: {
            if (input.isAtField(FieldNames.diceBranchId)) {
              if (!input.trySkipNullValue()) {
                diceBranchId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1094590196:
          case -715562446: {
            if (input.isAtField(FieldNames.maxAreaId)) {
              if (!input.trySkipNullValue()) {
                maxAreaId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1403129109:
          case -529702672: {
            if (input.isAtField(FieldNames.surfaceList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(surfaceList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChessRogueDice clone() {
      return new ChessRogueDice().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueDice parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueDice(), data).checkInitialized();
    }

    public static ChessRogueDice parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueDice(), input).checkInitialized();
    }

    public static ChessRogueDice parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueDice(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueDice messages
     */
    public static MessageFactory<ChessRogueDice> getFactory() {
      return ChessRogueDiceFactory.INSTANCE;
    }

    private enum ChessRogueDiceFactory implements MessageFactory<ChessRogueDice> {
      INSTANCE;

      @Override
      public ChessRogueDice create() {
        return ChessRogueDice.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName maxDifficultyLevel = FieldName.forField("maxDifficultyLevel", "max_difficulty_level");

      static final FieldName diceBranchId = FieldName.forField("diceBranchId", "dice_branch_id");

      static final FieldName maxAreaId = FieldName.forField("maxAreaId", "max_area_id");

      static final FieldName surfaceList = FieldName.forField("surfaceList", "surface_list");
    }
  }
}
