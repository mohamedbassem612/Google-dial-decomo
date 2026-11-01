package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hnm {
    public static final aimz a = aimz.i("com/android/dialer/androidauto/impl/incall/CarInCallController");
    public final defpackage.tt b;
    public final aoss c;
    public final aolr d;
    public final hps e;
    public final hpx f;
    public final hpy g;
    public final defpackage.uc h;
    public aoub i;
    public aoub j;
    public aoub k;
    public aoub l;
    public aoub m;
    public aoub n;
    public defpackage.hnx o;
    public final zpm p;
    public final gpd q;
    public final ipc r;
    public final ipc s;
    public final apni t;
    public final rai u;
    public final rai v;
    private final aoin w;
    private final aoin x;
    private final defpackage.hqu y;

    public hnm(defpackage.tt ttVar, aoss aossVar, aolr aolrVar, apni apniVar, zpm zpmVar, hps hpsVar, hpx hpxVar, hpy hpyVar, aoin aoinVar, aoin aoinVar2, defpackage.hqu hquVar, rai raiVar, ipc ipcVar, ipc ipcVar2, rai raiVar2, gpd gpdVar) {
        aooh.f(ttVar, "carContext");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(aolrVar, "mainContext");
        aooh.f(apniVar, "androidJobs");
        aooh.f(zpmVar, "callScopes");
        aooh.f(hpsVar, "allCallsRemovedListener");
        aooh.f(hpxVar, "callScopeAddedListener");
        aooh.f(hpyVar, "inCallUpdateListener");
        aooh.f(aoinVar2, "inCallTemplateConverterProvider");
        aooh.f(hquVar, "inCallModelScreenFactory");
        aooh.f(raiVar, "carInCallErrorMessageScreenFactory");
        aooh.f(ipcVar, "carCallErrorMessageFlow");
        aooh.f(ipcVar2, "carAccountSelectorDataFlow");
        aooh.f(raiVar2, "carAccountSelectorScreenFactory");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.b = ttVar;
        this.c = aossVar;
        this.d = aolrVar;
        this.t = apniVar;
        this.p = zpmVar;
        this.e = hpsVar;
        this.f = hpxVar;
        this.g = hpyVar;
        this.w = aoinVar;
        this.x = aoinVar2;
        this.y = hquVar;
        this.v = raiVar;
        this.r = ipcVar;
        this.s = ipcVar2;
        this.u = raiVar2;
        this.q = gpdVar;
        java.lang.Object objD = ttVar.d();
        aooh.d(objD, "null cannot be cast to non-null type androidx.car.app.ScreenManager");
        this.h = (defpackage.uc) objD;
    }

    public final defpackage.ub a() {
        ahoq ahoqVarW = ahvr.W(37, "CarInCallController_createInCallScreen");
        try {
            defpackage.hnx hnxVar = (defpackage.hnx) this.w.a();
            this.o = hnxVar;
            aoub aoubVarJ = afsq.J(this.c, new dmu(this, (aoln) null, 15));
            this.t.i(aoubVarJ);
            this.n = aoubVarJ;
            defpackage.hqu hquVar = this.y;
            defpackage.tt ttVar = this.b;
            java.lang.Object objA = this.x.a();
            aooh.e(objA, "get(...)");
            aooh.c(hnxVar);
            defpackage.hqv hqvVarA = hquVar.a(ttVar, (defpackage.hqw) objA, hnxVar);
            hqvVarA.c = "inCall";
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return hqvVarA;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    public final java.lang.Object b(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.amj(this, (aoln) null, 12), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.amj(this, (aoln) null, 14, (byte[]) null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object d(defpackage.hoz hozVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.fyn(this, hozVar, (aoln) null, 2), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object e(java.lang.String str, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.fyn(this, str, (aoln) null, 3), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object f(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.amj(this, (aoln) null, 15, (char[]) null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object g(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.amj(this, (aoln) null, 16, (short[]) null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final java.lang.Object h(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.amj(this, (aoln) null, 17, (int[]) null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    public final boolean i() {
        zpm zpmVar = this.p;
        return zpmVar.a().size() == zpmVar.b(zpo.l).size();
    }

    public final boolean j() {
        zpm zpmVar = this.p;
        return zpmVar.a().size() == zpmVar.b(zpo.g).size();
    }

    public final boolean k() {
        java.util.Collection<defpackage.ub> collectionB = this.h.b();
        if (collectionB.isEmpty()) {
            return false;
        }
        for (defpackage.ub ubVar : collectionB) {
            if (ubVar == null) {
                a.d().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "isInCallScreenPushed$<anonymous>", 98, "CarInCallController.kt").y("Screen is null with carContext: %s", this.b);
            } else {
                java.lang.String str = ubVar.c;
                if (str != null && str.equals("inCall")) {
                    return true;
                }
            }
        }
        return false;
    }
}
