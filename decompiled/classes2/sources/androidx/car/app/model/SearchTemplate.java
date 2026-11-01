package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class SearchTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.Action mHeaderAction;
    private final java.lang.String mInitialSearchText;
    private final boolean mIsLoading;
    private final androidx.car.app.model.ItemList mItemList;
    private final defpackage.yl mSearchCallbackDelegate;
    private final java.lang.String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    SearchTemplate(defpackage.yp ypVar) {
        java.lang.String str = ypVar.b;
        this.mInitialSearchText = null;
        java.lang.String str2 = ypVar.c;
        this.mSearchHint = null;
        boolean z = ypVar.d;
        this.mIsLoading = false;
        androidx.car.app.model.ItemList itemList = ypVar.e;
        this.mItemList = null;
        defpackage.yl ylVar = ypVar.a;
        this.mSearchCallbackDelegate = null;
        boolean z2 = ypVar.f;
        this.mShowKeyboardByDefault = false;
        androidx.car.app.model.Action action = ypVar.g;
        this.mHeaderAction = null;
        androidx.car.app.model.ActionStrip actionStrip = ypVar.h;
        this.mActionStrip = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.SearchTemplate) {
            androidx.car.app.model.SearchTemplate searchTemplate = (androidx.car.app.model.SearchTemplate) obj;
            if (this.mIsLoading == searchTemplate.mIsLoading && j$.util.Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && j$.util.Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && j$.util.Objects.equals(this.mItemList, searchTemplate.mItemList) && j$.util.Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && j$.util.Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public java.lang.String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public androidx.car.app.model.ItemList getItemList() {
        return this.mItemList;
    }

    public defpackage.yl getSearchCallbackDelegate() {
        return (defpackage.yl) j$.util.Objects.requireNonNull(this.mSearchCallbackDelegate);
    }

    public java.lang.String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mInitialSearchText, java.lang.Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, java.lang.Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public java.lang.String toString() {
        return "SearchTemplate";
    }

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }
}
