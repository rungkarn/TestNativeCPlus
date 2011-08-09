LOCAL_PATH := $(call my-dir)
#include $(CLEAR_VARS)
#LOCAL_MODULE := fib
#LOCAL_SRC_FILES := fib.c
#nclude $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := match
LOCAL_SRC_FILES := match.cpp
include $(BUILD_SHARED_LIBRARY)
