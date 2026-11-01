package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qyp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qyp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qyp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        defpackage.ptx ptxVar = (defpackage.ptx) list.get(1);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ptxVar, "callProperties");
        return aosv.F(aossVar, 0, new ohh(ptxVar, this.c, (aoln) null, 18), 3);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.d.d()});
    }
}
