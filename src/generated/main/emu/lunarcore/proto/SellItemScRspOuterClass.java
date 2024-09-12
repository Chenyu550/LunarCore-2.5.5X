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

public final class SellItemScRspOuterClass {
  /**
   * Protobuf type {@code SellItemScRsp}
   */
  public static final class SellItemScRsp extends ProtoMessage<SellItemScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional .ItemList return_item_list = 11;</code>
     */
    private final ItemListOuterClass.ItemList returnItemList = ItemListOuterClass.ItemList.newInstance();

    private SellItemScRsp() {
    }

    /**
     * @return a new empty instance of {@code SellItemScRsp}
     */
    public static SellItemScRsp newInstance() {
      return new SellItemScRsp();
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public SellItemScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public SellItemScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ItemList return_item_list = 11;</code>
     * @return whether the returnItemList field is set
     */
    public boolean hasReturnItemList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ItemList return_item_list = 11;</code>
     * @return this
     */
    public SellItemScRsp clearReturnItemList() {
      bitField0_ &= ~0x00000002;
      returnItemList.clear();
      return this;
    }

    /**
     * <code>optional .ItemList return_item_list = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableReturnItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getReturnItemList() {
      return returnItemList;
    }

    /**
     * <code>optional .ItemList return_item_list = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableReturnItemList() {
      bitField0_ |= 0x00000002;
      return returnItemList;
    }

    /**
     * <code>optional .ItemList return_item_list = 11;</code>
     * @param value the returnItemList to set
     * @return this
     */
    public SellItemScRsp setReturnItemList(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000002;
      returnItemList.copyFrom(value);
      return this;
    }

    @Override
    public SellItemScRsp copyFrom(final SellItemScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        returnItemList.copyFrom(other.returnItemList);
      }
      return this;
    }

    @Override
    public SellItemScRsp mergeFrom(final SellItemScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasReturnItemList()) {
        getMutableReturnItemList().mergeFrom(other.returnItemList);
      }
      return this;
    }

    @Override
    public SellItemScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      returnItemList.clear();
      return this;
    }

    @Override
    public SellItemScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      returnItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SellItemScRsp)) {
        return false;
      }
      SellItemScRsp other = (SellItemScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasReturnItemList() || returnItemList.equals(other.returnItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(returnItemList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(returnItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SellItemScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // returnItemList
            input.readMessage(returnItemList);
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
        output.writeMessage(FieldNames.returnItemList, returnItemList);
      }
      output.endObject();
    }

    @Override
    public SellItemScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -6533215:
          case -807051781: {
            if (input.isAtField(FieldNames.returnItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(returnItemList);
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
    public SellItemScRsp clone() {
      return new SellItemScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SellItemScRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SellItemScRsp(), data).checkInitialized();
    }

    public static SellItemScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SellItemScRsp(), input).checkInitialized();
    }

    public static SellItemScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SellItemScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SellItemScRsp messages
     */
    public static MessageFactory<SellItemScRsp> getFactory() {
      return SellItemScRspFactory.INSTANCE;
    }

    private enum SellItemScRspFactory implements MessageFactory<SellItemScRsp> {
      INSTANCE;

      @Override
      public SellItemScRsp create() {
        return SellItemScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName returnItemList = FieldName.forField("returnItemList", "return_item_list");
    }
  }
}
