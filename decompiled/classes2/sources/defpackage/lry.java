package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lry extends amzm {
    private final amzg b;
    private final amzg c;

    public lry(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.lry.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        zjm zjmVar = (zjm) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        aooh.f(zjmVar, "androidAutoStatusLookupBlockingFeatureProvider");
        aooh.f(aossVar, "lightweightScope");
        j$.util.Optional optionalG = zjmVar.g();
        aooh.e(optionalG, "getFeature(...)");
        hrb hrbVar = (hrb) aooh.q(optionalG);
        return hrbVar != null ? aosv.F(aossVar, 0, new defpackage.ksy(hrbVar, (aoln) null, 15), 3) : aiql.z(java.lang.Boolean.TRUE);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
