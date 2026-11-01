package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vmo implements defpackage.aguq {
    public final defpackage.rlv a;
    public final defpackage.aoin b;
    private final defpackage.ajct c;
    private final defpackage.rsr d;

    public vmo(defpackage.rsr rsrVar, defpackage.ajct ajctVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar) {
        this.d = rsrVar;
        this.c = ajctVar;
        this.a = rlvVar;
        this.b = aoinVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(987, "VvmNotificationWorker_startWork", defpackage.ahot.a, true);
        try {
            defpackage.rsr rsrVar = this.d;
            defpackage.ajcq ajcqVarC = ((defpackage.afhf) rsrVar.a).c();
            defpackage.kvf kvfVar = new defpackage.kvf(10);
            ?? r3 = rsrVar.b;
            long j = defpackage.ahqx.a;
            defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
            int i = defpackage.ajan.c;
            defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarC, ahqvVar);
            ajcqVarC.c(ajamVar, defpackage.aiql.t(r3, ajamVar));
            defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajamVar);
            defpackage.jyx jyxVar = new defpackage.jyx(this, 20);
            defpackage.ajct ajctVar = this.c;
            defpackage.ahrv ahrvVarH = ahrvVarG.h(jyxVar, ajctVar);
            j$.util.Objects.requireNonNull(rsrVar);
            defpackage.ahrv ahrvVarH2 = ahrvVarH.i(new defpackage.vmn(rsrVar, 0), ajctVar).h(new defpackage.kvf(11), ajctVar);
            ahoqVarX.a(ahrvVarH2);
            ahoqVarX.close();
            return ahrvVarH2;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
