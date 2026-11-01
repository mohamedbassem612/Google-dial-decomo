package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qla extends amzm {
    private final amzg b;
    private final amzg c;

    public qla(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qla.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.qix qixVar = (defpackage.qix) list.get(0);
        int i = 1;
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        aooh.f(qixVar, "notificationType");
        aooh.f(zpoVar, "callState");
        if (ajsz.cW(new defpackage.qix[]{defpackage.qix.c, defpackage.qix.d}).contains(qixVar)) {
            i = 5;
        } else if (zpoVar == defpackage.zpo.e) {
            i = 2;
        } else if (zpoVar != defpackage.zpo.l) {
            i = 3;
        }
        return aiql.z(java.lang.Integer.valueOf(i));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
