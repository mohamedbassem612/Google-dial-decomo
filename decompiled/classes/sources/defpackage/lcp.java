package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lcp implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/donation/scotty/CallScreenMetricsWorker");
    public static final defpackage.agux b = new defpackage.agux(5, java.util.concurrent.TimeUnit.MINUTES);
    public static final defpackage.agux c = new defpackage.agux(12, java.util.concurrent.TimeUnit.HOURS);
    public final defpackage.ajct d;
    public final defpackage.lkk e;
    public final lcl f;
    public final defpackage.aoin g;

    public lcp(defpackage.ajct ajctVar, defpackage.lkk lkkVar, lcl lclVar, defpackage.aoin aoinVar) {
        this.d = ajctVar;
        this.e = lkkVar;
        this.f = lclVar;
        this.g = aoinVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenMetricsWorker", "startWork", 71, "CallScreenMetricsWorker.java")).v("enter");
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.e.d());
        kxn kxnVar = new kxn(this, 8);
        defpackage.ajct ajctVar = this.d;
        return defpackage.ahvr.I(defpackage.ahvr.B(ahrvVarG.h(kxnVar, ajctVar).i(new kxm(this, 19), ajctVar), java.lang.Throwable.class, new lbs(12), ajctVar), new kxm(this, 18), ajctVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
