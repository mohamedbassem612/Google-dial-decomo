package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdv extends amzm {
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
    private final amzg l;
    private final amzg m;

    public jdv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12) {
        super(amyzVar2, new amzw(defpackage.jdv.class), amyzVar);
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
        this.l = amzs.b(amzgVar11);
        this.m = amzs.b(amzgVar12);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        aify aifyVar = (aify) list.get(2);
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        qin qinVar = (qin) list.get(4);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) list.get(5);
        qiy qiyVar = (qiy) list.get(6);
        qiv qivVar = (qiv) list.get(7);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(8)).booleanValue();
        aify aifyVar2 = (aify) list.get(9);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(10)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(11);
        aooh.f(context, "appContext");
        aooh.f(str, "callId");
        aooh.f(aifyVar, "personReferences");
        aooh.f(optional, "largeIcon");
        aooh.f(qinVar, "content");
        aooh.f(qiyVar, "notificationWhen");
        aooh.f(qivVar, "notificationProgress");
        aooh.f(aifyVar2, "actionButtons");
        aooh.f(optional2, "androidAutoNotificationModel");
        qir qirVar = (qir) aooh.q(optional);
        int iC = urg.c(context, 2130969018);
        boolean z = !zBooleanValue2;
        return aiql.z(new qjd(qit.f, str, aifyVar2, aokc.a, qinVar, qirVar, 2131232042, qiyVar, "phone_incoming_call", (pdv) null, iC, false, 4, z ? 1 : 0, aifyVar, "call", pendingIntent, (android.app.PendingIntent) null, qivVar, zBooleanValue, (qil) null, (qij) null, false, false, z, false, false, (qie) aooh.q(optional2), 103940608));
    }

    protected final ajcq c() {
        amzg amzgVar = this.m;
        amzg amzgVar2 = this.l;
        amzg amzgVar3 = this.k;
        amzg amzgVar4 = this.j;
        amzg amzgVar5 = this.i;
        amzg amzgVar6 = this.h;
        amzg amzgVar7 = this.g;
        amzg amzgVar8 = this.f;
        amzg amzgVar9 = this.e;
        amzg amzgVar10 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
