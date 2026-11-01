package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class yh {
    public androidx.car.app.model.CarText b;
    public androidx.car.app.model.CarIcon d;
    public androidx.car.app.model.CarIcon e;
    public androidx.car.app.model.Toggle h;
    public defpackage.xs i;
    public boolean k;
    public androidx.car.app.model.CarProgressBar o;
    public boolean a = true;
    public final java.util.List c = new java.util.ArrayList();
    public final java.util.List f = new java.util.ArrayList();
    public final int g = -1;
    public final androidx.car.app.model.Metadata j = androidx.car.app.model.Metadata.EMPTY_METADATA;
    public int l = 1;
    public final int m = 1;
    public final boolean n = true;

    public final androidx.car.app.model.Row a() {
        if (this.b != null) {
            return new androidx.car.app.model.Row(this);
        }
        throw new java.lang.IllegalStateException("A title must be set on the row");
    }

    public final void b(androidx.car.app.model.Action action) {
        java.util.List list = this.f;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.add((androidx.car.app.model.Action) j$.util.Objects.requireNonNull(action));
        defpackage.zi.b.a(arrayList);
        list.add(action);
    }

    public final void c(java.lang.CharSequence charSequence) {
        defpackage.zl.f.a(androidx.car.app.model.CarText.create((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence)));
        this.c.add(androidx.car.app.model.CarText.create((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence)));
    }

    public final void d(androidx.car.app.model.CarIcon carIcon, int i) {
        defpackage.zk.a.a((androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(carIcon));
        this.d = carIcon;
        this.l = i;
    }

    public final void e(defpackage.xu xuVar) {
        this.i = androidx.car.app.model.OnClickDelegateImpl.create(xuVar);
    }

    public final void f(java.lang.CharSequence charSequence) {
        androidx.car.app.model.CarText carTextCreate = androidx.car.app.model.CarText.create((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence));
        if (carTextCreate.isEmpty()) {
            throw new java.lang.IllegalArgumentException("The title cannot be null or empty");
        }
        defpackage.zl.e.a(carTextCreate);
        this.b = carTextCreate;
    }
}
