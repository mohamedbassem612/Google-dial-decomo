package androidx.car.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;
    private final java.lang.String mHostPackageName;

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    public java.lang.String getHostPackageName() {
        return (java.lang.String) j$.util.Objects.requireNonNull(this.mHostPackageName);
    }

    public HandshakeInfo(java.lang.String str, int i) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i;
    }
}
