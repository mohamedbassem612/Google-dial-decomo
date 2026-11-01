package com.google.android.gms.phenotype;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RegistrationInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public final java.lang.String b;
    public final int c;
    public final java.lang.String[] d;
    public final byte[] e;
    public final boolean f;
    public final int[] g;
    public final java.lang.String h;
    public final byte[] i;
    public final int j;
    public final int k;
    public static final byte[] a = new byte[0];
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(16);

    public RegistrationInfo(java.lang.String str, int i, java.lang.String[] strArr, byte[] bArr, boolean z, int[] iArr, java.lang.String str2, byte[] bArr2, int i2, int i3) {
        this.b = str;
        this.c = i;
        this.d = strArr;
        this.e = bArr;
        this.f = z;
        this.g = iArr;
        this.h = str2;
        this.i = bArr2;
        this.j = i2;
        this.k = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.phenotype.RegistrationInfo) {
            com.google.android.gms.phenotype.RegistrationInfo registrationInfo = (com.google.android.gms.phenotype.RegistrationInfo) obj;
            if (this.b.equals(registrationInfo.b) && this.c == registrationInfo.c && java.util.Arrays.equals(this.d, registrationInfo.d) && java.util.Arrays.equals(this.e, registrationInfo.e) && this.f == registrationInfo.f && java.util.Arrays.equals(this.g, registrationInfo.g) && this.h.equals(registrationInfo.h) && java.util.Arrays.equals(this.i, registrationInfo.i) && this.j == registrationInfo.j && this.k == registrationInfo.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.d)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.e)), java.lang.Boolean.valueOf(this.f), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.g)), this.h, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.i)), java.lang.Integer.valueOf(this.j), java.lang.Integer.valueOf(this.k)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, this.b);
        aais.l(parcel, 2, this.c);
        aais.B(parcel, 3, this.d);
        aais.q(parcel, 4, this.e);
        aais.h(parcel, 5, this.f);
        aais.v(parcel, 6, this.g);
        aais.A(parcel, 7, this.h);
        aais.q(parcel, 8, this.i);
        aais.l(parcel, 9, this.j);
        aais.l(parcel, 10, this.k);
        aais.g(parcel, iF);
    }
}
