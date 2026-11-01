package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Background {
    public static final androidx.car.app.model.Background TRANSPARENT;
    private final androidx.car.app.model.CarColor mColor;
    private final androidx.car.app.model.CarIcon mImage;

    static {
        defpackage.wd wdVar = new defpackage.wd();
        androidx.car.app.model.CarColor carColorCreateCustom = androidx.car.app.model.CarColor.createCustom(0, 0);
        defpackage.zj.a.a(carColorCreateCustom);
        wdVar.b = (androidx.car.app.model.CarColor) j$.util.Objects.requireNonNull(carColorCreateCustom);
        if (wdVar.b == null) {
            throw new java.lang.IllegalStateException("Background must have exactly one property set: either Image or Color.");
        }
        TRANSPARENT = new androidx.car.app.model.Background(wdVar);
    }

    public Background(defpackage.wd wdVar) {
        this.mColor = wdVar.b;
        androidx.car.app.model.CarIcon carIcon = wdVar.a;
        this.mImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Background) {
            androidx.car.app.model.Background background = (androidx.car.app.model.Background) obj;
            if (j$.util.Objects.equals(this.mImage, background.mImage) && j$.util.Objects.equals(this.mColor, background.mColor)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarColor getColor() {
        return this.mColor;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mImage);
    }

    public java.lang.String toString() {
        return "Background [image: " + this.mImage + ", color: " + this.mColor + ']';
    }

    private Background() {
        this.mColor = null;
        this.mImage = null;
    }
}
