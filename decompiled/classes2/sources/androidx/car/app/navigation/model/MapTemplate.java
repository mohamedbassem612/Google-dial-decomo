package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
@java.lang.Deprecated
public final class MapTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.Header mHeader;
    private final androidx.car.app.model.ItemList mItemList;
    private final androidx.car.app.navigation.model.MapController mMapController;
    private final androidx.car.app.model.Pane mPane;

    MapTemplate(defpackage.zy zyVar) {
        androidx.car.app.navigation.model.MapController mapController = zyVar.a;
        this.mMapController = null;
        androidx.car.app.model.Pane pane = zyVar.b;
        this.mPane = null;
        androidx.car.app.model.ItemList itemList = zyVar.c;
        this.mItemList = null;
        androidx.car.app.model.Header header = zyVar.d;
        this.mHeader = null;
        androidx.car.app.model.ActionStrip actionStrip = zyVar.e;
        this.mActionStrip = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.MapTemplate) {
            androidx.car.app.navigation.model.MapTemplate mapTemplate = (androidx.car.app.navigation.model.MapTemplate) obj;
            if (j$.util.Objects.equals(this.mPane, mapTemplate.mPane) && j$.util.Objects.equals(this.mItemList, mapTemplate.mItemList) && j$.util.Objects.equals(this.mHeader, mapTemplate.mHeader) && j$.util.Objects.equals(this.mMapController, mapTemplate.mMapController) && j$.util.Objects.equals(this.mActionStrip, mapTemplate.mActionStrip)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public androidx.car.app.model.ItemList getItemList() {
        return this.mItemList;
    }

    public androidx.car.app.navigation.model.MapController getMapController() {
        return this.mMapController;
    }

    public androidx.car.app.model.Pane getPane() {
        return this.mPane;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mMapController, this.mPane, this.mItemList, this.mHeader, this.mActionStrip});
    }

    private MapTemplate() {
        this.mMapController = null;
        this.mPane = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mActionStrip = null;
    }
}
