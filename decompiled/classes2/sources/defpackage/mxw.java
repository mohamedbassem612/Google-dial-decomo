package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxw extends amzm {
    private final amyz b;
    private final amzg c;
    private final amzg d;

    public mxw(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.mxw.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
        this.d = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        rai raiVar = (rai) list.get(1);
        amyz amyzVar = this.b;
        aooh.f(amyzVar, "androidAutoModelSeparationEnabled");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(raiVar, "resolver");
        return aiql.z(aehj.cs(aossVar, new defpackage.iwm(amyzVar, 15), new defpackage.kqu(raiVar, (aoln) null, 7)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.c.d(), this.d.d()});
    }
}
