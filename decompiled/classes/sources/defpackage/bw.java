package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class bw {
    int e;
    int f;
    int g;
    int h;
    public int i;
    public boolean j;
    public java.lang.String l;
    public int m;
    public java.lang.CharSequence n;
    public int o;
    public java.lang.CharSequence p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;
    java.util.ArrayList t;
    public final java.util.ArrayList d = new java.util.ArrayList();
    boolean k = true;
    public boolean s = false;

    public abstract void c();

    public abstract void d();

    public void e(int i, defpackage.aw awVar, java.lang.String str, int i2) {
        throw null;
    }

    public boolean h() {
        throw null;
    }

    public void j(defpackage.aw awVar) {
        throw null;
    }

    public void k(defpackage.aw awVar) {
        throw null;
    }

    public void l(defpackage.aw awVar, defpackage.emq emqVar) {
        throw null;
    }

    public void m(defpackage.aw awVar) {
        throw null;
    }

    final void n(defpackage.bv bvVar) {
        this.d.add(bvVar);
        bvVar.d = this.e;
        bvVar.e = this.f;
        bvVar.f = this.g;
        bvVar.g = this.h;
    }

    public final void o(java.lang.String str) {
        if (!this.k) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.j = true;
        this.l = str;
    }

    public final void p() {
        if (this.j) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void q(int i, defpackage.aw awVar, java.lang.String str) {
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Must use non-zero containerViewId");
        }
        e(i, awVar, str, 2);
    }

    public final void r(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.g = 0;
        this.h = 0;
    }

    public final void s() {
        this.s = true;
    }

    public final void t(android.view.ViewGroup viewGroup, defpackage.aw awVar, java.lang.String str) {
        awVar.P = viewGroup;
        awVar.x = true;
        e(viewGroup.getId(), awVar, str, 1);
    }
}
