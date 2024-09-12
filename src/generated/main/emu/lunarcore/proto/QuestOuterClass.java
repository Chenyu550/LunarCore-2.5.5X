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

public final class QuestOuterClass {
  /**
   * Protobuf type {@code Quest}
   */
  public static final class Quest extends ProtoMessage<Quest> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 finish_time = 14;</code>
     */
    private long finishTime;

    /**
     * <code>optional uint32 progress = 12;</code>
     */
    private int progress;

    /**
     * <code>optional uint32 id = 15;</code>
     */
    private int id;

    /**
     * <code>optional .QuestStatus status = 6;</code>
     */
    private int status;

    private Quest() {
    }

    /**
     * @return a new empty instance of {@code Quest}
     */
    public static Quest newInstance() {
      return new Quest();
    }

    /**
     * <code>optional int64 finish_time = 14;</code>
     * @return whether the finishTime field is set
     */
    public boolean hasFinishTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 finish_time = 14;</code>
     * @return this
     */
    public Quest clearFinishTime() {
      bitField0_ &= ~0x00000001;
      finishTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 finish_time = 14;</code>
     * @return the finishTime
     */
    public long getFinishTime() {
      return finishTime;
    }

    /**
     * <code>optional int64 finish_time = 14;</code>
     * @param value the finishTime to set
     * @return this
     */
    public Quest setFinishTime(final long value) {
      bitField0_ |= 0x00000001;
      finishTime = value;
      return this;
    }

    /**
     * <code>optional uint32 progress = 12;</code>
     * @return whether the progress field is set
     */
    public boolean hasProgress() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 progress = 12;</code>
     * @return this
     */
    public Quest clearProgress() {
      bitField0_ &= ~0x00000002;
      progress = 0;
      return this;
    }

    /**
     * <code>optional uint32 progress = 12;</code>
     * @return the progress
     */
    public int getProgress() {
      return progress;
    }

    /**
     * <code>optional uint32 progress = 12;</code>
     * @param value the progress to set
     * @return this
     */
    public Quest setProgress(final int value) {
      bitField0_ |= 0x00000002;
      progress = value;
      return this;
    }

    /**
     * <code>optional uint32 id = 15;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 id = 15;</code>
     * @return this
     */
    public Quest clearId() {
      bitField0_ &= ~0x00000004;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 15;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 15;</code>
     * @param value the id to set
     * @return this
     */
    public Quest setId(final int value) {
      bitField0_ |= 0x00000004;
      id = value;
      return this;
    }

    /**
     * <code>optional .QuestStatus status = 6;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .QuestStatus status = 6;</code>
     * @return this
     */
    public Quest clearStatus() {
      bitField0_ &= ~0x00000008;
      status = 0;
      return this;
    }

    /**
     * <code>optional .QuestStatus status = 6;</code>
     * @return the status
     */
    public QuestStatusOuterClass.QuestStatus getStatus() {
      return QuestStatusOuterClass.QuestStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link Quest#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link QuestStatusOuterClass.QuestStatus}. Setting an invalid value
     * can cause {@link Quest#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public Quest setStatusValue(final int value) {
      bitField0_ |= 0x00000008;
      status = value;
      return this;
    }

    /**
     * <code>optional .QuestStatus status = 6;</code>
     * @param value the status to set
     * @return this
     */
    public Quest setStatus(final QuestStatusOuterClass.QuestStatus value) {
      bitField0_ |= 0x00000008;
      status = value.getNumber();
      return this;
    }

    @Override
    public Quest copyFrom(final Quest other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        finishTime = other.finishTime;
        progress = other.progress;
        id = other.id;
        status = other.status;
      }
      return this;
    }

    @Override
    public Quest mergeFrom(final Quest other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFinishTime()) {
        setFinishTime(other.finishTime);
      }
      if (other.hasProgress()) {
        setProgress(other.progress);
      }
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      return this;
    }

    @Override
    public Quest clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      finishTime = 0L;
      progress = 0;
      id = 0;
      status = 0;
      return this;
    }

    @Override
    public Quest clearQuick() {
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
      if (!(o instanceof Quest)) {
        return false;
      }
      Quest other = (Quest) o;
      return bitField0_ == other.bitField0_
        && (!hasFinishTime() || finishTime == other.finishTime)
        && (!hasProgress() || progress == other.progress)
        && (!hasId() || id == other.id)
        && (!hasStatus() || status == other.status);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeInt64NoTag(finishTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(progress);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 48);
        output.writeEnumNoTag(status);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(finishTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(progress);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Quest mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // finishTime
            finishTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // progress
            progress = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // status
            final int value = input.readInt32();
            if (QuestStatusOuterClass.QuestStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000008;
            }
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
        output.writeInt64(FieldNames.finishTime, finishTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.progress, progress);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeEnum(FieldNames.status, status, QuestStatusOuterClass.QuestStatus.converter());
      }
      output.endObject();
    }

    @Override
    public Quest mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1151521280:
          case 1347904249: {
            if (input.isAtField(FieldNames.finishTime)) {
              if (!input.trySkipNullValue()) {
                finishTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1001078227: {
            if (input.isAtField(FieldNames.progress)) {
              if (!input.trySkipNullValue()) {
                progress = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final QuestStatusOuterClass.QuestStatus value = input.readEnum(QuestStatusOuterClass.QuestStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000008;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public Quest clone() {
      return new Quest().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Quest parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Quest(), data).checkInitialized();
    }

    public static Quest parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Quest(), input).checkInitialized();
    }

    public static Quest parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Quest(), input).checkInitialized();
    }

    /**
     * @return factory for creating Quest messages
     */
    public static MessageFactory<Quest> getFactory() {
      return QuestFactory.INSTANCE;
    }

    private enum QuestFactory implements MessageFactory<Quest> {
      INSTANCE;

      @Override
      public Quest create() {
        return Quest.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName finishTime = FieldName.forField("finishTime", "finish_time");

      static final FieldName progress = FieldName.forField("progress");

      static final FieldName id = FieldName.forField("id");

      static final FieldName status = FieldName.forField("status");
    }
  }
}
