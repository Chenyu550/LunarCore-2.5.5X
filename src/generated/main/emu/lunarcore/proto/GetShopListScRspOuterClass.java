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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetShopListScRspOuterClass {
  /**
   * Protobuf type {@code GetShopListScRsp}
   */
  public static final class GetShopListScRsp extends ProtoMessage<GetShopListScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 shop_type = 5;</code>
     */
    private int shopType;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>repeated .Shop shop_list = 1;</code>
     */
    private final RepeatedMessage<ShopOuterClass.Shop> shopList = RepeatedMessage.newEmptyInstance(ShopOuterClass.Shop.getFactory());

    private GetShopListScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetShopListScRsp}
     */
    public static GetShopListScRsp newInstance() {
      return new GetShopListScRsp();
    }

    /**
     * <code>optional uint32 shop_type = 5;</code>
     * @return whether the shopType field is set
     */
    public boolean hasShopType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 shop_type = 5;</code>
     * @return this
     */
    public GetShopListScRsp clearShopType() {
      bitField0_ &= ~0x00000001;
      shopType = 0;
      return this;
    }

    /**
     * <code>optional uint32 shop_type = 5;</code>
     * @return the shopType
     */
    public int getShopType() {
      return shopType;
    }

    /**
     * <code>optional uint32 shop_type = 5;</code>
     * @param value the shopType to set
     * @return this
     */
    public GetShopListScRsp setShopType(final int value) {
      bitField0_ |= 0x00000001;
      shopType = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public GetShopListScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetShopListScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .Shop shop_list = 1;</code>
     * @return whether the shopList field is set
     */
    public boolean hasShopList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .Shop shop_list = 1;</code>
     * @return this
     */
    public GetShopListScRsp clearShopList() {
      bitField0_ &= ~0x00000004;
      shopList.clear();
      return this;
    }

    /**
     * <code>repeated .Shop shop_list = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableShopList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ShopOuterClass.Shop> getShopList() {
      return shopList;
    }

    /**
     * <code>repeated .Shop shop_list = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ShopOuterClass.Shop> getMutableShopList() {
      bitField0_ |= 0x00000004;
      return shopList;
    }

    /**
     * <code>repeated .Shop shop_list = 1;</code>
     * @param value the shopList to add
     * @return this
     */
    public GetShopListScRsp addShopList(final ShopOuterClass.Shop value) {
      bitField0_ |= 0x00000004;
      shopList.add(value);
      return this;
    }

    /**
     * <code>repeated .Shop shop_list = 1;</code>
     * @param values the shopList to add
     * @return this
     */
    public GetShopListScRsp addAllShopList(final ShopOuterClass.Shop... values) {
      bitField0_ |= 0x00000004;
      shopList.addAll(values);
      return this;
    }

    @Override
    public GetShopListScRsp copyFrom(final GetShopListScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        shopType = other.shopType;
        retcode = other.retcode;
        shopList.copyFrom(other.shopList);
      }
      return this;
    }

    @Override
    public GetShopListScRsp mergeFrom(final GetShopListScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasShopType()) {
        setShopType(other.shopType);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasShopList()) {
        getMutableShopList().addAll(other.shopList);
      }
      return this;
    }

    @Override
    public GetShopListScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      shopType = 0;
      retcode = 0;
      shopList.clear();
      return this;
    }

    @Override
    public GetShopListScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      shopList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetShopListScRsp)) {
        return false;
      }
      GetShopListScRsp other = (GetShopListScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasShopType() || shopType == other.shopType)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasShopList() || shopList.equals(other.shopList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(shopType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < shopList.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(shopList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(shopType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * shopList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(shopList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetShopListScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // shopType
            shopType = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // shopList
            tag = input.readRepeatedMessage(shopList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.shopType, shopType);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.shopList, shopList);
      }
      output.endObject();
    }

    @Override
    public GetShopListScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -345279664:
          case -2103716125: {
            if (input.isAtField(FieldNames.shopType)) {
              if (!input.trySkipNullValue()) {
                shopType = input.readUInt32();
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
          case -345533260:
          case -2103969721: {
            if (input.isAtField(FieldNames.shopList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(shopList);
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
    public GetShopListScRsp clone() {
      return new GetShopListScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetShopListScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetShopListScRsp(), data).checkInitialized();
    }

    public static GetShopListScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetShopListScRsp(), input).checkInitialized();
    }

    public static GetShopListScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetShopListScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetShopListScRsp messages
     */
    public static MessageFactory<GetShopListScRsp> getFactory() {
      return GetShopListScRspFactory.INSTANCE;
    }

    private enum GetShopListScRspFactory implements MessageFactory<GetShopListScRsp> {
      INSTANCE;

      @Override
      public GetShopListScRsp create() {
        return GetShopListScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName shopType = FieldName.forField("shopType", "shop_type");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName shopList = FieldName.forField("shopList", "shop_list");
    }
  }
}
