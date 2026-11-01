package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class odh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public odh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new amzw(defpackage.odh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.ocf ocfVar = (defpackage.ocf) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        aoss aossVar = (aoss) list.get(4);
        aooh.f(context, "appContext");
        aooh.f(ocfVar, "satelliteSosEnabledFn");
        aooh.f(optional, "disconnectCauseOptional");
        aooh.f(optional2, "rawNumberOptional");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(aehj.cs(aossVar, new defpackage.nfp(ocfVar, 6), new defpackage.odc(optional, optional2, this.g, context, null)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
