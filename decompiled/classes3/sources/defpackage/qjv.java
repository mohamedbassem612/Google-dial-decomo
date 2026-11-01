package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qjv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qjv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qjv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.qjp.a;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(context, "appContext");
        aooh.f(zpoVar, "callState");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(aehj.ct(aossVar, new bqp(zpoVar, context, (aoln) null, 6)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
