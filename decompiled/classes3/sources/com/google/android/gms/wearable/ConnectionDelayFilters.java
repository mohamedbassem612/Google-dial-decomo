package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ConnectionDelayFilters extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(9);
    public final java.util.List a;

    public ConnectionDelayFilters(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.wearable.ConnectionDelayFilters) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.wearable.ConnectionDelayFilters) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("dataItemFilters", this.a);
        return ahymVarL.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, list);
        aais.g(parcel, iF);
    }
}
