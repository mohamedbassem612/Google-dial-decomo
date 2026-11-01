package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppRecommendationsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(2);
    public final int a;
    public final java.util.List b;
    public final com.google.android.gms.wearable.internal.WebIconParcelable c;

    public AppRecommendationsResponse(int i, java.util.List list, com.google.android.gms.wearable.internal.WebIconParcelable webIconParcelable) {
        this.a = i;
        this.b = list;
        this.c = webIconParcelable;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.E(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
