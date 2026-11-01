package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class SectionHeader {
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final androidx.car.app.model.CarIcon mEndIcon;
    private final androidx.car.app.model.CarText mHeadline;
    private final defpackage.xs mOnClickDelegate;
    private final androidx.car.app.model.CarIcon mStartIcon;
    private final int mStartIconType;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    SectionHeader(defpackage.yr yrVar) {
        androidx.car.app.model.CarText carText = yrVar.a;
        this.mTitle = (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.model.CarText carText2 = yrVar.b;
        this.mHeadline = null;
        androidx.car.app.model.CarText carText3 = yrVar.c;
        this.mSubtitle = null;
        androidx.car.app.model.CarIcon carIcon = yrVar.d;
        this.mStartIcon = null;
        int i = yrVar.e;
        this.mStartIconType = 0;
        androidx.car.app.model.CarIcon carIcon2 = yrVar.f;
        this.mEndIcon = null;
        defpackage.xs xsVar = yrVar.g;
        this.mOnClickDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.SectionHeader) {
            androidx.car.app.model.SectionHeader sectionHeader = (androidx.car.app.model.SectionHeader) obj;
            if (j$.util.Objects.equals(this.mHeadline, sectionHeader.mHeadline) && j$.util.Objects.equals(this.mTitle, sectionHeader.mTitle) && j$.util.Objects.equals(this.mSubtitle, sectionHeader.mSubtitle) && j$.util.Objects.equals(this.mStartIcon, sectionHeader.mStartIcon) && this.mStartIconType == sectionHeader.mStartIconType && j$.util.Objects.equals(this.mEndIcon, sectionHeader.mEndIcon)) {
                if ((this.mOnClickDelegate == null) == (sectionHeader.mOnClickDelegate == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public androidx.car.app.model.CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public androidx.car.app.model.CarText getHeadline() {
        return this.mHeadline;
    }

    public defpackage.xs getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public int getStartIconType() {
        return this.mStartIconType;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mHeadline, this.mTitle, this.mSubtitle, this.mStartIcon, java.lang.Integer.valueOf(this.mStartIconType), this.mEndIcon, java.lang.Boolean.valueOf(this.mOnClickDelegate == null)});
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionHeader { headline: ");
        sb.append(this.mHeadline);
        sb.append(", title: ");
        sb.append(this.mTitle);
        sb.append(", subtitle: ");
        sb.append(this.mSubtitle);
        sb.append(", startIcon: ");
        sb.append(this.mStartIcon);
        sb.append(", startIconType: ");
        sb.append(this.mStartIconType);
        sb.append(", endIcon: ");
        sb.append(this.mEndIcon);
        sb.append(", hasClickListener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(" }");
        return sb.toString();
    }

    private SectionHeader() {
        this.mTitle = androidx.car.app.model.CarText.create("");
        this.mHeadline = null;
        this.mSubtitle = null;
        this.mStartIcon = null;
        this.mStartIconType = 1;
        this.mEndIcon = null;
        this.mOnClickDelegate = null;
    }
}
