package com.google.android.gms.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class HttpEngineProviderSingleton {
    private static final java.lang.String TAG = "com.google.android.gms.net.HttpEngineProviderSingleton";
    private static com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton;
    private org.chromium.net.CronetProvider httpEngineProvider;

    private HttpEngineProviderSingleton(android.content.Context context) {
        try {
            if (shouldOverrideWithHttpEngine(context)) {
                org.chromium.net.CronetProvider cronetProvider = (org.chromium.net.CronetProvider) java.lang.Class.forName("org.chromium.net.impl.HttpEngineNativeProvider").asSubclass(org.chromium.net.CronetProvider.class).getConstructor(android.content.Context.class).newInstance(context);
                if (cronetProvider.isEnabled()) {
                    this.httpEngineProvider = cronetProvider;
                }
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.v(TAG, "HttpEngine is not available", th);
        }
    }

    public static synchronized com.google.android.gms.net.HttpEngineProviderSingleton getInstance(android.content.Context context) {
        com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton2;
        httpEngineProviderSingleton2 = httpEngineProviderSingleton;
        if (httpEngineProviderSingleton2 == null) {
            httpEngineProviderSingleton2 = new com.google.android.gms.net.HttpEngineProviderSingleton(context);
            httpEngineProviderSingleton = httpEngineProviderSingleton2;
        }
        return httpEngineProviderSingleton2;
    }

    private boolean getReflectionValueAsBool(java.lang.Object obj) {
        return obj != null && ((java.lang.Boolean) obj).booleanValue();
    }

    private boolean shouldOverrideWithHttpEngine(android.content.Context context) {
        try {
            return getReflectionValueAsBool(aazc.z(org.chromium.net.ExperimentalCronetEngine.class, "shouldOverrideWithHttpEngine", new acxg[]{new acxg(android.content.Context.class, context)}));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public org.chromium.net.CronetProvider getHttpEngineProvider() {
        return this.httpEngineProvider;
    }

    public boolean shouldUseHttpEngine() {
        return this.httpEngineProvider != null;
    }
}
