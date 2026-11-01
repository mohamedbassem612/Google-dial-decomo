package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdj extends amzm {
    private final amzg b;
    private final amzg c;

    public pdj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pdj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.abwd abwdVar = (defpackage.abwd) list.get(1);
        aooh.f(optional, "selectedInCallScreenKey");
        aooh.f(abwdVar, "photoInfo");
        defpackage.pdm pdmVar = (pez.au(abwdVar) != 2 && aooh.q(optional) == defpackage.pzp.ANSWER_SCREEN) ? defpackage.pdm.c : defpackage.pdm.b;
        return aiql.z(pdmVar);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
