package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxy extends amzm {
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

    public mxy(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12) {
        super(amyzVar2, new amzw(defpackage.mxy.class), amyzVar);
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
        mnk mnkVar = (mnk) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final defpackage.nhq nhqVar = (defpackage.nhq) list.get(2);
        final defpackage.nmo nmoVar = (defpackage.nmo) list.get(3);
        final aoss aossVar = (aoss) list.get(4);
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(5)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(6)).booleanValue();
        final boolean zBooleanValue4 = ((java.lang.Boolean) list.get(7)).booleanValue();
        final boolean zBooleanValue5 = ((java.lang.Boolean) list.get(8)).booleanValue();
        final boolean zBooleanValue6 = ((java.lang.Boolean) list.get(9)).booleanValue();
        aooh.f(mnkVar, "enabledFn");
        aooh.f(nhqVar, "dobbySession");
        aooh.f(nmoVar, "lifecycleState");
        aooh.f(aossVar, "lightweightScope");
        defpackage.iwm iwmVar = new defpackage.iwm(mnkVar, 17);
        final amzg amzgVar = this.e;
        final amzg amzgVar2 = this.d;
        return aiql.z(new uyg(iwmVar, new ajas() { // from class: mwm
            public final ajcq a() {
                boolean z = zBooleanValue2 && nhqVar.w == defpackage.nje.e;
                amzg amzgVar3 = amzgVar2;
                if (((!zBooleanValue3 || !z) && (!zBooleanValue5 || !zBooleanValue4)) || nmoVar != defpackage.nmo.MANUAL_SCREENING) {
                    return !zBooleanValue ? aiql.z(j$.util.Optional.empty()) : amzgVar3.d();
                }
                return aosv.F(aossVar, 0, new defpackage.hyg(zBooleanValue6, amzgVar3, amzgVar, (aoln) null, 4), 3);
            }
        }));
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
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
