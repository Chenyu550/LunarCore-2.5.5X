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

public final class MazeGroupOuterClass {
  /**
   * Protobuf type {@code MazeGroup}
   */
  public static final class MazeGroup extends ProtoMessage<MazeGroup> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 modify_time = 13;</code>
     */
    private long modifyTime;

    /**
     * <code>optional uint32 group_id = 5;</code>
     */
    private int groupId;

    private MazeGroup() {
    }

    /**
     * @return a new empty instance of {@code MazeGroup}
     */
    public static MazeGroup newInstance() {
      return new MazeGroup();
    }

    /**
     * <code>optional int64 modify_time = 13;</code>
     * @return whether the modifyTime field is set
     */
    public boolean hasModifyTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 modify_time = 13;</code>
     * @return this
     */
    public MazeGroup clearModifyTime() {
      bitField0_ &= ~0x00000001;
      modifyTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 modify_time = 13;</code>
     * @return the modifyTime
     */
    public long getModifyTime() {
      return modifyTime;
    }

    /**
     * <code>optional int64 modify_time = 13;</code>
     * @param value the modifyTime to set
     * @return this
     */
    public MazeGroup setModifyTime(final long value) {
      bitField0_ |= 0x00000001;
      modifyTime = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return this
     */
    public MazeGroup clearGroupId() {
      bitField0_ &= ~0x00000002;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @param value the groupId to set
     * @return this
     */
    public MazeGroup setGroupId(final int value) {
      bitField0_ |= 0x00000002;
      groupId = value;
      return this;
    }

    @Override
    public MazeGroup copyFrom(final MazeGroup other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        modifyTime = other.modifyTime;
        groupId = other.groupId;
      }
      return this;
    }

    @Override
    public MazeGroup mergeFrom(final MazeGroup other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasModifyTime()) {
        setModifyTime(other.modifyTime);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      return this;
    }

    @Override
    public MazeGroup clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      modifyTime = 0L;
      groupId = 0;
      return this;
    }

    @Override
    public MazeGroup clearQuick() {
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
      if (!(o instanceof MazeGroup)) {
        return false;
      }
      MazeGroup other = (MazeGroup) o;
      return bitField0_ == other.bitField0_
        && (!hasModifyTime() || modifyTime == other.modifyTime)
        && (!hasGroupId() || groupId == other.groupId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 104);
        output.writeInt64NoTag(modifyTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(groupId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(modifyTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MazeGroup mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 104: {
            // modifyTime
            modifyTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // groupId
            groupId = input.readUInt32();
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
        output.writeInt64(FieldNames.modifyTime, modifyTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      output.endObject();
    }

    @Override
    public MazeGroup mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1211388583:
          case -1091176654: {
            if (input.isAtField(FieldNames.modifyTime)) {
              if (!input.trySkipNullValue()) {
                modifyTime = input.readInt64();
                bitField0_ |= 0x00000001;
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
    public MazeGroup clone() {
      return new MazeGroup().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MazeGroup parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MazeGroup(), data).checkInitialized();
    }

    public static MazeGroup parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MazeGroup(), input).checkInitialized();
    }

    public static MazeGroup parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MazeGroup(), input).checkInitialized();
    }

    /**
     * @return factory for creating MazeGroup messages
     */
    public static MessageFactory<MazeGroup> getFactory() {
      return MazeGroupFactory.INSTANCE;
    }

    private enum MazeGroupFactory implements MessageFactory<MazeGroup> {
      INSTANCE;

      @Override
      public MazeGroup create() {
        return MazeGroup.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName modifyTime = FieldName.forField("modifyTime", "modify_time");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");
    }
  }
}
