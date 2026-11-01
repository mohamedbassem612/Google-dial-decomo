package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lst extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public lst(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.lst.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        lrb lrbVar = (lrb) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        aooh.f(lrbVar, "enableContactCheckerFn");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(aehj.cs(aossVar, new defpackage.iwm(lrbVar, 11), new defpackage.lsp(zBooleanValue, null, 0)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
