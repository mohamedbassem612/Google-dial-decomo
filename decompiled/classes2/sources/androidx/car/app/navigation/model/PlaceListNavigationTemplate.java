package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
@java.lang.Deprecated
public final class PlaceListNavigationTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.Header mHeader;

    @java.lang.Deprecated
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final androidx.car.app.model.ItemList mItemList;
    private final androidx.car.app.model.ActionStrip mMapActionStrip;
    private final defpackage.xv mOnContentRefreshDelegate;
    private final defpackage.aag mPanModeDelegate;

    @java.lang.Deprecated
    private final androidx.car.app.model.CarText mTitle;

    PlaceListNavigationTemplate(defpackage.aaj aajVar) {
        java.lang.Object obj = aajVar.b;
        this.mTitle = null;
        boolean z = aajVar.a;
        this.mIsLoading = false;
        java.lang.Object obj2 = aajVar.c;
        this.mItemList = null;
        java.lang.Object obj3 = aajVar.d;
        this.mHeader = null;
        java.lang.Object obj4 = aajVar.e;
        this.mHeaderAction = null;
        java.lang.Object obj5 = aajVar.f;
        this.mActionStrip = null;
        java.lang.Object obj6 = aajVar.g;
        this.mMapActionStrip = null;
        java.lang.Object obj7 = aajVar.h;
        this.mPanModeDelegate = null;
        java.lang.Object obj8 = aajVar.i;
        this.mOnContentRefreshDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.PlaceListNavigationTemplate) {
            androidx.car.app.navigation.model.PlaceListNavigationTemplate placeListNavigationTemplate = (androidx.car.app.navigation.model.PlaceListNavigationTemplate) obj;
            if (this.mIsLoading == placeListNavigationTemplate.mIsLoading && j$.util.Objects.equals(this.mTitle, placeListNavigationTemplate.mTitle) && j$.util.Objects.equals(this.mItemList, placeListNavigationTemplate.mItemList) && j$.util.Objects.equals(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && j$.util.Objects.equals(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && j$.util.Objects.equals(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip)) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mPanModeDelegate == null), java.lang.Boolean.valueOf(placeListNavigationTemplate.mPanModeDelegate == null))) {
                    if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnContentRefreshDelegate == null), java.lang.Boolean.valueOf(placeListNavigationTemplate.mOnContentRefreshDelegate == null)) && j$.util.Objects.equals(this.mHeader, placeListNavigationTemplate.mHeader)) {
                        return true;
                    }
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

    public defpackage.xv getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public defpackage.aag getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, java.lang.Boolean.valueOf(this.mIsLoading), this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, java.lang.Boolean.valueOf(this.mPanModeDelegate == null), java.lang.Boolean.valueOf(this.mOnContentRefreshDelegate == null), this.mHeader});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "PlaceListNavigationTemplate";
    }

    private PlaceListNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
        this.mOnContentRefreshDelegate = null;
    }
}
