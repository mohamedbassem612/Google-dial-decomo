package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ip {
    public android.view.View d;
    public final defpackage.apnt e;
    public int c = 0;
    public final defpackage.io a = new defpackage.io();
    public final java.util.List b = new java.util.ArrayList();

    public ip(defpackage.apnt apntVar) {
        this.e = apntVar;
    }

    private final int m(int i) {
        int i2 = -1;
        if (i >= 0) {
            int iD = this.e.D();
            int i3 = i;
            while (i3 < iD) {
                defpackage.io ioVar = this.a;
                int iA = i - (i3 - ioVar.a(i3));
                if (iA == 0) {
                    i2 = i3;
                    while (ioVar.f(i2)) {
                        i2++;
                    }
                    break;
                }
                i3 += iA;
            }
        }
        return i2;
    }

    public final int a() {
        return this.e.D() - this.b.size();
    }

    public final int b() {
        return this.e.D();
    }

    final int c(android.view.View view) {
        int iE = this.e.E(view);
        if (iE == -1) {
            return -1;
        }
        defpackage.io ioVar = this.a;
        if (ioVar.f(iE)) {
            return -1;
        }
        return iE - ioVar.a(iE);
    }

    public final android.view.View d(int i) {
        return this.e.F(m(i));
    }

    public final android.view.View e(int i) {
        return this.e.F(i);
    }

    public final void f(android.view.View view, int i, boolean z) {
        int iD = i < 0 ? this.e.D() : m(i);
        this.a.c(iD, z);
        if (z) {
            i(view);
        }
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.e.a;
        recyclerView.addView(view, iD);
        defpackage.ld ldVar = view == null ? null : ((defpackage.kq) view.getLayoutParams()).c;
        defpackage.kh khVar = recyclerView.m;
        if (khVar != null && ldVar != null) {
            khVar.o(ldVar);
        }
        java.util.List list = recyclerView.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public final void g(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        int iD = i < 0 ? this.e.D() : m(i);
        this.a.c(iD, z);
        if (z) {
            i(view);
        }
        defpackage.apnt apntVar = this.e;
        defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        if (ldVarI != null) {
            if (!ldVarI.x() && !ldVarI.A()) {
                throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + ldVarI + ((android.support.v7.widget.RecyclerView) apntVar.a).l());
            }
            ldVarI.j();
        }
        ((android.support.v7.widget.RecyclerView) apntVar.a).attachViewToParent(view, iD, layoutParams);
    }

    final void h(int i) {
        defpackage.io ioVar = this.a;
        int iM = m(i);
        ioVar.g(iM);
        defpackage.apnt apntVar = this.e;
        android.view.View viewF = apntVar.F(iM);
        if (viewF != null) {
            defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(viewF);
            if (ldVarI != null) {
                if (ldVarI.x() && !ldVarI.A()) {
                    throw new java.lang.IllegalArgumentException("called detach on an already detached child " + ldVarI + ((android.support.v7.widget.RecyclerView) apntVar.a).l());
                }
                ldVarI.f(256);
            }
        } else {
            int i2 = android.support.v7.widget.RecyclerView.aa;
        }
        ((android.support.v7.widget.RecyclerView) apntVar.a).detachViewFromParent(iM);
    }

    public final void i(android.view.View view) {
        this.b.add(view);
        defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        if (ldVarI != null) {
            defpackage.apnt apntVar = this.e;
            int i = ldVarI.p;
            if (i != -1) {
                ldVarI.o = i;
            } else {
                ldVarI.o = ldVarI.a.getImportantForAccessibility();
            }
            ((android.support.v7.widget.RecyclerView) apntVar.a).ap(ldVarI, 4);
        }
    }

    final void j(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM = m(i);
            defpackage.apnt apntVar = this.e;
            android.view.View viewF = apntVar.F(iM);
            if (viewF != null) {
                this.c = 1;
                this.d = viewF;
                if (this.a.g(iM)) {
                    l(viewF);
                }
                apntVar.H(iM);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    public final boolean k(android.view.View view) {
        return this.b.contains(view);
    }

    public final void l(android.view.View view) {
        if (this.b.remove(view)) {
            this.e.G(view);
        }
    }

    public final java.lang.String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
