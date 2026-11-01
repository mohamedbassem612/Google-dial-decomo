package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Mileage {
    private final androidx.car.app.hardware.common.CarValue mDistanceDisplayUnit;
    private final androidx.car.app.hardware.common.CarValue mOdometerMeters;

    Mileage(defpackage.vb vbVar) {
        androidx.car.app.hardware.common.CarValue carValue = vbVar.a;
        this.mOdometerMeters = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue2 = vbVar.b;
        this.mDistanceDisplayUnit = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Mileage) {
            androidx.car.app.hardware.info.Mileage mileage = (androidx.car.app.hardware.info.Mileage) obj;
            if (j$.util.Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && j$.util.Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getDistanceDisplayUnit() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mDistanceDisplayUnit);
    }

    public androidx.car.app.hardware.common.CarValue getOdometerInKilometers() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mOdometerMeters);
    }

    @java.lang.Deprecated
    public androidx.car.app.hardware.common.CarValue getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getOdometerInKilometers(), this.mDistanceDisplayUnit});
    }

    public java.lang.String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + ']';
    }

    private Mileage() {
        this.mOdometerMeters = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}
