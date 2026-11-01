package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wpp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public wpp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.wpp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.abtr abtrVar = (defpackage.abtr) list.get(0);
        if (((zpm) list.get(1)).a().size() <= 1 && !((defpackage.qcr) this.d.a()).b()) {
            defpackage.woo wooVar = abtrVar.n().d;
            if (wooVar == null) {
                wooVar = defpackage.woo.a;
            }
            defpackage.won wonVarB = defpackage.won.b(wooVar.c);
            if (wonVarB == null) {
                wonVarB = defpackage.won.UNRECOGNIZED;
            }
            if (wonVarB == defpackage.won.CLOSED) {
                z = true;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
