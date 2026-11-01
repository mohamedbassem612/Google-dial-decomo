package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SignInRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(1);
    final int a;
    final com.google.android.gms.common.internal.ResolveAccountRequest b;

    public SignInRequest(int i, com.google.android.gms.common.internal.ResolveAccountRequest resolveAccountRequest) {
        this.a = i;
        this.b = resolveAccountRequest;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
