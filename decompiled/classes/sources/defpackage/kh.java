package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class kh {
    public final defpackage.ki b = new defpackage.ki();
    public boolean c = false;
    public int d = 1;

    public abstract int a();

    public int b(int i) {
        return 0;
    }

    public long c(int i) {
        return -1L;
    }

    public abstract defpackage.ld d(android.view.ViewGroup viewGroup, int i);

    public final void e() {
        this.b.a();
    }

    public final void f(int i) {
        this.b.c(i, 1, null);
    }

    public final void g(int i) {
        this.b.d(i, 1);
    }

    public final void h(int i, int i2) {
        this.b.b(i, i2);
    }

    public final void i(int i, int i2) {
        this.b.c(i, i2, null);
    }

    public final void j(int i, int i2) {
        this.b.d(i, i2);
    }

    public final void k(int i, int i2) {
        this.b.e(i, i2);
    }

    public abstract void m(defpackage.ld ldVar, int i);

    public final void r(boolean z) {
        if (this.b.g()) {
            throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.c = z;
    }

    public final boolean s() {
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return false;
            }
        } else if (a() <= 0) {
            return false;
        }
        return true;
    }

    public final void t(int i) {
        this.d = i;
        this.b.f();
    }

    public final void u(defpackage.den denVar) {
        this.b.registerObserver(denVar);
    }

    public final void v(defpackage.den denVar) {
        this.b.unregisterObserver(denVar);
    }

    public void l(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void n(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void o(defpackage.ld ldVar) {
    }

    public void p(defpackage.ld ldVar) {
    }

    public void q(defpackage.ld ldVar) {
    }
}
