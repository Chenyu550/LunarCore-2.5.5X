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

public final class GameMiracleInfoOuterClass {
  /**
   * Protobuf type {@code GameMiracleInfo}
   */
  public static final class GameMiracleInfo extends ProtoMessage<GameMiracleInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueMiracleInfo game_miracle_info = 14;</code>
     */
    private final RogueMiracleInfoOuterClass.RogueMiracleInfo gameMiracleInfo = RogueMiracleInfoOuterClass.RogueMiracleInfo.newInstance();

    private GameMiracleInfo() {
    }

    /**
     * @return a new empty instance of {@code GameMiracleInfo}
     */
    public static GameMiracleInfo newInstance() {
      return new GameMiracleInfo();
    }

    /**
     * <code>optional .RogueMiracleInfo game_miracle_info = 14;</code>
     * @return whether the gameMiracleInfo field is set
     */
    public boolean hasGameMiracleInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueMiracleInfo game_miracle_info = 14;</code>
     * @return this
     */
    public GameMiracleInfo clearGameMiracleInfo() {
      bitField0_ &= ~0x00000001;
      gameMiracleInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueMiracleInfo game_miracle_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGameMiracleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueMiracleInfoOuterClass.RogueMiracleInfo getGameMiracleInfo() {
      return gameMiracleInfo;
    }

    /**
     * <code>optional .RogueMiracleInfo game_miracle_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueMiracleInfoOuterClass.RogueMiracleInfo getMutableGameMiracleInfo() {
      bitField0_ |= 0x00000001;
      return gameMiracleInfo;
    }

    /**
     * <code>optional .RogueMiracleInfo game_miracle_info = 14;</code>
     * @param value the gameMiracleInfo to set
     * @return this
     */
    public GameMiracleInfo setGameMiracleInfo(
        final RogueMiracleInfoOuterClass.RogueMiracleInfo value) {
      bitField0_ |= 0x00000001;
      gameMiracleInfo.copyFrom(value);
      return this;
    }

    @Override
    public GameMiracleInfo copyFrom(final GameMiracleInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gameMiracleInfo.copyFrom(other.gameMiracleInfo);
      }
      return this;
    }

    @Override
    public GameMiracleInfo mergeFrom(final GameMiracleInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGameMiracleInfo()) {
        getMutableGameMiracleInfo().mergeFrom(other.gameMiracleInfo);
      }
      return this;
    }

    @Override
    public GameMiracleInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gameMiracleInfo.clear();
      return this;
    }

    @Override
    public GameMiracleInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gameMiracleInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GameMiracleInfo)) {
        return false;
      }
      GameMiracleInfo other = (GameMiracleInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasGameMiracleInfo() || gameMiracleInfo.equals(other.gameMiracleInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(gameMiracleInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(gameMiracleInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GameMiracleInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 114: {
            // gameMiracleInfo
            input.readMessage(gameMiracleInfo);
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
        output.writeMessage(FieldNames.gameMiracleInfo, gameMiracleInfo);
      }
      output.endObject();
    }

    @Override
    public GameMiracleInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -471061139:
          case 1278717673: {
            if (input.isAtField(FieldNames.gameMiracleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(gameMiracleInfo);
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
    public GameMiracleInfo clone() {
      return new GameMiracleInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GameMiracleInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GameMiracleInfo(), data).checkInitialized();
    }

    public static GameMiracleInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GameMiracleInfo(), input).checkInitialized();
    }

    public static GameMiracleInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GameMiracleInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating GameMiracleInfo messages
     */
    public static MessageFactory<GameMiracleInfo> getFactory() {
      return GameMiracleInfoFactory.INSTANCE;
    }

    private enum GameMiracleInfoFactory implements MessageFactory<GameMiracleInfo> {
      INSTANCE;

      @Override
      public GameMiracleInfo create() {
        return GameMiracleInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gameMiracleInfo = FieldName.forField("gameMiracleInfo", "game_miracle_info");
    }
  }
}
