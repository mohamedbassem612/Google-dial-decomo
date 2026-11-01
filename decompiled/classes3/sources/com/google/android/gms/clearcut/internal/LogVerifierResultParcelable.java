package com.google.android.gms.clearcut.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LogVerifierResultParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(3);
    public final boolean a;

    public LogVerifierResultParcelable(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.google.android.gms.clearcut.internal.LogVerifierResultParcelable) && this.a == ((com.google.android.gms.clearcut.internal.LogVerifierResultParcelable) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        return "LogVerifierResultParcelable[" + this.a + ']';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, this.a);
        aais.g(parcel, iF);
    }
}
