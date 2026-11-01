package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(18);

    @java.lang.Deprecated
    final java.lang.String a;
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount b;

    @java.lang.Deprecated
    final java.lang.String c;

    public SignInAccount(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, java.lang.String str2) {
        this.b = googleSignInAccount;
        aais.aq(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        aais.aq(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 4, this.a);
        aais.z(parcel, 7, this.b, i);
        aais.A(parcel, 8, this.c);
        aais.g(parcel, iF);
    }
}
