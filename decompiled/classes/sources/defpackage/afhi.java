package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afhi extends defpackage.afgd {
    private final defpackage.albh a;

    public afhi(defpackage.albh albhVar) {
        this.a = albhVar;
    }

    @Override // defpackage.afgd
    public final defpackage.ajcq a(java.io.IOException iOException, defpackage.afge afgeVar) {
        return !(iOException.getCause() instanceof defpackage.alaz) ? defpackage.aiql.y(iOException) : defpackage.aizu.g(afgeVar.a(defpackage.aiql.z(this.a)), java.io.IOException.class, new agpe(iOException, 1), defpackage.ajbm.INSTANCE);
    }
}
