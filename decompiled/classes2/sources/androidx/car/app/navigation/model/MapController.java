package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class MapController {
    private final androidx.car.app.model.ActionStrip mMapActionStrip;
    private final defpackage.aag mPanModeDelegate;

    MapController(defpackage.zx zxVar) {
        defpackage.aag aagVar = zxVar.a;
        this.mPanModeDelegate = null;
        androidx.car.app.model.ActionStrip actionStrip = zxVar.b;
        this.mMapActionStrip = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.MapController) {
            androidx.car.app.navigation.model.MapController mapController = (androidx.car.app.navigation.model.MapController) obj;
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mPanModeDelegate == null), java.lang.Boolean.valueOf(mapController.mPanModeDelegate == null)) && j$.util.Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public defpackage.aag getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mPanModeDelegate, this.mMapActionStrip});
    }

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }
}
