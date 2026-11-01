package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nbv {
    public final aolr b;
    public final aoss c;
    public final aoss d;
    public final defpackage.nbr e;
    public final defpackage.nej f;
    public final defpackage.nqh g;
    public final nnx h;
    public final defpackage.mqt i;
    public final defpackage.mba j;
    public final defpackage.nhq k;
    public final aoin l;
    public final aoin m;
    public final aoin n;
    public final aoin o;
    public final qbe p;
    public final ptx q;
    public final okw r;
    public final pci s;
    public final defpackage.ogj t;
    public final tpf v;
    private final ruc w;
    private final ahda x;
    public static final mni u = new mni();
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController");

    public nbv(aolr aolrVar, aoss aossVar, aoss aossVar2, okw okwVar, defpackage.nbr nbrVar, defpackage.nej nejVar, defpackage.nqh nqhVar, nnx nnxVar, defpackage.mqt mqtVar, defpackage.ogj ogjVar, qbe qbeVar, ptx ptxVar, defpackage.mba mbaVar, defpackage.nhq nhqVar, pci pciVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, tpf tpfVar, ruc rucVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(nejVar, "dobbyLifecycleController");
        aooh.f(nqhVar, "dobbySpam");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(ptxVar, "callProperties");
        aooh.f(nhqVar, "session");
        aooh.f(pciVar, "phoneDialerInCallArbiter");
        aooh.f(aoinVar, "dobbyAsyncCallController");
        aooh.f(aoinVar2, "winkyPhaseTwoEnabled");
        aooh.f(aoinVar3, "winkyFullFunctionalityEnabled");
        aooh.f(aoinVar4, "useCoroutinesLaunch");
        aooh.f(aoinVar5, "performCallActionIfRelayFailed");
        aooh.f(tpfVar, "dobbyUseCaseRunnerCoordinator");
        aooh.f(rucVar, "metrics");
        this.b = aolrVar;
        this.c = aossVar;
        this.d = aossVar2;
        this.r = okwVar;
        this.e = nbrVar;
        this.f = nejVar;
        this.g = nqhVar;
        this.h = nnxVar;
        this.i = mqtVar;
        this.t = ogjVar;
        this.p = qbeVar;
        this.q = ptxVar;
        this.j = mbaVar;
        this.k = nhqVar;
        this.s = pciVar;
        this.l = aoinVar;
        this.m = aoinVar2;
        this.n = aoinVar3;
        this.o = aoinVar5;
        this.v = tpfVar;
        this.w = rucVar;
        this.x = new ahda((byte[]) null);
    }

    public final ajcq a(aenj aenjVar, aonj aonjVar) {
        return aosv.C(ahvr.ag(this.c, this.x, new defpackage.muz(pez.aR(this.w, ruc.bn, aenjVar, new defpackage.kqu(aonjVar, (aoln) null, 10, (byte[]) null)), (aoln) null, 15, (char[]) null)));
    }

    public final java.lang.Object b(aoln aolnVar) {
        defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
        defpackage.nwj nwjVarAD = mni.aD(defpackage.nlu.a.m());
        nwjVarAD.D();
        npwVarAB.G(nwjVarAD.C());
        java.lang.Object objB = this.t.b(npwVarAB.D(), aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(alyi alyiVar, aoln aolnVar) {
        defpackage.nbu nbuVar;
        if (aolnVar instanceof defpackage.nbu) {
            nbuVar = (defpackage.nbu) aolnVar;
            int i = nbuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbuVar.c = i - Integer.MIN_VALUE;
            } else {
                nbuVar = new defpackage.nbu(this, aolnVar);
            }
        } else {
            nbuVar = new defpackage.nbu(this, aolnVar);
        }
        java.lang.Object obj = nbuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nbuVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ajcq ajcqVarA = a(ruc.bq, new defpackage.bhp(this, alyiVar, (aoln) null, 16));
            nbuVar.c = 1;
            if (aosv.D(ajcqVarA, nbuVar) == aoluVar) {
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
}
