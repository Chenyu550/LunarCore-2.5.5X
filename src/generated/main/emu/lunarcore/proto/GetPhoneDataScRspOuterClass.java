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

public final class GetPhoneDataScRspOuterClass {
  /**
   * Protobuf type {@code GetPhoneDataScRsp}
   */
  public static final class GetPhoneDataScRsp extends ProtoMessage<GetPhoneDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 cur_phone_theme = 5;</code>
     */
    private int curPhoneTheme;

    /**
     * <code>optional uint32 retcode = 9;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 cur_chat_bubble = 13;</code>
     */
    private int curChatBubble;

    /**
     * <pre>
     * or 7
     * </pre>
     *
     * <code>repeated uint32 owned_phone_themes = 1;</code>
     */
    private final RepeatedInt ownedPhoneThemes = RepeatedInt.newEmptyInstance();

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>repeated uint32 owned_chat_bubbles = 7;</code>
     */
    private final RepeatedInt ownedChatBubbles = RepeatedInt.newEmptyInstance();

    private GetPhoneDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetPhoneDataScRsp}
     */
    public static GetPhoneDataScRsp newInstance() {
      return new GetPhoneDataScRsp();
    }

    /**
     * <code>optional uint32 cur_phone_theme = 5;</code>
     * @return whether the curPhoneTheme field is set
     */
    public boolean hasCurPhoneTheme() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 cur_phone_theme = 5;</code>
     * @return this
     */
    public GetPhoneDataScRsp clearCurPhoneTheme() {
      bitField0_ &= ~0x00000001;
      curPhoneTheme = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_phone_theme = 5;</code>
     * @return the curPhoneTheme
     */
    public int getCurPhoneTheme() {
      return curPhoneTheme;
    }

    /**
     * <code>optional uint32 cur_phone_theme = 5;</code>
     * @param value the curPhoneTheme to set
     * @return this
     */
    public GetPhoneDataScRsp setCurPhoneTheme(final int value) {
      bitField0_ |= 0x00000001;
      curPhoneTheme = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return this
     */
    public GetPhoneDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetPhoneDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_chat_bubble = 13;</code>
     * @return whether the curChatBubble field is set
     */
    public boolean hasCurChatBubble() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cur_chat_bubble = 13;</code>
     * @return this
     */
    public GetPhoneDataScRsp clearCurChatBubble() {
      bitField0_ &= ~0x00000004;
      curChatBubble = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_chat_bubble = 13;</code>
     * @return the curChatBubble
     */
    public int getCurChatBubble() {
      return curChatBubble;
    }

    /**
     * <code>optional uint32 cur_chat_bubble = 13;</code>
     * @param value the curChatBubble to set
     * @return this
     */
    public GetPhoneDataScRsp setCurChatBubble(final int value) {
      bitField0_ |= 0x00000004;
      curChatBubble = value;
      return this;
    }

    /**
     * <pre>
     * or 7
     * </pre>
     *
     * <code>repeated uint32 owned_phone_themes = 1;</code>
     * @return whether the ownedPhoneThemes field is set
     */
    public boolean hasOwnedPhoneThemes() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * or 7
     * </pre>
     *
     * <code>repeated uint32 owned_phone_themes = 1;</code>
     * @return this
     */
    public GetPhoneDataScRsp clearOwnedPhoneThemes() {
      bitField0_ &= ~0x00000008;
      ownedPhoneThemes.clear();
      return this;
    }

    /**
     * <pre>
     * or 7
     * </pre>
     *
     * <code>repeated uint32 owned_phone_themes = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableOwnedPhoneThemes()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getOwnedPhoneThemes() {
      return ownedPhoneThemes;
    }

    /**
     * <pre>
     * or 7
     * </pre>
     *
     * <code>repeated uint32 owned_phone_themes = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableOwnedPhoneThemes() {
      bitField0_ |= 0x00000008;
      return ownedPhoneThemes;
    }

    /**
     * <pre>
     * or 7
     * </pre>
     *
     * <code>repeated uint32 owned_phone_themes = 1;</code>
     * @param value the ownedPhoneThemes to add
     * @return this
     */
    public GetPhoneDataScRsp addOwnedPhoneThemes(final int value) {
      bitField0_ |= 0x00000008;
      ownedPhoneThemes.add(value);
      return this;
    }

    /**
     * <pre>
     * or 7
     * </pre>
     *
     * <code>repeated uint32 owned_phone_themes = 1;</code>
     * @param values the ownedPhoneThemes to add
     * @return this
     */
    public GetPhoneDataScRsp addAllOwnedPhoneThemes(final int... values) {
      bitField0_ |= 0x00000008;
      ownedPhoneThemes.addAll(values);
      return this;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>repeated uint32 owned_chat_bubbles = 7;</code>
     * @return whether the ownedChatBubbles field is set
     */
    public boolean hasOwnedChatBubbles() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>repeated uint32 owned_chat_bubbles = 7;</code>
     * @return this
     */
    public GetPhoneDataScRsp clearOwnedChatBubbles() {
      bitField0_ &= ~0x00000010;
      ownedChatBubbles.clear();
      return this;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>repeated uint32 owned_chat_bubbles = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableOwnedChatBubbles()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getOwnedChatBubbles() {
      return ownedChatBubbles;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>repeated uint32 owned_chat_bubbles = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableOwnedChatBubbles() {
      bitField0_ |= 0x00000010;
      return ownedChatBubbles;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>repeated uint32 owned_chat_bubbles = 7;</code>
     * @param value the ownedChatBubbles to add
     * @return this
     */
    public GetPhoneDataScRsp addOwnedChatBubbles(final int value) {
      bitField0_ |= 0x00000010;
      ownedChatBubbles.add(value);
      return this;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>repeated uint32 owned_chat_bubbles = 7;</code>
     * @param values the ownedChatBubbles to add
     * @return this
     */
    public GetPhoneDataScRsp addAllOwnedChatBubbles(final int... values) {
      bitField0_ |= 0x00000010;
      ownedChatBubbles.addAll(values);
      return this;
    }

    @Override
    public GetPhoneDataScRsp copyFrom(final GetPhoneDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curPhoneTheme = other.curPhoneTheme;
        retcode = other.retcode;
        curChatBubble = other.curChatBubble;
        ownedPhoneThemes.copyFrom(other.ownedPhoneThemes);
        ownedChatBubbles.copyFrom(other.ownedChatBubbles);
      }
      return this;
    }

    @Override
    public GetPhoneDataScRsp mergeFrom(final GetPhoneDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurPhoneTheme()) {
        setCurPhoneTheme(other.curPhoneTheme);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasCurChatBubble()) {
        setCurChatBubble(other.curChatBubble);
      }
      if (other.hasOwnedPhoneThemes()) {
        getMutableOwnedPhoneThemes().addAll(other.ownedPhoneThemes);
      }
      if (other.hasOwnedChatBubbles()) {
        getMutableOwnedChatBubbles().addAll(other.ownedChatBubbles);
      }
      return this;
    }

    @Override
    public GetPhoneDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curPhoneTheme = 0;
      retcode = 0;
      curChatBubble = 0;
      ownedPhoneThemes.clear();
      ownedChatBubbles.clear();
      return this;
    }

    @Override
    public GetPhoneDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      ownedPhoneThemes.clear();
      ownedChatBubbles.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetPhoneDataScRsp)) {
        return false;
      }
      GetPhoneDataScRsp other = (GetPhoneDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasCurPhoneTheme() || curPhoneTheme == other.curPhoneTheme)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasCurChatBubble() || curChatBubble == other.curChatBubble)
        && (!hasOwnedPhoneThemes() || ownedPhoneThemes.equals(other.ownedPhoneThemes))
        && (!hasOwnedChatBubbles() || ownedChatBubbles.equals(other.ownedChatBubbles));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(curPhoneTheme);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(curChatBubble);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < ownedPhoneThemes.length(); i++) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(ownedPhoneThemes.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < ownedChatBubbles.length(); i++) {
          output.writeRawByte((byte) 56);
          output.writeUInt32NoTag(ownedChatBubbles.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curPhoneTheme);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curChatBubble);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * ownedPhoneThemes.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(ownedPhoneThemes);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * ownedChatBubbles.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(ownedChatBubbles);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetPhoneDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // curPhoneTheme
            curPhoneTheme = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // curChatBubble
            curChatBubble = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // ownedPhoneThemes [packed=true]
            input.readPackedUInt32(ownedPhoneThemes, tag);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // ownedChatBubbles [packed=true]
            input.readPackedUInt32(ownedChatBubbles, tag);
            bitField0_ |= 0x00000010;
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
          case 8: {
            // ownedPhoneThemes [packed=false]
            tag = input.readRepeatedUInt32(ownedPhoneThemes, tag);
            bitField0_ |= 0x00000008;
            break;
          }
          case 56: {
            // ownedChatBubbles [packed=false]
            tag = input.readRepeatedUInt32(ownedChatBubbles, tag);
            bitField0_ |= 0x00000010;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.curPhoneTheme, curPhoneTheme);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.curChatBubble, curChatBubble);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.ownedPhoneThemes, ownedPhoneThemes);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedUInt32(FieldNames.ownedChatBubbles, ownedChatBubbles);
      }
      output.endObject();
    }

    @Override
    public GetPhoneDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 405670747:
          case -514634695: {
            if (input.isAtField(FieldNames.curPhoneTheme)) {
              if (!input.trySkipNullValue()) {
                curPhoneTheme = input.readUInt32();
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
          case 94167140:
          case 1828957140: {
            if (input.isAtField(FieldNames.curChatBubble)) {
              if (!input.trySkipNullValue()) {
                curChatBubble = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -512676109:
          case -1128638699: {
            if (input.isAtField(FieldNames.ownedPhoneThemes)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(ownedPhoneThemes);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1579353334:
          case -1491735846: {
            if (input.isAtField(FieldNames.ownedChatBubbles)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(ownedChatBubbles);
                bitField0_ |= 0x00000010;
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
    public GetPhoneDataScRsp clone() {
      return new GetPhoneDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetPhoneDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetPhoneDataScRsp(), data).checkInitialized();
    }

    public static GetPhoneDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPhoneDataScRsp(), input).checkInitialized();
    }

    public static GetPhoneDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPhoneDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetPhoneDataScRsp messages
     */
    public static MessageFactory<GetPhoneDataScRsp> getFactory() {
      return GetPhoneDataScRspFactory.INSTANCE;
    }

    private enum GetPhoneDataScRspFactory implements MessageFactory<GetPhoneDataScRsp> {
      INSTANCE;

      @Override
      public GetPhoneDataScRsp create() {
        return GetPhoneDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curPhoneTheme = FieldName.forField("curPhoneTheme", "cur_phone_theme");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName curChatBubble = FieldName.forField("curChatBubble", "cur_chat_bubble");

      static final FieldName ownedPhoneThemes = FieldName.forField("ownedPhoneThemes", "owned_phone_themes");

      static final FieldName ownedChatBubbles = FieldName.forField("ownedChatBubbles", "owned_chat_bubbles");
    }
  }
}
