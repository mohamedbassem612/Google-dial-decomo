package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class seb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public seb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.seb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
        this.f = amzs.b(amzgVar4);
        this.g = amzs.b(amzgVar5);
        this.h = amzs.b(amzgVar6);
        this.i = amzs.b(amzgVar7);
        this.j = amzs.b(amzgVar8);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final hrc hrcVar = (hrc) list.get(0);
        final aoss aossVar = (aoss) list.get(1);
        final defpackage.sdw sdwVar = (defpackage.sdw) list.get(2);
        final defpackage.spn spnVar = (defpackage.spn) list.get(3);
        mgu mguVar = (mgu) list.get(4);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(5)).booleanValue();
        final java.lang.String str = (java.lang.String) list.get(6);
        final gpd gpdVar = (gpd) list.get(7);
        aooh.f(hrcVar, "callingCardEnabledFn");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(sdwVar, "callingCardCallScopedDataService");
        aooh.f(spnVar, "phoneLookupInfo");
        aooh.f(mguVar, "recorder");
        aooh.f(str, "uniqueCallId");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        final amyz amyzVar = this.e;
        java.lang.Object objF = mguVar.g(new java.util.function.Supplier() { // from class: sdy
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return aosv.F(aossVar, 0, new defpackage.sux(hrcVar, amyzVar, zBooleanValue, gpdVar, str, spnVar, sdwVar, (aoln) null, 1), 3);
            }
        }).b(mfy.eR).f();
        aooh.e(objF, "whenDone(...)");
        return (ajcq) objF;
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
