package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class GoogleTabTemplate implements defpackage.ze {
    private final java.lang.String mActiveTabContentId;
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final defpackage.yx mTabCallbackDelegate;
    private final com.android.car.libraries.apphost.external.model.GoogleTabContents mTabContents;
    private final java.util.List mTabs;

    public GoogleTabTemplate(defpackage.hgx hgxVar) {
        this.mIsLoading = hgxVar.b;
        this.mHeaderAction = hgxVar.c;
        this.mTabs = new java.util.ArrayList(hgxVar.d);
        this.mTabContents = hgxVar.e;
        this.mTabCallbackDelegate = hgxVar.a;
        this.mActiveTabContentId = hgxVar.f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.car.libraries.apphost.external.model.GoogleTabTemplate) {
            com.android.car.libraries.apphost.external.model.GoogleTabTemplate googleTabTemplate = (com.android.car.libraries.apphost.external.model.GoogleTabTemplate) obj;
            if (this.mIsLoading == googleTabTemplate.mIsLoading && j$.util.Objects.equals(this.mHeaderAction, googleTabTemplate.mHeaderAction) && j$.util.Objects.equals(this.mTabs, googleTabTemplate.mTabs) && j$.util.Objects.equals(this.mTabContents, googleTabTemplate.mTabContents) && j$.util.Objects.equals(this.mActiveTabContentId, googleTabTemplate.getActiveTabContentId())) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getActiveTabContentId() {
        return this.mActiveTabContentId;
    }

    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public defpackage.yx getTabCallbackDelegate() {
        return (defpackage.yx) j$.util.Objects.requireNonNull(this.mTabCallbackDelegate);
    }

    public com.android.car.libraries.apphost.external.model.GoogleTabContents getTabContents() {
        return this.mTabContents;
    }

    public java.util.List getTabs() {
        java.util.List list = this.mTabs;
        return list == null ? new java.util.ArrayList() : list;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "TabTemplate";
    }

    private GoogleTabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = new java.util.ArrayList();
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }
}
