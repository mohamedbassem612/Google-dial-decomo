package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swi implements lmw, lmv {
    public static final aimz a = aimz.i("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl");
    public final rlv b;
    public final aoss c;
    public final aoin d;
    public final java.util.Set e;
    public final java.util.Map f;
    public final zzx g;
    private final ahda h;
    private final apni i;

    public swi(rlv rlvVar, zzx zzxVar, apni apniVar, aoss aossVar, aoin aoinVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "prefetchTimeoutMillis");
        this.b = rlvVar;
        this.g = zzxVar;
        this.i = apniVar;
        this.c = aossVar;
        this.d = aoinVar;
        this.h = new ahda((byte[]) null);
        this.e = new java.util.LinkedHashSet();
        this.f = new java.util.LinkedHashMap();
    }

    public final ajcq a(lmq lmqVar, lnl lnlVar) {
        aooh.f(lnlVar, "result");
        return aosv.F(this.c, 0, new defpackage.rjk(lnlVar, this, lmqVar, (aoln) null, 12), 3);
    }

    public final ajcq b(lmq lmqVar) {
        return aosv.F(this.c, 0, new bbf((aoln) null, 13, (byte[][][]) null), 3);
    }

    public final void c(aoub aoubVar) {
        this.i.i(aoubVar);
    }

    public final java.lang.Object d(defpackage.svp svpVar, boolean z) {
        c(ahvr.ag(this.c, this.h, new defpackage.swg(svpVar, this, z, null)));
        return aojh.a;
    }

    public final java.lang.Object e(long j, defpackage.svr svrVar) {
        c(ahvr.ag(this.c, this.h, new defpackage.swh(this, j, svrVar, (aoln) null, 0)));
        return aojh.a;
    }
}
