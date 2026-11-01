package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svu {
    public final long a;
    private final java.lang.Object b;

    public svu(long j, java.lang.Object obj) {
        this.a = j;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.svu) {
            defpackage.svu svuVar = (defpackage.svu) obj;
            if (this.a == svuVar.a && aooh.n(this.b, svuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        return (anty.M(this.a) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "CallDataKey(callCreationTime=" + this.a + ", dataKey=" + this.b + ')';
    }
}
