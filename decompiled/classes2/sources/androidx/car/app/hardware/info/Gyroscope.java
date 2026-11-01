package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Gyroscope {
    private final androidx.car.app.hardware.common.CarValue mRotations;

    public Gyroscope(androidx.car.app.hardware.common.CarValue carValue) {
        this.mRotations = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(carValue);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Gyroscope) {
            return j$.util.Objects.equals(this.mRotations, ((androidx.car.app.hardware.info.Gyroscope) obj).mRotations);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getRotations() {
        return this.mRotations;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mRotations});
    }

    public java.lang.String toString() {
        return "[ rotations: " + this.mRotations + " ]";
    }

    private Gyroscope() {
        this.mRotations = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT_LIST;
    }
}
