package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Speed {
    private final androidx.car.app.hardware.common.CarValue mDisplaySpeedMetersPerSecond;
    private final androidx.car.app.hardware.common.CarValue mRawSpeedMetersPerSecond;
    private final androidx.car.app.hardware.common.CarValue mSpeedDisplayUnit;

    Speed(defpackage.vd vdVar) {
        androidx.car.app.hardware.common.CarValue carValue = vdVar.a;
        this.mRawSpeedMetersPerSecond = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue2 = vdVar.b;
        this.mDisplaySpeedMetersPerSecond = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue3 = vdVar.c;
        this.mSpeedDisplayUnit = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Speed) {
            androidx.car.app.hardware.info.Speed speed = (androidx.car.app.hardware.info.Speed) obj;
            if (j$.util.Objects.equals(getRawSpeedMetersPerSecond(), speed.getRawSpeedMetersPerSecond()) && j$.util.Objects.equals(getDisplaySpeedMetersPerSecond(), speed.getDisplaySpeedMetersPerSecond()) && j$.util.Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getDisplaySpeedMetersPerSecond() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mDisplaySpeedMetersPerSecond);
    }

    public androidx.car.app.hardware.common.CarValue getRawSpeedMetersPerSecond() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mRawSpeedMetersPerSecond);
    }

    public androidx.car.app.hardware.common.CarValue getSpeedDisplayUnit() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mSpeedDisplayUnit);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getRawSpeedMetersPerSecond(), getDisplaySpeedMetersPerSecond(), this.mSpeedDisplayUnit});
    }

    public java.lang.String toString() {
        return "[ raw speed: " + getRawSpeedMetersPerSecond() + ", display speed: " + getDisplaySpeedMetersPerSecond() + ", speed display unit: " + this.mSpeedDisplayUnit + ']';
    }

    private Speed() {
        androidx.car.app.hardware.common.CarValue carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
        this.mSpeedDisplayUnit = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}
