/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcPositionProfitAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcPositionProfitAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcPositionProfitAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcPositionProfitAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_AccountID_get(swigCPtr, this);
  }

  public void setAlgorithm(char value) {
    thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_Algorithm_set(swigCPtr, this, value);
  }

  public char getAlgorithm() {
    return thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_Algorithm_get(swigCPtr, this);
  }

  public void setMemo(String value) {
    thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_Memo_set(swigCPtr, this, value);
  }

  public String getMemo() {
    return thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_Memo_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcPositionProfitAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcPositionProfitAlgorithmField() {
    this(thostmduserapiJNI.new_CThostFtdcPositionProfitAlgorithmField(), true);
  }

}