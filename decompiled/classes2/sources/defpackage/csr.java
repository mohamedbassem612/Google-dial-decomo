package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class csr extends css {
    private final long a;
    private float b = 1.0f;
    private cqh c;

    public csr(long j) {
        this.a = j;
    }

    public final long a() {
        return 9205357640488583168L;
    }

    protected final void b(csj csjVar) {
        den.J(csjVar, this.a, 0L, this.b, this.c, 86);
    }

    protected final void c(float f) {
        this.b = f;
    }

    protected final void d(cqh cqhVar) {
        this.c = cqhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.csr) && this.a == ((defpackage.csr) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "ColorPainter(color=" + cqg.g(this.a) + ')';
    }
}
