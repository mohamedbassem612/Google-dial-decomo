package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Accelerometer {
    private final androidx.car.app.hardware.common.CarValue mForces;

    public Accelerometer(androidx.car.app.hardware.common.CarValue carValue) {
        this.mForces = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(carValue);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Accelerometer) {
            return j$.util.Objects.equals(this.mForces, ((androidx.car.app.hardware.info.Accelerometer) obj).mForces);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getForces() {
        return this.mForces;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mForces});
    }

    public java.lang.String toString() {
        return "[ forces: " + this.mForces + " ]";
    }

    private Accelerometer() {
        this.mForces = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT_LIST;
    }
}
