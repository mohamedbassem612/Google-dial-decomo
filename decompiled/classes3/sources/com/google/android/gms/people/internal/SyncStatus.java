package com.google.android.gms.people.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SyncStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(12);
    public final int a;
    public final java.lang.String b;
    public final long c;

    public SyncStatus(int i, java.lang.String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, i2);
        aais.A(parcel, 3, this.b);
        aais.m(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
