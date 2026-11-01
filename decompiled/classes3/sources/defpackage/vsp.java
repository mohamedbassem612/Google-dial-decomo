package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vsp extends amzm {
    private final amzg b;
    private final amzg c;

    public vsp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.vsp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        try {
            return aiql.z((defpackage.vru) ((defpackage.amzf) obj).a());
        } catch (java.util.concurrent.ExecutionException unused) {
            return this.c.d();
        }
    }

    protected final ajcq c() {
        ajcq ajcqVarD = this.b.d();
        ahyc ahycVar = amzs.a;
        ajbm ajbmVar = ajbm.a;
        return aizu.g(ajan.f(ajcqVarD, ahycVar, ajbmVar), java.lang.Throwable.class, amzs.b, ajbmVar);
    }
}
