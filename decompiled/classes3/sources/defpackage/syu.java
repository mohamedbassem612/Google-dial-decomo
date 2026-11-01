package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syu extends amzm {
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
    private final amzg n;
    private final amzg o;
    private final amzg p;

    public syu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13, amzg amzgVar14, amzg amzgVar15) {
        super(amyzVar2, new defpackage.amzw(defpackage.syu.class), amyzVar);
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
        this.n = amzs.b(amzgVar13);
        this.o = amzs.b(amzgVar14);
        this.p = amzs.b(amzgVar15);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        defpackage.qiy qiyVar = (defpackage.qiy) list.get(2);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(4);
        j$.util.Optional optional4 = (j$.util.Optional) list.get(5);
        int iIntValue = ((java.lang.Integer) list.get(6)).intValue();
        java.util.List list2 = (aify) list.get(7);
        defpackage.qin qinVar = (defpackage.qin) list.get(8);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(9)).booleanValue();
        android.content.Context context = (android.content.Context) list.get(10);
        java.util.List list3 = (aify) list.get(11);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(12)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(13)).booleanValue();
        defpackage.qie qieVar = (defpackage.qie) list.get(14);
        defpackage.qii qiiVar = new defpackage.qii();
        qiiVar.y(defpackage.qit.REVELIO);
        qiiVar.g(str);
        qiiVar.b(list2);
        aify aifyVar = aike.a;
        qiiVar.c(aifyVar);
        qiiVar.i(qinVar);
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        aooh.f(optionalEmpty, "largeIcon");
        qiiVar.o((defpackage.qir) aooh.q(optionalEmpty));
        qiiVar.x(2131232042);
        qiiVar.t(qiyVar);
        aooh.f(optional4, "notificationChannelId");
        qiiVar.q((java.lang.String) aooh.q(optional4));
        qiiVar.f(urg.c(context, 2130969018));
        qiiVar.l(false);
        qiiVar.r(iIntValue);
        qiiVar.e(true != zBooleanValue3 ? 3 : 0);
        j$.util.Optional optionalOf = j$.util.Optional.of("call");
        aooh.f(optionalOf, "notificationCategory");
        qiiVar.p((java.lang.String) aooh.q(optionalOf));
        aooh.f(optional3, "contentIntent");
        qiiVar.j((android.app.PendingIntent) aooh.q(optional3));
        aooh.f(optional2, "fullScreenIntent");
        qiiVar.k((android.app.PendingIntent) aooh.q(optional2));
        aooh.f(optional, "progress");
        qiiVar.s((defpackage.qiv) aooh.q(optional));
        qiiVar.w(zBooleanValue);
        qiiVar.n(false);
        qiiVar.m(false);
        qiiVar.v(false);
        qiiVar.u(aifyVar);
        qiiVar.d(true != zBooleanValue3 ? null : qieVar);
        if (zBooleanValue2) {
            qiiVar.h(new defpackage.qja(defpackage.qid.REVELIO_ANSWER, defpackage.qid.REVELIO_HANG_UP, true, defpackage.qim.REVELIO_PRIORITY));
            qiiVar.u(list3);
        } else {
            qiiVar.h(defpackage.qjf.a);
        }
        return aiql.z(qiiVar.a());
    }

    protected final ajcq c() {
        amzg amzgVar = this.p;
        amzg amzgVar2 = this.o;
        amzg amzgVar3 = this.n;
        amzg amzgVar4 = this.m;
        amzg amzgVar5 = this.l;
        amzg amzgVar6 = this.k;
        amzg amzgVar7 = this.j;
        amzg amzgVar8 = this.i;
        amzg amzgVar9 = this.h;
        amzg amzgVar10 = this.g;
        amzg amzgVar11 = this.f;
        amzg amzgVar12 = this.e;
        amzg amzgVar13 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar13.d(), amzgVar12.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
