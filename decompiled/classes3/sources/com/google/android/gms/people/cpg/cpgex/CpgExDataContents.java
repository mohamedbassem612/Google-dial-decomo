package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CpgExDataContents extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aars();
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final java.lang.String l;
    public final java.lang.String m;
    public final java.lang.String n;
    public final java.lang.String o;
    public final java.lang.String p;

    @java.lang.Deprecated
    public final boolean q;

    @java.lang.Deprecated
    public final boolean r;
    public final java.lang.Long s;
    public final java.lang.Boolean t;
    public final java.lang.Boolean u;

    public CpgExDataContents(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, boolean z, boolean z2, java.lang.Long l, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
        this.p = str16;
        java.lang.Boolean bool3 = null;
        this.t = bool != null ? bool : z ? java.lang.Boolean.TRUE : null;
        if (bool2 != null) {
            bool3 = bool2;
        } else if (z2) {
            bool3 = java.lang.Boolean.TRUE;
        }
        this.u = bool3;
        this.q = bool != null ? bool.booleanValue() : z;
        this.r = bool2 != null ? bool2.booleanValue() : z2;
        this.s = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.CpgExDataContents) {
            com.google.android.gms.people.cpg.cpgex.CpgExDataContents cpgExDataContents = (com.google.android.gms.people.cpg.cpgex.CpgExDataContents) obj;
            if (this.q == cpgExDataContents.q && this.r == cpgExDataContents.r && j$.util.Objects.equals(this.a, cpgExDataContents.a) && j$.util.Objects.equals(this.b, cpgExDataContents.b) && j$.util.Objects.equals(this.c, cpgExDataContents.c) && j$.util.Objects.equals(this.d, cpgExDataContents.d) && j$.util.Objects.equals(this.e, cpgExDataContents.e) && j$.util.Objects.equals(this.f, cpgExDataContents.f) && j$.util.Objects.equals(this.g, cpgExDataContents.g) && j$.util.Objects.equals(this.h, cpgExDataContents.h) && j$.util.Objects.equals(this.i, cpgExDataContents.i) && j$.util.Objects.equals(this.j, cpgExDataContents.j) && j$.util.Objects.equals(this.k, cpgExDataContents.k) && j$.util.Objects.equals(this.l, cpgExDataContents.l) && j$.util.Objects.equals(this.m, cpgExDataContents.m) && j$.util.Objects.equals(this.n, cpgExDataContents.n) && j$.util.Objects.equals(this.o, cpgExDataContents.o) && j$.util.Objects.equals(this.p, cpgExDataContents.p) && j$.util.Objects.equals(this.t, cpgExDataContents.t) && j$.util.Objects.equals(this.u, cpgExDataContents.u) && j$.util.Objects.equals(this.s, cpgExDataContents.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, java.lang.Boolean.valueOf(this.q), java.lang.Boolean.valueOf(this.r), this.t, this.u, this.s});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.A(parcel, 6, this.e);
        aais.A(parcel, 7, this.f);
        aais.A(parcel, 8, this.g);
        aais.A(parcel, 9, this.h);
        aais.A(parcel, 10, this.i);
        aais.A(parcel, 11, this.j);
        aais.A(parcel, 12, this.k);
        aais.A(parcel, 13, this.l);
        aais.A(parcel, 14, this.m);
        aais.A(parcel, 15, this.n);
        aais.A(parcel, 16, this.o);
        aais.A(parcel, 17, this.p);
        aais.h(parcel, 18, this.q);
        aais.h(parcel, 19, this.r);
        aais.y(parcel, 20, this.s);
        aais.o(parcel, 21, this.t);
        aais.o(parcel, 22, this.u);
        aais.g(parcel, iF);
    }
}
