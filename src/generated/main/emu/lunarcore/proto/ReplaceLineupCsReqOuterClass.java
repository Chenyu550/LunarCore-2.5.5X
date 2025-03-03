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

public final class ReplaceLineupCsReqOuterClass {
  /**
   * Protobuf type {@code ReplaceLineupCsReq}
   */
  public static final class ReplaceLineupCsReq extends ProtoMessage<ReplaceLineupCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 plane_id = 1;</code>
     */
    private int planeId;

    /**
     * <code>optional uint32 index = 13;</code>
     */
    private int index;

    /**
     * <code>optional uint32 leader_slot = 14;</code>
     */
    private int leaderSlot;

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     */
    private int extraLineupType;

    /**
     * <code>optional bool is_virtual = 3;</code>
     */
    private boolean isVirtual;

    /**
     * <code>repeated .LineupSlotData slots = 11;</code>
     */
    private final RepeatedMessage<LineupSlotDataOuterClass.LineupSlotData> slots = RepeatedMessage.newEmptyInstance(LineupSlotDataOuterClass.LineupSlotData.getFactory());

    private ReplaceLineupCsReq() {
    }

    /**
     * @return a new empty instance of {@code ReplaceLineupCsReq}
     */
    public static ReplaceLineupCsReq newInstance() {
      return new ReplaceLineupCsReq();
    }

