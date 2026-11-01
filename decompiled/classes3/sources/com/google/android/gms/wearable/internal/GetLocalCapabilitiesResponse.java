package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetLocalCapabilitiesResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxf(16);
    public final int a;
    public final java.util.List b;
    public final java.util.List c;

    public GetLocalCapabilitiesResponse(int i, java.util.List list, java.util.List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.C(parcel, 2, this.b);
        aais.C(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
