package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class enf {
    public static final java.lang.Object a = new java.lang.Object();
    public final java.lang.Object b;
    int c;
    public boolean d;
    public volatile java.lang.Object e;
    public volatile java.lang.Object f;
    private final defpackage.sv g;
    private int h;
    private boolean i;
    private boolean j;
    private final java.lang.Runnable k;

    public enf() {
        this.b = new java.lang.Object();
        this.g = new defpackage.sv();
        this.c = 0;
        java.lang.Object obj = a;
        this.f = obj;
        this.k = new defpackage.ddv(this, 6, null);
        this.e = obj;
        this.h = -1;
    }

    private final void c(defpackage.ene eneVar) {
        if (eneVar.d) {
            if (!eneVar.dD()) {
                eneVar.d(false);
                return;
            }
            int i = eneVar.e;
            int i2 = this.h;
            if (i < i2) {
                eneVar.e = i2;
                eneVar.c.a(this.e);
            }
        }
    }

    static void e(java.lang.String str) {
        if (!defpackage.sp.h().i()) {
            throw new java.lang.IllegalStateException(defpackage.a.bk(str, "Cannot invoke ", " on a background thread"));
        }
    }

    public final java.lang.Object d() {
        java.lang.Object obj = this.e;
        if (obj == a) {
            return null;
        }
        return obj;
    }

    final void f(defpackage.ene eneVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (eneVar != null) {
                c(eneVar);
            } else {
                defpackage.sv svVar = this.g;
                defpackage.ss ssVar = new defpackage.ss(svVar);
                svVar.c.put(ssVar, java.lang.Boolean.FALSE);
                while (ssVar.hasNext()) {
                    c((defpackage.ene) ((defpackage.sr) ssVar.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            eneVar = null;
        }
    }

    public final void g(defpackage.emx emxVar, defpackage.enh enhVar) {
        e("observe");
        if (emxVar.P().a() != defpackage.emq.a) {
            defpackage.end endVar = new defpackage.end(this, emxVar, enhVar);
            java.lang.Object objB = this.g.b(enhVar, endVar);
            if (objB == null) {
                emxVar.P().c(endVar);
            } else if (!((defpackage.ene) objB).c(emxVar)) {
                throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public final void h(defpackage.enh enhVar) {
        e("observeForever");
        defpackage.enc encVar = new defpackage.enc(this, enhVar);
        java.lang.Object objB = this.g.b(enhVar, encVar);
        if (objB instanceof defpackage.end) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (objB == null) {
            encVar.d(true);
        }
    }

    public final void i(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        synchronized (this.b) {
            obj2 = this.f;
            obj3 = a;
            this.f = obj;
        }
        if (obj2 == obj3) {
            java.lang.Runnable runnable = this.k;
            defpackage.den denVar = defpackage.sp.h().b;
            defpackage.sq sqVar = (defpackage.sq) denVar;
            if (sqVar.c == null) {
                synchronized (sqVar.a) {
                    if (((defpackage.sq) denVar).c == null) {
                        ((defpackage.sq) denVar).c = ft$.ExternalSyntheticApiModelOutline0.m(android.os.Looper.getMainLooper());
                    }
                }
            }
            sqVar.c.post(runnable);
        }
    }

    public void j(defpackage.enh enhVar) {
        e("removeObserver");
        defpackage.sv svVar = this.g;
        defpackage.sr srVarA = svVar.a(enhVar);
        java.lang.Object obj = null;
        if (srVarA != null) {
            svVar.d--;
            java.util.WeakHashMap weakHashMap = svVar.c;
            if (!weakHashMap.isEmpty()) {
                java.util.Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((defpackage.su) it.next()).b(srVarA);
                }
            }
            defpackage.sr srVar = srVarA.d;
            defpackage.sr srVar2 = srVarA.c;
            if (srVar != null) {
                srVar.c = srVar2;
            } else {
                svVar.a = srVar2;
            }
            defpackage.sr srVar3 = srVarA.c;
            if (srVar3 != null) {
                srVar3.d = srVar;
            } else {
                svVar.b = srVar;
            }
            srVarA.c = null;
            srVarA.d = null;
            obj = srVarA.b;
        }
        if (obj != null) {
            defpackage.ene eneVar = (defpackage.ene) obj;
            eneVar.b();
            eneVar.d(false);
        }
    }

    public void k(java.lang.Object obj) {
        e("setValue");
        this.h++;
        this.e = obj;
        f(null);
    }

    public final boolean l() {
        return this.c > 0;
    }

    protected void a() {
    }

    protected void b() {
    }

    public enf(java.lang.Object obj) {
        this.b = new java.lang.Object();
        this.g = new defpackage.sv();
        this.c = 0;
        this.f = a;
        this.k = new defpackage.ddv(this, 6, null);
        this.e = obj;
        this.h = 0;
    }
}
