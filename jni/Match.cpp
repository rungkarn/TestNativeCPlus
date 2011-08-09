#include <stdio.h>
#include <assert.h>
#include <jni.h>
#include <string.h>
#include "org_example_hello_MatchLib.h"

JNIEXPORT jstring JNICALL Java_org_example_hello_MatchLib_matching
  (JNIEnv *env, jclass obj, jstring strFileName)
  {
  	// convert Java string to UTF-8
    const char *pstr =   env->GetStringUTFChars(strFileName, NULL);
    assert(NULL != pstr);
    if(pstr == NULL)
    {
        return NULL;
    }
    printf("%s",pstr);
    env->ReleaseStringUTFChars(strFileName,pstr);
  	char buf[] = "rungkarn siricharoenchai";
  	return env->NewStringUTF(buf);
    
  }
/*JNIEXPORT jlong JNICALL  Java_org_example_hello_MatchLib_test
(JNIEnv *env, jclass obj, jint n) {
return 1;
}*/