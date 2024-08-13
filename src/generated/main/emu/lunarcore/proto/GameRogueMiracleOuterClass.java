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

public final class GameRogueMiracleOuterClass {
  /**
   * Protobuf type {@code GameRogueMiracle}
   */
  public static final class GameRogueMiracle extends ProtoMessage<GameRogueMiracle> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 miracle_id = 8;</code>
     */
    private int miracleId;

    /**
     * <code>optional uint32 durability = 9;</code>
     */
    private int durability;

    /**
     * <code>optional uint32 cur_times = 15;</code>
     */
    private int curTimes;

    /**
     * <code>repeated .GameRogueMiracle.JBFJGEIGGBAEntry JBFJGEIGGBA = 3;</code>
     */
    private final RepeatedMessage<JBFJGEIGGBAEntry> jBFJGEIGGBA = RepeatedMessage.newEmptyInstance(JBFJGEIGGBAEntry.getFactory());

    private GameRogueMiracle() {
    }

    /**
     * @return a new empty instance of {@code GameRogueMiracle}
     */
    public static GameRogueMiracle newInstance() {
      return new GameRogueMiracle();
    }

    /**
     * <code>optional uint32 miracle_id = 8;</code>
     * @return whether the miracleId field is set
     */
    public boolean hasMiracleId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 miracle_id = 8;</code>
     * @return this
     */
    public GameRogueMiracle clearMiracleId() {
      bitField0_ &= ~0x00000001;
      miracleId = 0;
      return this;
    }

    /**
     * <code>optional uint32 miracle_id = 8;</code>
     * @return the miracleId
     */
    public int getMiracleId() {
      return miracleId;
    }

    /**
     * <code>optional uint32 miracle_id = 8;</code>
     * @param value the miracleId to set
     * @return this
     */
    public GameRogueMiracle setMiracleId(final int value) {
      bitField0_ |= 0x00000001;
      miracleId = value;
      return this;
    }

    /**
     * <code>optional uint32 durability = 9;</code>
     * @return whether the durability field is set
     */
    public boolean hasDurability() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 durability = 9;</code>
     * @return this
     */
    public GameRogueMiracle clearDurability() {
      bitField0_ &= ~0x00000002;
      durability = 0;
      return this;
    }

    /**
     * <code>optional uint32 durability = 9;</code>
     * @return the durability
     */
    public int getDurability() {
      return durability;
    }

    /**
     * <code>optional uint32 durability = 9;</code>
     * @param value the durability to set
     * @return this
     */
    public GameRogueMiracle setDurability(final int value) {
      bitField0_ |= 0x00000002;
      durability = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_times = 15;</code>
     * @return whether the curTimes field is set
     */
    public boolean hasCurTimes() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cur_times = 15;</code>
     * @return this
     */
    public GameRogueMiracle clearCurTimes() {
      bitField0_ &= ~0x00000004;
      curTimes = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_times = 15;</code>
     * @return the curTimes
     */
    public int getCurTimes() {
      return curTimes;
    }

    /**
     * <code>optional uint32 cur_times = 15;</code>
     * @param value the curTimes to set
     * @return this
     */
    public GameRogueMiracle setCurTimes(final int value) {
      bitField0_ |= 0x00000004;
      curTimes = value;
      return this;
    }

    /**
     * <code>repeated .GameRogueMiracle.JBFJGEIGGBAEntry JBFJGEIGGBA = 3;</code>
     * @return whether the jBFJGEIGGBA field is set
     */
    public boolean hasJBFJGEIGGBA() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .GameRogueMiracle.JBFJGEIGGBAEntry JBFJGEIGGBA = 3;</code>
     * @return this
     */
    public GameRogueMiracle clearJBFJGEIGGBA() {
      bitField0_ &= ~0x00000008;
      jBFJGEIGGBA.clear();
      return this;
    }

    /**
     * <code>repeated .GameRogueMiracle.JBFJGEIGGBAEntry JBFJGEIGGBA = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableJBFJGEIGGBA()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<JBFJGEIGGBAEntry> getJBFJGEIGGBA() {
      return jBFJGEIGGBA;
    }

    /**
     * <code>repeated .GameRogueMiracle.JBFJGEIGGBAEntry JBFJGEIGGBA = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<JBFJGEIGGBAEntry> getMutableJBFJGEIGGBA() {
      bitField0_ |= 0x00000008;
      return jBFJGEIGGBA;
    }

    /**
     * <code>repeated .GameRogueMiracle.JBFJGEIGGBAEntry JBFJGEIGGBA = 3;</code>
     * @param value the jBFJGEIGGBA to add
     * @return this
     */
    public GameRogueMiracle addJBFJGEIGGBA(final JBFJGEIGGBAEntry value) {
      bitField0_ |= 0x00000008;
      jBFJGEIGGBA.add(value);
      return this;
    }

    /**
     * <code>repeated .GameRogueMiracle.JBFJGEIGGBAEntry JBFJGEIGGBA = 3;</code>
     * @param values the jBFJGEIGGBA to add
     * @return this
     */
    public GameRogueMiracle addAllJBFJGEIGGBA(final JBFJGEIGGBAEntry... values) {
      bitField0_ |= 0x00000008;
      jBFJGEIGGBA.addAll(values);
      return this;
    }

    @Override
    public GameRogueMiracle copyFrom(final GameRogueMiracle other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        miracleId = other.miracleId;
        durability = other.durability;
        curTimes = other.curTimes;
        jBFJGEIGGBA.copyFrom(other.jBFJGEIGGBA);
      }
      return this;
    }

    @Override
    public GameRogueMiracle mergeFrom(final GameRogueMiracle other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMiracleId()) {
        setMiracleId(other.miracleId);
      }
      if (other.hasDurability()) {
        setDurability(other.durability);
      }
      if (other.hasCurTimes()) {
        setCurTimes(other.curTimes);
      }
      if (other.hasJBFJGEIGGBA()) {
        getMutableJBFJGEIGGBA().addAll(other.jBFJGEIGGBA);
      }
      return this;
    }

