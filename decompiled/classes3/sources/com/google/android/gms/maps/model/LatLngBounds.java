package com.google.android.gms.maps.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LatLngBounds extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(14);
    public final com.google.android.gms.maps.model.LatLng a;
    public final com.google.android.gms.maps.model.LatLng b;

    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public LatLngBounds(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        aais.at(latLng, "southwest must not be null.");
        aais.at(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        aais.ak((boolean) (((d > d2 ? 1 : (d == d2 ? 0 : -1)) ^ (-1)) >>> 31), "southern latitude exceeds northern latitude (%s > %s)", new java.lang.Object[]{java.lang.Double.valueOf(d2), java.lang.Double.valueOf(latLng2.a)});
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.maps.model.LatLngBounds) {
            com.google.android.gms.maps.model.LatLngBounds latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) obj;
            if (this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("southwest", this.a, arrayList);
        aehj.bX("northeast", this.b, arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, this.a, i);
        aais.z(parcel, 3, this.b, i);
        aais.g(parcel, iF);
    }
}
