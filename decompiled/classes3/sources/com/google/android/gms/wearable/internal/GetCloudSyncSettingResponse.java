package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetCloudSyncSettingResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxf(5);
    public final int a;
    public final boolean b;

    public GetCloudSyncSettingResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.h(parcel, 3, this.b);
        aais.g(parcel, iF);
    }
}
