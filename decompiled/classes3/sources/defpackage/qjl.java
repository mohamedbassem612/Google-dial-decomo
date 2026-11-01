package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qjl {
    private static final aimz q = aimz.i("com/android/dialer/incall/statusbarnotification/basicactions/BasicActionsController");
    public final aoin a;
    public final zmq b;
    public final rlv c;
    public final ajcu d;
    public final aoss e;
    public final defpackage.ovb f;
    public final defpackage.qax g;
    public final mba h;
    public final agsm i;
    public final hxv j;
    public final aoin k;
    public boolean l;
    public final defpackage.pqm m;
    public final defpackage.qbe n;
    public final apni o;
    public final defpackage.afpl p;
    private final android.content.Context r;
    private final aoin s;
    private final tkl t;
    private final zzx u;
    private final ipc v;

    public qjl(aoin aoinVar, android.content.Context context, defpackage.pqm pqmVar, zmq zmqVar, rlv rlvVar, ajcu ajcuVar, aoss aossVar, ipc ipcVar, tkl tklVar, defpackage.ovb ovbVar, defpackage.qbe qbeVar, defpackage.qax qaxVar, mba mbaVar, defpackage.afpl afplVar, agsm agsmVar, apni apniVar, hxv hxvVar, zzx zzxVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(aoinVar, "enableCoroutineInBasicActionsV2");
        aooh.f(context, "appContext");
        aooh.f(pqmVar, "callController");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(tklVar, "inCallUiVisibilityProvider");
        aooh.f(ovbVar, "answeredCallState");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(qaxVar, "callScopeLatencyTracker");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(agsmVar, "androidFutures");
        aooh.f(apniVar, "androidJobs");
        aooh.f(hxvVar, "audioInjector");
        aooh.f(aoinVar2, "enableCallControllerDoubleTapFix");
        aooh.f(aoinVar3, "enableSonyDocomoLandscapeIncallFix");
        this.a = aoinVar;
        this.r = context;
        this.m = pqmVar;
        this.b = zmqVar;
        this.c = rlvVar;
        this.d = ajcuVar;
        this.e = aossVar;
        this.v = ipcVar;
        this.t = tklVar;
        this.f = ovbVar;
        this.n = qbeVar;
        this.g = qaxVar;
        this.h = mbaVar;
        this.p = afplVar;
        this.i = agsmVar;
        this.o = apniVar;
        this.j = hxvVar;
        this.u = zzxVar;
        this.k = aoinVar2;
        this.s = aoinVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.qjk qjkVar;
        if (aolnVar instanceof defpackage.qjk) {
            qjkVar = (defpackage.qjk) aolnVar;
            int i = qjkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qjkVar.c = i - Integer.MIN_VALUE;
            } else {
                qjkVar = new defpackage.qjk(this, aolnVar);
            }
        } else {
            qjkVar = new defpackage.qjk(this, aolnVar);
        }
        java.lang.Object objD = qjkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = qjkVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.p.X();
            qjkVar.c = 1;
            objD = aosv.D(ajcqVarX, qjkVar);
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
        aooc.af(objD);
        ajcq ajcqVarAH = ((defpackage.qjj) aooc.ar(objD, defpackage.qjj.class)).aH();
        qjkVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAH, qjkVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final void b(boolean z) {
        this.c.n(rmw.kD);
        this.b.c(z, true);
        if (this.u.m()) {
            return;
        }
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            this.o.j(aoov.an(this.e, (aolr) null, 0, new jbu(this, z, (aoln) null, 12), 3), 60000L);
        } else {
            this.i.g(this.j.h(z ? 2131951703 : 2131951702), 1L, java.util.concurrent.TimeUnit.MINUTES);
        }
        this.n.a(z ? qbc.jw : qbc.jv);
    }

    public final void c() {
        if (((java.lang.Boolean) this.s.a()).booleanValue()) {
            j$.util.Optional optionalE = this.t.e();
            aooh.e(optionalE, "getIsInCallUiShowing(...)");
            if (((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
                q.b().l("com/android/dialer/incall/statusbarnotification/basicactions/BasicActionsController", "startInCallActivity", 303, "BasicActionsController.kt").v("InCallActivity is already showing; skipping startInCallActivity.");
                return;
            }
        }
        ahqx.l(this.r, this.v.bk(new defpackage.otd(false, false, false, false, false, null, null, null, null, 511)));
    }
}
