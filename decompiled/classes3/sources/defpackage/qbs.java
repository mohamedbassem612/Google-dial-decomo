package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbs extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qbs(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qbs.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.zqj zqjVar = (defpackage.zqj) list.get(0);
        defpackage.qbg qbgVar = (defpackage.qbg) list.get(1);
        jxb jxbVar = (jxb) list.get(2);
        long jLongValue = ((java.lang.Long) list.get(3)).longValue();
        akzx akzxVarM = defpackage.amtf.a.m();
        boolean z = qbgVar.f;
        akzxVarM.u();
        defpackage.amtf amtfVar = (defpackage.amtf) akzxVarM.b;
        amtfVar.b |= 2;
        amtfVar.d = z;
        boolean z2 = jxbVar.s;
        akzxVarM.u();
        defpackage.amtf amtfVar2 = (defpackage.amtf) akzxVarM.b;
        amtfVar2.b |= 1;
        amtfVar2.c = z2;
        if (zqjVar.i.isPresent()) {
            long jLongValue2 = ((java.lang.Long) zqjVar.i.orElseThrow()).longValue() - jLongValue;
            akzxVarM.u();
            defpackage.amtf amtfVar3 = (defpackage.amtf) akzxVarM.b;
            amtfVar3.b |= 4;
            amtfVar3.e = jLongValue2;
        }
        return aiql.z((defpackage.amtf) akzxVarM.p());
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
