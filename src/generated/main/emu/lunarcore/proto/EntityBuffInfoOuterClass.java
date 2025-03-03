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

public final class EntityBuffInfoOuterClass {
  /**
   * Protobuf type {@code EntityBuffInfo}
   */
  public static final class EntityBuffInfo extends ProtoMessage<EntityBuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 entity_id = 1;</code>
     */
    private int entityId;

    /**
     * <code>repeated .BuffInfo buff_list = 10;</code>
     */
    private final RepeatedMessage<BuffInfoOuterClass.BuffInfo> buffList = RepeatedMessage.newEmptyInstance(BuffInfoOuterClass.BuffInfo.getFactory());

    private EntityBuffInfo() {
    }

    /**
     * @return a new empty instance of {@code EntityBuffInfo}
     */
    public static EntityBuffInfo newInstance() {
      return new EntityBuffInfo();
    }

    /**
     * <code>optional uint32 entity_id = 1;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 1;</code>
     * @return this
     */
    public EntityBuffInfo clearEntityId() {
      bitField0_ &= ~0x00000001;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 1;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 1;</code>
     * @param value the entityId to set
     * @return this
     */
    public EntityBuffInfo setEntityId(final int value) {
      bitField0_ |= 0x00000001;
      entityId = value;
      return this;
    }

    /**
     * <code>repeated .BuffInfo buff_list = 10;</code>
     * @return whether the buffList field is set
     */
    public boolean hasBuffList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .BuffInfo buff_list = 10;</code>
     * @return this
     */
    public EntityBuffInfo clearBuffList() {
      bitField0_ &= ~0x00000002;
      buffList.clear();
      return this;
    }

    /**
     * <code>repeated .BuffInfo buff_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<BuffInfoOuterClass.BuffInfo> getBuffList() {
      return buffList;
    }

    /**
     * <code>repeated .BuffInfo buff_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<BuffInfoOuterClass.BuffInfo> getMutableBuffList() {
      bitField0_ |= 0x00000002;
      return buffList;
    }

    /**
     * <code>repeated .BuffInfo buff_list = 10;</code>
     * @param value the buffList to add
     * @return this
     */
    public EntityBuffInfo addBuffList(final BuffInfoOuterClass.BuffInfo value) {
      bitField0_ |= 0x00000002;
      buffList.add(value);
      return this;
    }

    /**
     * <code>repeated .BuffInfo buff_list = 10;</code>
     * @param values the buffList to add
     * @return this
     */
    public EntityBuffInfo addAllBuffList(final BuffInfoOuterClass.BuffInfo... values) {
      bitField0_ |= 0x00000002;
      buffList.addAll(values);
      return this;
    }

    @Override
    public EntityBuffInfo copyFrom(final EntityBuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entityId = other.entityId;
        buffList.copyFrom(other.buffList);
      }
      return this;
    }

    @Override
    public EntityBuffInfo mergeFrom(final EntityBuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasBuffList()) {
        getMutableBuffList().addAll(other.buffList);
      }
      return this;
    }

    @Override
    public EntityBuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityId = 0;
      buffList.clear();
      return this;
    }

    @Override
    public EntityBuffInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EntityBuffInfo)) {
        return false;
      }
      EntityBuffInfo other = (EntityBuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasBuffList() || buffList.equals(other.buffList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < buffList.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(buffList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * buffList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(buffList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EntityBuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // buffList
            tag = input.readRepeatedMessage(buffList, tag);
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
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.buffList, buffList);
      }
      output.endObject();
    }

    @Override
    public EntityBuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1522789487:
          case 55792906: {
            if (input.isAtField(FieldNames.buffList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(buffList);
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
    public EntityBuffInfo clone() {
      return new EntityBuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EntityBuffInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EntityBuffInfo(), data).checkInitialized();
    }

    public static EntityBuffInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EntityBuffInfo(), input).checkInitialized();
    }

    public static EntityBuffInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EntityBuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating EntityBuffInfo messages
     */
    public static MessageFactory<EntityBuffInfo> getFactory() {
      return EntityBuffInfoFactory.INSTANCE;
    }

    private enum EntityBuffInfoFactory implements MessageFactory<EntityBuffInfo> {
      INSTANCE;

      @Override
      public EntityBuffInfo create() {
        return EntityBuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName buffList = FieldName.forField("buffList", "buff_list");
    }
  }
}
