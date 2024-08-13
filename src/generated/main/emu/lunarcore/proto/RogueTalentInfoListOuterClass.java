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

public final class RogueTalentInfoListOuterClass {
  /**
   * Protobuf type {@code RogueTalentInfoList}
   */
  public static final class RogueTalentInfoList extends ProtoMessage<RogueTalentInfoList> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .RogueTalentInfo talent_info = 7;</code>
     */
    private final RepeatedMessage<RogueTalentInfoOuterClass.RogueTalentInfo> talentInfo = RepeatedMessage.newEmptyInstance(RogueTalentInfoOuterClass.RogueTalentInfo.getFactory());

    private RogueTalentInfoList() {
    }

    /**
     * @return a new empty instance of {@code RogueTalentInfoList}
     */
    public static RogueTalentInfoList newInstance() {
      return new RogueTalentInfoList();
    }

    /**
     * <code>repeated .RogueTalentInfo talent_info = 7;</code>
     * @return whether the talentInfo field is set
     */
    public boolean hasTalentInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .RogueTalentInfo talent_info = 7;</code>
     * @return this
     */
    public RogueTalentInfoList clearTalentInfo() {
      bitField0_ &= ~0x00000001;
      talentInfo.clear();
      return this;
    }

    /**
     * <code>repeated .RogueTalentInfo talent_info = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTalentInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueTalentInfoOuterClass.RogueTalentInfo> getTalentInfo() {
      return talentInfo;
    }

    /**
     * <code>repeated .RogueTalentInfo talent_info = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueTalentInfoOuterClass.RogueTalentInfo> getMutableTalentInfo() {
      bitField0_ |= 0x00000001;
      return talentInfo;
    }

    /**
     * <code>repeated .RogueTalentInfo talent_info = 7;</code>
     * @param value the talentInfo to add
     * @return this
     */
    public RogueTalentInfoList addTalentInfo(
        final RogueTalentInfoOuterClass.RogueTalentInfo value) {
      bitField0_ |= 0x00000001;
      talentInfo.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueTalentInfo talent_info = 7;</code>
     * @param values the talentInfo to add
     * @return this
     */
    public RogueTalentInfoList addAllTalentInfo(
        final RogueTalentInfoOuterClass.RogueTalentInfo... values) {
      bitField0_ |= 0x00000001;
      talentInfo.addAll(values);
      return this;
    }

    @Override
    public RogueTalentInfoList copyFrom(final RogueTalentInfoList other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        talentInfo.copyFrom(other.talentInfo);
      }
      return this;
    }

    @Override
    public RogueTalentInfoList mergeFrom(final RogueTalentInfoList other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTalentInfo()) {
        getMutableTalentInfo().addAll(other.talentInfo);
      }
      return this;
    }

    @Override
    public RogueTalentInfoList clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      talentInfo.clear();
      return this;
    }

    @Override
    public RogueTalentInfoList clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      talentInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueTalentInfoList)) {
        return false;
      }
      RogueTalentInfoList other = (RogueTalentInfoList) o;
      return bitField0_ == other.bitField0_
        && (!hasTalentInfo() || talentInfo.equals(other.talentInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < talentInfo.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(talentInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * talentInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(talentInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueTalentInfoList mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 58: {
            // talentInfo
            tag = input.readRepeatedMessage(talentInfo, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.talentInfo, talentInfo);
      }
      output.endObject();
    }

    @Override
    public RogueTalentInfoList mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1396978618:
          case 376840225: {
            if (input.isAtField(FieldNames.talentInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(talentInfo);
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
    public RogueTalentInfoList clone() {
      return new RogueTalentInfoList().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueTalentInfoList parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueTalentInfoList(), data).checkInitialized();
    }

    public static RogueTalentInfoList parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueTalentInfoList(), input).checkInitialized();
    }

    public static RogueTalentInfoList parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueTalentInfoList(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueTalentInfoList messages
     */
    public static MessageFactory<RogueTalentInfoList> getFactory() {
      return RogueTalentInfoListFactory.INSTANCE;
    }

    private enum RogueTalentInfoListFactory implements MessageFactory<RogueTalentInfoList> {
      INSTANCE;

      @Override
      public RogueTalentInfoList create() {
        return RogueTalentInfoList.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName talentInfo = FieldName.forField("talentInfo", "talent_info");
    }
  }
}
