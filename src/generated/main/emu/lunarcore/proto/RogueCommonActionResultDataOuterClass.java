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

public final class RogueCommonActionResultDataOuterClass {
  /**
   * Protobuf type {@code RogueCommonActionResultData}
   */
  public static final class RogueCommonActionResultData extends ProtoMessage<RogueCommonActionResultData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueCommonMoney remove_item_list = 2;</code>
     */
    private final RogueCommonMoneyOuterClass.RogueCommonMoney removeItemList = RogueCommonMoneyOuterClass.RogueCommonMoney.newInstance();

    /**
     * <code>optional .RogueCommonMoney get_item_list = 6;</code>
     */
    private final RogueCommonMoneyOuterClass.RogueCommonMoney getItemList = RogueCommonMoneyOuterClass.RogueCommonMoney.newInstance();

    /**
     * <pre>
     * EHLDCELKDKB KDGKHHFHFBJ = 1017;
     * AFKGDNPFJAA DHHFCKKDFNJ = 861;
     * FGOIJBNMIEP ONGBGHBJBBF = 217;
     * FBIOOAHFDEM EKMBBHEHEPC = 1386;
     * LPPPBHGHJDF HEIJFDDMMFJ = 265;
     * KOMCCJGJHNM MICOCBNMEAJ = 330;
     * </pre>
     *
     * <code>optional .RogueCommonFormula get_formula_list = 776;</code>
     */
    private final RogueCommonFormulaOuterClass.RogueCommonFormula getFormulaList = RogueCommonFormulaOuterClass.RogueCommonFormula.newInstance();

    /**
     * <code>optional .RogueCommonMiracle get_miracle_list = 1263;</code>
     */
    private final RogueCommonMiracleOuterClass.RogueCommonMiracle getMiracleList = RogueCommonMiracleOuterClass.RogueCommonMiracle.newInstance();

    /**
     * <pre>
     * BANENCLAHFH NKMIJHMBCJE = 2044;
     * JCEGOHOHIGK GACMJKONLPO = 1519;
     * FCKINKMKFOJ KDHCEKHEIEK = 1280;
     * MEPPCFCOCMC OCFHDHJHOLH = 1843;
     * </pre>
     *
     * <code>optional .RogueCommonKeyword get_keyword_list = 1434;</code>
     */
    private final RogueCommonKeywordOuterClass.RogueCommonKeyword getKeywordList = RogueCommonKeywordOuterClass.RogueCommonKeyword.newInstance();

    /**
     * <code>optional .RogueCommonBuff remove_buff_list = 1544;</code>
     */
    private final RogueCommonBuffOuterClass.RogueCommonBuff removeBuffList = RogueCommonBuffOuterClass.RogueCommonBuff.newInstance();

    /**
     * <code>optional .RogueCommonBuff get_buff_list = 1884;</code>
     */
    private final RogueCommonBuffOuterClass.RogueCommonBuff getBuffList = RogueCommonBuffOuterClass.RogueCommonBuff.newInstance();

