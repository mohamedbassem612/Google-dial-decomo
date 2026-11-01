package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Banner implements defpackage.xh {
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_MEDIUM = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private static final int MAX_TRAILING_ELEMENTS = 2;
    private final java.util.List mBelowActions;
    private final androidx.car.app.model.BannerElement mLeadingElement;
    private final defpackage.xs mOnClickDelegate;
    private final androidx.car.app.model.BannerStyle mStyle;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;
    private final java.util.List mTrailingElements;

    Banner(defpackage.wf wfVar) {
        androidx.car.app.model.CarText carText = wfVar.a;
        this.mTitle = null;
        androidx.car.app.model.CarText carText2 = wfVar.b;
        this.mSubtitle = null;
        defpackage.xs xsVar = wfVar.c;
        this.mOnClickDelegate = null;
        androidx.car.app.model.BannerStyle bannerStyle = wfVar.d;
        this.mStyle = null;
        androidx.car.app.model.BannerElement bannerElement = wfVar.e;
        this.mLeadingElement = null;
        java.util.List list = wfVar.f;
        this.mTrailingElements = j$.util.DesugarCollections.unmodifiableList((java.util.List) null);
        java.util.List list2 = wfVar.g;
        this.mBelowActions = j$.util.DesugarCollections.unmodifiableList((java.util.List) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Banner) {
            androidx.car.app.model.Banner banner = (androidx.car.app.model.Banner) obj;
            if (j$.util.Objects.equals(this.mTitle, banner.mTitle) && j$.util.Objects.equals(this.mSubtitle, banner.mSubtitle)) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(banner.mOnClickDelegate == null)) && j$.util.Objects.equals(this.mStyle, banner.mStyle) && j$.util.Objects.equals(this.mLeadingElement, banner.mLeadingElement) && j$.util.Objects.equals(this.mTrailingElements, banner.mTrailingElements) && j$.util.Objects.equals(this.mBelowActions, banner.mBelowActions)) {
                    return true;
                }
            }
        }
        return false;
    }

    public java.util.List getBelowActions() {
        return this.mBelowActions;
    }

    public androidx.car.app.model.BannerElement getLeadingElement() {
        return this.mLeadingElement;
    }

    public defpackage.xs getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.BannerStyle getStyle() {
        return this.mStyle;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public java.util.List getTrailingElements() {
        return this.mTrailingElements;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mSubtitle, java.lang.Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle, this.mLeadingElement, this.mTrailingElements, this.mBelowActions});
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Banner { title: ");
        sb.append(androidx.car.app.model.CarText.toShortString(this.mTitle));
        sb.append(", subtitle: ");
        sb.append(androidx.car.app.model.CarText.toShortString(this.mSubtitle));
        sb.append(", has click listener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(", style: ");
        sb.append(this.mStyle);
        sb.append(", leading element: ");
        sb.append(this.mLeadingElement);
        sb.append(", trailing elements: ");
        sb.append(this.mTrailingElements);
        sb.append(", below actions: ");
        sb.append(this.mBelowActions);
        sb.append(" }");
        return sb.toString();
    }

    private Banner() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mOnClickDelegate = null;
        this.mStyle = null;
        this.mLeadingElement = null;
        this.mTrailingElements = java.util.Collections.EMPTY_LIST;
        this.mBelowActions = java.util.Collections.EMPTY_LIST;
    }
}
