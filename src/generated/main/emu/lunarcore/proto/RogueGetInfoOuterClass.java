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

public final class RogueGetInfoOuterClass {
  /**
   * Protobuf type {@code RogueGetInfo}
   */
  public static final class RogueGetInfo extends ProtoMessage<RogueGetInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueGetVirtualItemInfo rogue_virtual_item_info = 2;</code>
     */
    private final RogueGetVirtualItemInfoOuterClass.RogueGetVirtualItemInfo rogueVirtualItemInfo = RogueGetVirtualItemInfoOuterClass.RogueGetVirtualItemInfo.newInstance();

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 3;</code>
     */
    private final RogueAeonInfoOuterClass.RogueAeonInfo rogueAeonInfo = RogueAeonInfoOuterClass.RogueAeonInfo.newInstance();

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 5;</code>
     */
    private final RogueSeasonInfoOuterClass.RogueSeasonInfo rogueSeasonInfo = RogueSeasonInfoOuterClass.RogueSeasonInfo.newInstance();

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_reward_info = 10;</code>
     */
    private final RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo rogueScoreRewardInfo = RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo.newInstance();

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 12;</code>
     */
    private final RogueAreaInfoOuterClass.RogueAreaInfo rogueAreaInfo = RogueAreaInfoOuterClass.RogueAreaInfo.newInstance();

