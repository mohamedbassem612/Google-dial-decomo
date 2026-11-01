package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amyz h;
    private final amyz i;

    public ngm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amyz amyzVar3, amyz amyzVar4) {
        super(amyzVar2, new amzw(defpackage.ngm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amyzVar3;
        this.i = amyzVar4;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        abwd abwdVar = (abwd) list.get(1);
        defpackage.nmz nmzVar = (defpackage.nmz) list.get(2);
        android.content.Context context = (android.content.Context) list.get(3);
        defpackage.ogj ogjVar = (defpackage.ogj) list.get(4);
        aoss aossVar = (aoss) list.get(5);
        aooh.f(str, "callId");
        aooh.f(abwdVar, "photoInfo");
        aooh.f(nmzVar, "dobbySummaryText");
        aooh.f(context, "appContext");
        aooh.f(ogjVar, "state");
        aooh.f(aossVar, "lightweightScope");
        amyz amyzVar = this.h;
        aooh.f(amyzVar, "enableAgenticCallScreen");
        amyz amyzVar2 = this.i;
        aooh.f(amyzVar2, "gacsUseGeminiBranding");
        return aosv.F(aossVar, 0, new defpackage.nft(str, abwdVar, nmzVar, amyzVar, ogjVar, context, amyzVar2, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
