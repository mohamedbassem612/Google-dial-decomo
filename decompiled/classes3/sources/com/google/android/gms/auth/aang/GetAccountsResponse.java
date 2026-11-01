package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetAccountsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(10);
    public final java.util.List a;
    public final java.util.List b;

    public GetAccountsResponse(java.util.List list, java.util.List list2) {
        this.a = list;
        this.b = list2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, list);
        aais.E(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
