package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxs extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public mxs(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.mxs.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        defpackage.ogj ogjVar = (defpackage.ogj) list.get(1);
        kaw kawVar = (kaw) list.get(2);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ogjVar, "state");
        aooh.f(kawVar, "audioUnclearIndicator");
        return aosv.F(aossVar, 0, new defpackage.mwq(ogjVar, kawVar, this.d, (aoln) null, 0), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
