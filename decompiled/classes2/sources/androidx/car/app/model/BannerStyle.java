package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class BannerStyle {
    private final androidx.car.app.model.Background mBackground;
    private final androidx.car.app.model.Shape mShape;

    private BannerStyle(defpackage.wh whVar) {
        androidx.car.app.model.Shape shape = whVar.a;
        this.mShape = null;
        androidx.car.app.model.Background background = whVar.b;
        this.mBackground = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.BannerStyle) {
            androidx.car.app.model.BannerStyle bannerStyle = (androidx.car.app.model.BannerStyle) obj;
            if (j$.util.Objects.equals(this.mShape, bannerStyle.mShape) && j$.util.Objects.equals(this.mBackground, bannerStyle.mBackground)) {
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
        return "BannerStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    /* synthetic */ BannerStyle(defpackage.wh whVar, wi wiVar) {
        this(whVar);
    }

    private BannerStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
