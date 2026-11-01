package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iix {
    public final aoin a;
    public final aoin b;
    public final aoin c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;

    public iix(defpackage.him himVar) {
        this.f = this;
        this.j = himVar;
        this.k = amyu.c(new defpackage.hjs(himVar, this, 3, 0));
        this.i = amyu.c(new defpackage.hjs(himVar, this, 2, 0));
        this.e = amyu.c(new defpackage.hjs(himVar, this, 5, 0));
        this.g = amyu.c(new defpackage.hjs(himVar, this, 4, 0));
        this.a = amyu.c(new defpackage.hjs(himVar, this, 1, 0));
        this.c = amyu.c(new defpackage.hjs(himVar, this, 6, 0));
        this.h = amyu.c(new defpackage.hjs(himVar, this, 0, 0));
        this.d = amyu.c(new defpackage.hjs(himVar, this, 8, 0));
        this.b = amyu.c(new defpackage.hjs(himVar, this, 7, 0));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9 A[PHI: r7 r13 r14
      0x00c9: PHI (r7v4 iix) = (r7v2 iix), (r7v5 iix) binds: [B:22:0x0089, B:27:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r13v7 aeun) = (r13v5 aeun), (r13v8 aeun) binds: [B:22:0x0089, B:27:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r14v13 igi) = (r14v9 igi), (r14v15 igi) binds: [B:22:0x0089, B:27:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, ruc] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, ruc] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object a(igf igfVar, aoln aolnVar) {
        defpackage.iiv iivVar;
        defpackage.iix iixVar;
        aeun aeunVar;
        defpackage.igi igiVar;
        rub rubVar;
        if (aolnVar instanceof defpackage.iiv) {
            iivVar = (defpackage.iiv) aolnVar;
            int i = iivVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iivVar.c = i - Integer.MIN_VALUE;
            } else {
                iivVar = new defpackage.iiv(this, aolnVar);
            }
        } else {
            iivVar = new defpackage.iiv(this, aolnVar);
        }
        java.lang.Object obj = iivVar.a;
        defpackage.igi igiVarT = aolu.a;
        int i2 = iivVar.c;
        int i3 = 2;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalA = this.g.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar2 = (aeun) aooh.q(optionalA);
            if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                java.lang.Object objA = this.c.a();
                aooh.e(objA, "get(...)");
                long jLongValue = ((java.lang.Number) objA).longValue();
                iixVar = this;
                huk hukVar = new huk(iixVar, igfVar, (aoln) null, 17, (byte[]) null);
                iivVar.d = aeunVar2;
                iivVar.c = 1;
                java.lang.Object objM = aooh.M(jLongValue, hukVar, iivVar);
                if (objM != igiVarT) {
                    aeunVar = aeunVar2;
                    obj = objM;
                    igiVar = (defpackage.igi) obj;
                    if (igiVar == null) {
                        defpackage.heq heqVarA = defpackage.hhe.A(defpackage.igi.b.m());
                        heqVarA.v(false);
                        heqVarA.u(defpackage.igh.FAILURE_TIMEOUT);
                        igiVarT = heqVarA.t();
                    } else {
                        igiVarT = igiVar;
                    }
                    if (aeunVar != null) {
                        if (igiVarT.d) {
                            rubVar = rub.b;
                        } else {
                            rubVar = rub.c;
                        }
                        iixVar.g.q(aeunVar, ruc.bY, rubVar);
                    }
                    aooh.c(igiVarT);
                }
            } else {
                iixVar = this;
                ajcq ajcqVarH = ((ahda) iixVar.h).h(new defpackage.ibi(iixVar, igfVar, i3, null), (java.util.concurrent.Executor) iixVar.d);
                aooh.e(ajcqVarH, "submitAsync(...)");
                iivVar.d = aeunVar2;
                iivVar.c = 2;
                java.lang.Object objD = aosv.D(ajcqVarH, iivVar);
                if (objD != igiVarT) {
                    aeunVar = aeunVar2;
                    obj = objD;
                    igiVar = (defpackage.igi) obj;
                    igiVarT = igiVar;
                    if (aeunVar != null) {
                        if (igiVarT.d) {
                            rubVar = rub.b;
                        } else {
                            rubVar = rub.c;
                        }
                        iixVar.g.q(aeunVar, ruc.bY, rubVar);
                    }
                    aooh.c(igiVarT);
                }
            }
        } else if (i2 == 1) {
            aeunVar = iivVar.d;
            aooc.af(obj);
            iixVar = this;
            igiVar = (defpackage.igi) obj;
            if (igiVar == null) {
                defpackage.heq heqVarA2 = defpackage.hhe.A(defpackage.igi.b.m());
                heqVarA2.v(false);
                heqVarA2.u(defpackage.igh.FAILURE_TIMEOUT);
                igiVarT = heqVarA2.t();
            } else {
                igiVarT = igiVar;
            }
            if (aeunVar != null) {
                if (igiVarT.d) {
                    rubVar = rub.b;
                } else {
                    rubVar = rub.c;
                }
                iixVar.g.q(aeunVar, ruc.bY, rubVar);
            }
            aooh.c(igiVarT);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aeunVar = iivVar.d;
            aooc.af(obj);
            iixVar = this;
            igiVar = (defpackage.igi) obj;
            igiVarT = igiVar;
            if (aeunVar != null) {
                if (igiVarT.d) {
                    rubVar = rub.b;
                } else {
                    rubVar = rub.c;
                }
                iixVar.g.q(aeunVar, ruc.bY, rubVar);
            }
            aooh.c(igiVarT);
        }
        return igiVarT;
    }

    public final java.lang.Object b(igf igfVar, aoln aolnVar) {
        return aosv.m(new defpackage.blj(igfVar, this, (aoln) null, 11), aolnVar);
    }

    public iix(ajcu ajcuVar, aoss aossVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, defpackage.ikc ikcVar, defpackage.iit iitVar, defpackage.ijb ijbVar, defpackage.ijf ijfVar, ruc rucVar) {
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "enableDeviceThermalThreshold");
        aooh.f(aoinVar2, "enableTimeoutInPreconditionsCheck");
        aooh.f(aoinVar3, "timeoutInPreconditionsCheckMillis");
        aooh.f(ikcVar, "callScopedCompositeModelAvailability");
        aooh.f(iitVar, "callPreconditionsChecker");
        aooh.f(ijfVar, "duolinksAvailability");
        aooh.f(rucVar, "metrics");
        this.d = ajcuVar;
        this.e = aossVar;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = aoinVar3;
        this.i = ikcVar;
        this.j = iitVar;
        this.f = ijbVar;
        this.k = ijfVar;
        this.g = rucVar;
        this.h = new ahda();
    }
}