    /**
     * <code>optional uint32 plane_id = 1;</code>
     * @return whether the planeId field is set
     */
    public boolean hasPlaneId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 plane_id = 1;</code>
     * @return this
     */
    public ReplaceLineupCsReq clearPlaneId() {
      bitField0_ &= ~0x00000001;
      planeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 1;</code>
     * @return the planeId
     */
    public int getPlaneId() {
      return planeId;
    }

    /**
     * <code>optional uint32 plane_id = 1;</code>
     * @param value the planeId to set
     * @return this
     */
    public ReplaceLineupCsReq setPlaneId(final int value) {
      bitField0_ |= 0x00000001;
      planeId = value;
      return this;
    }

    /**
     * <code>optional uint32 index = 13;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 index = 13;</code>
     * @return this
     */
    public ReplaceLineupCsReq clearIndex() {
      bitField0_ &= ~0x00000002;
      index = 0;
      return this;
    }

    /**
     * <code>optional uint32 index = 13;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <code>optional uint32 index = 13;</code>
     * @param value the index to set
     * @return this
     */
    public ReplaceLineupCsReq setIndex(final int value) {
      bitField0_ |= 0x00000002;
      index = value;
      return this;
    }

    /**
     * <code>optional uint32 leader_slot = 14;</code>
     * @return whether the leaderSlot field is set
     */
    public boolean hasLeaderSlot() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 leader_slot = 14;</code>
     * @return this
     */
    public ReplaceLineupCsReq clearLeaderSlot() {
      bitField0_ &= ~0x00000004;
      leaderSlot = 0;
      return this;
    }

    /**
     * <code>optional uint32 leader_slot = 14;</code>
     * @return the leaderSlot
     */
    public int getLeaderSlot() {
      return leaderSlot;
    }

    /**
     * <code>optional uint32 leader_slot = 14;</code>
     * @param value the leaderSlot to set
     * @return this
     */
    public ReplaceLineupCsReq setLeaderSlot(final int value) {
      bitField0_ |= 0x00000004;
      leaderSlot = value;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @return whether the extraLineupType field is set
     */
    public boolean hasExtraLineupType() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @return this
     */
    public ReplaceLineupCsReq clearExtraLineupType() {
      bitField0_ &= ~0x00000008;
      extraLineupType = 0;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @return the extraLineupType
     */
    public ExtraLineupTypeOuterClass.ExtraLineupType getExtraLineupType() {
      return ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(extraLineupType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link ReplaceLineupCsReq#getExtraLineupType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getExtraLineupTypeValue() {
      return extraLineupType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ExtraLineupTypeOuterClass.ExtraLineupType}. Setting an invalid value
     * can cause {@link ReplaceLineupCsReq#getExtraLineupType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public ReplaceLineupCsReq setExtraLineupTypeValue(final int value) {
      bitField0_ |= 0x00000008;
      extraLineupType = value;
      return this;
    }

    /**
     * <code>optional .ExtraLineupType extra_lineup_type = 2;</code>
     * @param value the extraLineupType to set
     * @return this
     */
    public ReplaceLineupCsReq setExtraLineupType(
        final ExtraLineupTypeOuterClass.ExtraLineupType value) {
      bitField0_ |= 0x00000008;
      extraLineupType = value.getNumber();
      return this;
    }

    /**
     * <code>optional bool is_virtual = 3;</code>
     * @return whether the isVirtual field is set
     */
    public boolean hasIsVirtual() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool is_virtual = 3;</code>
     * @return this
     */
    public ReplaceLineupCsReq clearIsVirtual() {
      bitField0_ &= ~0x00000010;
      isVirtual = false;
      return this;
    }

    /**
     * <code>optional bool is_virtual = 3;</code>
     * @return the isVirtual
     */
    public boolean getIsVirtual() {
      return isVirtual;
    }

    /**
     * <code>optional bool is_virtual = 3;</code>
     * @param value the isVirtual to set
     * @return this
     */
    public ReplaceLineupCsReq setIsVirtual(final boolean value) {
      bitField0_ |= 0x00000010;
      isVirtual = value;
      return this;
    }

    /**
     * <code>repeated .LineupSlotData slots = 11;</code>
     * @return whether the slots field is set
     */
    public boolean hasSlots() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .LineupSlotData slots = 11;</code>
     * @return this
     */
    public ReplaceLineupCsReq clearSlots() {
      bitField0_ &= ~0x00000020;
      slots.clear();
      return this;
    }

    /**
     * <code>repeated .LineupSlotData slots = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSlots()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<LineupSlotDataOuterClass.LineupSlotData> getSlots() {
      return slots;
    }

    /**
     * <code>repeated .LineupSlotData slots = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<LineupSlotDataOuterClass.LineupSlotData> getMutableSlots() {
      bitField0_ |= 0x00000020;
      return slots;
    }

    /**
     * <code>repeated .LineupSlotData slots = 11;</code>
     * @param value the slots to add
     * @return this
     */
    public ReplaceLineupCsReq addSlots(final LineupSlotDataOuterClass.LineupSlotData value) {
      bitField0_ |= 0x00000020;
      slots.add(value);
      return this;
    }

    /**
     * <code>repeated .LineupSlotData slots = 11;</code>
     * @param values the slots to add
     * @return this
     */
    public ReplaceLineupCsReq addAllSlots(final LineupSlotDataOuterClass.LineupSlotData... values) {
      bitField0_ |= 0x00000020;
      slots.addAll(values);
      return this;
    }

    @Override
    public ReplaceLineupCsReq copyFrom(final ReplaceLineupCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        planeId = other.planeId;
        index = other.index;
        leaderSlot = other.leaderSlot;
        extraLineupType = other.extraLineupType;
        isVirtual = other.isVirtual;
        slots.copyFrom(other.slots);
      }
      return this;
    }

    @Override
    public ReplaceLineupCsReq mergeFrom(final ReplaceLineupCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPlaneId()) {
        setPlaneId(other.planeId);
      }
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      if (other.hasLeaderSlot()) {
        setLeaderSlot(other.leaderSlot);
      }
      if (other.hasExtraLineupType()) {
        setExtraLineupTypeValue(other.extraLineupType);
      }
      if (other.hasIsVirtual()) {
        setIsVirtual(other.isVirtual);
      }
      if (other.hasSlots()) {
        getMutableSlots().addAll(other.slots);
      }
      return this;
    }

    @Override
    public ReplaceLineupCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      planeId = 0;
      index = 0;
      leaderSlot = 0;
      extraLineupType = 0;
      isVirtual = false;
      slots.clear();
      return this;
    }

    @Override
    public ReplaceLineupCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      slots.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ReplaceLineupCsReq)) {
        return false;
      }
      ReplaceLineupCsReq other = (ReplaceLineupCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasPlaneId() || planeId == other.planeId)
        && (!hasIndex() || index == other.index)
        && (!hasLeaderSlot() || leaderSlot == other.leaderSlot)
        && (!hasExtraLineupType() || extraLineupType == other.extraLineupType)
        && (!hasIsVirtual() || isVirtual == other.isVirtual)
        && (!hasSlots() || slots.equals(other.slots));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(leaderSlot);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 16);
        output.writeEnumNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 24);
        output.writeBoolNoTag(isVirtual);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < slots.length(); i++) {
          output.writeRawByte((byte) 90);
          output.writeMessageNoTag(slots.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(leaderSlot);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * slots.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(slots);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ReplaceLineupCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // planeId
            planeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // leaderSlot
            leaderSlot = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // extraLineupType
            final int value = input.readInt32();
            if (ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(value) != null) {
              extraLineupType = value;
              bitField0_ |= 0x00000008;
            }
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // isVirtual
            isVirtual = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // slots
            tag = input.readRepeatedMessage(slots, tag);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.planeId, planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.index, index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.leaderSlot, leaderSlot);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeEnum(FieldNames.extraLineupType, extraLineupType, ExtraLineupTypeOuterClass.ExtraLineupType.converter());
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.isVirtual, isVirtual);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.slots, slots);
      }
      output.endObject();
    }

    @Override
    public ReplaceLineupCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -493896553:
          case 1869097438: {
            if (input.isAtField(FieldNames.planeId)) {
              if (!input.trySkipNullValue()) {
                planeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1191442087:
          case -1708713100: {
            if (input.isAtField(FieldNames.leaderSlot)) {
              if (!input.trySkipNullValue()) {
                leaderSlot = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -468135527:
          case -1144475077: {
            if (input.isAtField(FieldNames.extraLineupType)) {
              if (!input.trySkipNullValue()) {
                final ExtraLineupTypeOuterClass.ExtraLineupType value = input.readEnum(ExtraLineupTypeOuterClass.ExtraLineupType.converter());
                if (value != null) {
                  extraLineupType = value.getNumber();
                  bitField0_ |= 0x00000008;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -113613183:
          case 1966475510: {
            if (input.isAtField(FieldNames.isVirtual)) {
              if (!input.trySkipNullValue()) {
                isVirtual = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109532725: {
            if (input.isAtField(FieldNames.slots)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(slots);
                bitField0_ |= 0x00000020;
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
    public ReplaceLineupCsReq clone() {
      return new ReplaceLineupCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ReplaceLineupCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ReplaceLineupCsReq(), data).checkInitialized();
    }

    public static ReplaceLineupCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ReplaceLineupCsReq(), input).checkInitialized();
    }

    public static ReplaceLineupCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ReplaceLineupCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ReplaceLineupCsReq messages
     */
    public static MessageFactory<ReplaceLineupCsReq> getFactory() {
      return ReplaceLineupCsReqFactory.INSTANCE;
    }

    private enum ReplaceLineupCsReqFactory implements MessageFactory<ReplaceLineupCsReq> {
      INSTANCE;

      @Override
      public ReplaceLineupCsReq create() {
        return ReplaceLineupCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName planeId = FieldName.forField("planeId", "plane_id");

      static final FieldName index = FieldName.forField("index");

      static final FieldName leaderSlot = FieldName.forField("leaderSlot", "leader_slot");

      static final FieldName extraLineupType = FieldName.forField("extraLineupType", "extra_lineup_type");

      static final FieldName isVirtual = FieldName.forField("isVirtual", "is_virtual");

      static final FieldName slots = FieldName.forField("slots");
    }
  }
}
