package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class GoogleTab {
    private static final java.lang.String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final java.lang.String mContentId;
    private final androidx.car.app.model.CarIcon mIcon;
    private final androidx.car.app.model.CarText mTitle;

    public GoogleTab(defpackage.hgv hgvVar) {
        this.mTitle = hgvVar.a;
        this.mIcon = hgvVar.b;
        java.lang.String str = hgvVar.c;
        this.mContentId = str == null ? EMPTY_TAB_CONTENT_ID : str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.car.libraries.apphost.external.model.GoogleTab) {
            com.android.car.libraries.apphost.external.model.GoogleTab googleTab = (com.android.car.libraries.apphost.external.model.GoogleTab) obj;
            if (j$.util.Objects.equals(this.mTitle, googleTab.mTitle) && j$.util.Objects.equals(this.mContentId, googleTab.mContentId) && j$.util.Objects.equals(this.mIcon, googleTab.mIcon)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getContentId() {
        return (java.lang.String) j$.util.Objects.requireNonNull(this.mContentId);
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mContentId, this.mIcon});
    }

    public java.lang.String toString() {
        androidx.car.app.model.CarIcon carIcon = this.mIcon;
        return "[title: " + androidx.car.app.model.CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + java.lang.String.valueOf(carIcon) + ']';
    }

    private GoogleTab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
    }
}
