package com.google.android.gms.googlehelp.trails;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TrailsInteraction extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(6);
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;

    public TrailsInteraction(java.lang.String str, long j, java.lang.String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, this.a);
        aais.m(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
