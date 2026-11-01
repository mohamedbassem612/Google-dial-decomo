package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public abstract class Section {
    private final defpackage.aaw mItemsDelegate;
    private final androidx.car.app.model.CarText mNoItemsMessage;
    private final defpackage.xy mOnItemVisibilityChangedDelegate;
    private final androidx.car.app.model.SectionHeader mSectionHeader;
    private final androidx.car.app.model.CarText mTitle;

    protected Section(defpackage.yq yqVar) {
        this.mItemsDelegate = new androidx.car.app.serialization.ListDelegateImpl(j$.util.DesugarCollections.unmodifiableList(yqVar.d));
        androidx.car.app.model.CarText carText = yqVar.e;
        this.mTitle = null;
        androidx.car.app.model.SectionHeader sectionHeader = yqVar.f;
        this.mSectionHeader = null;
        androidx.car.app.model.CarText carText2 = yqVar.g;
        this.mNoItemsMessage = null;
        defpackage.xy xyVar = yqVar.h;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof androidx.car.app.model.Section)) {
            return false;
        }
        androidx.car.app.model.Section section = (androidx.car.app.model.Section) obj;
        if (j$.util.Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && j$.util.Objects.equals(this.mTitle, section.mTitle) && j$.util.Objects.equals(this.mSectionHeader, section.mSectionHeader) && j$.util.Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            return j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), java.lang.Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null));
        }
        return false;
    }

    public defpackage.aaw getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public androidx.car.app.model.CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public defpackage.xy getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public androidx.car.app.model.SectionHeader getSectionHeader() {
        return this.mSectionHeader;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mItemsDelegate, this.mTitle, this.mSectionHeader, this.mNoItemsMessage, java.lang.Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null)});
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", sectionHeader: ");
        sb.append(this.mSectionHeader);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    protected Section() {
        this.mItemsDelegate = new androidx.car.app.serialization.ListDelegateImpl(java.util.Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mSectionHeader = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
