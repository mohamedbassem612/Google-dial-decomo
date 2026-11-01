package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anvb extends defpackage.anxe {
    public final defpackage.anwc a;
    public final java.lang.String b;
    public final java.util.concurrent.atomic.AtomicInteger c;
    final /* synthetic */ anvc d;
    private volatile anqw e;
    private anqw f;
    private anqw g;
    private final aprf h;

    public anvb(anvc anvcVar, defpackage.anwc anwcVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(anvcVar);
        this.d = anvcVar;
        this.c = new java.util.concurrent.atomic.AtomicInteger(-2147483647);
        this.h = new aprf(this);
        this.a = anwcVar;
        ahvr.cj(str, "authority");
        this.b = str;
    }

    @Override // defpackage.anxe
    protected final defpackage.anwc a() {
        return this.a;
    }

    @Override // defpackage.anxe
    public final defpackage.anvp b(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anmg[] anmgVarArr) {
        defpackage.anwy anwyVar;
        defpackage.anvp anvpVar;
        java.util.concurrent.Executor executor;
        anar anarVar = anmbVar.g;
        if (anarVar == null) {
            anarVar = null;
        }
        if (anarVar != null) {
            defpackage.anwc anwcVar = this.a;
            aprf aprfVar = this.h;
            defpackage.anly anlyVar = new defpackage.anly(anwcVar, anpkVar, anphVar, anmbVar, aprfVar, anmgVarArr);
            if (this.c.incrementAndGet() <= 0) {
                j$.util.Objects.requireNonNull(this);
                try {
                    if (!((defpackage.anrj) anarVar).f || (executor = anmbVar.c) == null) {
                        executor = this.d.a;
                    }
                    defpackage.anqj anqjVar = (defpackage.anqj) ahvr.m((defpackage.anqj) this.a.t().a(defpackage.anxi.a), defpackage.anqj.a);
                    if (!((defpackage.anrj) anarVar).b || anqjVar == defpackage.anqj.c) {
                        try {
                            defpackage.anrj.a((java.lang.String) ahvr.m((java.lang.Object) null, this.b), anpkVar);
                            ((defpackage.anrj) anarVar).c.a(executor, new defpackage.anyd((defpackage.anrj) anarVar, anlyVar));
                        } catch (anqx e) {
                            anlyVar.a(e.a);
                        }
                    } else {
                        anlyVar.a(anqw.g.f("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(anqjVar.toString())));
                    }
                } catch (java.lang.Throwable th) {
                    anlyVar.a(anqw.g.f("Credentials should use fail() instead of throwing exceptions").e(th));
                }
                synchronized (anlyVar.g) {
                    anvpVar = anlyVar.h;
                    if (anvpVar == null) {
                        anlyVar.j = new defpackage.anwq("call_credentials");
                        anvpVar = anlyVar.j;
                        anlyVar.h = anvpVar;
                    }
                }
                return anvpVar;
            }
            aprfVar.a();
            anwyVar = new defpackage.anwy(this.e, anmgVarArr);
        } else {
            if (this.c.get() < 0) {
                return this.a.b(anpkVar, anphVar, anmbVar, anmgVarArr);
            }
            anwyVar = new defpackage.anwy(this.e, anmgVarArr);
        }
        return anwyVar;
    }

    public final void e() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            anqw anqwVar = this.f;
            anqw anqwVar2 = this.g;
            this.f = null;
            this.g = null;
            if (anqwVar != null) {
                super.q(anqwVar);
            }
            if (anqwVar2 != null) {
                super.r(anqwVar2);
            }
        }
    }

    @Override // defpackage.anxe
    public final void q(anqw anqwVar) {
        ahvr.cj(anqwVar, "status");
        synchronized (this) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() < 0) {
                this.e = anqwVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
                if (atomicInteger.get() != 0) {
                    this.f = anqwVar;
                } else {
                    super.q(anqwVar);
                }
            }
        }
    }

    @Override // defpackage.anxe
    public final void r(anqw anqwVar) {
        ahvr.cj(anqwVar, "status");
        synchronized (this) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() < 0) {
                this.e = anqwVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
            } else if (this.g != null) {
                return;
            }
            if (atomicInteger.get() != 0) {
                this.g = anqwVar;
            } else {
                super.r(anqwVar);
            }
        }
    }
}
