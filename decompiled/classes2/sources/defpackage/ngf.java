package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngf extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ngf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.ngf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        mnk mnkVar = (mnk) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(2);
        aooh.f(mnkVar, "enabledFn");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(nmoVar, "lifecycleState");
        return aiql.z(aehj.cs(aossVar, new defpackage.nfp(mnkVar, 1), new defpackage.jgn(nmoVar, (aoln) null, 8, (byte[]) null)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
