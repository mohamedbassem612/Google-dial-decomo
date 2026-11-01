package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class GridTemplate implements defpackage.ze {
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_LARGE = 4;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;

    @java.lang.Deprecated
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final java.util.List mActions;
    private final androidx.car.app.model.Header mHeader;

    @java.lang.Deprecated
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final int mItemImageShape;
    private final int mItemSize;
    private final androidx.car.app.model.ItemList mSingleList;

    @java.lang.Deprecated
    private final androidx.car.app.model.CarText mTitle;

    public GridTemplate(defpackage.xb xbVar) {
        this.mIsLoading = xbVar.a;
        androidx.car.app.model.CarText carText = xbVar.c;
        this.mTitle = null;
        androidx.car.app.model.Action action = xbVar.d;
        this.mHeaderAction = null;
        this.mSingleList = xbVar.b;
        androidx.car.app.model.ActionStrip actionStrip = xbVar.e;
        this.mActionStrip = null;
        this.mActions = defpackage.rv.d(xbVar.f);
        this.mItemSize = xbVar.g;
        int i = xbVar.h;
        this.mItemImageShape = 1;
        androidx.car.app.model.Header header = xbVar.i;
        this.mHeader = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.GridTemplate) {
            androidx.car.app.model.GridTemplate gridTemplate = (androidx.car.app.model.GridTemplate) obj;
            if (this.mIsLoading == gridTemplate.mIsLoading && j$.util.Objects.equals(this.mTitle, gridTemplate.mTitle) && j$.util.Objects.equals(this.mHeaderAction, gridTemplate.mHeaderAction) && j$.util.Objects.equals(this.mSingleList, gridTemplate.mSingleList) && j$.util.Objects.equals(this.mActionStrip, gridTemplate.mActionStrip) && j$.util.Objects.equals(this.mActions, gridTemplate.mActions) && this.mItemSize == gridTemplate.mItemSize && this.mItemImageShape == gridTemplate.mItemImageShape && j$.util.Objects.equals(this.mHeader, gridTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public androidx.car.app.model.Header getHeader() {
        androidx.car.app.model.Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        defpackage.xc xcVar = new defpackage.xc();
        androidx.car.app.model.CarText carText = this.mTitle;
        if (carText != null) {
            xcVar.d(carText);
        }
        androidx.car.app.model.Action action = this.mHeaderAction;
        if (action != null) {
            xcVar.c(action);
        }
        androidx.car.app.model.ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            java.util.Iterator it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                xcVar.b((androidx.car.app.model.Action) it.next());
            }
        }
        return xcVar.a();
    }

    @java.lang.Deprecated
    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    public androidx.car.app.model.ItemList getSingleList() {
        return this.mSingleList;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mActionStrip, java.lang.Integer.valueOf(this.mItemSize), java.lang.Integer.valueOf(this.mItemImageShape), this.mHeader});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "GridTemplate";
    }

    private GridTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mActionStrip = null;
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mItemSize = 1;
        this.mItemImageShape = 1;
        this.mHeader = null;
    }
}
