package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ansd extends defpackage.ansf implements annr {
    public final java.util.List a;
    private final defpackage.antt b;

    public ansd(aoag aoagVar, defpackage.anlw anlwVar, java.util.List list) {
        super(aoagVar, anlwVar, anns.a(defpackage.ansd.class, "from ".concat(java.lang.String.valueOf(java.lang.String.valueOf(anlwVar.a(defpackage.annh.a))))));
        this.b = new defpackage.antt();
        this.a = list;
    }

    final synchronized anqw a(defpackage.aocx aocxVar, java.lang.String str, anph anphVar) {
        defpackage.anmo anmoVar;
        if (A()) {
            return anqw.l.f("transport is shutdown");
        }
        defpackage.antt anttVar = this.b;
        boolean z = true;
        ahvr.bZ(anttVar.a != null, "Not yet set!");
        defpackage.aocz aoczVar = ((defpackage.anru) anttVar.a).a;
        int i = defpackage.aoik.a;
        defpackage.aoct aoctVar = ((defpackage.aocs) aoczVar).b;
        java.util.concurrent.Executor aocdVar = aoctVar.d != ajbm.a ? new defpackage.aocd(aoctVar.d) : new defpackage.aobz();
        anpc anpcVar = anxo.c;
        if (anphVar.i(anpcVar)) {
            java.lang.String str2 = (java.lang.String) anphVar.c(anpcVar);
            if (aoctVar.p.a(str2) == null) {
                aocxVar.i(defpackage.aoct.c);
                aocxVar.e(anqw.j.f(java.lang.String.format("Can't find decompressor for %s", str2)), new anph());
            }
            return anqw.b;
        }
        defpackage.aodj aodjVarB = aocxVar.b();
        ahvr.cj(aodjVarB, "statsTraceCtx not present from stream");
        defpackage.apjb apjbVarA = aoctVar.e.a(str);
        java.lang.Long l = (java.lang.Long) anphVar.c(anxo.b);
        defpackage.anmv anmvVar = aoctVar.o;
        ahvr.cj(anmvVar, "context");
        aooc[] aoocVarArr = aodjVarB.b;
        if (aoocVarArr.length > 0) {
            aooc aoocVar = aoocVarArr[0];
            throw null;
        }
        if (l == null) {
            anmoVar = new defpackage.anmo(anmvVar);
        } else {
            anmw anmwVarG = anmw.g(l.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS, aoctVar.s);
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = ((defpackage.aocs) aoczVar).c.j;
            defpackage.anmv.m(scheduledExecutorService, "scheduler");
            anmw anmwVarB = anmvVar.b();
            if (anmwVarB != null && anmwVarB.a(anmwVarG) <= 0) {
                z = false;
                anmwVarG = anmwVarB;
            }
            anmoVar = new defpackage.anmo(anmvVar, anmwVarG);
            if (z) {
                if (anmwVarG.f()) {
                    anmoVar.j(new java.util.concurrent.TimeoutException("context timed out"));
                } else {
                    synchronized (anmoVar) {
                        try {
                            defpackage.alvr alvrVar = new defpackage.alvr(anmoVar, 5);
                            j$.util.Objects.requireNonNull(alvrVar, "task");
                            j$.util.Objects.requireNonNull(scheduledExecutorService, "scheduler");
                            anmoVar.b = scheduledExecutorService.schedule(alvrVar, anmwVarG.a - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
        defpackage.aocm aocmVar = new defpackage.aocm(aocdVar, aoctVar.d, aocxVar, anmoVar);
        aocxVar.i(aocmVar);
        ajdd ajddVar = new ajdd();
        aocdVar.execute(new defpackage.aocr((defpackage.aocs) aoczVar, anmoVar, apjbVarA, str, aocxVar, aocmVar, ajddVar, aodjVarB, anphVar));
        aocdVar.execute(new defpackage.aocq((defpackage.aocs) aoczVar, anmoVar, ajddVar, anphVar, aocxVar, aocmVar));
        return anqw.b;
    }

    public final synchronized void e() {
        x(anqw.b, false);
    }

    public final synchronized void f(anqw anqwVar) {
        x(anqwVar, true);
    }

    @Override // defpackage.ansf
    protected final defpackage.anst fu(int i) {
        return new defpackage.ansq(this, this.n, i);
    }

    @Override // defpackage.ansf
    public final void fv() {
        defpackage.ansj ansjVar = (defpackage.ansj) t().a(defpackage.ansk.a);
        if (ansjVar != null) {
            ansjVar.d = true;
            java.util.Iterator it = ansjVar.b.values().iterator();
            while (it.hasNext()) {
                ((ajcq) it.next()).cancel(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final synchronized void h(defpackage.aocz aoczVar) {
        defpackage.antt anttVar = this.b;
        ahvr.bZ(anttVar.a == null, "Already set!");
        anttVar.a = aoczVar;
        ?? r1 = anttVar.b;
        if (r1 != 0) {
            for (anty antyVar : r1) {
                aoczVar.a();
            }
            anttVar.b = null;
        }
        if (!A()) {
            anth anthVar = this.p;
            ahvr.ci(anthVar);
            v(anthVar);
            if (!A()) {
                C(3);
                defpackage.anlw anlwVar = this.n;
                defpackage.aocz aoczVar2 = ((defpackage.anru) aoczVar).a;
                ((defpackage.aocs) aoczVar2).a.cancel(false);
                ((defpackage.aocs) aoczVar2).a = null;
                java.util.Iterator it = ((defpackage.aocs) aoczVar2).b.g.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                this.n = anlwVar;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aocz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ansf
    public final void k() {
        anty antyVar = new anty();
        defpackage.antt anttVar = this.b;
        ?? r1 = anttVar.a;
        if (r1 != 0) {
            r1.a();
            return;
        }
        if (anttVar.b == null) {
            anttVar.b = new java.util.ArrayList();
        }
        anttVar.b.add(antyVar);
    }

    @Override // defpackage.ansf
    public final void j(anqw anqwVar) {
    }
}
