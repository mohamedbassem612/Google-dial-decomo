package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class wk {
    public androidx.car.app.model.CarColor a;
    public final androidx.car.app.model.Shape b;

    public wk(androidx.car.app.model.CarIconStyle carIconStyle) {
        j$.util.Objects.requireNonNull(carIconStyle);
        this.a = carIconStyle.mTint;
        this.b = carIconStyle.mShape;
    }

    public final void a(androidx.car.app.model.CarColor carColor) {
        defpackage.zj.a.a((androidx.car.app.model.CarColor) j$.util.Objects.requireNonNull(carColor));
        this.a = carColor;
    }
}
