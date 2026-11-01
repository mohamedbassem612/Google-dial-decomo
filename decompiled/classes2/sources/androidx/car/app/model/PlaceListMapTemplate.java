package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class PlaceListMapTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.Place mAnchor;
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final androidx.car.app.model.ItemList mItemList;
    private final defpackage.xv mOnContentRefreshDelegate;
    private final boolean mShowCurrentLocation;
    private final androidx.car.app.model.CarText mTitle;

    PlaceListMapTemplate(defpackage.yf yfVar) {
        boolean z = yfVar.a;
        this.mShowCurrentLocation = false;
        boolean z2 = yfVar.b;
        this.mIsLoading = false;
        androidx.car.app.model.CarText carText = yfVar.c;
        this.mTitle = null;
        androidx.car.app.model.ItemList itemList = yfVar.d;
        this.mItemList = null;
        androidx.car.app.model.Action action = yfVar.e;
        this.mHeaderAction = null;
        androidx.car.app.model.ActionStrip actionStrip = yfVar.f;
        this.mActionStrip = null;
        androidx.car.app.model.Place place = yfVar.g;
        this.mAnchor = null;
        defpackage.xv xvVar = yfVar.h;
        this.mOnContentRefreshDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.PlaceListMapTemplate) {
            androidx.car.app.model.PlaceListMapTemplate placeListMapTemplate = (androidx.car.app.model.PlaceListMapTemplate) obj;
            if (this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && j$.util.Objects.equals(this.mTitle, placeListMapTemplate.mTitle) && j$.util.Objects.equals(this.mItemList, placeListMapTemplate.mItemList) && j$.util.Objects.equals(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && j$.util.Objects.equals(this.mActionStrip, placeListMapTemplate.mActionStrip) && j$.util.Objects.equals(this.mAnchor, placeListMapTemplate.mAnchor)) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnContentRefreshDelegate == null), java.lang.Boolean.valueOf(placeListMapTemplate.mOnContentRefreshDelegate == null))) {
                    return true;
                }
            }
        }
        return false;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public androidx.car.app.model.Place getAnchor() {
        return this.mAnchor;
    }

    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public androidx.car.app.model.ItemList getItemList() {
        return this.mItemList;
    }

    public defpackage.xv getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mShowCurrentLocation), java.lang.Boolean.valueOf(this.mIsLoading), this.mTitle, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mAnchor, java.lang.Boolean.valueOf(this.mOnContentRefreshDelegate == null)});
    }

    public boolean isCurrentLocationEnabled() {
        return this.mShowCurrentLocation;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "PlaceListMapTemplate";
    }

    private PlaceListMapTemplate() {
        this.mShowCurrentLocation = false;
        this.mIsLoading = false;
        this.mTitle = null;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mAnchor = null;
        this.mOnContentRefreshDelegate = null;
    }
}
