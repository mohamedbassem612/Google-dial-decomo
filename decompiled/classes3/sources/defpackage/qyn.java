package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qyn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qyn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qyn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        amzs.b(amzgVar2);
        this.c = amzs.b(amzgVar3);
        this.d = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aify aifyVar = (aify) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(aifyVar, "sortedSafeCuldesacCategories");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        return aosv.F(aossVar, 0, new defpackage.pbw(aifyVar, (aoln) null, 12), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
