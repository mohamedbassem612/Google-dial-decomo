package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbd extends amzm {
    private final amzg b;

    public rbd(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbd.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qup qupVar;
        int iOrdinal;
        defpackage.rca rcaVar;
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (!optional.isPresent() || (iOrdinal = (qupVar = (defpackage.qup) optional.orElseThrow()).ordinal()) == 0) {
            rcaVar = defpackage.rca.MODE_FULL_SIZE;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new java.lang.AssertionError("invalid mode: ".concat(java.lang.String.valueOf(qupVar.name())));
            }
            rcaVar = defpackage.rca.MODE_COMPACT;
        }
        return aiql.z(rcaVar);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
