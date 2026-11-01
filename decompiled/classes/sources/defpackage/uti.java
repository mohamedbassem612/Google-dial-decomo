package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uti implements defpackage.aguq {
    private final defpackage.aoin d;
    private final defpackage.ajcu e;
    private final utf f;
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/timekeeper/impl/worker/TimeKeeperDbRefreshingWorker");
    public static final defpackage.agux a = new defpackage.agux(20, java.util.concurrent.TimeUnit.MINUTES);
    public static final defpackage.agux b = new defpackage.agux(12, java.util.concurrent.TimeUnit.HOURS);

    public uti(defpackage.aoin aoinVar, defpackage.ajcu ajcuVar, utf utfVar) {
        this.d = aoinVar;
        this.e = ajcuVar;
        this.f = utfVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/timekeeper/impl/worker/TimeKeeperDbRefreshingWorker", "startWork", 64, "TimeKeeperDbRefreshingWorker.java")).v("enter");
        return !((java.lang.Boolean) this.d.a()).booleanValue() ? defpackage.aiql.z(new defpackage.gsf()) : defpackage.ahrv.g(this.f.b()).h(new uqm(15), this.e);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
