package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public jpm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.jpm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.jpk.a;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(context, "appContext");
        aooh.f(optional, "number");
        aooh.f(aossVar, "backgroundScope");
        return aosv.F(aossVar, 0, new defpackage.fyn(context, optional, (aoln) null, 19), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
