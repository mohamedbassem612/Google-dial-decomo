package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nl extends dzl {
    private final java.lang.Object a;
    private final long b;

    public nl(java.lang.Object obj, long j) {
        super((byte[]) null);
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nl) {
            defpackage.nl nlVar = (defpackage.nl) obj;
            if (aooh.n(this.a, nlVar.a) && this.b == nlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "BackHandlerInfo(owner=" + this.a + ", compositeKey=" + this.b + ')';
    }
}
