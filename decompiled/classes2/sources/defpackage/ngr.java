package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngr extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public ngr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new amzw(defpackage.ngr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        mnk mnkVar = (mnk) list.get(2);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(3);
        pgi pgiVar = (pgi) list.get(4);
        defpackage.mqt mqtVar = (defpackage.mqt) list.get(5);
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mnkVar, "enabledFn");
        aooh.f(nmoVar, "lifecycleState");
        aooh.f(pgiVar, "chipConfigProvider");
        aooh.f(mqtVar, "loggingCoordinator");
        return aiql.z(aehj.cs(aossVar, new defpackage.iwm(mnkVar, 18), new defpackage.nfv(nmoVar, context, pgiVar, mqtVar, (aoln) null, 0)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
