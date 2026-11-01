package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmf extends defpackage.ue {
    private static final aimz g = aimz.i("com/android/dialer/androidauto/impl/carservice/DialerCarSession");
    public final rlv c;
    public final ahpz d;
    public defpackage.hnm e;
    public defpackage.uc f;
    private final defpackage.hql h;
    private final defpackage.hqu i;
    private final defpackage.hqp j;
    private final gpd k;
    private final defpackage.klt l;
    private final rai m;

    public hmf(defpackage.hql hqlVar, defpackage.hqu hquVar, defpackage.hqp hqpVar, gpd gpdVar, rlv rlvVar, rai raiVar, ahpz ahpzVar, rai raiVar2) {
        aooh.f(hqlVar, "tabModel");
        aooh.f(hquVar, "tabModelScreenFactory");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(raiVar, "carInCallControllerFactory");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(raiVar2, "carIntentControllerFactory");
        this.h = hqlVar;
        this.i = hquVar;
        this.j = hqpVar;
        this.k = gpdVar;
        this.c = rlvVar;
        this.m = raiVar;
        this.d = ahpzVar;
        this.a.c(new defpackage.ud(this, 2));
        defpackage.tt ttVarA = a();
        aooh.e(ttVarA, "getCarContext(...)");
        defpackage.him himVar = ((defpackage.hio) raiVar2.a).a;
        this.l = new defpackage.klt(ttVarA, himVar.a.d(), (defpackage.hql) himVar.a.cD.a(), (defpackage.hmv) himVar.a.dn.a(), (rlv) himVar.fq.a(), (gpd) himVar.fD.a());
    }

    @Override // defpackage.ue
    public final defpackage.ub b(android.content.Intent intent) {
        aooh.f(intent, "intent");
        ahok ahokVarF = this.d.f(15, "DialerCarSession.onCreateScreen");
        try {
            g.b().l("com/android/dialer/androidauto/impl/carservice/DialerCarSession", "onCreateScreen$<anonymous>", 106, "DialerCarSession.kt").y("onCreateScreen: intent=%s", intent);
            e(mce.gc);
            rai raiVar = this.m;
            defpackage.tt ttVarA = a();
            aooh.e(ttVarA, "getCarContext(...)");
            defpackage.him himVar = ((defpackage.hio) raiVar.a).a;
            aoss aossVar = (aoss) himVar.fh.a();
            aolr aolrVar = (aolr) himVar.bn.a();
            apni apniVar = (apni) himVar.eY.a();
            zpm zpmVar = (zpm) himVar.fn.a();
            hps hpsVar = (hps) himVar.gV.a();
            hpx hpxVar = (hpx) himVar.EA.a();
            hpy hpyVar = (hpy) himVar.fx.a();
            defpackage.hip hipVar = himVar.a;
            this.e = new defpackage.hnm(ttVarA, aossVar, aolrVar, apniVar, zpmVar, hpsVar, hpxVar, hpyVar, hipVar.dp, hipVar.ds, (defpackage.hqu) hipVar.dt.a(), (rai) hipVar.du.a(), (ipc) himVar.EC.a(), (ipc) himVar.ED.a(), (rai) hipVar.dv.a(), (gpd) himVar.fD.a());
            ahoq ahoqVarW = ahvr.W(14, "DialerCarSession_createTabScreen");
            try {
                defpackage.hqu hquVar = this.i;
                defpackage.tt ttVarA2 = a();
                aooh.e(ttVarA2, "getCarContext(...)");
                defpackage.ub ubVarA = hquVar.a(ttVarA2, this.j, this.h);
                ubVarA.c = "googleDialer_tabScreen";
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                defpackage.hnm hnmVar = this.e;
                defpackage.ub ubVarA2 = (hnmVar == null || hnmVar.p.a().isEmpty() || hnmVar.k() || hnmVar.i()) ? null : hnmVar.a();
                defpackage.klt kltVar = this.l;
                if (kltVar != null) {
                    kltVar.e(intent);
                }
                if (ubVarA2 != null) {
                    defpackage.uc ucVar = this.f;
                    if (ucVar == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ucVar.e(ubVarA);
                    ubVarA = ubVarA2;
                }
                ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                return ubVarA;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahokVarF, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.ue
    public final void d(android.content.Intent intent) {
        aooh.f(intent, "intent");
        ahok ahokVarF = this.d.f(16, "DialerCarSession.onNewIntent");
        try {
            defpackage.klt kltVar = this.l;
            if (kltVar != null) {
                kltVar.e(intent);
            }
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    public final void e(mce mceVar) {
        this.k.i((java.lang.String) null).b(mceVar);
    }
}
