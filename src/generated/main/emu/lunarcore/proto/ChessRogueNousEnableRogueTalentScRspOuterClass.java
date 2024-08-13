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

public final class ChessRogueNousEnableRogueTalentScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueNousEnableRogueTalentScRsp}
   */
  public static final class ChessRogueNousEnableRogueTalentScRsp extends ProtoMessage<ChessRogueNousEnableRogueTalentScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 GDNBONNPGCN = 4;</code>
     */
    private int gDNBONNPGCN;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueTalentInfoList talent_info_list = 10;</code>
     */
    private final RogueTalentInfoListOuterClass.RogueTalentInfoList talentInfoList = RogueTalentInfoListOuterClass.RogueTalentInfoList.newInstance();

    private ChessRogueNousEnableRogueTalentScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueNousEnableRogueTalentScRsp}
     */
    public static ChessRogueNousEnableRogueTalentScRsp newInstance() {
      return new ChessRogueNousEnableRogueTalentScRsp();
    }

    /**
     * <code>optional uint32 GDNBONNPGCN = 4;</code>
     * @return whether the gDNBONNPGCN field is set
     */
    public boolean hasGDNBONNPGCN() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 GDNBONNPGCN = 4;</code>
     * @return this
     */
    public ChessRogueNousEnableRogueTalentScRsp clearGDNBONNPGCN() {
      bitField0_ &= ~0x00000001;
      gDNBONNPGCN = 0;
      return this;
    }

    /**
     * <code>optional uint32 GDNBONNPGCN = 4;</code>
     * @return the gDNBONNPGCN
     */
    public int getGDNBONNPGCN() {
      return gDNBONNPGCN;
    }

    /**
     * <code>optional uint32 GDNBONNPGCN = 4;</code>
     * @param value the gDNBONNPGCN to set
     * @return this
     */
    public ChessRogueNousEnableRogueTalentScRsp setGDNBONNPGCN(final int value) {
      bitField0_ |= 0x00000001;
      gDNBONNPGCN = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public ChessRogueNousEnableRogueTalentScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChessRogueNousEnableRogueTalentScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueTalentInfoList talent_info_list = 10;</code>
     * @return whether the talentInfoList field is set
     */
    public boolean hasTalentInfoList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueTalentInfoList talent_info_list = 10;</code>
     * @return this
     */
    public ChessRogueNousEnableRogueTalentScRsp clearTalentInfoList() {
      bitField0_ &= ~0x00000004;
      talentInfoList.clear();
      return this;
    }

    /**
     * <code>optional .RogueTalentInfoList talent_info_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTalentInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueTalentInfoListOuterClass.RogueTalentInfoList getTalentInfoList() {
      return talentInfoList;
    }

    /**
     * <code>optional .RogueTalentInfoList talent_info_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueTalentInfoListOuterClass.RogueTalentInfoList getMutableTalentInfoList() {
      bitField0_ |= 0x00000004;
      return talentInfoList;
    }

    /**
     * <code>optional .RogueTalentInfoList talent_info_list = 10;</code>
     * @param value the talentInfoList to set
     * @return this
     */
    public ChessRogueNousEnableRogueTalentScRsp setTalentInfoList(
        final RogueTalentInfoListOuterClass.RogueTalentInfoList value) {
      bitField0_ |= 0x00000004;
      talentInfoList.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueNousEnableRogueTalentScRsp copyFrom(
        final ChessRogueNousEnableRogueTalentScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gDNBONNPGCN = other.gDNBONNPGCN;
        retcode = other.retcode;
        talentInfoList.copyFrom(other.talentInfoList);
      }
      return this;
    }

    @Override
    public ChessRogueNousEnableRogueTalentScRsp mergeFrom(
        final ChessRogueNousEnableRogueTalentScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGDNBONNPGCN()) {
        setGDNBONNPGCN(other.gDNBONNPGCN);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTalentInfoList()) {
        getMutableTalentInfoList().mergeFrom(other.talentInfoList);
      }
      return this;
    }

    @Override
    public ChessRogueNousEnableRogueTalentScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gDNBONNPGCN = 0;
      retcode = 0;
      talentInfoList.clear();
      return this;
    }

    @Override
    public ChessRogueNousEnableRogueTalentScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      talentInfoList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueNousEnableRogueTalentScRsp)) {
        return false;
      }
      ChessRogueNousEnableRogueTalentScRsp other = (ChessRogueNousEnableRogueTalentScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasGDNBONNPGCN() || gDNBONNPGCN == other.gDNBONNPGCN)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTalentInfoList() || talentInfoList.equals(other.talentInfoList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(gDNBONNPGCN);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(talentInfoList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gDNBONNPGCN);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(talentInfoList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueNousEnableRogueTalentScRsp mergeFrom(final ProtoSource input) throws
        IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // gDNBONNPGCN
            gDNBONNPGCN = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // talentInfoList
            input.readMessage(talentInfoList);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.gDNBONNPGCN, gDNBONNPGCN);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.talentInfoList, talentInfoList);
      }
      output.endObject();
    }

    @Override
    public ChessRogueNousEnableRogueTalentScRsp mergeFrom(final JsonSource input) throws
        IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 7202560: {
            if (input.isAtField(FieldNames.gDNBONNPGCN)) {
              if (!input.trySkipNullValue()) {
                gDNBONNPGCN = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -363598984:
          case 1545287164: {
            if (input.isAtField(FieldNames.talentInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(talentInfoList);
                bitField0_ |= 0x00000004;
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
    public ChessRogueNousEnableRogueTalentScRsp clone() {
      return new ChessRogueNousEnableRogueTalentScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueNousEnableRogueTalentScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueNousEnableRogueTalentScRsp(), data).checkInitialized();
    }

    public static ChessRogueNousEnableRogueTalentScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousEnableRogueTalentScRsp(), input).checkInitialized();
    }

    public static ChessRogueNousEnableRogueTalentScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousEnableRogueTalentScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueNousEnableRogueTalentScRsp messages
     */
    public static MessageFactory<ChessRogueNousEnableRogueTalentScRsp> getFactory() {
      return ChessRogueNousEnableRogueTalentScRspFactory.INSTANCE;
    }

    private enum ChessRogueNousEnableRogueTalentScRspFactory implements MessageFactory<ChessRogueNousEnableRogueTalentScRsp> {
      INSTANCE;

      @Override
      public ChessRogueNousEnableRogueTalentScRsp create() {
        return ChessRogueNousEnableRogueTalentScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gDNBONNPGCN = FieldName.forField("GDNBONNPGCN");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName talentInfoList = FieldName.forField("talentInfoList", "talent_info_list");
    }
  }
}
