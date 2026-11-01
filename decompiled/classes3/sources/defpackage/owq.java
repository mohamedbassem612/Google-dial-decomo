package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class owq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;
    private final amzg e;

    public owq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.owq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
        this.e = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.pgi pgiVar = (defpackage.pgi) list.get(0);
        return !((java.lang.Boolean) this.d.a()).booleanValue() ? pgiVar.c() : ahvr.H(pgiVar.c(), new mjl((defpackage.oxg) list.get(1), 14), (ajct) list.get(2));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
