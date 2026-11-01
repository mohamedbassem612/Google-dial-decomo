package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tos extends amzm {
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
    private final amyz l;
    private final amzg m;
    private final amzg n;
    private final amzg o;
    private final amzg p;
    private final amzg q;

    public tos(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amyz amyzVar3, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13, amzg amzgVar14, amzg amzgVar15) {
        super(amyzVar2, new defpackage.amzw(defpackage.tos.class), amyzVar);
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
        this.l = amyzVar3;
        this.m = amzs.b(amzgVar11);
        this.n = amzs.b(amzgVar12);
        this.o = amzs.b(amzgVar13);
        this.p = amzs.b(amzgVar14);
        this.q = amzs.b(amzgVar15);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        aify aifyVar = (aify) list.get(2);
        aify aifyVar2 = (aify) list.get(3);
        aify aifyVar3 = (aify) list.get(4);
        defpackage.qir qirVar = (defpackage.qir) list.get(5);
        defpackage.qin qinVar = (defpackage.qin) list.get(6);
        defpackage.qiy qiyVar = (defpackage.qiy) list.get(7);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) list.get(8);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(9)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(10)).booleanValue();
        aoss aossVar = (aoss) list.get(11);
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(12)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(13);
        aooh.f(context, "appContext");
        aooh.f(str, "callIdString");
        aooh.f(aifyVar, "personReferences");
        aooh.f(aifyVar2, "actionButtons");
        aooh.f(aifyVar3, "androidAutoActionButtons");
        aooh.f(qirVar, "largeIcon");
        aooh.f(qinVar, "content");
        aooh.f(qiyVar, "notificationWhen");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(optional, "androidAutoNotificationModel");
        return aosv.F(aossVar, 0, new defpackage.tol(this.l, zBooleanValue2, this.n, zBooleanValue3, aifyVar3, context, optional, str, aifyVar2, qinVar, qirVar, qiyVar, aifyVar, pendingIntent, zBooleanValue, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.q;
        amzg amzgVar2 = this.p;
        amzg amzgVar3 = this.o;
        amzg amzgVar4 = this.m;
        amzg amzgVar5 = this.k;
        amzg amzgVar6 = this.j;
        amzg amzgVar7 = this.i;
        amzg amzgVar8 = this.h;
        amzg amzgVar9 = this.g;
        amzg amzgVar10 = this.f;
        amzg amzgVar11 = this.e;
        amzg amzgVar12 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar12.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
