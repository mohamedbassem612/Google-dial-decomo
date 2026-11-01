package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oel {
    public final long a;
    public final oee b;

    public oel(long j, oee oeeVar) {
        defpackage.aooh.f(oeeVar, "callType");
        this.a = j;
        this.b = oeeVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.oel) {
            defpackage.oel oelVar = (defpackage.oel) obj;
            if (this.a == oelVar.a && this.b == oelVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (defpackage.anty.M(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ExpressoCallLogDbEntity(callCreationTimeMillis=" + this.a + ", callType=" + this.b + ')';
    }
}
