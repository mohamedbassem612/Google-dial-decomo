package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ohl extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ohl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.ohl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        oev oevVar = (oev) list.get(1);
        defpackage.ohr ohrVar = (defpackage.ohr) list.get(2);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(oevVar, "enabledFn");
        aooh.f(ohrVar, "preconditions");
        return aosv.F(aossVar, 0, new defpackage.ohh(oevVar, ohrVar, (aoln) null, 3), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
