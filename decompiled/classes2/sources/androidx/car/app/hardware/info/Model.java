package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Model {
    private final androidx.car.app.hardware.common.CarValue mManufacturer;
    private final androidx.car.app.hardware.common.CarValue mName;
    private final androidx.car.app.hardware.common.CarValue mYear;

    Model(defpackage.vc vcVar) {
        androidx.car.app.hardware.common.CarValue carValue = vcVar.a;
        this.mName = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue2 = vcVar.c;
        this.mManufacturer = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.hardware.common.CarValue carValue3 = vcVar.b;
        this.mYear = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Model) {
            androidx.car.app.hardware.info.Model model = (androidx.car.app.hardware.info.Model) obj;
            if (j$.util.Objects.equals(this.mName, model.mName) && j$.util.Objects.equals(this.mYear, model.mYear) && j$.util.Objects.equals(this.mManufacturer, model.mManufacturer)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getManufacturer() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mManufacturer);
    }

    public androidx.car.app.hardware.common.CarValue getName() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mName);
    }

    public androidx.car.app.hardware.common.CarValue getYear() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mYear);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mName, this.mYear, this.mManufacturer});
    }

    public java.lang.String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + ']';
    }

    private Model() {
        androidx.car.app.hardware.common.CarValue carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_STRING;
        this.mName = carValue;
        this.mManufacturer = carValue;
        this.mYear = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}
