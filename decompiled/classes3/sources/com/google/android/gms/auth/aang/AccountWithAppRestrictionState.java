package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AccountWithAppRestrictionState extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(5);
    public final com.google.android.gms.auth.aang.GoogleAccount a;
    public final com.google.android.gms.auth.aang.AppRestrictionState b;

    public AccountWithAppRestrictionState(com.google.android.gms.auth.aang.GoogleAccount googleAccount, com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState) {
        this.a = googleAccount;
        this.b = appRestrictionState;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.auth.aang.AccountWithAppRestrictionState) {
            com.google.android.gms.auth.aang.AccountWithAppRestrictionState accountWithAppRestrictionState = (com.google.android.gms.auth.aang.AccountWithAppRestrictionState) obj;
            if (this.a.equals(accountWithAppRestrictionState.a) && this.b.equals(accountWithAppRestrictionState.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        return java.lang.String.format("AccountWithAppRestrictionState{googleAccount=%s, appRestrictionState=%s}", this.a, this.b);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
