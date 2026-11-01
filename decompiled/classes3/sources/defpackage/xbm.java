package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amyz g;
    private final amzg h;
    private final amzg i;

    public xbm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amyz amyzVar3, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.xbm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amyzVar3;
        this.h = amzs.b(amzgVar6);
        this.i = amzs.b(amzgVar7);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        long jLongValue = ((java.lang.Long) list.get(0)).longValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        wyc wycVar = (wyc) list.get(2);
        defpackage.wyn wynVar = (defpackage.wyn) list.get(3);
        defpackage.zmy zmyVar = (defpackage.zmy) list.get(4);
        aoss aossVar = (aoss) list.get(5);
        aooh.f(optional, "optionalRawNumber");
        aooh.f(wycVar, "atlasEnabledFn");
        aooh.f(wynVar, "atlasBusinessFinder");
        aooh.f(zmyVar, "direction");
        amyz amyzVar = this.g;
        aooh.f(amyzVar, "disableHedwig");
        aooh.f(aossVar, "lightweightScope");
        if (!wycVar.a()) {
            return aiql.z(j$.util.Optional.empty());
        }
        java.lang.String str = (java.lang.String) aooh.q(optional);
        if (str == null) {
            return aiql.z(j$.util.Optional.empty());
        }
        if (!((java.lang.Boolean) amyzVar.a()).booleanValue()) {
            return aosv.F(aossVar, 0, new defpackage.ujn(this.h, wynVar, str, zmyVar, jLongValue, (aoln) null, 4), 3);
        }
        defpackage.wxn wxnVar = new defpackage.wxn();
        wxnVar.a = str;
        wxnVar.c(zmyVar == defpackage.zmy.a);
        wxnVar.b(jLongValue);
        return wynVar.a(wxnVar.a());
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
