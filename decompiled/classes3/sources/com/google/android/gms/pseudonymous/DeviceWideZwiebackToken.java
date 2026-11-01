package com.google.android.gms.pseudonymous;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DeviceWideZwiebackToken extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(17);
    public final byte[] a;

    public DeviceWideZwiebackToken(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.pseudonymous.DeviceWideZwiebackToken) {
            return java.util.Arrays.equals(this.a, ((com.google.android.gms.pseudonymous.DeviceWideZwiebackToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iF = aais.f(parcel, 20293);
        aais.q(parcel, 1, bArr);
        aais.g(parcel, iF);
    }
}
