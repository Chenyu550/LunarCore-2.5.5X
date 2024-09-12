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

public final class DeactivateFarmElementCsReqOuterClass {
  /**
   * <pre>
   *
   * </pre>
   *
   * Protobuf type {@code DeactivateFarmElementCsReq}
   */
  public static final class DeactivateFarmElementCsReq extends ProtoMessage<DeactivateFarmElementCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 entity_id = 3;</code>
     */
    private int entityId;

    private DeactivateFarmElementCsReq() {
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * @return a new empty instance of {@code DeactivateFarmElementCsReq}
     */
    public static DeactivateFarmElementCsReq newInstance() {
      return new DeactivateFarmElementCsReq();
    }

    /**
     * <code>optional uint32 entity_id = 3;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 3;</code>
     * @return this
     */
    public DeactivateFarmElementCsReq clearEntityId() {
      bitField0_ &= ~0x00000001;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 3;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 3;</code>
     * @param value the entityId to set
     * @return this
     */
    public DeactivateFarmElementCsReq setEntityId(final int value) {
      bitField0_ |= 0x00000001;
      entityId = value;
      return this;
    }

    @Override
    public DeactivateFarmElementCsReq copyFrom(final DeactivateFarmElementCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entityId = other.entityId;
      }
      return this;
    }

    @Override
    public DeactivateFarmElementCsReq mergeFrom(final DeactivateFarmElementCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      return this;
    }

    @Override
    public DeactivateFarmElementCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityId = 0;
      return this;
    }

    @Override
    public DeactivateFarmElementCsReq clearQuick() {
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
      if (!(o instanceof DeactivateFarmElementCsReq)) {
        return false;
      }
      DeactivateFarmElementCsReq other = (DeactivateFarmElementCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEntityId() || entityId == other.entityId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(entityId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DeactivateFarmElementCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // entityId
            entityId = input.readUInt32();
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
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      output.endObject();
    }

    @Override
    public DeactivateFarmElementCsReq mergeFrom(final JsonSource input) throws IOException {
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
    public DeactivateFarmElementCsReq clone() {
      return new DeactivateFarmElementCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DeactivateFarmElementCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DeactivateFarmElementCsReq(), data).checkInitialized();
    }

    public static DeactivateFarmElementCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DeactivateFarmElementCsReq(), input).checkInitialized();
    }

    public static DeactivateFarmElementCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DeactivateFarmElementCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating DeactivateFarmElementCsReq messages
     */
    public static MessageFactory<DeactivateFarmElementCsReq> getFactory() {
      return DeactivateFarmElementCsReqFactory.INSTANCE;
    }

    private enum DeactivateFarmElementCsReqFactory implements MessageFactory<DeactivateFarmElementCsReq> {
      INSTANCE;

      @Override
      public DeactivateFarmElementCsReq create() {
        return DeactivateFarmElementCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entityId = FieldName.forField("entityId", "entity_id");
    }
  }
}
