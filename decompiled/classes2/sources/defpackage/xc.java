package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class xc {
    public final java.util.List a = new java.util.ArrayList();
    public androidx.car.app.model.Action b;
    public androidx.car.app.model.CarText c;
    public androidx.car.app.model.CarText d;
    public androidx.car.app.model.Background e;
    public androidx.car.app.model.CarIcon f;

    public final androidx.car.app.model.Header a() {
        if (androidx.car.app.model.CarText.isNullOrEmpty(this.c) && this.b == null) {
            throw new java.lang.IllegalStateException("Either the title or start header action must be set");
        }
        return new androidx.car.app.model.Header(this);
    }

    public final void b(androidx.car.app.model.Action action) {
        this.a.add((androidx.car.app.model.Action) j$.util.Objects.requireNonNull(action));
    }

    public final void c(androidx.car.app.model.Action action) {
        defpackage.zi.a.a(java.util.Collections.singletonList((androidx.car.app.model.Action) j$.util.Objects.requireNonNull(action)));
        this.b = action;
    }

    public final void d(androidx.car.app.model.CarText carText) {
        this.c = (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(carText);
        defpackage.zl.d.a(this.c);
    }

    public final void e(java.lang.CharSequence charSequence) {
        d(androidx.car.app.model.CarText.create(charSequence));
    }
}
