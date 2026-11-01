package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aosv {
    public static final long A(long j, int i) {
        return (j & (-1073741824)) | ((long) i);
    }

    public static final void B(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Expected positive parallelism level, but got "));
        }
    }

    public static final defpackage.ajcq C(defpackage.aosy aosyVar) {
        defpackage.apbc apbcVar = new defpackage.apbc(aosyVar);
        aosyVar.p(new defpackage.nxi(apbcVar, aosyVar, 12, null));
        return apbcVar;
    }

    public static final java.lang.Object D(defpackage.ajcq ajcqVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        try {
            if (ajcqVar.isDone()) {
                return defpackage.a.h(ajcqVar);
            }
            defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
            aoscVar.z();
            ajcqVar.c(new defpackage.gyk(ajcqVar, aoscVar, 3, null), defpackage.ajbm.INSTANCE);
            aoscVar.d(new defpackage.kgg(ajcqVar, 6));
            java.lang.Object objK = aoscVar.k();
            if (objK != defpackage.aolu.a || aolnVar != null) {
                return objK;
            }
            defpackage.aooh.i("frame");
            return objK;
        } catch (java.util.concurrent.ExecutionException e) {
            throw E(e);
        }
    }

    public static final java.lang.Throwable E(java.util.concurrent.ExecutionException executionException) {
        java.lang.Throwable cause = executionException.getCause();
        defpackage.aooh.c(cause);
        return cause;
    }

    public static /* synthetic */ defpackage.ajcq F(defpackage.aoss aossVar, int i, defpackage.aonn aonnVar, int i2) {
        defpackage.aols aolsVar = (i2 & 1) != 0 ? defpackage.aols.a : null;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if (i == 2) {
            d(2);
            throw new java.lang.IllegalArgumentException(d(2).concat(" start is not supported"));
        }
        defpackage.apbd apbdVar = new defpackage.apbd(defpackage.aosn.b(aossVar, aolsVar));
        e(i, aonnVar, apbdVar, apbdVar);
        return apbdVar.b;
    }

    public static /* synthetic */ defpackage.aoxh G(defpackage.apaj apajVar, defpackage.aolr aolrVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            aolrVar = defpackage.aols.a;
        }
        if ((i3 & 2) != 0) {
            i = -3;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return apajVar.fL(aolrVar, i, i2);
    }

    public static final void H(defpackage.aozr aozrVar, java.lang.Object obj) {
        if (aozrVar.a != obj) {
            throw aozrVar;
        }
    }

    public static final java.lang.Object I(defpackage.aonn aonnVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.apai apaiVar = new defpackage.apai(aolnVar.u(), aolnVar);
        java.lang.Object objAa = defpackage.aooh.aa(apaiVar, true, apaiVar, aonnVar);
        if (objAa == defpackage.aolu.a && aolnVar == null) {
            defpackage.aooh.i("frame");
        }
        return objAa;
    }

    public static final java.lang.Object J(defpackage.aoxi aoxiVar, defpackage.aoxh[] aoxhVarArr, defpackage.aomy aomyVar, defpackage.aono aonoVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objI = I(new defpackage.apag(aoxhVarArr, aomyVar, aonoVar, aoxiVar, null), aolnVar);
        return objI != defpackage.aolu.a ? defpackage.aojh.a : objI;
    }

    public static final java.lang.String a(java.lang.Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final java.lang.String b(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String c(defpackage.aoln aolnVar) {
        java.lang.Object objAe;
        if (aolnVar instanceof defpackage.apbn) {
            return ((defpackage.apbn) aolnVar).toString();
        }
        try {
            objAe = aolnVar + '@' + b(aolnVar);
        } catch (java.lang.Throwable th) {
            objAe = defpackage.aooc.ae(th);
        }
        if (defpackage.aoiw.c(objAe) != null) {
            objAe = aolnVar.getClass().getName() + '@' + b(aolnVar);
        }
        return (java.lang.String) objAe;
    }

    public static /* synthetic */ java.lang.String d(int i) {
        return "LAZY";
    }

    public static void e(int i, defpackage.aonn aonnVar, java.lang.Object obj, defpackage.aoln aolnVar) {
        java.lang.Object objA;
        int i2 = i - 1;
        if (i2 == 0) {
            defpackage.aooh.ac(aonnVar, obj, aolnVar);
            return;
        }
        if (i2 == 2) {
            if (aonnVar == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.ajsz.ap(defpackage.ajsz.ao(aonnVar, obj, aolnVar)).w(defpackage.aojh.a);
            return;
        }
        if (i2 == 3) {
            try {
                defpackage.aolr aolrVarU = aolnVar.u();
                java.lang.Object objB = defpackage.apcp.b(aolrVarU, null);
                try {
                    if (aonnVar instanceof defpackage.aomb) {
                        defpackage.aoov.f(aonnVar, 2);
                        objA = aonnVar.a(obj, aolnVar);
                    } else {
                        objA = defpackage.ajsz.an(aonnVar, obj, aolnVar);
                    }
                    defpackage.apcp.c(aolrVarU, objB);
                    if (objA != defpackage.aolu.a) {
                        aolnVar.w(objA);
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.apcp.c(aolrVarU, objB);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (th instanceof defpackage.aotd) {
                    th = ((defpackage.aotd) th).a;
                }
                if (th == null) {
                    defpackage.aooh.i("exception");
                }
                aolnVar.w(new defpackage.aoiv(th));
            }
        }
    }

    public static final void f(defpackage.aotf aotfVar, defpackage.aoln aolnVar, boolean z) {
        java.lang.Object objN = aotfVar.n();
        java.lang.Throwable thQ = aotfVar.q(objN);
        java.lang.Object aoivVar = thQ != null ? new defpackage.aoiv(thQ) : aotfVar.m(objN);
        if (!z) {
            aolnVar.w(aoivVar);
            return;
        }
        if (aolnVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        }
        defpackage.apbn apbnVar = (defpackage.apbn) aolnVar;
        defpackage.aoln aolnVar2 = apbnVar.b;
        java.lang.Object obj = apbnVar.d;
        defpackage.aolr aolrVarU = aolnVar2.u();
        java.lang.Object objB = defpackage.apcp.b(aolrVarU, obj);
        defpackage.aovo aovoVarC = objB != defpackage.apcp.a ? defpackage.aosn.c(aolnVar2, aolrVarU, objB) : null;
        try {
            aolnVar2.w(aoivVar);
        } finally {
            if (aovoVarC == null || aovoVarC.X()) {
                defpackage.apcp.c(aolrVarU, objB);
            }
        }
    }

    public static final boolean g(int i) {
        return i == 1 || i == 2;
    }

    public static final long h(long j) {
        long j2 = defpackage.aorh.a;
        if (j > 0) {
            return defpackage.aorh.g(defpackage.aorh.j(j, defpackage.aooh.B(999999L, defpackage.aorj.NANOSECONDS)));
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object i(defpackage.aoln aolnVar) {
        aotb aotbVar;
        if (aolnVar instanceof aotb) {
            aotbVar = (aotb) aolnVar;
            int i = aotbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aotbVar.b = i - Integer.MIN_VALUE;
            } else {
                aotbVar = new aotb(aolnVar);
            }
        } else {
            aotbVar = new aotb(aolnVar);
        }
        java.lang.Object obj = aotbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aotbVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            aotbVar.b = 1;
            defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aotbVar), 1);
            aoscVar.z();
            if (aoscVar.k() == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        throw new defpackage.aoiq();
    }

    public static final java.lang.Object j(long j, defpackage.aoln aolnVar) {
        if (j > 0) {
            defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
            aoscVar.z();
            if (j < Long.MAX_VALUE) {
                l(aoscVar.b).d(j, aoscVar);
            }
            java.lang.Object objK = aoscVar.k();
            if (objK == defpackage.aolu.a) {
                return objK;
            }
        }
        return defpackage.aojh.a;
    }

    public static final java.lang.Object k(long j, defpackage.aoln aolnVar) {
        java.lang.Object objJ = j(h(j), aolnVar);
        return objJ != defpackage.aolu.a ? defpackage.aojh.a : objJ;
    }

    public static final defpackage.aota l(defpackage.aolr aolrVar) {
        defpackage.aolp aolpVar = aolrVar.get(defpackage.aolo.k);
        defpackage.aota aotaVar = aolpVar instanceof defpackage.aota ? (defpackage.aota) aolpVar : null;
        return aotaVar == null ? defpackage.aosx.a : aotaVar;
    }

    public static final java.lang.Object m(defpackage.aonn aonnVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.apcj apcjVar = new defpackage.apcj(aolnVar.u(), aolnVar);
        java.lang.Object objAa = defpackage.aooh.aa(apcjVar, true, apcjVar, aonnVar);
        if (objAa == defpackage.aolu.a && aolnVar == null) {
            defpackage.aooh.i("frame");
        }
        return objAa;
    }

    public static final defpackage.aoss n(defpackage.aolr aolrVar) {
        if (aolrVar.get(defpackage.aoub.d) == null) {
            aolrVar = aolrVar.plus(new defpackage.aoud(null));
        }
        return new defpackage.apbj(aolrVar, 0);
    }

    public static final defpackage.aoss o() {
        defpackage.aovh aovhVar = new defpackage.aovh(null);
        defpackage.aosp aospVar = defpackage.aoth.a;
        return new defpackage.apbj(defpackage.ajsz.as(aovhVar, defpackage.apcg.a), 0);
    }

    public static final defpackage.aoss p(defpackage.aoss aossVar, defpackage.aolr aolrVar) {
        return new defpackage.apbj(aossVar.c().plus(aolrVar), 0);
    }

    public static final void q(defpackage.aoss aossVar, java.util.concurrent.CancellationException cancellationException) {
        defpackage.aoub aoubVar = (defpackage.aoub) aossVar.c().get(defpackage.aoub.d);
        if (aoubVar != null) {
            aoubVar.s(cancellationException);
        } else {
            java.util.Objects.toString(aossVar);
            throw new java.lang.IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(java.lang.String.valueOf(aossVar)));
        }
    }

    public static final boolean r(defpackage.aoss aossVar) {
        defpackage.aoub aoubVar = (defpackage.aoub) aossVar.c().get(defpackage.aoub.d);
        if (aoubVar != null) {
            return aoubVar.t();
        }
        return true;
    }

    public static final java.lang.Throwable s(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th == th2) {
            return th;
        }
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
        aoil.b(runtimeException, th);
        return runtimeException;
    }

    public static final void t(defpackage.aolr aolrVar, java.lang.Throwable th) {
        if (th instanceof defpackage.aotd) {
            th = ((defpackage.aotd) th).a;
        }
        try {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) aolrVar.get(kotlinx.coroutines.CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(aolrVar, th);
            } else {
                aoil.f(aolrVar, th);
            }
        } catch (java.lang.Throwable th2) {
            aoil.f(aolrVar, s(th, th2));
        }
    }

    public static final java.lang.Object u(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (!(obj instanceof defpackage.aosk)) {
            return obj;
        }
        java.lang.Throwable thA = ((defpackage.aosk) obj).b;
        if (defpackage.aosu.b && (aolnVar instanceof defpackage.aome)) {
            thA = defpackage.apcl.a(thA, (defpackage.aome) aolnVar);
        }
        if (thA == null) {
            defpackage.aooh.i("exception");
        }
        return new defpackage.aoiv(thA);
    }

    public static final java.lang.Object v(java.lang.Object obj) {
        java.lang.Throwable thC = defpackage.aoiw.c(obj);
        return thC != null ? new defpackage.aosk(thC, false) : obj;
    }

    public static final boolean w(defpackage.aosi aosiVar, java.lang.Object obj) {
        java.lang.Throwable thC = defpackage.aoiw.c(obj);
        return thC == null ? aosiVar.Q(obj) : aosiVar.c(thC);
    }

    public static final boolean x(java.lang.String str, boolean z) {
        java.lang.String property;
        int i = defpackage.apcn.a;
        try {
            property = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        return property != null ? java.lang.Boolean.parseBoolean(property) : z;
    }

    public static final int y(java.lang.String str, int i, int i2) {
        return (int) z(str, i, i2);
    }

    public static final long z(java.lang.String str, long j, long j2) {
        java.lang.String property;
        int i = defpackage.apcn.a;
        try {
            property = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        java.lang.Long lQ = defpackage.aoov.q(property);
        if (lQ == null) {
            throw new java.lang.IllegalStateException("System property '" + str + "' has unrecognized value '" + property + '\'');
        }
        long jLongValue = lQ.longValue();
        if (jLongValue >= 1 && jLongValue <= j2) {
            return jLongValue;
        }
        throw new java.lang.IllegalStateException("System property '" + str + "' should be in range 1.." + j2 + ", but is '" + jLongValue + '\'');
    }
}
