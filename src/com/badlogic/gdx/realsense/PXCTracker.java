/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCTracker extends PXCBase {
  private long swigCPtr;

  protected PXCTracker(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCTracker_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCTracker obj) {
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
    super.delete();
  }

  static public class TrackingValues {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected TrackingValues(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(TrackingValues obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCTracker_TrackingValues(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setState(PXCTracker.ETrackingState value) {
      realsenseJNI.PXCTracker_TrackingValues_state_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCTracker.ETrackingState getState() {
      return PXCTracker.ETrackingState.swigToEnum(realsenseJNI.PXCTracker_TrackingValues_state_get(swigCPtr, this));
    }
  
    public void setTranslation(PXCPoint3DF32 value) {
      realsenseJNI.PXCTracker_TrackingValues_translation_set(swigCPtr, this, PXCPoint3DF32.getCPtr(value), value);
    }
  
    public PXCPoint3DF32 getTranslation() {
      long cPtr = realsenseJNI.PXCTracker_TrackingValues_translation_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCPoint3DF32(cPtr, false);
    }
  
    public void setRotation(PXCPoint4DF32 value) {
      realsenseJNI.PXCTracker_TrackingValues_rotation_set(swigCPtr, this, PXCPoint4DF32.getCPtr(value), value);
    }
  
    public PXCPoint4DF32 getRotation() {
      long cPtr = realsenseJNI.PXCTracker_TrackingValues_rotation_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCPoint4DF32(cPtr, false);
    }
  
    public void setQuality(float value) {
      realsenseJNI.PXCTracker_TrackingValues_quality_set(swigCPtr, this, value);
    }
  
    public float getQuality() {
      return realsenseJNI.PXCTracker_TrackingValues_quality_get(swigCPtr, this);
    }
  
    public void setTimeElapsed(double value) {
      realsenseJNI.PXCTracker_TrackingValues_timeElapsed_set(swigCPtr, this, value);
    }
  
    public double getTimeElapsed() {
      return realsenseJNI.PXCTracker_TrackingValues_timeElapsed_get(swigCPtr, this);
    }
  
    public void setTrackingTimeMs(double value) {
      realsenseJNI.PXCTracker_TrackingValues_trackingTimeMs_set(swigCPtr, this, value);
    }
  
    public double getTrackingTimeMs() {
      return realsenseJNI.PXCTracker_TrackingValues_trackingTimeMs_get(swigCPtr, this);
    }
  
    public void setCosID(int value) {
      realsenseJNI.PXCTracker_TrackingValues_cosID_set(swigCPtr, this, value);
    }
  
    public int getCosID() {
      return realsenseJNI.PXCTracker_TrackingValues_cosID_get(swigCPtr, this);
    }
  
    public void setTargetName(SWIGTYPE_p_wchar_t value) {
      realsenseJNI.PXCTracker_TrackingValues_targetName_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_wchar_t getTargetName() {
      long cPtr = realsenseJNI.PXCTracker_TrackingValues_targetName_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
    }
  
    public void setAdditionalValues(SWIGTYPE_p_wchar_t value) {
      realsenseJNI.PXCTracker_TrackingValues_additionalValues_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_wchar_t getAdditionalValues() {
      long cPtr = realsenseJNI.PXCTracker_TrackingValues_additionalValues_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
    }
  
    public void setSensor(SWIGTYPE_p_wchar_t value) {
      realsenseJNI.PXCTracker_TrackingValues_sensor_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_wchar_t getSensor() {
      long cPtr = realsenseJNI.PXCTracker_TrackingValues_sensor_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCTracker_TrackingValues_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCTracker_TrackingValues_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public TrackingValues() {
      this(realsenseJNI.new_PXCTracker_TrackingValues(), true);
    }
  
  }

  public pxcStatus SetCameraParameters(String filename) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_SetCameraParameters(swigCPtr, this, filename));
  }

  public pxcStatus Set2DTrackFromFile(String filename, SWIGTYPE_p_int cosID, float widthMM, float heightMM, float qualityThreshold) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_Set2DTrackFromFile__SWIG_0(swigCPtr, this, filename, SWIGTYPE_p_int.getCPtr(cosID), widthMM, heightMM, qualityThreshold));
  }

  public pxcStatus Set2DTrackFromFile(String filename, SWIGTYPE_p_int cosID) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_Set2DTrackFromFile__SWIG_1(swigCPtr, this, filename, SWIGTYPE_p_int.getCPtr(cosID)));
  }

  public pxcStatus Set2DTrackFromImage(PXCImage image, SWIGTYPE_p_int cosID, float widthMM, float heightMM, float qualityThreshold) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_Set2DTrackFromImage__SWIG_0(swigCPtr, this, PXCImage.getCPtr(image), image, SWIGTYPE_p_int.getCPtr(cosID), widthMM, heightMM, qualityThreshold));
  }

  public pxcStatus Set2DTrackFromImage(PXCImage image, SWIGTYPE_p_int cosID) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_Set2DTrackFromImage__SWIG_1(swigCPtr, this, PXCImage.getCPtr(image), image, SWIGTYPE_p_int.getCPtr(cosID)));
  }

  public pxcStatus Set3DTrack(String filename, SWIGTYPE_p_int firstCosID, SWIGTYPE_p_int lastCosID) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_Set3DTrack(swigCPtr, this, filename, SWIGTYPE_p_int.getCPtr(firstCosID), SWIGTYPE_p_int.getCPtr(lastCosID)));
  }

  public pxcStatus Set3DInstantTrack(int egoMotion) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_Set3DInstantTrack__SWIG_0(swigCPtr, this, egoMotion));
  }

  public pxcStatus Set3DInstantTrack() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_Set3DInstantTrack__SWIG_1(swigCPtr, this));
  }

  public int QueryNumberTrackingValues() {
    return realsenseJNI.PXCTracker_QueryNumberTrackingValues(swigCPtr, this);
  }

  public pxcStatus QueryAllTrackingValues(PXCTracker.TrackingValues trackingValues) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_QueryAllTrackingValues(swigCPtr, this, PXCTracker.TrackingValues.getCPtr(trackingValues), trackingValues));
  }

  public pxcStatus QueryTrackingValues(int cosID, PXCTracker.TrackingValues outTrackingValues) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCTracker_QueryTrackingValues(swigCPtr, this, cosID, PXCTracker.TrackingValues.getCPtr(outTrackingValues), outTrackingValues));
  }

  public final static class ETrackingState {
    public final static PXCTracker.ETrackingState ETS_UNKNOWN = new PXCTracker.ETrackingState("ETS_UNKNOWN", realsenseJNI.PXCTracker_ETS_UNKNOWN_get());
    public final static PXCTracker.ETrackingState ETS_NOT_TRACKING = new PXCTracker.ETrackingState("ETS_NOT_TRACKING", realsenseJNI.PXCTracker_ETS_NOT_TRACKING_get());
    public final static PXCTracker.ETrackingState ETS_TRACKING = new PXCTracker.ETrackingState("ETS_TRACKING", realsenseJNI.PXCTracker_ETS_TRACKING_get());
    public final static PXCTracker.ETrackingState ETS_LOST = new PXCTracker.ETrackingState("ETS_LOST", realsenseJNI.PXCTracker_ETS_LOST_get());
    public final static PXCTracker.ETrackingState ETS_FOUND = new PXCTracker.ETrackingState("ETS_FOUND", realsenseJNI.PXCTracker_ETS_FOUND_get());
    public final static PXCTracker.ETrackingState ETS_EXTRAPOLATED = new PXCTracker.ETrackingState("ETS_EXTRAPOLATED", realsenseJNI.PXCTracker_ETS_EXTRAPOLATED_get());
    public final static PXCTracker.ETrackingState ETS_INITIALIZED = new PXCTracker.ETrackingState("ETS_INITIALIZED", realsenseJNI.PXCTracker_ETS_INITIALIZED_get());
    public final static PXCTracker.ETrackingState ETS_REGISTERED = new PXCTracker.ETrackingState("ETS_REGISTERED", realsenseJNI.PXCTracker_ETS_REGISTERED_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ETrackingState swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ETrackingState.class + " with value " + swigValue);
    }

    private ETrackingState(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ETrackingState(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ETrackingState(String swigName, ETrackingState swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ETrackingState[] swigValues = { ETS_UNKNOWN, ETS_NOT_TRACKING, ETS_TRACKING, ETS_LOST, ETS_FOUND, ETS_EXTRAPOLATED, ETS_INITIALIZED, ETS_REGISTERED };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
