package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqd extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public jqd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new amzw(defpackage.jqd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.jpk.a;
        aoss aossVar = (aoss) list.get(0);
        rms rmsVar = (rms) list.get(1);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rmsVar, "contactLookupResultType");
        amyz amyzVar = this.d;
        aooh.f(amyzVar, "scoobyCallLogLoggingProvider");
        return aosv.F(aossVar, 0, new defpackage.jpj(rmsVar, (aoin) amyzVar, (aoln) null, 0), 3);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
