package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class SearchHeader {
    private final java.util.List mEndHeaderActions;
    private final java.lang.String mInitialSearchText;
    private final defpackage.yl mSearchCallbackDelegate;
    private final java.lang.String mSearchHint;
    private final boolean mShowKeyboardByDefault;
    private final androidx.car.app.model.Action mStartHeaderAction;

    SearchHeader(defpackage.yo yoVar) {
        defpackage.yl ylVar = yoVar.a;
        this.mSearchCallbackDelegate = null;
        java.lang.String str = yoVar.b;
        this.mInitialSearchText = null;
        java.lang.String str2 = yoVar.c;
        this.mSearchHint = null;
        boolean z = yoVar.d;
        this.mShowKeyboardByDefault = false;
        androidx.car.app.model.Action action = yoVar.e;
        this.mStartHeaderAction = null;
        java.util.List list = yoVar.f;
        this.mEndHeaderActions = defpackage.rv.d(null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.SearchHeader) {
            androidx.car.app.model.SearchHeader searchHeader = (androidx.car.app.model.SearchHeader) obj;
            if (this.mShowKeyboardByDefault == searchHeader.mShowKeyboardByDefault && j$.util.Objects.equals(this.mInitialSearchText, searchHeader.mInitialSearchText) && j$.util.Objects.equals(this.mSearchHint, searchHeader.mSearchHint) && j$.util.Objects.equals(this.mStartHeaderAction, searchHeader.mStartHeaderAction) && j$.util.Objects.equals(this.mEndHeaderActions, searchHeader.mEndHeaderActions)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public java.lang.String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public defpackage.yl getSearchCallbackDelegate() {
        return (defpackage.yl) j$.util.Objects.requireNonNull(this.mSearchCallbackDelegate);
    }

    public java.lang.String getSearchHint() {
        return this.mSearchHint;
    }

    public androidx.car.app.model.Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mInitialSearchText, this.mSearchHint, java.lang.Boolean.valueOf(this.mShowKeyboardByDefault), this.mStartHeaderAction, this.mEndHeaderActions});
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public java.lang.String toString() {
        return "SearchHeader";
    }

    private SearchHeader() {
        this.mSearchCallbackDelegate = null;
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mShowKeyboardByDefault = true;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = java.util.Collections.EMPTY_LIST;
    }
}
