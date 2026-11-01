package com.google.android.gms.googlehelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class InProductHelp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(1);
    public com.google.android.gms.googlehelp.GoogleHelp a;
    public final java.lang.String b;
    public java.lang.String c;
    public final int d;
    public final java.lang.String e;
    public final int f;
    public final java.lang.String g;

    public InProductHelp(com.google.android.gms.googlehelp.GoogleHelp googleHelp, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.A(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.l(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.g(parcel, iF);
    }
}
