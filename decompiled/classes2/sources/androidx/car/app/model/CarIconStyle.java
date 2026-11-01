package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class CarIconStyle {
    private final androidx.car.app.model.Shape mShape;
    private final androidx.car.app.model.CarColor mTint;
    public static final androidx.car.app.model.CarIconStyle TINTED = new androidx.car.app.model.CarIconStyle(androidx.car.app.model.CarColor.DEFAULT, (androidx.car.app.model.Shape) null);
    public static final androidx.car.app.model.CarIconStyle ORIGINAL = new androidx.car.app.model.CarIconStyle((androidx.car.app.model.CarColor) null, (androidx.car.app.model.Shape) null);

    private CarIconStyle(defpackage.wk wkVar) {
        this.mTint = wkVar.a;
        this.mShape = wkVar.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CarIconStyle) {
            androidx.car.app.model.CarIconStyle carIconStyle = (androidx.car.app.model.CarIconStyle) obj;
            if (j$.util.Objects.equals(this.mTint, carIconStyle.mTint) && j$.util.Objects.equals(this.mShape, carIconStyle.mShape)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.Shape getShape() {
        return this.mShape;
    }

    public androidx.car.app.model.CarColor getTint() {
        return this.mTint;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTint, this.mShape});
    }

    public java.lang.String toString() {
        return "CarIconStyle { tint: " + this.mTint + ", shape: " + this.mShape + " }";
    }

    public CarIconStyle(androidx.car.app.model.CarColor carColor, androidx.car.app.model.Shape shape) {
        this.mTint = carColor;
        this.mShape = shape;
    }

    public /* synthetic */ CarIconStyle(defpackage.wk wkVar, wl wlVar) {
        this(wkVar);
    }

    private CarIconStyle() {
        this.mShape = null;
        this.mTint = null;
    }
}
