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

public final class CellInfoOuterClass {
  /**
   * Protobuf type {@code CellInfo}
   */
  public static final class CellInfo extends ProtoMessage<CellInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 FGEOEOPLMCP = 5;</code>
     */
    private int fGEOEOPLMCP;

    /**
     * <code>optional uint32 start_cell_id = 7;</code>
     */
    private int startCellId;

    /**
     * <code>optional uint32 EPOELFJDPNI = 9;</code>
     */
    private int ePOELFJDPNI;

    /**
     * <code>optional uint32 end_cell_id = 10;</code>
     */
    private int endCellId;

    /**
     * <code>repeated .ChessRogueCell cell_list = 14;</code>
     */
    private final RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> cellList = RepeatedMessage.newEmptyInstance(ChessRogueCellOuterClass.ChessRogueCell.getFactory());

    private CellInfo() {
    }

    /**
     * @return a new empty instance of {@code CellInfo}
     */
    public static CellInfo newInstance() {
      return new CellInfo();
    }

    /**
     * <code>optional uint32 FGEOEOPLMCP = 5;</code>
     * @return whether the fGEOEOPLMCP field is set
     */
    public boolean hasFGEOEOPLMCP() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 FGEOEOPLMCP = 5;</code>
     * @return this
     */
    public CellInfo clearFGEOEOPLMCP() {
      bitField0_ &= ~0x00000001;
      fGEOEOPLMCP = 0;
      return this;
    }

    /**
     * <code>optional uint32 FGEOEOPLMCP = 5;</code>
     * @return the fGEOEOPLMCP
     */
    public int getFGEOEOPLMCP() {
      return fGEOEOPLMCP;
    }

    /**
     * <code>optional uint32 FGEOEOPLMCP = 5;</code>
     * @param value the fGEOEOPLMCP to set
     * @return this
     */
    public CellInfo setFGEOEOPLMCP(final int value) {
      bitField0_ |= 0x00000001;
      fGEOEOPLMCP = value;
      return this;
    }

    /**
     * <code>optional uint32 start_cell_id = 7;</code>
     * @return whether the startCellId field is set
     */
    public boolean hasStartCellId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 start_cell_id = 7;</code>
     * @return this
     */
    public CellInfo clearStartCellId() {
      bitField0_ &= ~0x00000002;
      startCellId = 0;
      return this;
    }

    /**
     * <code>optional uint32 start_cell_id = 7;</code>
     * @return the startCellId
     */
    public int getStartCellId() {
      return startCellId;
    }

    /**
     * <code>optional uint32 start_cell_id = 7;</code>
     * @param value the startCellId to set
     * @return this
     */
    public CellInfo setStartCellId(final int value) {
      bitField0_ |= 0x00000002;
      startCellId = value;
      return this;
    }

    /**
     * <code>optional uint32 EPOELFJDPNI = 9;</code>
     * @return whether the ePOELFJDPNI field is set
     */
    public boolean hasEPOELFJDPNI() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 EPOELFJDPNI = 9;</code>
     * @return this
     */
    public CellInfo clearEPOELFJDPNI() {
      bitField0_ &= ~0x00000004;
      ePOELFJDPNI = 0;
      return this;
    }

    /**
     * <code>optional uint32 EPOELFJDPNI = 9;</code>
     * @return the ePOELFJDPNI
     */
    public int getEPOELFJDPNI() {
      return ePOELFJDPNI;
    }

    /**
     * <code>optional uint32 EPOELFJDPNI = 9;</code>
     * @param value the ePOELFJDPNI to set
     * @return this
     */
    public CellInfo setEPOELFJDPNI(final int value) {
      bitField0_ |= 0x00000004;
      ePOELFJDPNI = value;
      return this;
    }

    /**
     * <code>optional uint32 end_cell_id = 10;</code>
     * @return whether the endCellId field is set
     */
    public boolean hasEndCellId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 end_cell_id = 10;</code>
     * @return this
     */
    public CellInfo clearEndCellId() {
      bitField0_ &= ~0x00000008;
      endCellId = 0;
      return this;
    }

    /**
     * <code>optional uint32 end_cell_id = 10;</code>
     * @return the endCellId
     */
    public int getEndCellId() {
      return endCellId;
    }

    /**
     * <code>optional uint32 end_cell_id = 10;</code>
     * @param value the endCellId to set
     * @return this
     */
    public CellInfo setEndCellId(final int value) {
      bitField0_ |= 0x00000008;
      endCellId = value;
      return this;
    }

    /**
     * <code>repeated .ChessRogueCell cell_list = 14;</code>
     * @return whether the cellList field is set
     */
    public boolean hasCellList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated .ChessRogueCell cell_list = 14;</code>
     * @return this
     */
    public CellInfo clearCellList() {
      bitField0_ &= ~0x00000010;
      cellList.clear();
      return this;
    }

