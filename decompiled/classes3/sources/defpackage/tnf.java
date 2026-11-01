package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tnf extends amzm {
    private final amzg b;
    private final amzg c;

    public tnf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.tnf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.tna.a;
        aoss aossVar = (aoss) list.get(0);
        aogc aogcVar = (aogc) list.get(1);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aogcVar, "sharpieSettings");
        return aosv.F(aossVar, 0, new defpackage.tkx(aogcVar, (aoln) null, 10), 3);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
