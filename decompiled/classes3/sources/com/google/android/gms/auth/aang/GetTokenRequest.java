package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(11);
    public final com.google.android.gms.auth.aang.GoogleAccount a;
    public final java.lang.String b;
    public final java.util.List c;
    public final java.util.List d;
    public final java.util.List e;
    public final java.util.List f;
    public final int g;
    public final java.lang.String h;
    public final boolean i;
    public final byte[] j;
    public final java.lang.String k;
    public final boolean l;
    public final android.net.Network m;
    public final boolean n;
    public final int o;

    public GetTokenRequest(com.google.android.gms.auth.aang.GoogleAccount googleAccount, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.String str2, boolean z, byte[] bArr, java.lang.String str3, boolean z2, android.net.Network network, boolean z3, int i2) {
        this.a = googleAccount;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
        this.m = network;
        this.n = z3;
        this.o = i2;
    }

    public static defpackage.zww a() {
        defpackage.zww zwwVar = new defpackage.zww();
        zwwVar.k = (byte) (zwwVar.k | 2);
        zwwVar.c(0);
        zwwVar.d(false);
        zwwVar.e(false);
        zwwVar.j = 1;
        zwwVar.k = (byte) (zwwVar.k | 16);
        return zwwVar;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.A(parcel, 2, this.b);
        aais.C(parcel, 3, this.c);
        aais.C(parcel, 4, this.d);
        aais.C(parcel, 5, this.e);
        aais.C(parcel, 6, this.f);
        aais.l(parcel, 7, this.g);
        aais.A(parcel, 8, this.h);
        aais.h(parcel, 9, this.i);
        aais.q(parcel, 10, this.j);
        aais.A(parcel, 11, this.k);
        aais.h(parcel, 12, this.l);
        aais.z(parcel, 13, this.m, i);
        aais.h(parcel, 14, this.n);
        aais.l(parcel, 15, this.o);
        aais.g(parcel, iF);
    }
}
