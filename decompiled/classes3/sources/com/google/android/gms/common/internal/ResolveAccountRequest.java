package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ResolveAccountRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(2);
    final int a;
    public final android.accounts.Account b;
    public final int c;
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount d;

    public ResolveAccountRequest(int i, android.accounts.Account account, int i2, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i);
        aais.l(parcel, 3, this.c);
        aais.z(parcel, 4, this.d, i);
        aais.g(parcel, iF);
    }
}
