package com.google.android.gms.people.cpg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ActionPreference extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(17);
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final long g;

    public ActionPreference(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, int i3, long j) {
        this.b = i;
        this.a = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.ActionPreference) {
            com.google.android.gms.people.cpg.ActionPreference actionPreference = (com.google.android.gms.people.cpg.ActionPreference) obj;
            if (this.b == actionPreference.b && this.c == actionPreference.c && j$.util.Objects.equals(this.d, actionPreference.d) && j$.util.Objects.equals(this.a, actionPreference.a) && j$.util.Objects.equals(this.e, actionPreference.e) && this.f == actionPreference.f && this.g == actionPreference.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.b), this.a, java.lang.Integer.valueOf(this.c), this.d, this.e, java.lang.Integer.valueOf(this.f), java.lang.Long.valueOf(this.g)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.l(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.A(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.l(parcel, 6, this.f);
        aais.m(parcel, 7, this.g);
        aais.g(parcel, iF);
    }
}
