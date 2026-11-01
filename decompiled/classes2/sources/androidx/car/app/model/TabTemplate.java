package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class TabTemplate implements defpackage.ze {
    private final java.lang.String mActiveTabContentId;
    private final androidx.car.app.model.Action mEndAction;
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final androidx.car.app.model.TabStyle mStyle;
    private final defpackage.yx mTabCallbackDelegate;
    private final androidx.car.app.model.TabContents mTabContents;
    private final java.util.List mTabs;

    TabTemplate(defpackage.zc zcVar) {
        boolean z = zcVar.b;
        this.mIsLoading = false;
        androidx.car.app.model.Action action = zcVar.c;
        this.mHeaderAction = null;
        java.util.List list = zcVar.d;
        this.mTabs = defpackage.rv.d(null);
        androidx.car.app.model.TabContents tabContents = zcVar.f;
        this.mTabContents = null;
        defpackage.yx yxVar = zcVar.a;
        this.mTabCallbackDelegate = null;
        java.lang.String str = zcVar.g;
        this.mActiveTabContentId = null;
        androidx.car.app.model.TabStyle tabStyle = zcVar.h;
        this.mStyle = null;
        androidx.car.app.model.Action action2 = zcVar.e;
        this.mEndAction = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.TabTemplate) {
            androidx.car.app.model.TabTemplate tabTemplate = (androidx.car.app.model.TabTemplate) obj;
            if (this.mIsLoading == tabTemplate.mIsLoading && j$.util.Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && j$.util.Objects.equals(this.mTabs, tabTemplate.mTabs) && j$.util.Objects.equals(this.mTabContents, tabTemplate.mTabContents) && j$.util.Objects.equals(this.mActiveTabContentId, tabTemplate.mActiveTabContentId) && j$.util.Objects.equals(this.mStyle, tabTemplate.mStyle) && j$.util.Objects.equals(this.mEndAction, tabTemplate.mEndAction)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getActiveTabContentId() {
        return (java.lang.String) j$.util.Objects.requireNonNull(this.mActiveTabContentId);
    }

    public androidx.car.app.model.Action getEndAction() {
        return this.mEndAction;
    }

    public androidx.car.app.model.Action getHeaderAction() {
        return (androidx.car.app.model.Action) j$.util.Objects.requireNonNull(this.mHeaderAction);
    }

    public androidx.car.app.model.TabStyle getStyle() {
        return this.mStyle;
    }

    public defpackage.yx getTabCallbackDelegate() {
        return (defpackage.yx) j$.util.Objects.requireNonNull(this.mTabCallbackDelegate);
    }

    public androidx.car.app.model.TabContents getTabContents() {
        return (androidx.car.app.model.TabContents) j$.util.Objects.requireNonNull(this.mTabContents);
    }

    public java.util.List getTabs() {
        return defpackage.rv.c(this.mTabs);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId, this.mStyle, this.mEndAction});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "TabTemplate";
    }

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = java.util.Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
        this.mStyle = null;
        this.mEndAction = null;
    }
}
