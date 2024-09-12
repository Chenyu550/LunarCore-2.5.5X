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

public final class PropAeonInfoOuterClass {
  /**
   * Protobuf type {@code PropAeonInfo}
   */
  public static final class PropAeonInfo extends ProtoMessage<PropAeonInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 add_exp = 3;</code>
     */
    private int addExp;

    /**
     * <code>optional uint32 dialogue_group_id = 11;</code>
     */
    private int dialogueGroupId;

    /**
     * <code>optional uint32 aeon_id = 12;</code>
     */
    private int aeonId;

    private PropAeonInfo() {
    }

    /**
     * @return a new empty instance of {@code PropAeonInfo}
     */
    public static PropAeonInfo newInstance() {
      return new PropAeonInfo();
    }

    /**
     * <code>optional uint32 add_exp = 3;</code>
     * @return whether the addExp field is set
     */
    public boolean hasAddExp() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 add_exp = 3;</code>
     * @return this
     */
    public PropAeonInfo clearAddExp() {
      bitField0_ &= ~0x00000001;
      addExp = 0;
      return this;
    }

    /**
     * <code>optional uint32 add_exp = 3;</code>
     * @return the addExp
     */
    public int getAddExp() {
      return addExp;
    }

    /**
     * <code>optional uint32 add_exp = 3;</code>
     * @param value the addExp to set
     * @return this
     */
    public PropAeonInfo setAddExp(final int value) {
      bitField0_ |= 0x00000001;
      addExp = value;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_group_id = 11;</code>
     * @return whether the dialogueGroupId field is set
     */
    public boolean hasDialogueGroupId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 dialogue_group_id = 11;</code>
     * @return this
     */
    public PropAeonInfo clearDialogueGroupId() {
      bitField0_ &= ~0x00000002;
      dialogueGroupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_group_id = 11;</code>
     * @return the dialogueGroupId
     */
    public int getDialogueGroupId() {
      return dialogueGroupId;
    }

    /**
     * <code>optional uint32 dialogue_group_id = 11;</code>
     * @param value the dialogueGroupId to set
     * @return this
     */
    public PropAeonInfo setDialogueGroupId(final int value) {
      bitField0_ |= 0x00000002;
      dialogueGroupId = value;
      return this;
    }

    /**
     * <code>optional uint32 aeon_id = 12;</code>
     * @return whether the aeonId field is set
     */
    public boolean hasAeonId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 aeon_id = 12;</code>
     * @return this
     */
    public PropAeonInfo clearAeonId() {
      bitField0_ &= ~0x00000004;
      aeonId = 0;
      return this;
    }

    /**
     * <code>optional uint32 aeon_id = 12;</code>
     * @return the aeonId
     */
    public int getAeonId() {
      return aeonId;
    }

    /**
     * <code>optional uint32 aeon_id = 12;</code>
     * @param value the aeonId to set
     * @return this
     */
    public PropAeonInfo setAeonId(final int value) {
      bitField0_ |= 0x00000004;
      aeonId = value;
      return this;
    }

    @Override
    public PropAeonInfo copyFrom(final PropAeonInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        addExp = other.addExp;
        dialogueGroupId = other.dialogueGroupId;
        aeonId = other.aeonId;
      }
      return this;
    }

    @Override
    public PropAeonInfo mergeFrom(final PropAeonInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAddExp()) {
        setAddExp(other.addExp);
      }
      if (other.hasDialogueGroupId()) {
        setDialogueGroupId(other.dialogueGroupId);
      }
      if (other.hasAeonId()) {
        setAeonId(other.aeonId);
      }
      return this;
    }

    @Override
    public PropAeonInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      addExp = 0;
      dialogueGroupId = 0;
      aeonId = 0;
      return this;
    }

    @Override
    public PropAeonInfo clearQuick() {
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
      if (!(o instanceof PropAeonInfo)) {
        return false;
      }
      PropAeonInfo other = (PropAeonInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasAddExp() || addExp == other.addExp)
        && (!hasDialogueGroupId() || dialogueGroupId == other.dialogueGroupId)
        && (!hasAeonId() || aeonId == other.aeonId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(addExp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(dialogueGroupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(aeonId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(addExp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dialogueGroupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(aeonId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PropAeonInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // addExp
            addExp = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // dialogueGroupId
            dialogueGroupId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // aeonId
            aeonId = input.readUInt32();
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
        output.writeUInt32(FieldNames.addExp, addExp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.dialogueGroupId, dialogueGroupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.aeonId, aeonId);
      }
      output.endObject();
    }

    @Override
    public PropAeonInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1422538308:
          case -1148257921: {
            if (input.isAtField(FieldNames.addExp)) {
              if (!input.trySkipNullValue()) {
                addExp = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1758320386:
          case 1899979106: {
            if (input.isAtField(FieldNames.dialogueGroupId)) {
              if (!input.trySkipNullValue()) {
                dialogueGroupId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1421249154:
          case -1109029417: {
            if (input.isAtField(FieldNames.aeonId)) {
              if (!input.trySkipNullValue()) {
                aeonId = input.readUInt32();
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
    public PropAeonInfo clone() {
      return new PropAeonInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PropAeonInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PropAeonInfo(), data).checkInitialized();
    }

    public static PropAeonInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropAeonInfo(), input).checkInitialized();
    }

    public static PropAeonInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropAeonInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating PropAeonInfo messages
     */
    public static MessageFactory<PropAeonInfo> getFactory() {
      return PropAeonInfoFactory.INSTANCE;
    }

    private enum PropAeonInfoFactory implements MessageFactory<PropAeonInfo> {
      INSTANCE;

      @Override
      public PropAeonInfo create() {
        return PropAeonInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName addExp = FieldName.forField("addExp", "add_exp");

      static final FieldName dialogueGroupId = FieldName.forField("dialogueGroupId", "dialogue_group_id");

      static final FieldName aeonId = FieldName.forField("aeonId", "aeon_id");
    }
  }
}
