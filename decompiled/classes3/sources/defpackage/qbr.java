package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbr extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qbr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qbr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        akzx akzxVarM = defpackage.amro.a.m();
        akzxVarM.u();
        defpackage.amro amroVar = (defpackage.amro) akzxVarM.b;
        amroVar.b |= 1;
        amroVar.c = zBooleanValue;
        akzxVarM.u();
        defpackage.amro amroVar2 = (defpackage.amro) akzxVarM.b;
        amroVar2.b |= 2;
        amroVar2.d = zBooleanValue3;
        akzxVarM.u();
        defpackage.amro amroVar3 = (defpackage.amro) akzxVarM.b;
        amroVar3.b |= 4;
        amroVar3.e = zBooleanValue2;
        return aiql.z((defpackage.amro) akzxVarM.p());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
