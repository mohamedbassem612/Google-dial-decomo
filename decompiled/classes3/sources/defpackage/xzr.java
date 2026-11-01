package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xzr implements defpackage.xvb, defpackage.xva {
    private final java.util.List a;
    private final dxz b;
    private int c;
    private defpackage.xsm d;
    private defpackage.xva e;
    private java.util.List f;
    private boolean g;

    public xzr(java.util.List list, dxz dxzVar) {
        this.b = dxzVar;
        defpackage.xfh.u(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            g(this.d, this.e);
        } else {
            anty.aI(this.f, "Argument must not be null");
            this.e.f(new defpackage.xxa("Fetch failed", new java.util.ArrayList(this.f)));
        }
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return ((defpackage.xvb) this.a.get(0)).a();
    }

    @Override // defpackage.xva
    public final void c(java.lang.Object obj) {
        if (obj != null) {
            this.e.c(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.xvb
    public final void d() {
        this.g = true;
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.xvb) it.next()).d();
        }
    }

    @Override // defpackage.xvb
    public final void e() {
        java.util.List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.xvb) it.next()).e();
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return ((defpackage.xvb) this.a.get(0)).ey();
    }

    @Override // defpackage.xva
    public final void f(java.lang.Exception exc) {
        java.util.List list = this.f;
        anty.aI(list, "Argument must not be null");
        list.add(exc);
        h();
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        this.d = xsmVar;
        this.e = xvaVar;
        this.f = (java.util.List) this.b.a();
        ((defpackage.xvb) this.a.get(this.c)).g(xsmVar, this);
        if (this.g) {
            d();
        }
    }
}
