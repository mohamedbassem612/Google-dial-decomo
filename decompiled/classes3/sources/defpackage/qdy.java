package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qdy extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qdy(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qdy.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        akzx akzxVarM = defpackage.qdv.a.m();
        akzxVarM.u();
        defpackage.qdv qdvVar = (defpackage.qdv) akzxVarM.b;
        qdvVar.b |= 1;
        qdvVar.c = zBooleanValue;
        akzxVarM.u();
        defpackage.qdv qdvVar2 = (defpackage.qdv) akzxVarM.b;
        qdvVar2.b |= 2;
        qdvVar2.d = zBooleanValue2;
        akzxVarM.u();
        defpackage.qdv qdvVar3 = (defpackage.qdv) akzxVarM.b;
        qdvVar3.b |= 4;
        qdvVar3.e = zBooleanValue3;
        return aiql.z((defpackage.qdv) akzxVarM.p());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
