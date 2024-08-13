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

public final class ChessRogueGoAheadScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueGoAheadScRsp}
   */
  public static final class ChessRogueGoAheadScRsp extends ProtoMessage<ChessRogueGoAheadScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 5;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 cell_id = 11;</code>
     */
    private int cellId;

    private ChessRogueGoAheadScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueGoAheadScRsp}
     */
    public static ChessRogueGoAheadScRsp newInstance() {
      return new ChessRogueGoAheadScRsp();
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
    public ChessRogueGoAheadScRsp clearRetcode() {
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
    public ChessRogueGoAheadScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 cell_id = 11;</code>
     * @return whether the cellId field is set
     */
    public boolean hasCellId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 cell_id = 11;</code>
     * @return this
     */
    public ChessRogueGoAheadScRsp clearCellId() {
      bitField0_ &= ~0x00000002;
      cellId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cell_id = 11;</code>
     * @return the cellId
     */
    public int getCellId() {
      return cellId;
    }

    /**
     * <code>optional uint32 cell_id = 11;</code>
     * @param value the cellId to set
     * @return this
     */
    public ChessRogueGoAheadScRsp setCellId(final int value) {
      bitField0_ |= 0x00000002;
      cellId = value;
      return this;
    }

    @Override
    public ChessRogueGoAheadScRsp copyFrom(final ChessRogueGoAheadScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        cellId = other.cellId;
      }
      return this;
    }

    @Override
    public ChessRogueGoAheadScRsp mergeFrom(final ChessRogueGoAheadScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasCellId()) {
        setCellId(other.cellId);
      }
      return this;
    }

    @Override
    public ChessRogueGoAheadScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      cellId = 0;
      return this;
    }

    @Override
    public ChessRogueGoAheadScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueGoAheadScRsp)) {
        return false;
      }
      ChessRogueGoAheadScRsp other = (ChessRogueGoAheadScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasCellId() || cellId == other.cellId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(cellId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cellId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueGoAheadScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // cellId
            cellId = input.readUInt32();
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
        output.writeUInt32(FieldNames.cellId, cellId);
      }
      output.endObject();
    }

    @Override
    public ChessRogueGoAheadScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -1364082147:
          case 663147800: {
            if (input.isAtField(FieldNames.cellId)) {
              if (!input.trySkipNullValue()) {
                cellId = input.readUInt32();
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
    public ChessRogueGoAheadScRsp clone() {
      return new ChessRogueGoAheadScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueGoAheadScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueGoAheadScRsp(), data).checkInitialized();
    }

    public static ChessRogueGoAheadScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueGoAheadScRsp(), input).checkInitialized();
    }

    public static ChessRogueGoAheadScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueGoAheadScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueGoAheadScRsp messages
     */
    public static MessageFactory<ChessRogueGoAheadScRsp> getFactory() {
      return ChessRogueGoAheadScRspFactory.INSTANCE;
    }

    private enum ChessRogueGoAheadScRspFactory implements MessageFactory<ChessRogueGoAheadScRsp> {
      INSTANCE;

      @Override
      public ChessRogueGoAheadScRsp create() {
        return ChessRogueGoAheadScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName cellId = FieldName.forField("cellId", "cell_id");
    }
  }
}
