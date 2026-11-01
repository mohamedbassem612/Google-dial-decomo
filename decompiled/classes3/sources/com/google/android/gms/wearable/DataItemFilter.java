package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DataItemFilter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(11);
    public final android.net.Uri a;
    public final int b;

    public DataItemFilter(android.net.Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.wearable.DataItemFilter)) {
            return false;
        }
        com.google.android.gms.wearable.DataItemFilter dataItemFilter = (com.google.android.gms.wearable.DataItemFilter) obj;
        return j$.util.Objects.equals(this.a, dataItemFilter.a) && this.b == dataItemFilter.b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("uri", this.a);
        ahymVarL.e("filterType", this.b);
        return ahymVarL.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.net.Uri uri = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, uri, i);
        aais.l(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
