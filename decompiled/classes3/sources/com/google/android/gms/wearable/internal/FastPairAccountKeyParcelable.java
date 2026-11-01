package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FastPairAccountKeyParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(16);
    private final byte[] a;

    public FastPairAccountKeyParcelable(byte[] bArr) {
        this.a = bArr;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iF = aais.f(parcel, 20293);
        aais.q(parcel, 1, (byte[]) bArr.clone());
        aais.g(parcel, iF);
    }
}
