package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FailedResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(7);
    public final int a;
    public final com.google.android.apps.aicore.aidl.InferenceEventTraceResult b;
    public final com.google.android.apps.aicore.aidl.AiCoreException c;

    public FailedResult(int i, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult, com.google.android.apps.aicore.aidl.AiCoreException aiCoreException) {
        this.a = i;
        this.b = inferenceEventTraceResult;
        this.c = aiCoreException;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.z(parcel, 2, this.b, i);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
