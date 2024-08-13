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

public final class ChessRogueBuffEnhanceListOuterClass {
  /**
   * Protobuf type {@code ChessRogueBuffEnhanceList}
   */
  public static final class ChessRogueBuffEnhanceList extends ProtoMessage<ChessRogueBuffEnhanceList> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .ChessRogueBuffEnhanceInfo enhance_info_list = 2;</code>
     */
    private final RepeatedMessage<ChessRogueBuffEnhanceInfoOuterClass.ChessRogueBuffEnhanceInfo> enhanceInfoList = RepeatedMessage.newEmptyInstance(ChessRogueBuffEnhanceInfoOuterClass.ChessRogueBuffEnhanceInfo.getFactory());

    private ChessRogueBuffEnhanceList() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueBuffEnhanceList}
     */
    public static ChessRogueBuffEnhanceList newInstance() {
      return new ChessRogueBuffEnhanceList();
    }

    /**
     * <code>repeated .ChessRogueBuffEnhanceInfo enhance_info_list = 2;</code>
     * @return whether the enhanceInfoList field is set
     */
    public boolean hasEnhanceInfoList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .ChessRogueBuffEnhanceInfo enhance_info_list = 2;</code>
     * @return this
     */
    public ChessRogueBuffEnhanceList clearEnhanceInfoList() {
      bitField0_ &= ~0x00000001;
      enhanceInfoList.clear();
      return this;
    }

    /**
     * <code>repeated .ChessRogueBuffEnhanceInfo enhance_info_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEnhanceInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueBuffEnhanceInfoOuterClass.ChessRogueBuffEnhanceInfo> getEnhanceInfoList(
        ) {
      return enhanceInfoList;
    }

    /**
     * <code>repeated .ChessRogueBuffEnhanceInfo enhance_info_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueBuffEnhanceInfoOuterClass.ChessRogueBuffEnhanceInfo> getMutableEnhanceInfoList(
        ) {
      bitField0_ |= 0x00000001;
      return enhanceInfoList;
    }

    /**
     * <code>repeated .ChessRogueBuffEnhanceInfo enhance_info_list = 2;</code>
     * @param value the enhanceInfoList to add
     * @return this
     */
    public ChessRogueBuffEnhanceList addEnhanceInfoList(
        final ChessRogueBuffEnhanceInfoOuterClass.ChessRogueBuffEnhanceInfo value) {
      bitField0_ |= 0x00000001;
      enhanceInfoList.add(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueBuffEnhanceInfo enhance_info_list = 2;</code>
     * @param values the enhanceInfoList to add
     * @return this
     */
    public ChessRogueBuffEnhanceList addAllEnhanceInfoList(
        final ChessRogueBuffEnhanceInfoOuterClass.ChessRogueBuffEnhanceInfo... values) {
      bitField0_ |= 0x00000001;
      enhanceInfoList.addAll(values);
      return this;
    }

    @Override
    public ChessRogueBuffEnhanceList copyFrom(final ChessRogueBuffEnhanceList other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        enhanceInfoList.copyFrom(other.enhanceInfoList);
      }
      return this;
    }

    @Override
    public ChessRogueBuffEnhanceList mergeFrom(final ChessRogueBuffEnhanceList other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEnhanceInfoList()) {
        getMutableEnhanceInfoList().addAll(other.enhanceInfoList);
      }
      return this;
    }

    @Override
    public ChessRogueBuffEnhanceList clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      enhanceInfoList.clear();
      return this;
    }

    @Override
    public ChessRogueBuffEnhanceList clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      enhanceInfoList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueBuffEnhanceList)) {
        return false;
      }
      ChessRogueBuffEnhanceList other = (ChessRogueBuffEnhanceList) o;
      return bitField0_ == other.bitField0_
        && (!hasEnhanceInfoList() || enhanceInfoList.equals(other.enhanceInfoList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < enhanceInfoList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(enhanceInfoList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * enhanceInfoList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(enhanceInfoList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueBuffEnhanceList mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // enhanceInfoList
            tag = input.readRepeatedMessage(enhanceInfoList, tag);
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
        output.writeRepeatedMessage(FieldNames.enhanceInfoList, enhanceInfoList);
      }
      output.endObject();
    }

    @Override
    public ChessRogueBuffEnhanceList mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1350900538:
          case -88113858: {
            if (input.isAtField(FieldNames.enhanceInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(enhanceInfoList);
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
    public ChessRogueBuffEnhanceList clone() {
      return new ChessRogueBuffEnhanceList().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueBuffEnhanceList parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueBuffEnhanceList(), data).checkInitialized();
    }

    public static ChessRogueBuffEnhanceList parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueBuffEnhanceList(), input).checkInitialized();
    }

    public static ChessRogueBuffEnhanceList parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueBuffEnhanceList(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueBuffEnhanceList messages
     */
    public static MessageFactory<ChessRogueBuffEnhanceList> getFactory() {
      return ChessRogueBuffEnhanceListFactory.INSTANCE;
    }

    private enum ChessRogueBuffEnhanceListFactory implements MessageFactory<ChessRogueBuffEnhanceList> {
      INSTANCE;

      @Override
      public ChessRogueBuffEnhanceList create() {
        return ChessRogueBuffEnhanceList.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName enhanceInfoList = FieldName.forField("enhanceInfoList", "enhance_info_list");
    }
  }
}
