package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdk extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public pdk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.pdk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.abwd abwdVar = (defpackage.abwd) list.get(0);
        defpackage.pdm pdmVar = (defpackage.pdm) list.get(1);
        defpackage.ptx ptxVar = (defpackage.ptx) list.get(2);
        aoss aossVar = (aoss) list.get(3);
        android.content.Context context = (android.content.Context) list.get(4);
        aooh.f(abwdVar, "photoInfo");
        aooh.f(pdmVar, "avatarDisplaySize");
        aooh.f(ptxVar, "callProperties");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(context, "appContext");
        return aosv.F(aossVar, 0, new isf(abwdVar, context, ptxVar, pdmVar, (aoln) null, 3), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
