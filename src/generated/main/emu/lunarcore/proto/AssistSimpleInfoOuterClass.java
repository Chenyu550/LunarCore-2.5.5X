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

public final class AssistSimpleInfoOuterClass {
  /**
   * Protobuf type {@code AssistSimpleInfo}
   */
  public static final class AssistSimpleInfo extends ProtoMessage<AssistSimpleInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 dressed_skin_id = 2;</code>
     */
    private int dressedSkinId;

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     */
    private int avatarId;

    /**
     * <code>optional uint32 pos = 10;</code>
     */
    private int pos;

    /**
     * <code>optional uint32 level = 12;</code>
     */
    private int level;

    private AssistSimpleInfo() {
    }

    /**
     * @return a new empty instance of {@code AssistSimpleInfo}
     */
    public static AssistSimpleInfo newInstance() {
      return new AssistSimpleInfo();
    }

    /**
     * <code>optional uint32 dressed_skin_id = 2;</code>
     * @return whether the dressedSkinId field is set
     */
    public boolean hasDressedSkinId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 2;</code>
     * @return this
     */
    public AssistSimpleInfo clearDressedSkinId() {
      bitField0_ &= ~0x00000001;
      dressedSkinId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 2;</code>
     * @return the dressedSkinId
     */
    public int getDressedSkinId() {
      return dressedSkinId;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 2;</code>
     * @param value the dressedSkinId to set
     * @return this
     */
    public AssistSimpleInfo setDressedSkinId(final int value) {
      bitField0_ |= 0x00000001;
      dressedSkinId = value;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @return this
     */
    public AssistSimpleInfo clearAvatarId() {
      bitField0_ &= ~0x00000002;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @param value the avatarId to set
     * @return this
     */
    public AssistSimpleInfo setAvatarId(final int value) {
      bitField0_ |= 0x00000002;
      avatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 pos = 10;</code>
     * @return whether the pos field is set
     */
    public boolean hasPos() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 pos = 10;</code>
     * @return this
     */
    public AssistSimpleInfo clearPos() {
      bitField0_ &= ~0x00000004;
      pos = 0;
      return this;
    }

    /**
     * <code>optional uint32 pos = 10;</code>
     * @return the pos
     */
    public int getPos() {
      return pos;
    }

    /**
     * <code>optional uint32 pos = 10;</code>
     * @param value the pos to set
     * @return this
     */
    public AssistSimpleInfo setPos(final int value) {
      bitField0_ |= 0x00000004;
      pos = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 12;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 level = 12;</code>
     * @return this
     */
    public AssistSimpleInfo clearLevel() {
      bitField0_ &= ~0x00000008;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 12;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 12;</code>
     * @param value the level to set
     * @return this
     */
    public AssistSimpleInfo setLevel(final int value) {
      bitField0_ |= 0x00000008;
      level = value;
      return this;
    }

    @Override
    public AssistSimpleInfo copyFrom(final AssistSimpleInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dressedSkinId = other.dressedSkinId;
        avatarId = other.avatarId;
        pos = other.pos;
        level = other.level;
      }
      return this;
    }

    @Override
    public AssistSimpleInfo mergeFrom(final AssistSimpleInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDressedSkinId()) {
        setDressedSkinId(other.dressedSkinId);
      }
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasPos()) {
        setPos(other.pos);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      return this;
    }

    @Override
    public AssistSimpleInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dressedSkinId = 0;
      avatarId = 0;
      pos = 0;
      level = 0;
      return this;
    }

    @Override
    public AssistSimpleInfo clearQuick() {
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
      if (!(o instanceof AssistSimpleInfo)) {
        return false;
      }
      AssistSimpleInfo other = (AssistSimpleInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasDressedSkinId() || dressedSkinId == other.dressedSkinId)
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasPos() || pos == other.pos)
        && (!hasLevel() || level == other.level);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(dressedSkinId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(pos);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(level);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dressedSkinId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(pos);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AssistSimpleInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // dressedSkinId
            dressedSkinId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // pos
            pos = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // level
            level = input.readUInt32();
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
        output.writeUInt32(FieldNames.dressedSkinId, dressedSkinId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.pos, pos);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      output.endObject();
    }

    @Override
    public AssistSimpleInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -407000018:
          case 2012697844: {
            if (input.isAtField(FieldNames.dressedSkinId)) {
              if (!input.trySkipNullValue()) {
                dressedSkinId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 111188: {
            if (input.isAtField(FieldNames.pos)) {
              if (!input.trySkipNullValue()) {
                pos = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
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
    public AssistSimpleInfo clone() {
      return new AssistSimpleInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AssistSimpleInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AssistSimpleInfo(), data).checkInitialized();
    }

    public static AssistSimpleInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AssistSimpleInfo(), input).checkInitialized();
    }

    public static AssistSimpleInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AssistSimpleInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating AssistSimpleInfo messages
     */
    public static MessageFactory<AssistSimpleInfo> getFactory() {
      return AssistSimpleInfoFactory.INSTANCE;
    }

    private enum AssistSimpleInfoFactory implements MessageFactory<AssistSimpleInfo> {
      INSTANCE;

      @Override
      public AssistSimpleInfo create() {
        return AssistSimpleInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dressedSkinId = FieldName.forField("dressedSkinId", "dressed_skin_id");

      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName pos = FieldName.forField("pos");

      static final FieldName level = FieldName.forField("level");
    }
  }
}
