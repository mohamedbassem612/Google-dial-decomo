package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yes implements defpackage.yem, defpackage.yek {
    public volatile defpackage.yek a;
    public volatile defpackage.yek b;
    private final defpackage.yem c;
    private final java.lang.Object d;
    private defpackage.yel e;
    private defpackage.yel f;
    private boolean g;

    public yes(java.lang.Object obj, defpackage.yem yemVar) {
        defpackage.yel yelVar = defpackage.yel.CLEARED;
        this.e = yelVar;
        this.f = yelVar;
        this.d = obj;
        this.c = yemVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [yem] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.yem
    public final defpackage.yem a() {
        ?? A;
        synchronized (this.d) {
            defpackage.yem yemVar = this.c;
            this = this;
            if (yemVar != null) {
                A = yemVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.yek
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != defpackage.yel.SUCCESS) {
                    defpackage.yel yelVar = this.f;
                    defpackage.yel yelVar2 = defpackage.yel.RUNNING;
                    if (yelVar != yelVar2) {
                        this.f = yelVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    defpackage.yel yelVar3 = this.e;
                    defpackage.yel yelVar4 = defpackage.yel.RUNNING;
                    if (yelVar3 != yelVar4) {
                        this.e = yelVar4;
                        this.a.b();
                    }
                }
                this.g = false;
            } catch (java.lang.Throwable th) {
                this.g = false;
                throw th;
            }
        }
    }

    @Override // defpackage.yek
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            defpackage.yel yelVar = defpackage.yel.CLEARED;
            this.e = yelVar;
            this.f = yelVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.yem
    public final void d(defpackage.yek yekVar) {
        synchronized (this.d) {
            if (!yekVar.equals(this.a)) {
                this.f = defpackage.yel.FAILED;
                return;
            }
            this.e = defpackage.yel.FAILED;
            defpackage.yem yemVar = this.c;
            if (yemVar != null) {
                yemVar.d(this);
            }
        }
    }

    @Override // defpackage.yem
    public final void e(defpackage.yek yekVar) {
        synchronized (this.d) {
            if (yekVar.equals(this.b)) {
                this.f = defpackage.yel.SUCCESS;
                return;
            }
            this.e = defpackage.yel.SUCCESS;
            defpackage.yem yemVar = this.c;
            if (yemVar != null) {
                yemVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.yek
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = defpackage.yel.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = defpackage.yel.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.yem
    public final boolean g(defpackage.yek yekVar) {
        boolean z;
        synchronized (this.d) {
            defpackage.yem yemVar = this.c;
            z = false;
            if ((yemVar == null || yemVar.g(this)) && yekVar.equals(this.a) && this.e != defpackage.yel.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.yem
    public final boolean h(defpackage.yek yekVar) {
        boolean z;
        synchronized (this.d) {
            defpackage.yem yemVar = this.c;
            z = false;
            if ((yemVar == null || yemVar.h(this)) && yekVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.yem
    public final boolean i(defpackage.yek yekVar) {
        boolean z;
        synchronized (this.d) {
            defpackage.yem yemVar = this.c;
            z = false;
            if ((yemVar == null || yemVar.i(this)) && (yekVar.equals(this.a) || this.e != defpackage.yel.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.yem, defpackage.yek
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == defpackage.yel.CLEARED;
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == defpackage.yel.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean m(defpackage.yek yekVar) {
        if (!(yekVar instanceof defpackage.yes)) {
            return false;
        }
        defpackage.yes yesVar = (defpackage.yes) yekVar;
        if (this.a == null) {
            if (yesVar.a != null) {
                return false;
            }
        } else if (!this.a.m(yesVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (yesVar.b != null) {
                return false;
            }
        } else if (!this.b.m(yesVar.b)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yek
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == defpackage.yel.RUNNING;
        }
        return z;
    }
}
