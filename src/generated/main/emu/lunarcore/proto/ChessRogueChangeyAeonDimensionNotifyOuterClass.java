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

public final class ChessRogueChangeyAeonDimensionNotifyOuterClass {
  /**
   * Protobuf type {@code ChessRogueChangeyAeonDimensionNotify}
   */
  public static final class ChessRogueChangeyAeonDimensionNotify extends ProtoMessage<ChessRogueChangeyAeonDimensionNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ChessRogueQueryAeon info = 6;</code>
     */
    private final ChessRogueQueryAeonOuterClass.ChessRogueQueryAeon info = ChessRogueQueryAeonOuterClass.ChessRogueQueryAeon.newInstance();

    private ChessRogueChangeyAeonDimensionNotify() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueChangeyAeonDimensionNotify}
     */
    public static ChessRogueChangeyAeonDimensionNotify newInstance() {
      return new ChessRogueChangeyAeonDimensionNotify();
    }

    /**
     * <code>optional .ChessRogueQueryAeon info = 6;</code>
     * @return whether the info field is set
     */
    public boolean hasInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ChessRogueQueryAeon info = 6;</code>
     * @return this
     */
    public ChessRogueChangeyAeonDimensionNotify clearInfo() {
      bitField0_ &= ~0x00000001;
      info.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueQueryAeon info = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueQueryAeonOuterClass.ChessRogueQueryAeon getInfo() {
      return info;
    }

    /**
     * <code>optional .ChessRogueQueryAeon info = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueQueryAeonOuterClass.ChessRogueQueryAeon getMutableInfo() {
      bitField0_ |= 0x00000001;
      return info;
    }

    /**
     * <code>optional .ChessRogueQueryAeon info = 6;</code>
     * @param value the info to set
     * @return this
     */
    public ChessRogueChangeyAeonDimensionNotify setInfo(
        final ChessRogueQueryAeonOuterClass.ChessRogueQueryAeon value) {
      bitField0_ |= 0x00000001;
      info.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueChangeyAeonDimensionNotify copyFrom(
        final ChessRogueChangeyAeonDimensionNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        info.copyFrom(other.info);
      }
      return this;
    }

    @Override
    public ChessRogueChangeyAeonDimensionNotify mergeFrom(
        final ChessRogueChangeyAeonDimensionNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasInfo()) {
        getMutableInfo().mergeFrom(other.info);
      }
      return this;
    }

    @Override
    public ChessRogueChangeyAeonDimensionNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      info.clear();
      return this;
    }

    @Override
    public ChessRogueChangeyAeonDimensionNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      info.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueChangeyAeonDimensionNotify)) {
        return false;
      }
      ChessRogueChangeyAeonDimensionNotify other = (ChessRogueChangeyAeonDimensionNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasInfo() || info.equals(other.info));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(info);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(info);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueChangeyAeonDimensionNotify mergeFrom(final ProtoSource input) throws
        IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 50: {
            // info
            input.readMessage(info);
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
        output.writeMessage(FieldNames.info, info);
      }
      output.endObject();
    }

    @Override
    public ChessRogueChangeyAeonDimensionNotify mergeFrom(final JsonSource input) throws
        IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3237038: {
            if (input.isAtField(FieldNames.info)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(info);
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
    public ChessRogueChangeyAeonDimensionNotify clone() {
      return new ChessRogueChangeyAeonDimensionNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueChangeyAeonDimensionNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueChangeyAeonDimensionNotify(), data).checkInitialized();
    }

    public static ChessRogueChangeyAeonDimensionNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueChangeyAeonDimensionNotify(), input).checkInitialized();
    }

    public static ChessRogueChangeyAeonDimensionNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueChangeyAeonDimensionNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueChangeyAeonDimensionNotify messages
     */
    public static MessageFactory<ChessRogueChangeyAeonDimensionNotify> getFactory() {
      return ChessRogueChangeyAeonDimensionNotifyFactory.INSTANCE;
    }

    private enum ChessRogueChangeyAeonDimensionNotifyFactory implements MessageFactory<ChessRogueChangeyAeonDimensionNotify> {
      INSTANCE;

      @Override
      public ChessRogueChangeyAeonDimensionNotify create() {
        return ChessRogueChangeyAeonDimensionNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName info = FieldName.forField("info");
    }
  }
}
