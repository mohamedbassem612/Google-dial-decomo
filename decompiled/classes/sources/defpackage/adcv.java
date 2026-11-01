package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcv implements defpackage.aguq {
    public final java.util.Set a;
    private final android.content.Context b;
    private final defpackage.acwi c;
    private final defpackage.ajct d;
    private final defpackage.ahzi e = new fed(8);
    private final java.lang.String f;
    private final defpackage.ahbz g;

    public adcv(android.content.Context context, defpackage.acwi acwiVar, defpackage.ajct ajctVar, java.util.Set set, java.lang.String str, defpackage.ahbz ahbzVar) {
        this.b = context;
        this.c = acwiVar;
        this.d = ajctVar;
        this.a = set;
        this.f = str;
        this.g = ahbzVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        java.lang.Boolean.TRUE.booleanValue();
        if (!this.f.equals(defpackage.agab.ap())) {
            return defpackage.ahvr.H(this.g.h(workerParameters.a), new aczn(15), defpackage.ajbm.INSTANCE);
        }
        workerParameters.b.c("MDD_TASK_TAG_KEY");
        android.content.Context context = this.b;
        defpackage.acwi acwiVar = this.c;
        defpackage.ajct ajctVar = this.d;
        return adcs.e(new com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker(context, workerParameters, acwiVar, ajctVar, defpackage.ahwt.a).b()).f(new aczo(this, 17), ajctVar).b(java.lang.Throwable.class, new aczo(this, 18), ajctVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