    /**
     * <code>repeated .ChessRogueCell cell_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCellList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> getCellList() {
      return cellList;
    }

    /**
     * <code>repeated .ChessRogueCell cell_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> getMutableCellList() {
      bitField0_ |= 0x00000010;
      return cellList;
    }

    /**
     * <code>repeated .ChessRogueCell cell_list = 14;</code>
     * @param value the cellList to add
     * @return this
     */
    public CellInfo addCellList(final ChessRogueCellOuterClass.ChessRogueCell value) {
      bitField0_ |= 0x00000010;
      cellList.add(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueCell cell_list = 14;</code>
     * @param values the cellList to add
     * @return this
     */
    public CellInfo addAllCellList(final ChessRogueCellOuterClass.ChessRogueCell... values) {
      bitField0_ |= 0x00000010;
      cellList.addAll(values);
      return this;
    }

    @Override
    public CellInfo copyFrom(final CellInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        fGEOEOPLMCP = other.fGEOEOPLMCP;
        startCellId = other.startCellId;
        ePOELFJDPNI = other.ePOELFJDPNI;
        endCellId = other.endCellId;
        cellList.copyFrom(other.cellList);
      }
      return this;
    }

    @Override
    public CellInfo mergeFrom(final CellInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFGEOEOPLMCP()) {
        setFGEOEOPLMCP(other.fGEOEOPLMCP);
      }
      if (other.hasStartCellId()) {
        setStartCellId(other.startCellId);
      }
      if (other.hasEPOELFJDPNI()) {
        setEPOELFJDPNI(other.ePOELFJDPNI);
      }
      if (other.hasEndCellId()) {
        setEndCellId(other.endCellId);
      }
      if (other.hasCellList()) {
        getMutableCellList().addAll(other.cellList);
      }
      return this;
    }

    @Override
    public CellInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      fGEOEOPLMCP = 0;
      startCellId = 0;
      ePOELFJDPNI = 0;
      endCellId = 0;
      cellList.clear();
      return this;
    }

    @Override
    public CellInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      cellList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof CellInfo)) {
        return false;
      }
      CellInfo other = (CellInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasFGEOEOPLMCP() || fGEOEOPLMCP == other.fGEOEOPLMCP)
        && (!hasStartCellId() || startCellId == other.startCellId)
        && (!hasEPOELFJDPNI() || ePOELFJDPNI == other.ePOELFJDPNI)
        && (!hasEndCellId() || endCellId == other.endCellId)
        && (!hasCellList() || cellList.equals(other.cellList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(fGEOEOPLMCP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(startCellId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(ePOELFJDPNI);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(endCellId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < cellList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(cellList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(fGEOEOPLMCP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(startCellId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(ePOELFJDPNI);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(endCellId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * cellList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(cellList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public CellInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // fGEOEOPLMCP
            fGEOEOPLMCP = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // startCellId
            startCellId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // ePOELFJDPNI
            ePOELFJDPNI = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // endCellId
            endCellId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // cellList
            tag = input.readRepeatedMessage(cellList, tag);
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.fGEOEOPLMCP, fGEOEOPLMCP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.startCellId, startCellId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.ePOELFJDPNI, ePOELFJDPNI);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.endCellId, endCellId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.cellList, cellList);
      }
      output.endObject();
    }

    @Override
    public CellInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1228792841: {
            if (input.isAtField(FieldNames.fGEOEOPLMCP)) {
              if (!input.trySkipNullValue()) {
                fGEOEOPLMCP = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1956716831:
          case -1211122117: {
            if (input.isAtField(FieldNames.startCellId)) {
              if (!input.trySkipNullValue()) {
                startCellId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1768332918: {
            if (input.isAtField(FieldNames.ePOELFJDPNI)) {
              if (!input.trySkipNullValue()) {
                ePOELFJDPNI = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1137108696:
          case 1419442612: {
            if (input.isAtField(FieldNames.endCellId)) {
              if (!input.trySkipNullValue()) {
                endCellId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -917820128:
          case 1629973851: {
            if (input.isAtField(FieldNames.cellList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(cellList);
                bitField0_ |= 0x00000010;
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
    public CellInfo clone() {
      return new CellInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static CellInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new CellInfo(), data).checkInitialized();
    }

    public static CellInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new CellInfo(), input).checkInitialized();
    }

    public static CellInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new CellInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating CellInfo messages
     */
    public static MessageFactory<CellInfo> getFactory() {
      return CellInfoFactory.INSTANCE;
    }

    private enum CellInfoFactory implements MessageFactory<CellInfo> {
      INSTANCE;

      @Override
      public CellInfo create() {
        return CellInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName fGEOEOPLMCP = FieldName.forField("FGEOEOPLMCP");

      static final FieldName startCellId = FieldName.forField("startCellId", "start_cell_id");

      static final FieldName ePOELFJDPNI = FieldName.forField("EPOELFJDPNI");

      static final FieldName endCellId = FieldName.forField("endCellId", "end_cell_id");

      static final FieldName cellList = FieldName.forField("cellList", "cell_list");
    }
  }
}
