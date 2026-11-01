package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qxt extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public qxt(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.qxt.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        amzs.b(amzgVar3);
        this.d = amzs.b(amzgVar4);
        this.e = amzs.b(amzgVar5);
        this.f = amzs.b(amzgVar6);
        this.g = amzs.b(amzgVar7);
        this.h = amzs.b(amzgVar8);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        java.lang.String str = (java.lang.String) list.get(3);
        defpackage.rfa rfaVar = (defpackage.rfa) list.get(4);
        aooh.f(context, "appContext");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(str, "callIdString");
        aooh.f(rfaVar, "voiceFeaturePromoController");
        return aosv.F(aossVar, 0, new defpackage.qzc(this.c, rfaVar, this.g, context, str, (aoln) null, 1), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
