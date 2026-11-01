package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hof extends amzm {
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

    public hof(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11) {
        super(amyzVar2, new amzw(defpackage.hof.class), amyzVar);
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
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aoin aoinVar;
        aoin aoinVar2;
        aoin aoinVar3;
        aoin aoinVar4;
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        int iIntValue = ((java.lang.Integer) list.get(4)).intValue();
        pom pomVar = (pom) list.get(5);
        zpm zpmVar = (zpm) list.get(6);
        pzm pzmVar = (pzm) list.get(7);
        defpackage.hqb hqbVar = (defpackage.hqb) list.get(8);
        zzx zzxVar = (zzx) list.get(9);
        java.util.List list2 = (java.util.List) list.get(10);
        aooh.f(str, "callId");
        aooh.f(optional, "outgoingCallRequestId");
        aooh.f(pomVar, "contactGridModel");
        aooh.f(zpmVar, "callScopes");
        aooh.f(pzmVar, "dtmfTonesPlayer");
        aooh.f(hqbVar, "endCallButtonListener");
        aooh.f(zzxVar, "buttonClickedListeners");
        aooh.f(list2, "inCallButtons");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            qug qugVarB = qug.b(((quf) obj2).e);
            if (qugVarB == null) {
                qugVarB = qug.a;
            }
            if (qugVarB == qug.u) {
                arrayList.add(obj2);
            }
        }
        defpackage.hol holVar = new defpackage.hol(str, optional, pomVar, zBooleanValue, zBooleanValue2, iIntValue, (quf) ajsz.bG(arrayList), zpmVar.a().size());
        qtx qtxVar = null;
        holVar.h = new gbp(pzmVar, 3, (short[]) null);
        holVar.i = new defpackage.coo((java.lang.Object) pzmVar, 2, (char[]) null);
        aooh.f(hqbVar, "<set-?>");
        holVar.j = hqbVar;
        aigf aigfVarK = zzxVar.k();
        holVar.k = (aigfVarK == null || (aoinVar4 = (aoin) aigfVarK.get(qug.p)) == null) ? null : (qtx) aoinVar4.a();
        aigf aigfVarK2 = zzxVar.k();
        holVar.l = (aigfVarK2 == null || (aoinVar3 = (aoin) aigfVarK2.get(qug.d)) == null) ? null : (qtx) aoinVar3.a();
        aigf aigfVarK3 = zzxVar.k();
        holVar.m = (aigfVarK3 == null || (aoinVar2 = (aoin) aigfVarK3.get(qug.n)) == null) ? null : (qtx) aoinVar2.a();
        aigf aigfVarK4 = zzxVar.k();
        if (aigfVarK4 != null && (aoinVar = (aoin) aigfVarK4.get(qug.u)) != null) {
            qtxVar = (qtx) aoinVar.a();
        }
        holVar.n = qtxVar;
        return aiql.z(holVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.l;
        amzg amzgVar2 = this.k;
        amzg amzgVar3 = this.j;
        amzg amzgVar4 = this.i;
        amzg amzgVar5 = this.h;
        amzg amzgVar6 = this.g;
        amzg amzgVar7 = this.f;
        amzg amzgVar8 = this.e;
        amzg amzgVar9 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
