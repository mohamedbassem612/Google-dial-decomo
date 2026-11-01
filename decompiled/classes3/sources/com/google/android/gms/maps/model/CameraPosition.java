package com.google.android.gms.maps.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CameraPosition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(13);
    public final com.google.android.gms.maps.model.LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(com.google.android.gms.maps.model.LatLng latLng, float f, float f2, float f3) {
        aais.at(latLng, "camera target must not be null.");
        aais.ak(f2 >= 0.0f && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", new java.lang.Object[]{java.lang.Float.valueOf(f2)});
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.maps.model.CameraPosition) {
            com.google.android.gms.maps.model.CameraPosition cameraPosition = (com.google.android.gms.maps.model.CameraPosition) obj;
            if (this.a.equals(cameraPosition.a) && java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(cameraPosition.b) && java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(cameraPosition.c) && java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(cameraPosition.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.c), java.lang.Float.valueOf(this.d)});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("target", this.a, arrayList);
        aehj.bX("zoom", java.lang.Float.valueOf(this.b), arrayList);
        aehj.bX("tilt", java.lang.Float.valueOf(this.c), arrayList);
        aehj.bX("bearing", java.lang.Float.valueOf(this.d), arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, this.a, i);
        aais.k(parcel, 3, this.b);
        aais.k(parcel, 4, this.c);
        aais.k(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
