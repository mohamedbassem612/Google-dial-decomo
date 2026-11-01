package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hkq implements defpackage.kht, rje, rxr, wup, zut, defpackage.ahqc, amyo {
    public final android.app.Service a;
    public final defpackage.him b;
    public final amyz c;
    final amyz d;
    final amyz e;

    public hkq(defpackage.him himVar, android.app.Service service) {
        this.b = himVar;
        this.a = service;
        this.c = amzc.b(new defpackage.hjy(himVar, 0, 1));
        this.d = new defpackage.hjy(himVar, 1, 1);
        this.e = new defpackage.hjy(himVar, 2, 1);
    }

    public static final uzx f() {
        return new uzx(amyu.b(amzb.a));
    }

    public final rxq a() {
        defpackage.him himVar = this.b;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar.r.a();
        defpackage.hip hipVar = himVar.a;
        return new rxq(new akck(this.a, scheduledExecutorService, (anni) hipVar.la.a(), ahyn.h((java.util.List) hipVar.lb.a())), (android.content.Context) himVar.s.a(), (java.util.concurrent.Executor) himVar.L.a());
    }

    public final wun b() {
        com.android.incallui.InCallServiceImpl inCallServiceImpl = this.a;
        if (!(inCallServiceImpl instanceof com.android.incallui.InCallServiceImpl)) {
            throw new java.lang.IllegalStateException(hhx.b(inCallServiceImpl, wun.class, "Attempt to inject a Service wrapper of type "));
        }
        com.android.incallui.InCallServiceImpl inCallServiceImpl2 = inCallServiceImpl;
        aooc.ap(inCallServiceImpl2);
        defpackage.him himVar = this.b;
        defpackage.hip hipVar = himVar.a;
        defpackage.him himVar2 = hipVar.a;
        return new wun(inCallServiceImpl2, (wur) hipVar.ld.a(), aihd.o(new aile(new puq((zpm) himVar2.fn.a(), (opx) hipVar.hO.a(), (zms) himVar2.EB.a(), (zzx) himVar2.gx.a(), (zjm) himVar2.gf.a(), (android.content.pm.PackageManager) himVar2.aq.a(), j$.util.Optional.of(new qau((ajct) himVar2.r.a(), (gat) himVar2.ER.a(), new ott((android.content.Context) himVar2.s.a(), himVar2.sy(), (rlv) himVar2.fq.a(), (aogc) himVar2.Ea.a(), himVar2.OJ), (defpackage.ibd) himVar2.HD.a(), (rlv) himVar2.fq.a(), (otj) himVar2.NQ.a())), j$.util.Optional.of(new qav((android.content.Context) himVar2.s.a(), (zpm) himVar2.fn.a(), himVar2.sy(), (tkl) himVar2.gv.a())), j$.util.Optional.of(new pzm((ajct) himVar2.r.a(), (gat) himVar2.ER.a(), (rdp) himVar2.MU.a())), j$.util.Optional.of(new qaw((otj) himVar2.NQ.a(), (qba) himVar2.gU.a())), j$.util.Optional.of(himVar2.bq()), himVar2.be(), (agsm) himVar2.aT.a(), (ajcu) himVar2.r.a(), (ajct) himVar2.r.a(), hipVar.le, hipVar.lf, hipVar.lg))), (lpe) himVar.AZ.a(), (ruc) himVar.eK.a(), (mgw) himVar.cc.a());
    }

    public final zus c() {
        zuv zuvVar = new zuv(new zzx(this.d));
        zzx zzxVar = new zzx(this.e);
        defpackage.him himVar = this.b;
        zuw zuwVar = new zuw(zzxVar, (ajct) himVar.r.a());
        defpackage.hip hipVar = himVar.a;
        defpackage.him himVar2 = hipVar.a;
        android.content.Context context = (android.content.Context) himVar2.s.a();
        agth agthVar = (agth) himVar2.qb.a();
        aooh.f(context, "appContext");
        aooh.f(agthVar, "lightweightHandler");
        amdx amdxVar = new amdx();
        amdxVar.a = agthVar.getLooper();
        aawf aawfVar = new aawf(amdxVar);
        acxg acxgVar = aawg.a;
        return new zus(zuvVar, zuwVar, new ztj(new aawd(context, aawfVar.a(), (char[]) null), new zzx(hipVar.lp), (aoss) himVar2.cb.a()), j$.util.Optional.of(hipVar.v()));
    }

    @Override // defpackage.kht
    public final defpackage.kvt d() {
        return new defpackage.kvt((aoin) this.b.oT);
    }

    public final defpackage.hwv e() {
        defpackage.him himVar = this.b;
        return new defpackage.hwv((android.content.Context) himVar.s.a(), (aolr) himVar.bY.a(), new riv(himVar.a.aH(), himVar.ns()), new uzx((ahpz) himVar.bb.a()));
    }

    public final ahpz fh() {
        return (ahpz) this.b.bb.a();
    }

    public final java.util.Set hu() {
        return aikn.a;
    }
}
