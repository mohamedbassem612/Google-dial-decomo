package com.google.android.gms.pseudonymous;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class PseudonymousIdToken extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(3);
    public final java.lang.String a;

    public PseudonymousIdToken(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.pseudonymous.PseudonymousIdToken) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.pseudonymous.PseudonymousIdToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return "PseudonymousIdToken[" + this.a + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.A(parcel, 2, str);
        defpackage.aais.g(parcel, iF);
    }
}
