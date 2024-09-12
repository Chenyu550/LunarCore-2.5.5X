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

public final class LeaveRogueScRspOuterClass {
  /**
   * Protobuf type {@code LeaveRogueScRsp}
   */
  public static final class LeaveRogueScRsp extends ProtoMessage<LeaveRogueScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>optional .LineupInfo lineup = 11;</code>
     */
    private final LineupInfoOuterClass.LineupInfo lineup = LineupInfoOuterClass.LineupInfo.newInstance();

    /**
     * <code>optional .RogueInfo rogue_info = 12;</code>
     */
    private final RogueInfoOuterClass.RogueInfo rogueInfo = RogueInfoOuterClass.RogueInfo.newInstance();

    /**
     * <code>optional .SceneInfo scene = 14;</code>
     */
    private final SceneInfoOuterClass.SceneInfo scene = SceneInfoOuterClass.SceneInfo.newInstance();

    private LeaveRogueScRsp() {
    }

    /**
     * @return a new empty instance of {@code LeaveRogueScRsp}
     */
    public static LeaveRogueScRsp newInstance() {
      return new LeaveRogueScRsp();
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public LeaveRogueScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public LeaveRogueScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .LineupInfo lineup = 11;</code>
     * @return whether the lineup field is set
     */
    public boolean hasLineup() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .LineupInfo lineup = 11;</code>
     * @return this
     */
    public LeaveRogueScRsp clearLineup() {
      bitField0_ &= ~0x00000002;
      lineup.clear();
      return this;
    }

    /**
     * <code>optional .LineupInfo lineup = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineup()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public LineupInfoOuterClass.LineupInfo getLineup() {
      return lineup;
    }

    /**
     * <code>optional .LineupInfo lineup = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public LineupInfoOuterClass.LineupInfo getMutableLineup() {
      bitField0_ |= 0x00000002;
      return lineup;
    }

    /**
     * <code>optional .LineupInfo lineup = 11;</code>
     * @param value the lineup to set
     * @return this
     */
    public LeaveRogueScRsp setLineup(final LineupInfoOuterClass.LineupInfo value) {
      bitField0_ |= 0x00000002;
      lineup.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 12;</code>
     * @return whether the rogueInfo field is set
     */
    public boolean hasRogueInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 12;</code>
     * @return this
     */
    public LeaveRogueScRsp clearRogueInfo() {
      bitField0_ &= ~0x00000004;
      rogueInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueInfoOuterClass.RogueInfo getRogueInfo() {
      return rogueInfo;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueInfoOuterClass.RogueInfo getMutableRogueInfo() {
      bitField0_ |= 0x00000004;
      return rogueInfo;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 12;</code>
     * @param value the rogueInfo to set
     * @return this
     */
    public LeaveRogueScRsp setRogueInfo(final RogueInfoOuterClass.RogueInfo value) {
      bitField0_ |= 0x00000004;
      rogueInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneInfo scene = 14;</code>
     * @return whether the scene field is set
     */
    public boolean hasScene() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .SceneInfo scene = 14;</code>
     * @return this
     */
    public LeaveRogueScRsp clearScene() {
      bitField0_ &= ~0x00000008;
      scene.clear();
      return this;
    }

    /**
     * <code>optional .SceneInfo scene = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableScene()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneInfoOuterClass.SceneInfo getScene() {
      return scene;
    }

    /**
     * <code>optional .SceneInfo scene = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneInfoOuterClass.SceneInfo getMutableScene() {
      bitField0_ |= 0x00000008;
      return scene;
    }

    /**
     * <code>optional .SceneInfo scene = 14;</code>
     * @param value the scene to set
     * @return this
     */
    public LeaveRogueScRsp setScene(final SceneInfoOuterClass.SceneInfo value) {
      bitField0_ |= 0x00000008;
      scene.copyFrom(value);
      return this;
    }

    @Override
    public LeaveRogueScRsp copyFrom(final LeaveRogueScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        lineup.copyFrom(other.lineup);
        rogueInfo.copyFrom(other.rogueInfo);
        scene.copyFrom(other.scene);
      }
      return this;
    }

    @Override
    public LeaveRogueScRsp mergeFrom(final LeaveRogueScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasLineup()) {
        getMutableLineup().mergeFrom(other.lineup);
      }
      if (other.hasRogueInfo()) {
        getMutableRogueInfo().mergeFrom(other.rogueInfo);
      }
      if (other.hasScene()) {
        getMutableScene().mergeFrom(other.scene);
      }
      return this;
    }

    @Override
    public LeaveRogueScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      lineup.clear();
      rogueInfo.clear();
      scene.clear();
      return this;
    }

    @Override
    public LeaveRogueScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lineup.clearQuick();
      rogueInfo.clearQuick();
      scene.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LeaveRogueScRsp)) {
        return false;
      }
      LeaveRogueScRsp other = (LeaveRogueScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasLineup() || lineup.equals(other.lineup))
        && (!hasRogueInfo() || rogueInfo.equals(other.rogueInfo))
        && (!hasScene() || scene.equals(other.scene));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(lineup);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(rogueInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(scene);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(lineup);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(scene);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LeaveRogueScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // lineup
            input.readMessage(lineup);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // rogueInfo
            input.readMessage(rogueInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // scene
            input.readMessage(scene);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.lineup, lineup);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueInfo, rogueInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.scene, scene);
      }
      output.endObject();
    }

    @Override
    public LeaveRogueScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1102671473: {
            if (input.isAtField(FieldNames.lineup)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(lineup);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 655808936:
          case -1124583437: {
            if (input.isAtField(FieldNames.rogueInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109254796: {
            if (input.isAtField(FieldNames.scene)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(scene);
                bitField0_ |= 0x00000008;
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
    public LeaveRogueScRsp clone() {
      return new LeaveRogueScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LeaveRogueScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LeaveRogueScRsp(), data).checkInitialized();
    }

    public static LeaveRogueScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LeaveRogueScRsp(), input).checkInitialized();
    }

    public static LeaveRogueScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LeaveRogueScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating LeaveRogueScRsp messages
     */
    public static MessageFactory<LeaveRogueScRsp> getFactory() {
      return LeaveRogueScRspFactory.INSTANCE;
    }

    private enum LeaveRogueScRspFactory implements MessageFactory<LeaveRogueScRsp> {
      INSTANCE;

      @Override
      public LeaveRogueScRsp create() {
        return LeaveRogueScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName lineup = FieldName.forField("lineup");

      static final FieldName rogueInfo = FieldName.forField("rogueInfo", "rogue_info");

      static final FieldName scene = FieldName.forField("scene");
    }
  }
}
