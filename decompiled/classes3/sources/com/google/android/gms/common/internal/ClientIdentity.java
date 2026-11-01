package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ClientIdentity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(15);
    public final int a;
    public final java.lang.String b;

    public ClientIdentity(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.internal.ClientIdentity) {
            com.google.android.gms.common.internal.ClientIdentity clientIdentity = (com.google.android.gms.common.internal.ClientIdentity) obj;
            if (clientIdentity.a == this.a && j$.util.Objects.equals(clientIdentity.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return this.a + ':' + this.b;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
