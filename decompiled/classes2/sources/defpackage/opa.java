package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class opa extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public opa(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.opa.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        zpo zpoVar = (zpo) list.get(3);
        aooh.f(zpoVar, "callState");
        if (!zBooleanValue2 && zpoVar == zpo.d && !zBooleanValue3 && zBooleanValue) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
