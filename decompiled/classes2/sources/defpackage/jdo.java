package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;

    public jdo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3) {
        super(amyzVar2, new amzw(defpackage.jdo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        aoss aossVar = (aoss) list.get(1);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(aehj.cs(aossVar, new defpackage.ohk(zBooleanValue2, 1), new shf(this.e, zBooleanValue, (aoln) null, 1)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
