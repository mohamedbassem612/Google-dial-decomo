package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yei implements defpackage.yem, defpackage.yek {
    public volatile defpackage.yek a;
    public volatile defpackage.yek b;
    private final java.lang.Object c;
    private final defpackage.yem d;
    private defpackage.yel e;
    private defpackage.yel f;

    public yei(java.lang.Object obj, defpackage.yem yemVar) {
        defpackage.yel yelVar = defpackage.yel.CLEARED;
        this.e = yelVar;
        this.f = yelVar;
        this.c = obj;
        this.d = yemVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [yem] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.yem
    public final defpackage.yem a() {
        ?? A;
        synchronized (this.c) {
            defpackage.yem yemVar = this.d;
            this = this;
            if (yemVar != null) {
                A = yemVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.yek
    public final void b() {
        synchronized (this.c) {
            defpackage.yel yelVar = this.e;
            defpackage.yel yelVar2 = defpackage.yel.RUNNING;
            if (yelVar != yelVar2) {
                this.e = yelVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.yek
    public final void c() {
        synchronized (this.c) {
            defpackage.yel yelVar = defpackage.yel.CLEARED;
            this.e = yelVar;
            this.a.c();
            if (this.f != yelVar) {
                this.f = yelVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.yem
    public final void d(defpackage.yek yekVar) {
        synchronized (this.c) {
            if (yekVar.equals(this.b)) {
                this.f = defpackage.yel.FAILED;
                defpackage.yem yemVar = this.d;
                if (yemVar != null) {
                    yemVar.d(this);
                }
                return;
            }
            this.e = defpackage.yel.FAILED;
            defpackage.yel yelVar = this.f;
            defpackage.yel yelVar2 = defpackage.yel.RUNNING;
            if (yelVar != yelVar2) {
                this.f = yelVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.yem
    public final void e(defpackage.yek yekVar) {
        synchronized (this.c) {
            if (yekVar.equals(this.a)) {
                this.e = defpackage.yel.SUCCESS;
            } else if (yekVar.equals(this.b)) {
                this.f = defpackage.yel.SUCCESS;
            }
            defpackage.yem yemVar = this.d;
            if (yemVar != null) {
                yemVar.e(this);
            }
        }
    }

    @Override // defpackage.yek
    public final void f() {
        synchronized (this.c) {
            defpackage.yel yelVar = this.e;
            defpackage.yel yelVar2 = defpackage.yel.RUNNING;
            if (yelVar == yelVar2) {
                this.e = defpackage.yel.PAUSED;
                this.a.f();
            }
            if (this.f == yelVar2) {
                this.f = defpackage.yel.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.yem
    public final boolean g(defpackage.yek yekVar) {
        boolean z;
        synchronized (this.c) {
            defpackage.yem yemVar = this.d;
            z = false;
            if ((yemVar == null || yemVar.g(this)) && yekVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    @Override // defpackage.yem
    public final boolean h(defpackage.yek yekVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            defpackage.yem yemVar = this.d;
            z = false;
            if (yemVar == null || yemVar.h(this)) {
                defpackage.yel yelVar = this.e;
                defpackage.yel yelVar2 = defpackage.yel.FAILED;
                if (yelVar != yelVar2) {
                    zEquals = yekVar.equals(this.a);
                } else {
                    if (yekVar.equals(this.b)) {
                        defpackage.yel yelVar3 = this.f;
                        if (yelVar3 == defpackage.yel.SUCCESS) {
                            zEquals = true;
                        } else if (yelVar3 != yelVar2) {
                            zEquals = false;
                        }
                    } else {
                        zEquals = false;
                    }
                    z = true;
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.yem
    public final boolean i(defpackage.yek yekVar) {
        boolean z;
        synchronized (this.c) {
            defpackage.yem yemVar = this.d;
            z = true;
            if (yemVar != null && !yemVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.yem, defpackage.yek
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            defpackage.yel yelVar = this.e;
            defpackage.yel yelVar2 = defpackage.yel.CLEARED;
            z = false;
            if (yelVar == yelVar2 && this.f == yelVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            defpackage.yel yelVar = this.e;
            defpackage.yel yelVar2 = defpackage.yel.SUCCESS;
            z = true;
            if (yelVar != yelVar2 && this.f != yelVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean m(defpackage.yek yekVar) {
        if (!(yekVar instanceof defpackage.yei)) {
            return false;
        }
        defpackage.yei yeiVar = (defpackage.yei) yekVar;
        return this.a.m(yeiVar.a) && this.b.m(yeiVar.b);
    }

    @Override // defpackage.yek
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            defpackage.yel yelVar = this.e;
            defpackage.yel yelVar2 = defpackage.yel.RUNNING;
            z = true;
            if (yelVar != yelVar2 && this.f != yelVar2) {
                z = false;
            }
        }
        return z;
    }
}
