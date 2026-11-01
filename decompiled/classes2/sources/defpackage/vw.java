package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class vw {
    public boolean a;
    public androidx.car.app.model.CarText b;
    public androidx.car.app.model.CarIcon c;
    public defpackage.xs d;
    public androidx.car.app.model.CarColor e;
    public int f;
    public int g;

    public vw(androidx.car.app.model.Action action) {
        this.a = true;
        this.e = androidx.car.app.model.CarColor.DEFAULT;
        this.f = 1;
        this.g = 0;
        j$.util.Objects.requireNonNull(action);
        this.f = action.getType();
        this.c = action.getIcon();
        this.b = action.getTitle();
        this.d = action.getOnClickDelegate();
        androidx.car.app.model.CarColor backgroundColor = action.getBackgroundColor();
        this.e = backgroundColor == null ? androidx.car.app.model.CarColor.DEFAULT : backgroundColor;
        this.g = action.getFlags();
        this.a = action.isEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    public final androidx.car.app.model.Action a() {
        androidx.car.app.model.CarText carText;
        androidx.car.app.model.CarText carText2;
        androidx.car.app.model.CarText carText3;
        if (!androidx.car.app.model.Action.isStandardActionType(this.f) && this.c == null && ((carText3 = this.b) == null || android.text.TextUtils.isEmpty(carText3.toString()))) {
            throw new java.lang.IllegalStateException("An action must have either an icon or a title");
        }
        int i = this.f;
        if (i == 65538) {
            if (this.d == null) {
                throw new java.lang.IllegalStateException(java.lang.String.format("An on-click listener can't be set on an action of type %s", java.lang.Integer.valueOf(i)));
            }
            if (this.c == null || ((carText = this.b) != null && !android.text.TextUtils.isEmpty(carText.toString()))) {
                throw new java.lang.IllegalStateException("An icon or title can't be set on the standard back or app-icon action");
            }
        } else if (i == 65539) {
            i = 65539;
            if (this.d == null) {
                throw new java.lang.IllegalStateException(java.lang.String.format("An on-click listener can't be set on an action of type %s", java.lang.Integer.valueOf(i)));
            }
            if (this.c == null) {
            }
            throw new java.lang.IllegalStateException("An icon or title can't be set on the standard back or app-icon action");
        }
        int i2 = this.f;
        if (i2 == 65540) {
            if (this.d != null) {
                throw new java.lang.IllegalStateException("An on-click listener can't be set on the pan mode action");
            }
        } else if (i2 == 65541) {
            if (this.d != null) {
                throw new java.lang.IllegalStateException("An on-click listener can't be set on the compose action");
            }
            androidx.car.app.model.CarText carText4 = this.b;
            if (carText4 != null && !android.text.TextUtils.isEmpty(carText4.toString())) {
                throw new java.lang.IllegalStateException("A title can't be set on the standard compose action");
            }
        }
        if (this.f != 65542 || (this.c == null && ((carText2 = this.b) == null || android.text.TextUtils.isEmpty(carText2.toString())))) {
            return new androidx.car.app.model.Action(this);
        }
        throw new java.lang.IllegalStateException("MEDIA_PLAYBACK actions cannot have icons or titles");
    }

    public final void b(androidx.car.app.model.CarColor carColor) {
        defpackage.zj.a.a((androidx.car.app.model.CarColor) j$.util.Objects.requireNonNull(carColor));
        this.e = carColor;
    }

    public final void c(androidx.car.app.model.CarIcon carIcon) {
        defpackage.zk.b.a((androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(carIcon));
        this.c = carIcon;
    }

    public final void d(defpackage.xu xuVar) {
        this.d = androidx.car.app.model.OnClickDelegateImpl.create(xuVar);
    }

    public vw() {
        this.a = true;
        this.e = androidx.car.app.model.CarColor.DEFAULT;
        this.f = 1;
        this.g = 0;
    }
}
