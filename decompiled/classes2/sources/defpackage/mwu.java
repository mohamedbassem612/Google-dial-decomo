package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mwu extends amzm {
    private final amzg b;
    private final amyz c;
    private final amzg d;
    private final amzg e;

    public mwu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.mwu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
        this.d = amzs.b(amzgVar2);
        this.e = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(0);
        rai raiVar = (rai) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        aooh.f(charSequence, "androidAutoContentText");
        amyz amyzVar = this.c;
        aooh.f(amyzVar, "androidAutoModelSeparationEnabled");
        aooh.f(raiVar, "androidAutoNotificationModelResolver");
        aooh.f(aossVar, "lightweightScope");
        return aosv.F(aossVar, 0, new defpackage.nfu((aoin) amyzVar, raiVar, charSequence, (aoln) null, 1), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar.d()});
    }
}
