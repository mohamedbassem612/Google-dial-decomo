package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agym {
    public final defpackage.agtg a;
    public final java.util.concurrent.Executor b;
    public defpackage.agxy c;
    public final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference(null);
    public defpackage.agyc e;
    public defpackage.agyb f;
    public defpackage.agyg g;
    public final defpackage.agtd h;
    public final defpackage.agtd i;
    public final defpackage.aazc j;
    public final defpackage.aogc k;

    public agym(defpackage.agxi agxiVar, defpackage.aazc aazcVar, defpackage.aogc aogcVar, defpackage.agtg agtgVar, java.util.concurrent.Executor executor) {
        defpackage.agye agyeVar = defpackage.agyg.a;
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        this.g = new defpackage.agyg(0L, agyeVar, false, ahwtVar, ahwtVar);
        this.h = new defpackage.agtd(2, new defpackage.agyk(0));
        this.i = new defpackage.agtd(1, new defpackage.agyk(2));
        this.j = aazcVar;
        this.k = aogcVar;
        this.a = agtgVar;
        defpackage.agyb agybVar = new defpackage.agyb(agxiVar, agxiVar.e(), new defpackage.agxm(), 0L, 1, new defpackage.agyc(agxiVar, Long.MIN_VALUE, new defpackage.agxp(0L), new defpackage.agxs(0L), 0, j$.time.Instant.ofEpochMilli(Long.MIN_VALUE)));
        this.f = agybVar;
        this.e = agybVar.e;
        this.b = executor;
    }

    public static void f(defpackage.agxf agxfVar) {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1331, "BackgroundCallbacks.onBackgroundFetch");
        try {
            agxfVar.d();
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void g(defpackage.agxf agxfVar) {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1333, "BackgroundCallbacks.onBackgroundFetchSucceeded");
        try {
            agxfVar.f();
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    public static defpackage.agyg j(defpackage.agyg agygVar, defpackage.agxr agxrVar) {
        defpackage.agyg agygVarA;
        defpackage.ahyn ahysVar;
        defpackage.ahyn ahynVar;
        defpackage.ahyn ahynVar2 = agygVar.f;
        if (ahynVar2.f() && ahynVar2.b() == agxrVar) {
            ahynVar = defpackage.ahwt.a;
            agygVarA = agygVar.a(agxrVar);
            ahysVar = ahynVar;
        } else if (!ahynVar2.f()) {
            defpackage.ahyn ahynVar3 = agygVar.e;
            if (ahynVar3.f() && ahynVar3.b() == agxrVar) {
                java.lang.Object objD = ((defpackage.agxr) ahynVar3.b()).a().d();
                objD.getClass();
                defpackage.ahys ahysVar2 = new defpackage.ahys(objD);
                defpackage.ahwt ahwtVar = defpackage.ahwt.a;
                defpackage.agyg agygVarA2 = agygVar.a((defpackage.agxr) ahynVar3.b());
                ahysVar = ahwtVar;
                ahynVar = ahysVar2;
                agygVarA = agygVarA2;
            } else if (ahynVar2.f() || !((defpackage.agxr) ahynVar2.b()).a().d().equals(agxrVar.a().d())) {
                java.lang.Object objD2 = agxrVar.a().d();
                objD2.getClass();
                defpackage.ahys ahysVar3 = new defpackage.ahys(objD2);
                defpackage.ahyn ahynVar4 = agygVar.e;
                agygVarA = agygVar.a(agxrVar);
                ahysVar = ahynVar4;
                ahynVar = ahysVar3;
            } else {
                ahynVar = defpackage.ahwt.a;
                ahysVar = new defpackage.ahys(agxrVar);
                agygVarA = agygVar;
            }
        } else if (ahynVar2.f()) {
            java.lang.Object objD3 = agxrVar.a().d();
            objD3.getClass();
            defpackage.ahys ahysVar4 = new defpackage.ahys(objD3);
            defpackage.ahyn ahynVar5 = agygVar.e;
            agygVarA = agygVar.a(agxrVar);
            ahysVar = ahynVar5;
            ahynVar = ahysVar4;
        } else {
            java.lang.Object objD4 = agxrVar.a().d();
            objD4.getClass();
            defpackage.ahys ahysVar5 = new defpackage.ahys(objD4);
            defpackage.ahyn ahynVar6 = agygVar.e;
            agygVarA = agygVar.a(agxrVar);
            ahysVar = ahynVar6;
            ahynVar = ahysVar5;
        }
        if (ahynVar.f()) {
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1330, "SubscriptionCallbacks.onNewData", defpackage.ahot.a, true);
            try {
                defpackage.agsv agsvVarA = defpackage.agsw.a();
                try {
                    agygVar.c.b(agxrVar.a().d());
                    agsvVarA.close();
                    ahoqVarX.close();
                } catch (java.lang.Throwable th) {
                    try {
                        agsvVarA.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (ahysVar.f()) {
            ((defpackage.agxr) ahysVar.b()).c();
        }
        return agygVarA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    final void a() throws afeb {
        defpackage.agxy agxyVar = this.c;
        if (agxyVar != null) {
            this.k.v(this.f.b, agxyVar);
            this.c = null;
        }
        this.h.a();
        this.i.a();
        defpackage.ahyn ahynVar = this.g.e;
        if (ahynVar.f()) {
            ((defpackage.agxr) ahynVar.b()).c();
        }
        defpackage.agyg agygVar = this.g;
        defpackage.ahyn ahynVar2 = agygVar.f;
        if (!ahynVar2.f() || ahynVar2.equals(agygVar.e)) {
            return;
        }
        ((defpackage.agxr) this.g.f.b()).c();
    }

    public final void b(defpackage.agyc agycVar, defpackage.agxr agxrVar) {
        if (!agxrVar.a().e()) {
            throw new java.lang.IllegalStateException();
        }
        this.g = j(this.g, agxrVar);
        this.e = agycVar;
    }

    final void c() {
        defpackage.agyg agygVar = this.g;
        this.g = new defpackage.agyg(agygVar.b + 1, defpackage.agyg.a, false, agygVar.e, defpackage.ahwt.a);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [ajcq, java.lang.Object] */
    public final void d(defpackage.agyc agycVar) {
        defpackage.afec.c();
        defpackage.agyg agygVar = this.g;
        if (!agygVar.e.f()) {
            defpackage.agye agyeVar = agygVar.c;
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1335, "SubscriptionCallbacks.onPending");
            try {
                defpackage.agsv agsvVarA = defpackage.agsw.a();
                try {
                    agyeVar.c();
                    agsvVarA.close();
                    ahoqVarW.close();
                } catch (java.lang.Throwable th) {
                    try {
                        agsvVarA.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarW.close();
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else if ((agygVar.c instanceof defpackage.agxf) && this.h.b()) {
            defpackage.agyg agygVar2 = this.g;
            if (!agygVar2.d) {
                defpackage.agyg agygVarB = agygVar2.b(true);
                this.g = agygVarB;
                f((defpackage.agxf) agygVarB.c);
            }
        }
        defpackage.agxi agxiVar = agycVar.a;
        long j = agycVar.b;
        long j2 = agycVar.c.a;
        defpackage.ahvr.bZ(j2 != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        defpackage.agyc agycVar2 = new defpackage.agyc(agxiVar, j, new defpackage.agxp(j2 + 1), agycVar.d, agycVar.e, agycVar.f);
        defpackage.agxi agxiVar2 = agycVar2.a;
        defpackage.ahoq ahoqVarW2 = defpackage.ahvr.W(1328, "DataSource fetchAndStoreData()");
        try {
            defpackage.ajcq ajcqVarB = agxiVar2.b();
            ahoqVarW2.a(ajcqVarB);
            zoe zoeVar = new zoe(ajcqVarB);
            ahoqVarW2.close();
            this.h.d(zoeVar);
            zoeVar.a.c(defpackage.ahqx.h(new acxq(this, agycVar2, zoeVar, 14)), defpackage.ajbm.INSTANCE);
        } catch (java.lang.Throwable th5) {
            try {
                ahoqVarW2.close();
                throw th5;
            } catch (java.lang.Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    public final void e(defpackage.agyc agycVar) {
        defpackage.afec.c();
        long j = agycVar.d.a;
        defpackage.ahvr.bZ(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        defpackage.agxs agxsVar = new defpackage.agxs(j + 1);
        j$.time.Instant instant = agycVar.f;
        int i = agycVar.e + 1;
        defpackage.agyc agycVar2 = new defpackage.agyc(agycVar.a, agycVar.b, agycVar.c, agxsVar, i, instant);
        defpackage.agxi agxiVar = agycVar2.a;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1329, "DataSource loadData()", defpackage.ahot.a, true);
        try {
            defpackage.ajbg ajbgVarA = agxiVar.a();
            ahoqVarX.a(ajbgVarA.e());
            defpackage.agxr agxrVar = new defpackage.agxr(ajbgVarA);
            ahoqVarX.close();
            this.i.d(agxrVar);
            agxrVar.b().c(defpackage.ahqx.h(new defpackage.gsb(this, agycVar2, agxrVar, 13, (char[]) null)), defpackage.ajbm.INSTANCE);
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void h(java.lang.Throwable th) {
        defpackage.agyg agygVar = this.g;
        if (agygVar.e.f()) {
            defpackage.agye agyeVar = agygVar.c;
            if (agyeVar instanceof defpackage.agyd) {
                defpackage.agyd agydVar = (defpackage.agyd) agyeVar;
                defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1337, "RefreshCallbacks.onRefreshError");
                try {
                    agydVar.a();
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    try {
                        ahoqVarW.close();
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } else {
            defpackage.agye agyeVar2 = agygVar.c;
            defpackage.ahoq ahoqVarW2 = defpackage.ahvr.W(1334, "SubscriptionCallbacks.onError");
            try {
                defpackage.agsv agsvVarA = defpackage.agsw.a();
                try {
                    agyeVar2.a(th);
                    agsvVarA.close();
                    ahoqVarW2.close();
                } catch (java.lang.Throwable th4) {
                    try {
                        agsvVarA.close();
                    } catch (java.lang.Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (java.lang.Throwable th6) {
                try {
                    ahoqVarW2.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
        if (this.g.d && i()) {
            defpackage.agxf agxfVar = (defpackage.agxf) this.g.c;
            defpackage.ahoq ahoqVarW3 = defpackage.ahvr.W(1332, "BackgroundCallbacks.onBackgroundFetchError");
            try {
                agxfVar.e(th);
                ahoqVarW3.close();
                this.g = this.g.b(false);
            } catch (java.lang.Throwable th8) {
                try {
                    ahoqVarW3.close();
                } catch (java.lang.Throwable th9) {
                    th8.addSuppressed(th9);
                }
                throw th8;
            }
        }
    }

    public final boolean i() {
        if (!(this.g.c instanceof defpackage.agxf) || !this.h.b() || !this.i.b()) {
            return false;
        }
        defpackage.ahvr.bY(this.g.d);
        return true;
    }
}
