package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppRestriction extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(6);
    public final com.google.android.gms.auth.aang.AppRestrictionState a;
    public final com.google.android.gms.auth.aang.AppRestrictionInfo b;

    public AppRestriction(com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState, com.google.android.gms.auth.aang.AppRestrictionInfo appRestrictionInfo) {
        this.a = appRestrictionState;
        this.b = appRestrictionInfo;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
