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

public final class EnhanceChessRogueBuffScRspOuterClass {
  /**
   * Protobuf type {@code EnhanceChessRogueBuffScRsp}
   */
  public static final class EnhanceChessRogueBuffScRsp extends ProtoMessage<EnhanceChessRogueBuffScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 5;</code>
     */
    private int retcode;

    /**
     * <code>optional bool is_success = 7;</code>
     */
    private boolean isSuccess;

    /**
     * <code>optional .RogueCommonBuff rogue_buff = 4;</code>
     */
    private final RogueCommonBuffOuterClass.RogueCommonBuff rogueBuff = RogueCommonBuffOuterClass.RogueCommonBuff.newInstance();

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 8;</code>
     */
    private final ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList buffEnhanceInfo = ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList.newInstance();

    private EnhanceChessRogueBuffScRsp() {
    }

    /**
     * @return a new empty instance of {@code EnhanceChessRogueBuffScRsp}
     */
    public static EnhanceChessRogueBuffScRsp newInstance() {
      return new EnhanceChessRogueBuffScRsp();
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return this
     */
    public EnhanceChessRogueBuffScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @param value the retcode to set
     * @return this
     */
    public EnhanceChessRogueBuffScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional bool is_success = 7;</code>
     * @return whether the isSuccess field is set
     */
    public boolean hasIsSuccess() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_success = 7;</code>
     * @return this
     */
    public EnhanceChessRogueBuffScRsp clearIsSuccess() {
      bitField0_ &= ~0x00000002;
      isSuccess = false;
      return this;
    }

    /**
     * <code>optional bool is_success = 7;</code>
     * @return the isSuccess
     */
    public boolean getIsSuccess() {
      return isSuccess;
    }

    /**
     * <code>optional bool is_success = 7;</code>
     * @param value the isSuccess to set
     * @return this
     */
    public EnhanceChessRogueBuffScRsp setIsSuccess(final boolean value) {
      bitField0_ |= 0x00000002;
      isSuccess = value;
      return this;
    }

    /**
     * <code>optional .RogueCommonBuff rogue_buff = 4;</code>
     * @return whether the rogueBuff field is set
     */
    public boolean hasRogueBuff() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueCommonBuff rogue_buff = 4;</code>
     * @return this
     */
    public EnhanceChessRogueBuffScRsp clearRogueBuff() {
      bitField0_ &= ~0x00000004;
      rogueBuff.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonBuff rogue_buff = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueBuff()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonBuffOuterClass.RogueCommonBuff getRogueBuff() {
      return rogueBuff;
    }

    /**
     * <code>optional .RogueCommonBuff rogue_buff = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonBuffOuterClass.RogueCommonBuff getMutableRogueBuff() {
      bitField0_ |= 0x00000004;
      return rogueBuff;
    }

    /**
     * <code>optional .RogueCommonBuff rogue_buff = 4;</code>
     * @param value the rogueBuff to set
     * @return this
     */
    public EnhanceChessRogueBuffScRsp setRogueBuff(
        final RogueCommonBuffOuterClass.RogueCommonBuff value) {
      bitField0_ |= 0x00000004;
      rogueBuff.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 8;</code>
     * @return whether the buffEnhanceInfo field is set
     */
    public boolean hasBuffEnhanceInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 8;</code>
     * @return this
     */
    public EnhanceChessRogueBuffScRsp clearBuffEnhanceInfo() {
      bitField0_ &= ~0x00000008;
      buffEnhanceInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffEnhanceInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList getBuffEnhanceInfo() {
      return buffEnhanceInfo;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList getMutableBuffEnhanceInfo(
        ) {
      bitField0_ |= 0x00000008;
      return buffEnhanceInfo;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 8;</code>
     * @param value the buffEnhanceInfo to set
     * @return this
     */
    public EnhanceChessRogueBuffScRsp setBuffEnhanceInfo(
        final ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList value) {
      bitField0_ |= 0x00000008;
      buffEnhanceInfo.copyFrom(value);
      return this;
    }

    @Override
    public EnhanceChessRogueBuffScRsp copyFrom(final EnhanceChessRogueBuffScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        isSuccess = other.isSuccess;
        rogueBuff.copyFrom(other.rogueBuff);
        buffEnhanceInfo.copyFrom(other.buffEnhanceInfo);
      }
      return this;
    }

    @Override
    public EnhanceChessRogueBuffScRsp mergeFrom(final EnhanceChessRogueBuffScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasIsSuccess()) {
        setIsSuccess(other.isSuccess);
      }
      if (other.hasRogueBuff()) {
        getMutableRogueBuff().mergeFrom(other.rogueBuff);
      }
      if (other.hasBuffEnhanceInfo()) {
        getMutableBuffEnhanceInfo().mergeFrom(other.buffEnhanceInfo);
      }
      return this;
    }

    @Override
    public EnhanceChessRogueBuffScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      isSuccess = false;
      rogueBuff.clear();
      buffEnhanceInfo.clear();
      return this;
    }

    @Override
    public EnhanceChessRogueBuffScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueBuff.clearQuick();
      buffEnhanceInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EnhanceChessRogueBuffScRsp)) {
        return false;
      }
      EnhanceChessRogueBuffScRsp other = (EnhanceChessRogueBuffScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasIsSuccess() || isSuccess == other.isSuccess)
        && (!hasRogueBuff() || rogueBuff.equals(other.rogueBuff))
        && (!hasBuffEnhanceInfo() || buffEnhanceInfo.equals(other.buffEnhanceInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeBoolNoTag(isSuccess);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(rogueBuff);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(buffEnhanceInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueBuff);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(buffEnhanceInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnhanceChessRogueBuffScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // isSuccess
            isSuccess = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // rogueBuff
            input.readMessage(rogueBuff);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // buffEnhanceInfo
            input.readMessage(buffEnhanceInfo);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isSuccess, isSuccess);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueBuff, rogueBuff);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.buffEnhanceInfo, buffEnhanceInfo);
      }
      output.endObject();
    }

    @Override
    public EnhanceChessRogueBuffScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1848018809:
          case -366859794: {
            if (input.isAtField(FieldNames.isSuccess)) {
              if (!input.trySkipNullValue()) {
                isSuccess = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 655607117:
          case -1124785256: {
            if (input.isAtField(FieldNames.rogueBuff)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueBuff);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -734426583:
          case 2143965195: {
            if (input.isAtField(FieldNames.buffEnhanceInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(buffEnhanceInfo);
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
    public EnhanceChessRogueBuffScRsp clone() {
      return new EnhanceChessRogueBuffScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnhanceChessRogueBuffScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnhanceChessRogueBuffScRsp(), data).checkInitialized();
    }

    public static EnhanceChessRogueBuffScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnhanceChessRogueBuffScRsp(), input).checkInitialized();
    }

    public static EnhanceChessRogueBuffScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnhanceChessRogueBuffScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnhanceChessRogueBuffScRsp messages
     */
    public static MessageFactory<EnhanceChessRogueBuffScRsp> getFactory() {
      return EnhanceChessRogueBuffScRspFactory.INSTANCE;
    }

    private enum EnhanceChessRogueBuffScRspFactory implements MessageFactory<EnhanceChessRogueBuffScRsp> {
      INSTANCE;

      @Override
      public EnhanceChessRogueBuffScRsp create() {
        return EnhanceChessRogueBuffScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName isSuccess = FieldName.forField("isSuccess", "is_success");

      static final FieldName rogueBuff = FieldName.forField("rogueBuff", "rogue_buff");

      static final FieldName buffEnhanceInfo = FieldName.forField("buffEnhanceInfo", "buff_enhance_info");
    }
  }
}
