package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(16);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final android.net.Uri e;
    public java.lang.String f;
    public final long g;
    public final java.lang.String h;
    public final java.util.List i;
    public final java.lang.String j;
    public final java.lang.String k;
    private final java.util.Set l = new java.util.HashSet();

    public GoogleSignInAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = list;
        this.j = str7;
        this.k = str8;
    }

    public final java.util.Set a() {
        java.util.HashSet hashSet = new java.util.HashSet(this.i);
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
                return false;
            }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
            if (!googleSignInAccount.h.equals(this.h) || !googleSignInAccount.a().equals(a())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + a().hashCode();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.z(parcel, 6, this.e, i);
        aais.A(parcel, 7, this.f);
        aais.m(parcel, 8, this.g);
        aais.A(parcel, 9, this.h);
        aais.E(parcel, 10, this.i);
        aais.A(parcel, 11, this.j);
        aais.A(parcel, 12, this.k);
        aais.g(parcel, iF);
    }
}
