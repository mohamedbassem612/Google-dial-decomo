package com.google.android.gms.clearcut.sampler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SamplerDecisionParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(5);
    public final boolean a;
    public final long b;

    public SamplerDecisionParcelable(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final j$.time.Instant a() {
        return j$.time.Instant.ofEpochMilli(this.b);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, z);
        aais.m(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
