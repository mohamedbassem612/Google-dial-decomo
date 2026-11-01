package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarProgressBarStyle {
    private final androidx.car.app.model.CarColor mColor;
    private final int mStrokeCap;
    private final androidx.car.app.model.CarColor mTrackColor;

    private CarProgressBarStyle(wn wnVar) {
        java.lang.Object obj = wnVar.b;
        this.mColor = null;
        java.lang.Object obj2 = wnVar.c;
        this.mTrackColor = null;
        int i = wnVar.a;
        this.mStrokeCap = 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CarProgressBarStyle) {
            androidx.car.app.model.CarProgressBarStyle carProgressBarStyle = (androidx.car.app.model.CarProgressBarStyle) obj;
            if (j$.util.Objects.equals(this.mColor, carProgressBarStyle.mColor) && j$.util.Objects.equals(this.mTrackColor, carProgressBarStyle.mTrackColor) && this.mStrokeCap == carProgressBarStyle.mStrokeCap) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarColor getColor() {
        return this.mColor;
    }

    public int getStrokeCap() {
        return this.mStrokeCap;
    }

    public androidx.car.app.model.CarColor getTrackColor() {
        return this.mTrackColor;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mColor, this.mTrackColor, java.lang.Integer.valueOf(this.mStrokeCap)});
    }

    public java.lang.String toString() {
        return "CarProgressBarStyle{color=" + this.mColor + ", trackColor=" + this.mTrackColor + ", strokeCap=" + this.mStrokeCap + '}';
    }

    /* synthetic */ CarProgressBarStyle(wn wnVar, defpackage.wo woVar) {
        this(wnVar);
    }

    private CarProgressBarStyle() {
        this.mColor = null;
        this.mTrackColor = null;
        this.mStrokeCap = 0;
    }
}
