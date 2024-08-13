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

public final class ChessRogueLineupInfoOuterClass {
  /**
   * Protobuf type {@code ChessRogueLineupInfo}
   */
  public static final class ChessRogueLineupInfo extends ProtoMessage<ChessRogueLineupInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueAvatarReviveCost revive_info = 10;</code>
     */
    private final RogueAvatarReviveCostOuterClass.RogueAvatarReviveCost reviveInfo = RogueAvatarReviveCostOuterClass.RogueAvatarReviveCost.newInstance();

    /**
     * <code>repeated .ChessRogueLineupAvatarInfo chess_avatar_list = 11;</code>
     */
    private final RepeatedMessage<ChessRogueLineupAvatarInfoOuterClass.ChessRogueLineupAvatarInfo> chessAvatarList = RepeatedMessage.newEmptyInstance(ChessRogueLineupAvatarInfoOuterClass.ChessRogueLineupAvatarInfo.getFactory());

    private ChessRogueLineupInfo() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueLineupInfo}
     */
    public static ChessRogueLineupInfo newInstance() {
      return new ChessRogueLineupInfo();
    }

    /**
     * <code>optional .RogueAvatarReviveCost revive_info = 10;</code>
     * @return whether the reviveInfo field is set
     */
    public boolean hasReviveInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueAvatarReviveCost revive_info = 10;</code>
     * @return this
     */
    public ChessRogueLineupInfo clearReviveInfo() {
      bitField0_ &= ~0x00000001;
      reviveInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueAvatarReviveCost revive_info = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableReviveInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueAvatarReviveCostOuterClass.RogueAvatarReviveCost getReviveInfo() {
      return reviveInfo;
    }

    /**
     * <code>optional .RogueAvatarReviveCost revive_info = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueAvatarReviveCostOuterClass.RogueAvatarReviveCost getMutableReviveInfo() {
      bitField0_ |= 0x00000001;
      return reviveInfo;
    }

    /**
     * <code>optional .RogueAvatarReviveCost revive_info = 10;</code>
     * @param value the reviveInfo to set
     * @return this
     */
    public ChessRogueLineupInfo setReviveInfo(
        final RogueAvatarReviveCostOuterClass.RogueAvatarReviveCost value) {
      bitField0_ |= 0x00000001;
      reviveInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueLineupAvatarInfo chess_avatar_list = 11;</code>
     * @return whether the chessAvatarList field is set
     */
    public boolean hasChessAvatarList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .ChessRogueLineupAvatarInfo chess_avatar_list = 11;</code>
     * @return this
     */
    public ChessRogueLineupInfo clearChessAvatarList() {
      bitField0_ &= ~0x00000002;
      chessAvatarList.clear();
      return this;
    }

    /**
     * <code>repeated .ChessRogueLineupAvatarInfo chess_avatar_list = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChessAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueLineupAvatarInfoOuterClass.ChessRogueLineupAvatarInfo> getChessAvatarList(
        ) {
      return chessAvatarList;
    }

    /**
     * <code>repeated .ChessRogueLineupAvatarInfo chess_avatar_list = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueLineupAvatarInfoOuterClass.ChessRogueLineupAvatarInfo> getMutableChessAvatarList(
        ) {
      bitField0_ |= 0x00000002;
      return chessAvatarList;
    }

    /**
     * <code>repeated .ChessRogueLineupAvatarInfo chess_avatar_list = 11;</code>
     * @param value the chessAvatarList to add
     * @return this
     */
    public ChessRogueLineupInfo addChessAvatarList(
        final ChessRogueLineupAvatarInfoOuterClass.ChessRogueLineupAvatarInfo value) {
      bitField0_ |= 0x00000002;
      chessAvatarList.add(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueLineupAvatarInfo chess_avatar_list = 11;</code>
     * @param values the chessAvatarList to add
     * @return this
     */
    public ChessRogueLineupInfo addAllChessAvatarList(
        final ChessRogueLineupAvatarInfoOuterClass.ChessRogueLineupAvatarInfo... values) {
      bitField0_ |= 0x00000002;
      chessAvatarList.addAll(values);
      return this;
    }

    @Override
    public ChessRogueLineupInfo copyFrom(final ChessRogueLineupInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        reviveInfo.copyFrom(other.reviveInfo);
        chessAvatarList.copyFrom(other.chessAvatarList);
      }
      return this;
    }

    @Override
    public ChessRogueLineupInfo mergeFrom(final ChessRogueLineupInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasReviveInfo()) {
        getMutableReviveInfo().mergeFrom(other.reviveInfo);
      }
      if (other.hasChessAvatarList()) {
        getMutableChessAvatarList().addAll(other.chessAvatarList);
      }
      return this;
    }

    @Override
    public ChessRogueLineupInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      reviveInfo.clear();
      chessAvatarList.clear();
      return this;
    }

    @Override
    public ChessRogueLineupInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      reviveInfo.clearQuick();
      chessAvatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueLineupInfo)) {
        return false;
      }
      ChessRogueLineupInfo other = (ChessRogueLineupInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasReviveInfo() || reviveInfo.equals(other.reviveInfo))
        && (!hasChessAvatarList() || chessAvatarList.equals(other.chessAvatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(reviveInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < chessAvatarList.length(); i++) {
          output.writeRawByte((byte) 90);
          output.writeMessageNoTag(chessAvatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(reviveInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * chessAvatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(chessAvatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueLineupInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 82: {
            // reviveInfo
            input.readMessage(reviveInfo);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // chessAvatarList
            tag = input.readRepeatedMessage(chessAvatarList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeMessage(FieldNames.reviveInfo, reviveInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.chessAvatarList, chessAvatarList);
      }
      output.endObject();
    }

    @Override
    public ChessRogueLineupInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1426382941:
          case -1248022184: {
            if (input.isAtField(FieldNames.reviveInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(reviveInfo);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1375048887:
          case -694657787: {
            if (input.isAtField(FieldNames.chessAvatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(chessAvatarList);
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
    public ChessRogueLineupInfo clone() {
      return new ChessRogueLineupInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueLineupInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueLineupInfo(), data).checkInitialized();
    }

    public static ChessRogueLineupInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueLineupInfo(), input).checkInitialized();
    }

    public static ChessRogueLineupInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueLineupInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueLineupInfo messages
     */
    public static MessageFactory<ChessRogueLineupInfo> getFactory() {
      return ChessRogueLineupInfoFactory.INSTANCE;
    }

    private enum ChessRogueLineupInfoFactory implements MessageFactory<ChessRogueLineupInfo> {
      INSTANCE;

      @Override
      public ChessRogueLineupInfo create() {
        return ChessRogueLineupInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName reviveInfo = FieldName.forField("reviveInfo", "revive_info");

      static final FieldName chessAvatarList = FieldName.forField("chessAvatarList", "chess_avatar_list");
    }
  }
}
