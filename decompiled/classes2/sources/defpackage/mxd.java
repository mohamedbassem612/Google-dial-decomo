package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxd extends amzm {
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

    public mxd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10) {
        super(amyzVar2, new amzw(defpackage.mxd.class), amyzVar);
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
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(1);
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) list.get(2);
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(5);
        defpackage.ogj ogjVar = (defpackage.ogj) list.get(6);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(7);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(8)).booleanValue();
        aooh.f(aossVar, "lightweightScope");
        aooh.f(charSequence, "ringingContentTitle");
        aooh.f(charSequence2, "autoScreeningContentTitle");
        aooh.f(optional, "takingMessageContentTitle");
        aooh.f(optional2, "answeringContentTitle");
        aooh.f(optional3, "backgroundDecliningContentTitle");
        aooh.f(ogjVar, "state");
        aooh.f(nmoVar, "lifecycleState");
        return aosv.F(aossVar, 0, new defpackage.mwp(nmoVar, ogjVar, optional2, charSequence2, this.c, charSequence, optional, zBooleanValue, optional3, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.k;
        amzg amzgVar2 = this.j;
        amzg amzgVar3 = this.i;
        amzg amzgVar4 = this.h;
        amzg amzgVar5 = this.g;
        amzg amzgVar6 = this.f;
        amzg amzgVar7 = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