    private RogueGetInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueGetInfo}
     */
    public static RogueGetInfo newInstance() {
      return new RogueGetInfo();
    }

    /**
     * <code>optional .RogueGetVirtualItemInfo rogue_virtual_item_info = 2;</code>
     * @return whether the rogueVirtualItemInfo field is set
     */
    public boolean hasRogueVirtualItemInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueGetVirtualItemInfo rogue_virtual_item_info = 2;</code>
     * @return this
     */
    public RogueGetInfo clearRogueVirtualItemInfo() {
      bitField0_ &= ~0x00000001;
      rogueVirtualItemInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueGetVirtualItemInfo rogue_virtual_item_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueVirtualItemInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueGetVirtualItemInfoOuterClass.RogueGetVirtualItemInfo getRogueVirtualItemInfo() {
      return rogueVirtualItemInfo;
    }

    /**
     * <code>optional .RogueGetVirtualItemInfo rogue_virtual_item_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueGetVirtualItemInfoOuterClass.RogueGetVirtualItemInfo getMutableRogueVirtualItemInfo(
        ) {
      bitField0_ |= 0x00000001;
      return rogueVirtualItemInfo;
    }

    /**
     * <code>optional .RogueGetVirtualItemInfo rogue_virtual_item_info = 2;</code>
     * @param value the rogueVirtualItemInfo to set
     * @return this
     */
    public RogueGetInfo setRogueVirtualItemInfo(
        final RogueGetVirtualItemInfoOuterClass.RogueGetVirtualItemInfo value) {
      bitField0_ |= 0x00000001;
      rogueVirtualItemInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 3;</code>
     * @return whether the rogueAeonInfo field is set
     */
    public boolean hasRogueAeonInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 3;</code>
     * @return this
     */
    public RogueGetInfo clearRogueAeonInfo() {
      bitField0_ &= ~0x00000002;
      rogueAeonInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAeonInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueAeonInfoOuterClass.RogueAeonInfo getRogueAeonInfo() {
      return rogueAeonInfo;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueAeonInfoOuterClass.RogueAeonInfo getMutableRogueAeonInfo() {
      bitField0_ |= 0x00000002;
      return rogueAeonInfo;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 3;</code>
     * @param value the rogueAeonInfo to set
     * @return this
     */
    public RogueGetInfo setRogueAeonInfo(final RogueAeonInfoOuterClass.RogueAeonInfo value) {
      bitField0_ |= 0x00000002;
      rogueAeonInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 5;</code>
     * @return whether the rogueSeasonInfo field is set
     */
    public boolean hasRogueSeasonInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 5;</code>
     * @return this
     */
    public RogueGetInfo clearRogueSeasonInfo() {
      bitField0_ &= ~0x00000004;
      rogueSeasonInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueSeasonInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueSeasonInfoOuterClass.RogueSeasonInfo getRogueSeasonInfo() {
      return rogueSeasonInfo;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueSeasonInfoOuterClass.RogueSeasonInfo getMutableRogueSeasonInfo() {
      bitField0_ |= 0x00000004;
      return rogueSeasonInfo;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 5;</code>
     * @param value the rogueSeasonInfo to set
     * @return this
     */
    public RogueGetInfo setRogueSeasonInfo(final RogueSeasonInfoOuterClass.RogueSeasonInfo value) {
      bitField0_ |= 0x00000004;
      rogueSeasonInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_reward_info = 10;</code>
     * @return whether the rogueScoreRewardInfo field is set
     */
    public boolean hasRogueScoreRewardInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_reward_info = 10;</code>
     * @return this
     */
    public RogueGetInfo clearRogueScoreRewardInfo() {
      bitField0_ &= ~0x00000008;
      rogueScoreRewardInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_reward_info = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueScoreRewardInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo getRogueScoreRewardInfo() {
      return rogueScoreRewardInfo;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_reward_info = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo getMutableRogueScoreRewardInfo() {
      bitField0_ |= 0x00000008;
      return rogueScoreRewardInfo;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_reward_info = 10;</code>
     * @param value the rogueScoreRewardInfo to set
     * @return this
     */
    public RogueGetInfo setRogueScoreRewardInfo(
        final RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo value) {
      bitField0_ |= 0x00000008;
      rogueScoreRewardInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 12;</code>
     * @return whether the rogueAreaInfo field is set
     */
    public boolean hasRogueAreaInfo() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 12;</code>
     * @return this
     */
    public RogueGetInfo clearRogueAreaInfo() {
      bitField0_ &= ~0x00000010;
      rogueAreaInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAreaInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueAreaInfoOuterClass.RogueAreaInfo getRogueAreaInfo() {
      return rogueAreaInfo;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueAreaInfoOuterClass.RogueAreaInfo getMutableRogueAreaInfo() {
      bitField0_ |= 0x00000010;
      return rogueAreaInfo;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 12;</code>
     * @param value the rogueAreaInfo to set
     * @return this
     */
    public RogueGetInfo setRogueAreaInfo(final RogueAreaInfoOuterClass.RogueAreaInfo value) {
      bitField0_ |= 0x00000010;
      rogueAreaInfo.copyFrom(value);
      return this;
    }

    @Override
    public RogueGetInfo copyFrom(final RogueGetInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueVirtualItemInfo.copyFrom(other.rogueVirtualItemInfo);
        rogueAeonInfo.copyFrom(other.rogueAeonInfo);
        rogueSeasonInfo.copyFrom(other.rogueSeasonInfo);
        rogueScoreRewardInfo.copyFrom(other.rogueScoreRewardInfo);
        rogueAreaInfo.copyFrom(other.rogueAreaInfo);
      }
      return this;
    }

    @Override
    public RogueGetInfo mergeFrom(final RogueGetInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueVirtualItemInfo()) {
        getMutableRogueVirtualItemInfo().mergeFrom(other.rogueVirtualItemInfo);
      }
      if (other.hasRogueAeonInfo()) {
        getMutableRogueAeonInfo().mergeFrom(other.rogueAeonInfo);
      }
      if (other.hasRogueSeasonInfo()) {
        getMutableRogueSeasonInfo().mergeFrom(other.rogueSeasonInfo);
      }
      if (other.hasRogueScoreRewardInfo()) {
        getMutableRogueScoreRewardInfo().mergeFrom(other.rogueScoreRewardInfo);
      }
      if (other.hasRogueAreaInfo()) {
        getMutableRogueAreaInfo().mergeFrom(other.rogueAreaInfo);
      }
      return this;
    }

    @Override
    public RogueGetInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueVirtualItemInfo.clear();
      rogueAeonInfo.clear();
      rogueSeasonInfo.clear();
      rogueScoreRewardInfo.clear();
      rogueAreaInfo.clear();
      return this;
    }

    @Override
    public RogueGetInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueVirtualItemInfo.clearQuick();
      rogueAeonInfo.clearQuick();
      rogueSeasonInfo.clearQuick();
      rogueScoreRewardInfo.clearQuick();
      rogueAreaInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueGetInfo)) {
        return false;
      }
      RogueGetInfo other = (RogueGetInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueVirtualItemInfo() || rogueVirtualItemInfo.equals(other.rogueVirtualItemInfo))
        && (!hasRogueAeonInfo() || rogueAeonInfo.equals(other.rogueAeonInfo))
        && (!hasRogueSeasonInfo() || rogueSeasonInfo.equals(other.rogueSeasonInfo))
        && (!hasRogueScoreRewardInfo() || rogueScoreRewardInfo.equals(other.rogueScoreRewardInfo))
        && (!hasRogueAreaInfo() || rogueAreaInfo.equals(other.rogueAreaInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(rogueVirtualItemInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(rogueSeasonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(rogueScoreRewardInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(rogueAreaInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueVirtualItemInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueSeasonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueScoreRewardInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAreaInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueGetInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // rogueVirtualItemInfo
            input.readMessage(rogueVirtualItemInfo);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // rogueAeonInfo
            input.readMessage(rogueAeonInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // rogueSeasonInfo
            input.readMessage(rogueSeasonInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // rogueScoreRewardInfo
            input.readMessage(rogueScoreRewardInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // rogueAreaInfo
            input.readMessage(rogueAreaInfo);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
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
        output.writeMessage(FieldNames.rogueVirtualItemInfo, rogueVirtualItemInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rogueAeonInfo, rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueSeasonInfo, rogueSeasonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.rogueScoreRewardInfo, rogueScoreRewardInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.rogueAreaInfo, rogueAreaInfo);
      }
      output.endObject();
    }

    @Override
    public RogueGetInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1066755410:
          case 1452147457: {
            if (input.isAtField(FieldNames.rogueVirtualItemInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueVirtualItemInfo);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1685018549:
          case -1375922619: {
            if (input.isAtField(FieldNames.rogueAeonInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAeonInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1037341781:
          case -588845659: {
            if (input.isAtField(FieldNames.rogueSeasonInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueSeasonInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 846991221:
          case -1883919764: {
            if (input.isAtField(FieldNames.rogueScoreRewardInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueScoreRewardInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 964297429:
          case -851505925: {
            if (input.isAtField(FieldNames.rogueAreaInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAreaInfo);
                bitField0_ |= 0x00000010;
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
    public RogueGetInfo clone() {
      return new RogueGetInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueGetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueGetInfo(), data).checkInitialized();
    }

    public static RogueGetInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueGetInfo(), input).checkInitialized();
    }

    public static RogueGetInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueGetInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueGetInfo messages
     */
    public static MessageFactory<RogueGetInfo> getFactory() {
      return RogueGetInfoFactory.INSTANCE;
    }

    private enum RogueGetInfoFactory implements MessageFactory<RogueGetInfo> {
      INSTANCE;

      @Override
      public RogueGetInfo create() {
        return RogueGetInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueVirtualItemInfo = FieldName.forField("rogueVirtualItemInfo", "rogue_virtual_item_info");

      static final FieldName rogueAeonInfo = FieldName.forField("rogueAeonInfo", "rogue_aeon_info");

      static final FieldName rogueSeasonInfo = FieldName.forField("rogueSeasonInfo", "rogue_season_info");

      static final FieldName rogueScoreRewardInfo = FieldName.forField("rogueScoreRewardInfo", "rogue_score_reward_info");

      static final FieldName rogueAreaInfo = FieldName.forField("rogueAreaInfo", "rogue_area_info");
    }
  }
}
