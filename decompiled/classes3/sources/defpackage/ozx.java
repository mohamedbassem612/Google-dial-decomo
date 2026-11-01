package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ozx implements ajat {
    public final /* synthetic */ defpackage.ozy a;
    public final /* synthetic */ defpackage.wjc b;

    public /* synthetic */ ozx(defpackage.wjc wjcVar, defpackage.ozy ozyVar) {
        this.b = wjcVar;
        this.a = ozyVar;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (optional.isPresent()) {
            return ((defpackage.oul) optional.orElseThrow()).a();
        }
        defpackage.ozy ozyVar = this.a;
        defpackage.wjc wjcVar = this.b;
        ajcq ajcqVarAS = ozyVar.aS();
        ajcq ajcqVarAH = ozyVar.aH();
        ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarAS, ajcqVarAH});
        lly llyVar = new lly(ajcqVarAS, ajcqVarAH, 18);
        ?? r5 = wjcVar.e;
        return ahvr.I(ahdaVarAk.o(llyVar, (java.util.concurrent.Executor) r5), new ocj(wjcVar, 10), (java.util.concurrent.Executor) r5);
    }
}
