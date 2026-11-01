package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppRestrictionState extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(4);
    public final boolean a;
    public final boolean b;

    public AppRestrictionState(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.auth.aang.AppRestrictionState) {
            com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState = (com.google.android.gms.auth.aang.AppRestrictionState) obj;
            if (this.a == appRestrictionState.a && this.b == appRestrictionState.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        return java.lang.String.format("AppRestrictionState{isRestricted=%b, isAccountHidden=%b}", java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(this.b));
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, z);
        aais.h(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
