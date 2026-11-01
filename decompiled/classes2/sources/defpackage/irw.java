package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class irw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public irw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new amzw(defpackage.irw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final iqm iqmVar = (iqm) list.get(0);
        final java.lang.String str = (java.lang.String) list.get(1);
        final defpackage.iwy iwyVar = (defpackage.iwy) list.get(2);
        final izg izgVar = (izg) list.get(3);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        final aoss aossVar = (aoss) list.get(5);
        aooh.f(iqmVar, "enabledFn");
        aooh.f(str, "callId");
        aooh.f(iwyVar, "beeslyLifecycleController");
        aooh.f(izgVar, "beeslyCallScopedState");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(new uyg(new defpackage.iwm(iqmVar, 1), new ajas() { // from class: irv
            public final ajcq a() {
                return aosv.F(aossVar, 0, new sur(zBooleanValue, iqmVar, izgVar, iwyVar, str, (aoln) null, 1), 3);
            }
        }));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
