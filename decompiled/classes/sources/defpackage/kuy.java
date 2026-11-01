package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kuy implements defpackage.aguq {
    private final kvb a;
    private final defpackage.ajct b;
    private final defpackage.aogc c;

    public kuy(defpackage.aogc aogcVar, kvb kvbVar, defpackage.ajct ajctVar) {
        this.c = aogcVar;
        this.a = kvbVar;
        this.b = ajctVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        defpackage.aogc aogcVar = this.c;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(defpackage.ahvr.H(((defpackage.aogc) aogcVar.b).bk(), new kwz(2), aogcVar.a));
        kvb kvbVar = this.a;
        j$.util.Objects.requireNonNull(kvbVar);
        hky hkyVar = new hky(kvbVar, 19);
        defpackage.ajct ajctVar = this.b;
        return ahrvVarG.i(hkyVar, ajctVar).h(new jvq(11), ajctVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
