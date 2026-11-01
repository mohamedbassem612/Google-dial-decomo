package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetLocalNodeResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxf(17);
    public final int a;
    public final com.google.android.gms.wearable.internal.NodeParcelable b;

    public GetLocalNodeResponse(int i, com.google.android.gms.wearable.internal.NodeParcelable nodeParcelable) {
        this.a = i;
        this.b = nodeParcelable;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.z(parcel, 3, this.b, i);
        aais.g(parcel, iF);
    }
}
