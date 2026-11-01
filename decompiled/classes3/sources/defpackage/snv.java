package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public snv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.snv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        okj okjVar = (okj) list.get(1);
        zjs zjsVar = (zjs) list.get(2);
        aoss aossVar = (aoss) list.get(3);
        defpackage.uyg uygVar = (defpackage.uyg) list.get(4);
        aooh.f(optional, "phoneAccountHandle");
        aooh.f(okjVar, "dialerSubscriptionManager");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(uygVar, "networkIdentityFactory");
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional);
        return phoneAccountHandle == null ? aiql.z((java.lang.Object) null) : aosv.F(aossVar, 0, new blv(okjVar, phoneAccountHandle, zjsVar, uygVar, (aoln) null, 14), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
