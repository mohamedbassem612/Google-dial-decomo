package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppRestrictionInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(7);
    public final java.lang.String a;
    public final byte[] b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    public AppRestrictionInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr) {
        this.a = str;
        this.d = str3;
        this.c = str2;
        this.e = str4;
        this.b = bArr;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 3, this.c);
        aais.A(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.q(parcel, 6, this.b);
        aais.g(parcel, iF);
    }
}
