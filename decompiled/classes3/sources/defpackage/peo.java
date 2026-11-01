package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class peo extends amzm {
    private final amzg b;
    private final amzg c;

    public peo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.peo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aihd aihdVar = (aihd) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        aooh.f(aihdVar, "availableCallBackgroundKeys");
        aooh.f(mguVar, "recorder");
        java.lang.Object objG = mguVar.c(new ljc(aihdVar, 3)).a(mfy.eP).g(new defpackage.pei(new aoom() { // from class: pel
            public final java.lang.Object b(java.lang.Object obj2) {
                return ((defpackage.pdw) obj2).name();
            }
        }, 0));
        aooh.e(objG, "asStringUserdataIfPresent(...)");
        return aiql.z((j$.util.Optional) objG);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
