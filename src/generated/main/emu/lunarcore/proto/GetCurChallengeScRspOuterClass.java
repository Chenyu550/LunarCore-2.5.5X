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

public final class GetCurChallengeScRspOuterClass {
  /**
   * <pre>
   *
   * </pre>
   *
   * Protobuf type {@code GetCurChallengeScRsp}
   */
  public static final class GetCurChallengeScRsp extends ProtoMessage<GetCurChallengeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 9;</code>
     */
    private int retcode;

    /**
     * <code>optional .ChallengeInfo challenge_info = 11;</code>
     */
    private final ChallengeInfoOuterClass.ChallengeInfo challengeInfo = ChallengeInfoOuterClass.ChallengeInfo.newInstance();

    private GetCurChallengeScRsp() {
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * @return a new empty instance of {@code GetCurChallengeScRsp}
     */
    public static GetCurChallengeScRsp newInstance() {
      return new GetCurChallengeScRsp();
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return this
     */
    public GetCurChallengeScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
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
    public GetCurChallengeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 11;</code>
     * @return whether the challengeInfo field is set
     */
    public boolean hasChallengeInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 11;</code>
     * @return this
     */
    public GetCurChallengeScRsp clearChallengeInfo() {
      bitField0_ &= ~0x00000002;
      challengeInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChallengeInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeInfoOuterClass.ChallengeInfo getChallengeInfo() {
      return challengeInfo;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeInfoOuterClass.ChallengeInfo getMutableChallengeInfo() {
      bitField0_ |= 0x00000002;
      return challengeInfo;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 11;</code>
     * @param value the challengeInfo to set
     * @return this
     */
    public GetCurChallengeScRsp setChallengeInfo(
        final ChallengeInfoOuterClass.ChallengeInfo value) {
      bitField0_ |= 0x00000002;
      challengeInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetCurChallengeScRsp copyFrom(final GetCurChallengeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        challengeInfo.copyFrom(other.challengeInfo);
      }
      return this;
    }

    @Override
    public GetCurChallengeScRsp mergeFrom(final GetCurChallengeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasChallengeInfo()) {
        getMutableChallengeInfo().mergeFrom(other.challengeInfo);
      }
      return this;
    }

    @Override
    public GetCurChallengeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      challengeInfo.clear();
      return this;
    }

    @Override
    public GetCurChallengeScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      challengeInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetCurChallengeScRsp)) {
        return false;
      }
      GetCurChallengeScRsp other = (GetCurChallengeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasChallengeInfo() || challengeInfo.equals(other.challengeInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(challengeInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(challengeInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetCurChallengeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // challengeInfo
            input.readMessage(challengeInfo);
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
        output.writeMessage(FieldNames.challengeInfo, challengeInfo);
      }
      output.endObject();
    }

    @Override
    public GetCurChallengeScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -812487759:
          case 602859274: {
            if (input.isAtField(FieldNames.challengeInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(challengeInfo);
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
    public GetCurChallengeScRsp clone() {
      return new GetCurChallengeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetCurChallengeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetCurChallengeScRsp(), data).checkInitialized();
    }

    public static GetCurChallengeScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetCurChallengeScRsp(), input).checkInitialized();
    }

    public static GetCurChallengeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetCurChallengeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetCurChallengeScRsp messages
     */
    public static MessageFactory<GetCurChallengeScRsp> getFactory() {
      return GetCurChallengeScRspFactory.INSTANCE;
    }

    private enum GetCurChallengeScRspFactory implements MessageFactory<GetCurChallengeScRsp> {
      INSTANCE;

      @Override
      public GetCurChallengeScRsp create() {
        return GetCurChallengeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName challengeInfo = FieldName.forField("challengeInfo", "challenge_info");
    }
  }
}
