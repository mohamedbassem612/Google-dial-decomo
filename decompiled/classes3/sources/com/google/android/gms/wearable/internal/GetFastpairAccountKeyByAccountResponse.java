package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetFastpairAccountKeyByAccountResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxf(12);
    public final int a;
    public final com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable b;

    public GetFastpairAccountKeyByAccountResponse(int i, com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable fastPairAccountKeyParcelable) {
        this.a = i;
        this.b = fastPairAccountKeyParcelable;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
