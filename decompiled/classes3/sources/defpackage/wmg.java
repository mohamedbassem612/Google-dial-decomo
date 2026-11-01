package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmg extends amzm {
    private final amzg b;
    private final amzg c;

    public wmg(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.wmg.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        akzx akzxVarM = defpackage.wkj.a.m();
        akzxVarM.u();
        defpackage.wkj wkjVar = (defpackage.wkj) akzxVarM.b;
        wkjVar.b |= 1;
        wkjVar.c = zBooleanValue;
        akzxVarM.u();
        defpackage.wkj wkjVar2 = (defpackage.wkj) akzxVarM.b;
        wkjVar2.b |= 2;
        wkjVar2.d = zBooleanValue2;
        return aiql.z((defpackage.wkj) akzxVarM.p());
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
