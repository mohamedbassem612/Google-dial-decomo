package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ParcelableBackupDevice extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(7);
    public final byte[] a;

    public ParcelableBackupDevice(byte[] bArr) {
        ahvr.ci(bArr);
        this.a = bArr;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iF = aais.f(parcel, 20293);
        aais.q(parcel, 1, bArr);
        aais.g(parcel, iF);
    }
}
