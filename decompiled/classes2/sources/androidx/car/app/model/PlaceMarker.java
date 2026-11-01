package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class PlaceMarker {
    private static final int MAX_LABEL_LENGTH = 3;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_IMAGE = 1;
    private final androidx.car.app.model.CarColor mColor;
    private final androidx.car.app.model.CarIcon mIcon;
    private final int mIconType;
    private final androidx.car.app.model.CarText mLabel;

    PlaceMarker(defpackage.yg ygVar) {
        java.lang.Object obj = ygVar.b;
        this.mIcon = null;
        int i = ygVar.a;
        this.mIconType = 0;
        java.lang.Object obj2 = ygVar.c;
        this.mLabel = null;
        java.lang.Object obj3 = ygVar.d;
        this.mColor = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.PlaceMarker) {
            androidx.car.app.model.PlaceMarker placeMarker = (androidx.car.app.model.PlaceMarker) obj;
            if (j$.util.Objects.equals(this.mIcon, placeMarker.mIcon) && j$.util.Objects.equals(this.mLabel, placeMarker.mLabel) && j$.util.Objects.equals(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarColor getColor() {
        return this.mColor;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public int getIconType() {
        return this.mIconType;
    }

    public androidx.car.app.model.CarText getLabel() {
        return this.mLabel;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mIcon, this.mLabel, this.mColor, java.lang.Integer.valueOf(this.mIconType)});
    }

    public java.lang.String toString() {
        java.lang.String shortString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        androidx.car.app.model.CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            shortString = carIcon.toString();
        } else {
            androidx.car.app.model.CarText carText = this.mLabel;
            shortString = carText != null ? androidx.car.app.model.CarText.toShortString(carText) : super.toString();
        }
        sb.append(shortString);
        sb.append(']');
        return sb.toString();
    }

    private PlaceMarker() {
        this.mIcon = null;
        this.mIconType = 0;
        this.mLabel = null;
        this.mColor = null;
    }
}
