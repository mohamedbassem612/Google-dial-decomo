package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class QuotaExceededErrorDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(2);
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;

    public QuotaExceededErrorDetails(int i, int i2, int i3, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails) {
            com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails quotaExceededErrorDetails = (com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails) obj;
            if (this.a == quotaExceededErrorDetails.a && this.b == quotaExceededErrorDetails.b && this.c == quotaExceededErrorDetails.c && java.lang.Float.compare(this.d, quotaExceededErrorDetails.d) == 0 && java.lang.Float.compare(this.e, quotaExceededErrorDetails.e) == 0 && java.lang.Float.compare(this.f, quotaExceededErrorDetails.f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Float.valueOf(this.d), java.lang.Float.valueOf(this.e), java.lang.Float.valueOf(this.f)});
    }

    public final java.lang.String toString() {
        return "QuotaExceededErrorDetails {quotaType=" + this.a + ", quotaScope=" + this.b + ", quotaCheckStage=" + this.c + ", periodSeconds=" + this.d + ", costLimit=" + this.e + ", tryAgainSeconds=" + this.f + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.l(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.k(parcel, 4, this.d);
        aais.k(parcel, 5, this.e);
        aais.k(parcel, 6, this.f);
        aais.g(parcel, iF);
    }
}
