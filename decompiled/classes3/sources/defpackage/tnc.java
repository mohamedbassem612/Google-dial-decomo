package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tnc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public tnc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.tnc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.tna.a;
        aoss aossVar = (aoss) list.get(0);
        tkk tkkVar = (tkk) list.get(1);
        defpackage.zlr zlrVar = (defpackage.zlr) list.get(2);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(tkkVar, "sharpieEnabledFn");
        aooh.f(zlrVar, "sharpieState");
        return aiql.z(aehj.cs(aossVar, new nfp(tkkVar, 18), new jgn(zlrVar, (aoln) null, 15)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
