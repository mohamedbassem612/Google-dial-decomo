package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class fnh {
    protected final defpackage.fmk d;

    protected fnh(defpackage.fmk fmkVar) {
        this.d = fmkVar;
    }

    protected abstract boolean a(defpackage.etx etxVar);

    protected abstract boolean b(defpackage.etx etxVar, long j);

    public final boolean c(defpackage.etx etxVar, long j) {
        return a(etxVar) && b(etxVar, j);
    }
}
