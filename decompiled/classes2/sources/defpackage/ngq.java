package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;

    public ngq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3) {
        super(amyzVar2, new amzw(defpackage.ngq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        defpackage.nms nmsVar = (defpackage.nms) list.get(1);
        defpackage.neu neuVar = (defpackage.neu) list.get(2);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(nmsVar, "sessionUseCase");
        aooh.f(neuVar, "manualScreenConfigProvider");
        amyz amyzVar = this.e;
        aooh.f(amyzVar, "enableAgenticCallScreen");
        return aosv.F(aossVar, 0, new defpackage.nfu((aoin) amyzVar, nmsVar, neuVar, (aoln) null, 0), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
