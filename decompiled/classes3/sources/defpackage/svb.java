package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svb extends amzm {
    private final amzg b;
    private final amyz c;

    public svb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.svb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aoss aossVar = (aoss) obj;
        aooh.f(aossVar, "lightweightScope");
        amyz amyzVar = this.c;
        aooh.f(amyzVar, "dialerTelecom");
        return aosv.F(aossVar, 0, new defpackage.sge((aoin) amyzVar, (aoln) null, 17), 3);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
