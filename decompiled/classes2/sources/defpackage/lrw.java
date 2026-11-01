package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lrw extends amzm {
    private final amzg b;
    private final amyz c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public lrw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.lrw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
        this.d = amzs.b(amzgVar2);
        this.e = amzs.b(amzgVar3);
        this.f = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        lrb lrbVar = (lrb) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        kaw kawVar = (kaw) list.get(2);
        aooh.f(lrbVar, "enableContactCheckerFn");
        amyz amyzVar = this.c;
        aooh.f(amyzVar, "controller");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(kawVar, "callerId");
        return aiql.z(aehj.cs(aossVar, new defpackage.iwm(lrbVar, 9), new defpackage.ako(kawVar, (aoin) amyzVar, this.d, (aoln) null, 5)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        return aiql.w(new ajcq[]{this.b.d(), this.e.d(), amzgVar.d()});
    }
}
