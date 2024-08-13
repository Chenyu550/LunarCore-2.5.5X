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

public final class GetChessRogueBuffEnhanceInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetChessRogueBuffEnhanceInfoScRsp}
   */
  public static final class GetChessRogueBuffEnhanceInfoScRsp extends ProtoMessage<GetChessRogueBuffEnhanceInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 4;</code>
     */
    private final ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList buffEnhanceInfo = ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList.newInstance();

    private GetChessRogueBuffEnhanceInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetChessRogueBuffEnhanceInfoScRsp}
     */
    public static GetChessRogueBuffEnhanceInfoScRsp newInstance() {
      return new GetChessRogueBuffEnhanceInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public GetChessRogueBuffEnhanceInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetChessRogueBuffEnhanceInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 4;</code>
     * @return whether the buffEnhanceInfo field is set
     */
    public boolean hasBuffEnhanceInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 4;</code>
     * @return this
     */
    public GetChessRogueBuffEnhanceInfoScRsp clearBuffEnhanceInfo() {
      bitField0_ &= ~0x00000002;
      buffEnhanceInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 4;</code>
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
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList getMutableBuffEnhanceInfo(
        ) {
      bitField0_ |= 0x00000002;
      return buffEnhanceInfo;
    }

    /**
     * <code>optional .ChessRogueBuffEnhanceList buff_enhance_info = 4;</code>
     * @param value the buffEnhanceInfo to set
     * @return this
     */
    public GetChessRogueBuffEnhanceInfoScRsp setBuffEnhanceInfo(
        final ChessRogueBuffEnhanceListOuterClass.ChessRogueBuffEnhanceList value) {
      bitField0_ |= 0x00000002;
      buffEnhanceInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetChessRogueBuffEnhanceInfoScRsp copyFrom(
        final GetChessRogueBuffEnhanceInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        buffEnhanceInfo.copyFrom(other.buffEnhanceInfo);
      }
      return this;
    }

    @Override
    public GetChessRogueBuffEnhanceInfoScRsp mergeFrom(
        final GetChessRogueBuffEnhanceInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBuffEnhanceInfo()) {
        getMutableBuffEnhanceInfo().mergeFrom(other.buffEnhanceInfo);
      }
      return this;
    }

    @Override
    public GetChessRogueBuffEnhanceInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      buffEnhanceInfo.clear();
      return this;
    }

    @Override
    public GetChessRogueBuffEnhanceInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffEnhanceInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetChessRogueBuffEnhanceInfoScRsp)) {
        return false;
      }
      GetChessRogueBuffEnhanceInfoScRsp other = (GetChessRogueBuffEnhanceInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBuffEnhanceInfo() || buffEnhanceInfo.equals(other.buffEnhanceInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 34);
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
        size += 1 + ProtoSink.computeMessageSizeNoTag(buffEnhanceInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetChessRogueBuffEnhanceInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // buffEnhanceInfo
            input.readMessage(buffEnhanceInfo);
            bitField0_ |= 0x00000002;
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
        output.writeMessage(FieldNames.buffEnhanceInfo, buffEnhanceInfo);
      }
      output.endObject();
    }

    @Override
    public GetChessRogueBuffEnhanceInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -734426583:
          case 2143965195: {
            if (input.isAtField(FieldNames.buffEnhanceInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(buffEnhanceInfo);
                bitField0_ |= 0x00000002;
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
    public GetChessRogueBuffEnhanceInfoScRsp clone() {
      return new GetChessRogueBuffEnhanceInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetChessRogueBuffEnhanceInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetChessRogueBuffEnhanceInfoScRsp(), data).checkInitialized();
    }

    public static GetChessRogueBuffEnhanceInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetChessRogueBuffEnhanceInfoScRsp(), input).checkInitialized();
    }

    public static GetChessRogueBuffEnhanceInfoScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetChessRogueBuffEnhanceInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetChessRogueBuffEnhanceInfoScRsp messages
     */
    public static MessageFactory<GetChessRogueBuffEnhanceInfoScRsp> getFactory() {
      return GetChessRogueBuffEnhanceInfoScRspFactory.INSTANCE;
    }

    private enum GetChessRogueBuffEnhanceInfoScRspFactory implements MessageFactory<GetChessRogueBuffEnhanceInfoScRsp> {
      INSTANCE;

      @Override
      public GetChessRogueBuffEnhanceInfoScRsp create() {
        return GetChessRogueBuffEnhanceInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName buffEnhanceInfo = FieldName.forField("buffEnhanceInfo", "buff_enhance_info");
    }
  }
}
