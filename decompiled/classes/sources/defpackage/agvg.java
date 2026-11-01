package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agvg implements defpackage.aguq {
    public final defpackage.aoin a;
    private volatile java.util.function.Supplier b = new defpackage.kjx(8);
    private final defpackage.aogc c;

    public agvg(defpackage.aoin aoinVar, defpackage.aogc aogcVar) {
        this.a = aoinVar;
        this.c = aogcVar;
    }

    @Override // defpackage.agva
    public final defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return ((defpackage.aguq) this.a.a()).a(workerParameters);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1324, "NoAccountWorkerFactory startWork()", defpackage.ahot.a, true);
        try {
            defpackage.aogc aogcVar = this.c;
            defpackage.vuw vuwVar = new defpackage.vuw(this, ahoqVarX, workerParameters, 6);
            java.util.function.Supplier supplier = this.b;
            java.util.Set set = (java.util.Set) aogcVar.a.a();
            int size = set.size();
            defpackage.ahvr.bC(size, "expectedSize");
            defpackage.aihb aihbVar = new defpackage.aihb(size, true);
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                aihbVar.c(new defpackage.agvk(aogcVar, (defpackage.agus) it.next(), workerParameters, supplier));
            }
            defpackage.ajcq ajcqVarD = ((defpackage.ahda) aogcVar.b).d(vuwVar, aihbVar.g());
            ahoqVarX.close();
            return ajcqVarD;
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
    public final void h(java.util.function.Supplier supplier) {
        this.b = supplier;
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }
}
