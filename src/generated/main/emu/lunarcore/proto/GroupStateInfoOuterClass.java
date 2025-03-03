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

public final class GroupStateInfoOuterClass {
  /**
   * <pre>
   *  TODO: verify player_uid and group_state
   * </pre>
   *
   * Protobuf type {@code GroupStateInfo}
   */
  public static final class GroupStateInfo extends ProtoMessage<GroupStateInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * or 11
     * </pre>
     *
     * <code>optional uint32 player_uid = 1;</code>
     */
    private int playerUid;

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>optional uint32 group_state = 11;</code>
     */
    private int groupState;

    /**
     * <code>optional uint32 entry_id = 14;</code>
     */
    private int entryId;

    /**
     * <code>optional uint32 group_id = 15;</code>
     */
    private int groupId;

    private GroupStateInfo() {
    }

    /**
     * <pre>
     *  TODO: verify player_uid and group_state
     * </pre>
     *
     * @return a new empty instance of {@code GroupStateInfo}
     */
    public static GroupStateInfo newInstance() {
      return new GroupStateInfo();
    }

    /**
     * <pre>
     * or 11
     * </pre>
     *
     * <code>optional uint32 player_uid = 1;</code>
     * @return whether the playerUid field is set
     */
    public boolean hasPlayerUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * or 11
     * </pre>
     *
     * <code>optional uint32 player_uid = 1;</code>
     * @return this
     */
    public GroupStateInfo clearPlayerUid() {
      bitField0_ &= ~0x00000001;
      playerUid = 0;
      return this;
    }

    /**
     * <pre>
     * or 11
     * </pre>
     *
     * <code>optional uint32 player_uid = 1;</code>
     * @return the playerUid
     */
    public int getPlayerUid() {
      return playerUid;
    }

    /**
     * <pre>
     * or 11
     * </pre>
     *
     * <code>optional uint32 player_uid = 1;</code>
     * @param value the playerUid to set
     * @return this
     */
    public GroupStateInfo setPlayerUid(final int value) {
      bitField0_ |= 0x00000001;
      playerUid = value;
      return this;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>optional uint32 group_state = 11;</code>
     * @return whether the groupState field is set
     */
    public boolean hasGroupState() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>optional uint32 group_state = 11;</code>
     * @return this
     */
    public GroupStateInfo clearGroupState() {
      bitField0_ &= ~0x00000002;
      groupState = 0;
      return this;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>optional uint32 group_state = 11;</code>
     * @return the groupState
     */
    public int getGroupState() {
      return groupState;
    }

    /**
     * <pre>
     * or 1
     * </pre>
     *
     * <code>optional uint32 group_state = 11;</code>
     * @param value the groupState to set
     * @return this
     */
    public GroupStateInfo setGroupState(final int value) {
      bitField0_ |= 0x00000002;
      groupState = value;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @return whether the entryId field is set
     */
    public boolean hasEntryId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @return this
     */
    public GroupStateInfo clearEntryId() {
      bitField0_ &= ~0x00000004;
      entryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @return the entryId
     */
    public int getEntryId() {
      return entryId;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @param value the entryId to set
     * @return this
     */
    public GroupStateInfo setEntryId(final int value) {
      bitField0_ |= 0x00000004;
      entryId = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 15;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 group_id = 15;</code>
     * @return this
     */
    public GroupStateInfo clearGroupId() {
      bitField0_ &= ~0x00000008;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 15;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 15;</code>
     * @param value the groupId to set
     * @return this
     */
    public GroupStateInfo setGroupId(final int value) {
      bitField0_ |= 0x00000008;
      groupId = value;
      return this;
    }

    @Override
    public GroupStateInfo copyFrom(final GroupStateInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        playerUid = other.playerUid;
        groupState = other.groupState;
        entryId = other.entryId;
        groupId = other.groupId;
      }
      return this;
    }

    @Override
    public GroupStateInfo mergeFrom(final GroupStateInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPlayerUid()) {
        setPlayerUid(other.playerUid);
      }
      if (other.hasGroupState()) {
        setGroupState(other.groupState);
      }
      if (other.hasEntryId()) {
        setEntryId(other.entryId);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      return this;
    }

    @Override
    public GroupStateInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      playerUid = 0;
      groupState = 0;
      entryId = 0;
      groupId = 0;
      return this;
    }

    @Override
    public GroupStateInfo clearQuick() {
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
      if (!(o instanceof GroupStateInfo)) {
        return false;
      }
      GroupStateInfo other = (GroupStateInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasPlayerUid() || playerUid == other.playerUid)
        && (!hasGroupState() || groupState == other.groupState)
        && (!hasEntryId() || entryId == other.entryId)
        && (!hasGroupId() || groupId == other.groupId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(playerUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(groupState);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(entryId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(groupId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(playerUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupState);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entryId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GroupStateInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // playerUid
            playerUid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // groupState
            groupState = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // entryId
            entryId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.playerUid, playerUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.groupState, groupState);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.entryId, entryId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      output.endObject();
    }

    @Override
    public GroupStateInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1872053841:
          case 2096182770: {
            if (input.isAtField(FieldNames.playerUid)) {
              if (!input.trySkipNullValue()) {
                playerUid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1271403858:
          case 1101988561: {
            if (input.isAtField(FieldNames.groupState)) {
              if (!input.trySkipNullValue()) {
                groupState = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1591558867:
          case -2093663224: {
            if (input.isAtField(FieldNames.entryId)) {
              if (!input.trySkipNullValue()) {
                entryId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
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
    public GroupStateInfo clone() {
      return new GroupStateInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GroupStateInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GroupStateInfo(), data).checkInitialized();
    }

    public static GroupStateInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GroupStateInfo(), input).checkInitialized();
    }

    public static GroupStateInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GroupStateInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating GroupStateInfo messages
     */
    public static MessageFactory<GroupStateInfo> getFactory() {
      return GroupStateInfoFactory.INSTANCE;
    }

    private enum GroupStateInfoFactory implements MessageFactory<GroupStateInfo> {
      INSTANCE;

      @Override
      public GroupStateInfo create() {
        return GroupStateInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName playerUid = FieldName.forField("playerUid", "player_uid");

      static final FieldName groupState = FieldName.forField("groupState", "group_state");

      static final FieldName entryId = FieldName.forField("entryId", "entry_id");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");
    }
  }
}
