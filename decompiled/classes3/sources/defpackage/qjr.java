package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qjr extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amyz g;

    public qjr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qjr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.qjp.a;
        android.content.Context context = (android.content.Context) list.get(0);
        zms zmsVar = (zms) list.get(1);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(2);
        aihd aihdVar = (aihd) list.get(3);
        aoss aossVar = (aoss) list.get(4);
        aooh.f(context, "appContext");
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(zpoVar, "callState");
        aooh.f(aihdVar, "notificationMuteButtonInhibitors");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(aehj.ct(aossVar, new defpackage.qjn(this.g, aihdVar, zpoVar, zmsVar, context, null)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
