/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCPointF32 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PXCPointF32(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCPointF32 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        realsenseJNI.delete_PXCPointF32(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    realsenseJNI.PXCPointF32_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return realsenseJNI.PXCPointF32_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    realsenseJNI.PXCPointF32_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return realsenseJNI.PXCPointF32_y_get(swigCPtr, this);
  }

  public PXCPointF32() {
    this(realsenseJNI.new_PXCPointF32(), true);
  }

}
