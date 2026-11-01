package com.google.android.gms.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GoogleCertificatesLookupResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(10);
    public final boolean a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final long e;

    public GoogleCertificatesLookupResponse(boolean z, java.lang.String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = aehj.bZ(i) - 1;
        this.d = aehj.ca(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return aehj.bZ(this.c);
    }

    public final void b() {
        aehj.ca(this.d);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, z);
        aais.A(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.m(parcel, 5, this.e);
        aais.g(parcel, iF);
    }
}
