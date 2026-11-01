package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qjq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amyz f;

    public qjq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qjq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.qjp.a;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(zpoVar, "callState");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(aehj.ct(aossVar, new defpackage.qjm(this.f, this.b, zpoVar, zBooleanValue, null)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.c.d(), this.d.d(), amzgVar.d()});
    }
}
