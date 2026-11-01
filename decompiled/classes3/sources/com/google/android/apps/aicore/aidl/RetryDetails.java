package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RetryDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(3);
    public final int a;

    public RetryDetails(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.google.android.apps.aicore.aidl.RetryDetails) && this.a == ((com.google.android.apps.aicore.aidl.RetryDetails) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.a;
        if (i == 0) {
            str = "UNSPECIFIED";
        } else if (i != 1) {
            str = i != 2 ? "Unknown" : "NOT_RETRYABLE";
        } else {
            str = "RETRYABLE";
        }
        return a.bk(str, "RetryDetails { retryGuidance = ", " }");
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.g(parcel, iF);
    }
}
