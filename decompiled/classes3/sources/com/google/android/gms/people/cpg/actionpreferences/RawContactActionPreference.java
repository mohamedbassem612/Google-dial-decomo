package com.google.android.gms.people.cpg.actionpreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RawContactActionPreference extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(1);
    public final long a;
    public final int b;
    public final java.lang.String c;
    public final int d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final long h;

    public RawContactActionPreference(long j, int i, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j2) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference) {
            com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference rawContactActionPreference = (com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference) obj;
            if (this.a == rawContactActionPreference.a && this.b == rawContactActionPreference.b && j$.util.Objects.equals(this.c, rawContactActionPreference.c) && this.d == rawContactActionPreference.d && j$.util.Objects.equals(this.e, rawContactActionPreference.e) && j$.util.Objects.equals(this.f, rawContactActionPreference.f) && j$.util.Objects.equals(this.g, rawContactActionPreference.g) && this.h == rawContactActionPreference.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), java.lang.Integer.valueOf(this.b), this.c, java.lang.Integer.valueOf(this.d), this.e, this.f, this.g, java.lang.Long.valueOf(this.h)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.a;
        int iF = aais.f(parcel, 20293);
        aais.m(parcel, 1, j);
        aais.l(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.A(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.m(parcel, 8, this.h);
        aais.g(parcel, iF);
    }
}
