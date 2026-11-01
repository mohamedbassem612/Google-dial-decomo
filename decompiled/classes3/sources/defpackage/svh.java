package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amyz i;

    public svh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.svh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        java.lang.String str = (java.lang.String) list.get(2);
        defpackage.alin alinVar = (defpackage.alin) list.get(3);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(5);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(context, "appContext");
        aooh.f(str, "phoneNumber");
        amyz amyzVar = this.i;
        aooh.f(amyzVar, "suggestionProvider");
        return aosv.F(aossVar, 0, new defpackage.sux(phoneAccountHandle, this.h, alinVar, (aoin) amyzVar, context, str, zBooleanValue, (aoln) null, 2), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
