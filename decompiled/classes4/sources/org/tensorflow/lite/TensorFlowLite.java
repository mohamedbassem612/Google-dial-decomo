package org.tensorflow.lite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class TensorFlowLite {
    private static final java.lang.String[][] b;
    private static final java.lang.Throwable c;
    private static final java.util.concurrent.atomic.AtomicBoolean[] e;
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(org.tensorflow.lite.TensorFlowLite.class.getName());
    private static volatile boolean d = false;

    static {
        int i = 0;
        java.lang.String[][] strArr = {new java.lang.String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new java.lang.String[]{"tensorflowlite_jni_gms_client"}};
        b = strArr;
        java.lang.UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i2 = 0; i2 < 2; i2++) {
            for (java.lang.String str : strArr[i2]) {
                try {
                    java.lang.System.loadLibrary(str);
                    a.logp(java.util.logging.Level.INFO, "org.tensorflow.lite.TensorFlowLite", "<clinit>", a.bx(str, "Loaded native library: "));
                    break;
                } catch (java.lang.UnsatisfiedLinkError e2) {
                    a.logp(java.util.logging.Level.INFO, "org.tensorflow.lite.TensorFlowLite", "<clinit>", "Didn't load native library: ".concat(java.lang.String.valueOf(str)));
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e2;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e2);
                    }
                }
            }
        }
        c = unsatisfiedLinkError;
        a.M();
        e = new java.util.concurrent.atomic.AtomicBoolean[3];
        while (true) {
            a.M();
            if (i >= 3) {
                return;
            }
            e[i] = new java.util.concurrent.atomic.AtomicBoolean();
            i++;
        }
    }

    private TensorFlowLite() {
    }

    public static void a() {
        if (d) {
            return;
        }
        try {
            nativeDoNothing();
            d = true;
        } catch (java.lang.UnsatisfiedLinkError e2) {
            java.lang.Throwable th = c;
            if (th == null) {
                th = e2;
            }
            java.lang.UnsatisfiedLinkError unsatisfiedLinkError = new java.lang.UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  ".concat(th.toString()));
            unsatisfiedLinkError.initCause(e2);
            throw unsatisfiedLinkError;
        }
    }

    private static native void nativeDoNothing();
}
