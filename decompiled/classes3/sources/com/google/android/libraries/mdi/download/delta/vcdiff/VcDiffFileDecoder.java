package com.google.android.libraries.mdi.download.delta.vcdiff;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class VcDiffFileDecoder {
    public static final boolean a = b();

    public static boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!a) {
            throw new java.lang.IllegalStateException("Native vcdiff library failed to initialize");
        }
        try {
            return nativeDecoder(str, str2, str3);
        } catch (java.lang.UnsatisfiedLinkError e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static boolean b() {
        try {
            android.util.Log.d("VcDiffFileDecoder", "Start to load vcdiffjni.so");
            java.lang.System.loadLibrary("vcdiffjni");
            return true;
        } catch (java.lang.SecurityException | java.lang.UnsatisfiedLinkError e) {
            android.util.Log.e("VcDiffFileDecoder", "Unable to load vcdiffjni.so", e);
            return false;
        }
    }

    private static native boolean nativeDecoder(java.lang.String str, java.lang.String str2, java.lang.String str3);
}
