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
import us.hebi.quickbuf.Utf8String;

public final class SetNicknameCsReqOuterClass {
  /**
   * Protobuf type {@code SetNicknameCsReq}
   */
  public static final class SetNicknameCsReq extends ProtoMessage<SetNicknameCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional string nickname = 4;</code>
     */
    private final Utf8String nickname = Utf8String.newEmptyInstance();

    private SetNicknameCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetNicknameCsReq}
     */
    public static SetNicknameCsReq newInstance() {
      return new SetNicknameCsReq();
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return whether the nickname field is set
     */
    public boolean hasNickname() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return this
     */
    public SetNicknameCsReq clearNickname() {
      bitField0_ &= ~0x00000001;
      nickname.clear();
      return this;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return the nickname
     */
    public String getNickname() {
      return nickname.getString();
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return internal {@code Utf8String} representation of nickname for reading
     */
    public Utf8String getNicknameBytes() {
      return this.nickname;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return internal {@code Utf8String} representation of nickname for modifications
     */
    public Utf8String getMutableNicknameBytes() {
      bitField0_ |= 0x00000001;
      return this.nickname;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @param value the nickname to set
     * @return this
     */
    public SetNicknameCsReq setNickname(final CharSequence value) {
      bitField0_ |= 0x00000001;
      nickname.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @param value the nickname to set
     * @return this
     */
    public SetNicknameCsReq setNickname(final Utf8String value) {
      bitField0_ |= 0x00000001;
      nickname.copyFrom(value);
      return this;
    }

    @Override
    public SetNicknameCsReq copyFrom(final SetNicknameCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        nickname.copyFrom(other.nickname);
      }
      return this;
    }

    @Override
    public SetNicknameCsReq mergeFrom(final SetNicknameCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNickname()) {
        getMutableNicknameBytes().copyFrom(other.nickname);
      }
      return this;
    }

    @Override
    public SetNicknameCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nickname.clear();
      return this;
    }

    @Override
    public SetNicknameCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nickname.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetNicknameCsReq)) {
        return false;
      }
      SetNicknameCsReq other = (SetNicknameCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasNickname() || nickname.equals(other.nickname));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 34);
        output.writeStringNoTag(nickname);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(nickname);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetNicknameCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // nickname
            input.readString(nickname);
            bitField0_ |= 0x00000001;
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
        output.writeString(FieldNames.nickname, nickname);
      }
      output.endObject();
    }

    @Override
    public SetNicknameCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 70690926: {
            if (input.isAtField(FieldNames.nickname)) {
              if (!input.trySkipNullValue()) {
                input.readString(nickname);
                bitField0_ |= 0x00000001;
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
    public SetNicknameCsReq clone() {
      return new SetNicknameCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetNicknameCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetNicknameCsReq(), data).checkInitialized();
    }

    public static SetNicknameCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetNicknameCsReq(), input).checkInitialized();
    }

    public static SetNicknameCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetNicknameCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetNicknameCsReq messages
     */
    public static MessageFactory<SetNicknameCsReq> getFactory() {
      return SetNicknameCsReqFactory.INSTANCE;
    }

    private enum SetNicknameCsReqFactory implements MessageFactory<SetNicknameCsReq> {
      INSTANCE;

      @Override
      public SetNicknameCsReq create() {
        return SetNicknameCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName nickname = FieldName.forField("nickname");
    }
  }
}
