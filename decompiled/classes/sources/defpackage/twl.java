package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class twl implements defpackage.aguq {
    public final defpackage.twp a;
    public final defpackage.zzx b;
    private final defpackage.aoss c;

    public twl(defpackage.aoss aossVar, defpackage.twp twpVar, defpackage.zzx zzxVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        this.c = aossVar;
        this.a = twpVar;
        this.b = zzxVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        defpackage.aooh.f(workerParameters, "workerParameters");
        return defpackage.aosv.F(this.c, 0, new tpd(this, (defpackage.aoln) null, 16), 3);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
