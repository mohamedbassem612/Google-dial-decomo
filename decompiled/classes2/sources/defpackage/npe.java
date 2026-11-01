package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class npe {
    public final aoss b;
    public final mnl c;
    public final defpackage.not d;
    public final defpackage.now e;
    public final rlv f;
    public final nnx g;
    public final uxe h;
    public final noe i;
    public aosy j;
    public uxa k;
    public final okw l;
    public final twp m;
    public final uxc n;
    public final yth o;
    public final aogc p;
    public final apni q;
    private final aolr s;
    private final defpackage.nox t;
    public static final mni r = new mni();
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/settings/service/DobbySettingsService");

    public npe(aolr aolrVar, aoss aossVar, apni apniVar, okw okwVar, mnl mnlVar, defpackage.not notVar, defpackage.nox noxVar, defpackage.now nowVar, rlv rlvVar, aogc aogcVar, nnx nnxVar, twp twpVar, uxc uxcVar, uxe uxeVar, noe noeVar, yth ythVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        aooh.f(nowVar, "fragmentState");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(uxeVar, "ttsResourceKeeperSynclet");
        this.s = aolrVar;
        this.b = aossVar;
        this.q = apniVar;
        this.l = okwVar;
        this.c = mnlVar;
        this.d = notVar;
        this.t = noxVar;
        this.e = nowVar;
        this.f = rlvVar;
        this.p = aogcVar;
        this.g = nnxVar;
        this.m = twpVar;
        this.n = uxcVar;
        this.h = uxeVar;
        this.i = noeVar;
        this.o = ythVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) throws aois {
        defpackage.noz nozVar;
        if (aolnVar instanceof defpackage.noz) {
            nozVar = (defpackage.noz) aolnVar;
            int i = nozVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nozVar.c = i - Integer.MIN_VALUE;
            } else {
                nozVar = new defpackage.noz(this, aolnVar);
            }
        } else {
            nozVar = new defpackage.noz(this, aolnVar);
        }
        java.lang.Object objB = nozVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nozVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            return aojh.a;
        }
        aooc.af(objB);
        defpackage.now nowVar = this.e;
        nozVar.c = 1;
        objB = nowVar.b(nozVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        int iOrdinal = ((defpackage.nov) objB).ordinal();
        if (iOrdinal == 0) {
            nozVar.c = 2;
            if (b(nozVar) == aoluVar) {
                return aoluVar;
            }
        } else if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new aois();
            }
            nozVar.c = 2;
            if (b(nozVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.npa npaVar;
        if (aolnVar instanceof defpackage.npa) {
            npaVar = (defpackage.npa) aolnVar;
            int i = npaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                npaVar.c = i - Integer.MIN_VALUE;
            } else {
                npaVar = new defpackage.npa(this, aolnVar);
            }
        } else {
            npaVar = new defpackage.npa(this, aolnVar);
        }
        java.lang.Object obj = npaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = npaVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.s;
            defpackage.mva mvaVar = new defpackage.mva(this, (aoln) null, 9);
            npaVar.c = 1;
            if (aoov.aj(aolrVar, mvaVar, npaVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.npb npbVar;
        defpackage.nov novVar;
        if (aolnVar instanceof defpackage.npb) {
            npbVar = (defpackage.npb) aolnVar;
            int i = npbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                npbVar.c = i - Integer.MIN_VALUE;
            } else {
                npbVar = new defpackage.npb(this, aolnVar);
            }
        } else {
            npbVar = new defpackage.npb(this, aolnVar);
        }
        java.lang.Object objA = npbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = npbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            this.p.t(ajcm.a, defpackage.not.a);
            return aojh.a;
        }
        aooc.af(objA);
        defpackage.nox noxVar = this.t;
        npbVar.c = 1;
        objA = noxVar.a(npbVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.now nowVar = this.e;
        alat alatVar = ((defpackage.igu) objA).b;
        aooh.e(alatVar, "getIndividualModelDownloadResultsList(...)");
        if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
            java.util.Iterator it = alatVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    novVar = defpackage.nov.c;
                    break;
                }
                if (!((defpackage.igt) it.next()).d) {
                    novVar = defpackage.nov.d;
                    break;
                }
            }
        } else {
            novVar = defpackage.nov.c;
            break;
        }
        npbVar.c = 2;
        if (nowVar.d(novVar, npbVar) == aoluVar) {
            return aoluVar;
        }
        this.p.t(ajcm.a, defpackage.not.a);
        return aojh.a;
    }

    public final void d() {
        this.p.t(ajcm.a, defpackage.not.a);
    }
}
