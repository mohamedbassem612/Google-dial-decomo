package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qme extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public qme(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.qme.class), amyzVar);
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
        defpackage.qix qixVar = (defpackage.qix) list.get(0);
        aihd aihdVar = (aihd) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        defpackage.qbe qbeVar = (defpackage.qbe) list.get(3);
        mba mbaVar = (mba) list.get(4);
        aooh.f(qixVar, "notificationType");
        aooh.f(aihdVar, "statusBarNotificationInhibitors");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(mbaVar, "inCallCuiSemanticLogger");
        return aosv.F(aossVar, 0, new defpackage.qkx(qixVar, mbaVar, aihdVar, qbeVar, this.d, this.e, (aoln) null, 0), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
