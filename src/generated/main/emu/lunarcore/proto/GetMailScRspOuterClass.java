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

public final class GetMailScRspOuterClass {
  /**
   * Protobuf type {@code GetMailScRsp}
   */
  public static final class GetMailScRsp extends ProtoMessage<GetMailScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 2;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 start = 6;</code>
     */
    private int start;

    /**
     * <code>optional uint32 total_num = 15;</code>
     */
    private int totalNum;

    /**
     * <code>optional bool is_end = 8;</code>
     */
    private boolean isEnd;

    /**
     * <code>repeated .ClientMail mail_list = 7;</code>
     */
    private final RepeatedMessage<ClientMailOuterClass.ClientMail> mailList = RepeatedMessage.newEmptyInstance(ClientMailOuterClass.ClientMail.getFactory());

    /**
     * <code>repeated .ClientMail notice_mail_list = 14;</code>
     */
    private final RepeatedMessage<ClientMailOuterClass.ClientMail> noticeMailList = RepeatedMessage.newEmptyInstance(ClientMailOuterClass.ClientMail.getFactory());

    private GetMailScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetMailScRsp}
     */
    public static GetMailScRsp newInstance() {
      return new GetMailScRsp();
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @return this
     */
    public GetMailScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetMailScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 start = 6;</code>
     * @return whether the start field is set
     */
    public boolean hasStart() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 start = 6;</code>
     * @return this
     */
    public GetMailScRsp clearStart() {
      bitField0_ &= ~0x00000002;
      start = 0;
      return this;
    }

    /**
     * <code>optional uint32 start = 6;</code>
     * @return the start
     */
    public int getStart() {
      return start;
    }

    /**
     * <code>optional uint32 start = 6;</code>
     * @param value the start to set
     * @return this
     */
    public GetMailScRsp setStart(final int value) {
      bitField0_ |= 0x00000002;
      start = value;
      return this;
    }

    /**
     * <code>optional uint32 total_num = 15;</code>
     * @return whether the totalNum field is set
     */
    public boolean hasTotalNum() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 total_num = 15;</code>
     * @return this
     */
    public GetMailScRsp clearTotalNum() {
      bitField0_ &= ~0x00000004;
      totalNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 total_num = 15;</code>
     * @return the totalNum
     */
    public int getTotalNum() {
      return totalNum;
    }

    /**
     * <code>optional uint32 total_num = 15;</code>
     * @param value the totalNum to set
     * @return this
     */
    public GetMailScRsp setTotalNum(final int value) {
      bitField0_ |= 0x00000004;
      totalNum = value;
      return this;
    }

    /**
     * <code>optional bool is_end = 8;</code>
     * @return whether the isEnd field is set
     */
    public boolean hasIsEnd() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional bool is_end = 8;</code>
     * @return this
     */
    public GetMailScRsp clearIsEnd() {
      bitField0_ &= ~0x00000008;
      isEnd = false;
      return this;
    }

    /**
     * <code>optional bool is_end = 8;</code>
     * @return the isEnd
     */
    public boolean getIsEnd() {
      return isEnd;
    }

    /**
     * <code>optional bool is_end = 8;</code>
     * @param value the isEnd to set
     * @return this
     */
    public GetMailScRsp setIsEnd(final boolean value) {
      bitField0_ |= 0x00000008;
      isEnd = value;
      return this;
    }

    /**
     * <code>repeated .ClientMail mail_list = 7;</code>
     * @return whether the mailList field is set
     */
    public boolean hasMailList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated .ClientMail mail_list = 7;</code>
     * @return this
     */
    public GetMailScRsp clearMailList() {
      bitField0_ &= ~0x00000010;
      mailList.clear();
      return this;
    }

    /**
     * <code>repeated .ClientMail mail_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMailList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getMailList() {
      return mailList;
    }

    /**
     * <code>repeated .ClientMail mail_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getMutableMailList() {
      bitField0_ |= 0x00000010;
      return mailList;
    }

    /**
     * <code>repeated .ClientMail mail_list = 7;</code>
     * @param value the mailList to add
     * @return this
     */
    public GetMailScRsp addMailList(final ClientMailOuterClass.ClientMail value) {
      bitField0_ |= 0x00000010;
      mailList.add(value);
      return this;
    }

    /**
     * <code>repeated .ClientMail mail_list = 7;</code>
     * @param values the mailList to add
     * @return this
     */
    public GetMailScRsp addAllMailList(final ClientMailOuterClass.ClientMail... values) {
      bitField0_ |= 0x00000010;
      mailList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 14;</code>
     * @return whether the noticeMailList field is set
     */
    public boolean hasNoticeMailList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 14;</code>
     * @return this
     */
    public GetMailScRsp clearNoticeMailList() {
      bitField0_ &= ~0x00000020;
      noticeMailList.clear();
      return this;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNoticeMailList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getNoticeMailList() {
      return noticeMailList;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ClientMailOuterClass.ClientMail> getMutableNoticeMailList() {
      bitField0_ |= 0x00000020;
      return noticeMailList;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 14;</code>
     * @param value the noticeMailList to add
     * @return this
     */
    public GetMailScRsp addNoticeMailList(final ClientMailOuterClass.ClientMail value) {
      bitField0_ |= 0x00000020;
      noticeMailList.add(value);
      return this;
    }

    /**
     * <code>repeated .ClientMail notice_mail_list = 14;</code>
     * @param values the noticeMailList to add
     * @return this
     */
    public GetMailScRsp addAllNoticeMailList(final ClientMailOuterClass.ClientMail... values) {
      bitField0_ |= 0x00000020;
      noticeMailList.addAll(values);
      return this;
    }

    @Override
    public GetMailScRsp copyFrom(final GetMailScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        start = other.start;
        totalNum = other.totalNum;
        isEnd = other.isEnd;
        mailList.copyFrom(other.mailList);
        noticeMailList.copyFrom(other.noticeMailList);
      }
      return this;
    }

    @Override
    public GetMailScRsp mergeFrom(final GetMailScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasStart()) {
        setStart(other.start);
      }
      if (other.hasTotalNum()) {
        setTotalNum(other.totalNum);
      }
      if (other.hasIsEnd()) {
        setIsEnd(other.isEnd);
      }
      if (other.hasMailList()) {
        getMutableMailList().addAll(other.mailList);
      }
      if (other.hasNoticeMailList()) {
        getMutableNoticeMailList().addAll(other.noticeMailList);
      }
      return this;
    }

    @Override
    public GetMailScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      start = 0;
      totalNum = 0;
      isEnd = false;
      mailList.clear();
      noticeMailList.clear();
      return this;
    }

    @Override
    public GetMailScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mailList.clearQuick();
      noticeMailList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMailScRsp)) {
        return false;
      }
      GetMailScRsp other = (GetMailScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasStart() || start == other.start)
        && (!hasTotalNum() || totalNum == other.totalNum)
        && (!hasIsEnd() || isEnd == other.isEnd)
        && (!hasMailList() || mailList.equals(other.mailList))
        && (!hasNoticeMailList() || noticeMailList.equals(other.noticeMailList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(start);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(totalNum);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 64);
        output.writeBoolNoTag(isEnd);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < mailList.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(mailList.get(i));
        }
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < noticeMailList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(noticeMailList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(start);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(totalNum);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * mailList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(mailList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * noticeMailList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(noticeMailList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMailScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // start
            start = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // totalNum
            totalNum = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // isEnd
            isEnd = input.readBool();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // mailList
            tag = input.readRepeatedMessage(mailList, tag);
            bitField0_ |= 0x00000010;
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // noticeMailList
            tag = input.readRepeatedMessage(noticeMailList, tag);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.start, start);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.totalNum, totalNum);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeBool(FieldNames.isEnd, isEnd);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.mailList, mailList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.noticeMailList, noticeMailList);
      }
      output.endObject();
    }

    @Override
    public GetMailScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 109757538: {
            if (input.isAtField(FieldNames.start)) {
              if (!input.trySkipNullValue()) {
                start = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -849911390:
          case -576949237: {
            if (input.isAtField(FieldNames.totalNum)) {
              if (!input.trySkipNullValue()) {
                totalNum = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100465489:
          case -1179770810: {
            if (input.isAtField(FieldNames.isEnd)) {
              if (!input.trySkipNullValue()) {
                isEnd = input.readBool();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -10520843:
          case -308519386: {
            if (input.isAtField(FieldNames.mailList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(mailList);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 17373677:
          case 1540899199: {
            if (input.isAtField(FieldNames.noticeMailList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(noticeMailList);
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
    public GetMailScRsp clone() {
      return new GetMailScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMailScRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMailScRsp(), data).checkInitialized();
    }

    public static GetMailScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMailScRsp(), input).checkInitialized();
    }

    public static GetMailScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMailScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMailScRsp messages
     */
    public static MessageFactory<GetMailScRsp> getFactory() {
      return GetMailScRspFactory.INSTANCE;
    }

    private enum GetMailScRspFactory implements MessageFactory<GetMailScRsp> {
      INSTANCE;

      @Override
      public GetMailScRsp create() {
        return GetMailScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName start = FieldName.forField("start");

      static final FieldName totalNum = FieldName.forField("totalNum", "total_num");

      static final FieldName isEnd = FieldName.forField("isEnd", "is_end");

      static final FieldName mailList = FieldName.forField("mailList", "mail_list");

      static final FieldName noticeMailList = FieldName.forField("noticeMailList", "notice_mail_list");
    }
  }
}
