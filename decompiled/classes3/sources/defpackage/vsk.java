package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vsk extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public vsk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.vsk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(1);
        defpackage.vrr vrrVar = (defpackage.vrr) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        ahbv ahbvVar = (ahbv) list.get(4);
        return ahvr.H(ahvr.I(((zjm) ahbvVar.c).l(phoneAccountHandle), new defpackage.vge(phoneAccountHandle, 20), (java.util.concurrent.Executor) ahbvVar.b), new defpackage.qfm(vrrVar, zBooleanValue, 4), (ajct) list.get(5));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
