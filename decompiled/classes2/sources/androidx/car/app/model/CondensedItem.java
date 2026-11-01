package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CondensedItem implements defpackage.xh {
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_MEDIUM = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final boolean mIndexable;
    private final androidx.car.app.model.CarIcon mLeadingImage;
    private final int mLeadingImageType;
    private final defpackage.xs mOnClickDelegate;
    private final androidx.car.app.model.CarProgressBar mProgressBar;
    private final androidx.car.app.model.CondensedItemStyle mStyle;
    private final androidx.car.app.model.CarText mText;
    private final androidx.car.app.model.CarText mTitle;
    private final androidx.car.app.model.CarIcon mTrailingImage;
    private final int mTrailingImageType;

    private CondensedItem(defpackage.ws wsVar) {
        androidx.car.app.model.CarText carText = wsVar.a;
        this.mTitle = null;
        androidx.car.app.model.CarText carText2 = wsVar.b;
        this.mText = null;
        androidx.car.app.model.CarIcon carIcon = wsVar.c;
        this.mLeadingImage = null;
        int i = wsVar.d;
        this.mLeadingImageType = 0;
        androidx.car.app.model.CarIcon carIcon2 = wsVar.e;
        this.mTrailingImage = null;
        int i2 = wsVar.f;
        this.mTrailingImageType = 0;
        androidx.car.app.model.CondensedItemStyle condensedItemStyle = wsVar.g;
        this.mStyle = null;
        defpackage.xs xsVar = wsVar.h;
        this.mOnClickDelegate = null;
        androidx.car.app.model.CarProgressBar carProgressBar = wsVar.i;
        this.mProgressBar = null;
        boolean z = wsVar.j;
        this.mIndexable = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CondensedItem) {
            androidx.car.app.model.CondensedItem condensedItem = (androidx.car.app.model.CondensedItem) obj;
            if (j$.util.Objects.equals(this.mTitle, condensedItem.mTitle) && j$.util.Objects.equals(this.mText, condensedItem.mText) && j$.util.Objects.equals(this.mLeadingImage, condensedItem.mLeadingImage) && this.mLeadingImageType == condensedItem.mLeadingImageType && j$.util.Objects.equals(this.mTrailingImage, condensedItem.mTrailingImage) && this.mTrailingImageType == condensedItem.mTrailingImageType && j$.util.Objects.equals(this.mStyle, condensedItem.mStyle)) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(condensedItem.mOnClickDelegate == null)) && this.mIndexable == condensedItem.mIndexable && j$.util.Objects.equals(this.mProgressBar, condensedItem.mProgressBar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public androidx.car.app.model.CarIcon getLeadingImage() {
        return this.mLeadingImage;
    }

    public int getLeadingImageType() {
        return this.mLeadingImageType;
    }

    public defpackage.xs getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public androidx.car.app.model.CondensedItemStyle getStyle() {
        return this.mStyle;
    }

    public androidx.car.app.model.CarText getText() {
        return this.mText;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public androidx.car.app.model.CarIcon getTrailingImage() {
        return this.mTrailingImage;
    }

    public int getTrailingImageType() {
        return this.mTrailingImageType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mText, this.mLeadingImage, java.lang.Integer.valueOf(this.mLeadingImageType), this.mTrailingImage, java.lang.Integer.valueOf(this.mTrailingImageType), this.mStyle, this.mOnClickDelegate, this.mProgressBar});
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public java.lang.String toString() {
        return "CondensedItem { title: " + this.mTitle + ", text: " + this.mText + ", leadingImage: " + this.mLeadingImage + ", leadingImageType: " + this.mLeadingImageType + ", trailingImage: " + this.mTrailingImage + ", trailingImageType: " + this.mTrailingImageType + ", style: " + this.mStyle + ", onClickDelegate: " + this.mOnClickDelegate + ", progressBar: " + this.mProgressBar + " }";
    }

    /* synthetic */ CondensedItem(defpackage.ws wsVar, defpackage.wt wtVar) {
        this(wsVar);
    }

    private CondensedItem() {
        this.mTitle = null;
        this.mText = null;
        this.mLeadingImage = null;
        this.mLeadingImageType = 1;
        this.mTrailingImage = null;
        this.mTrailingImageType = 1;
        this.mStyle = null;
        this.mOnClickDelegate = null;
        this.mProgressBar = null;
        this.mIndexable = true;
    }
}
