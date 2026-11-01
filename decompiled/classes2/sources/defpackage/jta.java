package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jta extends amzm {
    private final amzg b;
    private final amyz c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public jta(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new amzw(defpackage.jta.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
        this.d = amzs.b(amzgVar2);
        this.e = amzs.b(amzgVar3);
        this.f = amzs.b(amzgVar4);
        this.g = amzs.b(amzgVar5);
        this.h = amzs.b(amzgVar6);
        this.i = amzs.b(amzgVar7);
        this.j = amzs.b(amzgVar8);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        jsk jskVar = (jsk) list.get(0);
        rmt rmtVar = (rmt) list.get(1);
        sql sqlVar = (sql) list.get(2);
        aazc aazcVar = (aazc) list.get(3);
        qbe qbeVar = (qbe) list.get(4);
        defpackage.jth jthVar = (defpackage.jth) list.get(5);
        zzx zzxVar = (zzx) list.get(6);
        aoss aossVar = (aoss) list.get(7);
        aooh.f(jskVar, "callerIdFeedbackDatabase");
        aooh.f(rmtVar, "contactSourceType");
        aooh.f(sqlVar, "phoneLookupInfoConsolidator");
        aooh.f(aazcVar, "clock");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(jthVar, "inCallCallerIdFeedbackController");
        aooh.f(zzxVar, "directBoot");
        aooh.f(aossVar, "lightweightScope");
        return aosv.F(aossVar, 0, new defpackage.jsw(zzxVar, jthVar, jskVar, aazcVar, this.c, rmtVar, sqlVar, qbeVar, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
