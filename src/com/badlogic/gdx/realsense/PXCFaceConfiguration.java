/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCFaceConfiguration extends PXCBase {
  private long swigCPtr;

  protected PXCFaceConfiguration(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCFaceConfiguration_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCFaceConfiguration obj) {
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

  static public class DetectionConfiguration {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected DetectionConfiguration(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(DetectionConfiguration obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCFaceConfiguration_DetectionConfiguration(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setIsEnabled(int value) {
      realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_isEnabled_set(swigCPtr, this, value);
    }
  
    public int getIsEnabled() {
      return realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_isEnabled_get(swigCPtr, this);
    }
  
    public void setMaxTrackedFaces(int value) {
      realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_maxTrackedFaces_set(swigCPtr, this, value);
    }
  
    public int getMaxTrackedFaces() {
      return realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_maxTrackedFaces_get(swigCPtr, this);
    }
  
    public void setSmoothingLevel(PXCFaceConfiguration.SmoothingLevelType value) {
      realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_smoothingLevel_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCFaceConfiguration.SmoothingLevelType getSmoothingLevel() {
      return PXCFaceConfiguration.SmoothingLevelType.swigToEnum(realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_smoothingLevel_get(swigCPtr, this));
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCFaceConfiguration_DetectionConfiguration_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public DetectionConfiguration() {
      this(realsenseJNI.new_PXCFaceConfiguration_DetectionConfiguration(), true);
    }
  
  }

  static public class LandmarksConfiguration {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected LandmarksConfiguration(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(LandmarksConfiguration obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCFaceConfiguration_LandmarksConfiguration(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setIsEnabled(int value) {
      realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_isEnabled_set(swigCPtr, this, value);
    }
  
    public int getIsEnabled() {
      return realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_isEnabled_get(swigCPtr, this);
    }
  
    public void setMaxTrackedFaces(int value) {
      realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_maxTrackedFaces_set(swigCPtr, this, value);
    }
  
    public int getMaxTrackedFaces() {
      return realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_maxTrackedFaces_get(swigCPtr, this);
    }
  
    public void setSmoothingLevel(PXCFaceConfiguration.SmoothingLevelType value) {
      realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_smoothingLevel_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCFaceConfiguration.SmoothingLevelType getSmoothingLevel() {
      return PXCFaceConfiguration.SmoothingLevelType.swigToEnum(realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_smoothingLevel_get(swigCPtr, this));
    }
  
    public void setNumLandmarks(int value) {
      realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_numLandmarks_set(swigCPtr, this, value);
    }
  
    public int getNumLandmarks() {
      return realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_numLandmarks_get(swigCPtr, this);
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCFaceConfiguration_LandmarksConfiguration_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public LandmarksConfiguration() {
      this(realsenseJNI.new_PXCFaceConfiguration_LandmarksConfiguration(), true);
    }
  
  }

  static public class PoseConfiguration {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected PoseConfiguration(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PoseConfiguration obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCFaceConfiguration_PoseConfiguration(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setIsEnabled(int value) {
      realsenseJNI.PXCFaceConfiguration_PoseConfiguration_isEnabled_set(swigCPtr, this, value);
    }
  
    public int getIsEnabled() {
      return realsenseJNI.PXCFaceConfiguration_PoseConfiguration_isEnabled_get(swigCPtr, this);
    }
  
    public void setMaxTrackedFaces(int value) {
      realsenseJNI.PXCFaceConfiguration_PoseConfiguration_maxTrackedFaces_set(swigCPtr, this, value);
    }
  
    public int getMaxTrackedFaces() {
      return realsenseJNI.PXCFaceConfiguration_PoseConfiguration_maxTrackedFaces_get(swigCPtr, this);
    }
  
    public void setSmoothingLevel(PXCFaceConfiguration.SmoothingLevelType value) {
      realsenseJNI.PXCFaceConfiguration_PoseConfiguration_smoothingLevel_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCFaceConfiguration.SmoothingLevelType getSmoothingLevel() {
      return PXCFaceConfiguration.SmoothingLevelType.swigToEnum(realsenseJNI.PXCFaceConfiguration_PoseConfiguration_smoothingLevel_get(swigCPtr, this));
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCFaceConfiguration_PoseConfiguration_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCFaceConfiguration_PoseConfiguration_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public PoseConfiguration() {
      this(realsenseJNI.new_PXCFaceConfiguration_PoseConfiguration(), true);
    }
  
  }

  static public class ExpressionsConfiguration {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ExpressionsConfiguration(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ExpressionsConfiguration obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCFaceConfiguration_ExpressionsConfiguration(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
      static public class ExpressionsProperties {
        private long swigCPtr;
        protected boolean swigCMemOwn;
      
        protected ExpressionsProperties(long cPtr, boolean cMemoryOwn) {
          swigCMemOwn = cMemoryOwn;
          swigCPtr = cPtr;
        }
      
        protected static long getCPtr(ExpressionsProperties obj) {
          return (obj == null) ? 0 : obj.swigCPtr;
        }
      
        protected void finalize() {
          delete();
        }
      
        public synchronized void delete() {
          if (swigCPtr != 0) {
            if (swigCMemOwn) {
              swigCMemOwn = false;
              realsenseJNI.delete_PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties(swigCPtr);
            }
            swigCPtr = 0;
          }
        }
      
        public void setIsEnabled(int value) {
          realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties_isEnabled_set(swigCPtr, this, value);
        }
      
        public int getIsEnabled() {
          return realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties_isEnabled_get(swigCPtr, this);
        }
      
        public void setMaxTrackedFaces(int value) {
          realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties_maxTrackedFaces_set(swigCPtr, this, value);
        }
      
        public int getMaxTrackedFaces() {
          return realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties_maxTrackedFaces_get(swigCPtr, this);
        }
      
        public void setReserved(SWIGTYPE_p_int value) {
          realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
        }
      
        public SWIGTYPE_p_int getReserved() {
          long cPtr = realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties_reserved_get(swigCPtr, this);
          return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
        }
      
        public ExpressionsProperties() {
          this(realsenseJNI.new_PXCFaceConfiguration_ExpressionsConfiguration_ExpressionsProperties(), true);
        }
      
      }
  
    public void setProperties(PXCFaceConfiguration.ExpressionsConfiguration.ExpressionsProperties value) {
      realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_properties_set(swigCPtr, this, PXCFaceConfiguration.ExpressionsConfiguration.ExpressionsProperties.getCPtr(value), value);
    }
  
    public PXCFaceConfiguration.ExpressionsConfiguration.ExpressionsProperties getProperties() {
      long cPtr = realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_properties_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCFaceConfiguration.ExpressionsConfiguration.ExpressionsProperties(cPtr, false);
    }
  
    public void Enable() {
      realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_Enable(swigCPtr, this);
    }
  
    public void Disable() {
      realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_Disable(swigCPtr, this);
    }
  
    public int IsEnabled() {
      return realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_IsEnabled(swigCPtr, this);
    }
  
    public void EnableAllExpressions() {
      realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_EnableAllExpressions(swigCPtr, this);
    }
  
    public void DisableAllExpressions() {
      realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_DisableAllExpressions(swigCPtr, this);
    }
  
    public pxcStatus EnableExpression(PXCFaceData.ExpressionsData.FaceExpression expression) {
      return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_EnableExpression(swigCPtr, this, expression.swigValue()));
    }
  
    public void DisableExpression(PXCFaceData.ExpressionsData.FaceExpression expression) {
      realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_DisableExpression(swigCPtr, this, expression.swigValue());
    }
  
    public int IsExpressionEnabled(PXCFaceData.ExpressionsData.FaceExpression expression) {
      return realsenseJNI.PXCFaceConfiguration_ExpressionsConfiguration_IsExpressionEnabled(swigCPtr, this, expression.swigValue());
    }
  
  }

  static public class RecognitionConfiguration {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected RecognitionConfiguration(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(RecognitionConfiguration obj) {
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
  
      static public class RecognitionStorageDesc {
        private long swigCPtr;
        protected boolean swigCMemOwn;
      
        protected RecognitionStorageDesc(long cPtr, boolean cMemoryOwn) {
          swigCMemOwn = cMemoryOwn;
          swigCPtr = cPtr;
        }
      
        protected static long getCPtr(RecognitionStorageDesc obj) {
          return (obj == null) ? 0 : obj.swigCPtr;
        }
      
        protected void finalize() {
          delete();
        }
      
        public synchronized void delete() {
          if (swigCPtr != 0) {
            if (swigCMemOwn) {
              swigCMemOwn = false;
              realsenseJNI.delete_PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc(swigCPtr);
            }
            swigCPtr = 0;
          }
        }
      
        public void setIsPersistent(int value) {
          realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc_isPersistent_set(swigCPtr, this, value);
        }
      
        public int getIsPersistent() {
          return realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc_isPersistent_get(swigCPtr, this);
        }
      
        public void setMaxUsers(int value) {
          realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc_maxUsers_set(swigCPtr, this, value);
        }
      
        public int getMaxUsers() {
          return realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc_maxUsers_get(swigCPtr, this);
        }
      
        public void setReserved(SWIGTYPE_p_int value) {
          realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
        }
      
        public SWIGTYPE_p_int getReserved() {
          long cPtr = realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc_reserved_get(swigCPtr, this);
          return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
        }
      
        public RecognitionStorageDesc() {
          this(realsenseJNI.new_PXCFaceConfiguration_RecognitionConfiguration_RecognitionStorageDesc(), true);
        }
      
      }
  
    public void setStorageDesc(PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc value) {
      realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_storageDesc_set(swigCPtr, this, PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc.getCPtr(value), value);
    }
  
    public PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc getStorageDesc() {
      long cPtr = realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_storageDesc_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc(cPtr, false);
    }
  
      static public class RecognitionProperties {
        private long swigCPtr;
        protected boolean swigCMemOwn;
      
        protected RecognitionProperties(long cPtr, boolean cMemoryOwn) {
          swigCMemOwn = cMemoryOwn;
          swigCPtr = cPtr;
        }
      
        protected static long getCPtr(RecognitionProperties obj) {
          return (obj == null) ? 0 : obj.swigCPtr;
        }
      
        protected void finalize() {
          delete();
        }
      
        public synchronized void delete() {
          if (swigCPtr != 0) {
            if (swigCMemOwn) {
              swigCMemOwn = false;
              realsenseJNI.delete_PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties(swigCPtr);
            }
            swigCPtr = 0;
          }
        }
      
        public void setIsEnabled(int value) {
          realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_isEnabled_set(swigCPtr, this, value);
        }
      
        public int getIsEnabled() {
          return realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_isEnabled_get(swigCPtr, this);
        }
      
        public void setAccuracyThreshold(int value) {
          realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_accuracyThreshold_set(swigCPtr, this, value);
        }
      
        public int getAccuracyThreshold() {
          return realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_accuracyThreshold_get(swigCPtr, this);
        }
      
        public void setRegistrationMode(PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode value) {
          realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_registrationMode_set(swigCPtr, this, value.swigValue());
        }
      
        public PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode getRegistrationMode() {
          return PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode.swigToEnum(realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_registrationMode_get(swigCPtr, this));
        }
      
        public void setReserved(SWIGTYPE_p_int value) {
          realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
        }
      
        public SWIGTYPE_p_int getReserved() {
          long cPtr = realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties_reserved_get(swigCPtr, this);
          return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
        }
      
        public RecognitionProperties() {
          this(realsenseJNI.new_PXCFaceConfiguration_RecognitionConfiguration_RecognitionProperties(), true);
        }
      
      }
  
    public void setProperties(PXCFaceConfiguration.RecognitionConfiguration.RecognitionProperties value) {
      realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_properties_set(swigCPtr, this, PXCFaceConfiguration.RecognitionConfiguration.RecognitionProperties.getCPtr(value), value);
    }
  
    public PXCFaceConfiguration.RecognitionConfiguration.RecognitionProperties getProperties() {
      long cPtr = realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_properties_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCFaceConfiguration.RecognitionConfiguration.RecognitionProperties(cPtr, false);
    }
  
    public void Enable() {
      realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_Enable(swigCPtr, this);
    }
  
    public void Disable() {
      realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_Disable(swigCPtr, this);
    }
  
    public void SetAccuracyThreshold(int threshold) {
      realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_SetAccuracyThreshold(swigCPtr, this, threshold);
    }
  
    public int GetAccuracryThreshold() {
      return realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_GetAccuracryThreshold(swigCPtr, this);
    }
  
    public void SetRegistrationMode(PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode mode) {
      realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_SetRegistrationMode(swigCPtr, this, mode.swigValue());
    }
  
    public PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode GetRegistrationMode() {
      return PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode.swigToEnum(realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_GetRegistrationMode(swigCPtr, this));
    }
  
    public pxcStatus UseStorage(String storageName) {
      return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_UseStorage(swigCPtr, this, storageName));
    }
  
    public pxcStatus QueryActiveStorage(PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc outStorage) {
      return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_QueryActiveStorage(swigCPtr, this, PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc.getCPtr(outStorage), outStorage));
    }
  
    public pxcStatus CreateStorage(String storageName, PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc storageDesc) {
      return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_CreateStorage(swigCPtr, this, storageName, PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc.getCPtr(storageDesc), storageDesc));
    }
  
    public pxcStatus SetStorageDesc(String storageName, PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc storageDesc) {
      return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_SetStorageDesc(swigCPtr, this, storageName, PXCFaceConfiguration.RecognitionConfiguration.RecognitionStorageDesc.getCPtr(storageDesc), storageDesc));
    }
  
    public pxcStatus DeleteStorage(String storageName) {
      return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_DeleteStorage(swigCPtr, this, storageName));
    }
  
    public void SetDatabaseBuffer(SWIGTYPE_p_unsigned_char buffer, int size) {
      realsenseJNI.PXCFaceConfiguration_RecognitionConfiguration_SetDatabaseBuffer(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(buffer), size);
    }
  
    public final static class RecognitionRegistrationMode {
      public final static PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode REGISTRATION_MODE_CONTINUOUS = new PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode("REGISTRATION_MODE_CONTINUOUS");
      public final static PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode REGISTRATION_MODE_ON_DEMAND = new PXCFaceConfiguration.RecognitionConfiguration.RecognitionRegistrationMode("REGISTRATION_MODE_ON_DEMAND");
  
      public final int swigValue() {
        return swigValue;
      }
  
      public String toString() {
        return swigName;
      }
  
      public static RecognitionRegistrationMode swigToEnum(int swigValue) {
        if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
          return swigValues[swigValue];
        for (int i = 0; i < swigValues.length; i++)
          if (swigValues[i].swigValue == swigValue)
            return swigValues[i];
        throw new IllegalArgumentException("No enum " + RecognitionRegistrationMode.class + " with value " + swigValue);
      }
  
      private RecognitionRegistrationMode(String swigName) {
        this.swigName = swigName;
        this.swigValue = swigNext++;
      }
  
      private RecognitionRegistrationMode(String swigName, int swigValue) {
        this.swigName = swigName;
        this.swigValue = swigValue;
        swigNext = swigValue+1;
      }
  
      private RecognitionRegistrationMode(String swigName, RecognitionRegistrationMode swigEnum) {
        this.swigName = swigName;
        this.swigValue = swigEnum.swigValue;
        swigNext = this.swigValue+1;
      }
  
      private static RecognitionRegistrationMode[] swigValues = { REGISTRATION_MODE_CONTINUOUS, REGISTRATION_MODE_ON_DEMAND };
      private static int swigNext = 0;
      private final int swigValue;
      private final String swigName;
    }
  
  }

  public void setDetection(PXCFaceConfiguration.DetectionConfiguration value) {
    realsenseJNI.PXCFaceConfiguration_detection_set(swigCPtr, this, PXCFaceConfiguration.DetectionConfiguration.getCPtr(value), value);
  }

  public PXCFaceConfiguration.DetectionConfiguration getDetection() {
    long cPtr = realsenseJNI.PXCFaceConfiguration_detection_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCFaceConfiguration.DetectionConfiguration(cPtr, false);
  }

  public void setLandmarks(PXCFaceConfiguration.LandmarksConfiguration value) {
    realsenseJNI.PXCFaceConfiguration_landmarks_set(swigCPtr, this, PXCFaceConfiguration.LandmarksConfiguration.getCPtr(value), value);
  }

  public PXCFaceConfiguration.LandmarksConfiguration getLandmarks() {
    long cPtr = realsenseJNI.PXCFaceConfiguration_landmarks_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCFaceConfiguration.LandmarksConfiguration(cPtr, false);
  }

  public void setPose(PXCFaceConfiguration.PoseConfiguration value) {
    realsenseJNI.PXCFaceConfiguration_pose_set(swigCPtr, this, PXCFaceConfiguration.PoseConfiguration.getCPtr(value), value);
  }

  public PXCFaceConfiguration.PoseConfiguration getPose() {
    long cPtr = realsenseJNI.PXCFaceConfiguration_pose_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCFaceConfiguration.PoseConfiguration(cPtr, false);
  }

  public PXCFaceConfiguration.ExpressionsConfiguration QueryExpressions() {
    long cPtr = realsenseJNI.PXCFaceConfiguration_QueryExpressions(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCFaceConfiguration.ExpressionsConfiguration(cPtr, false);
  }

  public void setStrategy(PXCFaceConfiguration.TrackingStrategyType value) {
    realsenseJNI.PXCFaceConfiguration_strategy_set(swigCPtr, this, value.swigValue());
  }

  public PXCFaceConfiguration.TrackingStrategyType getStrategy() {
    return PXCFaceConfiguration.TrackingStrategyType.swigToEnum(realsenseJNI.PXCFaceConfiguration_strategy_get(swigCPtr, this));
  }

  public PXCFaceConfiguration.RecognitionConfiguration QueryRecognition() {
    long cPtr = realsenseJNI.PXCFaceConfiguration_QueryRecognition(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCFaceConfiguration.RecognitionConfiguration(cPtr, false);
  }

  public pxcStatus SetTrackingMode(PXCFaceConfiguration.TrackingModeType trackingMode) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_SetTrackingMode(swigCPtr, this, trackingMode.swigValue()));
  }

  public PXCFaceConfiguration.TrackingModeType GetTrackingMode() {
    return PXCFaceConfiguration.TrackingModeType.swigToEnum(realsenseJNI.PXCFaceConfiguration_GetTrackingMode(swigCPtr, this));
  }

  static public class AlertHandler {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected AlertHandler(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(AlertHandler obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCFaceConfiguration_AlertHandler(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void OnFiredAlert(PXCFaceData.AlertData alertData) {
      realsenseJNI.PXCFaceConfiguration_AlertHandler_OnFiredAlert(swigCPtr, this, PXCFaceData.AlertData.getCPtr(alertData), alertData);
    }
  
  }

  public pxcStatus EnableAlert(PXCFaceData.AlertData.AlertType alertEvent) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_EnableAlert(swigCPtr, this, alertEvent.swigValue()));
  }

  public void EnableAllAlerts() {
    realsenseJNI.PXCFaceConfiguration_EnableAllAlerts(swigCPtr, this);
  }

  public int IsAlertEnabled(PXCFaceData.AlertData.AlertType alertEvent) {
    return realsenseJNI.PXCFaceConfiguration_IsAlertEnabled(swigCPtr, this, alertEvent.swigValue());
  }

  public pxcStatus DisableAlert(PXCFaceData.AlertData.AlertType alertEvent) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_DisableAlert(swigCPtr, this, alertEvent.swigValue()));
  }

  public void DisableAllAlerts() {
    realsenseJNI.PXCFaceConfiguration_DisableAllAlerts(swigCPtr, this);
  }

  public pxcStatus SubscribeAlert(PXCFaceConfiguration.AlertHandler alertHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_SubscribeAlert(swigCPtr, this, PXCFaceConfiguration.AlertHandler.getCPtr(alertHandler), alertHandler));
  }

  public pxcStatus UnsubscribeAlert(PXCFaceConfiguration.AlertHandler alertHandler) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_UnsubscribeAlert(swigCPtr, this, PXCFaceConfiguration.AlertHandler.getCPtr(alertHandler), alertHandler));
  }

  public pxcStatus ApplyChanges() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_ApplyChanges(swigCPtr, this));
  }

  public void RestoreDefaults() {
    realsenseJNI.PXCFaceConfiguration_RestoreDefaults(swigCPtr, this);
  }

  public pxcStatus Update() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCFaceConfiguration_Update(swigCPtr, this));
  }

  public final static class TrackingStrategyType {
    public final static PXCFaceConfiguration.TrackingStrategyType STRATEGY_APPEARANCE_TIME = new PXCFaceConfiguration.TrackingStrategyType("STRATEGY_APPEARANCE_TIME");
    public final static PXCFaceConfiguration.TrackingStrategyType STRATEGY_CLOSEST_TO_FARTHEST = new PXCFaceConfiguration.TrackingStrategyType("STRATEGY_CLOSEST_TO_FARTHEST");
    public final static PXCFaceConfiguration.TrackingStrategyType STRATEGY_FARTHEST_TO_CLOSEST = new PXCFaceConfiguration.TrackingStrategyType("STRATEGY_FARTHEST_TO_CLOSEST");
    public final static PXCFaceConfiguration.TrackingStrategyType STRATEGY_LEFT_TO_RIGHT = new PXCFaceConfiguration.TrackingStrategyType("STRATEGY_LEFT_TO_RIGHT");
    public final static PXCFaceConfiguration.TrackingStrategyType STRATEGY_RIGHT_TO_LEFT = new PXCFaceConfiguration.TrackingStrategyType("STRATEGY_RIGHT_TO_LEFT");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static TrackingStrategyType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + TrackingStrategyType.class + " with value " + swigValue);
    }

    private TrackingStrategyType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private TrackingStrategyType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private TrackingStrategyType(String swigName, TrackingStrategyType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static TrackingStrategyType[] swigValues = { STRATEGY_APPEARANCE_TIME, STRATEGY_CLOSEST_TO_FARTHEST, STRATEGY_FARTHEST_TO_CLOSEST, STRATEGY_LEFT_TO_RIGHT, STRATEGY_RIGHT_TO_LEFT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class SmoothingLevelType {
    public final static PXCFaceConfiguration.SmoothingLevelType SMOOTHING_DISABLED = new PXCFaceConfiguration.SmoothingLevelType("SMOOTHING_DISABLED");
    public final static PXCFaceConfiguration.SmoothingLevelType SMOOTHING_MEDIUM = new PXCFaceConfiguration.SmoothingLevelType("SMOOTHING_MEDIUM");
    public final static PXCFaceConfiguration.SmoothingLevelType SMOOTHING_HIGH = new PXCFaceConfiguration.SmoothingLevelType("SMOOTHING_HIGH");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static SmoothingLevelType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + SmoothingLevelType.class + " with value " + swigValue);
    }

    private SmoothingLevelType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private SmoothingLevelType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private SmoothingLevelType(String swigName, SmoothingLevelType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static SmoothingLevelType[] swigValues = { SMOOTHING_DISABLED, SMOOTHING_MEDIUM, SMOOTHING_HIGH };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class TrackingModeType {
    public final static PXCFaceConfiguration.TrackingModeType FACE_MODE_COLOR = new PXCFaceConfiguration.TrackingModeType("FACE_MODE_COLOR");
    public final static PXCFaceConfiguration.TrackingModeType FACE_MODE_COLOR_PLUS_DEPTH = new PXCFaceConfiguration.TrackingModeType("FACE_MODE_COLOR_PLUS_DEPTH");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static TrackingModeType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + TrackingModeType.class + " with value " + swigValue);
    }

    private TrackingModeType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private TrackingModeType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private TrackingModeType(String swigName, TrackingModeType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static TrackingModeType[] swigValues = { FACE_MODE_COLOR, FACE_MODE_COLOR_PLUS_DEPTH };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
