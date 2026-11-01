package com.google.android.gms.mdisync.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SyncResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(18);
    public final byte[] a;

    public SyncResult(byte[] bArr) {
        this.a = bArr;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iF = aais.f(parcel, 20293);
        aais.q(parcel, 1, bArr);
        aais.g(parcel, iF);
    }
}
