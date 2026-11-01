package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aotr extends defpackage.aotm implements defpackage.aota {
    private final defpackage.aorn a;
    public final defpackage.aorq c;
    public final defpackage.aorq d;

    public aotr() {
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.c = new defpackage.aorq(null, aorrVar);
        this.d = new defpackage.aorq(null, aorrVar);
        this.a = new defpackage.aorn(false, aorrVar);
    }

    private final void y() {
        apct apctVarD;
        defpackage.aotq aotqVar = (defpackage.aotq) this.d.a;
        if (aotqVar == null || aotqVar.g()) {
            return;
        }
        long jNanoTime = java.lang.System.nanoTime();
        do {
            synchronized (aotqVar) {
                aotp aotpVarB = aotqVar.b();
                apctVarD = null;
                if (aotpVarB != null) {
                    aotp aotpVar = aotpVarB;
                    if (jNanoTime - aotpVar.b >= 0 && z(aotpVar)) {
                        apctVarD = aotqVar.d(0);
                    }
                }
            }
        } while (((aotp) apctVarD) != null);
    }

    private final boolean z(java.lang.Runnable runnable) {
        while (true) {
            defpackage.aorq aorqVar = this.c;
            java.lang.Object obj = aorqVar.a;
            if (w()) {
                return false;
            }
            int iAd = defpackage.aooc.ad(obj);
            if (iAd != -1) {
                if (iAd == 0) {
                    if (obj == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                        obj = null;
                    }
                    defpackage.apcf apcfVar = (defpackage.apcf) obj;
                    int iA = apcfVar.a(runnable);
                    if (iA == 0) {
                        return true;
                    }
                    if (iA != 1) {
                        return false;
                    }
                    aorqVar.d(obj, apcfVar.c());
                } else {
                    if (obj == defpackage.aots.b) {
                        return false;
                    }
                    defpackage.apcf apcfVar2 = new defpackage.apcf(8, true);
                    if (obj == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type java.lang.Runnable");
                        obj = null;
                    }
                    apcfVar2.a((java.lang.Runnable) obj);
                    apcfVar2.a(runnable);
                    if (aorqVar.d(obj, apcfVar2)) {
                        return true;
                    }
                }
            } else if (aorqVar.d(null, runnable)) {
                return true;
            }
        }
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        j(runnable);
    }

    public /* bridge */ defpackage.aotj c(long j, java.lang.Runnable runnable, defpackage.aolr aolrVar) {
        return defpackage.aosx.a.c(j, runnable, aolrVar);
    }

    @Override // defpackage.aota
    public final void d(long j, defpackage.aosb aosbVar) {
        long jA = defpackage.aots.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = java.lang.System.nanoTime();
            aotn aotnVar = new aotn(this, jA + jNanoTime, aosbVar);
            v(jNanoTime, aotnVar);
            ((defpackage.aosc) aosbVar).A(new defpackage.aorz(aotnVar, 2));
        }
    }

    public void j(java.lang.Runnable runnable) {
        y();
        if (z(runnable)) {
            t();
        } else {
            defpackage.aosw.a.j(runnable);
        }
    }

    @Override // defpackage.aotm
    public void l() {
        apct apctVarD;
        java.lang.ThreadLocal threadLocal = defpackage.aovj.a;
        defpackage.aovj.a.set(null);
        this.a.c();
        boolean z = defpackage.aosu.a;
        while (true) {
            defpackage.aorq aorqVar = this.c;
            java.lang.Object obj = aorqVar.a;
            int iAd = defpackage.aooc.ad(obj);
            if (iAd != -1) {
                if (iAd == 0) {
                    ((defpackage.apcf) obj).d();
                    break;
                }
                if (obj == defpackage.aots.b) {
                    break;
                }
                defpackage.apcf apcfVar = new defpackage.apcf(8, true);
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type java.lang.Runnable");
                }
                apcfVar.a((java.lang.Runnable) obj);
                if (aorqVar.d(obj, apcfVar)) {
                    break;
                }
            } else if (aorqVar.d(null, defpackage.aots.b)) {
                break;
            }
        }
        while (m() <= 0) {
        }
        long jNanoTime = java.lang.System.nanoTime();
        while (true) {
            defpackage.aotq aotqVar = (defpackage.aotq) this.d.a;
            if (aotqVar == null) {
                return;
            }
            synchronized (aotqVar) {
                apctVarD = aotqVar.a() > 0 ? aotqVar.d(0) : null;
            }
            aotp aotpVar = (aotp) apctVarD;
            if (aotpVar == null) {
                return;
            } else {
                k(jNanoTime, aotpVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aotm
    public final long m() {
        java.lang.Runnable runnable;
        defpackage.aotq aotqVar;
        aotp aotpVarC;
        long jNanoTime;
        if (s()) {
            return 0L;
        }
        y();
        defpackage.aorq aorqVar = this.c;
        while (true) {
            java.lang.Object obj = aorqVar.a;
            int iAd = defpackage.aooc.ad(obj);
            runnable = null;
            if (iAd == -1) {
                break;
            }
            if (iAd == 0) {
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                    obj = null;
                }
                defpackage.apcf apcfVar = (defpackage.apcf) obj;
                java.lang.Object objB = apcfVar.b();
                if (objB != defpackage.apcf.a) {
                    runnable = (java.lang.Runnable) objB;
                    break;
                }
                aorqVar.d(obj, apcfVar.c());
            } else {
                if (obj == defpackage.aots.b) {
                    break;
                }
                if (aorqVar.d(obj, null)) {
                    if (obj == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type java.lang.Runnable");
                        obj = null;
                    }
                    runnable = (java.lang.Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        defpackage.aojw aojwVar = this.b;
        if (((aojwVar == null || aojwVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        java.lang.Object obj2 = aorqVar.a;
        if (obj2 == null) {
            aotqVar = (defpackage.aotq) this.d.a;
            if (aotqVar != null && (aotpVarC = aotqVar.c()) != null) {
                jNanoTime = aotpVarC.b - java.lang.System.nanoTime();
                if (jNanoTime >= 0) {
                    return jNanoTime;
                }
                return 0L;
            }
        } else if (obj2 instanceof defpackage.apcf) {
            if (!((defpackage.apcf) obj2).e()) {
                return 0L;
            }
            aotqVar = (defpackage.aotq) this.d.a;
            if (aotqVar != null) {
                jNanoTime = aotpVarC.b - java.lang.System.nanoTime();
                if (jNanoTime >= 0) {
                    return jNanoTime;
                }
                return 0L;
            }
        } else if (obj2 != defpackage.aots.b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    protected final defpackage.aotj u(long j, java.lang.Runnable runnable) {
        long jA = defpackage.aots.a(j);
        if (jA >= 4611686018427387903L) {
            return defpackage.aous.a;
        }
        long jNanoTime = java.lang.System.nanoTime();
        aoto aotoVar = new aoto(jA + jNanoTime, runnable);
        v(jNanoTime, aotoVar);
        return aotoVar;
    }

    public final void v(long j, aotp aotpVar) {
        java.lang.Object[] objArr;
        if (!w()) {
            defpackage.aorq aorqVar = this.d;
            defpackage.aotq aotqVar = (defpackage.aotq) aorqVar.a;
            if (aotqVar == null) {
                aorqVar.d(null, new defpackage.aotq(j));
                java.lang.Object obj = aorqVar.a;
                if (obj == null) {
                    defpackage.aooh.g();
                }
                aotqVar = (defpackage.aotq) obj;
            }
            synchronized (aotpVar) {
                if (aotpVar._heap == defpackage.aots.a) {
                    return;
                }
                synchronized (aotqVar) {
                    aotp aotpVarB = aotqVar.b();
                    if (!w()) {
                        if (aotpVarB == null) {
                            aotqVar.a = j;
                        } else {
                            long j2 = aotpVarB.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = aotqVar.a;
                            if (j - j3 > 0) {
                                aotqVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (aotpVar.b - j < 0) {
                            aotpVar.b = j;
                        }
                        boolean z = defpackage.aosu.a;
                        aotpVar.d(aotqVar);
                        java.lang.Object[] objArr2 = aotqVar.b;
                        if (objArr2 == null) {
                            apct[] apctVarArr = new apct[4];
                            aotqVar.b = apctVarArr;
                            objArr = apctVarArr;
                        } else if (aotqVar.a() >= objArr2.length) {
                            objArr = objArr2;
                            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, aotqVar.a() << 1);
                            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                            apct[] apctVarArr2 = (apct[]) objArrCopyOf;
                            aotqVar.b = apctVarArr2;
                            objArr = apctVarArr2;
                        }
                        objArr = objArr2;
                        int iA = aotqVar.a();
                        aotqVar.e(iA + 1);
                        objArr[iA] = aotpVar;
                        aotpVar.e(iA);
                        aotqVar.f(iA);
                        defpackage.aotq aotqVar2 = (defpackage.aotq) aorqVar.a;
                        if ((aotqVar2 != null ? (aotp) aotqVar2.c() : null) == aotpVar) {
                            t();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        k(j, aotpVar);
    }

    public final boolean w() {
        return this.a.a();
    }

    protected final boolean x() {
        if (!r()) {
            return false;
        }
        defpackage.aotq aotqVar = (defpackage.aotq) this.d.a;
        if (aotqVar != null && !aotqVar.g()) {
            return false;
        }
        java.lang.Object obj = this.c.a;
        int iAd = defpackage.aooc.ad(obj);
        if (iAd != -1) {
            if (iAd == 0) {
                return ((defpackage.apcf) obj).e();
            }
            if (obj != defpackage.aots.b) {
                return false;
            }
        }
        return true;
    }
}
