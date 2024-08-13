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

public final class RogueModuleInfoOuterClass {
  /**
   * Protobuf type {@code RogueModuleInfo}
   */
  public static final class RogueModuleInfo extends ProtoMessage<RogueModuleInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 module_id_list = 9;</code>
     */
    private final RepeatedInt moduleIdList = RepeatedInt.newEmptyInstance();

    private RogueModuleInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueModuleInfo}
     */
    public static RogueModuleInfo newInstance() {
      return new RogueModuleInfo();
    }

    /**
     * <code>repeated uint32 module_id_list = 9;</code>
     * @return whether the moduleIdList field is set
     */
    public boolean hasModuleIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 module_id_list = 9;</code>
     * @return this
     */
    public RogueModuleInfo clearModuleIdList() {
      bitField0_ &= ~0x00000001;
      moduleIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 module_id_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableModuleIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getModuleIdList() {
      return moduleIdList;
    }

    /**
     * <code>repeated uint32 module_id_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableModuleIdList() {
      bitField0_ |= 0x00000001;
      return moduleIdList;
    }

    /**
     * <code>repeated uint32 module_id_list = 9;</code>
     * @param value the moduleIdList to add
     * @return this
     */
    public RogueModuleInfo addModuleIdList(final int value) {
      bitField0_ |= 0x00000001;
      moduleIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 module_id_list = 9;</code>
     * @param values the moduleIdList to add
     * @return this
     */
    public RogueModuleInfo addAllModuleIdList(final int... values) {
      bitField0_ |= 0x00000001;
      moduleIdList.addAll(values);
      return this;
    }

    @Override
    public RogueModuleInfo copyFrom(final RogueModuleInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        moduleIdList.copyFrom(other.moduleIdList);
      }
      return this;
    }

    @Override
    public RogueModuleInfo mergeFrom(final RogueModuleInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasModuleIdList()) {
        getMutableModuleIdList().addAll(other.moduleIdList);
      }
      return this;
    }

    @Override
    public RogueModuleInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      moduleIdList.clear();
      return this;
    }

    @Override
    public RogueModuleInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      moduleIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueModuleInfo)) {
        return false;
      }
      RogueModuleInfo other = (RogueModuleInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasModuleIdList() || moduleIdList.equals(other.moduleIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < moduleIdList.length(); i++) {
          output.writeRawByte((byte) 72);
          output.writeUInt32NoTag(moduleIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * moduleIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(moduleIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueModuleInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 74: {
            // moduleIdList [packed=true]
            input.readPackedUInt32(moduleIdList, tag);
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
          case 72: {
            // moduleIdList [packed=false]
            tag = input.readRepeatedUInt32(moduleIdList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.moduleIdList, moduleIdList);
      }
      output.endObject();
    }

    @Override
    public RogueModuleInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 969883109:
          case 557086319: {
            if (input.isAtField(FieldNames.moduleIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(moduleIdList);
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
    public RogueModuleInfo clone() {
      return new RogueModuleInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueModuleInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueModuleInfo(), data).checkInitialized();
    }

    public static RogueModuleInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueModuleInfo(), input).checkInitialized();
    }

    public static RogueModuleInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueModuleInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueModuleInfo messages
     */
    public static MessageFactory<RogueModuleInfo> getFactory() {
      return RogueModuleInfoFactory.INSTANCE;
    }

    private enum RogueModuleInfoFactory implements MessageFactory<RogueModuleInfo> {
      INSTANCE;

      @Override
      public RogueModuleInfo create() {
        return RogueModuleInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName moduleIdList = FieldName.forField("moduleIdList", "module_id_list");
    }
  }
}
