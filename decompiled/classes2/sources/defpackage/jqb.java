package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqb extends amzm {
    private final amzg b;
    private final amzg c;

    public jqb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.jqb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.jpk.a;
        aoss aossVar = (aoss) list.get(0);
        ugs ugsVar = (ugs) list.get(1);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ugsVar, "moiraiIntegration");
        return aosv.F(aossVar, 0, new defpackage.jlk(ugsVar, (aoln) null, 7), 3);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
