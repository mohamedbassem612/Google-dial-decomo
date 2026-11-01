package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class Asset extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(7);
    public final byte[] a;
    public final java.lang.String b;
    public final android.os.ParcelFileDescriptor c;
    public final android.net.Uri d;

    public Asset(byte[] bArr, java.lang.String str, android.os.ParcelFileDescriptor parcelFileDescriptor, android.net.Uri uri) {
        this.a = bArr;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = uri;
    }

    public static com.google.android.gms.wearable.Asset a(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        ahvr.ci(parcelFileDescriptor);
        return new com.google.android.gms.wearable.Asset(null, null, parcelFileDescriptor, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.wearable.Asset) {
            com.google.android.gms.wearable.Asset asset = (com.google.android.gms.wearable.Asset) obj;
            if (java.util.Arrays.equals(this.a, asset.a) && j$.util.Objects.equals(this.b, asset.b) && j$.util.Objects.equals(this.c, asset.c) && j$.util.Objects.equals(this.d, asset.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.deepHashCode(new java.lang.Object[]{this.a, this.b, this.c, this.d});
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Asset[@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        java.lang.String str = this.b;
        if (str == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(str);
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            sb.append(", size=");
            sb.append(bArr.length);
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.c;
        if (parcelFileDescriptor != null) {
            sb.append(", fd=");
            sb.append(parcelFileDescriptor);
        }
        android.net.Uri uri = this.d;
        if (uri != null) {
            sb.append(", uri=");
            sb.append(uri);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        ahvr.ci(parcel);
        int iF = aais.f(parcel, 20293);
        aais.q(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        int i2 = i | 1;
        aais.z(parcel, 4, this.c, i2);
        aais.z(parcel, 5, this.d, i2);
        aais.g(parcel, iF);
    }
}
