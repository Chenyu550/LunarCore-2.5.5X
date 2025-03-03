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

public final class GetPrivateChatHistoryScRspOuterClass {
  /**
   * Protobuf type {@code GetPrivateChatHistoryScRsp}
   */
  public static final class GetPrivateChatHistoryScRsp extends ProtoMessage<GetPrivateChatHistoryScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 to_uid = 4;</code>
     */
    private int toUid;

    /**
     * <code>optional uint32 sender_uid = 8;</code>
     */
    private int senderUid;

    /**
     * <code>optional uint32 retcode = 14;</code>
     */
    private int retcode;

    /**
     * <code>repeated .Chat chat_list = 5;</code>
     */
    private final RepeatedMessage<ChatOuterClass.Chat> chatList = RepeatedMessage.newEmptyInstance(ChatOuterClass.Chat.getFactory());

    private GetPrivateChatHistoryScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetPrivateChatHistoryScRsp}
     */
    public static GetPrivateChatHistoryScRsp newInstance() {
      return new GetPrivateChatHistoryScRsp();
    }

    /**
     * <code>optional uint32 to_uid = 4;</code>
     * @return whether the toUid field is set
     */
    public boolean hasToUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 to_uid = 4;</code>
     * @return this
     */
    public GetPrivateChatHistoryScRsp clearToUid() {
      bitField0_ &= ~0x00000001;
      toUid = 0;
      return this;
    }

    /**
     * <code>optional uint32 to_uid = 4;</code>
     * @return the toUid
     */
    public int getToUid() {
      return toUid;
    }

    /**
     * <code>optional uint32 to_uid = 4;</code>
     * @param value the toUid to set
     * @return this
     */
    public GetPrivateChatHistoryScRsp setToUid(final int value) {
      bitField0_ |= 0x00000001;
      toUid = value;
      return this;
    }

    /**
     * <code>optional uint32 sender_uid = 8;</code>
     * @return whether the senderUid field is set
     */
    public boolean hasSenderUid() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 sender_uid = 8;</code>
     * @return this
     */
    public GetPrivateChatHistoryScRsp clearSenderUid() {
      bitField0_ &= ~0x00000002;
      senderUid = 0;
      return this;
    }

    /**
     * <code>optional uint32 sender_uid = 8;</code>
     * @return the senderUid
     */
    public int getSenderUid() {
      return senderUid;
    }

    /**
     * <code>optional uint32 sender_uid = 8;</code>
     * @param value the senderUid to set
     * @return this
     */
    public GetPrivateChatHistoryScRsp setSenderUid(final int value) {
      bitField0_ |= 0x00000002;
      senderUid = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return this
     */
    public GetPrivateChatHistoryScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetPrivateChatHistoryScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .Chat chat_list = 5;</code>
     * @return whether the chatList field is set
     */
    public boolean hasChatList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .Chat chat_list = 5;</code>
     * @return this
     */
    public GetPrivateChatHistoryScRsp clearChatList() {
      bitField0_ &= ~0x00000008;
      chatList.clear();
      return this;
    }

    /**
     * <code>repeated .Chat chat_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChatList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChatOuterClass.Chat> getChatList() {
      return chatList;
    }

    /**
     * <code>repeated .Chat chat_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChatOuterClass.Chat> getMutableChatList() {
      bitField0_ |= 0x00000008;
      return chatList;
    }

    /**
     * <code>repeated .Chat chat_list = 5;</code>
     * @param value the chatList to add
     * @return this
     */
    public GetPrivateChatHistoryScRsp addChatList(final ChatOuterClass.Chat value) {
      bitField0_ |= 0x00000008;
      chatList.add(value);
      return this;
    }

    /**
     * <code>repeated .Chat chat_list = 5;</code>
     * @param values the chatList to add
     * @return this
     */
    public GetPrivateChatHistoryScRsp addAllChatList(final ChatOuterClass.Chat... values) {
      bitField0_ |= 0x00000008;
      chatList.addAll(values);
      return this;
    }

    @Override
    public GetPrivateChatHistoryScRsp copyFrom(final GetPrivateChatHistoryScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        toUid = other.toUid;
        senderUid = other.senderUid;
        retcode = other.retcode;
        chatList.copyFrom(other.chatList);
      }
      return this;
    }

    @Override
    public GetPrivateChatHistoryScRsp mergeFrom(final GetPrivateChatHistoryScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasToUid()) {
        setToUid(other.toUid);
      }
      if (other.hasSenderUid()) {
        setSenderUid(other.senderUid);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasChatList()) {
        getMutableChatList().addAll(other.chatList);
      }
      return this;
    }

    @Override
    public GetPrivateChatHistoryScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      toUid = 0;
      senderUid = 0;
      retcode = 0;
      chatList.clear();
      return this;
    }

    @Override
    public GetPrivateChatHistoryScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      chatList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetPrivateChatHistoryScRsp)) {
        return false;
      }
      GetPrivateChatHistoryScRsp other = (GetPrivateChatHistoryScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasToUid() || toUid == other.toUid)
        && (!hasSenderUid() || senderUid == other.senderUid)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasChatList() || chatList.equals(other.chatList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(toUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(senderUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < chatList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(chatList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(toUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(senderUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * chatList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(chatList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetPrivateChatHistoryScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // toUid
            toUid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // senderUid
            senderUid = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // chatList
            tag = input.readRepeatedMessage(chatList, tag);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.toUid, toUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.senderUid, senderUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.chatList, chatList);
      }
      output.endObject();
    }

    @Override
    public GetPrivateChatHistoryScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 110520277:
          case -868529012: {
            if (input.isAtField(FieldNames.toUid)) {
              if (!input.trySkipNullValue()) {
                toUid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 32180699:
          case 997911366: {
            if (input.isAtField(FieldNames.senderUid)) {
              if (!input.trySkipNullValue()) {
                senderUid = input.readUInt32();
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
          case 1437158422:
          case 1619864869: {
            if (input.isAtField(FieldNames.chatList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(chatList);
                bitField0_ |= 0x00000008;
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
    public GetPrivateChatHistoryScRsp clone() {
      return new GetPrivateChatHistoryScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetPrivateChatHistoryScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetPrivateChatHistoryScRsp(), data).checkInitialized();
    }

    public static GetPrivateChatHistoryScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPrivateChatHistoryScRsp(), input).checkInitialized();
    }

    public static GetPrivateChatHistoryScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPrivateChatHistoryScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetPrivateChatHistoryScRsp messages
     */
    public static MessageFactory<GetPrivateChatHistoryScRsp> getFactory() {
      return GetPrivateChatHistoryScRspFactory.INSTANCE;
    }

    private enum GetPrivateChatHistoryScRspFactory implements MessageFactory<GetPrivateChatHistoryScRsp> {
      INSTANCE;

      @Override
      public GetPrivateChatHistoryScRsp create() {
        return GetPrivateChatHistoryScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName toUid = FieldName.forField("toUid", "to_uid");

      static final FieldName senderUid = FieldName.forField("senderUid", "sender_uid");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName chatList = FieldName.forField("chatList", "chat_list");
    }
  }
}
