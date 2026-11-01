package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class BannerElement {
    public static final int TYPE_ACTION = 1;
    public static final int TYPE_IMAGE = 2;
    private final androidx.car.app.model.Action mAction;
    private final androidx.car.app.model.CarIcon mImage;
    private final int mImageType;
    private final int mType;

    private BannerElement() {
        this.mType = 1;
        this.mImageType = 1;
        this.mAction = null;
        this.mImage = null;
    }

    public static androidx.car.app.model.BannerElement createForAction(androidx.car.app.model.Action action) {
        return new androidx.car.app.model.BannerElement(1, (androidx.car.app.model.Action) j$.util.Objects.requireNonNull(action), null);
    }

    public static androidx.car.app.model.BannerElement createForImageType(androidx.car.app.model.CarIcon carIcon, int i) {
        return new androidx.car.app.model.BannerElement(2, i, null, (androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(carIcon));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.BannerElement) {
            androidx.car.app.model.BannerElement bannerElement = (androidx.car.app.model.BannerElement) obj;
            if (this.mType == bannerElement.mType && this.mImageType == bannerElement.mImageType && j$.util.Objects.equals(this.mAction, bannerElement.mAction) && j$.util.Objects.equals(this.mImage, bannerElement.mImage)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.Action getAction() {
        return this.mAction;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.mType), java.lang.Integer.valueOf(this.mImageType), this.mAction, this.mImage});
    }

    public java.lang.String toString() {
        return "BannerElement { type: " + this.mType + ", imageType: " + this.mImageType + ", action: " + this.mAction + ", image: " + this.mImage + " }";
    }

    private BannerElement(int i, int i2, androidx.car.app.model.Action action, androidx.car.app.model.CarIcon carIcon) {
        this.mType = i;
        this.mImageType = i2;
        this.mAction = action;
        this.mImage = carIcon;
    }

    private BannerElement(int i, androidx.car.app.model.Action action, androidx.car.app.model.CarIcon carIcon) {
        this.mType = i;
        this.mImageType = 1;
        this.mAction = action;
        this.mImage = carIcon;
    }
}
