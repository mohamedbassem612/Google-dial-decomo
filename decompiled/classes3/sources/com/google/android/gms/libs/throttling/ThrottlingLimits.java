package com.google.android.gms.libs.throttling;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ThrottlingLimits extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(8);
    private final int a;

    private ThrottlingLimits() {
        this.a = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.libs.throttling.ThrottlingLimits) {
            return j$.util.Objects.equals(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(((com.google.android.gms.libs.throttling.ThrottlingLimits) obj).a));
        }
        return false;
    }

    public int getMaxInflight() {
        return this.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, getMaxInflight());
        aais.g(parcel, iF);
    }

    public ThrottlingLimits(int i) {
        this.a = i;
    }
}
