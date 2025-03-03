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
import us.hebi.quickbuf.ProtoUtil;

public final class RotaterDataOuterClass {
  /**
   * Protobuf type {@code RotaterData}
   */
  public static final class RotaterData extends ProtoMessage<RotaterData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional float APDIFCCFAGG = 2;</code>
     */
    private float aPDIFCCFAGG;

    /**
     * <code>optional uint32 unk_int = 5;</code>
     */
    private int unkInt;

    /**
     * <code>optional uint32 group_id = 12;</code>
     */
    private int groupId;

    private RotaterData() {
    }

    /**
     * @return a new empty instance of {@code RotaterData}
     */
    public static RotaterData newInstance() {
      return new RotaterData();
    }

    /**
     * <code>optional float APDIFCCFAGG = 2;</code>
     * @return whether the aPDIFCCFAGG field is set
     */
    public boolean hasAPDIFCCFAGG() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional float APDIFCCFAGG = 2;</code>
     * @return this
     */
    public RotaterData clearAPDIFCCFAGG() {
      bitField0_ &= ~0x00000001;
      aPDIFCCFAGG = 0F;
      return this;
    }

    /**
     * <code>optional float APDIFCCFAGG = 2;</code>
     * @return the aPDIFCCFAGG
     */
    public float getAPDIFCCFAGG() {
      return aPDIFCCFAGG;
    }

    /**
     * <code>optional float APDIFCCFAGG = 2;</code>
     * @param value the aPDIFCCFAGG to set
     * @return this
     */
    public RotaterData setAPDIFCCFAGG(final float value) {
      bitField0_ |= 0x00000001;
      aPDIFCCFAGG = value;
      return this;
    }

    /**
     * <code>optional uint32 unk_int = 5;</code>
     * @return whether the unkInt field is set
     */
    public boolean hasUnkInt() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 unk_int = 5;</code>
     * @return this
     */
    public RotaterData clearUnkInt() {
      bitField0_ &= ~0x00000002;
      unkInt = 0;
      return this;
    }

    /**
     * <code>optional uint32 unk_int = 5;</code>
     * @return the unkInt
     */
    public int getUnkInt() {
      return unkInt;
    }

    /**
     * <code>optional uint32 unk_int = 5;</code>
     * @param value the unkInt to set
     * @return this
     */
    public RotaterData setUnkInt(final int value) {
      bitField0_ |= 0x00000002;
      unkInt = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 12;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 group_id = 12;</code>
     * @return this
     */
    public RotaterData clearGroupId() {
      bitField0_ &= ~0x00000004;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 12;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 12;</code>
     * @param value the groupId to set
     * @return this
     */
    public RotaterData setGroupId(final int value) {
      bitField0_ |= 0x00000004;
      groupId = value;
      return this;
    }

    @Override
    public RotaterData copyFrom(final RotaterData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        aPDIFCCFAGG = other.aPDIFCCFAGG;
        unkInt = other.unkInt;
        groupId = other.groupId;
      }
      return this;
    }

    @Override
    public RotaterData mergeFrom(final RotaterData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAPDIFCCFAGG()) {
        setAPDIFCCFAGG(other.aPDIFCCFAGG);
      }
      if (other.hasUnkInt()) {
        setUnkInt(other.unkInt);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      return this;
    }

    @Override
    public RotaterData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      aPDIFCCFAGG = 0F;
      unkInt = 0;
      groupId = 0;
      return this;
    }

    @Override
    public RotaterData clearQuick() {
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
      if (!(o instanceof RotaterData)) {
        return false;
      }
      RotaterData other = (RotaterData) o;
      return bitField0_ == other.bitField0_
        && (!hasAPDIFCCFAGG() || ProtoUtil.isEqual(aPDIFCCFAGG, other.aPDIFCCFAGG))
        && (!hasUnkInt() || unkInt == other.unkInt)
        && (!hasGroupId() || groupId == other.groupId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 21);
        output.writeFloatNoTag(aPDIFCCFAGG);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(unkInt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(groupId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 5;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(unkInt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RotaterData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 21: {
            // aPDIFCCFAGG
            aPDIFCCFAGG = input.readFloat();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // unkInt
            unkInt = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000004;
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
        output.writeFloat(FieldNames.aPDIFCCFAGG, aPDIFCCFAGG);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.unkInt, unkInt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      output.endObject();
    }

    @Override
    public RotaterData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 327278477: {
            if (input.isAtField(FieldNames.aPDIFCCFAGG)) {
              if (!input.trySkipNullValue()) {
                aPDIFCCFAGG = input.readFloat();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -840508003:
          case -285293790: {
            if (input.isAtField(FieldNames.unkInt)) {
              if (!input.trySkipNullValue()) {
                unkInt = input.readUInt32();
                bitField0_ |= 0x00000002;
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
                bitField0_ |= 0x00000004;
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
    public RotaterData clone() {
      return new RotaterData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RotaterData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RotaterData(), data).checkInitialized();
    }

    public static RotaterData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotaterData(), input).checkInitialized();
    }

    public static RotaterData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotaterData(), input).checkInitialized();
    }

    /**
     * @return factory for creating RotaterData messages
     */
    public static MessageFactory<RotaterData> getFactory() {
      return RotaterDataFactory.INSTANCE;
    }

    private enum RotaterDataFactory implements MessageFactory<RotaterData> {
      INSTANCE;

      @Override
      public RotaterData create() {
        return RotaterData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName aPDIFCCFAGG = FieldName.forField("APDIFCCFAGG");

      static final FieldName unkInt = FieldName.forField("unkInt", "unk_int");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");
    }
  }
}
