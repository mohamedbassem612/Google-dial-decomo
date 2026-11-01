package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarLocation {
    private final double mLat;
    private final double mLng;

    private CarLocation(double d, double d2) {
        this.mLat = d;
        this.mLng = d2;
    }

    public static androidx.car.app.model.CarLocation create(android.location.Location location) {
        j$.util.Objects.requireNonNull(location);
        return create(location.getLatitude(), location.getLongitude());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CarLocation) {
            androidx.car.app.model.CarLocation carLocation = (androidx.car.app.model.CarLocation) obj;
            if (java.lang.Double.doubleToLongBits(this.mLat) == java.lang.Double.doubleToLongBits(carLocation.mLat) && java.lang.Double.doubleToLongBits(this.mLng) == java.lang.Double.doubleToLongBits(carLocation.mLng)) {
                return true;
            }
        }
        return false;
    }

    public double getLatitude() {
        return this.mLat;
    }

    public double getLongitude() {
        return this.mLng;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Double.valueOf(this.mLat), java.lang.Double.valueOf(this.mLng)});
    }

    public java.lang.String toString() {
        return "[" + getLatitude() + ", " + getLongitude() + ']';
    }

    private CarLocation() {
        this(0.0d, 0.0d);
    }

    public static androidx.car.app.model.CarLocation create(double d, double d2) {
        return new androidx.car.app.model.CarLocation(d, d2);
    }
}
