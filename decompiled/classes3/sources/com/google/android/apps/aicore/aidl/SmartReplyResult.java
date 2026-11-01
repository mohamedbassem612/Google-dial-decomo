package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SmartReplyResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(6);
    public final aify a;
    public final com.google.android.apps.aicore.aidl.InferenceEventTraceResult b;

    public SmartReplyResult(java.util.List list, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult) {
        this.a = aify.n(list);
        this.b = inferenceEventTraceResult;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.aicore.aidl.SmartReplyResult) {
            return j$.util.Objects.equals(this.a, ((com.google.android.apps.aicore.aidl.SmartReplyResult) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "SmartReplyResult{results=" + java.lang.String.valueOf(this.a) + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
