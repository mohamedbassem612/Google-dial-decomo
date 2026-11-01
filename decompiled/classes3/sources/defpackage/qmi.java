package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmi extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public qmi(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.qmi.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        int i;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(6)).booleanValue();
        boolean zBooleanValue7 = ((java.lang.Boolean) list.get(7)).booleanValue();
        aooh.f(zpoVar, "callState");
        aooh.f(zpoVar, "callState");
        if (zpoVar == defpackage.zpo.e) {
            i = 2131232040;
        } else if (zBooleanValue || zBooleanValue2) {
            i = 2131232062;
        } else if (zBooleanValue4 && zBooleanValue7) {
            i = 2131232068;
        } else if (zBooleanValue3 && zBooleanValue6) {
            i = 2131231085;
        } else if (zBooleanValue5) {
            i = 2131232036;
        } else {
            i = zpoVar == defpackage.zpo.f ? 2131231090 : 2131232042;
        }
        return aiql.z(java.lang.Integer.valueOf(i));
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.f;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
