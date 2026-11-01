package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class MapWithContentTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final defpackage.ze mContentTemplate;
    private final androidx.car.app.navigation.model.MapController mMapController;

    MapWithContentTemplate(defpackage.aaa aaaVar) {
        androidx.car.app.navigation.model.MapController mapController = aaaVar.a;
        this.mMapController = null;
        defpackage.ze zeVar = aaaVar.b;
        this.mContentTemplate = null;
        androidx.car.app.model.ActionStrip actionStrip = aaaVar.c;
        this.mActionStrip = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.MapWithContentTemplate) {
            androidx.car.app.navigation.model.MapWithContentTemplate mapWithContentTemplate = (androidx.car.app.navigation.model.MapWithContentTemplate) obj;
            if (j$.util.Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && j$.util.Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && j$.util.Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public defpackage.ze getContentTemplate() {
        return this.mContentTemplate;
    }

    public androidx.car.app.navigation.model.MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mMapController, this.mContentTemplate, this.mActionStrip});
    }

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new defpackage.zz();
        this.mActionStrip = null;
    }
}
