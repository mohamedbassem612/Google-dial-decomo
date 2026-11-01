package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarProgressBar {
    private final float mProgress;
    private final androidx.car.app.model.CarProgressBarStyle mStyle;

    CarProgressBar(defpackage.wm wmVar) {
        float f = wmVar.a;
        this.mProgress = 0.0f;
        java.lang.Object obj = wmVar.b;
        this.mStyle = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CarProgressBar) {
            androidx.car.app.model.CarProgressBar carProgressBar = (androidx.car.app.model.CarProgressBar) obj;
            if (this.mProgress == carProgressBar.mProgress && j$.util.Objects.equals(this.mStyle, carProgressBar.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public androidx.car.app.model.CarProgressBarStyle getStyle() {
        return this.mStyle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Float.valueOf(this.mProgress), this.mStyle});
    }

    public java.lang.String toString() {
        return "[progress: " + this.mProgress + ", style: " + this.mStyle + ']';
    }

    private CarProgressBar() {
        this.mProgress = 0.0f;
        this.mStyle = null;
    }
}
