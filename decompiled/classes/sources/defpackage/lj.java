package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class lj extends defpackage.km {
    boolean i = true;

    public abstract boolean e(defpackage.ld ldVar, defpackage.ld ldVar2, int i, int i2, int i3, int i4);

    public abstract boolean f(defpackage.ld ldVar, int i, int i2, int i3, int i4);

    public abstract void i(defpackage.ld ldVar);

    public abstract void j(defpackage.ld ldVar);

    @Override // defpackage.km
    public final boolean n(defpackage.ld ldVar, kl klVar, kl klVar2) {
        int i;
        int i2;
        if (klVar != null && ((i = klVar.a) != (i2 = klVar2.a) || klVar.b != klVar2.b)) {
            return f(ldVar, i, klVar.b, i2, klVar2.b);
        }
        i(ldVar);
        return true;
    }

    @Override // defpackage.km
    public final boolean o(defpackage.ld ldVar, defpackage.ld ldVar2, kl klVar, kl klVar2) {
        int i;
        int i2;
        int i3 = klVar.a;
        int i4 = klVar.b;
        if (ldVar2.A()) {
            int i5 = klVar.a;
            i2 = klVar.b;
            i = i5;
        } else {
            i = klVar2.a;
            i2 = klVar2.b;
        }
        return e(ldVar, ldVar2, i3, i4, i, i2);
    }

    @Override // defpackage.km
    public final boolean p(defpackage.ld ldVar, kl klVar, kl klVar2) {
        int top;
        int left;
        int i = klVar.a;
        int i2 = klVar.b;
        android.view.View view = ldVar.a;
        if (klVar2 == null) {
            left = view.getLeft();
            top = view.getTop();
        } else {
            int i3 = klVar2.a;
            top = klVar2.b;
            left = i3;
        }
        if (ldVar.v() || (i == left && i2 == top)) {
            j(ldVar);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return f(ldVar, i, i2, left, top);
    }

    @Override // defpackage.km
    public final boolean q(defpackage.ld ldVar, kl klVar, kl klVar2) {
        int i = klVar.a;
        int i2 = klVar2.a;
        if (i != i2 || klVar.b != klVar2.b) {
            return f(ldVar, i, klVar.b, i2, klVar2.b);
        }
        l(ldVar);
        return false;
    }

    @Override // defpackage.km
    public final boolean r(defpackage.ld ldVar) {
        return !this.i || ldVar.t();
    }

    public final void u() {
        this.i = false;
    }
}
