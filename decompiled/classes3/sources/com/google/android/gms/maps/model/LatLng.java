package com.google.android.gms.maps.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LatLng extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(15);
    public final double a;
    public final double b;

    public LatLng(double d, double d2) {
        this.b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.a = java.lang.Math.max(-90.0d, java.lang.Math.min(90.0d, d));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.maps.model.LatLng) {
            com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) obj;
            if (java.lang.Double.doubleToLongBits(this.a) == java.lang.Double.doubleToLongBits(latLng.a) && java.lang.Double.doubleToLongBits(this.b) == java.lang.Double.doubleToLongBits(latLng.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.a);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.b);
        return ((((int) j) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final java.lang.String toString() {
        return "lat/lng: (" + this.a + ',' + this.b + ')';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.j(parcel, 2, this.a);
        aais.j(parcel, 3, this.b);
        aais.g(parcel, iF);
    }
}
