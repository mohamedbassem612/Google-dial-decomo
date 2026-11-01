package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class EnergyLevel {
    private final androidx.car.app.hardware.common.CarValue mBatteryPercent;
    private final androidx.car.app.hardware.common.CarValue mDistanceDisplayUnit;
    private final androidx.car.app.hardware.common.CarValue mEnergyIsLow;
    private final androidx.car.app.hardware.common.CarValue mFuelPercent;
    private final androidx.car.app.hardware.common.CarValue mFuelVolumeDisplayUnit;
    private final androidx.car.app.hardware.common.CarValue mRangeRemainingMeters;

    EnergyLevel(defpackage.uy uyVar) {
        androidx.car.app.hardware.common.CarValue carValue = uyVar.a;
        this.mBatteryPercent = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue2 = uyVar.b;
        this.mFuelPercent = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue3 = uyVar.c;
        this.mEnergyIsLow = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue4 = uyVar.d;
        this.mRangeRemainingMeters = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue5 = uyVar.e;
        this.mDistanceDisplayUnit = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue6 = uyVar.f;
        this.mFuelVolumeDisplayUnit = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.EnergyLevel) {
            androidx.car.app.hardware.info.EnergyLevel energyLevel = (androidx.car.app.hardware.info.EnergyLevel) obj;
            if (j$.util.Objects.equals(this.mBatteryPercent, energyLevel.mBatteryPercent) && j$.util.Objects.equals(this.mFuelPercent, energyLevel.mFuelPercent) && j$.util.Objects.equals(this.mEnergyIsLow, energyLevel.mEnergyIsLow) && j$.util.Objects.equals(getRangeRemainingMeters(), energyLevel.getRangeRemainingMeters()) && j$.util.Objects.equals(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && j$.util.Objects.equals(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getBatteryPercent() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mBatteryPercent);
    }

    public androidx.car.app.hardware.common.CarValue getDistanceDisplayUnit() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mDistanceDisplayUnit);
    }

    public androidx.car.app.hardware.common.CarValue getEnergyIsLow() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mEnergyIsLow);
    }

    public androidx.car.app.hardware.common.CarValue getFuelPercent() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mFuelPercent);
    }

    public androidx.car.app.hardware.common.CarValue getFuelVolumeDisplayUnit() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mFuelVolumeDisplayUnit);
    }

    public androidx.car.app.hardware.common.CarValue getRangeRemainingMeters() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mRangeRemainingMeters);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mBatteryPercent, this.mFuelPercent, this.mEnergyIsLow, getRangeRemainingMeters(), this.mDistanceDisplayUnit, this.mFuelVolumeDisplayUnit});
    }

    public java.lang.String toString() {
        return "[ battery percent: " + this.mBatteryPercent + ", fuel percent: " + this.mFuelPercent + ", energyIsLow: " + this.mEnergyIsLow + ", range remaining: " + getRangeRemainingMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + ", fuel volume display unit: " + this.mFuelVolumeDisplayUnit + ']';
    }

    private EnergyLevel() {
        androidx.car.app.hardware.common.CarValue carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mEnergyIsLow = androidx.car.app.hardware.common.CarValue.UNKNOWN_BOOLEAN;
        this.mRangeRemainingMeters = carValue;
        androidx.car.app.hardware.common.CarValue carValue2 = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }
}
