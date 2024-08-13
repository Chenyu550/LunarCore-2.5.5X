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

public final class RogueCommonMoneyOuterClass {
  /**
   * Protobuf type {@code RogueCommonMoney}
   */
  public static final class RogueCommonMoney extends ProtoMessage<RogueCommonMoney> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 display_type = 2;</code>
     */
    private int displayType;

    /**
     * <code>optional uint32 num = 14;</code>
     */
    private int num;

    private RogueCommonMoney() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonMoney}
     */
    public static RogueCommonMoney newInstance() {
      return new RogueCommonMoney();
    }

    /**
     * <code>optional uint32 display_type = 2;</code>
     * @return whether the displayType field is set
     */
    public boolean hasDisplayType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 display_type = 2;</code>
     * @return this
     */
    public RogueCommonMoney clearDisplayType() {
      bitField0_ &= ~0x00000001;
      displayType = 0;
      return this;
    }

    /**
     * <code>optional uint32 display_type = 2;</code>
     * @return the displayType
     */
    public int getDisplayType() {
      return displayType;
    }

    /**
     * <code>optional uint32 display_type = 2;</code>
     * @param value the displayType to set
     * @return this
     */
    public RogueCommonMoney setDisplayType(final int value) {
      bitField0_ |= 0x00000001;
      displayType = value;
      return this;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return this
     */
    public RogueCommonMoney clearNum() {
      bitField0_ &= ~0x00000002;
      num = 0;
      return this;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <code>optional uint32 num = 14;</code>
     * @param value the num to set
     * @return this
     */
    public RogueCommonMoney setNum(final int value) {
      bitField0_ |= 0x00000002;
      num = value;
      return this;
    }

    @Override
    public RogueCommonMoney copyFrom(final RogueCommonMoney other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        displayType = other.displayType;
        num = other.num;
      }
      return this;
    }

    @Override
    public RogueCommonMoney mergeFrom(final RogueCommonMoney other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDisplayType()) {
        setDisplayType(other.displayType);
      }
      if (other.hasNum()) {
        setNum(other.num);
      }
      return this;
    }

    @Override
    public RogueCommonMoney clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      displayType = 0;
      num = 0;
      return this;
    }

    @Override
    public RogueCommonMoney clearQuick() {
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
      if (!(o instanceof RogueCommonMoney)) {
        return false;
      }
      RogueCommonMoney other = (RogueCommonMoney) o;
      return bitField0_ == other.bitField0_
        && (!hasDisplayType() || displayType == other.displayType)
        && (!hasNum() || num == other.num);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(displayType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(num);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(displayType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonMoney mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // displayType
            displayType = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // num
            num = input.readUInt32();
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
        output.writeUInt32(FieldNames.displayType, displayType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.num, num);
      }
      output.endObject();
    }

    @Override
    public RogueCommonMoney mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1714350876:
          case 1615288471: {
            if (input.isAtField(FieldNames.displayType)) {
              if (!input.trySkipNullValue()) {
                displayType = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
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
    public RogueCommonMoney clone() {
      return new RogueCommonMoney().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonMoney parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonMoney(), data).checkInitialized();
    }

    public static RogueCommonMoney parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonMoney(), input).checkInitialized();
    }

    public static RogueCommonMoney parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonMoney(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonMoney messages
     */
    public static MessageFactory<RogueCommonMoney> getFactory() {
      return RogueCommonMoneyFactory.INSTANCE;
    }

    private enum RogueCommonMoneyFactory implements MessageFactory<RogueCommonMoney> {
      INSTANCE;

      @Override
      public RogueCommonMoney create() {
        return RogueCommonMoney.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName displayType = FieldName.forField("displayType", "display_type");

      static final FieldName num = FieldName.forField("num");
    }
  }
}
