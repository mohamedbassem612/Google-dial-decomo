package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kwd implements defpackage.aguq {
    private final defpackage.kvy a;
    private final defpackage.ajct b;

    public kwd(defpackage.kvy kvyVar, defpackage.ajct ajctVar) {
        this.a = kvyVar;
        this.b = ajctVar;
    }

    public static defpackage.aguz c() {
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.kvz.class);
        aguvVarA.f(new defpackage.aguy("recording_stale_contact_number_cleanup_worker", 2));
        aguvVarA.d(new defpackage.aguw(new defpackage.agux(1L, java.util.concurrent.TimeUnit.DAYS), defpackage.ahwt.a));
        return aguvVarA.a();
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.ahvr.H(this.a.a(), new jvq(18), this.b);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
