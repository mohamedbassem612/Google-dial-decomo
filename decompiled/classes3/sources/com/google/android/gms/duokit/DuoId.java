package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DuoId extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(7);
    public int a;
    public java.lang.String b;

    public DuoId(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.DuoId) {
            com.google.android.gms.duokit.DuoId duoId = (com.google.android.gms.duokit.DuoId) obj;
            if (j$.util.Objects.equals(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(duoId.a)) && j$.util.Objects.equals(this.b, duoId.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }

    public DuoId() {
    }
}