    @Override
    public GameRogueMiracle clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      miracleId = 0;
      durability = 0;
      curTimes = 0;
      jBFJGEIGGBA.clear();
      return this;
    }

    @Override
    public GameRogueMiracle clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      jBFJGEIGGBA.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GameRogueMiracle)) {
        return false;
      }
      GameRogueMiracle other = (GameRogueMiracle) o;
      return bitField0_ == other.bitField0_
        && (!hasMiracleId() || miracleId == other.miracleId)
        && (!hasDurability() || durability == other.durability)
        && (!hasCurTimes() || curTimes == other.curTimes)
        && (!hasJBFJGEIGGBA() || jBFJGEIGGBA.equals(other.jBFJGEIGGBA));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(miracleId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(durability);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(curTimes);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < jBFJGEIGGBA.length(); i++) {
          output.writeRawByte((byte) 26);
          output.writeMessageNoTag(jBFJGEIGGBA.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(miracleId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(durability);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curTimes);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * jBFJGEIGGBA.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(jBFJGEIGGBA);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GameRogueMiracle mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // miracleId
            miracleId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // durability
            durability = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // curTimes
            curTimes = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // jBFJGEIGGBA
            tag = input.readRepeatedMessage(jBFJGEIGGBA, tag);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.miracleId, miracleId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.durability, durability);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.curTimes, curTimes);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.jBFJGEIGGBA, jBFJGEIGGBA);
      }
      output.endObject();
    }

    @Override
    public GameRogueMiracle mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -164571796:
          case -806736983: {
            if (input.isAtField(FieldNames.miracleId)) {
              if (!input.trySkipNullValue()) {
                miracleId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 716086281: {
            if (input.isAtField(FieldNames.durability)) {
              if (!input.trySkipNullValue()) {
                durability = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 547814630:
          case 127351943: {
            if (input.isAtField(FieldNames.curTimes)) {
              if (!input.trySkipNullValue()) {
                curTimes = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1130952882: {
            if (input.isAtField(FieldNames.jBFJGEIGGBA)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(jBFJGEIGGBA);
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
    public GameRogueMiracle clone() {
      return new GameRogueMiracle().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GameRogueMiracle parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GameRogueMiracle(), data).checkInitialized();
    }

    public static GameRogueMiracle parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GameRogueMiracle(), input).checkInitialized();
    }

    public static GameRogueMiracle parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GameRogueMiracle(), input).checkInitialized();
    }

    /**
     * @return factory for creating GameRogueMiracle messages
     */
    public static MessageFactory<GameRogueMiracle> getFactory() {
      return GameRogueMiracleFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code JBFJGEIGGBAEntry}
     */
    public static final class JBFJGEIGGBAEntry extends ProtoMessage<JBFJGEIGGBAEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional uint32 value = 2;</code>
       */
      private int value_;

      private JBFJGEIGGBAEntry() {
      }

      /**
       * @return a new empty instance of {@code JBFJGEIGGBAEntry}
       */
      public static JBFJGEIGGBAEntry newInstance() {
        return new JBFJGEIGGBAEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public JBFJGEIGGBAEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public JBFJGEIGGBAEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return this
       */
      public JBFJGEIGGBAEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return the value_
       */
      public int getValue() {
        return value_;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public JBFJGEIGGBAEntry setValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      @Override
      public JBFJGEIGGBAEntry copyFrom(final JBFJGEIGGBAEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public JBFJGEIGGBAEntry mergeFrom(final JBFJGEIGGBAEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValue(other.value_);
        }
        return this;
      }

      @Override
      public JBFJGEIGGBAEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public JBFJGEIGGBAEntry clearQuick() {
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
        if (!(o instanceof JBFJGEIGGBAEntry)) {
          return false;
        }
        JBFJGEIGGBAEntry other = (JBFJGEIGGBAEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public JBFJGEIGGBAEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              value_ = input.readUInt32();
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
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeUInt32(FieldNames.value_, value_);
        }
        output.endObject();
      }

      @Override
      public JBFJGEIGGBAEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  value_ = input.readUInt32();
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
      public JBFJGEIGGBAEntry clone() {
        return new JBFJGEIGGBAEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static JBFJGEIGGBAEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new JBFJGEIGGBAEntry(), data).checkInitialized();
      }

      public static JBFJGEIGGBAEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new JBFJGEIGGBAEntry(), input).checkInitialized();
      }

      public static JBFJGEIGGBAEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new JBFJGEIGGBAEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating JBFJGEIGGBAEntry messages
       */
      public static MessageFactory<JBFJGEIGGBAEntry> getFactory() {
        return JBFJGEIGGBAEntryFactory.INSTANCE;
      }

      private enum JBFJGEIGGBAEntryFactory implements MessageFactory<JBFJGEIGGBAEntry> {
        INSTANCE;

        @Override
        public JBFJGEIGGBAEntry create() {
          return JBFJGEIGGBAEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum GameRogueMiracleFactory implements MessageFactory<GameRogueMiracle> {
      INSTANCE;

      @Override
      public GameRogueMiracle create() {
        return GameRogueMiracle.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName miracleId = FieldName.forField("miracleId", "miracle_id");

      static final FieldName durability = FieldName.forField("durability");

      static final FieldName curTimes = FieldName.forField("curTimes", "cur_times");

      static final FieldName jBFJGEIGGBA = FieldName.forField("JBFJGEIGGBA");
    }
  }
}
