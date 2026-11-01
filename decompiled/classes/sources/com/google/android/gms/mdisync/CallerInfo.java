package com.google.android.gms.mdisync;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class CallerInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(17);
    public final java.lang.String a;
    public final long b;

    public CallerInfo(java.lang.String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.A(parcel, 1, str);
        defpackage.aais.m(parcel, 2, this.b);
        defpackage.aais.g(parcel, iF);
    }
}
