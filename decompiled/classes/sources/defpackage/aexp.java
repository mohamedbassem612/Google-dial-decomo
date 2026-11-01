package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexp implements java.io.Closeable {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;

    public aexp(int i) {
        this.$cid = i;
        this.a = new java.util.zip.Inflater(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.adiu) obj).close();
        } else {
            ((java.util.zip.Inflater) obj).end();
        }
    }

    public aexp(defpackage.adiu adiuVar, int i) {
        this.$cid = i;
        this.a = adiuVar;
    }
}
