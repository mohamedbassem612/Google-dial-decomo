package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tng extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public tng(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.tng.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.tna.a;
        tkk tkkVar = (tkk) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        aooh.f(tkkVar, "sharpieEnabledFn");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(aehj.cs(aossVar, new nfp(tkkVar, 20), new defpackage.sbm(this.d, (aoln) null, 4, (byte[]) null)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
