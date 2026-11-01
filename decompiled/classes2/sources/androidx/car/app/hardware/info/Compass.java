package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Compass {
    private final androidx.car.app.hardware.common.CarValue mOrientations;

    public Compass(androidx.car.app.hardware.common.CarValue carValue) {
        this.mOrientations = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(carValue);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Compass) {
            return j$.util.Objects.equals(this.mOrientations, ((androidx.car.app.hardware.info.Compass) obj).mOrientations);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getOrientations() {
        return this.mOrientations;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mOrientations});
    }

    public java.lang.String toString() {
        return "[ orientations: " + this.mOrientations + " ]";
    }

    private Compass() {
        this.mOrientations = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT_LIST;
    }
}
