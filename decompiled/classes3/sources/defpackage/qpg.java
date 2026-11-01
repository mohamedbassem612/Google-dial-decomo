package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qpg extends amzm {
    private final amyz b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qpg(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qpg.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
        this.d = amzs.b(amzgVar2);
        this.e = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        if ((!((java.lang.Boolean) this.b.a()).booleanValue() || !zBooleanValue) && !zBooleanValue2 && !zBooleanValue3) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.c.d(), this.d.d(), amzgVar.d()});
    }
}
