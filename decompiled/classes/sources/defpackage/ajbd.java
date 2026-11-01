package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajbd extends defpackage.ahxu {
    static final defpackage.ahyb a = new defpackage.ahyb();
    static final java.util.Set b = defpackage.ahvr.ar();
    public static final /* synthetic */ int d = 0;
    final defpackage.ajbe c;

    public ajbd(defpackage.ajbg ajbgVar) {
        super(ajbgVar, a);
        this.c = ajbgVar.c;
    }

    @Override // defpackage.ahxv
    public final void finalizeReferent() {
        b.remove(this);
        defpackage.ajbe ajbeVar = this.c;
        if (((defpackage.ajbf) ajbeVar.a.get()).equals(defpackage.ajbf.a)) {
            defpackage.ajbg.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture$State", "closeIfLeaked", "Uh oh! An open ClosingFuture has leaked and will close: {0}", ajbeVar);
            ajbeVar.e();
        }
    }
}
