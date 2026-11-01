package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
@java.lang.Deprecated
public final class RoutePreviewNavigationTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.Header mHeader;

    @java.lang.Deprecated
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final androidx.car.app.model.ItemList mItemList;
    private final androidx.car.app.model.ActionStrip mMapActionStrip;
    private final androidx.car.app.model.Action mNavigateAction;
    private final defpackage.aag mPanModeDelegate;

    @java.lang.Deprecated
    private final androidx.car.app.model.CarText mTitle;

    RoutePreviewNavigationTemplate(defpackage.aak aakVar) {
        androidx.car.app.model.CarText carText = aakVar.a;
        this.mTitle = null;
        boolean z = aakVar.b;
        this.mIsLoading = false;
        androidx.car.app.model.Action action = aakVar.c;
        this.mNavigateAction = null;
        androidx.car.app.model.ItemList itemList = aakVar.d;
        this.mItemList = null;
        androidx.car.app.model.Header header = aakVar.e;
        this.mHeader = null;
        androidx.car.app.model.Action action2 = aakVar.f;
        this.mHeaderAction = null;
        androidx.car.app.model.ActionStrip actionStrip = aakVar.g;
        this.mActionStrip = null;
        androidx.car.app.model.ActionStrip actionStrip2 = aakVar.h;
        this.mMapActionStrip = null;
        defpackage.aag aagVar = aakVar.i;
        this.mPanModeDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.RoutePreviewNavigationTemplate) {
            androidx.car.app.navigation.model.RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (androidx.car.app.navigation.model.RoutePreviewNavigationTemplate) obj;
            if (this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && j$.util.Objects.equals(this.mTitle, routePreviewNavigationTemplate.mTitle) && j$.util.Objects.equals(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && j$.util.Objects.equals(this.mItemList, routePreviewNavigationTemplate.mItemList) && j$.util.Objects.equals(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && j$.util.Objects.equals(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && j$.util.Objects.equals(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip)) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mPanModeDelegate == null), java.lang.Boolean.valueOf(routePreviewNavigationTemplate.mPanModeDelegate == null)) && j$.util.Objects.equals(this.mHeader, routePreviewNavigationTemplate.mHeader)) {
                    return true;
                }
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

    @java.lang.Deprecated
    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public androidx.car.app.model.ItemList getItemList() {
        return this.mItemList;
    }

    public androidx.car.app.model.ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public androidx.car.app.model.Action getNavigateAction() {
        return this.mNavigateAction;
    }

    public defpackage.aag getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, java.lang.Boolean.valueOf(this.mIsLoading), this.mNavigateAction, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, java.lang.Boolean.valueOf(this.mPanModeDelegate == null), this.mHeader});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "RoutePreviewNavigationTemplate";
    }

    private RoutePreviewNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mNavigateAction = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
    }
}
