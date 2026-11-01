package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class Badge {
    private final androidx.car.app.model.CarColor mDotColor;
    private final boolean mHasDot;
    private final androidx.car.app.model.CarIcon mIcon;
    private final androidx.car.app.model.CarColor mIconBackgroundColor;

    public Badge(defpackage.we weVar) {
        boolean z = weVar.a;
        this.mHasDot = false;
        java.lang.Object obj = weVar.b;
        this.mDotColor = null;
        this.mIcon = (androidx.car.app.model.CarIcon) weVar.c;
        java.lang.Object obj2 = weVar.d;
        this.mIconBackgroundColor = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Badge) {
            androidx.car.app.model.Badge badge = (androidx.car.app.model.Badge) obj;
            if (this.mHasDot == badge.mHasDot && j$.util.Objects.equals(this.mDotColor, badge.mDotColor) && j$.util.Objects.equals(this.mIcon, badge.mIcon) && j$.util.Objects.equals(this.mIconBackgroundColor, badge.mIconBackgroundColor)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarColor getBackgroundColor() {
        return this.mDotColor;
    }

    public androidx.car.app.model.CarColor getDotColor() {
        return this.mDotColor;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public androidx.car.app.model.CarColor getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mHasDot), this.mDotColor, this.mIcon, this.mIconBackgroundColor});
    }

    public java.lang.String toString() {
        return "[hasDot: " + this.mHasDot + ", dotColor: " + this.mDotColor + ", icon: " + this.mIcon + ", iconBackgroundColor: " + this.mIconBackgroundColor + ']';
    }

    private Badge() {
        this.mHasDot = false;
        this.mDotColor = null;
        this.mIcon = null;
        this.mIconBackgroundColor = null;
    }
}
