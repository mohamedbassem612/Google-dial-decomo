package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetNodeIdResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxf(18);
    public final int a;
    public final java.lang.String b;

    public GetNodeIdResponse(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.g(parcel, iF);
    }
}
