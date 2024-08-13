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
import us.hebi.quickbuf.RepeatedInt;

public final class NILLPIGHKGKOuterClass {
  /**
   * Protobuf type {@code NILLPIGHKGK}
   */
  public static final class NILLPIGHKGK extends ProtoMessage<NILLPIGHKGK> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 DCECFOKFIHH = 3;</code>
     */
    private int dCECFOKFIHH;

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 11;</code>
     */
    private final RepeatedInt iPAPJCOAIFG = RepeatedInt.newEmptyInstance();

    private NILLPIGHKGK() {
    }

    /**
     * @return a new empty instance of {@code NILLPIGHKGK}
     */
    public static NILLPIGHKGK newInstance() {
      return new NILLPIGHKGK();
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 3;</code>
     * @return whether the dCECFOKFIHH field is set
     */
    public boolean hasDCECFOKFIHH() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 3;</code>
     * @return this
     */
    public NILLPIGHKGK clearDCECFOKFIHH() {
      bitField0_ &= ~0x00000001;
      dCECFOKFIHH = 0;
      return this;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 3;</code>
     * @return the dCECFOKFIHH
     */
    public int getDCECFOKFIHH() {
      return dCECFOKFIHH;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 3;</code>
     * @param value the dCECFOKFIHH to set
     * @return this
     */
    public NILLPIGHKGK setDCECFOKFIHH(final int value) {
      bitField0_ |= 0x00000001;
      dCECFOKFIHH = value;
      return this;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 11;</code>
     * @return whether the iPAPJCOAIFG field is set
     */
    public boolean hasIPAPJCOAIFG() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 11;</code>
     * @return this
     */
    public NILLPIGHKGK clearIPAPJCOAIFG() {
      bitField0_ &= ~0x00000002;
      iPAPJCOAIFG.clear();
      return this;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableIPAPJCOAIFG()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getIPAPJCOAIFG() {
      return iPAPJCOAIFG;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableIPAPJCOAIFG() {
      bitField0_ |= 0x00000002;
      return iPAPJCOAIFG;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 11;</code>
     * @param value the iPAPJCOAIFG to add
     * @return this
     */
    public NILLPIGHKGK addIPAPJCOAIFG(final int value) {
      bitField0_ |= 0x00000002;
      iPAPJCOAIFG.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 11;</code>
     * @param values the iPAPJCOAIFG to add
     * @return this
     */
    public NILLPIGHKGK addAllIPAPJCOAIFG(final int... values) {
      bitField0_ |= 0x00000002;
      iPAPJCOAIFG.addAll(values);
      return this;
    }

    @Override
    public NILLPIGHKGK copyFrom(final NILLPIGHKGK other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dCECFOKFIHH = other.dCECFOKFIHH;
        iPAPJCOAIFG.copyFrom(other.iPAPJCOAIFG);
      }
      return this;
    }

    @Override
    public NILLPIGHKGK mergeFrom(final NILLPIGHKGK other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDCECFOKFIHH()) {
        setDCECFOKFIHH(other.dCECFOKFIHH);
      }
      if (other.hasIPAPJCOAIFG()) {
        getMutableIPAPJCOAIFG().addAll(other.iPAPJCOAIFG);
      }
      return this;
    }

    @Override
    public NILLPIGHKGK clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dCECFOKFIHH = 0;
      iPAPJCOAIFG.clear();
      return this;
    }

    @Override
    public NILLPIGHKGK clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      iPAPJCOAIFG.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof NILLPIGHKGK)) {
        return false;
      }
      NILLPIGHKGK other = (NILLPIGHKGK) o;
      return bitField0_ == other.bitField0_
        && (!hasDCECFOKFIHH() || dCECFOKFIHH == other.dCECFOKFIHH)
        && (!hasIPAPJCOAIFG() || iPAPJCOAIFG.equals(other.iPAPJCOAIFG));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(dCECFOKFIHH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < iPAPJCOAIFG.length(); i++) {
          output.writeRawByte((byte) 88);
          output.writeUInt32NoTag(iPAPJCOAIFG.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dCECFOKFIHH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * iPAPJCOAIFG.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(iPAPJCOAIFG);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NILLPIGHKGK mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // dCECFOKFIHH
            dCECFOKFIHH = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // iPAPJCOAIFG [packed=true]
            input.readPackedUInt32(iPAPJCOAIFG, tag);
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
          case 88: {
            // iPAPJCOAIFG [packed=false]
            tag = input.readRepeatedUInt32(iPAPJCOAIFG, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.dCECFOKFIHH, dCECFOKFIHH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.iPAPJCOAIFG, iPAPJCOAIFG);
      }
      output.endObject();
    }

    @Override
    public NILLPIGHKGK mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1537368920: {
            if (input.isAtField(FieldNames.dCECFOKFIHH)) {
              if (!input.trySkipNullValue()) {
                dCECFOKFIHH = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1455275575: {
            if (input.isAtField(FieldNames.iPAPJCOAIFG)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(iPAPJCOAIFG);
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
    public NILLPIGHKGK clone() {
      return new NILLPIGHKGK().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NILLPIGHKGK parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NILLPIGHKGK(), data).checkInitialized();
    }

    public static NILLPIGHKGK parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NILLPIGHKGK(), input).checkInitialized();
    }

    public static NILLPIGHKGK parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NILLPIGHKGK(), input).checkInitialized();
    }

    /**
     * @return factory for creating NILLPIGHKGK messages
     */
    public static MessageFactory<NILLPIGHKGK> getFactory() {
      return NILLPIGHKGKFactory.INSTANCE;
    }

    private enum NILLPIGHKGKFactory implements MessageFactory<NILLPIGHKGK> {
      INSTANCE;

      @Override
      public NILLPIGHKGK create() {
        return NILLPIGHKGK.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dCECFOKFIHH = FieldName.forField("DCECFOKFIHH");

      static final FieldName iPAPJCOAIFG = FieldName.forField("IPAPJCOAIFG");
    }
  }
}
