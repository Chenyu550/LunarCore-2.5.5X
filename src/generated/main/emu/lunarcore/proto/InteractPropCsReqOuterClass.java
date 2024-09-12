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

public final class InteractPropCsReqOuterClass {
  /**
   * Protobuf type {@code InteractPropCsReq}
   */
  public static final class InteractPropCsReq extends ProtoMessage<InteractPropCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 prop_entity_id = 2;</code>
     */
    private int propEntityId;

    /**
     * <code>optional uint32 interact_id = 3;</code>
     */
    private int interactId;

    private InteractPropCsReq() {
    }

    /**
     * @return a new empty instance of {@code InteractPropCsReq}
     */
    public static InteractPropCsReq newInstance() {
      return new InteractPropCsReq();
    }

    /**
     * <code>optional uint32 prop_entity_id = 2;</code>
     * @return whether the propEntityId field is set
     */
    public boolean hasPropEntityId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 prop_entity_id = 2;</code>
     * @return this
     */
    public InteractPropCsReq clearPropEntityId() {
      bitField0_ &= ~0x00000001;
      propEntityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 prop_entity_id = 2;</code>
     * @return the propEntityId
     */
    public int getPropEntityId() {
      return propEntityId;
    }

    /**
     * <code>optional uint32 prop_entity_id = 2;</code>
     * @param value the propEntityId to set
     * @return this
     */
    public InteractPropCsReq setPropEntityId(final int value) {
      bitField0_ |= 0x00000001;
      propEntityId = value;
      return this;
    }

    /**
     * <code>optional uint32 interact_id = 3;</code>
     * @return whether the interactId field is set
     */
    public boolean hasInteractId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 interact_id = 3;</code>
     * @return this
     */
    public InteractPropCsReq clearInteractId() {
      bitField0_ &= ~0x00000002;
      interactId = 0;
      return this;
    }

    /**
     * <code>optional uint32 interact_id = 3;</code>
     * @return the interactId
     */
    public int getInteractId() {
      return interactId;
    }

    /**
     * <code>optional uint32 interact_id = 3;</code>
     * @param value the interactId to set
     * @return this
     */
    public InteractPropCsReq setInteractId(final int value) {
      bitField0_ |= 0x00000002;
      interactId = value;
      return this;
    }

    @Override
    public InteractPropCsReq copyFrom(final InteractPropCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        propEntityId = other.propEntityId;
        interactId = other.interactId;
      }
      return this;
    }

    @Override
    public InteractPropCsReq mergeFrom(final InteractPropCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPropEntityId()) {
        setPropEntityId(other.propEntityId);
      }
      if (other.hasInteractId()) {
        setInteractId(other.interactId);
      }
      return this;
    }

    @Override
    public InteractPropCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      propEntityId = 0;
      interactId = 0;
      return this;
    }

    @Override
    public InteractPropCsReq clearQuick() {
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
      if (!(o instanceof InteractPropCsReq)) {
        return false;
      }
      InteractPropCsReq other = (InteractPropCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasPropEntityId() || propEntityId == other.propEntityId)
        && (!hasInteractId() || interactId == other.interactId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(interactId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(interactId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public InteractPropCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // propEntityId
            propEntityId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // interactId
            interactId = input.readUInt32();
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
        output.writeUInt32(FieldNames.propEntityId, propEntityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.interactId, interactId);
      }
      output.endObject();
    }

    @Override
    public InteractPropCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -68717343:
          case -57484005: {
            if (input.isAtField(FieldNames.propEntityId)) {
              if (!input.trySkipNullValue()) {
                propEntityId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1603081743:
          case 1844094916: {
            if (input.isAtField(FieldNames.interactId)) {
              if (!input.trySkipNullValue()) {
                interactId = input.readUInt32();
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
    public InteractPropCsReq clone() {
      return new InteractPropCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static InteractPropCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new InteractPropCsReq(), data).checkInitialized();
    }

    public static InteractPropCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new InteractPropCsReq(), input).checkInitialized();
    }

    public static InteractPropCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new InteractPropCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating InteractPropCsReq messages
     */
    public static MessageFactory<InteractPropCsReq> getFactory() {
      return InteractPropCsReqFactory.INSTANCE;
    }

    private enum InteractPropCsReqFactory implements MessageFactory<InteractPropCsReq> {
      INSTANCE;

      @Override
      public InteractPropCsReq create() {
        return InteractPropCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName propEntityId = FieldName.forField("propEntityId", "prop_entity_id");

      static final FieldName interactId = FieldName.forField("interactId", "interact_id");
    }
  }
}
