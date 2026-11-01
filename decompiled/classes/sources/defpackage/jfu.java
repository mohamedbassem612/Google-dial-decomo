package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jfu implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/v2/service/businessname/TranscriptBusinessNameWorker");
    public final jnc b;
    public final defpackage.rlv c;
    public final defpackage.zjm d;
    public final defpackage.kgl e;
    public final defpackage.rsr f;
    private final defpackage.aoss g;

    public jfu(defpackage.aoss aossVar, defpackage.kgl kglVar, defpackage.rsr rsrVar, jnc jncVar, defpackage.zjm zjmVar, defpackage.aais aaisVar, defpackage.rlv rlvVar) {
        defpackage.aooh.f(aossVar, "backgroundScope");
        defpackage.aooh.f(kglVar, "beeslySot");
        defpackage.aooh.f(aaisVar, "sanitizer");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        this.g = aossVar;
        this.e = kglVar;
        this.f = rsrVar;
        this.b = jncVar;
        this.d = zjmVar;
        this.c = rlvVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.g, 0, new jft(this, workerParameters, (defpackage.aoln) null), 3);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
