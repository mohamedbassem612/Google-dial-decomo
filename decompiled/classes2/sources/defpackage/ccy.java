package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ccy {
    public final cbb a;
    public final cah b;
    public final java.lang.Object c;
    public final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference(defpackage.cdc.a);
    public long e = java.lang.Thread.currentThread().getId();
    public final cjh f;
    public final defpackage.cdt g;
    private final caz h;
    private final ccb i;
    private final aonn j;
    private final boolean k;
    private ady l;

    public ccy(cbb cbbVar, caz cazVar, ccb ccbVar, java.util.Set set, aonn aonnVar, boolean z, cah cahVar, java.lang.Object obj) {
        this.a = cbbVar;
        this.h = cazVar;
        this.i = ccbVar;
        this.j = aonnVar;
        this.k = z;
        this.b = cahVar;
        this.c = obj;
        ady adyVar = adz.a;
        if (adyVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        }
        this.l = adyVar;
        cjh cjhVar = new cjh();
        ccbVar.P();
        cjhVar.i(set, (cmc) null);
        this.f = cjhVar;
        this.g = new defpackage.cdt();
    }

    private final void c() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.d;
        defpackage.cde cdeVar = defpackage.cde.a;
        defpackage.cda cdaVar = defpackage.cda.a;
        if (anty.Q(atomicReference, cdeVar, cdaVar)) {
            return;
        }
        cdh.b(a.bm((byte) 46, cdaVar, cdeVar, "Unexpected state change from: ", " to: "));
    }

    public final boolean a() {
        return aooh.a(((defpackage.cdg) this.d.get()).b, defpackage.cda.a.b) >= 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final void b(defpackage.ceb cebVar) throws java.lang.Exception {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.d;
        defpackage.cdg cdgVar = (defpackage.cdg) atomicReference.get();
        try {
            int i = cdgVar.b;
            if (i == defpackage.cdc.a.b) {
                if (this.k) {
                    this.i.aa();
                }
                this.l = this.h.o(this.a, cebVar, this.j);
                if (this.k) {
                    this.i.X();
                }
                defpackage.cdc cdcVar = defpackage.cdc.a;
                defpackage.cde cdeVar = defpackage.cde.a;
                if (!anty.Q(this.d, cdcVar, cdeVar)) {
                    cdh.b("Unexpected state change from: " + cdcVar + " to: " + cdeVar + '.');
                }
                if (this.l.b()) {
                    c();
                }
            } else {
                defpackage.cde cdeVar2 = defpackage.cde.a;
                if (i == cdeVar2.b) {
                    defpackage.cdf cdfVar = defpackage.cdf.a;
                    if (!anty.Q(atomicReference, cdeVar2, cdfVar)) {
                        cdh.b("Unexpected state change from: " + cdeVar2 + " to: " + cdfVar + '.');
                    }
                    long j = this.e;
                    try {
                        this.e = java.lang.Thread.currentThread().getId();
                        this.l = this.h.p(this.a, cebVar, this.l);
                        this.e = j;
                        defpackage.cdf cdfVar2 = defpackage.cdf.a;
                        defpackage.cde cdeVar3 = defpackage.cde.a;
                        if (!anty.Q(this.d, cdfVar2, cdeVar3)) {
                            cdh.b("Unexpected state change from: " + cdfVar2 + " to: " + cdeVar3 + '.');
                        }
                        if (this.l.b()) {
                            c();
                        }
                    } catch (java.lang.Throwable th) {
                        this.e = j;
                        defpackage.cdf cdfVar3 = defpackage.cdf.a;
                        defpackage.cde cdeVar4 = defpackage.cde.a;
                        if (!anty.Q(this.d, cdfVar3, cdeVar4)) {
                            cdh.b("Unexpected state change from: " + cdfVar3 + " to: " + cdeVar4 + '.');
                        }
                        throw th;
                    }
                } else {
                    if (i == defpackage.cdf.a.b) {
                        cax.a("Recursive call to resume()");
                        throw new aoiq();
                    }
                    if (i == defpackage.cda.a.b) {
                        throw new java.lang.IllegalStateException("Pausable composition is complete and apply() should be applied");
                    }
                    if (i == defpackage.ccz.a.b) {
                        throw new java.lang.IllegalStateException("The paused composition has been applied");
                    }
                    if (i == defpackage.cdb.a.b) {
                        throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                    }
                    if (i == 0) {
                        if (cdgVar == null) {
                            aooh.h("null cannot be cast to non-null type androidx.compose.runtime.PausedCompositionState.Invalid");
                        }
                        throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception", ((defpackage.cdd) cdgVar).a);
                    }
                }
            }
            a();
        } catch (java.lang.Exception e) {
            if (!(cdgVar instanceof defpackage.cdd)) {
                this.d.set(new defpackage.cdd(e));
            }
            throw e;
        }
    }
}
