package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SignInConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(20);
    public final java.lang.String a;
    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions b;

    public SignInConfiguration(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        aais.ap(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.signin.internal.SignInConfiguration)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) obj;
        if (!this.a.equals(signInConfiguration.a)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = this.b;
        if (googleSignInOptions == null) {
            if (signInConfiguration.b != null) {
                return false;
            }
        } else if (!googleSignInOptions.equals(signInConfiguration.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        xm xmVar = new xm((byte[]) null);
        xmVar.d(this.a);
        xmVar.d(this.b);
        return xmVar.a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.z(parcel, 5, this.b, i);
        aais.g(parcel, iF);
    }
}
