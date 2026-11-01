package com.google.android.gms.mdisync.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SyncRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(17);
    public final byte[] a;
    public final com.google.android.gms.mdisync.SyncOptions b;
    public final long c;
    public final int d;

    public SyncRequest(int i, byte[] bArr, com.google.android.gms.mdisync.SyncOptions syncOptions, long j) {
        int iAS = a.aS(i);
        this.d = iAS == 0 ? 1 : iAS;
        this.a = bArr;
        this.b = syncOptions;
        this.c = j;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.d;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2 - 1);
        aais.q(parcel, 2, this.a);
        aais.z(parcel, 3, this.b, i);
        aais.m(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
