package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class TabStyle {
    private final androidx.car.app.model.CarColor mSelectedBackgroundColor;
    private final androidx.car.app.model.Shape mShape;
    private final androidx.car.app.model.CarColor mTextColor;

    private TabStyle(defpackage.za zaVar) {
        androidx.car.app.model.Shape shape = zaVar.a;
        this.mShape = null;
        androidx.car.app.model.CarColor carColor = zaVar.b;
        this.mSelectedBackgroundColor = null;
        androidx.car.app.model.CarColor carColor2 = zaVar.c;
        this.mTextColor = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.TabStyle) {
            androidx.car.app.model.TabStyle tabStyle = (androidx.car.app.model.TabStyle) obj;
            if (j$.util.Objects.equals(this.mShape, tabStyle.mShape) && j$.util.Objects.equals(this.mSelectedBackgroundColor, tabStyle.mSelectedBackgroundColor) && j$.util.Objects.equals(this.mTextColor, tabStyle.mTextColor)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarColor getSelectedBackgroundColor() {
        return this.mSelectedBackgroundColor;
    }

    public androidx.car.app.model.Shape getShape() {
        return this.mShape;
    }

    public androidx.car.app.model.CarColor getTextColor() {
        return this.mTextColor;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mShape, this.mSelectedBackgroundColor, this.mTextColor});
    }

    public java.lang.String toString() {
        return "TabStyle { shape: " + this.mShape + ", selectedBackgroundColor: " + this.mSelectedBackgroundColor + ", textColor: " + this.mTextColor + " }";
    }

    /* synthetic */ TabStyle(defpackage.za zaVar, defpackage.zb zbVar) {
        this(zaVar);
    }

    private TabStyle() {
        this.mShape = null;
        this.mSelectedBackgroundColor = null;
        this.mTextColor = null;
    }
}
