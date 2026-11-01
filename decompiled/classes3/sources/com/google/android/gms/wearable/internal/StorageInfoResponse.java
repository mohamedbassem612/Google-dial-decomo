package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class StorageInfoResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(14);
    public final int a;
    public final long b;
    public final java.util.List c;

    public StorageInfoResponse(int i, long j, java.util.List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.m(parcel, 3, this.b);
        aais.E(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
