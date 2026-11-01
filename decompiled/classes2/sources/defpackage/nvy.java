package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nvy implements java.util.function.IntFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.nwb a;

    public /* synthetic */ nvy(defpackage.nwb nwbVar, int i) {
        this.$cid = i;
        this.a = nwbVar;
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int i) {
        int i2 = this.$cid;
        defpackage.nwb nwbVar = this.a;
        if (i2 != 0) {
            ahrv ahrvVarI = ahrv.g(nwbVar.a(i)).i(new defpackage.lhy(nwbVar, 20), nwbVar.d);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            ajcu ajcuVar = nwbVar.e;
            return ahvr.B(aiql.G(ahrvVarI, 50L, timeUnit, ajcuVar), java.util.concurrent.TimeoutException.class, new lix(10), ajcuVar);
        }
        ahrv ahrvVarI2 = ahrv.g(nwbVar.a(i)).i(new defpackage.lhy(nwbVar, 19), nwbVar.d);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        ajcu ajcuVar2 = nwbVar.e;
        return ahvr.B(aiql.G(ahrvVarI2, 50L, timeUnit2, ajcuVar2), java.util.concurrent.TimeoutException.class, new lix(9), ajcuVar2);
    }
}
