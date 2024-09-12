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

public final class ActivateFarmElementScRspOuterClass {
  /**
   * Protobuf type {@code ActivateFarmElementScRsp}
   */
  public static final class ActivateFarmElementScRsp extends ProtoMessage<ActivateFarmElementScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 world_level = 10;</code>
     */
    private int worldLevel;

    /**
     * <code>optional uint32 entity_id = 14;</code>
     */
    private int entityId;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    private ActivateFarmElementScRsp() {
    }

    /**
     * @return a new empty instance of {@code ActivateFarmElementScRsp}
     */
    public static ActivateFarmElementScRsp newInstance() {
      return new ActivateFarmElementScRsp();
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @return this
     */
    public ActivateFarmElementScRsp clearWorldLevel() {
      bitField0_ &= ~0x00000001;
      worldLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public ActivateFarmElementScRsp setWorldLevel(final int value) {
      bitField0_ |= 0x00000001;
      worldLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 14;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 14;</code>
     * @return this
     */
    public ActivateFarmElementScRsp clearEntityId() {
      bitField0_ &= ~0x00000002;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 14;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 14;</code>
     * @param value the entityId to set
     * @return this
     */
    public ActivateFarmElementScRsp setEntityId(final int value) {
      bitField0_ |= 0x00000002;
      entityId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public ActivateFarmElementScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public ActivateFarmElementScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    @Override
    public ActivateFarmElementScRsp copyFrom(final ActivateFarmElementScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        worldLevel = other.worldLevel;
        entityId = other.entityId;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public ActivateFarmElementScRsp mergeFrom(final ActivateFarmElementScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public ActivateFarmElementScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      worldLevel = 0;
      entityId = 0;
      retcode = 0;
      return this;
    }

    @Override
    public ActivateFarmElementScRsp clearQuick() {
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
      if (!(o instanceof ActivateFarmElementScRsp)) {
        return false;
      }
      ActivateFarmElementScRsp other = (ActivateFarmElementScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasWorldLevel() || worldLevel == other.worldLevel)
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ActivateFarmElementScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // worldLevel
            worldLevel = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
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
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public ActivateFarmElementScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 440007442:
          case 1305257111: {
            if (input.isAtField(FieldNames.worldLevel)) {
              if (!input.trySkipNullValue()) {
                worldLevel = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
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
    public ActivateFarmElementScRsp clone() {
      return new ActivateFarmElementScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ActivateFarmElementScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ActivateFarmElementScRsp(), data).checkInitialized();
    }

    public static ActivateFarmElementScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivateFarmElementScRsp(), input).checkInitialized();
    }

    public static ActivateFarmElementScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivateFarmElementScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ActivateFarmElementScRsp messages
     */
    public static MessageFactory<ActivateFarmElementScRsp> getFactory() {
      return ActivateFarmElementScRspFactory.INSTANCE;
    }

    private enum ActivateFarmElementScRspFactory implements MessageFactory<ActivateFarmElementScRsp> {
      INSTANCE;

      @Override
      public ActivateFarmElementScRsp create() {
        return ActivateFarmElementScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");

      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
