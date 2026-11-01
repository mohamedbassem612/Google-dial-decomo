package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wzh implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/atlas/ui/impl/database/postcall/AtlasMetricsWorker");
    public static final defpackage.agux b = new defpackage.agux(5, java.util.concurrent.TimeUnit.MINUTES);
    public static final defpackage.agux c = new defpackage.agux(12, java.util.concurrent.TimeUnit.HOURS);
    public static final defpackage.grn d;
    public static final long e;
    public final wze f;
    public final defpackage.ajct g;
    public final defpackage.rlv h;
    public final wyw i;
    private final defpackage.wzd j;

    static {
        defpackage.grl grlVar = new defpackage.grl();
        grlVar.b = true;
        d = grlVar.a();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        e = 172800000L;
    }

    public wzh(defpackage.ajct ajctVar, wze wzeVar, wyw wywVar, defpackage.wzd wzdVar, defpackage.rlv rlvVar) {
        this.g = ajctVar;
        this.f = wzeVar;
        this.i = wywVar;
        this.j = wzdVar;
        this.h = rlvVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasMetricsWorker", "startWork", 79, "AtlasMetricsWorker.java")).v("enter");
        this.h.o(defpackage.rmx.ATLAS_METRICS_WORKER_START_WORK);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.j.e(j$.time.Instant.now().toEpochMilli()));
        wrn wrnVar = new wrn(this, 14);
        defpackage.ajct ajctVar = this.g;
        return defpackage.ahrv.g(defpackage.ahvr.B(ahrvVarG.h(wrnVar, ajctVar).i(new wyv(this, 3), ajctVar), java.lang.Throwable.class, new wrn(this, 15), ajctVar)).i(new wyv(this, 2), ajctVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
