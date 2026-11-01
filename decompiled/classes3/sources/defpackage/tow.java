package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tow extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public tow(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.tow.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        ops opsVar = (ops) list.get(2);
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(opsVar, "glidePhotoManager");
        defpackage.vqf vqfVarF = defpackage.abxl.F(defpackage.abwd.a.m());
        vqfVarF.af(true);
        return opsVar.e(vqfVarF.ad(), oph.a(), context.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_width), context.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
