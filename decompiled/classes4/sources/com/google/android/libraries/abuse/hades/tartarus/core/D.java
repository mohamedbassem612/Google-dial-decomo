package com.google.android.libraries.abuse.hades.tartarus.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
@com.google.android.apps.common.proguard.UsedByNative
public final class D {
    public static final com.google.android.libraries.abuse.hades.tartarus.core.D a = new com.google.android.libraries.abuse.hades.tartarus.core.D();

    private D() {
    }

    @com.google.android.apps.common.proguard.UsedByNative
    private final native void l();

    public final void a() {
        java.lang.Object objAe;
        try {
            java.lang.System.loadLibrary("tartarus_core");
        } catch (java.lang.UnsatisfiedLinkError e) {
            try {
                objAe = java.lang.Class.forName("android.app.Application", false, null);
            } catch (java.lang.Throwable th) {
                objAe = aooc.ae(th);
            }
            if (aoiw.d(objAe)) {
                throw e;
            }
            l();
        }
    }
}
