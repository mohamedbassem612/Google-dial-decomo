package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class GetApiAvailabilityResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new xkl(8);
    public int a;

    public GetApiAvailabilityResponse(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.GetApiAvailabilityResponse) {
            return j$.util.Objects.equals(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(((com.google.android.gms.duokit.GetApiAvailabilityResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 1, this.a);
        defpackage.aais.g(parcel, iF);
    }

    public GetApiAvailabilityResponse() {
    }
}
