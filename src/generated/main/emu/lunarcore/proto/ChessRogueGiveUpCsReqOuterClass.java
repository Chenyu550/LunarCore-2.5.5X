// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ChessRogueGiveUpCsReqOuterClass {
  /**
   * Protobuf type {@code ChessRogueGiveUpCsReq}
   */
  public static final class ChessRogueGiveUpCsReq extends ProtoMessage<ChessRogueGiveUpCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    private ChessRogueGiveUpCsReq() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueGiveUpCsReq}
     */
    public static ChessRogueGiveUpCsReq newInstance() {
      return new ChessRogueGiveUpCsReq();
    }

    @Override
    public ChessRogueGiveUpCsReq copyFrom(final ChessRogueGiveUpCsReq other) {
      cachedSize = other.cachedSize;
      return this;
    }

    @Override
    public ChessRogueGiveUpCsReq mergeFrom(final ChessRogueGiveUpCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public ChessRogueGiveUpCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public ChessRogueGiveUpCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueGiveUpCsReq)) {
        return false;
      }
      ChessRogueGiveUpCsReq other = (ChessRogueGiveUpCsReq) o;
      return true;
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueGiveUpCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
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
      output.endObject();
    }

    @Override
    public ChessRogueGiveUpCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
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
    public ChessRogueGiveUpCsReq clone() {
      return new ChessRogueGiveUpCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueGiveUpCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueGiveUpCsReq(), data).checkInitialized();
    }

    public static ChessRogueGiveUpCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueGiveUpCsReq(), input).checkInitialized();
    }

    public static ChessRogueGiveUpCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueGiveUpCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueGiveUpCsReq messages
     */
    public static MessageFactory<ChessRogueGiveUpCsReq> getFactory() {
      return ChessRogueGiveUpCsReqFactory.INSTANCE;
    }

    private enum ChessRogueGiveUpCsReqFactory implements MessageFactory<ChessRogueGiveUpCsReq> {
      INSTANCE;

      @Override
      public ChessRogueGiveUpCsReq create() {
        return ChessRogueGiveUpCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
    }
  }
}
