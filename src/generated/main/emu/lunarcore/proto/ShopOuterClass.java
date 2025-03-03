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

public final class ShopOuterClass {
  /**
   * Protobuf type {@code Shop}
   */
  public static final class Shop extends ProtoMessage<Shop> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 begin_time = 4;</code>
     */
    private long beginTime;

    /**
     * <code>optional int64 end_time = 10;</code>
     */
    private long endTime;

    /**
     * <code>optional uint64 city_taken_level_reward = 5;</code>
     */
    private long cityTakenLevelReward;

    /**
     * <code>optional uint32 city_exp = 6;</code>
     */
    private int cityExp;

    /**
     * <code>optional uint32 shop_id = 7;</code>
     */
    private int shopId;

    /**
     * <code>optional uint32 city_level = 15;</code>
     */
    private int cityLevel;

    /**
     * <code>repeated .Goods goods_list = 13;</code>
     */
    private final RepeatedMessage<GoodsOuterClass.Goods> goodsList = RepeatedMessage.newEmptyInstance(GoodsOuterClass.Goods.getFactory());

    private Shop() {
    }

    /**
     * @return a new empty instance of {@code Shop}
     */
    public static Shop newInstance() {
      return new Shop();
    }

    /**
     * <code>optional int64 begin_time = 4;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 begin_time = 4;</code>
     * @return this
     */
    public Shop clearBeginTime() {
      bitField0_ &= ~0x00000001;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 4;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 4;</code>
     * @param value the beginTime to set
     * @return this
     */
    public Shop setBeginTime(final long value) {
      bitField0_ |= 0x00000001;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional int64 end_time = 10;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 end_time = 10;</code>
     * @return this
     */
    public Shop clearEndTime() {
      bitField0_ &= ~0x00000002;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 10;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 10;</code>
     * @param value the endTime to set
     * @return this
     */
    public Shop setEndTime(final long value) {
      bitField0_ |= 0x00000002;
      endTime = value;
      return this;
    }

    /**
     * <code>optional uint64 city_taken_level_reward = 5;</code>
     * @return whether the cityTakenLevelReward field is set
     */
    public boolean hasCityTakenLevelReward() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint64 city_taken_level_reward = 5;</code>
     * @return this
     */
    public Shop clearCityTakenLevelReward() {
      bitField0_ &= ~0x00000004;
      cityTakenLevelReward = 0L;
      return this;
    }

    /**
     * <code>optional uint64 city_taken_level_reward = 5;</code>
     * @return the cityTakenLevelReward
     */
    public long getCityTakenLevelReward() {
      return cityTakenLevelReward;
    }

    /**
     * <code>optional uint64 city_taken_level_reward = 5;</code>
     * @param value the cityTakenLevelReward to set
     * @return this
     */
    public Shop setCityTakenLevelReward(final long value) {
      bitField0_ |= 0x00000004;
      cityTakenLevelReward = value;
      return this;
    }

    /**
     * <code>optional uint32 city_exp = 6;</code>
     * @return whether the cityExp field is set
     */
    public boolean hasCityExp() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 city_exp = 6;</code>
     * @return this
     */
    public Shop clearCityExp() {
      bitField0_ &= ~0x00000008;
      cityExp = 0;
      return this;
    }

    /**
     * <code>optional uint32 city_exp = 6;</code>
     * @return the cityExp
     */
    public int getCityExp() {
      return cityExp;
    }

    /**
     * <code>optional uint32 city_exp = 6;</code>
     * @param value the cityExp to set
     * @return this
     */
    public Shop setCityExp(final int value) {
      bitField0_ |= 0x00000008;
      cityExp = value;
      return this;
    }

    /**
     * <code>optional uint32 shop_id = 7;</code>
     * @return whether the shopId field is set
     */
    public boolean hasShopId() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 shop_id = 7;</code>
     * @return this
     */
    public Shop clearShopId() {
      bitField0_ &= ~0x00000010;
      shopId = 0;
      return this;
    }

    /**
     * <code>optional uint32 shop_id = 7;</code>
     * @return the shopId
     */
    public int getShopId() {
      return shopId;
    }

    /**
     * <code>optional uint32 shop_id = 7;</code>
     * @param value the shopId to set
     * @return this
     */
    public Shop setShopId(final int value) {
      bitField0_ |= 0x00000010;
      shopId = value;
      return this;
    }

    /**
     * <code>optional uint32 city_level = 15;</code>
     * @return whether the cityLevel field is set
     */
    public boolean hasCityLevel() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 city_level = 15;</code>
     * @return this
     */
    public Shop clearCityLevel() {
      bitField0_ &= ~0x00000020;
      cityLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 city_level = 15;</code>
     * @return the cityLevel
     */
    public int getCityLevel() {
      return cityLevel;
    }

    /**
     * <code>optional uint32 city_level = 15;</code>
     * @param value the cityLevel to set
     * @return this
     */
    public Shop setCityLevel(final int value) {
      bitField0_ |= 0x00000020;
      cityLevel = value;
      return this;
    }

    /**
     * <code>repeated .Goods goods_list = 13;</code>
     * @return whether the goodsList field is set
     */
    public boolean hasGoodsList() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>repeated .Goods goods_list = 13;</code>
     * @return this
     */
    public Shop clearGoodsList() {
      bitField0_ &= ~0x00000040;
      goodsList.clear();
      return this;
    }

    /**
     * <code>repeated .Goods goods_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGoodsList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<GoodsOuterClass.Goods> getGoodsList() {
      return goodsList;
    }

    /**
     * <code>repeated .Goods goods_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<GoodsOuterClass.Goods> getMutableGoodsList() {
      bitField0_ |= 0x00000040;
      return goodsList;
    }

    /**
     * <code>repeated .Goods goods_list = 13;</code>
     * @param value the goodsList to add
     * @return this
     */
    public Shop addGoodsList(final GoodsOuterClass.Goods value) {
      bitField0_ |= 0x00000040;
      goodsList.add(value);
      return this;
    }

    /**
     * <code>repeated .Goods goods_list = 13;</code>
     * @param values the goodsList to add
     * @return this
     */
    public Shop addAllGoodsList(final GoodsOuterClass.Goods... values) {
      bitField0_ |= 0x00000040;
      goodsList.addAll(values);
      return this;
    }

    @Override
    public Shop copyFrom(final Shop other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        beginTime = other.beginTime;
        endTime = other.endTime;
        cityTakenLevelReward = other.cityTakenLevelReward;
        cityExp = other.cityExp;
        shopId = other.shopId;
        cityLevel = other.cityLevel;
        goodsList.copyFrom(other.goodsList);
      }
      return this;
    }

    @Override
    public Shop mergeFrom(final Shop other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasCityTakenLevelReward()) {
        setCityTakenLevelReward(other.cityTakenLevelReward);
      }
      if (other.hasCityExp()) {
        setCityExp(other.cityExp);
      }
      if (other.hasShopId()) {
        setShopId(other.shopId);
      }
      if (other.hasCityLevel()) {
        setCityLevel(other.cityLevel);
      }
      if (other.hasGoodsList()) {
        getMutableGoodsList().addAll(other.goodsList);
      }
      return this;
    }

    @Override
    public Shop clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      beginTime = 0L;
      endTime = 0L;
      cityTakenLevelReward = 0L;
      cityExp = 0;
      shopId = 0;
      cityLevel = 0;
      goodsList.clear();
      return this;
    }

    @Override
    public Shop clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      goodsList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Shop)) {
        return false;
      }
      Shop other = (Shop) o;
      return bitField0_ == other.bitField0_
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasCityTakenLevelReward() || cityTakenLevelReward == other.cityTakenLevelReward)
        && (!hasCityExp() || cityExp == other.cityExp)
        && (!hasShopId() || shopId == other.shopId)
        && (!hasCityLevel() || cityLevel == other.cityLevel)
        && (!hasGoodsList() || goodsList.equals(other.goodsList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt64NoTag(cityTakenLevelReward);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(cityExp);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(shopId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(cityLevel);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < goodsList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(goodsList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(cityTakenLevelReward);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cityExp);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(shopId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cityLevel);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * goodsList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(goodsList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Shop mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // cityTakenLevelReward
            cityTakenLevelReward = input.readUInt64();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // cityExp
            cityExp = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // shopId
            shopId = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // cityLevel
            cityLevel = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // goodsList
            tag = input.readRepeatedMessage(goodsList, tag);
            bitField0_ |= 0x00000040;
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
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt64(FieldNames.cityTakenLevelReward, cityTakenLevelReward);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.cityExp, cityExp);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.shopId, shopId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.cityLevel, cityLevel);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedMessage(FieldNames.goodsList, goodsList);
      }
      output.endObject();
    }

    @Override
    public Shop mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -877911017:
          case -1581226986: {
            if (input.isAtField(FieldNames.cityTakenLevelReward)) {
              if (!input.trySkipNullValue()) {
                cityTakenLevelReward = input.readUInt64();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 785415346:
          case -1421171383: {
            if (input.isAtField(FieldNames.cityExp)) {
              if (!input.trySkipNullValue()) {
                cityExp = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -903151951:
          case 2067081988: {
            if (input.isAtField(FieldNames.shopId)) {
              if (!input.trySkipNullValue()) {
                shopId = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1124188967:
          case 59808688: {
            if (input.isAtField(FieldNames.cityLevel)) {
              if (!input.trySkipNullValue()) {
                cityLevel = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1394352404:
          case 292878311: {
            if (input.isAtField(FieldNames.goodsList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(goodsList);
                bitField0_ |= 0x00000040;
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
    public Shop clone() {
      return new Shop().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Shop parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Shop(), data).checkInitialized();
    }

    public static Shop parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Shop(), input).checkInitialized();
    }

    public static Shop parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Shop(), input).checkInitialized();
    }

    /**
     * @return factory for creating Shop messages
     */
    public static MessageFactory<Shop> getFactory() {
      return ShopFactory.INSTANCE;
    }

    private enum ShopFactory implements MessageFactory<Shop> {
      INSTANCE;

      @Override
      public Shop create() {
        return Shop.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName cityTakenLevelReward = FieldName.forField("cityTakenLevelReward", "city_taken_level_reward");

      static final FieldName cityExp = FieldName.forField("cityExp", "city_exp");

      static final FieldName shopId = FieldName.forField("shopId", "shop_id");

      static final FieldName cityLevel = FieldName.forField("cityLevel", "city_level");

      static final FieldName goodsList = FieldName.forField("goodsList", "goods_list");
    }
  }
}
