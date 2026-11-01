package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svf extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amyz h;
    private final amzg i;

    public svf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amyz amyzVar3, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.svf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amyzVar3;
        this.i = amzs.b(amzgVar7);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        java.util.Set set = (java.util.Set) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        rlv rlvVar = (rlv) list.get(3);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(set, "preferredSims");
        amyz amyzVar = this.h;
        aooh.f(amyzVar, "canSelectSim");
        aooh.f(rlvVar, "loggingBindings");
        return aosv.F(aossVar, 0, new defpackage.suy(set, this.d, this.e, this.f, amyzVar, zBooleanValue, rlvVar, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.g;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
