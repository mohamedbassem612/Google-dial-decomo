package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mwv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public mwv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.mwv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(1);
        android.content.Context context = (android.content.Context) list.get(2);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(3);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(charSequence, "contentText");
        aooh.f(context, "appContext");
        aooh.f(nmoVar, "lifecycleState");
        return aosv.F(aossVar, 0, new hcn(nmoVar, context, charSequence, (aoln) null, 5), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
