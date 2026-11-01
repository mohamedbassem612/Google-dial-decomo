package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Tab {
    private static final java.lang.String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final java.lang.String mContentId;
    private final androidx.car.app.model.CarIcon mIcon;
    private final androidx.car.app.model.TabStyle mStyle;
    private final androidx.car.app.model.CarText mTitle;

    Tab(defpackage.yw ywVar) {
        androidx.car.app.model.CarText carText = ywVar.a;
        this.mTitle = null;
        androidx.car.app.model.CarIcon carIcon = ywVar.b;
        this.mIcon = null;
        androidx.car.app.model.TabStyle tabStyle = ywVar.d;
        this.mStyle = null;
        java.lang.String str = ywVar.c;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Tab) {
            androidx.car.app.model.Tab tab = (androidx.car.app.model.Tab) obj;
            if (j$.util.Objects.equals(this.mTitle, tab.mTitle) && j$.util.Objects.equals(this.mContentId, tab.mContentId) && j$.util.Objects.equals(this.mIcon, tab.mIcon) && j$.util.Objects.equals(this.mStyle, tab.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getContentId() {
        return (java.lang.String) j$.util.Objects.requireNonNull(this.mContentId);
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return (androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(this.mIcon);
    }

    public androidx.car.app.model.TabStyle getStyle() {
        return this.mStyle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(this.mTitle);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mContentId, this.mIcon, this.mStyle});
    }

    public java.lang.String toString() {
        return "Tab { title: " + androidx.car.app.model.CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + this.mIcon + ", style: " + this.mStyle + " }";
    }

    private Tab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
        this.mStyle = null;
    }
}
