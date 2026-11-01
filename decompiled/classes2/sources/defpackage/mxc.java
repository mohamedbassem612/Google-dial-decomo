package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public mxc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9) {
        super(amyzVar2, new amzw(defpackage.mxc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(1);
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) list.get(2);
        java.lang.CharSequence charSequence3 = (java.lang.CharSequence) list.get(3);
        java.lang.CharSequence charSequence4 = (java.lang.CharSequence) list.get(4);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(5);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(6)).booleanValue();
        aooh.f(aossVar, "lightweightScope");
        aooh.f(charSequence, "ringingScreeningContentText");
        aooh.f(charSequence2, "autoScreeningContentText");
        aooh.f(charSequence3, "manualScreeningContentText");
        aooh.f(charSequence4, "formattedNumberContentText");
        aooh.f(nmoVar, "lifecycleState");
        return aosv.F(aossVar, 0, new defpackage.mwo(nmoVar, charSequence4, charSequence2, zBooleanValue, charSequence3, this.h, charSequence, this.g, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
