package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nyv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public nyv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.nyv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        qbe qbeVar = (qbe) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        int i = defpackage.nyo.a;
        return !zBooleanValue ? aiql.z(java.lang.Boolean.FALSE) : ahvr.H(this.c.d(), new defpackage.mjl(qbeVar, 2), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar.d()});
    }
}
