package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class xeq implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker");
    public static final long b;
    public static final defpackage.agux c;
    public final defpackage.ajct d;
    public final defpackage.lkk e;
    public final defpackage.rlv f;
    public final defpackage.aoin g;
    public final defpackage.ldb h;
    public final defpackage.zjm i;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        b = 2592000000L;
        c = new defpackage.agux(1L, java.util.concurrent.TimeUnit.DAYS);
    }

    public xeq(defpackage.ajct ajctVar, defpackage.lkk lkkVar, defpackage.ldb ldbVar, defpackage.zjm zjmVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar) {
        this.d = ajctVar;
        this.e = lkkVar;
        this.h = ldbVar;
        this.i = zjmVar;
        this.f = rlvVar;
        this.g = aoinVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker", "startWork", 78, "CallScreenRecordingsDeletionWorker.java")).v("startWork");
        j$.util.Optional optionalG = this.i.g();
        defpackage.ajcq ajcqVarZ = !optionalG.isPresent() ? defpackage.aiql.z(java.lang.Boolean.FALSE) : ((defpackage.swv) optionalG.orElseThrow()).b();
        defpackage.vmn vmnVar = new defpackage.vmn(this, 9);
        defpackage.ajct ajctVar = this.d;
        return defpackage.ahvr.I(defpackage.ahvr.I(ajcqVarZ, vmnVar, ajctVar), new defpackage.vmn(this, 8), ajctVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
