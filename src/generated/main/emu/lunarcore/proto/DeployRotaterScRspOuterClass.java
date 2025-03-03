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

public final class DeployRotaterScRspOuterClass {
  /**
   * <pre>
   *
   * </pre>
   *
   * Protobuf type {@code DeployRotaterScRsp}
   */
  public static final class DeployRotaterScRsp extends ProtoMessage<DeployRotaterScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .RotaterData rotater_data = 6;</code>
     */
    private final RotaterDataOuterClass.RotaterData rotaterData = RotaterDataOuterClass.RotaterData.newInstance();

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 13;</code>
     */
    private final RotatorEnergyInfoOuterClass.RotatorEnergyInfo energyInfo = RotatorEnergyInfoOuterClass.RotatorEnergyInfo.newInstance();

    private DeployRotaterScRsp() {
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * @return a new empty instance of {@code DeployRotaterScRsp}
     */
    public static DeployRotaterScRsp newInstance() {
      return new DeployRotaterScRsp();
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public DeployRotaterScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public DeployRotaterScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RotaterData rotater_data = 6;</code>
     * @return whether the rotaterData field is set
     */
    public boolean hasRotaterData() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RotaterData rotater_data = 6;</code>
     * @return this
     */
    public DeployRotaterScRsp clearRotaterData() {
      bitField0_ &= ~0x00000002;
      rotaterData.clear();
      return this;
    }

    /**
     * <code>optional .RotaterData rotater_data = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRotaterData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RotaterDataOuterClass.RotaterData getRotaterData() {
      return rotaterData;
    }

    /**
     * <code>optional .RotaterData rotater_data = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RotaterDataOuterClass.RotaterData getMutableRotaterData() {
      bitField0_ |= 0x00000002;
      return rotaterData;
    }

    /**
     * <code>optional .RotaterData rotater_data = 6;</code>
     * @param value the rotaterData to set
     * @return this
     */
    public DeployRotaterScRsp setRotaterData(final RotaterDataOuterClass.RotaterData value) {
      bitField0_ |= 0x00000002;
      rotaterData.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 13;</code>
     * @return whether the energyInfo field is set
     */
    public boolean hasEnergyInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 13;</code>
     * @return this
     */
    public DeployRotaterScRsp clearEnergyInfo() {
      bitField0_ &= ~0x00000004;
      energyInfo.clear();
      return this;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEnergyInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RotatorEnergyInfoOuterClass.RotatorEnergyInfo getEnergyInfo() {
      return energyInfo;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RotatorEnergyInfoOuterClass.RotatorEnergyInfo getMutableEnergyInfo() {
      bitField0_ |= 0x00000004;
      return energyInfo;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 13;</code>
     * @param value the energyInfo to set
     * @return this
     */
    public DeployRotaterScRsp setEnergyInfo(
        final RotatorEnergyInfoOuterClass.RotatorEnergyInfo value) {
      bitField0_ |= 0x00000004;
      energyInfo.copyFrom(value);
      return this;
    }

    @Override
    public DeployRotaterScRsp copyFrom(final DeployRotaterScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        rotaterData.copyFrom(other.rotaterData);
        energyInfo.copyFrom(other.energyInfo);
      }
      return this;
    }

    @Override
    public DeployRotaterScRsp mergeFrom(final DeployRotaterScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasRotaterData()) {
        getMutableRotaterData().mergeFrom(other.rotaterData);
      }
      if (other.hasEnergyInfo()) {
        getMutableEnergyInfo().mergeFrom(other.energyInfo);
      }
      return this;
    }

    @Override
    public DeployRotaterScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      rotaterData.clear();
      energyInfo.clear();
      return this;
    }

    @Override
    public DeployRotaterScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rotaterData.clearQuick();
      energyInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DeployRotaterScRsp)) {
        return false;
      }
      DeployRotaterScRsp other = (DeployRotaterScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasRotaterData() || rotaterData.equals(other.rotaterData))
        && (!hasEnergyInfo() || energyInfo.equals(other.energyInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(rotaterData);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(energyInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rotaterData);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(energyInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DeployRotaterScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // rotaterData
            input.readMessage(rotaterData);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // energyInfo
            input.readMessage(energyInfo);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rotaterData, rotaterData);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.energyInfo, energyInfo);
      }
      output.endObject();
    }

    @Override
    public DeployRotaterScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1880563393:
          case -1807070094: {
            if (input.isAtField(FieldNames.rotaterData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rotaterData);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1464698710:
          case -1818804219: {
            if (input.isAtField(FieldNames.energyInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(energyInfo);
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
    public DeployRotaterScRsp clone() {
      return new DeployRotaterScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DeployRotaterScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DeployRotaterScRsp(), data).checkInitialized();
    }

    public static DeployRotaterScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DeployRotaterScRsp(), input).checkInitialized();
    }

    public static DeployRotaterScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DeployRotaterScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating DeployRotaterScRsp messages
     */
    public static MessageFactory<DeployRotaterScRsp> getFactory() {
      return DeployRotaterScRspFactory.INSTANCE;
    }

    private enum DeployRotaterScRspFactory implements MessageFactory<DeployRotaterScRsp> {
      INSTANCE;

      @Override
      public DeployRotaterScRsp create() {
        return DeployRotaterScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName rotaterData = FieldName.forField("rotaterData", "rotater_data");

      static final FieldName energyInfo = FieldName.forField("energyInfo", "energy_info");
    }
  }
}
