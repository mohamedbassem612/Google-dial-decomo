package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SummarizationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(16);
    public final aify a;
    public final com.google.android.apps.aicore.aidl.InferenceEventTraceResult b;
    public final float c;
    public final aify d;
    public final com.google.android.apps.aicore.aidl.LegionResultMetadata e;

    public SummarizationResult(java.util.List list, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult, float f, java.util.List list2, com.google.android.apps.aicore.aidl.LegionResultMetadata legionResultMetadata) {
        this.a = aify.n(list);
        this.b = inferenceEventTraceResult;
        this.c = f;
        this.d = list2 == null ? null : aify.n(list2);
        this.e = legionResultMetadata;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.z(parcel, 2, this.b, i);
        aais.k(parcel, 3, this.c);
        aais.E(parcel, 4, this.d);
        aais.z(parcel, 5, this.e, i);
        aais.g(parcel, iF);
    }
}
