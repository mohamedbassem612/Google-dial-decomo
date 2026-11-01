package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Oauth2TokenMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(14);
    public final java.lang.Long a;
    public final java.util.List b;

    public Oauth2TokenMetadata(java.lang.Long l, java.util.List list) {
        this.a = l;
        this.b = list;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.Long l = this.a;
        int iF = aais.f(parcel, 20293);
        aais.y(parcel, 1, l);
        aais.C(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
