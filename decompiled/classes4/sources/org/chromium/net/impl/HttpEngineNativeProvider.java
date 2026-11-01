package org.chromium.net.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class HttpEngineNativeProvider extends org.chromium.net.CronetProvider {
    public HttpEngineNativeProvider(android.content.Context context) {
        super(context);
    }

    public static boolean a() {
        return android.os.ext.SdkExtensions.getExtensionVersion(31) >= 7;
    }

    @Override // org.chromium.net.CronetProvider
    public final org.chromium.net.CronetEngine$Builder createBuilder() {
        new xkn("HttpEngineNativeProvider#createBuilder", 3, (byte[]) null);
        try {
            org.chromium.net.ExperimentalCronetEngine.Builder builder = new org.chromium.net.ExperimentalCronetEngine.Builder(new defpackage.apus(this.mContext, new android.net.http.HttpEngine.Builder(this.mContext)));
            android.os.Trace.endSection();
            return builder;
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetProvider
    public final java.lang.String getName() {
        return org.chromium.net.CronetProvider.PROVIDER_NAME_HTTPENGINE_NATIVE;
    }

    @Override // org.chromium.net.CronetProvider
    public final java.lang.String getVersion() {
        return android.net.http.HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return a();
    }
}
