package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mff implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/darpa/impl/worker/DarpaDataUpdateWorker");
    public static final defpackage.grn b;
    public final defpackage.zjm c;
    private final defpackage.aoss d;

    static {
        defpackage.grl grlVar = new defpackage.grl();
        grlVar.b = true;
        b = grlVar.a();
    }

    public mff(defpackage.zjm zjmVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(aossVar, "backgroundScope");
        this.c = zjmVar;
        this.d = aossVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.d, 0, new lve(this, (defpackage.aoln) null, 9), 3);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
