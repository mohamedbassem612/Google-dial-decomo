package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mwz extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public mwz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.mwz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        defpackage.nqh nqhVar = (defpackage.nqh) list.get(1);
        qke qkeVar = (qke) list.get(2);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(nqhVar, "dobbySpam");
        aooh.f(qkeVar, "callStatusTextGenerator");
        return aosv.F(aossVar, 0, new defpackage.msi(nqhVar, qkeVar, (aoln) null, 10), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
