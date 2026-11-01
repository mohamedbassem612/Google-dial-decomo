package com.google.android.gms.auth;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TokenData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(3);
    final int a;
    public final java.lang.String b;
    public final java.lang.Long c;
    public final boolean d;
    public final boolean e;
    public final java.util.List f;
    public final java.lang.String g;

    public TokenData(int i, java.lang.String str, java.lang.Long l, boolean z, boolean z2, java.util.List list, java.lang.String str2) {
        this.a = i;
        aais.ap(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.TokenData)) {
            return false;
        }
        com.google.android.gms.auth.TokenData tokenData = (com.google.android.gms.auth.TokenData) obj;
        return android.text.TextUtils.equals(this.b, tokenData.b) && j$.util.Objects.equals(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && j$.util.Objects.equals(this.f, tokenData.f) && j$.util.Objects.equals(this.g, tokenData.g);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.e), this.f, this.g});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.A(parcel, 2, this.b);
        aais.y(parcel, 3, this.c);
        aais.h(parcel, 4, this.d);
        aais.h(parcel, 5, this.e);
        aais.C(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.g(parcel, iF);
    }
}
