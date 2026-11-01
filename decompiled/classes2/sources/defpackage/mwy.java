package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mwy extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public mwy(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new amzw(defpackage.mwy.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        rsr rsrVar = (rsr) list.get(4);
        zna znaVar = (zna) list.get(5);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(context, "appContext");
        aooh.f(optional, "displayNumber");
        aooh.f(optional2, "geoLocation");
        aooh.f(rsrVar, "phoneNumberDisplayUtil");
        aooh.f(znaVar, "callPresentation");
        return aosv.F(aossVar, 0, new acjc(rsrVar, znaVar, context, optional, optional2, (aoln) null, 1), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
