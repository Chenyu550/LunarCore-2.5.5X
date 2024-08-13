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

public final class FinishRogueCommonDialogueCsReqOuterClass {
  /**
   * Protobuf type {@code FinishRogueCommonDialogueCsReq}
   */
  public static final class FinishRogueCommonDialogueCsReq extends ProtoMessage<FinishRogueCommonDialogueCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 event_unique_id = 9;</code>
     */
    private int eventUniqueId;

    private FinishRogueCommonDialogueCsReq() {
    }

    /**
     * @return a new empty instance of {@code FinishRogueCommonDialogueCsReq}
     */
    public static FinishRogueCommonDialogueCsReq newInstance() {
      return new FinishRogueCommonDialogueCsReq();
    }

    /**
     * <code>optional uint32 event_unique_id = 9;</code>
     * @return whether the eventUniqueId field is set
     */
    public boolean hasEventUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 event_unique_id = 9;</code>
     * @return this
     */
    public FinishRogueCommonDialogueCsReq clearEventUniqueId() {
      bitField0_ &= ~0x00000001;
      eventUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 event_unique_id = 9;</code>
     * @return the eventUniqueId
     */
    public int getEventUniqueId() {
      return eventUniqueId;
    }

    /**
     * <code>optional uint32 event_unique_id = 9;</code>
     * @param value the eventUniqueId to set
     * @return this
     */
    public FinishRogueCommonDialogueCsReq setEventUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      eventUniqueId = value;
      return this;
    }

    @Override
    public FinishRogueCommonDialogueCsReq copyFrom(final FinishRogueCommonDialogueCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        eventUniqueId = other.eventUniqueId;
      }
      return this;
    }

    @Override
    public FinishRogueCommonDialogueCsReq mergeFrom(final FinishRogueCommonDialogueCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEventUniqueId()) {
        setEventUniqueId(other.eventUniqueId);
      }
      return this;
    }

    @Override
    public FinishRogueCommonDialogueCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      eventUniqueId = 0;
      return this;
    }

    @Override
    public FinishRogueCommonDialogueCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof FinishRogueCommonDialogueCsReq)) {
        return false;
      }
      FinishRogueCommonDialogueCsReq other = (FinishRogueCommonDialogueCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEventUniqueId() || eventUniqueId == other.eventUniqueId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(eventUniqueId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eventUniqueId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FinishRogueCommonDialogueCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // eventUniqueId
            eventUniqueId = input.readUInt32();
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
        output.writeUInt32(FieldNames.eventUniqueId, eventUniqueId);
      }
      output.endObject();
    }

    @Override
    public FinishRogueCommonDialogueCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2091680134:
          case -157385500: {
            if (input.isAtField(FieldNames.eventUniqueId)) {
              if (!input.trySkipNullValue()) {
                eventUniqueId = input.readUInt32();
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
    public FinishRogueCommonDialogueCsReq clone() {
      return new FinishRogueCommonDialogueCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FinishRogueCommonDialogueCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FinishRogueCommonDialogueCsReq(), data).checkInitialized();
    }

    public static FinishRogueCommonDialogueCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new FinishRogueCommonDialogueCsReq(), input).checkInitialized();
    }

    public static FinishRogueCommonDialogueCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new FinishRogueCommonDialogueCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating FinishRogueCommonDialogueCsReq messages
     */
    public static MessageFactory<FinishRogueCommonDialogueCsReq> getFactory() {
      return FinishRogueCommonDialogueCsReqFactory.INSTANCE;
    }

    private enum FinishRogueCommonDialogueCsReqFactory implements MessageFactory<FinishRogueCommonDialogueCsReq> {
      INSTANCE;

      @Override
      public FinishRogueCommonDialogueCsReq create() {
        return FinishRogueCommonDialogueCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName eventUniqueId = FieldName.forField("eventUniqueId", "event_unique_id");
    }
  }
}
