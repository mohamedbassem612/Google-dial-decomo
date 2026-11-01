package com.google.android.gms.location.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FusedLocationProviderResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements aadl {
    public static final android.os.Parcelable.Creator CREATOR;
    public final com.google.android.gms.common.api.Status a;

    static {
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.a;
        CREATOR = new defpackage.aalp(9);
    }

    public FusedLocationProviderResult(com.google.android.gms.common.api.Status status) {
        this.a = status;
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.api.Status status = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, status, i);
        aais.g(parcel, iF);
    }
}
