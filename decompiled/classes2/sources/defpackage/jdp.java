package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amyz h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;

    public jdp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amyz amyzVar3, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10) {
        super(amyzVar2, new amzw(defpackage.jdp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amyzVar3;
        this.i = amzs.b(amzgVar7);
        this.j = amzs.b(amzgVar8);
        this.k = amzs.b(amzgVar9);
        this.l = amzs.b(amzgVar10);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        iqm iqmVar = (iqm) list.get(0);
        zpo zpoVar = (zpo) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        zjl zjlVar = (zjl) list.get(5);
        izg izgVar = (izg) list.get(6);
        aoss aossVar = (aoss) list.get(7);
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(8)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(9)).booleanValue();
        aooh.f(iqmVar, "enabledFn");
        aooh.f(zpoVar, "callState");
        aooh.f(zjlVar, "recentEmergencyCallIdentifier");
        aooh.f(izgVar, "beeslyCallScopeState");
        aooh.f(aossVar, "lightweightScope");
        return aosv.F(aossVar, 0, new defpackage.jdl(this.h, zjlVar, iqmVar, zpoVar, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, izgVar, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.l;
        amzg amzgVar2 = this.k;
        amzg amzgVar3 = this.j;
        amzg amzgVar4 = this.i;
        amzg amzgVar5 = this.g;
        amzg amzgVar6 = this.f;
        amzg amzgVar7 = this.e;
        amzg amzgVar8 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
