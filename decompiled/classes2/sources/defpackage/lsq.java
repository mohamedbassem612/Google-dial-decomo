package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lsq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public lsq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.lsq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        lrb lrbVar = (lrb) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        defpackage.lsn lsnVar = (defpackage.lsn) list.get(2);
        kaw kawVar = (kaw) list.get(3);
        aooh.f(lrbVar, "enableContactCheckerFn");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(lsnVar, "controller");
        aooh.f(kawVar, "callerId");
        return aiql.z(aehj.cs(aossVar, new defpackage.iwm(lrbVar, 13), new defpackage.bhp(kawVar, lsnVar, (aoln) null, 13)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
