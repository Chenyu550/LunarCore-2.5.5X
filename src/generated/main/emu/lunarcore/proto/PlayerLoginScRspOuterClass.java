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

public final class PlayerLoginScRspOuterClass {
  /**
   * Protobuf type {@code PlayerLoginScRsp}
   */
  public static final class PlayerLoginScRsp extends ProtoMessage<PlayerLoginScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 login_random = 2;</code>
     */
    private long loginRandom;

    /**
     * <code>optional uint64 server_timestamp_ms = 8;</code>
     */
    private long serverTimestampMs;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 stamina = 14;</code>
     */
    private int stamina;

    /**
     * <code>optional sint32 cur_timezone = 7;</code>
     */
    private int curTimezone;

    /**
     * <code>optional .PlayerBasicInfo basic_info = 4;</code>
     */
    private final PlayerBasicInfoOuterClass.PlayerBasicInfo basicInfo = PlayerBasicInfoOuterClass.PlayerBasicInfo.newInstance();

    private PlayerLoginScRsp() {
    }

    /**
     * @return a new empty instance of {@code PlayerLoginScRsp}
     */
    public static PlayerLoginScRsp newInstance() {
      return new PlayerLoginScRsp();
    }

    /**
     * <code>optional uint64 login_random = 2;</code>
     * @return whether the loginRandom field is set
     */
    public boolean hasLoginRandom() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 login_random = 2;</code>
     * @return this
     */
    public PlayerLoginScRsp clearLoginRandom() {
      bitField0_ &= ~0x00000001;
      loginRandom = 0L;
      return this;
    }

    /**
     * <code>optional uint64 login_random = 2;</code>
     * @return the loginRandom
     */
    public long getLoginRandom() {
      return loginRandom;
    }

    /**
     * <code>optional uint64 login_random = 2;</code>
     * @param value the loginRandom to set
     * @return this
     */
    public PlayerLoginScRsp setLoginRandom(final long value) {
      bitField0_ |= 0x00000001;
      loginRandom = value;
      return this;
    }

    /**
     * <code>optional uint64 server_timestamp_ms = 8;</code>
     * @return whether the serverTimestampMs field is set
     */
    public boolean hasServerTimestampMs() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint64 server_timestamp_ms = 8;</code>
     * @return this
     */
    public PlayerLoginScRsp clearServerTimestampMs() {
      bitField0_ &= ~0x00000002;
      serverTimestampMs = 0L;
      return this;
    }

    /**
     * <code>optional uint64 server_timestamp_ms = 8;</code>
     * @return the serverTimestampMs
     */
    public long getServerTimestampMs() {
      return serverTimestampMs;
    }

    /**
     * <code>optional uint64 server_timestamp_ms = 8;</code>
     * @param value the serverTimestampMs to set
     * @return this
     */
    public PlayerLoginScRsp setServerTimestampMs(final long value) {
      bitField0_ |= 0x00000002;
      serverTimestampMs = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public PlayerLoginScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
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
    public PlayerLoginScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 stamina = 14;</code>
     * @return whether the stamina field is set
     */
    public boolean hasStamina() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 stamina = 14;</code>
     * @return this
     */
    public PlayerLoginScRsp clearStamina() {
      bitField0_ &= ~0x00000008;
      stamina = 0;
      return this;
    }

    /**
     * <code>optional uint32 stamina = 14;</code>
     * @return the stamina
     */
    public int getStamina() {
      return stamina;
    }

    /**
     * <code>optional uint32 stamina = 14;</code>
     * @param value the stamina to set
     * @return this
     */
    public PlayerLoginScRsp setStamina(final int value) {
      bitField0_ |= 0x00000008;
      stamina = value;
      return this;
    }

    /**
     * <code>optional sint32 cur_timezone = 7;</code>
     * @return whether the curTimezone field is set
     */
    public boolean hasCurTimezone() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional sint32 cur_timezone = 7;</code>
     * @return this
     */
    public PlayerLoginScRsp clearCurTimezone() {
      bitField0_ &= ~0x00000010;
      curTimezone = 0;
      return this;
    }

    /**
     * <code>optional sint32 cur_timezone = 7;</code>
     * @return the curTimezone
     */
    public int getCurTimezone() {
      return curTimezone;
    }

    /**
     * <code>optional sint32 cur_timezone = 7;</code>
     * @param value the curTimezone to set
     * @return this
     */
    public PlayerLoginScRsp setCurTimezone(final int value) {
      bitField0_ |= 0x00000010;
      curTimezone = value;
      return this;
    }

    /**
     * <code>optional .PlayerBasicInfo basic_info = 4;</code>
     * @return whether the basicInfo field is set
     */
    public boolean hasBasicInfo() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .PlayerBasicInfo basic_info = 4;</code>
     * @return this
     */
    public PlayerLoginScRsp clearBasicInfo() {
      bitField0_ &= ~0x00000020;
      basicInfo.clear();
      return this;
    }

    /**
     * <code>optional .PlayerBasicInfo basic_info = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBasicInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PlayerBasicInfoOuterClass.PlayerBasicInfo getBasicInfo() {
      return basicInfo;
    }

    /**
     * <code>optional .PlayerBasicInfo basic_info = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PlayerBasicInfoOuterClass.PlayerBasicInfo getMutableBasicInfo() {
      bitField0_ |= 0x00000020;
      return basicInfo;
    }

    /**
     * <code>optional .PlayerBasicInfo basic_info = 4;</code>
     * @param value the basicInfo to set
     * @return this
     */
    public PlayerLoginScRsp setBasicInfo(final PlayerBasicInfoOuterClass.PlayerBasicInfo value) {
      bitField0_ |= 0x00000020;
      basicInfo.copyFrom(value);
      return this;
    }

    @Override
    public PlayerLoginScRsp copyFrom(final PlayerLoginScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        loginRandom = other.loginRandom;
        serverTimestampMs = other.serverTimestampMs;
        retcode = other.retcode;
        stamina = other.stamina;
        curTimezone = other.curTimezone;
        basicInfo.copyFrom(other.basicInfo);
      }
      return this;
    }

