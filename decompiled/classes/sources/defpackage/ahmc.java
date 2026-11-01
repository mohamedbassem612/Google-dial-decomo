package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahmc implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker");
    public final defpackage.ahlx b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final defpackage.ahbz d;
    public final defpackage.adag e;
    private final defpackage.ahli f;
    private final boolean g;
    private final defpackage.ahmk h;

    public ahmc(defpackage.ahli ahliVar, defpackage.ahbz ahbzVar, defpackage.ahlx ahlxVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.adag adagVar, defpackage.ahmk ahmkVar, boolean z) {
        this.f = ahliVar;
        this.d = ahbzVar;
        this.b = ahlxVar;
        this.c = scheduledExecutorService;
        this.e = adagVar;
        this.h = ahmkVar;
        java.lang.Boolean.FALSE.booleanValue();
        this.g = z;
    }

    public static java.lang.String c(defpackage.ahyn ahynVar) {
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker";
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        if (!this.g) {
            java.util.Set set = workerParameters.c;
            return defpackage.agab.bc(defpackage.ahvr.I(this.d.j((java.lang.String) defpackage.ahvr.aW(set.iterator(), new evz(16))), new ahju(this, workerParameters, 4, (byte[]) null), this.c), new defpackage.aczf(14), defpackage.ajbm.INSTANCE);
        }
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(this.f.b(), new ahju(this, workerParameters, 5, (byte[]) null), this.c);
        defpackage.ahmk ahmkVar = this.h;
        agqd agqdVar = new agqd(11);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ajcq ajcqVarF = defpackage.ajan.f(ajcqVarI, agqdVar, ajbmVar);
        agpe agpeVar = new agpe(workerParameters, 12);
        java.util.Set set2 = (java.util.Set) ahmkVar.c.a();
        defpackage.aihb aihbVarI = defpackage.aihd.i(set2.size());
        java.util.Iterator it = set2.iterator();
        while (it.hasNext()) {
            aihbVarI.c(new ahem(ahmkVar, agpeVar, (akxm) it.next(), 4));
        }
        return defpackage.ahvr.B(ahmkVar.d.d(new ahrw(ajcqVarF, 1), aihbVarI.g()), java.lang.Throwable.class, new agqd(12), ajbmVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
