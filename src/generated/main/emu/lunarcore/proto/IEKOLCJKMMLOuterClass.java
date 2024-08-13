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

public final class IEKOLCJKMMLOuterClass {
  /**
   * Protobuf type {@code IEKOLCJKMML}
   */
  public static final class IEKOLCJKMML extends ProtoMessage<IEKOLCJKMML> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 DCECFOKFIHH = 2;</code>
     */
    private int dCECFOKFIHH;

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 5;</code>
     */
    private final RepeatedInt iPAPJCOAIFG = RepeatedInt.newEmptyInstance();

    private IEKOLCJKMML() {
    }

    /**
     * @return a new empty instance of {@code IEKOLCJKMML}
     */
    public static IEKOLCJKMML newInstance() {
      return new IEKOLCJKMML();
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 2;</code>
     * @return whether the dCECFOKFIHH field is set
     */
    public boolean hasDCECFOKFIHH() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 2;</code>
     * @return this
     */
    public IEKOLCJKMML clearDCECFOKFIHH() {
      bitField0_ &= ~0x00000001;
      dCECFOKFIHH = 0;
      return this;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 2;</code>
     * @return the dCECFOKFIHH
     */
    public int getDCECFOKFIHH() {
      return dCECFOKFIHH;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 2;</code>
     * @param value the dCECFOKFIHH to set
     * @return this
     */
    public IEKOLCJKMML setDCECFOKFIHH(final int value) {
      bitField0_ |= 0x00000001;
      dCECFOKFIHH = value;
      return this;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 5;</code>
     * @return whether the iPAPJCOAIFG field is set
     */
    public boolean hasIPAPJCOAIFG() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 5;</code>
     * @return this
     */
    public IEKOLCJKMML clearIPAPJCOAIFG() {
      bitField0_ &= ~0x00000002;
      iPAPJCOAIFG.clear();
      return this;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 5;</code>
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
     * <code>repeated uint32 IPAPJCOAIFG = 5;</code>
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
     * <code>repeated uint32 IPAPJCOAIFG = 5;</code>
     * @param value the iPAPJCOAIFG to add
     * @return this
     */
    public IEKOLCJKMML addIPAPJCOAIFG(final int value) {
      bitField0_ |= 0x00000002;
      iPAPJCOAIFG.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 IPAPJCOAIFG = 5;</code>
     * @param values the iPAPJCOAIFG to add
     * @return this
     */
    public IEKOLCJKMML addAllIPAPJCOAIFG(final int... values) {
      bitField0_ |= 0x00000002;
      iPAPJCOAIFG.addAll(values);
      return this;
    }

    @Override
    public IEKOLCJKMML copyFrom(final IEKOLCJKMML other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dCECFOKFIHH = other.dCECFOKFIHH;
        iPAPJCOAIFG.copyFrom(other.iPAPJCOAIFG);
      }
      return this;
    }

    @Override
    public IEKOLCJKMML mergeFrom(final IEKOLCJKMML other) {
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
    public IEKOLCJKMML clear() {
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
    public IEKOLCJKMML clearQuick() {
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
      if (!(o instanceof IEKOLCJKMML)) {
        return false;
      }
      IEKOLCJKMML other = (IEKOLCJKMML) o;
      return bitField0_ == other.bitField0_
        && (!hasDCECFOKFIHH() || dCECFOKFIHH == other.dCECFOKFIHH)
        && (!hasIPAPJCOAIFG() || iPAPJCOAIFG.equals(other.iPAPJCOAIFG));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(dCECFOKFIHH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < iPAPJCOAIFG.length(); i++) {
          output.writeRawByte((byte) 40);
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
    public IEKOLCJKMML mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // dCECFOKFIHH
            dCECFOKFIHH = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
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
          case 40: {
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
    public IEKOLCJKMML mergeFrom(final JsonSource input) throws IOException {
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
    public IEKOLCJKMML clone() {
      return new IEKOLCJKMML().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static IEKOLCJKMML parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new IEKOLCJKMML(), data).checkInitialized();
    }

    public static IEKOLCJKMML parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new IEKOLCJKMML(), input).checkInitialized();
    }

    public static IEKOLCJKMML parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new IEKOLCJKMML(), input).checkInitialized();
    }

    /**
     * @return factory for creating IEKOLCJKMML messages
     */
    public static MessageFactory<IEKOLCJKMML> getFactory() {
      return IEKOLCJKMMLFactory.INSTANCE;
    }

    private enum IEKOLCJKMMLFactory implements MessageFactory<IEKOLCJKMML> {
      INSTANCE;

      @Override
      public IEKOLCJKMML create() {
        return IEKOLCJKMML.newInstance();
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
