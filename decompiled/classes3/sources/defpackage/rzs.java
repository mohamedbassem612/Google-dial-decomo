package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rzs {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/backend/CallingCardBackendService");
    public final android.content.Context b;
    public final aolr c;
    public final ruc d;
    public final sin e;
    public final aoin f;
    public final aoin g;
    public final aoin h;
    public final aoin i;
    public final aoin j;
    private final aoin k;
    private final anme l;
    private final defpackage.sfa m;
    private final aolr n;

    public rzs(aoin aoinVar, anme anmeVar, defpackage.zcu zcuVar, defpackage.sfa sfaVar, android.content.Context context, aolr aolrVar, aolr aolrVar2, ruc rucVar, sin sinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6) {
        aooh.f(aoinVar, "rpcClientProvider");
        aooh.f(zcuVar, "authTokenFetcher");
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(rucVar, "metrics");
        aooh.f(aoinVar2, "updateMyCallingCardRpcTimeoutMillis");
        aooh.f(aoinVar3, "getSelfMyCallingCardRpcTimeoutMillis");
        aooh.f(aoinVar4, "deleteMyCallingCardRpcTimeoutMillis");
        aooh.f(aoinVar5, "getCallInfoCallingCardRpcTimeoutMillis");
        aooh.f(aoinVar6, "enableContactsYourInfoFeatureRequestChanges");
        this.k = aoinVar;
        this.l = anmeVar;
        this.m = sfaVar;
        this.b = context;
        this.c = aolrVar;
        this.n = aolrVar2;
        this.d = rucVar;
        this.e = sinVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
        this.i = aoinVar5;
        this.j = aoinVar6;
    }

    public static final defpackage.rzj j(java.lang.Exception exc) {
        return new defpackage.rzj(exc, (((exc instanceof anqz) && ((anqz) exc).a.o == anqt.q) || (exc instanceof defpackage.rzi)) ? defpackage.rzk.a : defpackage.rzl.a);
    }

    public final java.lang.Object a(aoln aolnVar) {
        return aoov.aj(this.c, new mva(this, (aoln) null, 15), aolnVar);
    }

    public final java.lang.Object b(aoln aolnVar) {
        return aoov.aj(this.c, new defpackage.roy(this, (aoln) null, 8), aolnVar);
    }

    public final java.lang.Object c(android.accounts.Account account, aoln aolnVar) {
        return aoov.aj(this.c, new defpackage.rka(this, account, (aoln) null, 8), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(android.net.Uri uri, defpackage.afaw afawVar, aoln aolnVar) {
        defpackage.rzn rznVar;
        if (aolnVar instanceof defpackage.rzn) {
            rznVar = (defpackage.rzn) aolnVar;
            int i = rznVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rznVar.c = i - Integer.MIN_VALUE;
            } else {
                rznVar = new defpackage.rzn(this, aolnVar);
            }
        } else {
            rznVar = new defpackage.rzn(this, aolnVar);
        }
        java.lang.Object objAj = rznVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rznVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.n;
            hcn hcnVar = new hcn(this, uri, afawVar, (aoln) null, 12);
            rznVar.c = 1;
            objAj = aoov.aj(aolrVar, hcnVar, rznVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        aooh.e(objAj, "withContext(...)");
        return objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.rzo rzoVar;
        if (aolnVar instanceof defpackage.rzo) {
            rzoVar = (defpackage.rzo) aolnVar;
            int i = rzoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzoVar.c = i - Integer.MIN_VALUE;
            } else {
                rzoVar = new defpackage.rzo(this, aolnVar);
            }
        } else {
            rzoVar = new defpackage.rzo(this, aolnVar);
        }
        java.lang.Object objD = rzoVar.a;
        defpackage.ser serVar = aolu.a;
        int i2 = rzoVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.sfa sfaVar = this.m;
            rzoVar.c = 1;
            objD = sfaVar.d(rzoVar);
            if (objD != serVar) {
            }
            return serVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        serVar = (defpackage.ser) objD;
        if (serVar == null) {
            throw new defpackage.rzi(new java.lang.IllegalStateException("No account found for My Calling Card"));
        }
        if (serVar.c != 1) {
            throw new defpackage.rzi(new java.lang.IllegalStateException("Account for My Calling Card is disabled"));
        }
        return serVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(long j, aoln aolnVar) {
        defpackage.rzp rzpVar;
        if (aolnVar instanceof defpackage.rzp) {
            rzpVar = (defpackage.rzp) aolnVar;
            int i = rzpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzpVar.d = i - Integer.MIN_VALUE;
            } else {
                rzpVar = new defpackage.rzp(this, aolnVar);
            }
        } else {
            rzpVar = new defpackage.rzp(this, aolnVar);
        }
        java.lang.Object objE = rzpVar.b;
        aolu aoluVar = aolu.a;
        int i2 = rzpVar.d;
        if (i2 == 0) {
            aooc.af(objE);
            rzpVar.e = this;
            rzpVar.a = j;
            rzpVar.d = 1;
            objE = e(rzpVar);
            if (objE != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
            return objE;
        }
        j = rzpVar.a;
        this = rzpVar.e;
        aooc.af(objE);
        android.accounts.Account account = ((defpackage.ser) objE).a;
        rzpVar.e = null;
        rzpVar.d = 2;
        java.lang.Object objI = this.i(account, j);
        if (objI != aoluVar) {
            return objI;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(long j, aoln aolnVar) {
        defpackage.rzq rzqVar;
        if (aolnVar instanceof defpackage.rzq) {
            rzqVar = (defpackage.rzq) aolnVar;
            int i = rzqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzqVar.d = i - Integer.MIN_VALUE;
            } else {
                rzqVar = new defpackage.rzq(this, aolnVar);
            }
        } else {
            rzqVar = new defpackage.rzq(this, aolnVar);
        }
        java.lang.Object objD = rzqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = rzqVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.sfa sfaVar = this.m;
            rzqVar.a = j;
            rzqVar.d = 1;
            objD = sfaVar.d(rzqVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        j = rzqVar.a;
        aooc.af(objD);
        defpackage.ser serVar = (defpackage.ser) objD;
        if (serVar == null || serVar.c != 1) {
            return ((akmq) this.k.a()).j(new anme[]{this.l}).k(defpackage.zcv.a, defpackage.zcv.a()).i(7000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        android.accounts.Account account = serVar.a;
        rzqVar.d = 2;
        java.lang.Object objI = i(account, j);
        if (objI != aoluVar) {
            return objI;
        }
        return aoluVar;
    }

    public final java.lang.Object h(defpackage.abxt abxtVar, android.accounts.Account account, aoln aolnVar) {
        return aoov.aj(this.c, new defpackage.rzr(this, account, abxtVar, null), aolnVar);
    }

    public final java.lang.Object i(android.accounts.Account account, long j) {
        return ((akmq) this.k.a()).j(new anme[]{this.l}).k(defpackage.zcv.a, defpackage.zcv.b(account)).i(j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
