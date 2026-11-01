package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class DistanceSpan extends androidx.car.app.model.CarSpan {
    private final androidx.car.app.model.Distance mDistance;

    private DistanceSpan() {
        this.mDistance = null;
    }

    public static androidx.car.app.model.DistanceSpan create(androidx.car.app.model.Distance distance) {
        return new androidx.car.app.model.DistanceSpan((androidx.car.app.model.Distance) j$.util.Objects.requireNonNull(distance));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.DistanceSpan) {
            return j$.util.Objects.equals(this.mDistance, ((androidx.car.app.model.DistanceSpan) obj).mDistance);
        }
        return false;
    }

    public androidx.car.app.model.Distance getDistance() {
        return (androidx.car.app.model.Distance) j$.util.Objects.requireNonNull(this.mDistance);
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mDistance);
    }

    public java.lang.String toString() {
        return "[distance: " + this.mDistance + ']';
    }

    private DistanceSpan(androidx.car.app.model.Distance distance) {
        this.mDistance = distance;
    }
}
