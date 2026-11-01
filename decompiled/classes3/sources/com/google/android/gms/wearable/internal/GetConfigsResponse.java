package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetConfigsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxf(8);
    public final int a;
    public final com.google.android.gms.wearable.ConnectionConfiguration[] b;

    public GetConfigsResponse(int i, com.google.android.gms.wearable.ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Parcelable[], com.google.android.gms.wearable.ConnectionConfiguration[]] */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.D(parcel, 3, (android.os.Parcelable[]) this.b, i);
        aais.g(parcel, iF);
    }
}
