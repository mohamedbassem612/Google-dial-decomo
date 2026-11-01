package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class whs {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl");
    public final java.util.concurrent.ScheduledExecutorService b;
    public final java.util.concurrent.Executor c;
    public final aoin d;
    public final java.util.Map e = new aca();
    public final defpackage.wsk f;
    public final defpackage.voc g;
    public final defpackage.voc h;

    public whs(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.voc vocVar, defpackage.wsk wskVar, defpackage.voc vocVar2, aoin aoinVar) {
        this.b = scheduledExecutorService;
        this.c = new ajdc(scheduledExecutorService);
        this.h = vocVar;
        this.f = wskVar;
        this.g = vocVar2;
        this.d = aoinVar;
    }

    public final void a(java.lang.String str, defpackage.amtj amtjVar) {
        this.h.f(str, new defpackage.vel(amtjVar, 18));
    }

    public final void b(java.lang.String str, int i) {
        akzx akzxVarM = defpackage.wgv.a.m();
        akzxVarM.u();
        defpackage.wgv wgvVar = (defpackage.wgv) akzxVarM.b;
        wgvVar.c = i - 1;
        wgvVar.b |= 1;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        akzxVarM.u();
        defpackage.wgv wgvVar2 = (defpackage.wgv) akzxVarM.b;
        wgvVar2.b |= 2;
        wgvVar2.d = jElapsedRealtime;
        defpackage.wgv wgvVar3 = (defpackage.wgv) akzxVarM.p();
        this.h.f(str, new defpackage.who(wgvVar3, 1));
        agsm.i(1054, ahvr.E(new opo(this, str, wgvVar3, 14), this.c), "failed to log event to Scotty for [%s]", new java.lang.Object[]{str});
    }
}
