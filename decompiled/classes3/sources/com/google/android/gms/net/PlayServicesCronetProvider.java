package com.google.android.gms.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PlayServicesCronetProvider extends org.chromium.net.CronetProvider {
    private static final java.lang.String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final java.lang.String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(android.content.Context context) {
        super(context);
    }

    private static java.lang.Class subclassNativeCronetEngine(java.lang.ClassLoader classLoader) {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(org.chromium.net.ICronetEngineBuilder.class);
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, org.chromium.net.ICronetEngineBuilder.class.getClassLoader()), e);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            defpackage.aapo.b(this.mContext);
        } catch (aacl unused) {
            if (android.util.Log.isLoggable(TAG, 4)) {
                android.util.Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (aacm unused2) {
            if (android.util.Log.isLoggable(TAG, 4)) {
                android.util.Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }

    public org.chromium.net.CronetEngine.Builder createBuilder() {
        org.chromium.net.CronetEngine.Builder builderCreateBuilder;
        new defpackage.xkn("GMS PlayServicesCronetProvider#createBuilder", 2);
        try {
            try {
                defpackage.aapo.b(this.mContext);
                try {
                    defpackage.aapq aapqVar = new defpackage.aapq(this.mContext, 37402, 0.01f);
                    try {
                        com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton = com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext);
                        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
                            builderCreateBuilder = httpEngineProviderSingleton.getHttpEngineProvider().createBuilder();
                            aapqVar.a();
                            aapqVar.close();
                        } else {
                            aalm aalmVarA = defpackage.aapo.a();
                            aais.as(aalmVarA);
                            java.lang.ClassLoader classLoader = aalmVarA.c.getClassLoader();
                            aais.as(classLoader);
                            org.chromium.net.CronetEngine.Builder builder = new org.chromium.net.ExperimentalCronetEngine.Builder((org.chromium.net.ICronetEngineBuilder) subclassNativeCronetEngine(classLoader).getConstructor(android.content.Context.class).newInstance(this.mContext));
                            aapqVar.a();
                            aapqVar.close();
                            builderCreateBuilder = builder;
                        }
                        android.os.Trace.endSection();
                        return builderCreateBuilder;
                    } catch (java.lang.Throwable th) {
                        try {
                            aapqVar.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.ReflectiveOperationException e) {
                    throw new java.lang.RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
                }
            } catch (aacm e2) {
                throw new java.lang.IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
            } catch (aacl e3) {
                throw new java.lang.IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e3);
            }
        } catch (java.lang.Throwable th3) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.net.PlayServicesCronetProvider) && this.mContext.equals(((com.google.android.gms.net.PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    public java.lang.String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public java.lang.String getVersion() {
        java.lang.String str;
        com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton = com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext);
        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton.getHttpEngineProvider().getVersion();
        }
        tryToInstallCronetProvider();
        synchronized (defpackage.aapo.a) {
            str = defpackage.aapo.b;
        }
        return str;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{com.google.android.gms.net.PlayServicesCronetProvider.class, this.mContext});
    }

    public boolean isEnabled() {
        if (com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        tryToInstallCronetProvider();
        return defpackage.aapo.c();
    }
}
