package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetAccountsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(9);
    public final java.lang.String a;
    public final java.util.List b;
    public final java.util.List c;
    public final boolean d;
    public final boolean e;

    public GetAccountsRequest(java.lang.String str, java.util.List list, java.util.List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
    }

    public static defpackage.zwv a() {
        defpackage.zwv zwvVar = new defpackage.zwv();
        zwvVar.b = (byte) 3;
        return zwvVar;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.C(parcel, 2, this.b);
        aais.C(parcel, 3, this.c);
        aais.h(parcel, 4, this.d);
        aais.h(parcel, 5, this.e);
        aais.g(parcel, iF);
    }
}
