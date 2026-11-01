package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ChipStyle {
    private final androidx.car.app.model.CarColor mBackgroundColor;
    private final androidx.car.app.model.CarColor mContentColor;
    private final androidx.car.app.model.CarColor mOutlineColor;
    private final androidx.car.app.model.Shape mShape;

    ChipStyle(defpackage.wr wrVar) {
        androidx.car.app.model.CarColor carColor = wrVar.a;
        this.mBackgroundColor = null;
        androidx.car.app.model.CarColor carColor2 = wrVar.b;
        this.mContentColor = null;
        androidx.car.app.model.CarColor carColor3 = wrVar.c;
        this.mOutlineColor = null;
        androidx.car.app.model.Shape shape = wrVar.d;
        this.mShape = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.ChipStyle) {
            androidx.car.app.model.ChipStyle chipStyle = (androidx.car.app.model.ChipStyle) obj;
            if (j$.util.Objects.equals(this.mBackgroundColor, chipStyle.mBackgroundColor) && j$.util.Objects.equals(this.mContentColor, chipStyle.mContentColor) && j$.util.Objects.equals(this.mOutlineColor, chipStyle.mOutlineColor) && j$.util.Objects.equals(this.mShape, chipStyle.mShape)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public androidx.car.app.model.CarColor getContentColor() {
        return this.mContentColor;
    }

    public androidx.car.app.model.CarColor getOutlineColor() {
        return this.mOutlineColor;
    }

    public androidx.car.app.model.Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mBackgroundColor, this.mContentColor, this.mOutlineColor, this.mShape});
    }

    public java.lang.String toString() {
        return "ChipStyle{backgroundColor=" + this.mBackgroundColor + ", contentColor=" + this.mContentColor + ", outlineColor=" + this.mOutlineColor + ", shape=" + this.mShape + '}';
    }

    private ChipStyle() {
        this.mBackgroundColor = null;
        this.mContentColor = null;
        this.mOutlineColor = null;
        this.mShape = null;
    }
}
