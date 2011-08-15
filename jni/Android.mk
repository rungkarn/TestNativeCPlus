LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

OPENCV_CAMERA_MODULES:=off
include jni/includeOpenCV.mk
ifeq ("$(wildcard $(OPENCV_MK_PATH))","")
	#try to load OpenCV.mk from default install location
	include $(TOOLCHAIN_PREBUILT_ROOT)/user/share/OpenCV/OpenCV.mk
else
	include $(OPENCV_MK_PATH)
endif

LOCAL_MODULE := match
LOCAL_SRC_FILES := match.cpp
include $(BUILD_SHARED_LIBRARY)
