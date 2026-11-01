package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kvz implements defpackage.aguq {
    private final defpackage.ajct a;
    private final hwv b;

    public kvz(hwv hwvVar, defpackage.ajct ajctVar) {
        this.b = hwvVar;
        this.a = ajctVar;
    }

    public static defpackage.aguz c() {
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.kvz.class);
        aguvVarA.f(new defpackage.aguy("recording_geofence_check_worker", 2));
        aguvVarA.d(new defpackage.aguw(new defpackage.agux(1L, java.util.concurrent.TimeUnit.DAYS), defpackage.ahwt.a));
        return aguvVarA.a();
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        hwv hwvVar = this.b;
        defpackage.kvy kvyVar = (defpackage.kvy) hwvVar.e;
        return defpackage.ahvr.H(defpackage.ahrv.g(defpackage.ahrv.g(kvyVar.n.aW()).h(new jvq(15), kvyVar.f)).i(new kvd(hwvVar, 11), hwvVar.a), new jvq(16), this.a);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
