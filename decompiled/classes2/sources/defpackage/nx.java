package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nx extends dzl {
    private final java.lang.Object a;
    private final long b;

    public nx(java.lang.Object obj, long j) {
        super((byte[]) null);
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nx) {
            defpackage.nx nxVar = (defpackage.nx) obj;
            if (aooh.n(this.a, nxVar.a) && this.b == nxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.a + ", compositeKey=" + this.b + ')';
    }
}
