package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CondensedItemStyle {
    private final androidx.car.app.model.Background mBackground;
    private final androidx.car.app.model.Shape mShape;

    private CondensedItemStyle(defpackage.wu wuVar) {
        androidx.car.app.model.Shape shape = wuVar.a;
        this.mShape = null;
        androidx.car.app.model.Background background = wuVar.b;
        this.mBackground = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CondensedItemStyle) {
            androidx.car.app.model.CondensedItemStyle condensedItemStyle = (androidx.car.app.model.CondensedItemStyle) obj;
            if (j$.util.Objects.equals(this.mShape, condensedItemStyle.mShape) && j$.util.Objects.equals(this.mBackground, condensedItemStyle.mBackground)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.Background getBackground() {
        return this.mBackground;
    }

    public androidx.car.app.model.Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mShape, this.mBackground});
    }

    public java.lang.String toString() {
        return "CondensedItemStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    /* synthetic */ CondensedItemStyle(defpackage.wu wuVar, wv wvVar) {
        this(wuVar);
    }

    private CondensedItemStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
