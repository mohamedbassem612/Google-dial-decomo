package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jrj {
    public final long a;
    public final ztf b;

    public jrj(long j, ztf ztfVar) {
        defpackage.aooh.f(ztfVar, "stirShakenStatus");
        this.a = j;
        this.b = ztfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jrj) {
            defpackage.jrj jrjVar = (defpackage.jrj) obj;
            if (this.a == jrjVar.a && this.b == jrjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (defpackage.anty.M(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "StirShakenEntity(callCreationTimeMillis=" + this.a + ", stirShakenStatus=" + this.b + ')';
    }
}
