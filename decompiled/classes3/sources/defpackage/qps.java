package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qps extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qps(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qps.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        int iIntValue = ((java.lang.Integer) list.get(1)).intValue();
        int iIntValue2 = ((java.lang.Integer) list.get(2)).intValue();
        if (zBooleanValue) {
            akzx akzxVarM = defpackage.amsc.a.m();
            akzxVarM.u();
            defpackage.amsc amscVar = (defpackage.amsc) akzxVarM.b;
            amscVar.b |= 2;
            amscVar.d = iIntValue;
            akzxVarM.u();
            defpackage.amsc amscVar2 = (defpackage.amsc) akzxVarM.b;
            amscVar2.b |= 1;
            amscVar2.c = iIntValue2;
            optionalEmpty = j$.util.Optional.of((defpackage.amsc) akzxVarM.p());
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
