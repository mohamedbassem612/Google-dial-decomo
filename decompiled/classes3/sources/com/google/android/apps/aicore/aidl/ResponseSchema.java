package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ResponseSchema extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.yma();
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.Boolean d;
    public final java.util.List e;
    public final com.google.android.apps.aicore.aidl.ResponseSchema f;
    public final java.lang.Long g;
    public final java.lang.Long h;
    public final java.util.List i;
    public final java.lang.Long j;
    public final java.lang.Long k;
    public final java.lang.Double l;
    public final java.lang.Double m;
    public final java.lang.Long n;
    public final java.lang.Long o;
    public final java.lang.String p;
    public final java.util.List q;
    public final java.util.List r;
    public final java.lang.String s;
    public final android.os.Bundle t;

    public ResponseSchema(int i, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.util.List list, com.google.android.apps.aicore.aidl.ResponseSchema responseSchema, java.lang.Long l, java.lang.Long l2, java.util.List list2, java.lang.Long l3, java.lang.Long l4, java.lang.Double d, java.lang.Double d2, java.lang.Long l5, java.lang.Long l6, java.lang.String str3, java.util.List list3, java.util.List list4, java.lang.String str4, android.os.Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = list;
        this.f = responseSchema;
        this.g = l;
        this.h = l2;
        this.i = list2;
        this.j = l3;
        this.k = l4;
        this.l = d;
        this.m = d2;
        this.n = l5;
        this.o = l6;
        this.p = str3;
        this.q = list3;
        this.r = list4;
        this.s = str4;
        this.t = bundle;
    }

    public static defpackage.ylz a() {
        defpackage.ylz ylzVar = new defpackage.ylz();
        ylzVar.b(0);
        return ylzVar;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.o(parcel, 4, this.d);
        aais.C(parcel, 5, this.e);
        aais.z(parcel, 6, this.f, i);
        aais.y(parcel, 7, this.g);
        aais.y(parcel, 8, this.h);
        aais.C(parcel, 9, this.i);
        aais.y(parcel, 10, this.j);
        aais.y(parcel, 11, this.k);
        aais.s(parcel, 12, this.l);
        aais.s(parcel, 13, this.m);
        aais.y(parcel, 14, this.n);
        aais.y(parcel, 15, this.o);
        aais.A(parcel, 16, this.p);
        aais.E(parcel, 17, this.q);
        aais.C(parcel, 18, this.r);
        aais.A(parcel, 19, this.s);
        aais.p(parcel, 20, this.t);
        aais.g(parcel, iF);
    }
}
