package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apmb extends defpackage.aplw {
    private boolean c;

    @Override // defpackage.aplw
    public final long b(apoy apoyVar, long j) throws java.io.IOException {
        if (this.a) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (this.c) {
            return -1L;
        }
        long jB = super.b(apoyVar, 8192L);
        if (jB != -1) {
            return jB;
        }
        this.c = true;
        c(apiu.a);
        return -1L;
    }

    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c(defpackage.apmc.a);
        }
        d();
    }
}
