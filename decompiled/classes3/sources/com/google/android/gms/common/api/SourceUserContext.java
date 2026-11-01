package com.google.android.gms.common.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SourceUserContext extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(12);
    public final long a;

    public SourceUserContext(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.common.api.SourceUserContext) && this.a == ((com.google.android.gms.common.api.SourceUserContext) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "SourceUserContext(" + this.a + ')';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.a;
        int iF = aais.f(parcel, 20293);
        aais.m(parcel, 1, j);
        aais.g(parcel, iF);
    }
}
