package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarIconSpan extends androidx.car.app.model.CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final androidx.car.app.model.CarIcon mIcon;

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }

    private static java.lang.String alignmentToString(int i) {
        if (i == 0) {
            return "bottom";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "center";
        }
        return "baseline";
    }

    public static androidx.car.app.model.CarIconSpan create(androidx.car.app.model.CarIcon carIcon, int i) {
        defpackage.zk.b.a(carIcon);
        if (i == 1 || i == 0 || i == 2) {
            return new androidx.car.app.model.CarIconSpan((androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(carIcon), i);
        }
        throw new java.lang.IllegalStateException(a.bj(i, "Invalid alignment value: "));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CarIconSpan) {
            return j$.util.Objects.equals(this.mIcon, ((androidx.car.app.model.CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return (androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(this.mIcon);
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mIcon);
    }

    public java.lang.String toString() {
        return "[icon: " + this.mIcon + ", alignment: " + alignmentToString(this.mAlignment) + ']';
    }

    private CarIconSpan(androidx.car.app.model.CarIcon carIcon, int i) {
        this.mIcon = carIcon;
        this.mAlignment = i;
    }

    public static androidx.car.app.model.CarIconSpan create(androidx.car.app.model.CarIcon carIcon) {
        return create(carIcon, 1);
    }
}
