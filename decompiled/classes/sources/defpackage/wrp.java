package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wrp implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/xatu/impl/storage/postcall/XatuMetricsWorker");
    public static final defpackage.agux b = new defpackage.agux(5, java.util.concurrent.TimeUnit.MINUTES);
    public static final defpackage.agux c = new defpackage.agux(12, java.util.concurrent.TimeUnit.HOURS);
    public static final long d;
    public final wrj e;
    public final defpackage.ajct f;
    public final defpackage.wqr g;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        d = 172800000L;
    }

    public wrp(defpackage.ajct ajctVar, wrj wrjVar, defpackage.wqr wqrVar) {
        this.f = ajctVar;
        this.e = wrjVar;
        this.g = wqrVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/xatu/impl/storage/postcall/XatuMetricsWorker", "startWork", 67, "XatuMetricsWorker.java")).v("enter");
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("SELECT * FROM xatu_data WHERE call_creation_time_millis < ?");
        adagVar.o(java.lang.Long.valueOf(epochMilli));
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.g.m(adagVar.B()));
        wrn wrnVar = new wrn(this, 0);
        defpackage.ajct ajctVar = this.f;
        return defpackage.ahrv.g(defpackage.ahvr.B(ahrvVarG.h(wrnVar, ajctVar).i(new wkv(this, 12), ajctVar), java.lang.Throwable.class, new wro(1), ajctVar)).i(new wkv(this, 11), ajctVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
