package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PackageStorageInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(6);
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;

    public PackageStorageInfo(java.lang.String str, java.lang.String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.m(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
