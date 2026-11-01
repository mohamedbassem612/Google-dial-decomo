package com.google.android.libraries.dialer.videocall;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AutoValue_ViLteStatus extends com.google.android.libraries.dialer.videocall.ViLteStatus {
    private final boolean a;
    private final int b;

    public AutoValue_ViLteStatus(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // com.google.android.libraries.dialer.videocall.ViLteStatus
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.libraries.dialer.videocall.ViLteStatus
    public final int b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.dialer.videocall.ViLteStatus) {
            com.google.android.libraries.dialer.videocall.ViLteStatus viLteStatus = (com.google.android.libraries.dialer.videocall.ViLteStatus) obj;
            if (this.a == viLteStatus.a() && this.b == viLteStatus.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "ViLteStatus{viLteAvailable=" + this.a + ", resultCode=" + defpackage.abxl.B(this.b) + '}';
    }
}
