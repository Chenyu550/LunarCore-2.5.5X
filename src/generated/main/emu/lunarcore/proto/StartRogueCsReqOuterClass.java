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
import us.hebi.quickbuf.RepeatedInt;

public final class StartRogueCsReqOuterClass {
  /**
   * Protobuf type {@code StartRogueCsReq}
   */
  public static final class StartRogueCsReq extends ProtoMessage<StartRogueCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 area_id = 9;</code>
     */
    private int areaId;

    /**
     * <code>optional uint32 buff_aeon_id = 15;</code>
     */
    private int buffAeonId;

    /**
     * <code>repeated uint32 base_avatar_id_list = 13;</code>
     */
    private final RepeatedInt baseAvatarIdList = RepeatedInt.newEmptyInstance();

    private StartRogueCsReq() {
    }

    /**
     * @return a new empty instance of {@code StartRogueCsReq}
     */
    public static StartRogueCsReq newInstance() {
      return new StartRogueCsReq();
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @return whether the areaId field is set
     */
    public boolean hasAreaId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @return this
     */
    public StartRogueCsReq clearAreaId() {
      bitField0_ &= ~0x00000001;
      areaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @return the areaId
     */
    public int getAreaId() {
      return areaId;
    }

    /**
     * <code>optional uint32 area_id = 9;</code>
     * @param value the areaId to set
     * @return this
     */
    public StartRogueCsReq setAreaId(final int value) {
      bitField0_ |= 0x00000001;
      areaId = value;
      return this;
    }

    /**
     * <code>optional uint32 buff_aeon_id = 15;</code>
     * @return whether the buffAeonId field is set
     */
    public boolean hasBuffAeonId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 buff_aeon_id = 15;</code>
     * @return this
     */
    public StartRogueCsReq clearBuffAeonId() {
      bitField0_ &= ~0x00000002;
      buffAeonId = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_aeon_id = 15;</code>
     * @return the buffAeonId
     */
    public int getBuffAeonId() {
      return buffAeonId;
    }

    /**
     * <code>optional uint32 buff_aeon_id = 15;</code>
     * @param value the buffAeonId to set
     * @return this
     */
    public StartRogueCsReq setBuffAeonId(final int value) {
      bitField0_ |= 0x00000002;
      buffAeonId = value;
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 13;</code>
     * @return whether the baseAvatarIdList field is set
     */
    public boolean hasBaseAvatarIdList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 13;</code>
     * @return this
     */
    public StartRogueCsReq clearBaseAvatarIdList() {
      bitField0_ &= ~0x00000004;
      baseAvatarIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBaseAvatarIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBaseAvatarIdList() {
      return baseAvatarIdList;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBaseAvatarIdList() {
      bitField0_ |= 0x00000004;
      return baseAvatarIdList;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 13;</code>
     * @param value the baseAvatarIdList to add
     * @return this
     */
    public StartRogueCsReq addBaseAvatarIdList(final int value) {
      bitField0_ |= 0x00000004;
      baseAvatarIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 13;</code>
     * @param values the baseAvatarIdList to add
     * @return this
     */
    public StartRogueCsReq addAllBaseAvatarIdList(final int... values) {
      bitField0_ |= 0x00000004;
      baseAvatarIdList.addAll(values);
      return this;
    }

    @Override
    public StartRogueCsReq copyFrom(final StartRogueCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        areaId = other.areaId;
        buffAeonId = other.buffAeonId;
        baseAvatarIdList.copyFrom(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public StartRogueCsReq mergeFrom(final StartRogueCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAreaId()) {
        setAreaId(other.areaId);
      }
      if (other.hasBuffAeonId()) {
        setBuffAeonId(other.buffAeonId);
      }
      if (other.hasBaseAvatarIdList()) {
        getMutableBaseAvatarIdList().addAll(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public StartRogueCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      areaId = 0;
      buffAeonId = 0;
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public StartRogueCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartRogueCsReq)) {
        return false;
      }
      StartRogueCsReq other = (StartRogueCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasAreaId() || areaId == other.areaId)
        && (!hasBuffAeonId() || buffAeonId == other.buffAeonId)
        && (!hasBaseAvatarIdList() || baseAvatarIdList.equals(other.baseAvatarIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(buffAeonId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < baseAvatarIdList.length(); i++) {
          output.writeRawByte((byte) 104);
          output.writeUInt32NoTag(baseAvatarIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffAeonId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * baseAvatarIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(baseAvatarIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartRogueCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // areaId
            areaId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // buffAeonId
            buffAeonId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // baseAvatarIdList [packed=true]
            input.readPackedUInt32(baseAvatarIdList, tag);
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
          case 104: {
            // baseAvatarIdList [packed=false]
            tag = input.readRepeatedUInt32(baseAvatarIdList, tag);
            bitField0_ |= 0x00000004;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.areaId, areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.buffAeonId, buffAeonId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.baseAvatarIdList, baseAvatarIdList);
      }
      output.endObject();
    }

    @Override
    public StartRogueCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1409553784:
          case -746472947: {
            if (input.isAtField(FieldNames.areaId)) {
              if (!input.trySkipNullValue()) {
                areaId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 864413617:
          case -1316781589: {
            if (input.isAtField(FieldNames.buffAeonId)) {
              if (!input.trySkipNullValue()) {
                buffAeonId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1212654461:
          case 914628490: {
            if (input.isAtField(FieldNames.baseAvatarIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(baseAvatarIdList);
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
    public StartRogueCsReq clone() {
      return new StartRogueCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartRogueCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartRogueCsReq(), data).checkInitialized();
    }

    public static StartRogueCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartRogueCsReq(), input).checkInitialized();
    }

    public static StartRogueCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartRogueCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartRogueCsReq messages
     */
    public static MessageFactory<StartRogueCsReq> getFactory() {
      return StartRogueCsReqFactory.INSTANCE;
    }

    private enum StartRogueCsReqFactory implements MessageFactory<StartRogueCsReq> {
      INSTANCE;

      @Override
      public StartRogueCsReq create() {
        return StartRogueCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName areaId = FieldName.forField("areaId", "area_id");

      static final FieldName buffAeonId = FieldName.forField("buffAeonId", "buff_aeon_id");

      static final FieldName baseAvatarIdList = FieldName.forField("baseAvatarIdList", "base_avatar_id_list");
    }
  }
}
