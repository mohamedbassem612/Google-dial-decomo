package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Row implements defpackage.xh {
    public static final int IMAGE_TYPE_EXTRA_SMALL = 8;

    @java.lang.Deprecated
    public static final int IMAGE_TYPE_ICON = 4;
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_MEDIUM = 16;
    public static final int IMAGE_TYPE_SMALL = 1;
    public static final int NO_DECORATION = -1;
    private static final java.lang.String YOUR_BOAT = "🚣";
    private final java.util.List mActions;
    private final androidx.car.app.model.CarIcon mEndImage;
    private final androidx.car.app.model.CarIcon mImage;
    private final boolean mIndexable;
    private final boolean mIsBrowsable;
    private final boolean mIsEnabled;
    private final androidx.car.app.model.Metadata mMetadata;
    private final int mNumericDecoration;
    private final defpackage.xs mOnClickDelegate;
    private final androidx.car.app.model.CarProgressBar mProgressBar;
    private final int mRowEndImageType;
    private final int mRowImageType;
    private final java.util.List mTexts;
    private final androidx.car.app.model.CarText mTitle;
    private final androidx.car.app.model.Toggle mToggle;

    public Row(defpackage.yh yhVar) {
        this.mTitle = yhVar.b;
        this.mTexts = defpackage.rv.d(yhVar.c);
        this.mImage = yhVar.d;
        androidx.car.app.model.CarIcon carIcon = yhVar.e;
        this.mEndImage = null;
        this.mActions = defpackage.rv.d(yhVar.f);
        int i = yhVar.g;
        this.mNumericDecoration = -1;
        androidx.car.app.model.Toggle toggle = yhVar.h;
        this.mToggle = null;
        this.mOnClickDelegate = yhVar.i;
        this.mMetadata = yhVar.j;
        boolean z = yhVar.k;
        this.mIsBrowsable = false;
        this.mRowImageType = yhVar.l;
        int i2 = yhVar.m;
        this.mRowEndImageType = 1;
        this.mIsEnabled = yhVar.a;
        boolean z2 = yhVar.n;
        this.mIndexable = true;
        androidx.car.app.model.CarProgressBar carProgressBar = yhVar.o;
        this.mProgressBar = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Row) {
            androidx.car.app.model.Row row = (androidx.car.app.model.Row) obj;
            if (j$.util.Objects.equals(this.mTitle, row.mTitle) && j$.util.Objects.equals(this.mTexts, row.mTexts) && j$.util.Objects.equals(this.mImage, row.mImage) && j$.util.Objects.equals(this.mEndImage, row.mEndImage) && j$.util.Objects.equals(this.mActions, row.mActions) && this.mNumericDecoration == row.mNumericDecoration && j$.util.Objects.equals(this.mToggle, row.mToggle)) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(row.mOnClickDelegate == null)) && j$.util.Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mRowEndImageType == row.mRowEndImageType && this.mIsEnabled == row.isEnabled() && this.mIndexable == row.mIndexable && j$.util.Objects.equals(this.mProgressBar, row.mProgressBar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public androidx.car.app.model.CarIcon getEndImage() {
        return this.mEndImage;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public androidx.car.app.model.Metadata getMetadata() {
        return this.mMetadata;
    }

    public int getNumericDecoration() {
        return this.mNumericDecoration;
    }

    public defpackage.xs getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public int getRowEndImageType() {
        return this.mRowEndImageType;
    }

    public int getRowImageType() {
        return this.mRowImageType;
    }

    public java.util.List getTexts() {
        return defpackage.rv.c(this.mTexts);
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public androidx.car.app.model.Toggle getToggle() {
        return this.mToggle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mTexts, this.mImage, this.mEndImage, this.mActions, java.lang.Integer.valueOf(this.mNumericDecoration), this.mToggle, java.lang.Boolean.valueOf(this.mOnClickDelegate == null), this.mMetadata, java.lang.Boolean.valueOf(this.mIsBrowsable), java.lang.Integer.valueOf(this.mRowImageType), java.lang.Integer.valueOf(this.mRowEndImageType), java.lang.Boolean.valueOf(this.mIsEnabled), java.lang.Boolean.valueOf(this.mIndexable), this.mProgressBar});
    }

    public boolean isBrowsable() {
        return this.mIsBrowsable;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[title: ");
        sb.append(androidx.car.app.model.CarText.toShortString(this.mTitle));
        sb.append(", text count: ");
        java.util.List list = this.mTexts;
        sb.append(list != null ? list.size() : 0);
        sb.append(", image: ");
        sb.append(this.mImage);
        sb.append(", endImage: ");
        sb.append(this.mEndImage);
        sb.append(", isBrowsable: ");
        sb.append(this.mIsBrowsable);
        sb.append(", isEnabled: ");
        sb.append(this.mIsEnabled);
        sb.append(", progressBar: ");
        sb.append(this.mProgressBar);
        sb.append(']');
        return sb.toString();
    }

    public java.lang.CharSequence yourBoat() {
        return YOUR_BOAT;
    }

    public androidx.car.app.model.Row row() {
        return this;
    }

    private Row() {
        this.mTitle = null;
        this.mTexts = java.util.Collections.EMPTY_LIST;
        this.mImage = null;
        this.mEndImage = null;
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mNumericDecoration = -1;
        this.mToggle = null;
        this.mOnClickDelegate = null;
        this.mMetadata = androidx.car.app.model.Metadata.EMPTY_METADATA;
        this.mIsBrowsable = false;
        this.mRowImageType = 1;
        this.mRowEndImageType = 1;
        this.mIsEnabled = true;
        this.mIndexable = true;
        this.mProgressBar = null;
    }
}
