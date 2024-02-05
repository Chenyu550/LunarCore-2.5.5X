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

public final class RogueCommonPendingActionOuterClass {
  /**
   * Protobuf type {@code RogueCommonPendingAction}
   */
  public static final class RogueCommonPendingAction extends ProtoMessage<RogueCommonPendingAction> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 action_unique_id = 3;</code>
     */
    private int actionUniqueId;

    /**
     * <code>optional .RogueAction rogue_action = 7;</code>
     */
    private final RogueActionOuterClass.RogueAction rogueAction = RogueActionOuterClass.RogueAction.newInstance();

    private RogueCommonPendingAction() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonPendingAction}
     */
    public static RogueCommonPendingAction newInstance() {
      return new RogueCommonPendingAction();
    }

    /**
     * <code>optional uint32 action_unique_id = 3;</code>
     * @return whether the actionUniqueId field is set
     */
    public boolean hasActionUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 action_unique_id = 3;</code>
     * @return this
     */
    public RogueCommonPendingAction clearActionUniqueId() {
      bitField0_ &= ~0x00000001;
      actionUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 action_unique_id = 3;</code>
     * @return the actionUniqueId
     */
    public int getActionUniqueId() {
      return actionUniqueId;
    }

    /**
     * <code>optional uint32 action_unique_id = 3;</code>
     * @param value the actionUniqueId to set
     * @return this
     */
    public RogueCommonPendingAction setActionUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      actionUniqueId = value;
      return this;
    }

    /**
     * <code>optional .RogueAction rogue_action = 7;</code>
     * @return whether the rogueAction field is set
     */
    public boolean hasRogueAction() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueAction rogue_action = 7;</code>
     * @return this
     */
    public RogueCommonPendingAction clearRogueAction() {
      bitField0_ &= ~0x00000002;
      rogueAction.clear();
      return this;
    }

    /**
     * <code>optional .RogueAction rogue_action = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAction()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueActionOuterClass.RogueAction getRogueAction() {
      return rogueAction;
    }

    /**
     * <code>optional .RogueAction rogue_action = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueActionOuterClass.RogueAction getMutableRogueAction() {
      bitField0_ |= 0x00000002;
      return rogueAction;
    }

    /**
     * <code>optional .RogueAction rogue_action = 7;</code>
     * @param value the rogueAction to set
     * @return this
     */
    public RogueCommonPendingAction setRogueAction(final RogueActionOuterClass.RogueAction value) {
      bitField0_ |= 0x00000002;
      rogueAction.copyFrom(value);
      return this;
    }

    @Override
    public RogueCommonPendingAction copyFrom(final RogueCommonPendingAction other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        actionUniqueId = other.actionUniqueId;
        rogueAction.copyFrom(other.rogueAction);
      }
      return this;
    }

    @Override
    public RogueCommonPendingAction mergeFrom(final RogueCommonPendingAction other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasActionUniqueId()) {
        setActionUniqueId(other.actionUniqueId);
      }
      if (other.hasRogueAction()) {
        getMutableRogueAction().mergeFrom(other.rogueAction);
      }
      return this;
    }

    @Override
    public RogueCommonPendingAction clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      actionUniqueId = 0;
      rogueAction.clear();
      return this;
    }

    @Override
    public RogueCommonPendingAction clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueAction.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueCommonPendingAction)) {
        return false;
      }
      RogueCommonPendingAction other = (RogueCommonPendingAction) o;
      return bitField0_ == other.bitField0_
        && (!hasActionUniqueId() || actionUniqueId == other.actionUniqueId)
        && (!hasRogueAction() || rogueAction.equals(other.rogueAction));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(actionUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(rogueAction);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(actionUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAction);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonPendingAction mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // actionUniqueId
            actionUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // rogueAction
            input.readMessage(rogueAction);
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
        output.writeUInt32(FieldNames.actionUniqueId, actionUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rogueAction, rogueAction);
      }
      output.endObject();
    }

    @Override
    public RogueCommonPendingAction mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -208785118:
          case 1003664768: {
            if (input.isAtField(FieldNames.actionUniqueId)) {
              if (!input.trySkipNullValue()) {
                actionUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1366582096:
          case 1368298555: {
            if (input.isAtField(FieldNames.rogueAction)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAction);
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
    public RogueCommonPendingAction clone() {
      return new RogueCommonPendingAction().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonPendingAction parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonPendingAction(), data).checkInitialized();
    }

    public static RogueCommonPendingAction parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonPendingAction(), input).checkInitialized();
    }

    public static RogueCommonPendingAction parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonPendingAction(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonPendingAction messages
     */
    public static MessageFactory<RogueCommonPendingAction> getFactory() {
      return RogueCommonPendingActionFactory.INSTANCE;
    }

    private enum RogueCommonPendingActionFactory implements MessageFactory<RogueCommonPendingAction> {
      INSTANCE;

      @Override
      public RogueCommonPendingAction create() {
        return RogueCommonPendingAction.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName actionUniqueId = FieldName.forField("actionUniqueId", "action_unique_id");

      static final FieldName rogueAction = FieldName.forField("rogueAction", "rogue_action");
    }
  }
}