    private RogueCommonActionResultData() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonActionResultData}
     */
    public static RogueCommonActionResultData newInstance() {
      return new RogueCommonActionResultData();
    }

    public boolean hasResultData() {
      return (((bitField0_ & 0x0000007f)) != 0);
    }

    public RogueCommonActionResultData clearResultData() {
      if (hasResultData()) {
        clearRemoveItemList();
        clearGetItemList();
        clearGetFormulaList();
        clearGetMiracleList();
        clearGetKeywordList();
        clearRemoveBuffList();
        clearGetBuffList();
      }
      return this;
    }

    private void clearResultDataOtherRemoveItemList() {
      if ((((bitField0_ & 0x0000007e)) != 0)) {
        clearGetItemList();
        clearGetFormulaList();
        clearGetMiracleList();
        clearGetKeywordList();
        clearRemoveBuffList();
        clearGetBuffList();
      }
    }

    private void clearResultDataOtherGetItemList() {
      if ((((bitField0_ & 0x0000007d)) != 0)) {
        clearRemoveItemList();
        clearGetFormulaList();
        clearGetMiracleList();
        clearGetKeywordList();
        clearRemoveBuffList();
        clearGetBuffList();
      }
    }

    private void clearResultDataOtherGetFormulaList() {
      if ((((bitField0_ & 0x0000007b)) != 0)) {
        clearRemoveItemList();
        clearGetItemList();
        clearGetMiracleList();
        clearGetKeywordList();
        clearRemoveBuffList();
        clearGetBuffList();
      }
    }

    private void clearResultDataOtherGetMiracleList() {
      if ((((bitField0_ & 0x00000077)) != 0)) {
        clearRemoveItemList();
        clearGetItemList();
        clearGetFormulaList();
        clearGetKeywordList();
        clearRemoveBuffList();
        clearGetBuffList();
      }
    }

    private void clearResultDataOtherGetKeywordList() {
      if ((((bitField0_ & 0x0000006f)) != 0)) {
        clearRemoveItemList();
        clearGetItemList();
        clearGetFormulaList();
        clearGetMiracleList();
        clearRemoveBuffList();
        clearGetBuffList();
      }
    }

    private void clearResultDataOtherRemoveBuffList() {
      if ((((bitField0_ & 0x0000005f)) != 0)) {
        clearRemoveItemList();
        clearGetItemList();
        clearGetFormulaList();
        clearGetMiracleList();
        clearGetKeywordList();
        clearGetBuffList();
      }
    }

    private void clearResultDataOtherGetBuffList() {
      if ((((bitField0_ & 0x0000003f)) != 0)) {
        clearRemoveItemList();
        clearGetItemList();
        clearGetFormulaList();
        clearGetMiracleList();
        clearGetKeywordList();
        clearRemoveBuffList();
      }
    }

    /**
     * <code>optional .RogueCommonMoney remove_item_list = 2;</code>
     * @return whether the removeItemList field is set
     */
    public boolean hasRemoveItemList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueCommonMoney remove_item_list = 2;</code>
     * @return this
     */
    public RogueCommonActionResultData clearRemoveItemList() {
      bitField0_ &= ~0x00000001;
      removeItemList.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonMoney remove_item_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRemoveItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonMoneyOuterClass.RogueCommonMoney getRemoveItemList() {
      return removeItemList;
    }

    /**
     * <code>optional .RogueCommonMoney remove_item_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonMoneyOuterClass.RogueCommonMoney getMutableRemoveItemList() {
      clearResultDataOtherRemoveItemList();
      bitField0_ |= 0x00000001;
      return removeItemList;
    }

    /**
     * <code>optional .RogueCommonMoney remove_item_list = 2;</code>
     * @param value the removeItemList to set
     * @return this
     */
    public RogueCommonActionResultData setRemoveItemList(
        final RogueCommonMoneyOuterClass.RogueCommonMoney value) {
      clearResultDataOtherRemoveItemList();
      bitField0_ |= 0x00000001;
      removeItemList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonMoney get_item_list = 6;</code>
     * @return whether the getItemList field is set
     */
    public boolean hasGetItemList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueCommonMoney get_item_list = 6;</code>
     * @return this
     */
    public RogueCommonActionResultData clearGetItemList() {
      bitField0_ &= ~0x00000002;
      getItemList.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonMoney get_item_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGetItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonMoneyOuterClass.RogueCommonMoney getGetItemList() {
      return getItemList;
    }

    /**
     * <code>optional .RogueCommonMoney get_item_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonMoneyOuterClass.RogueCommonMoney getMutableGetItemList() {
      clearResultDataOtherGetItemList();
      bitField0_ |= 0x00000002;
      return getItemList;
    }

    /**
     * <code>optional .RogueCommonMoney get_item_list = 6;</code>
     * @param value the getItemList to set
     * @return this
     */
    public RogueCommonActionResultData setGetItemList(
        final RogueCommonMoneyOuterClass.RogueCommonMoney value) {
      clearResultDataOtherGetItemList();
      bitField0_ |= 0x00000002;
      getItemList.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * EHLDCELKDKB KDGKHHFHFBJ = 1017;
     * AFKGDNPFJAA DHHFCKKDFNJ = 861;
     * FGOIJBNMIEP ONGBGHBJBBF = 217;
     * FBIOOAHFDEM EKMBBHEHEPC = 1386;
     * LPPPBHGHJDF HEIJFDDMMFJ = 265;
     * KOMCCJGJHNM MICOCBNMEAJ = 330;
     * </pre>
     *
     * <code>optional .RogueCommonFormula get_formula_list = 776;</code>
     * @return whether the getFormulaList field is set
     */
    public boolean hasGetFormulaList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * EHLDCELKDKB KDGKHHFHFBJ = 1017;
     * AFKGDNPFJAA DHHFCKKDFNJ = 861;
     * FGOIJBNMIEP ONGBGHBJBBF = 217;
     * FBIOOAHFDEM EKMBBHEHEPC = 1386;
     * LPPPBHGHJDF HEIJFDDMMFJ = 265;
     * KOMCCJGJHNM MICOCBNMEAJ = 330;
     * </pre>
     *
     * <code>optional .RogueCommonFormula get_formula_list = 776;</code>
     * @return this
     */
    public RogueCommonActionResultData clearGetFormulaList() {
      bitField0_ &= ~0x00000004;
      getFormulaList.clear();
      return this;
    }

    /**
     * <pre>
     * EHLDCELKDKB KDGKHHFHFBJ = 1017;
     * AFKGDNPFJAA DHHFCKKDFNJ = 861;
     * FGOIJBNMIEP ONGBGHBJBBF = 217;
     * FBIOOAHFDEM EKMBBHEHEPC = 1386;
     * LPPPBHGHJDF HEIJFDDMMFJ = 265;
     * KOMCCJGJHNM MICOCBNMEAJ = 330;
     * </pre>
     *
     * <code>optional .RogueCommonFormula get_formula_list = 776;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGetFormulaList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonFormulaOuterClass.RogueCommonFormula getGetFormulaList() {
      return getFormulaList;
    }

    /**
     * <pre>
     * EHLDCELKDKB KDGKHHFHFBJ = 1017;
     * AFKGDNPFJAA DHHFCKKDFNJ = 861;
     * FGOIJBNMIEP ONGBGHBJBBF = 217;
     * FBIOOAHFDEM EKMBBHEHEPC = 1386;
     * LPPPBHGHJDF HEIJFDDMMFJ = 265;
     * KOMCCJGJHNM MICOCBNMEAJ = 330;
     * </pre>
     *
     * <code>optional .RogueCommonFormula get_formula_list = 776;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonFormulaOuterClass.RogueCommonFormula getMutableGetFormulaList() {
      clearResultDataOtherGetFormulaList();
      bitField0_ |= 0x00000004;
      return getFormulaList;
    }

    /**
     * <pre>
     * EHLDCELKDKB KDGKHHFHFBJ = 1017;
     * AFKGDNPFJAA DHHFCKKDFNJ = 861;
     * FGOIJBNMIEP ONGBGHBJBBF = 217;
     * FBIOOAHFDEM EKMBBHEHEPC = 1386;
     * LPPPBHGHJDF HEIJFDDMMFJ = 265;
     * KOMCCJGJHNM MICOCBNMEAJ = 330;
     * </pre>
     *
     * <code>optional .RogueCommonFormula get_formula_list = 776;</code>
     * @param value the getFormulaList to set
     * @return this
     */
    public RogueCommonActionResultData setGetFormulaList(
        final RogueCommonFormulaOuterClass.RogueCommonFormula value) {
      clearResultDataOtherGetFormulaList();
      bitField0_ |= 0x00000004;
      getFormulaList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonMiracle get_miracle_list = 1263;</code>
     * @return whether the getMiracleList field is set
     */
    public boolean hasGetMiracleList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueCommonMiracle get_miracle_list = 1263;</code>
     * @return this
     */
    public RogueCommonActionResultData clearGetMiracleList() {
      bitField0_ &= ~0x00000008;
      getMiracleList.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonMiracle get_miracle_list = 1263;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGetMiracleList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonMiracleOuterClass.RogueCommonMiracle getGetMiracleList() {
      return getMiracleList;
    }

    /**
     * <code>optional .RogueCommonMiracle get_miracle_list = 1263;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonMiracleOuterClass.RogueCommonMiracle getMutableGetMiracleList() {
      clearResultDataOtherGetMiracleList();
      bitField0_ |= 0x00000008;
      return getMiracleList;
    }

    /**
     * <code>optional .RogueCommonMiracle get_miracle_list = 1263;</code>
     * @param value the getMiracleList to set
     * @return this
     */
    public RogueCommonActionResultData setGetMiracleList(
        final RogueCommonMiracleOuterClass.RogueCommonMiracle value) {
      clearResultDataOtherGetMiracleList();
      bitField0_ |= 0x00000008;
      getMiracleList.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * BANENCLAHFH NKMIJHMBCJE = 2044;
     * JCEGOHOHIGK GACMJKONLPO = 1519;
     * FCKINKMKFOJ KDHCEKHEIEK = 1280;
     * MEPPCFCOCMC OCFHDHJHOLH = 1843;
     * </pre>
     *
     * <code>optional .RogueCommonKeyword get_keyword_list = 1434;</code>
     * @return whether the getKeywordList field is set
     */
    public boolean hasGetKeywordList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     * BANENCLAHFH NKMIJHMBCJE = 2044;
     * JCEGOHOHIGK GACMJKONLPO = 1519;
     * FCKINKMKFOJ KDHCEKHEIEK = 1280;
     * MEPPCFCOCMC OCFHDHJHOLH = 1843;
     * </pre>
     *
     * <code>optional .RogueCommonKeyword get_keyword_list = 1434;</code>
     * @return this
     */
    public RogueCommonActionResultData clearGetKeywordList() {
      bitField0_ &= ~0x00000010;
      getKeywordList.clear();
      return this;
    }

    /**
     * <pre>
     * BANENCLAHFH NKMIJHMBCJE = 2044;
     * JCEGOHOHIGK GACMJKONLPO = 1519;
     * FCKINKMKFOJ KDHCEKHEIEK = 1280;
     * MEPPCFCOCMC OCFHDHJHOLH = 1843;
     * </pre>
     *
     * <code>optional .RogueCommonKeyword get_keyword_list = 1434;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGetKeywordList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonKeywordOuterClass.RogueCommonKeyword getGetKeywordList() {
      return getKeywordList;
    }

    /**
     * <pre>
     * BANENCLAHFH NKMIJHMBCJE = 2044;
     * JCEGOHOHIGK GACMJKONLPO = 1519;
     * FCKINKMKFOJ KDHCEKHEIEK = 1280;
     * MEPPCFCOCMC OCFHDHJHOLH = 1843;
     * </pre>
     *
     * <code>optional .RogueCommonKeyword get_keyword_list = 1434;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonKeywordOuterClass.RogueCommonKeyword getMutableGetKeywordList() {
      clearResultDataOtherGetKeywordList();
      bitField0_ |= 0x00000010;
      return getKeywordList;
    }

    /**
     * <pre>
     * BANENCLAHFH NKMIJHMBCJE = 2044;
     * JCEGOHOHIGK GACMJKONLPO = 1519;
     * FCKINKMKFOJ KDHCEKHEIEK = 1280;
     * MEPPCFCOCMC OCFHDHJHOLH = 1843;
     * </pre>
     *
     * <code>optional .RogueCommonKeyword get_keyword_list = 1434;</code>
     * @param value the getKeywordList to set
     * @return this
     */
    public RogueCommonActionResultData setGetKeywordList(
        final RogueCommonKeywordOuterClass.RogueCommonKeyword value) {
      clearResultDataOtherGetKeywordList();
      bitField0_ |= 0x00000010;
      getKeywordList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonBuff remove_buff_list = 1544;</code>
     * @return whether the removeBuffList field is set
     */
    public boolean hasRemoveBuffList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .RogueCommonBuff remove_buff_list = 1544;</code>
     * @return this
     */
    public RogueCommonActionResultData clearRemoveBuffList() {
      bitField0_ &= ~0x00000020;
      removeBuffList.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonBuff remove_buff_list = 1544;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRemoveBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonBuffOuterClass.RogueCommonBuff getRemoveBuffList() {
      return removeBuffList;
    }

    /**
     * <code>optional .RogueCommonBuff remove_buff_list = 1544;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonBuffOuterClass.RogueCommonBuff getMutableRemoveBuffList() {
      clearResultDataOtherRemoveBuffList();
      bitField0_ |= 0x00000020;
      return removeBuffList;
    }

    /**
     * <code>optional .RogueCommonBuff remove_buff_list = 1544;</code>
     * @param value the removeBuffList to set
     * @return this
     */
    public RogueCommonActionResultData setRemoveBuffList(
        final RogueCommonBuffOuterClass.RogueCommonBuff value) {
      clearResultDataOtherRemoveBuffList();
      bitField0_ |= 0x00000020;
      removeBuffList.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonBuff get_buff_list = 1884;</code>
     * @return whether the getBuffList field is set
     */
    public boolean hasGetBuffList() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional .RogueCommonBuff get_buff_list = 1884;</code>
     * @return this
     */
    public RogueCommonActionResultData clearGetBuffList() {
      bitField0_ &= ~0x00000040;
      getBuffList.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonBuff get_buff_list = 1884;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGetBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonBuffOuterClass.RogueCommonBuff getGetBuffList() {
      return getBuffList;
    }

    /**
     * <code>optional .RogueCommonBuff get_buff_list = 1884;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonBuffOuterClass.RogueCommonBuff getMutableGetBuffList() {
      clearResultDataOtherGetBuffList();
      bitField0_ |= 0x00000040;
      return getBuffList;
    }

    /**
     * <code>optional .RogueCommonBuff get_buff_list = 1884;</code>
     * @param value the getBuffList to set
     * @return this
     */
    public RogueCommonActionResultData setGetBuffList(
        final RogueCommonBuffOuterClass.RogueCommonBuff value) {
      clearResultDataOtherGetBuffList();
      bitField0_ |= 0x00000040;
      getBuffList.copyFrom(value);
      return this;
    }

    @Override
    public RogueCommonActionResultData copyFrom(final RogueCommonActionResultData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        removeItemList.copyFrom(other.removeItemList);
        getItemList.copyFrom(other.getItemList);
        getFormulaList.copyFrom(other.getFormulaList);
        getMiracleList.copyFrom(other.getMiracleList);
        getKeywordList.copyFrom(other.getKeywordList);
        removeBuffList.copyFrom(other.removeBuffList);
        getBuffList.copyFrom(other.getBuffList);
      }
      return this;
    }

    @Override
    public RogueCommonActionResultData mergeFrom(final RogueCommonActionResultData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRemoveItemList()) {
        getMutableRemoveItemList().mergeFrom(other.removeItemList);
      }
      if (other.hasGetItemList()) {
        getMutableGetItemList().mergeFrom(other.getItemList);
      }
      if (other.hasGetFormulaList()) {
        getMutableGetFormulaList().mergeFrom(other.getFormulaList);
      }
      if (other.hasGetMiracleList()) {
        getMutableGetMiracleList().mergeFrom(other.getMiracleList);
      }
      if (other.hasGetKeywordList()) {
        getMutableGetKeywordList().mergeFrom(other.getKeywordList);
      }
      if (other.hasRemoveBuffList()) {
        getMutableRemoveBuffList().mergeFrom(other.removeBuffList);
      }
      if (other.hasGetBuffList()) {
        getMutableGetBuffList().mergeFrom(other.getBuffList);
      }
      return this;
    }

    @Override
    public RogueCommonActionResultData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      removeItemList.clear();
      getItemList.clear();
      getFormulaList.clear();
      getMiracleList.clear();
      getKeywordList.clear();
      removeBuffList.clear();
      getBuffList.clear();
      return this;
    }

    @Override
    public RogueCommonActionResultData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      removeItemList.clearQuick();
      getItemList.clearQuick();
      getFormulaList.clearQuick();
      getMiracleList.clearQuick();
      getKeywordList.clearQuick();
      removeBuffList.clearQuick();
      getBuffList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueCommonActionResultData)) {
        return false;
      }
      RogueCommonActionResultData other = (RogueCommonActionResultData) o;
      return bitField0_ == other.bitField0_
        && (!hasRemoveItemList() || removeItemList.equals(other.removeItemList))
        && (!hasGetItemList() || getItemList.equals(other.getItemList))
        && (!hasGetFormulaList() || getFormulaList.equals(other.getFormulaList))
        && (!hasGetMiracleList() || getMiracleList.equals(other.getMiracleList))
        && (!hasGetKeywordList() || getKeywordList.equals(other.getKeywordList))
        && (!hasRemoveBuffList() || removeBuffList.equals(other.removeBuffList))
        && (!hasGetBuffList() || getBuffList.equals(other.getBuffList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(removeItemList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(getItemList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawLittleEndian16((short) 12482);
        output.writeMessageNoTag(getFormulaList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawLittleEndian16((short) 20218);
        output.writeMessageNoTag(getMiracleList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawLittleEndian16((short) 22994);
        output.writeMessageNoTag(getKeywordList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawLittleEndian16((short) 24770);
        output.writeMessageNoTag(removeBuffList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawLittleEndian16((short) 30178);
        output.writeMessageNoTag(getBuffList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(removeItemList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(getItemList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(getFormulaList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(getMiracleList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(getKeywordList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(removeBuffList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(getBuffList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonActionResultData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // removeItemList
            clearResultDataOtherRemoveItemList();
            input.readMessage(removeItemList);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // getItemList
            clearResultDataOtherGetItemList();
            input.readMessage(getItemList);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 6210) {
              break;
            }
          }
          case 6210: {
            // getFormulaList
            clearResultDataOtherGetFormulaList();
            input.readMessage(getFormulaList);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 10106) {
              break;
            }
          }
          case 10106: {
            // getMiracleList
            clearResultDataOtherGetMiracleList();
            input.readMessage(getMiracleList);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 11474) {
              break;
            }
          }
          case 11474: {
            // getKeywordList
            clearResultDataOtherGetKeywordList();
            input.readMessage(getKeywordList);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 12354) {
              break;
            }
          }
          case 12354: {
            // removeBuffList
            clearResultDataOtherRemoveBuffList();
            input.readMessage(removeBuffList);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 15074) {
              break;
            }
          }
          case 15074: {
            // getBuffList
            clearResultDataOtherGetBuffList();
            input.readMessage(getBuffList);
            bitField0_ |= 0x00000040;
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
        output.writeMessage(FieldNames.removeItemList, removeItemList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.getItemList, getItemList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.getFormulaList, getFormulaList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.getMiracleList, getMiracleList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.getKeywordList, getKeywordList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.removeBuffList, removeBuffList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeMessage(FieldNames.getBuffList, getBuffList);
      }
      output.endObject();
    }

    @Override
    public RogueCommonActionResultData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -417171723:
          case -293666737: {
            if (input.isAtField(FieldNames.removeItemList)) {
              if (!input.trySkipNullValue()) {
                clearResultDataOtherRemoveItemList();
                input.readMessage(removeItemList);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1039787065:
          case -1626556255: {
            if (input.isAtField(FieldNames.getItemList)) {
              if (!input.trySkipNullValue()) {
                clearResultDataOtherGetItemList();
                input.readMessage(getItemList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1160157678:
          case 270990880: {
            if (input.isAtField(FieldNames.getFormulaList)) {
              if (!input.trySkipNullValue()) {
                clearResultDataOtherGetFormulaList();
                input.readMessage(getFormulaList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 120123257:
          case -1905305099: {
            if (input.isAtField(FieldNames.getMiracleList)) {
              if (!input.trySkipNullValue()) {
                clearResultDataOtherGetMiracleList();
                input.readMessage(getMiracleList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1939051279:
          case -1315206275: {
            if (input.isAtField(FieldNames.getKeywordList)) {
              if (!input.trySkipNullValue()) {
                clearResultDataOtherGetKeywordList();
                input.readMessage(getKeywordList);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1177726005:
          case 1903522575: {
            if (input.isAtField(FieldNames.removeBuffList)) {
              if (!input.trySkipNullValue()) {
                clearResultDataOtherRemoveBuffList();
                input.readMessage(removeBuffList);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 555110663:
          case 570633057: {
            if (input.isAtField(FieldNames.getBuffList)) {
              if (!input.trySkipNullValue()) {
                clearResultDataOtherGetBuffList();
                input.readMessage(getBuffList);
                bitField0_ |= 0x00000040;
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
    public RogueCommonActionResultData clone() {
      return new RogueCommonActionResultData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonActionResultData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonActionResultData(), data).checkInitialized();
    }

    public static RogueCommonActionResultData parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RogueCommonActionResultData(), input).checkInitialized();
    }

    public static RogueCommonActionResultData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonActionResultData(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonActionResultData messages
     */
    public static MessageFactory<RogueCommonActionResultData> getFactory() {
      return RogueCommonActionResultDataFactory.INSTANCE;
    }

    private enum RogueCommonActionResultDataFactory implements MessageFactory<RogueCommonActionResultData> {
      INSTANCE;

      @Override
      public RogueCommonActionResultData create() {
        return RogueCommonActionResultData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName removeItemList = FieldName.forField("removeItemList", "remove_item_list");

      static final FieldName getItemList = FieldName.forField("getItemList", "get_item_list");

      static final FieldName getFormulaList = FieldName.forField("getFormulaList", "get_formula_list");

      static final FieldName getMiracleList = FieldName.forField("getMiracleList", "get_miracle_list");

      static final FieldName getKeywordList = FieldName.forField("getKeywordList", "get_keyword_list");

      static final FieldName removeBuffList = FieldName.forField("removeBuffList", "remove_buff_list");

      static final FieldName getBuffList = FieldName.forField("getBuffList", "get_buff_list");
    }
  }
}
