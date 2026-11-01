package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmn extends amzm {
    private final amzg b;
    private final amzg c;

    public wmn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.wmn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        whh whhVar = (whh) list.get(0);
        defpackage.abtr abtrVar = (defpackage.abtr) list.get(1);
        if (whhVar.a()) {
            defpackage.woo wooVar = abtrVar.n().d;
            if (wooVar == null) {
                wooVar = defpackage.woo.a;
            }
            defpackage.won wonVarB = defpackage.won.b(wooVar.c);
            if (wonVarB == null) {
                wonVarB = defpackage.won.UNRECOGNIZED;
            }
            if (wonVarB == defpackage.won.UNKNOWN) {
                z = true;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
