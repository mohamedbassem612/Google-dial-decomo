package org.chromium.net.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class JavaCronetProvider extends org.chromium.net.CronetProvider {
    public JavaCronetProvider(android.content.Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final org.chromium.net.CronetEngine$Builder createBuilder() {
        if (org.chromium.net.impl.HttpEngineNativeProvider.a()) {
            android.content.Context context = this.mContext;
            defpackage.apun apunVar = (defpackage.apun) defpackage.apum.a(context, false, defpackage.apvu.b(context, defpackage.apvp.CRONET_SOURCE_FALLBACK)).br().get("Cronet_ForceHttpEngineInFallback");
            if (apunVar != null && apunVar.b()) {
                return new org.chromium.net.impl.HttpEngineNativeProvider(this.mContext).createBuilder();
            }
        }
        return new org.chromium.net.ExperimentalCronetEngine.Builder(new defpackage.apvz(this.mContext));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof org.chromium.net.impl.JavaCronetProvider) && this.mContext.equals(((org.chromium.net.impl.JavaCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final java.lang.String getName() {
        return org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    @Override // org.chromium.net.CronetProvider
    public final java.lang.String getVersion() {
        return org.chromium.net.impl.ImplVersion.getCronetVersion();
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{org.chromium.net.impl.JavaCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
