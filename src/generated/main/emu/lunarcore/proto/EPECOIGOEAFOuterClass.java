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

public final class EPECOIGOEAFOuterClass {
  /**
   * Protobuf type {@code EPECOIGOEAF}
   */
  public static final class EPECOIGOEAF extends ProtoMessage<EPECOIGOEAF> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 DCECFOKFIHH = 6;</code>
     */
    private int dCECFOKFIHH;

    /**
     * <code>repeated uint32 ICELECFCEJN = 5;</code>
     */
    private final RepeatedInt iCELECFCEJN = RepeatedInt.newEmptyInstance();

    private EPECOIGOEAF() {
    }

    /**
     * @return a new empty instance of {@code EPECOIGOEAF}
     */
    public static EPECOIGOEAF newInstance() {
      return new EPECOIGOEAF();
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 6;</code>
     * @return whether the dCECFOKFIHH field is set
     */
    public boolean hasDCECFOKFIHH() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 6;</code>
     * @return this
     */
    public EPECOIGOEAF clearDCECFOKFIHH() {
      bitField0_ &= ~0x00000001;
      dCECFOKFIHH = 0;
      return this;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 6;</code>
     * @return the dCECFOKFIHH
     */
    public int getDCECFOKFIHH() {
      return dCECFOKFIHH;
    }

    /**
     * <code>optional uint32 DCECFOKFIHH = 6;</code>
     * @param value the dCECFOKFIHH to set
     * @return this
     */
    public EPECOIGOEAF setDCECFOKFIHH(final int value) {
      bitField0_ |= 0x00000001;
      dCECFOKFIHH = value;
      return this;
    }

    /**
     * <code>repeated uint32 ICELECFCEJN = 5;</code>
     * @return whether the iCELECFCEJN field is set
     */
    public boolean hasICELECFCEJN() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 ICELECFCEJN = 5;</code>
     * @return this
     */
    public EPECOIGOEAF clearICELECFCEJN() {
      bitField0_ &= ~0x00000002;
      iCELECFCEJN.clear();
      return this;
    }

    /**
     * <code>repeated uint32 ICELECFCEJN = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableICELECFCEJN()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getICELECFCEJN() {
      return iCELECFCEJN;
    }

    /**
     * <code>repeated uint32 ICELECFCEJN = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableICELECFCEJN() {
      bitField0_ |= 0x00000002;
      return iCELECFCEJN;
    }

    /**
     * <code>repeated uint32 ICELECFCEJN = 5;</code>
     * @param value the iCELECFCEJN to add
     * @return this
     */
    public EPECOIGOEAF addICELECFCEJN(final int value) {
      bitField0_ |= 0x00000002;
      iCELECFCEJN.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 ICELECFCEJN = 5;</code>
     * @param values the iCELECFCEJN to add
     * @return this
     */
    public EPECOIGOEAF addAllICELECFCEJN(final int... values) {
      bitField0_ |= 0x00000002;
      iCELECFCEJN.addAll(values);
      return this;
    }

    @Override
    public EPECOIGOEAF copyFrom(final EPECOIGOEAF other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dCECFOKFIHH = other.dCECFOKFIHH;
        iCELECFCEJN.copyFrom(other.iCELECFCEJN);
      }
      return this;
    }

    @Override
    public EPECOIGOEAF mergeFrom(final EPECOIGOEAF other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDCECFOKFIHH()) {
        setDCECFOKFIHH(other.dCECFOKFIHH);
      }
      if (other.hasICELECFCEJN()) {
        getMutableICELECFCEJN().addAll(other.iCELECFCEJN);
      }
      return this;
    }

    @Override
    public EPECOIGOEAF clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dCECFOKFIHH = 0;
      iCELECFCEJN.clear();
      return this;
    }

    @Override
    public EPECOIGOEAF clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      iCELECFCEJN.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EPECOIGOEAF)) {
        return false;
      }
      EPECOIGOEAF other = (EPECOIGOEAF) o;
      return bitField0_ == other.bitField0_
        && (!hasDCECFOKFIHH() || dCECFOKFIHH == other.dCECFOKFIHH)
        && (!hasICELECFCEJN() || iCELECFCEJN.equals(other.iCELECFCEJN));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(dCECFOKFIHH);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < iCELECFCEJN.length(); i++) {
          output.writeRawByte((byte) 40);
          output.writeUInt32NoTag(iCELECFCEJN.array()[i]);
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
        size += (1 * iCELECFCEJN.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(iCELECFCEJN);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EPECOIGOEAF mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // dCECFOKFIHH
            dCECFOKFIHH = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // iCELECFCEJN [packed=true]
            input.readPackedUInt32(iCELECFCEJN, tag);
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
            // iCELECFCEJN [packed=false]
            tag = input.readRepeatedUInt32(iCELECFCEJN, tag);
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
        output.writeRepeatedUInt32(FieldNames.iCELECFCEJN, iCELECFCEJN);
      }
      output.endObject();
    }

    @Override
    public EPECOIGOEAF mergeFrom(final JsonSource input) throws IOException {
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
          case -367564243: {
            if (input.isAtField(FieldNames.iCELECFCEJN)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(iCELECFCEJN);
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
    public EPECOIGOEAF clone() {
      return new EPECOIGOEAF().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EPECOIGOEAF parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EPECOIGOEAF(), data).checkInitialized();
    }

    public static EPECOIGOEAF parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EPECOIGOEAF(), input).checkInitialized();
    }

    public static EPECOIGOEAF parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EPECOIGOEAF(), input).checkInitialized();
    }

    /**
     * @return factory for creating EPECOIGOEAF messages
     */
    public static MessageFactory<EPECOIGOEAF> getFactory() {
      return EPECOIGOEAFFactory.INSTANCE;
    }

    private enum EPECOIGOEAFFactory implements MessageFactory<EPECOIGOEAF> {
      INSTANCE;

      @Override
      public EPECOIGOEAF create() {
        return EPECOIGOEAF.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dCECFOKFIHH = FieldName.forField("DCECFOKFIHH");

      static final FieldName iCELECFCEJN = FieldName.forField("ICELECFCEJN");
    }
  }
}