    @Override
    public PlayerLoginScRsp mergeFrom(final PlayerLoginScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLoginRandom()) {
        setLoginRandom(other.loginRandom);
      }
      if (other.hasServerTimestampMs()) {
        setServerTimestampMs(other.serverTimestampMs);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasStamina()) {
        setStamina(other.stamina);
      }
      if (other.hasCurTimezone()) {
        setCurTimezone(other.curTimezone);
      }
      if (other.hasBasicInfo()) {
        getMutableBasicInfo().mergeFrom(other.basicInfo);
      }
      return this;
    }

    @Override
    public PlayerLoginScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      loginRandom = 0L;
      serverTimestampMs = 0L;
      retcode = 0;
      stamina = 0;
      curTimezone = 0;
      basicInfo.clear();
      return this;
    }

    @Override
    public PlayerLoginScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      basicInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerLoginScRsp)) {
        return false;
      }
      PlayerLoginScRsp other = (PlayerLoginScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasLoginRandom() || loginRandom == other.loginRandom)
        && (!hasServerTimestampMs() || serverTimestampMs == other.serverTimestampMs)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasStamina() || stamina == other.stamina)
        && (!hasCurTimezone() || curTimezone == other.curTimezone)
        && (!hasBasicInfo() || basicInfo.equals(other.basicInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt64NoTag(loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt64NoTag(serverTimestampMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(stamina);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 56);
        output.writeSInt32NoTag(curTimezone);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(basicInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(serverTimestampMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stamina);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeSInt32SizeNoTag(curTimezone);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(basicInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerLoginScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // loginRandom
            loginRandom = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // serverTimestampMs
            serverTimestampMs = input.readUInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // stamina
            stamina = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // curTimezone
            curTimezone = input.readSInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // basicInfo
            input.readMessage(basicInfo);
            bitField0_ |= 0x00000020;
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
        output.writeUInt64(FieldNames.loginRandom, loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt64(FieldNames.serverTimestampMs, serverTimestampMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.stamina, stamina);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeSInt32(FieldNames.curTimezone, curTimezone);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.basicInfo, basicInfo);
      }
      output.endObject();
    }

    @Override
    public PlayerLoginScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1268567436:
          case -201491879: {
            if (input.isAtField(FieldNames.loginRandom)) {
              if (!input.trySkipNullValue()) {
                loginRandom = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1700420071:
          case -1078785813: {
            if (input.isAtField(FieldNames.serverTimestampMs)) {
              if (!input.trySkipNullValue()) {
                serverTimestampMs = input.readUInt64();
                bitField0_ |= 0x00000002;
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
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1897344401: {
            if (input.isAtField(FieldNames.stamina)) {
              if (!input.trySkipNullValue()) {
                stamina = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -929763751:
          case 1485930264: {
            if (input.isAtField(FieldNames.curTimezone)) {
              if (!input.trySkipNullValue()) {
                curTimezone = input.readSInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1699486212:
          case -1124288993: {
            if (input.isAtField(FieldNames.basicInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(basicInfo);
                bitField0_ |= 0x00000020;
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
    public PlayerLoginScRsp clone() {
      return new PlayerLoginScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerLoginScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerLoginScRsp(), data).checkInitialized();
    }

    public static PlayerLoginScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerLoginScRsp(), input).checkInitialized();
    }

    public static PlayerLoginScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerLoginScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerLoginScRsp messages
     */
    public static MessageFactory<PlayerLoginScRsp> getFactory() {
      return PlayerLoginScRspFactory.INSTANCE;
    }

    private enum PlayerLoginScRspFactory implements MessageFactory<PlayerLoginScRsp> {
      INSTANCE;

      @Override
      public PlayerLoginScRsp create() {
        return PlayerLoginScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName loginRandom = FieldName.forField("loginRandom", "login_random");

      static final FieldName serverTimestampMs = FieldName.forField("serverTimestampMs", "server_timestamp_ms");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName stamina = FieldName.forField("stamina");

      static final FieldName curTimezone = FieldName.forField("curTimezone", "cur_timezone");

      static final FieldName basicInfo = FieldName.forField("basicInfo", "basic_info");
    }
  }
}
