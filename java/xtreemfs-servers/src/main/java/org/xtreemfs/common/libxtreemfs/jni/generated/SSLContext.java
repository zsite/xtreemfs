/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xtreemfs.common.libxtreemfs.jni.generated;

public class SSLContext {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SSLContext(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SSLContext obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public enum method {
    tlsv1(6),
    tlsv1_client,
    tlsv1_server,
    sslv23,
    sslv23_client,
    sslv23_server,
    tlsv11,
    tlsv11_client,
    tlsv11_server,
    tlsv12,
    tlsv12_client,
    tlsv12_server;

    public final int swigValue() {
      return swigValue;
    }

    public static method swigToEnum(int swigValue) {
      method[] swigValues = method.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (method swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + method.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private method() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private method(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private method(method swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum file_format {
    asn1,
    pem;

    public final int swigValue() {
      return swigValue;
    }

    public static file_format swigToEnum(int swigValue) {
      file_format[] swigValues = file_format.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (file_format swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + file_format.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private file_format() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private file_format(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private file_format(file_format swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum password_purpose {
    for_reading,
    for_writing;

    public final int swigValue() {
      return swigValue;
    }

    public static password_purpose swigToEnum(int swigValue) {
      password_purpose[] swigValues = password_purpose.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (password_purpose swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + password_purpose.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private password_purpose() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private password_purpose(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private password_purpose(password_purpose swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
