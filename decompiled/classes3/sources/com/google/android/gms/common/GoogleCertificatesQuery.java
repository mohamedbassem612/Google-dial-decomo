package com.google.android.gms.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public class GoogleCertificatesQuery extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(11);
    public final java.lang.String a;
    public final android.os.IBinder b;
    public final boolean c;
    public final boolean d;
    private aahd e;

    public GoogleCertificatesQuery(java.lang.String str, aahd aahdVar, boolean z, boolean z2) {
        this.a = str;
        this.e = aahdVar;
        this.b = aahdVar == null ? null : aahdVar;
        this.c = z;
        this.d = z2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.u(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.h(parcel, 4, this.d);
        aais.g(parcel, iF);
    }

    public GoogleCertificatesQuery(java.lang.String str, android.os.IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        this.b = iBinder;
        this.c = z;
        this.d = z2;
    }
}
