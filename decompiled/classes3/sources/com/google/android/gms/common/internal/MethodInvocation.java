package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MethodInvocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(1);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, java.lang.String str, java.lang.String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.l(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.m(parcel, 4, this.d);
        aais.m(parcel, 5, this.e);
        aais.A(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.l(parcel, 8, this.h);
        aais.l(parcel, 9, this.i);
        aais.g(parcel, iF);
    }
}
