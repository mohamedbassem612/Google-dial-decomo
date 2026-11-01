package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nyu extends amzm {
    private final amyz b;
    private final amzg c;

    public nyu(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.nyu.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.nza nzaVar = (defpackage.nza) obj;
        int i = defpackage.nyo.a;
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return aiql.z(java.lang.Boolean.FALSE);
        }
        java.lang.Object objUpdateAndGet = j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(nzaVar.g, new oth(nzaVar, 1));
        aooh.c(objUpdateAndGet);
        ajcq ajcqVar = (ajcq) objUpdateAndGet;
        if (ajcqVar.isDone()) {
            try {
                aiql.H(ajcqVar);
                return ajcqVar;
            } catch (java.lang.Exception unused) {
                nzaVar.g.set(null);
                return ajcqVar;
            }
        }
        defpackage.kxt kxtVar = new defpackage.kxt(nzaVar, 8);
        ajct ajctVar = nzaVar.e;
        ahvr.J(ajcqVar, kxtVar, ajctVar);
        ahrv ahrvVarG = ahrv.g(aiql.A(ajcqVar));
        java.lang.Object objA = nzaVar.f.a();
        aooh.e(objA, "get(...)");
        return ahrvVarG.j(((java.lang.Number) objA).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, nzaVar.d).e(java.util.concurrent.TimeoutException.class, new defpackage.mjl(new defpackage.npi(nzaVar, 5), 4), ajctVar);
    }

    protected final ajcq c() {
        return this.c.d();
    }
}
