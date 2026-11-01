package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RemoteUserReachability extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(13);
    public com.google.android.gms.duokit.DuoId a;
    public int b;
    public int c;
    public int d;

    public RemoteUserReachability(com.google.android.gms.duokit.DuoId duoId, int i, int i2, int i3) {
        this.a = duoId;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.RemoteUserReachability) {
            com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability = (com.google.android.gms.duokit.RemoteUserReachability) obj;
            if (j$.util.Objects.equals(this.a, remoteUserReachability.a) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(remoteUserReachability.b)) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(remoteUserReachability.c)) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(remoteUserReachability.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.l(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.g(parcel, iF);
    }

    public RemoteUserReachability() {
    }
}
