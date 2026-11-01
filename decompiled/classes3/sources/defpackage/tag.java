package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tag extends amzm {
    private final amzg b;

    public tag(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.tag.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        return !optional.isPresent() ? aiql.z(j$.util.Optional.empty()) : ((defpackage.rdp) optional.orElseThrow()).b(3);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
