package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LLMResult implements com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(20);
    public final aify a;
    public final com.google.android.apps.aicore.aidl.InferenceEventTraceResult b;
    public final com.google.android.apps.aicore.aidl.LegionResultMetadata c;
    public final aify d;

    public LLMResult(java.util.List list, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult, com.google.android.apps.aicore.aidl.LegionResultMetadata legionResultMetadata, java.util.List list2) {
        this.a = aify.n(list);
        this.b = inferenceEventTraceResult;
        this.c = legionResultMetadata;
        this.d = list2 == null ? aike.a : aify.n(list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.z(parcel, 2, this.b, i);
        aais.z(parcel, 3, this.c, i);
        aais.E(parcel, 4, this.d);
        aais.g(parcel, iF);
    }
}
