package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbn extends amzm {
    private final amzg b;

    public xbn(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.xbn.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        aooh.f(optional, "atlasBusiness");
        return aiql.z(java.lang.Boolean.valueOf(optional.isPresent()));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
