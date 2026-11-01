package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class InferenceErrorDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(13);
    public final com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails a;

    public InferenceErrorDetails(com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails quotaExceededErrorDetails) {
        this.a = quotaExceededErrorDetails;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.aicore.aidl.InferenceErrorDetails) {
            return j$.util.Objects.equals(this.a, ((com.google.android.apps.aicore.aidl.InferenceErrorDetails) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }

    public final java.lang.String toString() {
        return "InferenceErrorDetails {quotaExceededErrorDetails=" + java.lang.String.valueOf(this.a) + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.g(parcel, iF);
    }
}
