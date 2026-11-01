package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class StartCallRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(14);
    public com.google.android.gms.duokit.DuoId a;
    public int b;
    public boolean c;
    public java.lang.String d;

    public StartCallRequest(com.google.android.gms.duokit.DuoId duoId, int i, boolean z, java.lang.String str) {
        this.a = duoId;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.StartCallRequest) {
            com.google.android.gms.duokit.StartCallRequest startCallRequest = (com.google.android.gms.duokit.StartCallRequest) obj;
            if (j$.util.Objects.equals(this.a, startCallRequest.a) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(startCallRequest.b)) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(startCallRequest.c)) && j$.util.Objects.equals(this.d, startCallRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Boolean.valueOf(this.c), this.d});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.l(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.A(parcel, 4, this.d);
        aais.g(parcel, iF);
    }

    public StartCallRequest() {
    }
}
