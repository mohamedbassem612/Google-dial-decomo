package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tnh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public tnh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.tnh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.tna.a;
        tkk tkkVar = (tkk) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        aooh.f(tkkVar, "sharpieEnabledFn");
        aooh.f(aossVar, "lightweightScope");
        amyz amyzVar = this.d;
        aooh.f(amyzVar, "sharpieSnackbarController");
        return aiql.z(aehj.cs(aossVar, new nfp(tkkVar, 15), new jgn(amyzVar, (aoln) null, 16)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
