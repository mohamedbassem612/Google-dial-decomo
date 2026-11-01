package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lru extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;

    public lru(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10) {
        super(amyzVar2, new amzw(defpackage.lru.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        aify aifyVar = (aify) list.get(2);
        qir qirVar = (qir) list.get(3);
        qin qinVar = (qin) list.get(4);
        qiy qiyVar = (qiy) list.get(5);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) list.get(6);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(7)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(8)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(9);
        aooh.f(context, "appContext");
        aooh.f(str, "callIdString");
        aooh.f(aifyVar, "personReferences");
        aooh.f(qirVar, "largeIcon");
        aooh.f(qinVar, "content");
        aooh.f(qiyVar, "notificationWhen");
        aooh.f(optional, "androidAutoModel");
        qit qitVar = qit.e;
        aify aifyVar2 = aike.a;
        aooh.e(aifyVar2, "of(...)");
        aooh.e(aifyVar2, "of(...)");
        return aiql.z(new qjd(qitVar, str, aifyVar2, aifyVar2, qinVar, qirVar, 2131232043, qiyVar, "phone_ongoing_call", (pdv) null, urg.c(context, 2130968954), true, 4, true != zBooleanValue2 ? 4 : 0, aifyVar, (java.lang.String) null, pendingIntent, (android.app.PendingIntent) null, (qiv) null, zBooleanValue, new qiz(qid.u, qim.c), (qij) null, false, false, !zBooleanValue2, false, false, (qie) aooh.q(optional), 103186944));
    }

    protected final ajcq c() {
        amzg amzgVar = this.k;
        amzg amzgVar2 = this.j;
        amzg amzgVar3 = this.i;
        amzg amzgVar4 = this.h;
        amzg amzgVar5 = this.g;
        amzg amzgVar6 = this.f;
        amzg amzgVar7 = this.e;
        amzg amzgVar8 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
