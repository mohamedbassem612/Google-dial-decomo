package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfo extends amzm {
    private final amzg b;

    public lfo(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.lfo.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        pgi pgiVar = (pgi) obj;
        return ahvr.F(new defpackage.lgc(pgiVar, 1), (java.util.concurrent.Executor) pgiVar.b);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
