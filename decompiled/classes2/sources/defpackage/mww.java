package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mww extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public mww(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new amzw(defpackage.mww.class), amyzVar);
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
        aoss aossVar = (aoss) list.get(0);
        final defpackage.nhq nhqVar = (defpackage.nhq) list.get(1);
        final defpackage.nmo nmoVar = (defpackage.nmo) list.get(2);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(5)).booleanValue();
        aooh.f(aossVar, "lightweightScope");
        aooh.f(nhqVar, "dobbySession");
        aooh.f(nmoVar, "lifecycleState");
        return aiql.z(aehj.cs(aossVar, new zka() { // from class: mwk
            public final boolean a() {
                return !zBooleanValue3 && !(zBooleanValue && zBooleanValue2) && nhqVar.w == defpackage.nje.e && nmoVar == defpackage.nmo.MANUAL_SCREENING;
            }
        }, new defpackage.kqu(this.c, (aoln) null, 6)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
