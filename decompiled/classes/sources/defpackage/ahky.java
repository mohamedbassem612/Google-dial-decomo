package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahky {
    public final defpackage.ahkz a;
    public final long b;

    public ahky(defpackage.ahkz ahkzVar, long j) {
        if (ahkzVar == null) {
            throw new java.lang.NullPointerException("Null constraintType");
        }
        this.a = ahkzVar;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahky) {
            defpackage.ahky ahkyVar = (defpackage.ahky) obj;
            if (this.a.equals(ahkyVar.a) && this.b == ahkyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "SyncConstraint{constraintType=" + this.a.toString() + ", applicablePeriod=" + this.b + '}';
    }

    public ahky() {
        throw null;
    }
}
