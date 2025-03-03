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

public final class ContentPackageGetDataScRspOuterClass {
  /**
   * <pre>
   *
   * </pre>
   *
   * Protobuf type {@code ContentPackageGetDataScRsp}
   */
  public static final class ContentPackageGetDataScRsp extends ProtoMessage<ContentPackageGetDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .ContentPackageData data = 4;</code>
     */
    private final ContentPackageDataOuterClass.ContentPackageData data = ContentPackageDataOuterClass.ContentPackageData.newInstance();

    private ContentPackageGetDataScRsp() {
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * @return a new empty instance of {@code ContentPackageGetDataScRsp}
     */
    public static ContentPackageGetDataScRsp newInstance() {
      return new ContentPackageGetDataScRsp();
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
    public ContentPackageGetDataScRsp clearRetcode() {
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
    public ContentPackageGetDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ContentPackageData data = 4;</code>
     * @return whether the data field is set
     */
    public boolean hasData() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ContentPackageData data = 4;</code>
     * @return this
     */
    public ContentPackageGetDataScRsp clearData() {
      bitField0_ &= ~0x00000002;
      data.clear();
      return this;
    }

    /**
     * <code>optional .ContentPackageData data = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ContentPackageDataOuterClass.ContentPackageData getData() {
      return data;
    }

    /**
     * <code>optional .ContentPackageData data = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ContentPackageDataOuterClass.ContentPackageData getMutableData() {
      bitField0_ |= 0x00000002;
      return data;
    }

    /**
     * <code>optional .ContentPackageData data = 4;</code>
     * @param value the data to set
     * @return this
     */
    public ContentPackageGetDataScRsp setData(
        final ContentPackageDataOuterClass.ContentPackageData value) {
      bitField0_ |= 0x00000002;
      data.copyFrom(value);
      return this;
    }

    @Override
    public ContentPackageGetDataScRsp copyFrom(final ContentPackageGetDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        data.copyFrom(other.data);
      }
      return this;
    }

    @Override
    public ContentPackageGetDataScRsp mergeFrom(final ContentPackageGetDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasData()) {
        getMutableData().mergeFrom(other.data);
      }
      return this;
    }

    @Override
    public ContentPackageGetDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      data.clear();
      return this;
    }

    @Override
    public ContentPackageGetDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      data.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ContentPackageGetDataScRsp)) {
        return false;
      }
      ContentPackageGetDataScRsp other = (ContentPackageGetDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasData() || data.equals(other.data));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(data);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(data);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ContentPackageGetDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // data
            input.readMessage(data);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.data, data);
      }
      output.endObject();
    }

    @Override
    public ContentPackageGetDataScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 3076010: {
            if (input.isAtField(FieldNames.data)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(data);
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
    public ContentPackageGetDataScRsp clone() {
      return new ContentPackageGetDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ContentPackageGetDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ContentPackageGetDataScRsp(), data).checkInitialized();
    }

    public static ContentPackageGetDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageGetDataScRsp(), input).checkInitialized();
    }

    public static ContentPackageGetDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageGetDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ContentPackageGetDataScRsp messages
     */
    public static MessageFactory<ContentPackageGetDataScRsp> getFactory() {
      return ContentPackageGetDataScRspFactory.INSTANCE;
    }

    private enum ContentPackageGetDataScRspFactory implements MessageFactory<ContentPackageGetDataScRsp> {
      INSTANCE;

      @Override
      public ContentPackageGetDataScRsp create() {
        return ContentPackageGetDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName data = FieldName.forField("data");
    }
  }
}
