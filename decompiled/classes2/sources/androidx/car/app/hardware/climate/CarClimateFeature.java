package androidx.car.app.hardware.climate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarClimateFeature {
    private final java.util.List mCarZones;
    private final int mFeature;

    CarClimateFeature(defpackage.uw uwVar) {
        java.util.List list = uwVar.b;
        this.mCarZones = j$.util.DesugarCollections.unmodifiableList((java.util.List) null);
        int i = uwVar.a;
        this.mFeature = 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.car.app.hardware.climate.CarClimateFeature carClimateFeature = (androidx.car.app.hardware.climate.CarClimateFeature) obj;
            if (j$.util.Objects.equals(java.lang.Integer.valueOf(this.mFeature), java.lang.Integer.valueOf(carClimateFeature.mFeature)) && j$.util.Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.mFeature), this.mCarZones});
    }

    public java.lang.String toString() {
        return "ClimateProfileFeature{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + '}';
    }
}
