package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nfx extends amzm {
    private final amzg b;

    public nfx(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.nfx.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.nmo nmoVar = (defpackage.nmo) obj;
        aooh.f(nmoVar, "lifecycleState");
        return aiql.z(java.lang.Boolean.valueOf(nmoVar == defpackage.nmo.ANSWERED));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
