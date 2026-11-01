package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngh extends amzm {
    private final amzg b;

    public ngh(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.ngh.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.nbw nbwVar;
        defpackage.nms nmsVar = (defpackage.nms) obj;
        aooh.f(nmsVar, "sessionUseCase");
        int iOrdinal = nmsVar.ordinal();
        if (iOrdinal == 1) {
            nbwVar = defpackage.nbw.TYPE_MANUAL_SCREENING;
        } else if (iOrdinal != 2) {
            nbwVar = iOrdinal != 4 ? defpackage.nbw.TYPE_UNKNOWN : defpackage.nbw.TYPE_BEESLY;
        } else {
            nbwVar = defpackage.nbw.TYPE_AUTO_SCREENING;
        }
        return aiql.z(nbwVar);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
