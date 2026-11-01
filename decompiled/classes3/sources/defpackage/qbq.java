package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qbq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qbq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        rmt rmtVar = (rmt) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        akzx akzxVarM = defpackage.ampg.a.m();
        boolean z = rmtVar == rmt.d || rmtVar == rmt.e || rmtVar == rmt.m;
        akzxVarM.u();
        defpackage.ampg ampgVar = (defpackage.ampg) akzxVarM.b;
        ampgVar.b |= 1;
        ampgVar.c = z;
        boolean zIsPresent = optional.isPresent();
        akzxVarM.u();
        defpackage.ampg ampgVar2 = (defpackage.ampg) akzxVarM.b;
        ampgVar2.b |= 2;
        ampgVar2.d = zIsPresent;
        akzxVarM.u();
        defpackage.ampg ampgVar3 = (defpackage.ampg) akzxVarM.b;
        ampgVar3.b |= 4;
        ampgVar3.e = zBooleanValue;
        return aiql.z((defpackage.ampg) akzxVarM.p());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
