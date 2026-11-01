package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SignInResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(0);
    final int a;
    public final com.google.android.gms.common.ConnectionResult b;
    public final com.google.android.gms.common.internal.ResolveAccountResponse c;

    public SignInResponse(int i, com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse) {
        this.a = i;
        this.b = connectionResult;
        this.c = resolveAccountResponse;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
