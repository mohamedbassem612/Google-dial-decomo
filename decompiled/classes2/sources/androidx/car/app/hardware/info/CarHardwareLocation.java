package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarHardwareLocation {
    public static final androidx.car.app.hardware.common.CarValue UNIMPLEMENTED_LOCATION = new androidx.car.app.hardware.common.CarValue(null, 0, 2);
    public static final androidx.car.app.hardware.common.CarValue UNKNOWN_LOCATION = new androidx.car.app.hardware.common.CarValue(null, 0, 0);
    private final androidx.car.app.hardware.common.CarValue mLocation;

    public CarHardwareLocation(androidx.car.app.hardware.common.CarValue carValue) {
        this.mLocation = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(carValue);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.CarHardwareLocation) {
            return j$.util.Objects.equals(this.mLocation, ((androidx.car.app.hardware.info.CarHardwareLocation) obj).mLocation);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getLocation() {
        return this.mLocation;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mLocation});
    }

    public java.lang.String toString() {
        return "[ location: " + this.mLocation + " ]";
    }

    private CarHardwareLocation() {
        this.mLocation = UNKNOWN_LOCATION;
    }
}
