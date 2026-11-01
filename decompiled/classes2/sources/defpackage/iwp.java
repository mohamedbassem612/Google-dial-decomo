package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iwp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public iwp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new amzw(defpackage.iwp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        iqm iqmVar = (iqm) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        defpackage.iwy iwyVar = (defpackage.iwy) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        zpo zpoVar = (zpo) list.get(5);
        java.lang.String str = (java.lang.String) list.get(6);
        aooh.f(iqmVar, "enabledFn");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(iwyVar, "beeslyLifecycleController");
        aooh.f(zpoVar, "callState");
        aooh.f(str, "callId");
        return aiql.z(aehj.cs(aossVar, new defpackage.iwm(iqmVar, 0), new defpackage.iwn(zpoVar, zBooleanValue, iwyVar, str, zBooleanValue2, null)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
