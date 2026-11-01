package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ResolveAccountResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(3);
    final int a;
    final android.os.IBinder b;
    public final com.google.android.gms.common.ConnectionResult c;
    public final boolean d;
    public final boolean e;

    public ResolveAccountResponse(int i, android.os.IBinder iBinder, com.google.android.gms.common.ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final defpackage.aahb a() {
        android.os.IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof defpackage.aahb ? (defpackage.aahb) iInterfaceQueryLocalInterface : new defpackage.aahb(iBinder);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof com.google.android.gms.common.internal.ResolveAccountResponse)) {
                return false;
            }
            com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse = (com.google.android.gms.common.internal.ResolveAccountResponse) obj;
            if (!this.c.equals(resolveAccountResponse.c) || !j$.util.Objects.equals(a(), resolveAccountResponse.a())) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.u(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.h(parcel, 4, this.d);
        aais.h(parcel, 5, this.e);
        aais.g(parcel, iF);
    }
}
