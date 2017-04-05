#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_android_pirometr_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Pirometr";
    return env->NewStringUTF(hello.c_str());
}
