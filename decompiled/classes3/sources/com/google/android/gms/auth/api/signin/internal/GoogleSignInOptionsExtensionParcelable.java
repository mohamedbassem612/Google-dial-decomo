package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GoogleSignInOptionsExtensionParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(19);
    final int a;
    public final int b;
    public final android.os.Bundle c;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, android.os.Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.l(parcel, 2, this.b);
        aais.p(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
