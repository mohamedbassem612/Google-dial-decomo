package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GoogleAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(13);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public GoogleAccount(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.auth.aang.GoogleAccount) {
            com.google.android.gms.auth.aang.GoogleAccount googleAccount = (com.google.android.gms.auth.aang.GoogleAccount) obj;
            if (j$.util.Objects.equals(this.a, googleAccount.a) && j$.util.Objects.equals(this.c, googleAccount.c) && j$.util.Objects.equals(this.b, googleAccount.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.c, this.b});
    }

    public final java.lang.String toString() {
        return "Account=" + this.c + ",obfuscated gaiaId=" + this.a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
