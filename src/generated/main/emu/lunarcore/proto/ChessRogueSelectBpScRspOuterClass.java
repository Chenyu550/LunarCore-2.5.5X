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

public final class ChessRogueSelectBpScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueSelectBpScRsp}
   */
  public static final class ChessRogueSelectBpScRsp extends ProtoMessage<ChessRogueSelectBpScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 6;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 BMHALFGGHAE = 7;</code>
     */
    private int bMHALFGGHAE;

    /**
     * <code>optional .PDANDAJEPHK LHCALIBHDFJ = 9;</code>
     */
    private final PDANDAJEPHKOuterClass.PDANDAJEPHK lHCALIBHDFJ = PDANDAJEPHKOuterClass.PDANDAJEPHK.newInstance();

    private ChessRogueSelectBpScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueSelectBpScRsp}
     */
    public static ChessRogueSelectBpScRsp newInstance() {
      return new ChessRogueSelectBpScRsp();
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return this
     */
    public ChessRogueSelectBpScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChessRogueSelectBpScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 BMHALFGGHAE = 7;</code>
     * @return whether the bMHALFGGHAE field is set
     */
    public boolean hasBMHALFGGHAE() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 BMHALFGGHAE = 7;</code>
     * @return this
     */
    public ChessRogueSelectBpScRsp clearBMHALFGGHAE() {
      bitField0_ &= ~0x00000002;
      bMHALFGGHAE = 0;
      return this;
    }

    /**
     * <code>optional uint32 BMHALFGGHAE = 7;</code>
     * @return the bMHALFGGHAE
     */
    public int getBMHALFGGHAE() {
      return bMHALFGGHAE;
    }

    /**
     * <code>optional uint32 BMHALFGGHAE = 7;</code>
     * @param value the bMHALFGGHAE to set
     * @return this
     */
    public ChessRogueSelectBpScRsp setBMHALFGGHAE(final int value) {
      bitField0_ |= 0x00000002;
      bMHALFGGHAE = value;
      return this;
    }

    /**
     * <code>optional .PDANDAJEPHK LHCALIBHDFJ = 9;</code>
     * @return whether the lHCALIBHDFJ field is set
     */
    public boolean hasLHCALIBHDFJ() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .PDANDAJEPHK LHCALIBHDFJ = 9;</code>
     * @return this
     */
    public ChessRogueSelectBpScRsp clearLHCALIBHDFJ() {
      bitField0_ &= ~0x00000004;
      lHCALIBHDFJ.clear();
      return this;
    }

    /**
     * <code>optional .PDANDAJEPHK LHCALIBHDFJ = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLHCALIBHDFJ()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PDANDAJEPHKOuterClass.PDANDAJEPHK getLHCALIBHDFJ() {
      return lHCALIBHDFJ;
    }

    /**
     * <code>optional .PDANDAJEPHK LHCALIBHDFJ = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PDANDAJEPHKOuterClass.PDANDAJEPHK getMutableLHCALIBHDFJ() {
      bitField0_ |= 0x00000004;
      return lHCALIBHDFJ;
    }

    /**
     * <code>optional .PDANDAJEPHK LHCALIBHDFJ = 9;</code>
     * @param value the lHCALIBHDFJ to set
     * @return this
     */
    public ChessRogueSelectBpScRsp setLHCALIBHDFJ(final PDANDAJEPHKOuterClass.PDANDAJEPHK value) {
      bitField0_ |= 0x00000004;
      lHCALIBHDFJ.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueSelectBpScRsp copyFrom(final ChessRogueSelectBpScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        bMHALFGGHAE = other.bMHALFGGHAE;
        lHCALIBHDFJ.copyFrom(other.lHCALIBHDFJ);
      }
      return this;
    }

    @Override
    public ChessRogueSelectBpScRsp mergeFrom(final ChessRogueSelectBpScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBMHALFGGHAE()) {
        setBMHALFGGHAE(other.bMHALFGGHAE);
      }
      if (other.hasLHCALIBHDFJ()) {
        getMutableLHCALIBHDFJ().mergeFrom(other.lHCALIBHDFJ);
      }
      return this;
    }

    @Override
    public ChessRogueSelectBpScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      bMHALFGGHAE = 0;
      lHCALIBHDFJ.clear();
      return this;
    }

    @Override
    public ChessRogueSelectBpScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lHCALIBHDFJ.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueSelectBpScRsp)) {
        return false;
      }
      ChessRogueSelectBpScRsp other = (ChessRogueSelectBpScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBMHALFGGHAE() || bMHALFGGHAE == other.bMHALFGGHAE)
        && (!hasLHCALIBHDFJ() || lHCALIBHDFJ.equals(other.lHCALIBHDFJ));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(bMHALFGGHAE);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(lHCALIBHDFJ);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bMHALFGGHAE);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(lHCALIBHDFJ);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueSelectBpScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // bMHALFGGHAE
            bMHALFGGHAE = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // lHCALIBHDFJ
            input.readMessage(lHCALIBHDFJ);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.bMHALFGGHAE, bMHALFGGHAE);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.lHCALIBHDFJ, lHCALIBHDFJ);
      }
      output.endObject();
    }

    @Override
    public ChessRogueSelectBpScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 542076238: {
            if (input.isAtField(FieldNames.bMHALFGGHAE)) {
              if (!input.trySkipNullValue()) {
                bMHALFGGHAE = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1263633035: {
            if (input.isAtField(FieldNames.lHCALIBHDFJ)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(lHCALIBHDFJ);
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
    public ChessRogueSelectBpScRsp clone() {
      return new ChessRogueSelectBpScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueSelectBpScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectBpScRsp(), data).checkInitialized();
    }

    public static ChessRogueSelectBpScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectBpScRsp(), input).checkInitialized();
    }

    public static ChessRogueSelectBpScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectBpScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueSelectBpScRsp messages
     */
    public static MessageFactory<ChessRogueSelectBpScRsp> getFactory() {
      return ChessRogueSelectBpScRspFactory.INSTANCE;
    }

    private enum ChessRogueSelectBpScRspFactory implements MessageFactory<ChessRogueSelectBpScRsp> {
      INSTANCE;

      @Override
      public ChessRogueSelectBpScRsp create() {
        return ChessRogueSelectBpScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName bMHALFGGHAE = FieldName.forField("BMHALFGGHAE");

      static final FieldName lHCALIBHDFJ = FieldName.forField("LHCALIBHDFJ");
    }
  }
}
