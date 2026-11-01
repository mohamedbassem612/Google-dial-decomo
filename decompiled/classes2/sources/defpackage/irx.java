package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class irx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amyz f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public irx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amyz amyzVar3, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new amzw(defpackage.irx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amyzVar3;
        this.g = amzs.b(amzgVar5);
        this.h = amzs.b(amzgVar6);
        this.i = amzs.b(amzgVar7);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        zjl zjlVar = (zjl) list.get(3);
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(5)).booleanValue();
        aoss aossVar = (aoss) list.get(6);
        aooh.f(zjlVar, "recentEmergencyCallIdentifier");
        aooh.f(aossVar, "lightweightScope");
        return aosv.F(aossVar, 0, new defpackage.iwo(this.f, zjlVar, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, null, 1, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
