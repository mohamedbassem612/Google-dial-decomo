package com.google.android.gms.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GoogleCertificatesLookupQuery extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(9);
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final android.content.Context g;

    public GoogleCertificatesLookupQuery(java.lang.String str, boolean z, boolean z2, android.os.IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        defpackage.aalb aakzVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            aakzVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            aakzVar = iInterfaceQueryLocalInterface instanceof defpackage.aalb ? (defpackage.aalb) iInterfaceQueryLocalInterface : new defpackage.aakz(iBinder);
        }
        this.g = (android.content.Context) aala.a(aakzVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.h(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.u(parcel, 4, new aala(this.g));
        aais.h(parcel, 5, this.d);
        aais.h(parcel, 6, this.e);
        aais.h(parcel, 8, this.f);
        aais.g(parcel, iF);
    }
}
