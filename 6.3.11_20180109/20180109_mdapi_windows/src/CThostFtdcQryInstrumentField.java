/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryInstrumentField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcQryInstrumentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thostmduserapiJNI.CThostFtdcQryInstrumentField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmduserapiJNI.CThostFtdcQryInstrumentField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcQryInstrumentField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcQryInstrumentField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thostmduserapiJNI.CThostFtdcQryInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thostmduserapiJNI.CThostFtdcQryInstrumentField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    thostmduserapiJNI.CThostFtdcQryInstrumentField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return thostmduserapiJNI.CThostFtdcQryInstrumentField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentField() {
    this(thostmduserapiJNI.new_CThostFtdcQryInstrumentField(), true);
  }

}