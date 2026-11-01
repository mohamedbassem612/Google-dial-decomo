package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qlq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qix qixVar;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        tkl tklVar = (tkl) list.get(2);
        zpm zpmVar = (zpm) list.get(3);
        aooh.f(zpoVar, "callState");
        aooh.f(tklVar, "inCallUiVisibilityProvider");
        aooh.f(zpmVar, "callScopes");
        if (zpoVar == defpackage.zpo.g) {
            qixVar = defpackage.qix.a;
        } else if (zpoVar == defpackage.zpo.d || zBooleanValue) {
            j$.util.Optional optionalE = tklVar.e();
            aooh.e(optionalE, "getIsInCallUiShowing(...)");
            qixVar = ((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue() ? defpackage.qix.d : defpackage.qix.c;
        } else {
            qixVar = defpackage.qix.b;
        }
        return aiql.z(qixVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
