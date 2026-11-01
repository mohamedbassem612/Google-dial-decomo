package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jso implements defpackage.aguq {
    public static final defpackage.grn c;
    public final defpackage.jsk d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    private final defpackage.ajct h;
    private final defpackage.zjm i;
    private static final defpackage.aimz g = defpackage.aimz.i("com/android/dialer/calleridfeedback/impl/database/retention/CallerIdFeedbackDeletionWorker");
    public static final defpackage.agux a = new defpackage.agux(5, java.util.concurrent.TimeUnit.MINUTES);
    public static final defpackage.agux b = new defpackage.agux(1, java.util.concurrent.TimeUnit.DAYS);

    static {
        defpackage.grl grlVar = new defpackage.grl();
        grlVar.b = true;
        c = grlVar.a();
    }

    public jso(defpackage.jsk jskVar, defpackage.ajct ajctVar, defpackage.zjm zjmVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.d = jskVar;
        this.h = ajctVar;
        this.i = zjmVar;
        this.e = aoinVar;
        this.f = aoinVar2;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        defpackage.aimz aimzVar = g;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calleridfeedback/impl/database/retention/CallerIdFeedbackDeletionWorker", "startWork", 68, "CallerIdFeedbackDeletionWorker.java")).v("startWork");
        if (this.i.g().isPresent()) {
            return this.h.submit(defpackage.ahqx.i(new hkx(this, 15)));
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calleridfeedback/impl/database/retention/CallerIdFeedbackDeletionWorker", "startWork", 70, "CallerIdFeedbackDeletionWorker.java")).v("CallerIdFeedback feature not present.");
        return defpackage.aiql.z(new defpackage.gsf());
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
