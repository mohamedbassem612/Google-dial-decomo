package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SuggestedTextResult implements com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(10);
    public final aify a;
    public final com.google.android.apps.aicore.aidl.InferenceEventTraceResult b;

    public SuggestedTextResult(java.util.List list, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult) {
        this.a = aify.n(list);
        this.b = inferenceEventTraceResult;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.aicore.aidl.SuggestedTextResult) {
            com.google.android.apps.aicore.aidl.SuggestedTextResult suggestedTextResult = (com.google.android.apps.aicore.aidl.SuggestedTextResult) obj;
            if (j$.util.Objects.equals(this.a, suggestedTextResult.a) && j$.util.Objects.equals(this.b, suggestedTextResult.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
