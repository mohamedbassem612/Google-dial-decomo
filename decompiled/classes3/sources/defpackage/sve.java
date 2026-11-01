package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sve extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amyz h;
    private final amzg i;

    public sve(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amyz amyzVar3, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.sve.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amyzVar3;
        this.i = amzs.b(amzgVar7);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        java.util.Set set = (java.util.Set) list.get(1);
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(2);
        java.util.List list2 = (java.util.List) list.get(3);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        defpackage.alin alinVar = (defpackage.alin) list.get(5);
        rlv rlvVar = (rlv) list.get(6);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(set, "dataIds");
        aooh.f(list2, "candidates");
        aooh.f(rlvVar, "loggingBindings");
        return aosv.F(aossVar, 0, new defpackage.sux(phoneAccountHandle, rlvVar, set, (aoin) this.h, list2, zBooleanValue, alinVar, (aoln) null, 0), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
