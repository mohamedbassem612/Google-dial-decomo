package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbn extends aazc implements java.io.Closeable {
    public final akzc a;
    public final long b;
    public final defpackage.abca c;

    public abbn(defpackage.abca abcaVar, akzc akzcVar, long j) {
        aooh.f(abcaVar, "tartarusRunner");
        aooh.f(akzcVar, "protectionToken");
        this.c = abcaVar;
        this.a = akzcVar;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abbn) {
            defpackage.abbn abbnVar = (defpackage.abbn) obj;
            if (aooh.n(this.c, abbnVar.c) && aooh.n(this.a, abbnVar.a) && this.b == abbnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + anty.M(this.b);
    }
}
