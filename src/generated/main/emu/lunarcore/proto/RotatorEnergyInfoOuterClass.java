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

public final class RotatorEnergyInfoOuterClass {
  /**
   * Protobuf type {@code RotatorEnergyInfo}
   */
  public static final class RotatorEnergyInfo extends ProtoMessage<RotatorEnergyInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * or 6
     * </pre>
     *
     * <code>optional uint32 max_num = 3;</code>
     */
    private int maxNum;

    /**
     * <pre>
     * or 3
     * </pre>
     *
     * <code>optional uint32 cur_num = 6;</code>
     */
    private int curNum;

    private RotatorEnergyInfo() {
    }

    /**
     * @return a new empty instance of {@code RotatorEnergyInfo}
     */
    public static RotatorEnergyInfo newInstance() {
      return new RotatorEnergyInfo();
    }

    /**
     * <pre>
     * or 6
     * </pre>
     *
     * <code>optional uint32 max_num = 3;</code>
     * @return whether the maxNum field is set
     */
    public boolean hasMaxNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * or 6
     * </pre>
     *
     * <code>optional uint32 max_num = 3;</code>
     * @return this
     */
    public RotatorEnergyInfo clearMaxNum() {
      bitField0_ &= ~0x00000001;
      maxNum = 0;
      return this;
    }

    /**
     * <pre>
     * or 6
     * </pre>
     *
     * <code>optional uint32 max_num = 3;</code>
     * @return the maxNum
     */
    public int getMaxNum() {
      return maxNum;
    }

    /**
     * <pre>
     * or 6
     * </pre>
     *
     * <code>optional uint32 max_num = 3;</code>
     * @param value the maxNum to set
     * @return this
     */
    public RotatorEnergyInfo setMaxNum(final int value) {
      bitField0_ |= 0x00000001;
      maxNum = value;
      return this;
    }

    /**
     * <pre>
     * or 3
     * </pre>
     *
     * <code>optional uint32 cur_num = 6;</code>
     * @return whether the curNum field is set
     */
    public boolean hasCurNum() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * or 3
     * </pre>
     *
     * <code>optional uint32 cur_num = 6;</code>
     * @return this
     */
    public RotatorEnergyInfo clearCurNum() {
      bitField0_ &= ~0x00000002;
      curNum = 0;
      return this;
    }

    /**
     * <pre>
     * or 3
     * </pre>
     *
     * <code>optional uint32 cur_num = 6;</code>
     * @return the curNum
     */
    public int getCurNum() {
      return curNum;
    }

    /**
     * <pre>
     * or 3
     * </pre>
     *
     * <code>optional uint32 cur_num = 6;</code>
     * @param value the curNum to set
     * @return this
     */
    public RotatorEnergyInfo setCurNum(final int value) {
      bitField0_ |= 0x00000002;
      curNum = value;
      return this;
    }

    @Override
    public RotatorEnergyInfo copyFrom(final RotatorEnergyInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        maxNum = other.maxNum;
        curNum = other.curNum;
      }
      return this;
    }

    @Override
    public RotatorEnergyInfo mergeFrom(final RotatorEnergyInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMaxNum()) {
        setMaxNum(other.maxNum);
      }
      if (other.hasCurNum()) {
        setCurNum(other.curNum);
      }
      return this;
    }

    @Override
    public RotatorEnergyInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      maxNum = 0;
      curNum = 0;
      return this;
    }

    @Override
    public RotatorEnergyInfo clearQuick() {
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
      if (!(o instanceof RotatorEnergyInfo)) {
        return false;
      }
      RotatorEnergyInfo other = (RotatorEnergyInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasMaxNum() || maxNum == other.maxNum)
        && (!hasCurNum() || curNum == other.curNum);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(maxNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(curNum);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(maxNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curNum);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RotatorEnergyInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // maxNum
            maxNum = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // curNum
            curNum = input.readUInt32();
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
        output.writeUInt32(FieldNames.maxNum, maxNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.curNum, curNum);
      }
      output.endObject();
    }

    @Override
    public RotatorEnergyInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1081154686:
          case 844443179: {
            if (input.isAtField(FieldNames.maxNum)) {
              if (!input.trySkipNullValue()) {
                maxNum = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1349154522:
          case 1126382855: {
            if (input.isAtField(FieldNames.curNum)) {
              if (!input.trySkipNullValue()) {
                curNum = input.readUInt32();
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
    public RotatorEnergyInfo clone() {
      return new RotatorEnergyInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RotatorEnergyInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RotatorEnergyInfo(), data).checkInitialized();
    }

    public static RotatorEnergyInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotatorEnergyInfo(), input).checkInitialized();
    }

    public static RotatorEnergyInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotatorEnergyInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RotatorEnergyInfo messages
     */
    public static MessageFactory<RotatorEnergyInfo> getFactory() {
      return RotatorEnergyInfoFactory.INSTANCE;
    }

    private enum RotatorEnergyInfoFactory implements MessageFactory<RotatorEnergyInfo> {
      INSTANCE;

      @Override
      public RotatorEnergyInfo create() {
        return RotatorEnergyInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName maxNum = FieldName.forField("maxNum", "max_num");

      static final FieldName curNum = FieldName.forField("curNum", "cur_num");
    }
  }
}
