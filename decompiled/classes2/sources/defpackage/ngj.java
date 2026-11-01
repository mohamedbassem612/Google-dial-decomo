package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public ngj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new amzw(defpackage.ngj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        mnk mnkVar = (mnk) list.get(0);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(1);
        defpackage.neu neuVar = (defpackage.neu) list.get(2);
        aoss aossVar = (aoss) list.get(3);
        defpackage.mqt mqtVar = (defpackage.mqt) list.get(4);
        defpackage.ogj ogjVar = (defpackage.ogj) list.get(5);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(6)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(7)).booleanValue();
        aooh.f(mnkVar, "enabledFn");
        aooh.f(nmoVar, "lifecycleState");
        aooh.f(neuVar, "dobbyManualScreenConfigProvider");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(ogjVar, "dobbyCallScopeState");
        return aiql.z(aehj.cs(aossVar, new defpackage.nfp(mnkVar, 3), new defpackage.nfs(nmoVar, mqtVar, neuVar, ogjVar, zBooleanValue, zBooleanValue2, null)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.f;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
