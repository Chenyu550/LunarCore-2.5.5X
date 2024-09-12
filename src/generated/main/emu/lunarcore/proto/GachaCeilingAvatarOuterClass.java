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

public final class GachaCeilingAvatarOuterClass {
  /**
   * Protobuf type {@code GachaCeilingAvatar}
   */
  public static final class GachaCeilingAvatar extends ProtoMessage<GachaCeilingAvatar> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 repeated_cnt = 9;</code>
     */
    private int repeatedCnt;

    /**
     * <code>optional uint32 avatar_id = 13;</code>
     */
    private int avatarId;

    private GachaCeilingAvatar() {
    }

    /**
     * @return a new empty instance of {@code GachaCeilingAvatar}
     */
    public static GachaCeilingAvatar newInstance() {
      return new GachaCeilingAvatar();
    }

    /**
     * <code>optional uint32 repeated_cnt = 9;</code>
     * @return whether the repeatedCnt field is set
     */
    public boolean hasRepeatedCnt() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 repeated_cnt = 9;</code>
     * @return this
     */
    public GachaCeilingAvatar clearRepeatedCnt() {
      bitField0_ &= ~0x00000001;
      repeatedCnt = 0;
      return this;
    }

    /**
     * <code>optional uint32 repeated_cnt = 9;</code>
     * @return the repeatedCnt
     */
    public int getRepeatedCnt() {
      return repeatedCnt;
    }

    /**
     * <code>optional uint32 repeated_cnt = 9;</code>
     * @param value the repeatedCnt to set
     * @return this
     */
    public GachaCeilingAvatar setRepeatedCnt(final int value) {
      bitField0_ |= 0x00000001;
      repeatedCnt = value;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 13;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 13;</code>
     * @return this
     */
    public GachaCeilingAvatar clearAvatarId() {
      bitField0_ &= ~0x00000002;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 13;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 13;</code>
     * @param value the avatarId to set
     * @return this
     */
    public GachaCeilingAvatar setAvatarId(final int value) {
      bitField0_ |= 0x00000002;
      avatarId = value;
      return this;
    }

    @Override
    public GachaCeilingAvatar copyFrom(final GachaCeilingAvatar other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        repeatedCnt = other.repeatedCnt;
        avatarId = other.avatarId;
      }
      return this;
    }

    @Override
    public GachaCeilingAvatar mergeFrom(final GachaCeilingAvatar other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRepeatedCnt()) {
        setRepeatedCnt(other.repeatedCnt);
      }
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      return this;
    }

    @Override
    public GachaCeilingAvatar clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      repeatedCnt = 0;
      avatarId = 0;
      return this;
    }

    @Override
    public GachaCeilingAvatar clearQuick() {
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
      if (!(o instanceof GachaCeilingAvatar)) {
        return false;
      }
      GachaCeilingAvatar other = (GachaCeilingAvatar) o;
      return bitField0_ == other.bitField0_
        && (!hasRepeatedCnt() || repeatedCnt == other.repeatedCnt)
        && (!hasAvatarId() || avatarId == other.avatarId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(repeatedCnt);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(avatarId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(repeatedCnt);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GachaCeilingAvatar mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // repeatedCnt
            repeatedCnt = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // avatarId
            avatarId = input.readUInt32();
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
        output.writeUInt32(FieldNames.repeatedCnt, repeatedCnt);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      output.endObject();
    }

    @Override
    public GachaCeilingAvatar mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1602543503:
          case -1859935452: {
            if (input.isAtField(FieldNames.repeatedCnt)) {
              if (!input.trySkipNullValue()) {
                repeatedCnt = input.readUInt32();
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
    public GachaCeilingAvatar clone() {
      return new GachaCeilingAvatar().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GachaCeilingAvatar parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GachaCeilingAvatar(), data).checkInitialized();
    }

    public static GachaCeilingAvatar parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaCeilingAvatar(), input).checkInitialized();
    }

    public static GachaCeilingAvatar parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaCeilingAvatar(), input).checkInitialized();
    }

    /**
     * @return factory for creating GachaCeilingAvatar messages
     */
    public static MessageFactory<GachaCeilingAvatar> getFactory() {
      return GachaCeilingAvatarFactory.INSTANCE;
    }

    private enum GachaCeilingAvatarFactory implements MessageFactory<GachaCeilingAvatar> {
      INSTANCE;

      @Override
      public GachaCeilingAvatar create() {
        return GachaCeilingAvatar.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName repeatedCnt = FieldName.forField("repeatedCnt", "repeated_cnt");

      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");
    }
  }
}
